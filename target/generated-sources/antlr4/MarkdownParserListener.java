// Generated from MarkdownParser.g4 by ANTLR 4.5.2
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
	void enterR(MarkdownParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(MarkdownParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#curriculo}.
	 * @param ctx the parse tree
	 */
	void enterCurriculo(MarkdownParser.CurriculoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#curriculo}.
	 * @param ctx the parse tree
	 */
	void exitCurriculo(MarkdownParser.CurriculoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MarkdownParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MarkdownParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#horizontal}.
	 * @param ctx the parse tree
	 */
	void enterHorizontal(MarkdownParser.HorizontalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#horizontal}.
	 * @param ctx the parse tree
	 */
	void exitHorizontal(MarkdownParser.HorizontalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(MarkdownParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(MarkdownParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(MarkdownParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(MarkdownParser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(MarkdownParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(MarkdownParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#cell}.
	 * @param ctx the parse tree
	 */
	void enterCell(MarkdownParser.CellContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#cell}.
	 * @param ctx the parse tree
	 */
	void exitCell(MarkdownParser.CellContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#secondROW}.
	 * @param ctx the parse tree
	 */
	void enterSecondROW(MarkdownParser.SecondROWContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#secondROW}.
	 * @param ctx the parse tree
	 */
	void exitSecondROW(MarkdownParser.SecondROWContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(MarkdownParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(MarkdownParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#filelocation}.
	 * @param ctx the parse tree
	 */
	void enterFilelocation(MarkdownParser.FilelocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#filelocation}.
	 * @param ctx the parse tree
	 */
	void exitFilelocation(MarkdownParser.FilelocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#loc}.
	 * @param ctx the parse tree
	 */
	void enterLoc(MarkdownParser.LocContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#loc}.
	 * @param ctx the parse tree
	 */
	void exitLoc(MarkdownParser.LocContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(MarkdownParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(MarkdownParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MarkdownParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MarkdownParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#stars}.
	 * @param ctx the parse tree
	 */
	void enterStars(MarkdownParser.StarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#stars}.
	 * @param ctx the parse tree
	 */
	void exitStars(MarkdownParser.StarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#orderList}.
	 * @param ctx the parse tree
	 */
	void enterOrderList(MarkdownParser.OrderListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#orderList}.
	 * @param ctx the parse tree
	 */
	void exitOrderList(MarkdownParser.OrderListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#unorderList}.
	 * @param ctx the parse tree
	 */
	void enterUnorderList(MarkdownParser.UnorderListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#unorderList}.
	 * @param ctx the parse tree
	 */
	void exitUnorderList(MarkdownParser.UnorderListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#blockquote}.
	 * @param ctx the parse tree
	 */
	void enterBlockquote(MarkdownParser.BlockquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#blockquote}.
	 * @param ctx the parse tree
	 */
	void exitBlockquote(MarkdownParser.BlockquoteContext ctx);
}