import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class Translator extends MarkdownParserBaseListener 
{
	BufferedTokenStream tokens;
	TokenStreamRewriter rewriter;
	
	public Translator(BufferedTokenStream tokens)
	{
		this.tokens = tokens;
		rewriter = new TokenStreamRewriter(tokens);
	}
}
