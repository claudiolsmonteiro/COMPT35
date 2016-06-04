parser grammar MarkdownParser;

options {
	tokenVocab = MarkdownLexer;
}
                 
 
curriculo : ((block|horizontal|wordcloud | NEWLINE) NEWLINE)+;

block: (HEADER+ NEWLINE+)+ content;
horizontal: HORIZONTALRULE;
content: (paragraph|table|list|blockquote|link|image|wordcloud)+;
paragraph: (TEXT+ NEWLINE)+;

table: cell TABLESEPARATOR secondROW NEWLINE cell+;
cell:TABLESEPARATOR ((TEXT|stars|spaces) TABLESEPARATOR)+ NEWLINE;
secondROW: (COLON? MINUS MINUS MINUS+ COLON? TABLESEPARATOR)+;

image: EXCLAMATIONMARK LBRACKET TEXT RBRACKET LPAREN filelocation RPAREN NEWLINE;
filelocation : (SLASH loc+)+ DOT TEXT;
loc : TEXT| DOT | MINUS | UNDERSCORE;

link: LBRACKET TEXT RBRACKET NEWLINE;

list: (orderList|unorderList);

stars: STAR ((REALNUMBERSELECTION WHOLENUMBERSELECTION?) | WHOLENUMBERSELECTION);

wordcloud: WORDCLOUD TEXT* dimension* TEXT* ;

dimension : LBRACKET TEXT ASTERISK TEXT RBRACKET ;

spaces: WHITESPACE WHOLENUMBERSELECTION;

orderList: (STARTORDER (TEXT | ITALICS | BOLD | STRIKETHROUGH)+ NEWLINE)+;

unorderList: (STARTUNORDER (TEXT | ITALICS | BOLD | STRIKETHROUGH)+ NEWLINE)+;

blockquote: GREATERTHAN TEXT NEWLINE;
