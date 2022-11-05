grammar GramaticaCoral;

init: commands EOF;

commands: command commands | ;

command : declaration | input;

declaration : TYPE IDENTIFIER;

input : variable ASSIGN GET NEXT INPUT;

//PENDIENTE PERMITIR ARREGLOS EN VARIABLES
variable: IDENTIFIER;

// parser rules start with lowercase letters, lexer rules with uppercase
ASSIGN : '=';
GET : 'Get';
NEXT : 'next';
INPUT: 'input';
TYPE : ('integer' | 'float');
IDENTIFIER : [a-zA-Z][a-zA-Z0-9_]* ;
WS: [ \t\r\n]+ -> skip; // Define whitespace rule
