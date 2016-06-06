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
	private static String outputFile;

	public static void main(String[] args) throws Exception
	{

		if (args.length != 2)
			System.out.println("Usage: MCV.jar <input file> <output file>");
		else
		{
			inputFile = args[0];
			outputFile = args[1];

			FileInputStream stream = new FileInputStream(inputFile);
			ANTLRInputStream input = new ANTLRInputStream(stream);
			
			// create output folder if it does not exist
			File file = new File(outputFile);
			if (file.getParentFile() != null)
				file.getParentFile().mkdirs();

			MarkdownLexer lexer = new MarkdownLexer(input);

			CommonTokenStream tokens = new CommonTokenStream(lexer);

			MarkdownParser parser = new MarkdownParser(tokens);

			ParseTree tree = parser.curriculo();

			//System.out.println(tree.toStringTree(parser)); // print tree

			// Create a generic parse tree walker that can trigger callbacks
			ParseTreeWalker walker = new ParseTreeWalker();
			
			Translator translator = new Translator(tokens);

			// Walk the tree created during the parse, trigger callbacks
			walker.walk(translator, tree);

			PrintWriter writer = new PrintWriter(outputFile, "UTF-8");
			writer.print(translator.rewriter.getText());
			writer.close();
			

			File pandocHtml = new File("PandocFiles/output.html");
			if (pandocHtml.getParentFile() != null)
				pandocHtml.getParentFile().mkdirs();
			File pandocTex = new File("PandocFiles/output.tex");
			if (pandocTex.getParentFile() != null)
				pandocTex.getParentFile().mkdirs();
			
			new DocumentConverter().fromFile(new File(outputFile), InputFormat.MARKDOWN_GITHUB).toFile(pandocHtml, OutputFormat.HTML5).addOption("-s").convert();
			new DocumentConverter().fromFile(new File(outputFile), InputFormat.MARKDOWN_GITHUB).toFile(pandocTex, OutputFormat.LATEX).addOption("-s").convert();
		}

	}
}
