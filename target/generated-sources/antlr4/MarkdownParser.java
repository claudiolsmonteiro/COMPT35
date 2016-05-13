// Generated from MarkdownParser.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT=1, STARTLIST=2, REAL=3, DIGIT=4, ESCAPEDCHARS=5, BOLD=6, ITALICS=7, 
		STRIKETHROUGH=8, HORIZONTALRULE=9, HEADER=10, STAR=11, EMPTYSTARS=12, 
		FILLEDSTARS=13, WORDCLOUD=14, LISTSTART=15, BACKSLASH=16, TABLESEPARATOR=17, 
		EXCLAMATIONMARK=18, QUOTE=19, HASH=20, SLASH=21, LPAREN=22, RPAREN=23, 
		LBRACKET=24, RBRACKET=25, LBRACE=26, RBRACE=27, DOT=28, COLON=29, COMMA=30, 
		SEMICOLON=31, UNDERSCORE=32, PLUS=33, MINUS=34, ASTERISK=35, TILDE=36, 
		BACKTICK=37, GREATERTHAN=38, EQUAL=39, QUESTIONMARK=40, NEWLINE=41, WS=42;
	public static final int
		RULE_r = 0, RULE_curriculo = 1, RULE_block = 2, RULE_horizontal = 3, RULE_content = 4, 
		RULE_paragraph = 5, RULE_table = 6, RULE_cell = 7, RULE_secondROW = 8, 
		RULE_image = 9, RULE_filelocation = 10, RULE_loc = 11, RULE_link = 12, 
		RULE_list = 13, RULE_stars = 14, RULE_orderList = 15, RULE_unorderList = 16, 
		RULE_blockquote = 17;
	public static final String[] ruleNames = {
		"r", "curriculo", "block", "horizontal", "content", "paragraph", "table", 
		"cell", "secondROW", "image", "filelocation", "loc", "link", "list", "stars", 
		"orderList", "unorderList", "blockquote"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'\\'", "'|'", "'!'", "'\"'", "'#'", "'/'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'.'", "':'", "','", "';'", "'_'", 
		"'+'", "'-'", "'*'", "'~'", "'`'", "'>'", "'='", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TEXT", "STARTLIST", "REAL", "DIGIT", "ESCAPEDCHARS", "BOLD", "ITALICS", 
		"STRIKETHROUGH", "HORIZONTALRULE", "HEADER", "STAR", "EMPTYSTARS", "FILLEDSTARS", 
		"WORDCLOUD", "LISTSTART", "BACKSLASH", "TABLESEPARATOR", "EXCLAMATIONMARK", 
		"QUOTE", "HASH", "SLASH", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
		"LBRACE", "RBRACE", "DOT", "COLON", "COMMA", "SEMICOLON", "UNDERSCORE", 
		"PLUS", "MINUS", "ASTERISK", "TILDE", "BACKTICK", "GREATERTHAN", "EQUAL", 
		"QUESTIONMARK", "NEWLINE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MarkdownParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MarkdownParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public CurriculoContext curriculo() {
			return getRuleContext(CurriculoContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			curriculo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CurriculoContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<HorizontalContext> horizontal() {
			return getRuleContexts(HorizontalContext.class);
		}
		public HorizontalContext horizontal(int i) {
			return getRuleContext(HorizontalContext.class,i);
		}
		public CurriculoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curriculo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterCurriculo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitCurriculo(this);
		}
	}

	public final CurriculoContext curriculo() throws RecognitionException {
		CurriculoContext _localctx = new CurriculoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_curriculo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				switch (_input.LA(1)) {
				case HEADER:
					{
					setState(38);
					block();
					}
					break;
				case HORIZONTALRULE:
					{
					setState(39);
					horizontal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(42);
				match(NEWLINE);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HORIZONTALRULE || _la==HEADER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(MarkdownParser.HEADER, 0); }
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(HEADER);
			setState(49);
			match(NEWLINE);
			setState(50);
			content();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HorizontalContext extends ParserRuleContext {
		public TerminalNode HORIZONTALRULE() { return getToken(MarkdownParser.HORIZONTALRULE, 0); }
		public HorizontalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_horizontal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHorizontal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHorizontal(this);
		}
	}

	public final HorizontalContext horizontal() throws RecognitionException {
		HorizontalContext _localctx = new HorizontalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_horizontal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(HORIZONTALRULE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<BlockquoteContext> blockquote() {
			return getRuleContexts(BlockquoteContext.class);
		}
		public BlockquoteContext blockquote(int i) {
			return getRuleContext(BlockquoteContext.class,i);
		}
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public List<ImageContext> image() {
			return getRuleContexts(ImageContext.class);
		}
		public ImageContext image(int i) {
			return getRuleContext(ImageContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(60);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(54);
					paragraph();
					}
					break;
				case TABLESEPARATOR:
					{
					setState(55);
					table();
					}
					break;
				case STARTLIST:
				case MINUS:
					{
					setState(56);
					list();
					}
					break;
				case GREATERTHAN:
					{
					setState(57);
					blockquote();
					}
					break;
				case LBRACKET:
					{
					setState(58);
					link();
					}
					break;
				case EXCLAMATIONMARK:
					{
					setState(59);
					image();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << STARTLIST) | (1L << TABLESEPARATOR) | (1L << EXCLAMATIONMARK) | (1L << LBRACKET) | (1L << MINUS) | (1L << GREATERTHAN))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParagraphContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(MarkdownParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(MarkdownParser.TEXT, i);
		}
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitParagraph(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paragraph);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(65); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(64);
						match(TEXT);
						}
						}
						setState(67); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					setState(69);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public List<CellContext> cell() {
			return getRuleContexts(CellContext.class);
		}
		public CellContext cell(int i) {
			return getRuleContext(CellContext.class,i);
		}
		public TerminalNode TABLESEPARATOR() { return getToken(MarkdownParser.TABLESEPARATOR, 0); }
		public SecondROWContext secondROW() {
			return getRuleContext(SecondROWContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_table);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			cell();
			setState(75);
			match(TABLESEPARATOR);
			setState(76);
			secondROW();
			setState(77);
			match(NEWLINE);
			setState(79); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(78);
					cell();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CellContext extends ParserRuleContext {
		public List<TerminalNode> TABLESEPARATOR() { return getTokens(MarkdownParser.TABLESEPARATOR); }
		public TerminalNode TABLESEPARATOR(int i) {
			return getToken(MarkdownParser.TABLESEPARATOR, i);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public List<TerminalNode> TEXT() { return getTokens(MarkdownParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(MarkdownParser.TEXT, i);
		}
		public List<StarsContext> stars() {
			return getRuleContexts(StarsContext.class);
		}
		public StarsContext stars(int i) {
			return getRuleContext(StarsContext.class,i);
		}
		public CellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitCell(this);
		}
	}

	public final CellContext cell() throws RecognitionException {
		CellContext _localctx = new CellContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(TABLESEPARATOR);
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(84);
					match(TEXT);
					}
					break;
				case STAR:
					{
					setState(85);
					stars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88);
				match(TABLESEPARATOR);
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT || _la==STAR );
			setState(93);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecondROWContext extends ParserRuleContext {
		public List<TerminalNode> MINUS() { return getTokens(MarkdownParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MarkdownParser.MINUS, i);
		}
		public List<TerminalNode> TABLESEPARATOR() { return getTokens(MarkdownParser.TABLESEPARATOR); }
		public TerminalNode TABLESEPARATOR(int i) {
			return getToken(MarkdownParser.TABLESEPARATOR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MarkdownParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MarkdownParser.COLON, i);
		}
		public SecondROWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondROW; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterSecondROW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitSecondROW(this);
		}
	}

	public final SecondROWContext secondROW() throws RecognitionException {
		SecondROWContext _localctx = new SecondROWContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_secondROW);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(95);
					match(COLON);
					}
				}

				setState(98);
				match(MINUS);
				setState(99);
				match(MINUS);
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					match(MINUS);
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				setState(106);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(105);
					match(COLON);
					}
				}

				setState(108);
				match(TABLESEPARATOR);
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLON || _la==MINUS );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode EXCLAMATIONMARK() { return getToken(MarkdownParser.EXCLAMATIONMARK, 0); }
		public TerminalNode LBRACKET() { return getToken(MarkdownParser.LBRACKET, 0); }
		public TerminalNode TEXT() { return getToken(MarkdownParser.TEXT, 0); }
		public TerminalNode RBRACKET() { return getToken(MarkdownParser.RBRACKET, 0); }
		public TerminalNode LPAREN() { return getToken(MarkdownParser.LPAREN, 0); }
		public FilelocationContext filelocation() {
			return getRuleContext(FilelocationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MarkdownParser.RPAREN, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitImage(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(EXCLAMATIONMARK);
			setState(114);
			match(LBRACKET);
			setState(115);
			match(TEXT);
			setState(116);
			match(RBRACKET);
			setState(117);
			match(LPAREN);
			setState(118);
			filelocation();
			setState(119);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilelocationContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(MarkdownParser.DOT, 0); }
		public TerminalNode TEXT() { return getToken(MarkdownParser.TEXT, 0); }
		public List<TerminalNode> SLASH() { return getTokens(MarkdownParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(MarkdownParser.SLASH, i);
		}
		public List<LocContext> loc() {
			return getRuleContexts(LocContext.class);
		}
		public LocContext loc(int i) {
			return getRuleContext(LocContext.class,i);
		}
		public FilelocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filelocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterFilelocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitFilelocation(this);
		}
	}

	public final FilelocationContext filelocation() throws RecognitionException {
		FilelocationContext _localctx = new FilelocationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_filelocation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				match(SLASH);
				setState(123); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(122);
						loc();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(125); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLASH );
			setState(131);
			match(DOT);
			setState(132);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(MarkdownParser.TEXT, 0); }
		public TerminalNode DOT() { return getToken(MarkdownParser.DOT, 0); }
		public TerminalNode MINUS() { return getToken(MarkdownParser.MINUS, 0); }
		public TerminalNode UNDERSCORE() { return getToken(MarkdownParser.UNDERSCORE, 0); }
		public LocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitLoc(this);
		}
	}

	public final LocContext loc() throws RecognitionException {
		LocContext _localctx = new LocContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << DOT) | (1L << UNDERSCORE) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(MarkdownParser.LBRACKET, 0); }
		public TerminalNode TEXT() { return getToken(MarkdownParser.TEXT, 0); }
		public TerminalNode RBRACKET() { return getToken(MarkdownParser.RBRACKET, 0); }
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitLink(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(LBRACKET);
			setState(137);
			match(TEXT);
			setState(138);
			match(RBRACKET);
			setState(139);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public OrderListContext orderList() {
			return getRuleContext(OrderListContext.class,0);
		}
		public UnorderListContext unorderList() {
			return getRuleContext(UnorderListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			switch (_input.LA(1)) {
			case STARTLIST:
				{
				setState(141);
				orderList();
				}
				break;
			case MINUS:
				{
				setState(142);
				unorderList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StarsContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(MarkdownParser.STAR, 0); }
		public TerminalNode EMPTYSTARS() { return getToken(MarkdownParser.EMPTYSTARS, 0); }
		public TerminalNode FILLEDSTARS() { return getToken(MarkdownParser.FILLEDSTARS, 0); }
		public StarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterStars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitStars(this);
		}
	}

	public final StarsContext stars() throws RecognitionException {
		StarsContext _localctx = new StarsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(STAR);
			setState(151);
			switch (_input.LA(1)) {
			case FILLEDSTARS:
				{
				{
				setState(146);
				match(FILLEDSTARS);
				setState(148);
				_la = _input.LA(1);
				if (_la==EMPTYSTARS) {
					{
					setState(147);
					match(EMPTYSTARS);
					}
				}

				}
				}
				break;
			case EMPTYSTARS:
				{
				setState(150);
				match(EMPTYSTARS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderListContext extends ParserRuleContext {
		public List<TerminalNode> STARTLIST() { return getTokens(MarkdownParser.STARTLIST); }
		public TerminalNode STARTLIST(int i) {
			return getToken(MarkdownParser.STARTLIST, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(MarkdownParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(MarkdownParser.TEXT, i);
		}
		public List<TerminalNode> ITALICS() { return getTokens(MarkdownParser.ITALICS); }
		public TerminalNode ITALICS(int i) {
			return getToken(MarkdownParser.ITALICS, i);
		}
		public List<TerminalNode> BOLD() { return getTokens(MarkdownParser.BOLD); }
		public TerminalNode BOLD(int i) {
			return getToken(MarkdownParser.BOLD, i);
		}
		public List<TerminalNode> STRIKETHROUGH() { return getTokens(MarkdownParser.STRIKETHROUGH); }
		public TerminalNode STRIKETHROUGH(int i) {
			return getToken(MarkdownParser.STRIKETHROUGH, i);
		}
		public OrderListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterOrderList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitOrderList(this);
		}
	}

	public final OrderListContext orderList() throws RecognitionException {
		OrderListContext _localctx = new OrderListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orderList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(153);
					match(STARTLIST);
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(154);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						setState(157); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0) );
					setState(159);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(162); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnorderListContext extends ParserRuleContext {
		public List<TerminalNode> MINUS() { return getTokens(MarkdownParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MarkdownParser.MINUS, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(MarkdownParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(MarkdownParser.TEXT, i);
		}
		public List<TerminalNode> ITALICS() { return getTokens(MarkdownParser.ITALICS); }
		public TerminalNode ITALICS(int i) {
			return getToken(MarkdownParser.ITALICS, i);
		}
		public List<TerminalNode> BOLD() { return getTokens(MarkdownParser.BOLD); }
		public TerminalNode BOLD(int i) {
			return getToken(MarkdownParser.BOLD, i);
		}
		public List<TerminalNode> STRIKETHROUGH() { return getTokens(MarkdownParser.STRIKETHROUGH); }
		public TerminalNode STRIKETHROUGH(int i) {
			return getToken(MarkdownParser.STRIKETHROUGH, i);
		}
		public UnorderListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unorderList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterUnorderList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitUnorderList(this);
		}
	}

	public final UnorderListContext unorderList() throws RecognitionException {
		UnorderListContext _localctx = new UnorderListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unorderList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(164);
					match(MINUS);
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(165);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						setState(168); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0) );
					setState(170);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(173); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockquoteContext extends ParserRuleContext {
		public TerminalNode GREATERTHAN() { return getToken(MarkdownParser.GREATERTHAN, 0); }
		public TerminalNode TEXT() { return getToken(MarkdownParser.TEXT, 0); }
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public BlockquoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockquote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterBlockquote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitBlockquote(this);
		}
	}

	public final BlockquoteContext blockquote() throws RecognitionException {
		BlockquoteContext _localctx = new BlockquoteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockquote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(GREATERTHAN);
			setState(176);
			match(TEXT);
			setState(177);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\5\3+\n\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6?\n\6\r\6\16\6@\3\7\6\7"+
		"D\n\7\r\7\16\7E\3\7\6\7I\n\7\r\7\16\7J\3\b\3\b\3\b\3\b\3\b\6\bR\n\b\r"+
		"\b\16\bS\3\t\3\t\3\t\5\tY\n\t\3\t\6\t\\\n\t\r\t\16\t]\3\t\3\t\3\n\5\n"+
		"c\n\n\3\n\3\n\3\n\6\nh\n\n\r\n\16\ni\3\n\5\nm\n\n\3\n\6\np\n\n\r\n\16"+
		"\nq\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\6\f~\n\f\r\f\16\f"+
		"\177\6\f\u0082\n\f\r\f\16\f\u0083\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\5\17\u0092\n\17\3\20\3\20\3\20\5\20\u0097\n\20\3\20"+
		"\5\20\u009a\n\20\3\21\3\21\6\21\u009e\n\21\r\21\16\21\u009f\3\21\6\21"+
		"\u00a3\n\21\r\21\16\21\u00a4\3\22\3\22\6\22\u00a9\n\22\r\22\16\22\u00aa"+
		"\3\22\6\22\u00ae\n\22\r\22\16\22\u00af\3\23\3\23\3\23\3\23\3\23\2\2\24"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\6\2\3\3\36\36\"\"$$\4"+
		"\2\3\3\b\n\u00bd\2&\3\2\2\2\4.\3\2\2\2\6\62\3\2\2\2\b\66\3\2\2\2\n>\3"+
		"\2\2\2\fH\3\2\2\2\16L\3\2\2\2\20U\3\2\2\2\22o\3\2\2\2\24s\3\2\2\2\26\u0081"+
		"\3\2\2\2\30\u0088\3\2\2\2\32\u008a\3\2\2\2\34\u0091\3\2\2\2\36\u0093\3"+
		"\2\2\2 \u00a2\3\2\2\2\"\u00ad\3\2\2\2$\u00b1\3\2\2\2&\'\5\4\3\2\'\3\3"+
		"\2\2\2(+\5\6\4\2)+\5\b\5\2*(\3\2\2\2*)\3\2\2\2+,\3\2\2\2,-\7+\2\2-/\3"+
		"\2\2\2.*\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62"+
		"\63\7\f\2\2\63\64\7+\2\2\64\65\5\n\6\2\65\7\3\2\2\2\66\67\7\13\2\2\67"+
		"\t\3\2\2\28?\5\f\7\29?\5\16\b\2:?\5\34\17\2;?\5$\23\2<?\5\32\16\2=?\5"+
		"\24\13\2>8\3\2\2\2>9\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?"+
		"@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\13\3\2\2\2BD\7\3\2\2CB\3\2\2\2DE\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GI\7+\2\2HC\3\2\2\2IJ\3\2\2\2JH\3\2\2"+
		"\2JK\3\2\2\2K\r\3\2\2\2LM\5\20\t\2MN\7\23\2\2NO\5\22\n\2OQ\7+\2\2PR\5"+
		"\20\t\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\17\3\2\2\2U[\7\23\2\2"+
		"VY\7\3\2\2WY\5\36\20\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2Z\\\7\23\2\2[X\3\2"+
		"\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7+\2\2`\21\3\2\2\2ac\7"+
		"\37\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7$\2\2eg\7$\2\2fh\7$\2\2gf\3\2"+
		"\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2km\7\37\2\2lk\3\2\2\2lm\3"+
		"\2\2\2mn\3\2\2\2np\7\23\2\2ob\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\23"+
		"\3\2\2\2st\7\24\2\2tu\7\32\2\2uv\7\3\2\2vw\7\33\2\2wx\7\30\2\2xy\5\26"+
		"\f\2yz\7\31\2\2z\25\3\2\2\2{}\7\27\2\2|~\5\30\r\2}|\3\2\2\2~\177\3\2\2"+
		"\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081{\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0086\7\36\2\2\u0086\u0087\7\3\2\2\u0087\27\3\2\2\2\u0088\u0089"+
		"\t\2\2\2\u0089\31\3\2\2\2\u008a\u008b\7\32\2\2\u008b\u008c\7\3\2\2\u008c"+
		"\u008d\7\33\2\2\u008d\u008e\7+\2\2\u008e\33\3\2\2\2\u008f\u0092\5 \21"+
		"\2\u0090\u0092\5\"\22\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\35\3\2\2\2\u0093\u0099\7\r\2\2\u0094\u0096\7\17\2\2\u0095\u0097\7\16"+
		"\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u009a\7\16\2\2\u0099\u0094\3\2\2\2\u0099\u0098\3\2\2\2\u009a\37\3\2\2"+
		"\2\u009b\u009d\7\4\2\2\u009c\u009e\t\3\2\2\u009d\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\7+\2\2\u00a2\u009b\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5!\3\2\2\2\u00a6\u00a8\7$\2\2\u00a7\u00a9"+
		"\t\3\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\7+\2\2\u00ad\u00a6\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"#\3\2\2\2\u00b1\u00b2\7(\2\2\u00b2\u00b3\7\3\2\2\u00b3\u00b4\7+\2\2\u00b4"+
		"%\3\2\2\2\30*\60>@EJSX]bilq\177\u0083\u0091\u0096\u0099\u009f\u00a4\u00aa"+
		"\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}