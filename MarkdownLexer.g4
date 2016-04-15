lexer grammar MarkdownLexer;


TEXT
:
		ITALICS | BOLD | STRIKETHROUGH | ([a-zA-Z0-9]+ (' '? ([a-zA-Z0-9]+|ESCAPEDCHARS))*)
;

STARTLIST
:
		DIGIT DOT
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
	ASTERISK ASTERISK (TEXT | ITALICS | STRIKETHROUGH)+ ASTERISK ASTERISK
;

ITALICS
:
	UNDERSCORE (TEXT | BOLD | STRIKETHROUGH)+ UNDERSCORE
;

STRIKETHROUGH
:
	TILDE TILDE (TEXT | ITALICS | BOLD)+ TILDE TILDE
;

HORIZONTALRULE 
: 
	NEWLINE (EQUAL EQUAL EQUAL+)
;

HEADER
:
	HASH+ (TEXT | ITALICS | BOLD | STRIKETHROUGH)+ 
;


STAR
:
	BACKSLASH 'stars'
;
EMPTYSTARS
:
	LBRACKET DIGIT RBRACKET
;

FILLEDSTARS
:
	LBRACE DIGIT (DOT '5')? RBRACE
;



WORDCLOUD
:
	BACKSLASH 'wordcloud'
;

LISTSTART
:
	DIGIT DOT
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
 
              