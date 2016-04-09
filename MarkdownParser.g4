parser grammar MarkdownParser;

options {
	tokenVocab = MarkdownLexer;
}

//r  : table | title | image ;
r : curriculo;
// teste
word : LETTER+;
real : DIGIT DOT DIGIT;
emphasys : italic | bold;
italic : ASTERISK;
bold : UNDERSCORE;
//PARSING
underlined : NEWLINE (EQUAL+ | MINUS+);
date: DIGIT (HYFEN DIGIT)?;
grade: OPEN_PARENTHISIS (DIGIT | real) SLASH DIGIT CLOSE_PARENTHISIS;
//position: 'left' | 'center' | 'right';

title : (CARDINAL+ emphasys* word emphasys*)(underlined)*;

image: EXCLAMATIONMARK OPEN_BRACKET word CLOSE_BRACKET OPEN_PARENTHISIS location CLOSE_PARENTHISIS;
location : (SLASH loc+)+ DOT word;
loc : word | DIGIT | DOT | HYFEN | UNDERSCORE;



table: (word TABLESEPARATOR)+secondROW(word TABLESEPARATOR)+;
secondROW: (COLON? MINUS+ COLON TABLESEPARATOR);

curriculo : education;

education: title NEWLINE educationcontent;
educationcontent: (title NEWLINE schoolcontent)*;
schoolcontent: (word+ grade* date HYFEN date word NEWLINE)+;
