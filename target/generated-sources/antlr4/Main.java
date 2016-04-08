import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

	private static String inputFile;
	
	public static void main(String[] args) throws Exception 
    {
		inputFile = args[0];

		FileInputStream stream = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(stream);

//        ANTLRInputStream input = new ANTLRInputStream(System.in);

        MarkdownLexer lexer = new MarkdownLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MarkdownParser parser = new MarkdownParser(tokens);
        
        ParseTree tree = parser.r(); // begin parsing at rule 'r'
        
        System.out.println(tree.toStringTree(parser)); // print tree
    }
}
