lexer grammar MarkdownLexer;
 
DIGIT
: 
	[0-9]+
;
REAL
:
	DIGIT DOT DIGIT
;

SIMPLETEXT //Match any text without markdown syntax
:
	(
		~('\\'|'`'|'*'|'_'|'['|']'|'('|')'|'#'|'+'|'-'|'.'|'!'|'\n'|'|'|'/')+ //match text
		| (BACKSLASH ( //match escaped markdown chars
			BACKSLASH 
			| BACKTICK 
			| ASTERISK 
			| UNDERSCORE
			| LBRACKET
			| RBRACKET
			| LPAREN
			| RPAREN
			| HASH
			| PLUS
			| MINUS
			| DOT
			| EXCLAMATIONMARK
		))+
	)+
;

BOLD
:
	ASTERISK ASTERISK (SIMPLETEXT | ITALICS | STRIKETHROUGH) ASTERISK ASTERISK
;

ITALICS
:
	UNDERSCORE (SIMPLETEXT | BOLD | STRIKETHROUGH) UNDERSCORE
;

STRIKETHROUGH
:
	TILDE TILDE (SIMPLETEXT | ITALICS | BOLD) TILDE TILDE
;

UNDERLINED 
: NEWLINE (EQUAL+ | MINUS+)
;

HEADER
:
	HASH+ (SIMPLETEXT | ITALICS | BOLD | STRIKETHROUGH | UNDERLINED)*
;

//CHARS
BACKSLASH
:
	'\\'
;

TABLESEPARATOR
:
	'|'
;

EXCLAMATIONMARK
:
	'!'
;

QUOTE
:
	'"'
;

HASH
:
	'#'
;

SLASH
:
	'/'
;

LPAREN
:
	'('
;

RPAREN
:
	')'
;

LBRACKET
:
	'['
;

RBRACKET
:
	']'
;

DOT
:
	'.'
;

COLON
:
	':'
;

COMMA
:
	','
;

SEMICOLON
:
	';'
;

UNDERSCORE
:
	'_'
;

PLUS
:
	'+'
;

MINUS
:
	'-'
;

ASTERISK
:
	'*'
;

TILDE
:
	'~'
;

BACKTICK
:
	'`'
;

GREATERTHAN
:
	'>'
;

EQUAL
: 
	'='
;

QUESTIONMARK
: 
	'?'
;


OPEN_CURLY
: 
	'{' 
;

CLOSE_CURLY
: 
	'}' 
;

NEWLINE
: 
	'\r'? '\n'
;
	
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
 
              