// The grammar for Rose language
grammar Rose;

// Parser rules
program : PROCEDURE ID IS DECLARE variables BEGIN statements END SEMICOLON;
variables : variable variable |;
variable : ID COLON INTEGER SEMICOLON;
statements : statement statements |;
statement : assignment_statement | if_statement | for_statement | exit_statement | read_statement | write_statement;
assignment_statement : ID CAE arith_expression;
if_statement : IF bool_expression THEN statements if_statement_pram END IF SEMICOLON;
if_statement_pram : ELSE statements |;
for_statement : FOR ID IN arith_expression DOT arith_expression LOOP statements END LOOP SEMICOLON;
exit_statement : EXIT SEMICOLON;
read_statement : READ ID SEMICOLON;
write_statement : WRITE arith_expression SEMICOLON;
bool_expression : bool_term bool_expression_pram;
bool_expression_pram : OR bool_term bool_expression_pram |;
bool_term : bool_factor bool_term_pram;
bool_term_pram : AND bool_factor bool_term_pram |;
bool_factor : EXCLAM bool_primary | bool_primary;
bool_primary : arith_expression relation_op arith_expression;
relation_op : EQUAL | LESSTHAN relation_op_a | MORETHAN relation_op_b;
relation_op_a : MORETHAN | EQUAL |;
relation_op_b : EQUAL |;
arith_expression : arith_term arith_expression_pram;
arith_expression_pram : ADD arith_term arith_expression_pram | SUBTRACT arith_term arith_expression_pram |;
arith_term : arith_factor arith_term_pram;
arith_term_pram : MULTIPLE arith_factor arith_term_pram | DIVIDE arith_factor arith_term_pram | PERCENT arith_factor arith_term_pram |;
arith_factor : SUBTRACT arith_primary | arith_primary;
arith_primary : CONST | ID | LP arith_expression RP;

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
COMMENT:'//'~[\r\n]* -> skip;
