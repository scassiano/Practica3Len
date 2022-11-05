grammar GramaticaCoral;

init: commands EOF;

commands: command commands | ;

command : declaration | input | arithexpr ;

declaration : TYPE IDENTIFIER;

input : variable ASSIGN GET NEXT INPUT;

arithexpr : arithexpr sumop arithexpr
| arithexpr mulop arithexpr
| sign arithexpr
| number
| pizq arithexpr pder
| variable
;

sumop : SUMOP;
mulop: MULOP;
pizq: PIZQ;
pder: PDER;
sign : SUMOP;

number : INTNUM
| FLOATNUM
;

//PENDIENTE PERMITIR ARREGLOS EN VARIABLES
variable: IDENTIFIER;

// parser rules start with lowercase letters, lexer rules with uppercase
FLOATNUM : [0-9]+([.][0-9]+);
INTNUM : [0-9]+;
SUMOP  : ('+' | '-') ;
MULOP  : ( '*' | '/' | '%');
PIZQ   : '(' ;
PDER   : ')' ;
ASSIGN : '=';
GET : 'Get';
NEXT : 'next';
INPUT: 'input';
TYPE : ('integer' | 'float');
IDENTIFIER : [a-zA-Z][a-zA-Z0-9_]* ;
WS: [ \t\r\n]+ -> skip; // Define whitespace rule
