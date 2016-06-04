import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.bg.CircleBackground;
import com.kennycason.kumo.bg.RectangleBackground;
import com.kennycason.kumo.font.scale.LinearFontScalar;
import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import com.kennycason.kumo.palette.ColorPalette;

import java.awt.*;
import java.io.IOException;
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

	@Override
	public void enterStars(MarkdownParser.StarsContext ctx)
	{
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
		try {
			if(ctx.getText().equals("\\wordcloud")) {
				simpleRectangleTest();
				text = "![MyWordcloud](Output/wordcloud.png)";
			}
			else {
				type = ctx.getChild(1).toString();
				dimension = ctx.getChild(2).toStringTree().toString();
				dimension = dimension.substring(ctx.getChild(2).toStringTree().indexOf("]")+1);
				System.out.println(dimension.substring(dimension.indexOf("[")+1).trim());
				dx = Integer.parseInt(dimension.substring(dimension.indexOf("[")+1,dimension.indexOf("*")).trim());
				dy = Integer.parseInt(dimension.substring(dimension.indexOf("*")+1,dimension.indexOf("]")).trim());
				System.out.println("Type: "+ type);
				System.out.println("dx: "+dx);
				System.out.println("dy: "+dy);
				generateWordCloud(type, dx, dy);
				text = "![MyWordcloud](Output/customwordcloud.png)";
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
    	final List<WordFrequency> wordFrequencies = frequencyAnalyzer.load(wordcloud_aux.remove_chars(Wordcloud_aux.readFile("./curriculo.txt")));
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
    	final List<WordFrequency> wordFrequencies = frequencyAnalyzer.load(wordcloud_aux.remove_chars(Wordcloud_aux.readFile("./curriculo.txt")));
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