grammar Expr;

@header {
	package antlr;
}

//start variable
prog: (decl | grp | assn | list | obj | programaction | useraction | rel)+ EOF   	# Program
	;

decl: TYPE grp ';'												 	# Declaration
	;

list: '{' grp '}'													
	;
	
grp: grp ',' grp													
	| obj
	;

obj: ID																									
	| VALUE															
	| list															
	;
	
assn: 'ASSIGN' '(' grp 'AS' programaction ')' ';'						# Assign			
	;
	
programaction: 															
	<assoc=right>  'EXPONENT' '(' programaction ',' programaction ')'   # Exponent			
	| 'MULTIPLY' '(' programaction ',' programaction ')'  # Multiply | 'DIVIDE' '(' programaction  ',' programaction ')'  # Divide
	| 'ADD' '(' programaction  ',' programaction ')'  # Add | 'SUBTRACT' '(' programaction  ',' programaction ')'	# Subtract
	| 'AND' '(' programaction ',' programaction ')' # And | 'OR' '(' programaction ',' programaction ')' # Or
	| obj # Object
	;

useraction: rel '(' obj ',' obj ')' ';'	 
	;

rel : rel ':' rel	# ActionPath
	| NAME			# ActionName
	;

/* Token */
TYPE: 'STRING' | 'LIST' ;
NAME: [A-Z][a-zA-Z0-9_]*;
ID: [a-zA-Z0-9_][a-zA-Z0-9_]*; //identifier
VALUE: ["][a-zA-Z0-9_]*["];
COMENT: '..';	
WS: [ \r\t\n]+ -> skip;



