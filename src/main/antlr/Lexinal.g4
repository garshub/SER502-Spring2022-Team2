grammar Lexinal;

// --program
program
	: block
	;

// --block
block
	: '{' command+ '}'
	;

// --commands
command
	: (if_expr|while_expr|print|expr)
	;

// --assihnments
expr
	: 'int' IDENTIFIER (EQUALS_TO num_expr)?              # integerAssignment
	| 'boolean' IDENTIFIER (EQUALS_TO bool_expr)?         # booleanAssignment
	| 'string' IDENTIFIER (EQUALS_TO VALID_STRING)?       # stringAssignment
	| IDENTIFIER EQUALS_TO num_expr                       # integerAssignment
	| IDENTIFIER EQUALS_TO bool_expr                      # booleanAssignment
    ;

// --boolean expressions
bool_expr
    : bool_expr op=(AND|OR) bool_expr                   # booleanLogicalExpression
    | bool_expr op=(IS_EQUL_TO|NOT_EQUL_TO) bool_expr   # booleanExpression
    | comp_expr                                         # booleanComparisonExpression
    | '(' bool_expr ')'                                 # booleanExpressionInBrackets
    | BOOLEAN										    # primitiveBooleanValuesOnly
    | IDENTIFIER										# booleanIdentifierOnlyExpression
    ;

// --comparison expressions
comp_expr
    : num_expr op=(GREATER_THAN|LESS_THAN|MORE_THAN_OR_EQUL|LESS_THAN_OR_EQUL|IS_EQUL_TO|NOT_EQUL_TO) num_expr  # numberComparisonExpression
    ;

// --arithmetic expressions
num_expr
    : num_expr op=(MUL|DIV) num_expr                    # numberMultiplyDivideExpression
    | num_expr op=(ADD|SUB) num_expr                    # numberAddSubExpression
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
    : 'elseIf' cond_expr block
    ;

// --else expression
else_expr
    : 'else' block
    ;

// --while(condition) expression
while_expr
    : 'while' cond_expr block 'end-while'
    ;

// --print statement
print
    : 'print' '(' (DIGITS|BOOLEAN|IDENTIFIER|num_expr|bool_expr|VALID_STRING) ')'
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

// Accepts lower case and upper case letters.
IDENTIFIER
	: [a-zA-Z_] [a-zA-Z_0-9]*
	;

//  Valid Strings
VALID_STRING
    : ':' [a-zA-Z0-9]* ':'
    ;

EQUALS_TO   : '=';

WHITE_SPACES    : [ \t\r\n]+ -> skip; // skip spaces, tabs and newline
Comment : ('#' ~[\r\n]* | '/#' .*? '#/') -> skip;
