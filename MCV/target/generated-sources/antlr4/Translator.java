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

    private static final Random RANDOM = new Random();
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
		
		try {
			simpleRectangleTest();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = "![MyWordcloud](/C.wordcloud.png)";
		rewriter.replace(ctx.getStart(), ctx.getStop(), text);
	}
    public void simpleRectangleTest() throws IOException {
    	final FrequencyAnalyzer frequencyAnalyzer = new FrequencyAnalyzer();
    	File f = new File("curriculo.txt");
    	final List<WordFrequency> wordFrequencies = frequencyAnalyzer.load(getInputStream(f.getPath()));
    	final Dimension dimension = new Dimension(600, 600);
    	final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.RECTANGLE);
    	wordCloud.setPadding(0);
    	wordCloud.setBackground(new RectangleBackground(dimension));
    	wordCloud.setColorPalette(buildRandomColorPalette(20));
    	wordCloud.setFontScalar(new LinearFontScalar(10, 40));
    	wordCloud.build(wordFrequencies);
    	wordCloud.writeToFile("Output/wordcloud_rectangle.png");
    }
    
    
    private static ColorPalette buildRandomColorPalette(int n) {
        final Color[] colors = new Color[n];
        for(int i = 0; i < colors.length; i++) {
            colors[i] = new Color(RANDOM.nextInt(230) + 25, RANDOM.nextInt(230) + 25, RANDOM.nextInt(230) + 25);
        }
        return new ColorPalette(colors);
    }
    
    private static InputStream getInputStream(final String path) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
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
