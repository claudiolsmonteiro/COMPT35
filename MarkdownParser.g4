parser grammar MarkdownParser;

options {
	tokenVocab = MarkdownLexer;
}

r  : table | title | real;

// teste
real : DIGIT.DIGIT;
//PARSING

title : (CARDINAL+ LETTER )(NEWLINE (EQUAL+ | MINUS+))*;
table: (LETTER TABLESEPARATOR)+secondROW(LETTER TABLESEPARATOR)+;

secondROW: (COLON? MINUS+ COLON TABLESEPARATOR);