parser grammar MarkdownParser;

options {
	tokenVocab = MarkdownLexer;
}

r : curriculo;

// teste

//emphasys : italic | bold;
//italic : ASTERISK;
//bold : UNDERSCORE;

//PARSING

//date: LBRACKET SIMPLETEXT (SLASH SIMPLETEXT)* RBRACKET ;
date: LBRACKET DIGIT (SLASH DIGIT)? RBRACKET;
location: SIMPLETEXT (SLASH SIMPLETEXT)?;
grade: LPAREN (DIGIT | REAL) SLASH DIGIT RPAREN;
//grade: LPAREN SIMPLETEXT SLASH SIMPLETEXT RPAREN;

image: EXCLAMATIONMARK LBRACKET SIMPLETEXT RBRACKET LPAREN filelocation RPAREN;
filelocation : (SLASH loc+)+ DOT SIMPLETEXT;
//loc : SIMPLETEXT | DIGIT | DOT | MINUS | UNDERSCORE;
loc : SIMPLETEXT| DOT | MINUS | UNDERSCORE;


table: (SIMPLETEXT TABLESEPARATOR)+secondROW(SIMPLETEXT TABLESEPARATOR)+;
secondROW: (COLON? MINUS+ COLON TABLESEPARATOR);

curriculo : experience;

title: HEADER+;
education: title NEWLINE educationcontent;
educationcontent: (title NEWLINE schoolcontent)*;
schoolcontent: (SIMPLETEXT grade* date TABLESEPARATOR date location NEWLINE)+;


role: (SIMPLETEXT 
	| LPAREN 
	| RPAREN 
	| SLASH 
	| COMMA
	| DOT)+;
description : SIMPLETEXT;
experience: HEADER+ NEWLINE experiencetype;
experiencetype: (HEADER+ NEWLINE experiencecontent)*;
experiencecontent: ( role TABLESEPARATOR location NEWLINE role date TABLESEPARATOR date NEWLINE (grade* NEWLINE | description* NEWLINE)*)+;