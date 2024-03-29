//import com.sun.deploy.util.StringUtils;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
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
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;
import java.util.List;



public class Translator extends MarkdownParserBaseListener 
{
	BufferedTokenStream tokens;
	TokenStreamRewriter rewriter;
	Wordcloud_aux wordcloud_aux;

    private static final Random RANDOM = new Random();
	public Translator(BufferedTokenStream tokens){
		this.tokens = tokens;
		rewriter = new TokenStreamRewriter(tokens);
	}

	public int test_string(String teste)
	{
		int string_size = teste.length();
		if(string_size < 2)
			return 0;
		switch (teste.charAt(0)){
			case '*':{
				if( (teste.charAt(1) != '*') ||
						(teste.charAt(string_size-2) != '*') ||
						(teste.charAt(string_size-3) != '*')    )
					return 1;
				break;
			}
			case '~':{
				if( (teste.charAt(1) != '~') ||
						(teste.charAt(string_size-2) != '~') ||
						(teste.charAt(string_size-3) != '~')    )
					return 2;
				break;
			}
			case '_':{
				if(teste.charAt(string_size-2) != '_')
					return 3;
				break;
			}
			default: break;
		}

		return 0;

	}
	
	public String addSpaces(String teste)
	{
		int string_size = teste.length();
		if(string_size < 2)
			return teste;
		switch (teste.charAt(0)){
			case '*':{
				if( (teste.charAt(1) == '*') ||
						(teste.charAt(string_size-1) == '*') ||
						(teste.charAt(string_size-2) == '*')    )
					teste = " " + teste + " ";
				break;
			}
			case '~':{
				if( (teste.charAt(1) == '~') ||
						(teste.charAt(string_size-1) == '~') ||
						(teste.charAt(string_size-2) == '~')    )
					teste = " " + teste + " ";
				break;
			}
			case '_':{
				if(teste.charAt(string_size-1) == '_')
					teste = " " + teste + " ";
				break;
			}
			default: break;
		}

		return teste;
	}


	@Override
	public void enterParagraph(MarkdownParser.ParagraphContext ctx)
	{
		String teste ="";//subst="",output="";
		int error = 0;
		if(ctx.TEXT() != null){
			int counter = ctx.getChildCount();
			for(int i = 0; i<counter; i++){
				teste = ctx.getChild(i).getText();
				error = test_string(teste);
				//subst = addSpaces(teste);
				if(error == 1){
					System.out.println("Atention in iteration " + i);
					System.out.println("Revise if you want BOLD text! " + teste);
					System.out.println("Line: " + ctx.start.getLine() + 1);
					return;
				}
				else if( error == 2) {
					System.out.println("Atention in iteration " + i);
					System.out.println("Revise if you want STRIKETHROUGH text! " + teste);
					System.out.println("Line: " + ctx.start.getLine() + 1);
					return;
				}
				else if(error == 3) {
					System.out.println("Atention in iteration " + i);
					System.out.println("Revise if you want ITALIC text! " + teste);
					System.out.println("Line: " + ctx.start.getLine() + 1);
					return;
				}
			}
			//rewriter.replace(ctx.getStart(), ctx.getStop(), output);
		}
		//rewriter.replace(ctx.getStart(), ctx.getStop(), output);
	}
	
	public int parseStringColumn(String tableRow){
		int counter = 0;
		for(int i=0; i< tableRow.length(); i++){
			if(tableRow.charAt(i) == '|'){
				counter++;
			}
		}
		return counter;
	}

	@Override
	public void enterTable(MarkdownParser.TableContext ctx){
		ArrayList<Integer> rows = new ArrayList<>();
		int counter = ctx.getChildCount();
		int size=0;
		int once = 0;
		for(int i = 0; i<counter; i++){
			if(once == 0) {
				size = parseStringColumn(ctx.getChild(i).getText());
				once++;
			}

			if(parseStringColumn(ctx.getChild(i).getText()) > size){
				System.out.println("Wrong column size.");
				System.out.println("Line: " + ctx.start.getLine() + 1);
				System.exit(3);
			}
			if(i == 2 && parseStringColumn(ctx.getChild(i).getText()) >= size){
				System.out.println("Wrong column size.");
				System.out.println("Line: " + ctx.start.getLine() + 1);
				System.exit(3);
			}
		}
	}

	@Override
	public void enterOrderList(MarkdownParser.OrderListContext ctx){
//		System.out.println("Order List start: " + ctx.getText());
		int counter_check = 1;
		//char count_check = '1';
		if(ctx.getText()!=null){
			int counter = ctx.getChildCount();
			for(int i = 0; i<counter; i++){
				if(Character.isDigit((ctx.getChild(i).getText()).charAt(0)) == true){
					//int k = Character.digit(ctx.getChild(i).getText().charAt(0),10);
					//System.out.println("WUT WUT  " + k);

					if(Character.digit(ctx.getChild(i).getText().charAt(0),10) == counter_check){
						counter_check++;
					}
					else{
						System.out.println("Wrong ordered list.");
						System.out.println("Line: " + ctx.start.getLine() + 1);
						System.exit(2);
					}
					
				}
			}
		}
		return;
	}

	@Override
	public void enterStars(MarkdownParser.StarsContext ctx)
	{
		URL filledStar = Main.class.getResource("/filled.png");
		URL halfStar = Main.class.getResource("/half-star.png");
		URL emptyStar = Main.class.getResource("/empty.png");
		String text = "";
		if(ctx.REALNUMBERSELECTION() != null)
		{
			Float numFilledStars = 0f;
			float decimalPart = 0;
			String filledStarsText = ctx.REALNUMBERSELECTION().getText();
			filledStarsText = filledStarsText.replace("{", "");
			filledStarsText = filledStarsText.replace("}", "");
			try {
				numFilledStars = Float.parseFloat(filledStarsText);
				decimalPart = numFilledStars % 1;
			}
			catch (NumberFormatException nfe) {
				
			}
			for(int i = 0; i < numFilledStars; i++)
				text += "![Filled Star](" + filledStar + ")";
			if(decimalPart == 0.5)
				text += "![Half Star](" + halfStar + ")";
			else
			{
				
			}
		}
		if(ctx.WHOLENUMBERSELECTION() != null)
		{
			int numEmptyStars = 0;
			String emptyStarsText = ctx.WHOLENUMBERSELECTION().getText();
			emptyStarsText = emptyStarsText.replace("[", "");
			emptyStarsText = emptyStarsText.replace("]", "");
			try {
				numEmptyStars = Integer.parseUnsignedInt(emptyStarsText);
			}
			catch (NumberFormatException nfe) {
				
			}

			for(int i = 0; i < numEmptyStars; i++)
				text += "![Empty Star](" + emptyStar + ")";
		}
		rewriter.replace(ctx.getStart(), ctx.getStop(), text);
	}
	
	@Override
	public void enterWordcloud(MarkdownParser.WordcloudContext ctx){
		String type ="",dimension,text="";
		int dx = 0, dy = 0;
		try {
			if(ctx.getText().equals("\\wordcloud")) {
				File f = new File("Output/wordcloud.png");
				if (f.getParentFile() != null)
					f.getParentFile().mkdirs();
				simpleRectangleTest();
				//text = "![MyWordcloud](Output/wordcloud.png)";
				text = "![MyWordcloud]("+f.getAbsolutePath()+"?raw=true)";
			}
			else {
				if(ctx.getChild(1).toString().equals("Circular") || ctx.getChild(1).toString().equals("Rectangle")) {
					type = ctx.getChild(1).toString();
					if(ctx.getChild(2) != null) {
						dimension = ctx.getChild(2).toStringTree().toString();
						dimension = dimension.substring(ctx.getChild(2).toStringTree().indexOf("]")+1);
						dx = Integer.parseInt(dimension.substring(dimension.indexOf("[")+1,dimension.indexOf("*")).trim());
						dy = Integer.parseInt(dimension.substring(dimension.indexOf("*")+1,dimension.indexOf("]")).trim());
					}
					else {
						System.out.println("No size given, will use standard size for the wordcloud");
						System.out.println("Line: " + ctx.start.getLine() + 1);
						dx = 450;
						dy = 450;
					}
					File f = new File("Output/customwordcloud.png");
					if (f.getParentFile() != null)
						f.getParentFile().mkdirs();
					generateWordCloud(type, dx, dy);
					text = "![MyWordcloud]("+f.getAbsolutePath()+"?raw=true)";
				}
				else {
					System.out.println("Wrong type of word cloud, must be either Circular or Rectangle");
					System.out.println("Line: " + ctx.start.getLine() + 1);
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
        	wordCloud.setBackground(new CircleBackground((dx/2)));
        	wordCloud.setColorPalette(buildRandomColorPalette(10));
    	}
    	else {
    		wordCloud = new WordCloud(dimension, CollisionMode.RECTANGLE);
        	wordCloud.setPadding(2);
        	wordCloud.setBackground(new RectangleBackground(dimension));
        	wordCloud.setColorPalette(new ColorPalette(new Color(0x4055F1), new Color(0x408DF1), new Color(0x40AAF1), new Color(0x40C5F1), new Color(0x40D3F1), new Color(0xFFFFFF)));
    	}
    	wordCloud.setFontScalar(new LinearFontScalar(10, 40));
    	wordCloud.build(wordFrequencies);
    	wordCloud.writeToFile("Output/customwordcloud.png");
    }

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