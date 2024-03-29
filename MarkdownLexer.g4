lexer grammar MarkdownLexer;


TEXT
:
	ITALICS | BOLD | STRIKETHROUGH | (([a-zA-Z0-9]+|ESCAPEDCHARS) (' '? ([a-zA-Z0-9]+|ESCAPEDCHARS))*)
;

STARTORDER
:
	DIGIT DOT ' ' 
;

STARTUNORDER
:
	MINUS ' ' 
;

REAL
:
	DIGIT DOT DIGIT
;

DIGIT
: 
	[0-9]+
;
ESCAPEDCHARS
:
	(BACKSLASH ( //match escaped markdown chars
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
;

BOLD
:
	' '* ASTERISK ASTERISK (TEXT | ITALICS | STRIKETHROUGH)+ ASTERISK ASTERISK ' '*
;

ITALICS
:
	' '* UNDERSCORE (TEXT | BOLD | STRIKETHROUGH)+ UNDERSCORE ' '*
;

STRIKETHROUGH
:
	' '* TILDE TILDE (TEXT | ITALICS | BOLD)+ TILDE TILDE ' '*
;

HORIZONTALRULE 
: 
	NEWLINE (ASTERISK ASTERISK ASTERISK+)
;

HEADER
:
	HASH+ (TEXT | ITALICS | BOLD | STRIKETHROUGH)+ 
;

WHITESPACE
:
	BACKSLASH 'spaces'
;

STAR
:
	BACKSLASH 'stars'
;

WHOLENUMBERSELECTION
:
	LBRACKET DIGIT RBRACKET
;

REALNUMBERSELECTION
:
	LBRACE DIGIT (DOT '5')? RBRACE
;

WORDCLOUD
:
	BACKSLASH 'wordcloud'
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

LBRACE
: 
	'{' 
;

RBRACE
: 
	'}' 
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

NEWLINE
: 
	'\r'?'\n'
;
	
WS : [' '\t]+ -> skip ; // skip spaces, tabs, newlines
 
              