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
		TEXT=1, STARTORDER=2, STARTUNORDER=3, REAL=4, DIGIT=5, ESCAPEDCHARS=6, 
		BOLD=7, ITALICS=8, STRIKETHROUGH=9, HORIZONTALRULE=10, HEADER=11, WHITESPACE=12, 
		STAR=13, WHOLENUMBERSELECTION=14, REALNUMBERSELECTION=15, WORDCLOUD=16, 
		BACKSLASH=17, TABLESEPARATOR=18, EXCLAMATIONMARK=19, QUOTE=20, HASH=21, 
		SLASH=22, LPAREN=23, RPAREN=24, LBRACKET=25, RBRACKET=26, LBRACE=27, RBRACE=28, 
		DOT=29, COLON=30, COMMA=31, SEMICOLON=32, UNDERSCORE=33, PLUS=34, MINUS=35, 
		ASTERISK=36, TILDE=37, BACKTICK=38, GREATERTHAN=39, EQUAL=40, QUESTIONMARK=41, 
		NEWLINE=42, WS=43;
	public static final int
		RULE_curriculo = 0, RULE_block = 1, RULE_horizontal = 2, RULE_content = 3, 
		RULE_paragraph = 4, RULE_table = 5, RULE_cell = 6, RULE_secondROW = 7, 
		RULE_image = 8, RULE_filelocation = 9, RULE_loc = 10, RULE_link = 11, 
		RULE_list = 12, RULE_stars = 13, RULE_wordcloud = 14, RULE_dimension = 15, 
		RULE_spaces = 16, RULE_orderList = 17, RULE_unorderList = 18, RULE_blockquote = 19;
	public static final String[] ruleNames = {
		"curriculo", "block", "horizontal", "content", "paragraph", "table", "cell", 
		"secondROW", "image", "filelocation", "loc", "link", "list", "stars", 
		"wordcloud", "dimension", "spaces", "orderList", "unorderList", "blockquote"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'\\'", "'|'", "'!'", "'\"'", "'#'", "'/'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "':'", "','", "';'", 
		"'_'", "'+'", "'-'", "'*'", "'~'", "'`'", "'>'", "'='", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TEXT", "STARTORDER", "STARTUNORDER", "REAL", "DIGIT", "ESCAPEDCHARS", 
		"BOLD", "ITALICS", "STRIKETHROUGH", "HORIZONTALRULE", "HEADER", "WHITESPACE", 
		"STAR", "WHOLENUMBERSELECTION", "REALNUMBERSELECTION", "WORDCLOUD", "BACKSLASH", 
		"TABLESEPARATOR", "EXCLAMATIONMARK", "QUOTE", "HASH", "SLASH", "LPAREN", 
		"RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "DOT", "COLON", 
		"COMMA", "SEMICOLON", "UNDERSCORE", "PLUS", "MINUS", "ASTERISK", "TILDE", 
		"BACKTICK", "GREATERTHAN", "EQUAL", "QUESTIONMARK", "NEWLINE", "WS"
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
		public List<WordcloudContext> wordcloud() {
			return getRuleContexts(WordcloudContext.class);
		}
		public WordcloudContext wordcloud(int i) {
			return getRuleContext(WordcloudContext.class,i);
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
		enterRule(_localctx, 0, RULE_curriculo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				switch (_input.LA(1)) {
				case HEADER:
					{
					setState(40);
					block();
					}
					break;
				case HORIZONTALRULE:
					{
					setState(41);
					horizontal();
					}
					break;
				case WORDCLOUD:
					{
					setState(42);
					wordcloud();
					}
					break;
				case NEWLINE:
					{
					setState(43);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(46);
				match(NEWLINE);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HORIZONTALRULE) | (1L << HEADER) | (1L << WORDCLOUD) | (1L << NEWLINE))) != 0) );
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
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<TerminalNode> HEADER() { return getTokens(MarkdownParser.HEADER); }
		public TerminalNode HEADER(int i) {
			return getToken(MarkdownParser.HEADER, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
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
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51);
					match(HEADER);
					}
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==HEADER );
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56);
					match(NEWLINE);
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEADER );
			setState(65);
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
		enterRule(_localctx, 4, RULE_horizontal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
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
		public List<WordcloudContext> wordcloud() {
			return getRuleContexts(WordcloudContext.class);
		}
		public WordcloudContext wordcloud(int i) {
			return getRuleContext(WordcloudContext.class,i);
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
		enterRule(_localctx, 6, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(76);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(69);
					paragraph();
					}
					break;
				case TABLESEPARATOR:
					{
					setState(70);
					table();
					}
					break;
				case STARTORDER:
				case STARTUNORDER:
					{
					setState(71);
					list();
					}
					break;
				case GREATERTHAN:
					{
					setState(72);
					blockquote();
					}
					break;
				case LBRACKET:
					{
					setState(73);
					link();
					}
					break;
				case EXCLAMATIONMARK:
					{
					setState(74);
					image();
					}
					break;
				case WORDCLOUD:
					{
					setState(75);
					wordcloud();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << STARTORDER) | (1L << STARTUNORDER) | (1L << WORDCLOUD) | (1L << TABLESEPARATOR) | (1L << EXCLAMATIONMARK) | (1L << LBRACKET) | (1L << GREATERTHAN))) != 0) );
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
		enterRule(_localctx, 8, RULE_paragraph);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(80);
						match(TEXT);
						}
						}
						setState(83); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					setState(85);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 10, RULE_table);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			cell();
			setState(91);
			match(TABLESEPARATOR);
			setState(92);
			secondROW();
			setState(93);
			match(NEWLINE);
			setState(95); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(94);
					cell();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public List<SpacesContext> spaces() {
			return getRuleContexts(SpacesContext.class);
		}
		public SpacesContext spaces(int i) {
			return getRuleContext(SpacesContext.class,i);
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
		enterRule(_localctx, 12, RULE_cell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(TABLESEPARATOR);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(100);
					match(TEXT);
					}
					break;
				case STAR:
					{
					setState(101);
					stars();
					}
					break;
				case WHITESPACE:
					{
					setState(102);
					spaces();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(105);
				match(TABLESEPARATOR);
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << WHITESPACE) | (1L << STAR))) != 0) );
			setState(110);
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
		enterRule(_localctx, 14, RULE_secondROW);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(112);
					match(COLON);
					}
				}

				setState(115);
				match(MINUS);
				setState(116);
				match(MINUS);
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					match(MINUS);
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				setState(123);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(122);
					match(COLON);
					}
				}

				setState(125);
				match(TABLESEPARATOR);
				}
				}
				setState(128); 
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
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
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
		enterRule(_localctx, 16, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(EXCLAMATIONMARK);
			setState(131);
			match(LBRACKET);
			setState(132);
			match(TEXT);
			setState(133);
			match(RBRACKET);
			setState(134);
			match(LPAREN);
			setState(135);
			filelocation();
			setState(136);
			match(RPAREN);
			setState(137);
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
		enterRule(_localctx, 18, RULE_filelocation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				match(SLASH);
				setState(141); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(140);
						loc();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(143); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLASH );
			setState(149);
			match(DOT);
			setState(150);
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
		enterRule(_localctx, 20, RULE_loc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		enterRule(_localctx, 22, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(LBRACKET);
			setState(155);
			match(TEXT);
			setState(156);
			match(RBRACKET);
			setState(157);
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
		enterRule(_localctx, 24, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			switch (_input.LA(1)) {
			case STARTORDER:
				{
				setState(159);
				orderList();
				}
				break;
			case STARTUNORDER:
				{
				setState(160);
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
		public TerminalNode WHOLENUMBERSELECTION() { return getToken(MarkdownParser.WHOLENUMBERSELECTION, 0); }
		public TerminalNode REALNUMBERSELECTION() { return getToken(MarkdownParser.REALNUMBERSELECTION, 0); }
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
		enterRule(_localctx, 26, RULE_stars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(STAR);
			setState(169);
			switch (_input.LA(1)) {
			case REALNUMBERSELECTION:
				{
				{
				setState(164);
				match(REALNUMBERSELECTION);
				setState(166);
				_la = _input.LA(1);
				if (_la==WHOLENUMBERSELECTION) {
					{
					setState(165);
					match(WHOLENUMBERSELECTION);
					}
				}

				}
				}
				break;
			case WHOLENUMBERSELECTION:
				{
				setState(168);
				match(WHOLENUMBERSELECTION);
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

	public static class WordcloudContext extends ParserRuleContext {
		public TerminalNode WORDCLOUD() { return getToken(MarkdownParser.WORDCLOUD, 0); }
		public List<TerminalNode> TEXT() { return getTokens(MarkdownParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(MarkdownParser.TEXT, i);
		}
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public WordcloudContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordcloud; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterWordcloud(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitWordcloud(this);
		}
	}

	public final WordcloudContext wordcloud() throws RecognitionException {
		WordcloudContext _localctx = new WordcloudContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_wordcloud);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(WORDCLOUD);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172);
					match(TEXT);
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					dimension();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					match(TEXT);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(MarkdownParser.LBRACKET, 0); }
		public List<TerminalNode> TEXT() { return getTokens(MarkdownParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(MarkdownParser.TEXT, i);
		}
		public TerminalNode ASTERISK() { return getToken(MarkdownParser.ASTERISK, 0); }
		public TerminalNode RBRACKET() { return getToken(MarkdownParser.RBRACKET, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitDimension(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(LBRACKET);
			setState(191);
			match(TEXT);
			setState(192);
			match(ASTERISK);
			setState(193);
			match(TEXT);
			setState(194);
			match(RBRACKET);
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

	public static class SpacesContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(MarkdownParser.WHITESPACE, 0); }
		public TerminalNode WHOLENUMBERSELECTION() { return getToken(MarkdownParser.WHOLENUMBERSELECTION, 0); }
		public SpacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterSpaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitSpaces(this);
		}
	}

	public final SpacesContext spaces() throws RecognitionException {
		SpacesContext _localctx = new SpacesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_spaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(WHITESPACE);
			setState(197);
			match(WHOLENUMBERSELECTION);
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
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public List<TerminalNode> STARTORDER() { return getTokens(MarkdownParser.STARTORDER); }
		public TerminalNode STARTORDER(int i) {
			return getToken(MarkdownParser.STARTORDER, i);
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
		enterRule(_localctx, 34, RULE_orderList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(200); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(199);
						match(STARTORDER);
						}
						}
						setState(202); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==STARTORDER );
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(204);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						setState(207); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0) );
					setState(209);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(212); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public List<TerminalNode> STARTUNORDER() { return getTokens(MarkdownParser.STARTUNORDER); }
		public TerminalNode STARTUNORDER(int i) {
			return getToken(MarkdownParser.STARTUNORDER, i);
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
		enterRule(_localctx, 36, RULE_unorderList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(214);
						match(STARTUNORDER);
						}
						}
						setState(217); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==STARTUNORDER );
					setState(220); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(219);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						setState(222); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0) );
					setState(224);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(227); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 38, RULE_blockquote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(GREATERTHAN);
			setState(230);
			match(TEXT);
			setState(231);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u00ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\5\2/\n\2\3\2\6\2\62\n\2"+
		"\r\2\16\2\63\3\3\6\3\67\n\3\r\3\16\38\3\3\6\3<\n\3\r\3\16\3=\6\3@\n\3"+
		"\r\3\16\3A\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5O\n\5\r\5\16"+
		"\5P\3\6\6\6T\n\6\r\6\16\6U\3\6\6\6Y\n\6\r\6\16\6Z\3\7\3\7\3\7\3\7\3\7"+
		"\6\7b\n\7\r\7\16\7c\3\b\3\b\3\b\3\b\5\bj\n\b\3\b\6\bm\n\b\r\b\16\bn\3"+
		"\b\3\b\3\t\5\tt\n\t\3\t\3\t\3\t\6\ty\n\t\r\t\16\tz\3\t\5\t~\n\t\3\t\6"+
		"\t\u0081\n\t\r\t\16\t\u0082\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\6\13\u0090\n\13\r\13\16\13\u0091\6\13\u0094\n\13\r\13\16\13\u0095"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00a4\n\16"+
		"\3\17\3\17\3\17\5\17\u00a9\n\17\3\17\5\17\u00ac\n\17\3\20\3\20\7\20\u00b0"+
		"\n\20\f\20\16\20\u00b3\13\20\3\20\7\20\u00b6\n\20\f\20\16\20\u00b9\13"+
		"\20\3\20\7\20\u00bc\n\20\f\20\16\20\u00bf\13\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\6\23\u00cb\n\23\r\23\16\23\u00cc\3\23\6\23"+
		"\u00d0\n\23\r\23\16\23\u00d1\3\23\6\23\u00d5\n\23\r\23\16\23\u00d6\3\24"+
		"\6\24\u00da\n\24\r\24\16\24\u00db\3\24\6\24\u00df\n\24\r\24\16\24\u00e0"+
		"\3\24\6\24\u00e4\n\24\r\24\16\24\u00e5\3\25\3\25\3\25\3\25\3\25\2\2\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\6\2\3\3\37\37##%%\4"+
		"\2\3\3\t\13\u00fd\2\61\3\2\2\2\4?\3\2\2\2\6E\3\2\2\2\bN\3\2\2\2\nX\3\2"+
		"\2\2\f\\\3\2\2\2\16e\3\2\2\2\20\u0080\3\2\2\2\22\u0084\3\2\2\2\24\u0093"+
		"\3\2\2\2\26\u009a\3\2\2\2\30\u009c\3\2\2\2\32\u00a3\3\2\2\2\34\u00a5\3"+
		"\2\2\2\36\u00ad\3\2\2\2 \u00c0\3\2\2\2\"\u00c6\3\2\2\2$\u00d4\3\2\2\2"+
		"&\u00e3\3\2\2\2(\u00e7\3\2\2\2*/\5\4\3\2+/\5\6\4\2,/\5\36\20\2-/\7,\2"+
		"\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60\62\7,\2\2\61"+
		".\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\67"+
		"\7\r\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:<\7"+
		",\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?\66\3\2\2\2@A"+
		"\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\5\b\5\2D\5\3\2\2\2EF\7\f\2\2"+
		"F\7\3\2\2\2GO\5\n\6\2HO\5\f\7\2IO\5\32\16\2JO\5(\25\2KO\5\30\r\2LO\5\22"+
		"\n\2MO\5\36\20\2NG\3\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3"+
		"\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\t\3\2\2\2RT\7\3\2\2SR"+
		"\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\7,\2\2XS\3\2\2\2YZ"+
		"\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\]\5\16\b\2]^\7\24\2\2^_\5\20"+
		"\t\2_a\7,\2\2`b\5\16\b\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\r\3"+
		"\2\2\2el\7\24\2\2fj\7\3\2\2gj\5\34\17\2hj\5\"\22\2if\3\2\2\2ig\3\2\2\2"+
		"ih\3\2\2\2jk\3\2\2\2km\7\24\2\2li\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2"+
		"\2op\3\2\2\2pq\7,\2\2q\17\3\2\2\2rt\7 \2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2"+
		"\2uv\7%\2\2vx\7%\2\2wy\7%\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2"+
		"{}\3\2\2\2|~\7 \2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0081\7\24\2"+
		"\2\u0080s\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\21\3\2\2\2\u0084\u0085\7\25\2\2\u0085\u0086\7\33\2\2\u0086"+
		"\u0087\7\3\2\2\u0087\u0088\7\34\2\2\u0088\u0089\7\31\2\2\u0089\u008a\5"+
		"\24\13\2\u008a\u008b\7\32\2\2\u008b\u008c\7,\2\2\u008c\23\3\2\2\2\u008d"+
		"\u008f\7\30\2\2\u008e\u0090\5\26\f\2\u008f\u008e\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u008d\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\37\2\2\u0098\u0099\7\3\2\2\u0099"+
		"\25\3\2\2\2\u009a\u009b\t\2\2\2\u009b\27\3\2\2\2\u009c\u009d\7\33\2\2"+
		"\u009d\u009e\7\3\2\2\u009e\u009f\7\34\2\2\u009f\u00a0\7,\2\2\u00a0\31"+
		"\3\2\2\2\u00a1\u00a4\5$\23\2\u00a2\u00a4\5&\24\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00ab\7\17\2\2\u00a6\u00a8\7\21"+
		"\2\2\u00a7\u00a9\7\20\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ac\7\20\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00aa\3"+
		"\2\2\2\u00ac\35\3\2\2\2\u00ad\u00b1\7\22\2\2\u00ae\u00b0\7\3\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b7\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\5 \21\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00bd\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\7\3\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\37\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\33\2\2\u00c1\u00c2"+
		"\7\3\2\2\u00c2\u00c3\7&\2\2\u00c3\u00c4\7\3\2\2\u00c4\u00c5\7\34\2\2\u00c5"+
		"!\3\2\2\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\7\20\2\2\u00c8#\3\2\2\2\u00c9"+
		"\u00cb\7\4\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00d0\t\3\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\7,\2\2\u00d4\u00ca\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7%\3\2\2\2"+
		"\u00d8\u00da\7\5\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df\t\3\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\7,\2\2\u00e3\u00d9\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\'\3\2\2\2"+
		"\u00e7\u00e8\7)\2\2\u00e8\u00e9\7\3\2\2\u00e9\u00ea\7,\2\2\u00ea)\3\2"+
		"\2\2 .\638=ANPUZcinsz}\u0082\u0091\u0095\u00a3\u00a8\u00ab\u00b1\u00b7"+
		"\u00bd\u00cc\u00d1\u00d6\u00db\u00e0\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}