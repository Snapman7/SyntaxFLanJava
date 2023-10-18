grammar FLanguage;

// Lexer rules
WS: [ \t\r\n]+ -> skip;
Identifier: [A-Za-z]+;
Integer: ('+' | '-')? [0-9]+;
Real: ('+' | '-')? [0-9]+ '.' [0-9]+;
Boolean: 'true' | 'false';
LPAREN: '(';
RPAREN: ')';
QUOTE: '\'';
SETQ: 'setq';
FUNC: 'func';
LAMBDA: 'lambda';
PROG: 'prog';
COND: 'cond';
WHILE: 'while';
RETURN: 'return';
BREAK: 'break';
HEAD: 'head';
TAIL: 'tail';
CONS: 'cons';
EQUAL: 'equal';
NONEQUAL: 'nonequal';
LESS: 'less';
LESSEQ: 'lesseq';
GREATER: 'greater';
GREATEREQ: 'greatereq';
ISINT: 'isint';
ISREAL: 'isreal';
ISBOOL: 'isbool';
ISNULL: 'isnull';
ISATOM: 'isatom';
ISLIST: 'islist';
AND: 'and';
OR: 'or';
XOR: 'xor';
NOT: 'not';
EVAL: 'eval';
COMMA: ',';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
NULL: 'null';

// Parser rules
program: element+ EOF;

element: atom
       | literal
       | list
       | specialForm
       | funcCall
       | expression;

atom: Identifier;

literal: Integer
        | Real
        | Boolean
        | NULL;

list: LPAREN element+ RPAREN;

specialForm: quote
           | setq
           | func
           | lambda
           | prog
           | cond
           | whileForm
           | returnForm
           | breakForm;

quote: QUOTE element;

setq: SETQ Identifier element;

func: FUNC Identifier LPAREN identifierList RPAREN element;

lambda: LAMBDA LPAREN identifierList RPAREN element;

prog: PROG LPAREN identifierList RPAREN element+ RPAREN;

cond: COND element element (element)?;

whileForm: WHILE element element;

returnForm: RETURN element;

breakForm: BREAK;

funcCall: LPAREN Identifier element* RPAREN;

identifierList: Identifier (COMMA Identifier)*;

identifier: Identifier;

expression: logicalExpression;

logicalExpression: relationalExpression ( (AND | OR | XOR) relationalExpression)*;

relationalExpression: additiveExpression ( (EQUAL | NONEQUAL | LESS | LESSEQ | GREATER | GREATEREQ) additiveExpression)?;

additiveExpression: multiplicativeExpression ( (PLUS | MINUS) multiplicativeExpression)*;

multiplicativeExpression: primary ( (MULT | DIV | MOD) primary)*;

primary: QUOTE element
       | atom
       | funcCall
       | evalCall
       | LPAREN expression RPAREN;

evalCall: EVAL expression;
