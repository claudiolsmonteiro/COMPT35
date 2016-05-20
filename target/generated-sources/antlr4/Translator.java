import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class Translator extends MarkdownParserBaseListener 
{
	BufferedTokenStream tokens;
	TokenStreamRewriter rewriter;
	Wordcloud_aux wc_aux;

	public Translator(BufferedTokenStream tokens)
	{
		this.tokens = tokens;
		rewriter = new TokenStreamRewriter(tokens);
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


		System.out.println("start " + ctx.getText());
		System.out.println("start " + ctx.getStart());
		System.out.println("stop " + ctx.getStop());
		
		//get lib to make wordcloud and put correct link

		/* USE MAVEN
		final FrequencyAnalyzer frequencyAnalyzer = new FrequencyAnalyzer();
		final List<WordFrequency> wordFrequencies = frequencyAnalyzer.load(getInputStream("text/my_text_file.txt"));
		final Dimension dimension = new Dimension(600, 600);
		final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.RECTANGLE);
		wordCloud.setPadding(0);
		wordCloud.setBackground(new RectangleBackground(dimension));
		wordCloud.setColorPalette(buildRandomColorPalette(20));
		wordCloud.setFontScalar(new LinearFontScalar(10, 40));
		wordCloud.build(wordFrequencies);
		wordCloud.writeToFile("output/wordcloud_rectangle.png");
		*/
		String text = "![MyWordcloud](/C.wordcloud.png)";
		rewriter.replace(ctx.getStart(), ctx.getStop(), text);
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
