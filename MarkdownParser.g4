parser grammar MarkdownParser;

options {
	tokenVocab = MarkdownLexer;
}

r : curriculo;                    
 
curriculo : ((block|horizontal) NEWLINE)+;

block: HEADER NEWLINE content;
horizontal: HORIZONTALRULE;
content: (paragraph|table|list|blockquote|link|image)+;
paragraph: (TEXT+ NEWLINE)+;

table: cell TABLESEPARATOR secondROW NEWLINE cell+;
cell:TABLESEPARATOR ((TEXT|stars) TABLESEPARATOR)+ NEWLINE;
secondROW: (COLON? MINUS MINUS MINUS+ COLON? TABLESEPARATOR)+;

image: EXCLAMATIONMARK LBRACKET TEXT RBRACKET LPAREN filelocation RPAREN;
filelocation : (SLASH loc+)+ DOT TEXT;
loc : TEXT| DOT | MINUS | UNDERSCORE;

link: LBRACKET TEXT RBRACKET NEWLINE;

list: (orderList|unorderList);

stars: STAR ((FILLEDSTARS EMPTYSTARS?) | EMPTYSTARS);

orderList: (STARTLIST (TEXT | ITALICS | BOLD | STRIKETHROUGH)+ NEWLINE)+;

unorderList: (MINUS (TEXT | ITALICS | BOLD | STRIKETHROUGH)+ NEWLINE)+;

blockquote: GREATERTHAN TEXT NEWLINE;

/*

date: LBRACKET DIGIT (SLASH DIGIT)? RBRACKET;
birth: LBRACKET DIGIT SLASH DIGIT SLASH DIGIT RBRACKET;
location: TEXT (SLASH TEXT)?;
grade: LPAREN (DIGIT | REAL) SLASH DIGIT RPAREN;



curriculo : info TABLESEPARATOR education TABLESEPARATOR experience;

info: title NEWLINE infocontent;
nationality: TEXT TABLESEPARATOR location;
id: TEXT TABLESEPARATOR DIGIT;
infocontent: (TEXT NEWLINE TEXT birth NEWLINE TEXT TABLESEPARATOR location NEWLINE nationality  NEWLINE id NEWLINE);

education: HEADER NEWLINE educationcontent;
educationcontent: (HEADER NEWLINE schoolcontent)+;
schoolcontent: (TEXT grade* date TABLESEPARATOR date location NEWLINE)+;


role: (TEXT 
	| LPAREN 
	| RPAREN 
	| SLASH 
	| COMMA
	| DOT)+;
	
experience: HEADER+ NEWLINE experiencetype;
experiencetype: (HEADER+ NEWLINE experiencecontent)*;
experiencecontent: ( role TABLESEPARATOR location NEWLINE role date TABLESEPARATOR date NEWLINE (grade* NEWLINE | TEXT NEWLINE)*(blockquote NEWLINE)*)+;
* */