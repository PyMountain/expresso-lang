grammar expresso;

//START OF FILE
start: (func_def | class_def)*;


//FUNCTION
func_def: 'def' ID '(' args* ')' stmts;

func_call: ID '.' ID '(' args* ')'
         | ID '(' args* ')'
         ;


//CLASS
class_def: 'class' ID '('args*')' class_stmts;

class_stmt: ass ';'
          | func_def
          ;

class_stmts: '{' class_stmt* '}'
           | '{' '}'
           |
           ;

class_inst: 'new' ID '(' args* ')';


//STATEMENTS
stmt: ass ';'
    | func_call ';'
    | switch_stmt
    | while_stmt
    | for_stmt
    | if_stmt
    | 'return' exp ';'
    ;

stmts: '{' stmt* '}'
     | '{' '}'
     | 
     ;


//VARIABLE ASSIGNMENTS
ass: ID '=' (exp | class_inst | func_call);


//EXPRESSIONS
exp: exp '*' exp
   | exp '/' exp
   | exp '%' exp
   | exp '+' exp
   | exp '-' exp
   | exp '>' exp
   | exp '<' exp
   | exp '<=' exp
   | exp '>=' exp
   | exp '==' exp
   | '(' exp ')'
   | atm
   ;


//IF STATEMENT
if_stmt: 'if' cond=exp then=stmts ('else' otherwise=stmts)?;


//WHILE STATEMENT
while_stmt: 'while' cond=exp stmts;


//FOR STATEMENT
for_stmt: 'for' '(' ass ';' for_condition ';' for_iteration ')' stmts;

for_condition: for_condition '>' for_condition
             | for_condition '<' for_condition
             | for_condition '<=' for_condition
             | for_condition '>=' for_condition
             | for_condition '==' for_condition
             | '(' for_condition ')'
             | atm
             ;

for_iteration: for_iteration '*' for_iteration
             | for_iteration '/' for_iteration
             | for_iteration '%' for_iteration
             | for_iteration '+' for_iteration
             | for_iteration '-' for_iteration
             | '(' for_iteration ')'
             | atm
             ;


//SWITCH STAMENT
switch_stmt: 'switch'  '(' exp ')' '{' case_stmt*  ('default' ':' stmts )? '}';

case_stmt: 'case' exp ':' case_stmts;

case_stmts: '{' stmt* break_stmt'}'
          | stmts
          ;

break_stmt: 'break' ';' 
          |
          ;
    

//ATOMIC DEFINITIONS
atm : ID
    | INT
    | FLOAT
    | STRING
    | BOOLEAN
    ;


//ARGUMENTS
args: exp (',' exp)*;


//TYPES AND OTHERS
INPUT: 'input';
ID : [a-zA-Z][a-zA-Z0-9]*;
INT : '-'?[0-9]+;
FLOAT : '-'?[0-9]+'.'[0-9]+;
STRING : '"'[a-zA-Z0-9 ]*'"';
BOOLEAN: 'true' | 'false';
WS: [ \r\t\n] -> skip;