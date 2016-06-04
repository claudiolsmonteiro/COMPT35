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
		STRIKETHROUGH=8, HORIZONTALRULE=9, HEADER=10, WHITESPACE=11, STAR=12, 
		WHOLENUMBERSELECTION=13, REALNUMBERSELECTION=14, WORDCLOUD=15, LISTSTART=16, 
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
		null, "TEXT", "STARTLIST", "REAL", "DIGIT", "ESCAPEDCHARS", "BOLD", "ITALICS", 
		"STRIKETHROUGH", "HORIZONTALRULE", "HEADER", "WHITESPACE", "STAR", "WHOLENUMBERSELECTION", 
		"REALNUMBERSELECTION", "WORDCLOUD", "LISTSTART", "BACKSLASH", "TABLESEPARATOR", 
		"EXCLAMATIONMARK", "QUOTE", "HASH", "SLASH", "LPAREN", "RPAREN", "LBRACKET", 
		"RBRACKET", "LBRACE", "RBRACE", "DOT", "COLON", "COMMA", "SEMICOLON", 
		"UNDERSCORE", "PLUS", "MINUS", "ASTERISK", "TILDE", "BACKTICK", "GREATERTHAN", 
		"EQUAL", "QUESTIONMARK", "NEWLINE", "WS"
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
				setState(43);
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
				default:
					throw new NoViableAltException(this);
				}
				setState(45);
				match(NEWLINE);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HORIZONTALRULE) | (1L << HEADER) | (1L << WORDCLOUD))) != 0) );
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
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(HEADER);
			setState(52);
			match(NEWLINE);
			setState(53);
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
			setState(55);
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
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(64);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(57);
					paragraph();
					}
					break;
				case TABLESEPARATOR:
					{
					setState(58);
					table();
					}
					break;
				case STARTLIST:
				case MINUS:
					{
					setState(59);
					list();
					}
					break;
				case GREATERTHAN:
					{
					setState(60);
					blockquote();
					}
					break;
				case LBRACKET:
					{
					setState(61);
					link();
					}
					break;
				case EXCLAMATIONMARK:
					{
					setState(62);
					image();
					}
					break;
				case WORDCLOUD:
					{
					setState(63);
					wordcloud();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << STARTLIST) | (1L << WORDCLOUD) | (1L << TABLESEPARATOR) | (1L << EXCLAMATIONMARK) | (1L << LBRACKET) | (1L << MINUS) | (1L << GREATERTHAN))) != 0) );
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
			setState(74); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(68);
						match(TEXT);
						}
						}
						setState(71); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					setState(73);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76); 
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
		enterRule(_localctx, 10, RULE_table);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			cell();
			setState(79);
			match(TABLESEPARATOR);
			setState(80);
			secondROW();
			setState(81);
			match(NEWLINE);
			setState(83); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(82);
					cell();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(85); 
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
			setState(87);
			match(TABLESEPARATOR);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(88);
					match(TEXT);
					}
					break;
				case STAR:
					{
					setState(89);
					stars();
					}
					break;
				case WHITESPACE:
					{
					setState(90);
					spaces();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93);
				match(TABLESEPARATOR);
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << WHITESPACE) | (1L << STAR))) != 0) );
			setState(98);
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
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(100);
					match(COLON);
					}
				}

				setState(103);
				match(MINUS);
				setState(104);
				match(MINUS);
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(105);
					match(MINUS);
					}
					}
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				setState(111);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(110);
					match(COLON);
					}
				}

				setState(113);
				match(TABLESEPARATOR);
				}
				}
				setState(116); 
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
			setState(118);
			match(EXCLAMATIONMARK);
			setState(119);
			match(LBRACKET);
			setState(120);
			match(TEXT);
			setState(121);
			match(RBRACKET);
			setState(122);
			match(LPAREN);
			setState(123);
			filelocation();
			setState(124);
			match(RPAREN);
			setState(125);
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
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				match(SLASH);
				setState(129); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(128);
						loc();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(131); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLASH );
			setState(137);
			match(DOT);
			setState(138);
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
			setState(140);
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
			setState(142);
			match(LBRACKET);
			setState(143);
			match(TEXT);
			setState(144);
			match(RBRACKET);
			setState(145);
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
			setState(149);
			switch (_input.LA(1)) {
			case STARTLIST:
				{
				setState(147);
				orderList();
				}
				break;
			case MINUS:
				{
				setState(148);
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
			setState(151);
			match(STAR);
			setState(157);
			switch (_input.LA(1)) {
			case REALNUMBERSELECTION:
				{
				{
				setState(152);
				match(REALNUMBERSELECTION);
				setState(154);
				_la = _input.LA(1);
				if (_la==WHOLENUMBERSELECTION) {
					{
					setState(153);
					match(WHOLENUMBERSELECTION);
					}
				}

				}
				}
				break;
			case WHOLENUMBERSELECTION:
				{
				setState(156);
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
			setState(159);
			match(WORDCLOUD);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(160);
					match(TEXT);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					dimension();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(178);
			match(LBRACKET);
			setState(179);
			match(TEXT);
			setState(180);
			match(ASTERISK);
			setState(181);
			match(TEXT);
			setState(182);
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
			setState(184);
			match(WHITESPACE);
			setState(185);
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
		enterRule(_localctx, 34, RULE_orderList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(187);
					match(STARTLIST);
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(188);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						setState(191); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0) );
					setState(193);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(196); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 36, RULE_unorderList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(198);
					match(MINUS);
					setState(200); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(199);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						setState(202); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0) );
					setState(204);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(207); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
			setState(209);
			match(GREATERTHAN);
			setState(210);
			match(TEXT);
			setState(211);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u00d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\5\2.\n\2\3\2\3\2\6\2\62\n\2"+
		"\r\2\16\2\63\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5C"+
		"\n\5\r\5\16\5D\3\6\6\6H\n\6\r\6\16\6I\3\6\6\6M\n\6\r\6\16\6N\3\7\3\7\3"+
		"\7\3\7\3\7\6\7V\n\7\r\7\16\7W\3\b\3\b\3\b\3\b\5\b^\n\b\3\b\6\ba\n\b\r"+
		"\b\16\bb\3\b\3\b\3\t\5\th\n\t\3\t\3\t\3\t\6\tm\n\t\r\t\16\tn\3\t\5\tr"+
		"\n\t\3\t\6\tu\n\t\r\t\16\tv\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\6\13\u0084\n\13\r\13\16\13\u0085\6\13\u0088\n\13\r\13\16\13\u0089"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u0098\n\16"+
		"\3\17\3\17\3\17\5\17\u009d\n\17\3\17\5\17\u00a0\n\17\3\20\3\20\7\20\u00a4"+
		"\n\20\f\20\16\20\u00a7\13\20\3\20\7\20\u00aa\n\20\f\20\16\20\u00ad\13"+
		"\20\3\20\7\20\u00b0\n\20\f\20\16\20\u00b3\13\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\6\23\u00c0\n\23\r\23\16\23\u00c1\3\23"+
		"\6\23\u00c5\n\23\r\23\16\23\u00c6\3\24\3\24\6\24\u00cb\n\24\r\24\16\24"+
		"\u00cc\3\24\6\24\u00d0\n\24\r\24\16\24\u00d1\3\25\3\25\3\25\3\25\3\25"+
		"\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\6\2\3\3\37\37"+
		"##%%\4\2\3\3\b\n\u00e3\2\61\3\2\2\2\4\65\3\2\2\2\69\3\2\2\2\bB\3\2\2\2"+
		"\nL\3\2\2\2\fP\3\2\2\2\16Y\3\2\2\2\20t\3\2\2\2\22x\3\2\2\2\24\u0087\3"+
		"\2\2\2\26\u008e\3\2\2\2\30\u0090\3\2\2\2\32\u0097\3\2\2\2\34\u0099\3\2"+
		"\2\2\36\u00a1\3\2\2\2 \u00b4\3\2\2\2\"\u00ba\3\2\2\2$\u00c4\3\2\2\2&\u00cf"+
		"\3\2\2\2(\u00d3\3\2\2\2*.\5\4\3\2+.\5\6\4\2,.\5\36\20\2-*\3\2\2\2-+\3"+
		"\2\2\2-,\3\2\2\2./\3\2\2\2/\60\7,\2\2\60\62\3\2\2\2\61-\3\2\2\2\62\63"+
		"\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\66\7\f\2\2\66\67"+
		"\7,\2\2\678\5\b\5\28\5\3\2\2\29:\7\13\2\2:\7\3\2\2\2;C\5\n\6\2<C\5\f\7"+
		"\2=C\5\32\16\2>C\5(\25\2?C\5\30\r\2@C\5\22\n\2AC\5\36\20\2B;\3\2\2\2B"+
		"<\3\2\2\2B=\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2CD\3\2\2\2"+
		"DB\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FH\7\3\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2JK\3\2\2\2KM\7,\2\2LG\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2"+
		"\2O\13\3\2\2\2PQ\5\16\b\2QR\7\24\2\2RS\5\20\t\2SU\7,\2\2TV\5\16\b\2UT"+
		"\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2\2Y`\7\24\2\2Z^\7\3\2\2"+
		"[^\5\34\17\2\\^\5\"\22\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_a\7"+
		"\24\2\2`]\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7,\2\2e\17"+
		"\3\2\2\2fh\7 \2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7%\2\2jl\7%\2\2km\7"+
		"%\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\7 \2\2qp\3\2"+
		"\2\2qr\3\2\2\2rs\3\2\2\2su\7\24\2\2tg\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3"+
		"\2\2\2w\21\3\2\2\2xy\7\25\2\2yz\7\33\2\2z{\7\3\2\2{|\7\34\2\2|}\7\31\2"+
		"\2}~\5\24\13\2~\177\7\32\2\2\177\u0080\7,\2\2\u0080\23\3\2\2\2\u0081\u0083"+
		"\7\30\2\2\u0082\u0084\5\26\f\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0081"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\7\37\2\2\u008c\u008d\7\3\2\2\u008d\25\3\2\2"+
		"\2\u008e\u008f\t\2\2\2\u008f\27\3\2\2\2\u0090\u0091\7\33\2\2\u0091\u0092"+
		"\7\3\2\2\u0092\u0093\7\34\2\2\u0093\u0094\7,\2\2\u0094\31\3\2\2\2\u0095"+
		"\u0098\5$\23\2\u0096\u0098\5&\24\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\33\3\2\2\2\u0099\u009f\7\16\2\2\u009a\u009c\7\20\2\2\u009b"+
		"\u009d\7\17\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3"+
		"\2\2\2\u009e\u00a0\7\17\2\2\u009f\u009a\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\35\3\2\2\2\u00a1\u00a5\7\21\2\2\u00a2\u00a4\7\3\2\2\u00a3\u00a2\3\2\2"+
		"\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ab"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\5 \21\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b1\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\7\3\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\37\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\33\2\2\u00b5\u00b6\7\3\2\2\u00b6"+
		"\u00b7\7&\2\2\u00b7\u00b8\7\3\2\2\u00b8\u00b9\7\34\2\2\u00b9!\3\2\2\2"+
		"\u00ba\u00bb\7\r\2\2\u00bb\u00bc\7\17\2\2\u00bc#\3\2\2\2\u00bd\u00bf\7"+
		"\4\2\2\u00be\u00c0\t\3\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\7,"+
		"\2\2\u00c4\u00bd\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7%\3\2\2\2\u00c8\u00ca\7%\2\2\u00c9\u00cb\t\3\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\7,\2\2\u00cf\u00c8\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\'\3\2\2\2"+
		"\u00d3\u00d4\7)\2\2\u00d4\u00d5\7\3\2\2\u00d5\u00d6\7,\2\2\u00d6)\3\2"+
		"\2\2\33-\63BDINW]bgnqv\u0085\u0089\u0097\u009c\u009f\u00a5\u00ab\u00b1"+
		"\u00c1\u00c6\u00cc\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}