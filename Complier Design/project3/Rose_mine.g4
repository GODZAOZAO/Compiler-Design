// The grammar for Rose language
grammar Rose;

/* Parser rules origin
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
arith_primary : CONST | ID | LP arith_expression RP;*/

// Parser rules
program: 
		PROCEDURE ID IS DECLARE {System.out.println("# variables\n\t.data");}
		variables BEGIN			{System.out.println("# begin function\n\t.text\nmain:");}
		statements[0, 0]
		END SEMICOLON			{System.out.println("# end function");};
		
variables: 
		variable variables|;
			
variable: 
		ID COLON INTEGER SEMICOLON	{System.out.println($ID.text + ":\t.word  0");};
			
statements [int reg, int label] returns [int nreg, int nlabel]:
		statement[$reg, $label] 
		statements[$statement.nreg, $statement.nlabel]	{$nreg = $statements.nreg;}
														{$nlabel = $statements.nlabel;}|
														{$nreg = $reg;}
														{$nlabel = $label;};
			
statement [int reg, int label] returns [int nreg, int nlabel]:
		assignment_statement[$reg]		{$nreg = $reg;}{$nlabel = $label;}							
		| if_statement[$reg, $label]	{$nreg = $if_statement.nreg;}{$nlabel = $if_statement.nlabel;}								
		| for_statement[$reg, $label]	{$nreg = $for_statement.nreg;}{$nlabel = $for_statement.nlabel;}
		| exit_statement				{$nreg = $reg;}{$nlabel = $label;}
		| read_statement[$reg]			{$nreg = $reg;}{$nlabel = $label;}
		| write_statement[$reg]			{$nreg = $reg;}{$nlabel = $label;};
			
assignment_statement [int reg]: 
		ID CAE arith_expression[$reg]	{System.out.println("\tla\t\$t" + $arith_expression.nreg + ", " + $ID.text);}
										{System.out.println("\tsw\t\$t" + $arith_expression.place + ", 0(\$t" + $arith_expression.nreg + ")");}
		SEMICOLON;

if_statement [int reg, int label] returns [int nreg, int nlabel]:
		IF	{System.out.println("# if");}
		bool_expression[$reg, $label, $label + 1, $label + 3] THEN	{System.out.println("L" + $label + ":\t# then");}
		statements[$bool_expression.nreg, $bool_expression.nlabel]
		if_statement_pram[$label + 1, $label + 2, $statements.nreg, $statements.nlabel]
		END IF SEMICOLON	{$nreg = $if_statement_pram.nreg;}
							{$nlabel = $if_statement_pram.nlabel;}
							{System.out.println("L" + $if_statement_pram.if_next + ":\t# end if");};

if_statement_pram [int false_label, int Lnext, int reg, int label] returns [int nreg, int nlabel, if_next]:
		ELSE 						{System.out.println("\tb\tL" + $Lnext);}
									{System.out.println("L" + $false_label + ":\t# else");}
		statements[$reg, $label]	{$nreg = $statements.nreg;}
									{$nlabel = $statements.nlabel;}
									{$if_next = $Lnext;}|
									{$nreg = $reg;}
									{$nlabel = $label;}
									{$if_next = $false_label};
					
for_statement [int reg, int label] returns [int nreg, int nlabel]:
		FOR ID IN arith_a=arith_expression[$reg]		{System.out.println("\tla\t\$t" + $arith_a.nreg + ", " + $ID.text);}
													{System.out.println("\tsw\t\$t" + $arith_a.place + ", 0(\$t" + $arith_a.nreg + ")");}
													{System.out.println("L" + $label + ":\t# for");}
													{System.out.println("\tla\t\$t" + $reg + ", " + $ID.text);}
													{System.out.println("\tlw\t\$t" + $reg + ", 0(\$t" + $reg + ")");}
		DOT arith_b=arith_expression[$reg + 1] LOOP	{System.out.println("\tble\t\$t" + $reg + ", \$t" + $arith_b.place + ", L" + ($label + 1));}
													{System.out.println("\tb\tL" + ($label + 2));}
													{System.out.println("L" + ($label + 1) + ":\t# for body");}
		statements[$reg, $label + 3]				{System.out.println("\tla\t\$t" + $statements.nreg + ", " + $ID.text);}
													{System.out.println("\tlw\t\$t" + $statements.nreg + ", 0(\$t" + $statements.nreg + ")");}
													{System.out.println("\tli\t\$t" + ($statements.nreg + 1) + ", 1");}
													{System.out.println("\tadd\t\$t" + $statements.nreg + ", \$t" + $statements.nreg + ", \$t" + ($statements.nreg + 1));} // ID = ID + 1
													{System.out.println("\tla\t\$t" + ($statements.nreg + 1) + ", " + $ID.text);}
													{System.out.println("\tsw\t\$t" + $statements.nreg + ", 0(\$t" + ($statements.nreg + 1) + ")");}
													{System.out.println("\tb\tL" + $label);}
		END LOOP SEMICOLON							{System.out.println("L" + ($label + 2) + ":\t# end for");}
													{$nreg = $reg;}
													{$nlabel = $statements.nlabel;};

exit_statement:
		EXIT SEMICOLON	{System.out.println("\tli\t\$v0, 10\n\tsyscall");};

read_statement [int reg]: 
		READ ID SEMICOLON	{System.out.println("\tli\t\$v0, 5\n\tsyscall\n\tla\t\$t" + $reg + ", " + $ID.text + "\n\tsw\t\$v0, 0(\$t" + $reg + ")");};

write_statement [int reg]:
		WRITE arith_expression[$reg] SEMICOLON	{System.out.println("\tmove\t\$a0, \$t" + $arith_expression.place + "\n\tli\t\$v0, 1\n\tsyscall");};

bool_expression [int reg, int true_label ,int false_label, int label] returns [int nreg, int nlabel]:
		{System.out.println("L" + $label + ":");}
		bool_term[$reg, $true_label ,$false_label, $label + 1] 
		bool_expression_pram[$bool_term.nreg, $true_label, $false_label, $label + 1]
		{$nreg = $bool_expression_pram.nreg;}
		{$nlabel = $bool_expression_pram.nlabel;};

bool_expression_pram [int reg, int true_label, int false_label, int label] returns [int nreg, int nlabel]:
		OR	{System.out.println("L" + $label + ":");}
		bool_term[$reg, $true_label, $false_label, $label + 1] 
		bool_expression_pram[$bool_term.nreg, $true_label ,$false_label, $label + 1]
		{$nreg = $bool_expression_pram.nreg;}
		{$nlabel = $bool_expression_pram.nlabel;}|
		{System.out.println("L" + $label + ":");}
		{System.out.println("\tb\tL" + $false_label);}
		{$nreg = $reg;}
		{$nlabel = $label + 1;};

bool_term [int reg, int true_label, int false_label, int nlabel] returns [int nreg]:
		bool_factor[$reg, $true_label, $false_label, $nlabel] 
		bool_term_pram[$bool_factor.nreg, $true_label, $false_label, $nlabel]
		{System.out.println("\tb\tL" + $true_label);}
		{$nreg = $bool_term_pram.nreg;};

bool_term_pram [int reg, int true_label, int false_label, int nlabel] returns [int nreg]:
		AND bool_factor[$reg, $true_label, $false_label, $nlabel] bool_term_pram[$bool_factor.nreg, $true_label, $false_label, $nlabel]|;
				
bool_factor [int reg, int true_label, int false_label, int nlabel] returns [int nreg]:
		EXCLAM bool_primary[$reg, $true_label, $false_label, $nlabel, 1]
		{$nreg = $bool_primary.nreg;}|
		bool_primary[$reg, $true_label, $false_label, $nlabel, 0]
		{$nreg = $bool_primary.nreg;};
			
bool_primary [int reg, int true_label, int false_label, int nlabel, int flag] returns [int nreg]:
		arEx=arith_expression[$reg] relation_op arith_expression[$arEx.nreg]{
			if(flag == 0){
				switch($relation_op.related_int){
					case 0:
						System.out.println("\tbne\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);	break;
					case 1:
						System.out.println("\tbge\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);	break;
					case 2:
						System.out.println("\tble\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);	break;
					case 3:
						System.out.println("\tbeq\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);	break;
					case 4:
						System.out.println("\tbgt\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);	break;
					case 5:
						System.out.println("\tblt\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);	break;
				}
			}
			else{
				switch($relation_op.related_int){
					case 0:
						System.out.println("\tbeq\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);	break;
					case 1:
						System.out.println("\tblt\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);	break;
					case 2:
						System.out.println("\tbgt\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);	break;
					case 3:
						System.out.println("\tbne\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);	break;
					case 4:
						System.out.println("\tble\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);	break;
					case 5:
						System.out.println("\tbge\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);	break;
				}
			}
		}
		{$nreg = $reg;};

relation_op returns [int related_int]: 
		EQUAL 					{$related_int = 0;}|
		LESSTHAN relation_op_a	{$related_int = 1 + $relation_op_a.related_int;}|
		MORETHAN relation_op_b	{$related_int = 2 + $relation_op_b.related_int;};
			
relation_op_a returns [int related_int]:
		MORETHAN	{$related_int = 2;}|
		EQUAL		{$related_int = 3;}|
					{$related_int = 0;};
					
relation_op_b returns [int related_int]: 
		EQUAL		{$related_int = 3;}|
					{$related_int = 0;};
					
arith_expression [int reg] returns [int nreg, int place]:
		arith_term[$reg] 
		arith_expression_pram[$arith_term.nreg, $arith_term.place]
		{$nreg = $arith_term.nreg;}
		{$place = $arith_term.place;};
		
arith_expression_pram [int reg, int place] returns [int nreg]:
		ADD arith_term[$reg]		{System.out.println("\tadd\t\$t" + $place + ", \$t" + $place + ", \$t" + $arith_term.place);}
		arith_expression_pram[$reg, $place]	{$nreg = $reg;}|
		SUBTRACT arith_term[$reg]	{System.out.println("\tsub\t\$t" + $place + ", \$t" + $place + ", \$t" + $arith_term.place);}
		arith_expression_pram[$reg, $place]	{$nreg = $reg;}|
		{$nreg = $reg;};
						
arith_term [int reg] returns [int nreg, int place]:
		arith_factor[$reg]
		arith_term_pram[$arith_factor.nreg, $arith_factor.place]
		{$nreg = $arith_factor.nreg;}
		{$place = $arith_factor.place;};
		
arith_term_pram [int reg, int place] returns [int nreg]:
		MULTIPLE arith_factor[$reg]		{System.out.println("\tmul\t\$t" + $place + ", \$t" + $place + ", \$t" + $arith_factor.place);}
		arith_term_pram[$reg, $place]	{$nreg = $reg;}|
		DIVIDE arith_factor[$reg]		{System.out.println("\tdiv\t\$t" + $place + ", \$t" + $place + ", \$t" + $arith_factor.place);}
		arith_term_pram[$reg, $place]	{$nreg = $reg;}|
		PERCENT arith_factor[$reg]		{System.out.println("\trem\t\$t" + $place + ", \$t" + $place + ", \$t" + $arith_factor.place);}
		arith_term_pram[$reg, $place]	{$nreg = $reg;}|
										{$nreg = $reg;};
					
arith_factor [int reg] returns [int nreg, int place]:
		SUBTRACT arith_primary[$reg]	{System.out.println("\tneg\t\$t" + $arith_primary.place + ", \$t" + $arith_primary.place);}
										{$nreg = $arith_primary.nreg;}
										{$place = $arith_primary.place;}|
		arith_primary[$reg]				{$nreg = $arith_primary.nreg;}
										{$place = $arith_primary.place;};
				
arith_primary [int reg] returns [int nreg, int place]:
		CONST							{System.out.println("\tli\t\$t" + $reg + ", " + $CONST.text);}
										{$nreg = $reg + 1;}
										{$place = $reg;}|
		ID								{System.out.println("\tla\t\$t" + $reg + ", " + $ID.text +"\n\tlw\t\$t" + $reg + ", 0(\$t" + $reg + ")");}
										{$nreg = $reg + 1;}
										{$place = $reg;}|
		LP arith_expression[$reg] RP	{$nreg = $arith_expression.nreg;}
										{$place = $arith_expression.place;};
				

// Lexer rules
ID : [_A-Z]([_A-Z] | [0-9])*;
CONST : ('0'+) | ('-'?[1-9][0-9]*);
BEGIN:'begin';
DECLARE:'declare';
ELSE:'else';
END:'end';
EXIT:'exit';
FOR:'for';
IF:'if';
IN:'in';
INTEGER:'integer';
IS:'is';
LOOP:'loop';
PROCEDURE:'procedure';
READ:'read';
THEN:'then';
WRITE:'write';
COLON:':';
DOT:'..';
SEMICOLON:';';
ADD:'+';
SUBTRACT:'-';
MULTIPLE:'*';
DIVIDE:'/';
PERCENT:'%';
EQUAL:'=';
MORETHAN:'>';
LESSTHAN:'<';
AND:'&&';
OR:'||';
EXCLAM:'!';
CAE:':=';
LP:'(';
RP:')';

WHITESPACE :(([ \t]+)|('\r'?'\n')) -> skip;
COMMENT:'//'(~[\r\n])* -> skip ;