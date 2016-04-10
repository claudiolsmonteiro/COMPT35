parser grammar MarkdownParser;

options {
	tokenVocab = MarkdownLexer;
}

r  : table;

//PARSING
table: (SIMPLETEXT TABLESEPARATOR)+secondROW(SIMPLETEXT TABLESEPARATOR)+;

secondROW: (COLON? MINUS+ COLON TABLESEPARATOR);