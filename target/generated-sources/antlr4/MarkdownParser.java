// Generated from MarkdownParser.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUOTE=9, UNDERSCORE=20, HEADER=5, MINUS=22, BACKSLASH=6, ITALICS=3, SEMICOLON=19, 
		BOLD=2, BACKTICK=25, WS=27, COMMA=18, EXCLAMATIONMARK=8, SLASH=11, LPAREN=12, 
		DOT=16, LBRACKET=14, ASTERISK=23, RBRACKET=15, COLON=17, RPAREN=13, HASH=10, 
		STRIKETHROUGH=4, TILDE=24, SIMPLETEXT=1, GREATERTHAN=26, TABLESEPARATOR=7, 
		PLUS=21;
	public static final String[] tokenNames = {
		"<INVALID>", "SIMPLETEXT", "BOLD", "ITALICS", "STRIKETHROUGH", "HEADER", 
		"'\\'", "'|'", "'!'", "'\"'", "'#'", "'/'", "'('", "')'", "'['", "']'", 
		"'.'", "':'", "','", "';'", "'_'", "'+'", "'-'", "'*'", "'~'", "'`'", 
		"'>'", "WS"
	};
	public static final int
		RULE_r = 0, RULE_table = 1, RULE_secondROW = 2;
	public static final String[] ruleNames = {
		"r", "table", "secondROW"
	};

	@Override
	public String getGrammarFileName() { return "MarkdownParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
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
			setState(6); table();
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
		public SecondROWContext secondROW() {
			return getRuleContext(SecondROWContext.class,0);
		}
		public List<TerminalNode> TABLESEPARATOR() { return getTokens(MarkdownParser.TABLESEPARATOR); }
		public List<TerminalNode> SIMPLETEXT() { return getTokens(MarkdownParser.SIMPLETEXT); }
		public TerminalNode TABLESEPARATOR(int i) {
			return getToken(MarkdownParser.TABLESEPARATOR, i);
		}
		public TerminalNode SIMPLETEXT(int i) {
			return getToken(MarkdownParser.SIMPLETEXT, i);
		}
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
		enterRule(_localctx, 2, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8); match(SIMPLETEXT);
				setState(9); match(TABLESEPARATOR);
				}
				}
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SIMPLETEXT );
			setState(14); secondROW();
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15); match(SIMPLETEXT);
				setState(16); match(TABLESEPARATOR);
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SIMPLETEXT );
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
		public TerminalNode TABLESEPARATOR() { return getToken(MarkdownParser.TABLESEPARATOR, 0); }
		public TerminalNode MINUS(int i) {
			return getToken(MarkdownParser.MINUS, i);
		}
		public TerminalNode COLON(int i) {
			return getToken(MarkdownParser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MarkdownParser.COLON); }
		public List<TerminalNode> MINUS() { return getTokens(MarkdownParser.MINUS); }
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
		enterRule(_localctx, 4, RULE_secondROW);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(22);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(21); match(COLON);
				}
			}

			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24); match(MINUS);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MINUS );
			setState(29); match(COLON);
			setState(30); match(TABLESEPARATOR);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35#\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\3\3\3\6\3\r\n\3\r\3\16\3\16\3\3\3\3\3\3\6\3\24\n"+
		"\3\r\3\16\3\25\3\4\5\4\31\n\4\3\4\6\4\34\n\4\r\4\16\4\35\3\4\3\4\3\4\3"+
		"\4\2\2\5\2\4\6\2\2#\2\b\3\2\2\2\4\f\3\2\2\2\6\30\3\2\2\2\b\t\5\4\3\2\t"+
		"\3\3\2\2\2\n\13\7\3\2\2\13\r\7\t\2\2\f\n\3\2\2\2\r\16\3\2\2\2\16\f\3\2"+
		"\2\2\16\17\3\2\2\2\17\20\3\2\2\2\20\23\5\6\4\2\21\22\7\3\2\2\22\24\7\t"+
		"\2\2\23\21\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\5\3\2"+
		"\2\2\27\31\7\23\2\2\30\27\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\34\7"+
		"\30\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37"+
		"\3\2\2\2\37 \7\23\2\2 !\7\t\2\2!\7\3\2\2\2\6\16\25\30\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}