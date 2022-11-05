grammar GramaticaCoral;

init: commands EOF;

commands: command commands | ;

command : declaration | input | set | output | comment | seedrandomnumbers;

declaration : TYPE IDENTIFIER
| TYPE ARRAY PIZQ size PDER IDENTIFIER;

input : variable assign GET NEXT INPUT;

set: variable assign arithexpr;

output : PUT outvalue TO OUTPUT;

comment : COMMENT;

//PENDIENTE AGREGAR FUNCIONES COMO TERMINOS DE OPERACIONES
arithexpr : arithexpr sumop arithexpr
| arithexpr mulop arithexpr
| sign arithexpr
| number
| pizq arithexpr pder
| variable
;


//PENDIENTE PERMITIR ARREGLOS EN VARIABLES
variable: IDENTIFIER | IDENTIFIER cizq arithexpr cder | IDENTIFIER DOT RSIZE;

seedrandomnumbers : SEEDRANDOMNUMBERS PIZQ arithexpr PDER;

outvalue: arithexpr | STRING;

size: QUESTIONMARK | INTNUM;

assign : ASSIGN;
sumop : SUMOP;
mulop: MULOP;
cizq : CIZQ;
cder : CDER;
pizq: PIZQ;
pder: PDER;
sign : SUMOP;


number : INTNUM
| FLOATNUM
;

// parser rules start with lowercase letters, lexer rules with uppercase
SEEDRANDOMNUMBERS : 'SeedRandomNumbers';
ARRAY : 'array';
STRING: ["].*?["];
FLOATNUM : [0-9]+([.][0-9]+);
INTNUM : [0-9]+;
SUMOP  : ('+' | '-') ;
MULOP  : ( '*' | '/' | '%');
CIZQ : '[';
CDER : ']';
PIZQ   : '(' ;
PDER   : ')' ;
ASSIGN : '=';
DOT : '.';
RSIZE : 'size';
PUT : 'Put';
TO : 'to';
OUTPUT : 'output';
GET : 'Get';
NEXT : 'next';
INPUT: 'input';
TYPE : ('integer' | 'float');
IDENTIFIER : [a-zA-Z][a-zA-Z0-9_]* ;
QUESTIONMARK : '?';
COMMENT : '//'.*?[\n];
WS: [ \t\r\n]+ -> skip; // Define whitespace rule
