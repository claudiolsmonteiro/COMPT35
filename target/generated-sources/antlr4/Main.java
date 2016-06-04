import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import club.caliope.udc.DocumentConverter;
import club.caliope.udc.InputFormat;
import club.caliope.udc.OutputFormat;

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
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Insert path");
		//String path;
		//path = sc.nextLine();
		//File file = new File(path+"\\teste.txt");
		File file = new File("/Output/teste.txt");
		if (file.getParentFile() != null)
			file.getParentFile().mkdirs();
		

		//PrintWriter writer = new PrintWriter(path+"\\teste.txt", "UTF-8");
		PrintWriter writer = new PrintWriter("Output/teste.txt", "UTF-8");
		writer.print(translator.rewriter.getText());
		writer.close();
		
		new DocumentConverter().fromFile(new File("Output/teste.txt"), InputFormat.MARKDOWN_GITHUB).toFile(new File("Output/output.html"), OutputFormat.HTML5).addOption("-s").convert();
		new DocumentConverter().fromFile(new File("Output/teste.txt"), InputFormat.MARKDOWN_GITHUB).toFile(new File("Output/output.text"), OutputFormat.LATEX).addOption("-s").convert();

	}
}
