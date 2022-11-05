grammar GramaticaCoral;

init: commands EOF;

commands: command commands | ;

//Se pone directamente callfunction ya que en los test se aseguran entradas validas
command : declaration | input | set | output | comment | seedrandomnumbers | callfunction;

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
| callfunction
;

//Llamar funciones en una expresion
callfunction: SQUAREROOT PIZQ arithexpr PDER
| RAISETOPOWER PIZQ arithexpr coma arithexpr PDER
| ABSOLUTEVALUE PIZQ arithexpr PDER
| RANDOMNUMBER PIZQ arithexpr coma arithexpr PDER
| IDENTIFIER PIZQ arguments PDER;

//PENDIENTE PERMITIR ARREGLOS EN VARIABLES
variable: IDENTIFIER | IDENTIFIER cizq arithexpr cder | IDENTIFIER DOT RSIZE;

arguments : arithexpr argumentsprima | ;

argumentsprima : coma arithexpr argumentsprima | ;


seedrandomnumbers : SEEDRANDOMNUMBERS PIZQ arithexpr PDER;

outvalue: arithexpr | STRING;

size: QUESTIONMARK | INTNUM;

coma: COMA;
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
SQUAREROOT : 'SquareRoot';
RAISETOPOWER : 'RaiseToPower';
ABSOLUTEVALUE : 'AbsoluteValue';
RANDOMNUMBER : 'RandomNumber';
COMA : ',';
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
