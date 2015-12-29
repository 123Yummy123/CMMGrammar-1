grammar CMM_BXJ;

input
    :   stat*;

stat_block
    :   LEFT_CURLY stat* RIGHT_CURLY
    |   stat
    ;

stat
    :   assign_stat SEMICOLON
    |   read_stat SEMICOLON
    |   write_stat SEMICOLON
    |   if_stat
    |   while_stat
    |   declare_stat SEMICOLON
    |   declare_assign_stat SEMICOLON
    |   break_stat SEMICOLON
    |   cont_stat SEMICOLON
    |   other_stat SEMICOLON
    ;

declare_stat:   type (ID|array_id) (COMMA(ID|array_id))*;
assign_stat
    :   (ID|array_id) EQUAL (expr|array_expr)
    ;
declare_assign_stat
    :   type ID (EQUAL expr)? (COMMA ID (EQUAL expr)?)*
    |   type array_id (EQUAL array_expr)? (COMMA array_id (EQUAL array_expr)?)*
    ;
read_stat:      READ LEFT_PAREN (ID|array_id) RIGHT_PAREN;
write_stat:     WRITE LEFT_PAREN expr (COMMA expr)* RIGHT_PAREN;
if_stat
    :   IF LEFT_PAREN bool_expr RIGHT_PAREN stat_block (ELSEIF LEFT_PAREN bool_expr RIGHT_PAREN stat_block)*(ELSE stat_block)?
    ;
while_stat
    :   WHILE LEFT_PAREN expr RIGHT_PAREN stat_block;
break_stat:     BREAK;
cont_stat:      CONTINUE;
other_stat:     (ID|array_id) ( PP | MM );


expr
    :   int_expr
    |   double_expr
    |   bool_expr
    |   char_expr
    ;

array_expr
    :   int_array_expr
    |   double_array_expr
    |   char_array_expr
    |   bool_array_expr
    ;

int_array_expr      //to initiate a int array
    :   LEFT_CURLY INT (COMMA INT)* RIGHT_CURLY
    ;

double_array_expr
    :   LEFT_CURLY (INT|DOUBLE) (COMMA (INT|DOUBLE))* RIGHT_CURLY
    ;

char_array_expr
    :   LEFT_CURLY CHAR (COMMA CHAR)* RIGHT_CURLY
    |    QUOTE   ( ESCAPED_QUOTE | NO_ENTER )*?  QUOTE
    ;

bool_array_expr
    :   LEFT_CURLY BOOL (COMMA BOOL)* RIGHT_CURLY
    ;

int_expr    returns [int value]   //expression that return integer
    :   LEFT_PAREN int_expr RIGHT_PAREN
    |   MINUS int_expr        //negative sign
    |   int_expr op=NUM_OP int_expr
    |   int_expr op=(PLUS|MINUS|MM) int_expr
    |   INT
    |   array_id
    |   ID
    ;

double_expr     returns [double value]     //expression that return double
    :   LEFT_PAREN double_expr RIGHT_PAREN
    |   MINUS double_expr
    |   int_expr op=NUM_OP int_expr
    |   int_expr op=(PLUS|MINUS|MM) int_expr
    |   //double_expr  MM  double_expr  //特殊情况，得到类似5--1这样的输入，与自减--冲突
    |   INT
    |   DOUBLE
    |   array_id
    |   ID
    ;

bool_expr       returns [boolean value]       //expression that return true or false
    :   LEFT_PAREN bool_expr RIGHT_PAREN
    |    LOGIC_NOT   bool_expr
    |   bool_expr BOOL_OP bool_expr
    |   int_expr COMPARE_OP int_expr
    |   double_expr COMPARE_OP double_expr
    |   int_expr COMPARE_OP double_expr
    |   double_expr COMPARE_OP int_expr
    |   BOOL
    |   array_id
    |   ID
    ;



char_expr       returns [char value]    //expression that return character
    :   CHAR
    |   array_id
    |   ID
    ;

type
    :   T_INT
    |   T_DOUBLE
    |   T_CHAR
    |   T_BOOL
    ;

array_id:   ID array_tail;
array_tail:    LEFT_BRACKET int_expr RIGHT_BRACKET ;

T_INT:  'int';
T_DOUBLE:   'double';
T_CHAR: 'char';
T_BOOL: 'bool';

IF
    :   'if' ;
ELSE
    :   'else' ;
ELSEIF
    :   'else if' ;
WHILE
    :   'while';
BREAK
    :   'break';
CONTINUE
    :   'continue';
READ
    :   'read';
WRITE
    :   'write';

BOOL
    :   'true'
    |   'false'
    ;


ID
    :   LETTER(LETTER|[0-9])*
    |   LETTER('_'|LETTER|[0-9])*(LETTER|[0-9])
    ;

NUM_OP
    :   ('*'|'/'|'%'|'\\');


PLUS:'+';
MINUS:'-';          //特殊情况：减号与负号冲突

COMPARE_OP
    :   ('<'|'>'|'<='|'>='|'!='|'==');

BOOL_OP
    :   ('&&'|'||');

CHAR
    :   '\'' ~('\n'|'\r' ) '\''
    ;


DOUBLE
    :   DECIMAL '.' [0-9]*
    ;


INT
    :   DECIMAL
    |   HEXADECIMAL
    ;

LEFT_CURLY:     '{';
RIGHT_CURLY:    '}';
LEFT_PAREN:     '(';
RIGHT_PAREN:    ')';
LEFT_BRACKET:   '[';
RIGHT_BRACKET:  ']';
EQUAL:          '=';
LOGIC_NOT:      '!';
COMMA:          ',';
SEMICOLON :     ';';
PP:             '++';
MM:             '--';
QUOTE:          '"';
ESCAPED_QUOTE:  '\\"';



fragment LETTER: [a-zA-Z] ;

fragment DECIMAL
    :   '0' | [1-9] [0-9]*; // no leading zeros,space inside is allowed

fragment  HEXADECIMAL
            :   '0x'([0-9]|[a-f])+
            |   '0X'([0-9]|[A-F])+
            ;

MULTI_COMMENT:'/*'.*?'*/' ->skip;   //非贪婪匹配
SINGL_COMMENT:'//' ~([\r]|[\n])*[\r]?([\n]|EOF) ->skip;
WS  :   [ \t\n\r]+ ->skip;
NO_ENTER: ~('\r'|'\n');
