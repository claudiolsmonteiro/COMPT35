parser grammar MarkdownParser;

options {
	tokenVocab = MarkdownLexer;
}

r  : table;

real : DIGIT.DIGIT ;
//PARSING
table: (LETTER TABLESEPARATOR)+secondROW(LETTER TABLESEPARATOR)+;

secondROW: (COLON? MINUS+ COLON TABLESEPARATOR);