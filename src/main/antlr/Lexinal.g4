grammar Lexinal;

// --program
program
	: 'start' block 'end'
	;

// --block
block
	: '{' command+ '}'
	;

// --commands
command
	: (if_expr|while_expr|for_enhanced|for_loop|print|assignment_expr)
	;

// --assignments
assignment_expr
	: 'int' IDENTIFIER (EQUALS_TO num_expr)?              # integerAssignment
	| 'int' IDENTIFIER EQUALS_TO ternary_expr             # integerAssignment
	| 'boolean' IDENTIFIER (EQUALS_TO bool_expr)?         # booleanAssignment
	| 'boolean' IDENTIFIER (EQUALS_TO ternary_expr)?      # booleanAssignment
	| 'string' IDENTIFIER (EQUALS_TO VALID_STRING)?       # stringAssignment
	| 'string' IDENTIFIER (EQUALS_TO ternary_expr)?       # stringAssignment
	| IDENTIFIER EQUALS_TO num_expr                       # integerAssignment
	| IDENTIFIER EQUALS_TO bool_expr                      # booleanAssignment
    ;

// --expressions
exprs
    : num_expr
    | bool_expr
    ;

// --boolean expressions
bool_expr
    : bool_expr op=(AND|OR|IS_EQUL_TO|NOT_EQUL_TO) bool_expr  # booleanLogicalExpression
    | comp_expr                                               # booleanComparisonExpression
    | '(' bool_expr ')'                                       # booleanExpressionInBrackets
    | BOOLEAN										          # primitiveBooleanValuesOnly
    | IDENTIFIER										      # booleanIdentifierOnlyExpression
    ;

// --comparison expressions
comp_expr
    : num_expr op=(GREATER_THAN|LESS_THAN|MORE_THAN_OR_EQUL|LESS_THAN_OR_EQUL|IS_EQUL_TO|NOT_EQUL_TO) num_expr  # numberComparisonExpression
    ;

// --arithmetic expressions
num_expr
    : num_expr op=(ADD|SUB|MUL|DIV) num_expr            # numberMultiplyDivideExpression
    | '(' num_expr ')'                                  # numberBracketsExpression
    | SUB? DIGITS                                       # numberOnly
    | SUB? IDENTIFIER                                   # numberIdentifierOnly
    ;

// --conditional expression
cond_expr
    : '(' bool_expr ')'
    ;

// --if expression
if_expr
    : 'if' cond_expr block (else_if_expr)* (else_expr)? 'end-if'
    ;

// --else if (condition) expression
else_if_expr
    : 'elseIf' cond_expr block 'end-elseIf'
    ;

// --else expression
else_expr
    : 'else' block 'end-else'
    ;

// --while(condition) expression
while_expr
    : 'while' cond_expr block 'end-while'
    ;
// --for loop

for_enhanced
    : 'for' IDENTIFIER 'in' 'range' '(' rangeVal ';' rangeVal ')' block 'end-for'
    ;

rangeVal
	: IDENTIFIER
	| DIGITS
	;

for_loop
    : 'for' '(' assignment_expr ';' bool_expr ';' variable_change_part ')' block 'end-for'
    ;

variable_change_part : increment_expression
                        | decrement_expression
                        |IDENTIFIER EQUALS_TO num_expr;

decrement_expression : IDENTIFIER '--'
                       | '--' IDENTIFIER;


increment_expression : IDENTIFIER '++'
                       | '++' IDENTIFIER;

ternary_expr
    : cond_expr '?' exprs ':' exprs
    | cond_expr '?' BOOLEAN ':' BOOLEAN
    | cond_expr '?' VALID_STRING ':' VALID_STRING
    ;

// --print statement
print
    : 'print' '(' (DIGITS|BOOLEAN|IDENTIFIER|num_expr|bool_expr|VALID_STRING) ')'
    | 'print' '(' VALID_STRING ',' (IDENTIFIER|BOOLEAN|VALID_STRING|DIGITS) ')'
    ;

// --numbers > 0.
DIGITS
	: [1-9] [0-9]*
	| '0'
	;

// --Boolean value as true or false.
BOOLEAN
	: 'true'
	| 'false'
	;

// --operators
ADD               : '+';
SUB               : '-';
MUL               : '*';
DIV               : '/';
AND               : 'and';
OR                : 'or';
LESS_THAN         : '<';
GREATER_THAN      : '>';
LESS_THAN_OR_EQUL : '<=';
MORE_THAN_OR_EQUL : '>=';
NOT_EQUL_TO       : 'not';
IS_EQUL_TO        : '==';

// --lower case and upper case letters.
IDENTIFIER
	: [a-zA-Z_] [a-zA-Z_0-9]*
	;

// --valid Strings
VALID_STRING
    : ':' [a-zA-Z0-9_]* ':'
    ;

// --assignment operator
EQUALS_TO   : '=';

// --defining whitespaces
WHITE_SPACES    : [ \t\r\n]+ -> skip; // skip spaces, tabs and newline

// --comment syntax
Comment : ('#' ~[\r\n]* | '/#' .*? '#/') -> skip;