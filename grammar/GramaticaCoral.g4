grammar GramaticaCoral;

@lexer::members { private int _pos; }

init: commands EOF;

commands: command commands| ;

//Se pone directamente callfunction ya que en los test se aseguran entradas validas
//Se pone directamente if, elseif, else ya que los test se aseguran entradas validas
command :  newlinespaces (declaration|input|set|output|comment|seedrandomnumbers|callfunction|if|elseif|else|while|forsentence|functiondef);

if: IF condexpr;
elseif: ELSEIF condexpr;
else: ELSE;
while: WHILE condexpr;
forsentence: FOR setfor1 semicolonfor1 condexpr semicolonfor2 setfor2;
functiondef: FUNCTION IDENTIFIER pizq parameters pder RETURNS (NOTHING | TYPE (ARRAY PIZQ size PDER | ) IDENTIFIER);

declaration : TYPE IDENTIFIER
| TYPE ARRAY PIZQ size PDER IDENTIFIER;

input : variable assign GET NEXT INPUT;

set: variable assign arithexpr;
setfor1: set;
setfor2: set;
output : PUT outvalue TO OUTPUT (with arithexpr DECIMAL PLACES | );

comment : COMMENT;

//Expresiones aritmeticas y condicionales se imprime cada parte sola
condexpr : not pizq condexpr pder
| pizq condexpr pder
| condexpr or condexpr
| condexpr and condexpr
| arithexpr oprel arithexpr;

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

variable: IDENTIFIER | IDENTIFIER cizq arithexpr cder | IDENTIFIER DOT RSIZE;

arguments : arithexpr argumentsprima | ;

argumentsprima : coma arithexpr argumentsprima | ;

parameters: TYPE (ARRAY PIZQ size PDER | ) IDENTIFIER parametersprima | ;
parametersprima: coma TYPE (ARRAY PIZQ size PDER | ) identifier parametersprima | ;

seedrandomnumbers : SEEDRANDOMNUMBERS PIZQ arithexpr PDER;

outvalue: arithexpr | STRING;

size: QUESTIONMARK | INTNUM;

newlinespaces:NEWLINESPACES| ;


semicolonfor1: SEMICOLON;
semicolonfor2: SEMICOLON;
not : NOT;
or : OR;
and : AND;
oprel : OPREL;
with: WITH;
coma: COMA;
assign : ASSIGN;
sumop : SUMOP;
mulop: MULOP;
cizq : CIZQ;
cder : CDER;
pizq: PIZQ;
pder: PDER;
sign : SUMOP;

identifier : IDENTIFIER;
number : INTNUM
| FLOATNUM
;



// parser rules start with lowercase letters, lexer rules with uppercase
NOTHING: 'nothing';
RETURNS: 'returns';
FUNCTION: 'Function';
FOR: 'for';
SEMICOLON: ';';
WHILE: 'while';
IF : 'if';
ELSEIF : 'elseif';
ELSE : 'else';
AND: 'and';
OR: 'or';
NOT : 'not';
WITH : 'with';
DECIMAL : 'decimal';
PLACES : 'places';
SEEDRANDOMNUMBERS : 'SeedRandomNumbers';
SQUAREROOT : 'SquareRoot';
RAISETOPOWER : 'RaiseToPower';
ABSOLUTEVALUE : 'AbsoluteValue';
RANDOMNUMBER : 'RandomNumber';
COMA : ',';
ARRAY : 'array';
STRING: '"' (ESC|~('\\'))*? ('"');
fragment ESC: '\\"' | '\\\\' | '\\n' | '\\t';
FLOATNUM : [0-9]+([.][0-9]+);
INTNUM : [0-9]+;
OPREL : ('==' | '<=' | '<' | '>=' | '>' | '!=');
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
COMMENT : ('//'.*?([\r]?[\n]) {_pos=_input.index(); _input.seek(_pos-1); }|'//'.*?(EOF));
NEWLINESPACES : (([\r][\n]|[\n])[\r]|([\r][\n]|[\n])[ ]*)*(([\r][\n]|[\n])([ ])+)+; //Lee fin de linea LF y CRLF
NEWLINESPACESEOF : (([\r][\n]|[\n])[\r]|([\r][\n]|[\n])[ ]*)*(([\r][\n]|[\n])([ ])+)+ EOF -> skip; //Lee fin de linea LF y CRLF
WS: [ \t\r\n]+ -> skip; // Define whitespace rule
