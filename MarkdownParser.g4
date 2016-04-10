parser grammar MarkdownParser;

options {
	tokenVocab = MarkdownLexer;
}

r : curriculo;

// teste
real : DIGIT DOT DIGIT;
emphasys : italic | bold;
italic : ASTERISK;
bold : UNDERSCORE;

//PARSING

underlined : NEWLINE (EQUAL+ | MINUS+);
date: DIGIT (SLASH DIGIT)?;
location: SIMPLETEXT (SLASH SIMPLETEXT)?;
grade: LPAREN (DIGIT | real) SLASH DIGIT RPAREN;

title : (HASH+ emphasys* SIMPLETEXT emphasys*)(underlined)*;

image: EXCLAMATIONMARK LBRACKET SIMPLETEXT RBRACKET LPAREN filelocation RPAREN;
filelocation : (SLASH loc+)+ DOT SIMPLETEXT;
loc : SIMPLETEXT | DIGIT | DOT | MINUS | UNDERSCORE;



table: (SIMPLETEXT TABLESEPARATOR)+secondROW(SIMPLETEXT TABLESEPARATOR)+;
secondROW: (COLON? MINUS+ COLON TABLESEPARATOR);

curriculo : experience;

education: title NEWLINE educationcontent;
educationcontent: (title NEWLINE schoolcontent)*;
schoolcontent: (SIMPLETEXT+ grade* date TABLESEPARATOR date location NEWLINE)+;


role: (LETTER 
	| LPAREN 
	| RPAREN 
	| SLASH 
	| COMMA
	| DOT)+;
description : SIMPLETEXT;
experience: title NEWLINE experiencetype;
experiencetype: (title NEWLINE experiencecontent)*;
experiencecontent: ( role TABLESEPARATOR location NEWLINE role date TABLESEPARATOR date NEWLINE (grade* NEWLINE | description* NEWLINE)*)+;