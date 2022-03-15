// The grammar for Rose language
grammar Rose;

// Parser rules
program: 
		PROCEDURE ID IS DECLARE 
		{System.out.println("# variables\n\t.data");}
		variables BEGIN
		{System.out.println("# begin function\n\t.text\nmain:");}
		statements[0, 0] END SEMICOLON
		{System.out.println("# end function");};
		
variables: 
		variable variables
		|;
			
variable: 
		ID COLON INTEGER SEMICOLON
		{System.out.println($ID.text + ":\t.word  0");};
			
statements [int reg, int label] returns [int nreg, int nlabel]:
		statement[$reg, $label] statements[$statement.nreg, $statement.nlabel]
		{$nreg = $statements.nreg;}
		{$nlabel = $statements.nlabel;}
		|
		{$nreg = $reg;}
		{$nlabel = $label;};
			
statement [int reg, int label] returns [int nreg, int nlabel]:
		assignment_statement[$reg]
		{$nreg = $reg;}
		{$nlabel = $label;}
		| if_statement[$reg, $label]
		{$nreg = $if_statement.nreg;}
		{$nlabel = $if_statement.nlabel;}
		| for_statement[$reg, $label]
		{$nreg = $for_statement.nreg;}
		{$nlabel = $for_statement.nlabel;}
		| exit_statement
		{$nreg = $reg;}
		{$nlabel = $label;}
		| read_statement[$reg]
		{$nreg = $reg;}
		{$nlabel = $label;}
		| write_statement[$reg]
		{$nreg = $reg;}
		{$nlabel = $label;};
			
assignment_statement [int reg]: 
		ID COLONEQUAL arith_expression[$reg]
		{System.out.println("\tla\t\$t" + $arith_expression.nreg + ", " + $ID.text);}
		{System.out.println("\tsw\t\$t" + $arith_expression.place + ", 0(\$t" + $arith_expression.nreg + ")");}
		SEMICOLON;

if_statement [int reg, int label] returns [int nreg, int nlabel]:
		IF
		{System.out.println("# if");}
		bool_expression[$reg, $label, $label + 1, $label + 3] THEN // give the trueL($label) and the falseL label number($label+1) to bool_expression
		{System.out.println("L" + $label + ":\t# then");} // if trueL
		statements[$bool_expression.nreg, $bool_expression.nlabel] if_statement_alpha[$label + 1, $label + 2, $statements.nreg, $statements.nlabel] END IF SEMICOLON
		{$nreg = $if_statement_alpha.nreg;}
		{$nlabel = $if_statement_alpha.nlabel;}
		{System.out.println("L" + ($label + 2) + ":\t# end if");}; // Lnext

if_statement_alpha [int falseL, int Lnext, int reg, int label] returns [int nreg, int nlabel]:
		ELSE 
		{System.out.println("\tb\tL" + $Lnext);}
		{System.out.println("L" + $falseL + ":\t# else");}
		statements[$reg, $label]
		{$nreg = $statements.nreg;}
		{$nlabel = $statements.nlabel;}
		|
		{$nreg = $reg;}
		{$nlabel = $label;};


					
for_statement [int reg, int label] returns [int nreg, int nlabel]:
		FOR ID IN arEx1=arith_expression[$reg]
		{System.out.println("\tla\t\$t" + $arEx1.nreg + ", " + $ID.text);}
		{System.out.println("\tsw\t\$t" + $arEx1.place + ", 0(\$t" + $arEx1.nreg + ")");}
		{System.out.println("L" + $label + ":\t# for");}
		{System.out.println("\tla\t\$t" + $reg + ", " + $ID.text);}
		{System.out.println("\tlw\t\$t" + $reg + ", 0(\$t" + $reg + ")");}
		TWOPERIOD arEx2=arith_expression[$reg + 1] LOOP
		{System.out.println("\tble\t\$t" + $reg + ", \$t" + $arEx2.place + ", L" + ($label + 1));}
		{System.out.println("\tb\tL" + ($label + 2));}
		{System.out.println("L" + ($label + 1) + ":\t# for body");}
		statements[$reg, $label + 3]
		{System.out.println("\tla\t\$t" + $statements.nreg + ", " + $ID.text);}
		{System.out.println("\tlw\t\$t" + $statements.nreg + ", 0(\$t" + $statements.nreg + ")");}
		{System.out.println("\tli\t\$t" + ($statements.nreg + 1) + ", 1");}
		{System.out.println("\tadd\t\$t" + $statements.nreg + ", \$t" + $statements.nreg + ", \$t" + ($statements.nreg + 1));} // ID = ID + 1
		{System.out.println("\tla\t\$t" + ($statements.nreg + 1) + ", " + $ID.text);}
		{System.out.println("\tsw\t\$t" + $statements.nreg + ", 0(\$t" + ($statements.nreg + 1) + ")");}
		{System.out.println("\tb\tL" + $label);}
		END LOOP SEMICOLON
		{System.out.println("L" + ($label + 2) + ":\t# end for");}
		{$nreg = $reg;}
		{$nlabel = $statements.nlabel;};

exit_statement:
		EXIT SEMICOLON
		{System.out.println("\tli\t\$v0, 10\n\tsyscall");};

read_statement [int reg]: 
		READ ID SEMICOLON
		{System.out.println("\tli\t\$v0, 5\n\tsyscall\n\tla\t\$t" + $reg + ", " + $ID.text + "\n\tsw\t\$v0, 0(\$t" + $reg + ")");};

write_statement [int reg]:
		WRITE arith_expression[$reg] SEMICOLON
		{System.out.println("\tmove\t\$a0, \$t" + $arith_expression.place + "\n\tli\t\$v0, 1\n\tsyscall");};

bool_expression [int reg, int trueL ,int falseL, int label] returns [int nreg, int nlabel]:
		{System.out.println("L" + $label + ":");}
		bool_term[$reg, $trueL ,$falseL, $label + 1] bool_expression_alpha[$bool_term.nreg, $trueL, $falseL, $label + 1]
		{$nreg = $bool_expression_alpha.nreg;}
		{$nlabel = $bool_expression_alpha.nlabel;};

bool_expression_alpha [int reg, int trueL, int falseL, int label] returns [int nreg, int nlabel]:
		PARALLEL
		{System.out.println("L" + $label + ":");}
		bool_term[$reg, $trueL, $falseL, $label + 1] bool_expression_alpha[$bool_term.nreg, $trueL ,$falseL, $label + 1]
		{$nreg = $bool_expression_alpha.nreg;}
		{$nlabel = $bool_expression_alpha.nlabel;}
		|
		{System.out.println("L" + $label + ":");}
		{System.out.println("\tb\tL" + $falseL);}
		{$nreg = $reg;}
		{$nlabel = $label + 1;};

bool_term [int reg, int trueL, int falseL, int nlabel] returns [int nreg]:
		bool_factor[$reg, $trueL, $falseL, $nlabel] bool_term_alpha[$bool_factor.nreg, $trueL, $falseL, $nlabel]
		{System.out.println("\tb\tL" + $trueL);}
		{$nreg = $bool_term_alpha.nreg;};

bool_term_alpha [int reg, int trueL, int falseL, int nlabel] returns [int nreg]:
		AND bool_factor[$reg, $trueL, $falseL, $nlabel] bool_term_alpha[$bool_factor.nreg, $trueL, $falseL, $nlabel]
		|;
				
bool_factor [int reg, int trueL, int falseL, int nlabel] returns [int nreg]:
		NOT bool_primary[$reg, $trueL, $falseL, $nlabel, 1]
		{$nreg = $bool_primary.nreg;}
		| bool_primary[$reg, $trueL, $falseL, $nlabel, 0]
		{$nreg = $bool_primary.nreg;};
			
bool_primary [int reg, int trueL, int falseL, int nlabel, int not] returns [int nreg]:
		arEx=arith_expression[$reg] relation_op arith_expression[$arEx.nreg]
		{
			if(not == 0)
			{
				switch($relation_op.relationCase)
				{
					case 0:
						System.out.println("\tbne\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);
						break;
					case 1:
						System.out.println("\tbge\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);
						break;
					case 2:
						System.out.println("\tble\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);
						break;
					case 3:
						System.out.println("\tbeq\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);
						break;
					case 4:
						System.out.println("\tbgt\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);
						break;
					case 5:
						System.out.println("\tblt\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);
						break;
				}
			}
			else
			{
				switch($relation_op.relationCase)
				{
					case 0:
						System.out.println("\tbeq\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);
						break;
					case 1:
						System.out.println("\tblt\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);
						break;
					case 2:
						System.out.println("\tbgt\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);
						break;
					case 3:
						System.out.println("\tbne\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);
						break;
					case 4:
						System.out.println("\tble\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);
						break;
					case 5:
						System.out.println("\tbge\t\$t" + $arEx.place + ", \$t" + $arith_expression.place + ", L" + $nlabel);
						break;
				}
			}
		}
		{$nreg = $reg;};

relation_op returns [int relationCase]: 
		EQUAL 
		{$relationCase = 0;}
		| LESS relation_op_alpha
		{$relationCase = 1 + $relation_op_alpha.relationCase;}
		| MYMORE relation_op_beta
		{$relationCase = 2 + $relation_op_beta.relationCase;};
			
relation_op_alpha returns [int relationCase]:
		MYMORE
		{$relationCase = 2;}
		| EQUAL
		{$relationCase = 3;}
		|
		{$relationCase = 0;};
					
relation_op_beta returns [int relationCase]: 
		EQUAL
		{$relationCase = 3;}
		|
		{$relationCase = 0;};
					
arith_expression [int reg] returns [int nreg, int place]:
		arith_term[$reg] arith_expression_alpha[$arith_term.nreg, $arith_term.place]
		{$nreg = $arith_term.nreg;}
		{$place = $arith_term.place;};
		
arith_expression_alpha [int reg, int place] returns [int nreg]:
		ADD arith_term[$reg]
		{System.out.println("\tadd\t\$t" + $place + ", \$t" + $place + ", \$t" + $arith_term.place);}
		arith_expression_alpha[$reg, $place]
		{$nreg = $reg;}
		| SUBTRACT arith_term[$reg]
		{System.out.println("\tsub\t\$t" + $place + ", \$t" + $place + ", \$t" + $arith_term.place);}
		arith_expression_alpha[$reg, $place]
		{$nreg = $reg;}
		|
		{$nreg = $reg;};
						
arith_term [int reg] returns [int nreg, int place]:
		arith_factor[$reg] arith_term_alpha[$arith_factor.nreg, $arith_factor.place]
		{$nreg = $arith_factor.nreg;}
		{$place = $arith_factor.place;};
		
arith_term_alpha [int reg, int place] returns [int nreg]:
		MULTIPLY arith_factor[$reg]
		{System.out.println("\tmul\t\$t" + $place + ", \$t" + $place + ", \$t" + $arith_factor.place);}
		arith_term_alpha[$reg, $place]
		{$nreg = $reg;}
		| DIVIDE arith_factor[$reg]
		{System.out.println("\tdiv\t\$t" + $place + ", \$t" + $place + ", \$t" + $arith_factor.place);}
		arith_term_alpha[$reg, $place]
		{$nreg = $reg;}
		| PERCENT arith_factor[$reg]
		{System.out.println("\trem\t\$t" + $place + ", \$t" + $place + ", \$t" + $arith_factor.place);}
		arith_term_alpha[$reg, $place]
		{$nreg = $reg;}
		|
		{$nreg = $reg;};
					
arith_factor [int reg] returns [int nreg, int place]:
		SUBTRACT arith_primary[$reg]
		{System.out.println("\tneg\t\$t" + $arith_primary.place + ", \$t" + $arith_primary.place);}
		{$nreg = $arith_primary.nreg;}
		{$place = $arith_primary.place;}
		| arith_primary[$reg]
		{$nreg = $arith_primary.nreg;}
		{$place = $arith_primary.place;};
				
arith_primary [int reg] returns [int nreg, int place]:
		CONST
		{System.out.println("\tli\t\$t" + $reg + ", " + $CONST.text);}
		{$nreg = $reg + 1;}
		{$place = $reg;}
		| ID
		{System.out.println("\tla\t\$t" + $reg + ", " + $ID.text +"\n\tlw\t\$t" + $reg + ", 0(\$t" + $reg + ")");}
		{$nreg = $reg + 1;}
		{$place = $reg;}
		| OPENPAREN arith_expression[$reg] CLOSEPAREN
		{$nreg = $arith_expression.nreg;}
		{$place = $arith_expression.place;};
				

// Lexer rules 
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
TWOPERIOD:'..';
SEMICOLON:';';
ADD:'+';
SUBTRACT:'-';
MULTIPLY:'*';
DIVIDE:'/';
PERCENT:'%';
EQUAL:'=';
MYMORE:'>';
LESS:'<';
AND:'&&';
PARALLEL:'||';
NOT:'!';
COLONEQUAL:':=';
OPENPAREN:'(';
CLOSEPAREN:')';

ID:[_A-Z][_A-Z0-9]*;
CONST:'0'+|[1-9][0-9]*;
WHITESPACE:[ \t\r\n] -> skip ;
COMMENT:'//'(~[\r\n])* -> skip ;