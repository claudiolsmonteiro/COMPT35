parser grammar MarkdownParser;

options {
	tokenVocab = MarkdownLexer;
}

r  : table;

//PARSING
table: (LETTER TABLESEPARATOR)+secondROW(LETTER TABLESEPARATOR)+;

secondROW: (COLON? MINUS+ COLON TABLESEPARATOR);