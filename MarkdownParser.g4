parser grammar MarkdownParser;

options {
	tokenVocab = MarkdownLexer;
}

r  : table | title | image ;

// teste
word : LETTER+;
real : DIGIT.DIGIT;
emphasys : italic | bold;
italic : ASTERISK;
bold : UNDERSCORE;
//PARSING

title : (CARDINAL+ emphasys* word emphasys*)(NEWLINE (EQUAL+ | MINUS+))*;



image: EXCLAMATIONMARK OPEN_BRACKET word CLOSE_BRACKET OPEN_PARENTHISIS location CLOSE_PARENTHISIS;
location : (SLASH loc+)+ DOT word;
loc : word | DIGIT | DOT | HYFEN | UNDERSCORE;



table: (word TABLESEPARATOR)+secondROW(word TABLESEPARATOR)+;
secondROW: (COLON? MINUS+ COLON TABLESEPARATOR);