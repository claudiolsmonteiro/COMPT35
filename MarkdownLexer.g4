lexer grammar MarkdownLexer;

POSITION
:
	'right'
	| 'left'
	| 'center'
;

// match lower-case identifiers
LETTER
:
	[a-zA-Z]
;

COLON
:
	':'
;

MINUS
:
	'-'
;

TABLE
:
	'table'
;

TABLESEPARATOR
:
	'|'
;

CARDINAL
: 
	'#'
;

ASTERISK
: 
	'*'
;

UNDERSCORE
: 
	'_'
;

HYFEN
: 
	'-'
;

EQUAL
: 
	'='
;

TILDES
: 
	'~'
;


DOT
: 
	'.' 
;


EXCLAMATIONMARK
: 
	'!'
;

QUESTIONMARK
: 
	'?'
;

SEMICOLON
: 
	';'
;


SLASH
: 
	'/'
;

//BACKSLASH
//: '\'
//;
// faz o lexer dar erro


PLUS
: 
	'+'
;

ACCENT
: 
	'`' 
	| '´'
;

DIGIT
: 
	[0-9]+
;


OPEN_PARENTHISIS 
: 
	'(' 
;

OPEN_BRACKET
: 
	'[' 
;

OPEN_CURLY
: 
	'{' 
; 

CLOSE_PARENTHISIS 
: 
	')' 
;

CLOSE_BRACKET
: 
	']' 
;

CLOSE_CURLY
: 
	'}' 
;

NEWLINE
: 
	'\n'
;
	
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
 
              