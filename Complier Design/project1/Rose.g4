// The grammar for Rose language
grammar Rose;
// Parser rules
token : (ID | BEGIN | DECLARE | ELSE | END | EXIT | FOR | IF | IN | INTEGER | IS | LOOP | PROCEDURE | READ | THEN | WRITE |
 CONST | COLON | DOT | SEMICOLON | ADD | SUBTRACT | MULTIPLE | DIVIDE | PERCENT |
 EQUAL | MIDPAR | MORETHAN | MOE | LESSTHAN | LOE | AND | OR | EXCLAM |
 CAE | LP | RP | WHITESPACE)*;
 
// lexer rules
ID : [_A-Z]([_A-Z] | [0-9])*;

BEGIN : 'begin';
DECLARE : 'declare';
ELSE : 'else';
END : 'end';
EXIT : 'exit';
FOR : 'for';
IF : 'if';
IN : 'in';
INTEGER : 'integer';
IS : 'is';
LOOP : 'loop';
PROCEDURE : 'procedure';
READ : 'read';
THEN : 'then';
WRITE : 'write';

CONST : ('0'+) | ('-'?[1-9][0-9]*);

COLON : ':';
DOT : '..';
SEMICOLON : ';';
ADD : '+';
SUBTRACT : '-';
MULTIPLE : '*';
DIVIDE : '/';
PERCENT : '%';
EQUAL : '=';
MIDPAR : '<>';
MORETHAN : '>';
MOE : '>=';
LESSTHAN : '<';
LOE : '<=';
AND : '&&';
OR : '||';
EXCLAM : '!';
CAE : ':=';
LP : '(';
RP : ')';

WHITESPACE :(([ \t]+)|('\r'?'\n')) -> skip;
COMMENT : '//'(.*?)('\r'?'\n') -> skip;
