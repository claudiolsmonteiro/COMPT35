import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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

		ParseTree tree = parser.curriculo(); // begin parsing at rule 'r'

		System.out.println(tree.toStringTree(parser)); // print tree

		// Create a generic parse tree walker that can trigger callbacks
		ParseTreeWalker walker = new ParseTreeWalker();

		//TODO Change translator to extended class
		Translator translator = new Translator(tokens);

		// Walk the tree created during the parse, trigger callbacks
		walker.walk(translator, tree);

		// create output folder if it does not exist
		File file = new File("C:\\Users\\david\\OneDrive\\Documentos\\FEUP\\3Ano\\COMP\\MCV\\output\\teste.txt");
		if (file.getParentFile() != null)
			file.getParentFile().mkdirs();
		

		PrintWriter writer = new PrintWriter("C:\\Users\\david\\OneDrive\\Documentos\\FEUP\\3Ano\\COMP\\MCV\\output\\teste.txt", "UTF-8");
		writer.print(translator.rewriter.getText());
		writer.close();
	}
}
