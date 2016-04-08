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
	[a-zA-Z]+
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

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
 
              