// Generated from MarkdownParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarkdownParser}.
 */
public interface MarkdownParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull MarkdownParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull MarkdownParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#secondROW}.
	 * @param ctx the parse tree
	 */
	void enterSecondROW(@NotNull MarkdownParser.SecondROWContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#secondROW}.
	 * @param ctx the parse tree
	 */
	void exitSecondROW(@NotNull MarkdownParser.SecondROWContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(@NotNull MarkdownParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(@NotNull MarkdownParser.TableContext ctx);
}