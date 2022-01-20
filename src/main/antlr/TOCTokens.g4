lexer grammar TOCTokens;

EOL: '\r'? '\n' -> channel(HIDDEN);
WHTITESPACE: [ \t]+ -> skip;
QUOTE: '"';
COMMA: ',';

STRING: QUOTE (~[\r\n"] | QUOTE QUOTE)* QUOTE;

LBRACE: '{';
RBRACE: '}';

NUMBER: DIGIT+;

fragment DIGIT: [0-9];