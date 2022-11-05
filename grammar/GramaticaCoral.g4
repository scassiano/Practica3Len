grammar GramaticaCoral;

init: commands EOF;

commands: command commands | ;

command : declaration;

declaration : TYPE IDENTIFIER;

// parser rules start with lowercase letters, lexer rules with uppercase
TYPE : ('integer' | 'float');
IDENTIFIER : [a-zA-Z][a-zA-Z0-9_]* ;
WS: [ \t\r\n]+ -> skip; // Define whitespace rule
