lexer grammar MarkdownLexer;


SIMPLETEXT //Match any text without markdown sintax
:
	(
		~('\\'|'`'|'*'|'_'|'['|']'|'('|')'|'#'|'+'|'-'|'.'|'!')+ 
		| (BACKSLASH (
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

HEADER
:
	HASH+ (SIMPLETEXT | ITALICS | BOLD | STRIKETHROUGH)
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

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
 
              