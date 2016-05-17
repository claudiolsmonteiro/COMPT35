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
		RULE_list = 12, RULE_stars = 13, RULE_wordcloud = 14, RULE_spaces = 15, 
		RULE_orderList = 16, RULE_unorderList = 17, RULE_blockquote = 18;
	public static final String[] ruleNames = {
		"curriculo", "block", "horizontal", "content", "paragraph", "table", "cell", 
		"secondROW", "image", "filelocation", "loc", "link", "list", "stars", 
		"wordcloud", "spaces", "orderList", "unorderList", "blockquote"
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
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
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
				case WORDCLOUD:
					{
					setState(40);
					wordcloud();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43);
				match(NEWLINE);
				}
				}
				setState(47); 
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
			setState(49);
			match(HEADER);
			setState(50);
			match(NEWLINE);
			setState(51);
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
			setState(53);
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
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(62);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(55);
					paragraph();
					}
					break;
				case TABLESEPARATOR:
					{
					setState(56);
					table();
					}
					break;
				case STARTLIST:
				case MINUS:
					{
					setState(57);
					list();
					}
					break;
				case GREATERTHAN:
					{
					setState(58);
					blockquote();
					}
					break;
				case LBRACKET:
					{
					setState(59);
					link();
					}
					break;
				case EXCLAMATIONMARK:
					{
					setState(60);
					image();
					}
					break;
				case WORDCLOUD:
					{
					setState(61);
					wordcloud();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64); 
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
			setState(72); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(66);
						match(TEXT);
						}
						}
						setState(69); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					setState(71);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74); 
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
			setState(76);
			cell();
			setState(77);
			match(TABLESEPARATOR);
			setState(78);
			secondROW();
			setState(79);
			match(NEWLINE);
			setState(81); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(80);
					cell();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83); 
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
			setState(85);
			match(TABLESEPARATOR);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(86);
					match(TEXT);
					}
					break;
				case STAR:
					{
					setState(87);
					stars();
					}
					break;
				case WHITESPACE:
					{
					setState(88);
					spaces();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(91);
				match(TABLESEPARATOR);
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << WHITESPACE) | (1L << STAR))) != 0) );
			setState(96);
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
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(98);
					match(COLON);
					}
				}

				setState(101);
				match(MINUS);
				setState(102);
				match(MINUS);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					match(MINUS);
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				setState(109);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(108);
					match(COLON);
					}
				}

				setState(111);
				match(TABLESEPARATOR);
				}
				}
				setState(114); 
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
			setState(116);
			match(EXCLAMATIONMARK);
			setState(117);
			match(LBRACKET);
			setState(118);
			match(TEXT);
			setState(119);
			match(RBRACKET);
			setState(120);
			match(LPAREN);
			setState(121);
			filelocation();
			setState(122);
			match(RPAREN);
			setState(123);
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
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				match(SLASH);
				setState(127); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(126);
						loc();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(129); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLASH );
			setState(135);
			match(DOT);
			setState(136);
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
			setState(138);
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
			setState(140);
			match(LBRACKET);
			setState(141);
			match(TEXT);
			setState(142);
			match(RBRACKET);
			setState(143);
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
			setState(147);
			switch (_input.LA(1)) {
			case STARTLIST:
				{
				setState(145);
				orderList();
				}
				break;
			case MINUS:
				{
				setState(146);
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
			setState(149);
			match(STAR);
			setState(155);
			switch (_input.LA(1)) {
			case REALNUMBERSELECTION:
				{
				{
				setState(150);
				match(REALNUMBERSELECTION);
				setState(152);
				_la = _input.LA(1);
				if (_la==WHOLENUMBERSELECTION) {
					{
					setState(151);
					match(WHOLENUMBERSELECTION);
					}
				}

				}
				}
				break;
			case WHOLENUMBERSELECTION:
				{
				setState(154);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(WORDCLOUD);
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
		enterRule(_localctx, 30, RULE_spaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(WHITESPACE);
			setState(160);
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
		enterRule(_localctx, 32, RULE_orderList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(162);
					match(STARTLIST);
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(163);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						setState(166); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0) );
					setState(168);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171); 
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
		enterRule(_localctx, 34, RULE_unorderList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(173);
					match(MINUS);
					setState(175); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(174);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						setState(177); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << BOLD) | (1L << ITALICS) | (1L << STRIKETHROUGH))) != 0) );
					setState(179);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(182); 
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
		enterRule(_localctx, 36, RULE_blockquote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(GREATERTHAN);
			setState(185);
			match(TEXT);
			setState(186);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\5\2,\n\2\3\2\3\2\6\2\60\n\2\r\2\16\2"+
		"\61\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5A\n\5\r\5\16"+
		"\5B\3\6\6\6F\n\6\r\6\16\6G\3\6\6\6K\n\6\r\6\16\6L\3\7\3\7\3\7\3\7\3\7"+
		"\6\7T\n\7\r\7\16\7U\3\b\3\b\3\b\3\b\5\b\\\n\b\3\b\6\b_\n\b\r\b\16\b`\3"+
		"\b\3\b\3\t\5\tf\n\t\3\t\3\t\3\t\6\tk\n\t\r\t\16\tl\3\t\5\tp\n\t\3\t\6"+
		"\ts\n\t\r\t\16\tt\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\6\13\u0082"+
		"\n\13\r\13\16\13\u0083\6\13\u0086\n\13\r\13\16\13\u0087\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u0096\n\16\3\17\3\17\3\17"+
		"\5\17\u009b\n\17\3\17\5\17\u009e\n\17\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\6\22\u00a7\n\22\r\22\16\22\u00a8\3\22\6\22\u00ac\n\22\r\22\16\22\u00ad"+
		"\3\23\3\23\6\23\u00b2\n\23\r\23\16\23\u00b3\3\23\6\23\u00b7\n\23\r\23"+
		"\16\23\u00b8\3\24\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\4\6\2\3\3\37\37##%%\4\2\3\3\b\n\u00c8\2/\3\2\2\2\4"+
		"\63\3\2\2\2\6\67\3\2\2\2\b@\3\2\2\2\nJ\3\2\2\2\fN\3\2\2\2\16W\3\2\2\2"+
		"\20r\3\2\2\2\22v\3\2\2\2\24\u0085\3\2\2\2\26\u008c\3\2\2\2\30\u008e\3"+
		"\2\2\2\32\u0095\3\2\2\2\34\u0097\3\2\2\2\36\u009f\3\2\2\2 \u00a1\3\2\2"+
		"\2\"\u00ab\3\2\2\2$\u00b6\3\2\2\2&\u00ba\3\2\2\2(,\5\4\3\2),\5\6\4\2*"+
		",\5\36\20\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,-\3\2\2\2-.\7,\2\2.\60\3\2\2"+
		"\2/+\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\64"+
		"\7\f\2\2\64\65\7,\2\2\65\66\5\b\5\2\66\5\3\2\2\2\678\7\13\2\28\7\3\2\2"+
		"\29A\5\n\6\2:A\5\f\7\2;A\5\32\16\2<A\5&\24\2=A\5\30\r\2>A\5\22\n\2?A\5"+
		"\36\20\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@"+
		"?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\t\3\2\2\2DF\7\3\2\2ED\3\2\2\2"+
		"FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IK\7,\2\2JE\3\2\2\2KL\3\2\2\2"+
		"LJ\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NO\5\16\b\2OP\7\24\2\2PQ\5\20\t\2QS\7"+
		",\2\2RT\5\16\b\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\r\3\2\2\2W^"+
		"\7\24\2\2X\\\7\3\2\2Y\\\5\34\17\2Z\\\5 \21\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2"+
		"\2\2\\]\3\2\2\2]_\7\24\2\2^[\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3"+
		"\2\2\2bc\7,\2\2c\17\3\2\2\2df\7 \2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7"+
		"%\2\2hj\7%\2\2ik\7%\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2"+
		"\2\2np\7 \2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\7\24\2\2re\3\2\2\2st\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vw\7\25\2\2wx\7\33\2\2xy\7\3\2\2y"+
		"z\7\34\2\2z{\7\31\2\2{|\5\24\13\2|}\7\32\2\2}~\7,\2\2~\23\3\2\2\2\177"+
		"\u0081\7\30\2\2\u0080\u0082\5\26\f\2\u0081\u0080\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\177\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2"+
		"\2\u0088\u0089\3\2\2\2\u0089\u008a\7\37\2\2\u008a\u008b\7\3\2\2\u008b"+
		"\25\3\2\2\2\u008c\u008d\t\2\2\2\u008d\27\3\2\2\2\u008e\u008f\7\33\2\2"+
		"\u008f\u0090\7\3\2\2\u0090\u0091\7\34\2\2\u0091\u0092\7,\2\2\u0092\31"+
		"\3\2\2\2\u0093\u0096\5\"\22\2\u0094\u0096\5$\23\2\u0095\u0093\3\2\2\2"+
		"\u0095\u0094\3\2\2\2\u0096\33\3\2\2\2\u0097\u009d\7\16\2\2\u0098\u009a"+
		"\7\20\2\2\u0099\u009b\7\17\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u009e\3\2\2\2\u009c\u009e\7\17\2\2\u009d\u0098\3\2\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\35\3\2\2\2\u009f\u00a0\7\21\2\2\u00a0\37\3\2\2\2\u00a1"+
		"\u00a2\7\r\2\2\u00a2\u00a3\7\17\2\2\u00a3!\3\2\2\2\u00a4\u00a6\7\4\2\2"+
		"\u00a5\u00a7\t\3\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\7,\2\2\u00ab"+
		"\u00a4\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae#\3\2\2\2\u00af\u00b1\7%\2\2\u00b0\u00b2\t\3\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\7,\2\2\u00b6\u00af\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9%\3\2\2\2\u00ba\u00bb"+
		"\7)\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00bd\7,\2\2\u00bd\'\3\2\2\2\30+\61"+
		"@BGLU[`elot\u0083\u0087\u0095\u009a\u009d\u00a8\u00ad\u00b3\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}