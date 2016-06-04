//import com.sun.deploy.util.StringUtils;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.bg.CircleBackground;
import com.kennycason.kumo.bg.PixelBoundryBackground;
import com.kennycason.kumo.bg.RectangleBackground;
import com.kennycason.kumo.font.FontWeight;
import com.kennycason.kumo.font.KumoFont;
import com.kennycason.kumo.font.scale.LinearFontScalar;
import com.kennycason.kumo.font.scale.SqrtFontScalar;
import com.kennycason.kumo.image.AngleGenerator;
import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import com.kennycason.kumo.nlp.tokenizer.ChineseWordTokenizer;
import com.kennycason.kumo.palette.ColorPalette;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.List;



public class Translator extends MarkdownParserBaseListener 
{
	BufferedTokenStream tokens;
	TokenStreamRewriter rewriter;
	Wordcloud_aux wordcloud_aux;

    private static final Random RANDOM = new Random();
	public Translator(BufferedTokenStream tokens)
	{
		this.tokens = tokens;
		rewriter = new TokenStreamRewriter(tokens);
	}

	public boolean test_string(String teste)
	{

		int string_size = teste.length();
		if(string_size < 2)
			return false;
		switch (teste.charAt(0))
		{
			case '*':
			{
				if( (teste.charAt(1) != '*') ||
						(teste.charAt(string_size-1) != '*') ||
						(teste.charAt(string_size-2) != '*')    )
					return true;
				break;
			}
			case '~':
			{
				if( (teste.charAt(1) != '~') ||
						(teste.charAt(string_size-1) != '~') ||
						(teste.charAt(string_size-2) != '~')    )
					return true;
				break;
			}
			case '_':
			{
				if(teste.charAt(string_size-1) != '_')
					return true;
				break;
			}
			default: break;
		}

		return false;

	}

	@Override
	public void enterParagraph(MarkdownParser.ParagraphContext ctx)
	{

		String teste;
		boolean error = false;
		if(ctx.TEXT() != null)
		{

			int counter = ctx.getChildCount();

			for(int i = 0; i<counter; i++)

			{

				teste = ctx.getChild(i).getText();
				error = test_string(teste);
				if(error)
				{
					System.out.println("Atention in iteration " + i);
					System.out.println("Revise if you want BOLD, ITALIC or STRIKETHROUGH text! " + teste);
				}

			}

		}

	}



	public int parseStringColumn(String tableRow)
	{
		int counter = 0;
		for(int i=0; i< tableRow.length(); i++)
		{
			if(tableRow.charAt(i) == '|')
			{
				counter++;
			}
		}

		return counter;
	}

	@Override
	public void enterTable(MarkdownParser.TableContext ctx)
	{

		ArrayList<Integer> rows = new ArrayList<>();
		int counter = ctx.getChildCount();
		int size=0;
		int once = 0;
		for(int i = 0; i<counter; i++)
		{
			if(once == 0) {
				size = parseStringColumn(ctx.getChild(i).getText());
				once++;
			}

			if(parseStringColumn(ctx.getChild(i).getText()) > size)
			{
				System.out.println("Wrong size in columns!!");
				System.exit(3);
			}
			if(i == 2 && parseStringColumn(ctx.getChild(i).getText()) >= size)
			{
				System.out.println("Wrong size in column |---| separations!");
				System.exit(3);
			}

		}

	}

	@Override
	public void enterOrderList(MarkdownParser.OrderListContext ctx)
	{
//		System.out.println("Order List start: " + ctx.getText());

		int counter_check = 1;
		//char count_check = '1';
		if(ctx.getText()!=null)
		{
			int counter = ctx.getChildCount();
			for(int i = 0; i<counter; i++)
			{
				if(Character.isDigit((ctx.getChild(i).getText()).charAt(0)) == true)
				{
					//int k = Character.digit(ctx.getChild(i).getText().charAt(0),10);
					//System.out.println("WUT WUT  " + k);

					if(Character.digit(ctx.getChild(i).getText().charAt(0),10) == counter_check)
					{
						counter_check++;
					}
					else
					{

						System.out.println("Your ordered list(s) structure is wrong! - check(1,2,3,...)");
						System.exit(2);
					}
					/***NAO DA ASSIM MAS EStA QUASE!!***/
					/*
					if(Character.digit(ctx.getChild(i).getText().charAt(0), 10) == counter_check) {
						counter++;
						System.out.println("Is digit:  " + ctx.getChild(i).getText().charAt(0));
						counter_check++;
						//count_check=(char)counter_check;
					}
					else
					{
						System.out.println("Your order list structure is wrong! - check(1,2,3,...)");
					}
					*/

				}
			}

		}

		return;
	}


	@Override
	public void enterStars(MarkdownParser.StarsContext ctx)
	{
		System.out.println("start " + ctx.getText());
		System.out.println("start " + ctx.getStart());
		System.out.println("stop " + ctx.getStop());
		
		String text = "";
		if(ctx.REALNUMBERSELECTION() != null)
			text += "There are " + ctx.REALNUMBERSELECTION().getText().charAt(1) + " filled stars.";
		if(ctx.WHOLENUMBERSELECTION() != null)
			text += "There are " + ctx.WHOLENUMBERSELECTION().getText().charAt(1) + " empty stars.";
		rewriter.replace(ctx.getStart(), ctx.getStop(), text);
	}
	
	@Override
	public void enterWordcloud(MarkdownParser.WordcloudContext ctx)
	{
		String type ="",dimension,text="";
		int dx = 0, dy = 0;
		System.out.println("start " + ctx.getText());
		System.out.println("start " + ctx.getStart());
		System.out.println("stop " + ctx.getStop());
		try {
			if(ctx.getText().equals("\\wordcloud")) {
				simpleRectangleTest();
				text = "![MyWordcloud](Output/wordcloud.png)";
			}
			else {
				if(ctx.getChild(1).toString().equals("Circular") || ctx.getChild(1).toString().equals("Rectangle")) {
					type = ctx.getChild(1).toString();
					if(ctx.getChild(2) != null) {
						dimension = ctx.getChild(2).toStringTree().toString();
						dimension = dimension.substring(ctx.getChild(2).toStringTree().indexOf("]")+1);
						System.out.println(dimension.substring(dimension.indexOf("[")+1).trim());
						dx = Integer.parseInt(dimension.substring(dimension.indexOf("[")+1,dimension.indexOf("*")).trim());
						dy = Integer.parseInt(dimension.substring(dimension.indexOf("*")+1,dimension.indexOf("]")).trim());
					}
					else {
						System.out.println("No size given, will use standard size for the wordcloud");
						dx = 450;
						dy = 450;
					}
					System.out.println("Type: "+ type);
					System.out.println("dx: "+dx);
					System.out.println("dy: "+dy);
					generateWordCloud(type, dx, dy);
					text = "![MyWordcloud](Output/customwordcloud.png)";
				}
				else {
					System.out.println("Wrong type of word cloud, must be either Circular or Rectangle");
					return;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rewriter.replace(ctx.getStart(), ctx.getStop(), text);
	}
    public void simpleRectangleTest() throws IOException {
    	wordcloud_aux = new Wordcloud_aux();
    	
    	final FrequencyAnalyzer frequencyAnalyzer = new FrequencyAnalyzer();
    	final List<WordFrequency> wordFrequencies = frequencyAnalyzer.load(wordcloud_aux.remove_chars(wordcloud_aux.readFile("./curriculo.txt")));
    	final Dimension dimension = new Dimension(600, 600);
    	final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.RECTANGLE);
    	wordCloud.setPadding(0);
    	wordCloud.setBackground(new RectangleBackground(dimension));
    	wordCloud.setColorPalette(buildRandomColorPalette(20));
    	wordCloud.setFontScalar(new LinearFontScalar(10, 40));
    	wordCloud.build(wordFrequencies);
    	wordCloud.writeToFile("Output/wordcloud.png");
    }
    public void generateWordCloud(String type, int dx, int dy) throws IOException {
    	wordcloud_aux = new Wordcloud_aux();
    	final WordCloud wordCloud;
    	final FrequencyAnalyzer frequencyAnalyzer = new FrequencyAnalyzer();
    	final List<WordFrequency> wordFrequencies = frequencyAnalyzer.load(wordcloud_aux.remove_chars(wordcloud_aux.readFile("./curriculo.txt")));
    	final Dimension dimension = new Dimension(dx, dx);
    	if(type.equals("Circular")) {
        	wordCloud = new WordCloud(dimension, CollisionMode.PIXEL_PERFECT);
        	wordCloud.setPadding(0);
        	wordCloud.setBackground(new RectangleBackground(dimension));
        	wordCloud.setColorPalette(buildRandomColorPalette(20));
    	}
    	else {
    		wordCloud = new WordCloud(dimension, CollisionMode.RECTANGLE);
        	wordCloud.setPadding(2);
        	wordCloud.setBackground(new CircleBackground(300));
        	wordCloud.setColorPalette(new ColorPalette(new Color(0x4055F1), new Color(0x408DF1), new Color(0x40AAF1), new Color(0x40C5F1), new Color(0x40D3F1), new Color(0xFFFFFF)));
    	}
    	wordCloud.setFontScalar(new LinearFontScalar(10, 40));
    	wordCloud.build(wordFrequencies);
    	wordCloud.writeToFile("Output/customwordcloud.png");
    }
   /*
    public void simpleCircularTest() throws IOException {
    	wordcloud_aux = new Wordcloud_aux();
    	
    	final FrequencyAnalyzer frequencyAnalyzer = new FrequencyAnalyzer();
    	final List<WordFrequency> wordFrequencies = frequencyAnalyzer.load(wordcloud_aux.remove_chars(wordcloud_aux.readFile("./curriculo.txt")));
    	final Dimension dimension = new Dimension(600, 600);
    	final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.PIXEL_PERFECT);
    	wordCloud.setPadding(2);
    	wordCloud.setBackground(new CircleBackground(300));
    	wordCloud.setColorPalette(new ColorPalette(new Color(0x4055F1), new Color(0x408DF1), new Color(0x40AAF1), new Color(0x40C5F1), new Color(0x40D3F1), new Color(0xFFFFFF)));
    	wordCloud.setFontScalar(new SqrtFontScalar(10, 40));
    	wordCloud.build(wordFrequencies);
    	wordCloud.writeToFile("Output/datarank_wordcloud_circle_sqrt_font.png");
    } 
    */
   /* private static InputStream getInputStream(final String path) {
    	System.out.println(Thread.currentThread().getContextClassLoader());

        return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
    }
    */
    private static ColorPalette buildRandomColorPalette(int n) {
        final Color[] colors = new Color[n];
        for(int i = 0; i < colors.length; i++) {
            colors[i] = new Color(RANDOM.nextInt(230) + 25, RANDOM.nextInt(230) + 25, RANDOM.nextInt(230) + 25);
        }
        return new ColorPalette(colors);
    }
    
    
	
	@Override
	public void enterSpaces(MarkdownParser.SpacesContext ctx)
	{
		System.out.println("start " + ctx.getText());
		System.out.println("start " + ctx.getStart());
		System.out.println("stop " + ctx.getStop());
		
		String text = "";
		int numSpaces = 0;
		String numSpacesText = ctx.WHOLENUMBERSELECTION().getText();
		numSpacesText = numSpacesText.replace("[", "");
		numSpacesText = numSpacesText.replace("]", "");
		try {
			numSpaces = Integer.parseUnsignedInt(numSpacesText);
		}
		catch (NumberFormatException nfe) {
			
		}
		for(int i = 0; i < numSpaces; i++)
		{
			text += "&nbsp;";
		}
		rewriter.replace(ctx.getStart(), ctx.getStop(), text);
	}
}