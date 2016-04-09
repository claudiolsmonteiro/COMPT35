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
date: DIGIT (SLASH DIGIT)?;
location: word (SLASH word)?;
grade: OPEN_PARENTHISIS (DIGIT | real) SLASH DIGIT CLOSE_PARENTHISIS;
//position: 'left' | 'center' | 'right';

title : (CARDINAL+ emphasys* word emphasys*)(underlined)*;

image: EXCLAMATIONMARK OPEN_BRACKET word CLOSE_BRACKET OPEN_PARENTHISIS filelocation CLOSE_PARENTHISIS;
filelocation : (SLASH loc+)+ DOT word;
loc : word | DIGIT | DOT | HYFEN | UNDERSCORE;



table: (word TABLESEPARATOR)+secondROW(word TABLESEPARATOR)+;
secondROW: (COLON? MINUS+ COLON TABLESEPARATOR);

curriculo : experience;

education: title NEWLINE educationcontent;
educationcontent: (title NEWLINE schoolcontent)*;
schoolcontent: (word+ grade* date TABLESEPARATOR date location NEWLINE)+;


role: (LETTER 
	| OPEN_PARENTHISIS 
	| CLOSE_PARENTHISIS 
	| SLASH 
	| COMMA
	| DOT)+;
description : word;
experience: title NEWLINE experiencetype;
experiencetype: (title NEWLINE experiencecontent)*;
experiencecontent: ( role TABLESEPARATOR location NEWLINE role date TABLESEPARATOR date NEWLINE (grade* NEWLINE | description* NEWLINE)*)+;