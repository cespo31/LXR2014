/*
 *  The scanner definition for COOL.
 */

import java_cup.runtime.Symbol;

%%

%class CoolLexer
%cup
%line
%column
%unicode
%caseless
%ignorecase

%{

/*  Stuff enclosed in %{ %} is copied verbatim to the lexer class
 *  definition, all the extra variables/functions you want to use in the
 *  lexer actions should go here.  Don't remove or modify anything that
 *  was there initially.  */

    // Max size of string constants
    static int MAX_STR_CONST = 1025;

    // For assembling string constants
    StringBuffer string_buf = new StringBuffer();

    //private int curr_lineno = 1;
    int get_curr_lineno() {
	//return curr_lineno;
    	return yyline;
    }

    int get_curr_column() {
    	return yycolumn;
    }
    
    private AbstractSymbol filename;

    void set_filename(String fname) {
	filename = AbstractTable.stringtable.addString(fname);
    }

    AbstractSymbol curr_filename() {
	return filename;
    }
%}

%init{

/*  Stuff enclosed in %init{ %init} is copied verbatim to the lexer
 *  class constructor, all the extra initialization you want to do should
 *  go here.  Don't remove or modify anything that was there initially. */

    // empty for now
%init}

%eofval{

/*  Stuff enclosed in %eofval{ %eofval} specifies java code that is
 *  executed when end-of-file is reached.  If you use multiple lexical
 *  states and want to do something special if an EOF is encountered in
 *  one of those states, place your code in the switch statement.
 *  Ultimately, you should return the EOF symbol, or your lexer won't
 *  work.  */

    switch(yystate()) {
    case COMMENT:
	
	break;
    case YYINITIAL:
		/* nothing special to do in the initial state */
	break;
	case STRING:
		
	break;
	}
    return new Symbol(TokenConstants.EOF);
%eofval}

LineTerminator = \n
WhiteSpace = {LineTerminator} | [ \f\v\t\r]

Digit = [0-9]
Digits = [1-9]{Digit}*

Letter = [a-zA-Z_]

InputCharacter = [^\r\n]

Identifier = {Letter}+
Identifier_type = [A-Z]({Letter}|{Digit})*
Identifier_object = [a-z]({Letter}|{Digit})*

//Relop = "+"|"-"|"<="|"<"|"="


LineComment = "--"{InputCharacter}*({LineTerminator}|EOF)
NormalComment = "(*"(.\n)*"*)"


%state STRING
%state COMMENT

%%

/* keywords */
<YYINITIAL> {
	"class"				{return new Symbol(TokenConstants.CLASS);}
	"else"				{return new Symbol(TokenConstants.ELSE);}
	"fi"				{return new Symbol(TokenConstants.FI);}
	"if"				{return new Symbol(TokenConstants.IF);}
	"in"				{return new Symbol(TokenConstants.IN);}
	"inherits"			{return new Symbol(TokenConstants.INHERITS);}
	"idvoid"			{return new Symbol(TokenConstants.ISVOID);}
	"let"				{return new Symbol(TokenConstants.LET);}
	"loop"				{return new Symbol(TokenConstants.LOOP);}
	"pool"				{return new Symbol(TokenConstants.POOL);}
	"then"				{return new Symbol(TokenConstants.THEN);}
	"while"				{return new Symbol(TokenConstants.WHILE);}
	"case"				{return new Symbol(TokenConstants.CASE);}
	"esac"				{return new Symbol(TokenConstants.ESAC);}
	"new"				{return new Symbol(TokenConstants.NEW);}
	"of"				{return new Symbol(TokenConstants.OF);}
	"NOT"				{return new Symbol(TokenConstants.NOT);}
	[f]"alse"			{return new Symbol(TokenConstants.BOOL_CONST, false);}
	[t]"rue"			{return new Symbol(TokenConstants.BOOL_CONST, true);}
	
}


<YYINITIAL> {
	/* identifiers */
	{Identifier_type}	{return new Symbol(TokenConstants.TYPEID);}
	{Identifier_object}	{return new Symbol(TokenConstants.OBJECTID);}
	
	/* number */
	{Digits}			{return new Symbol(TokenConstants.INT_CONST);}					
	
	/* operators */
	"+"					{return new Symbol(TokenConstants.PLUS);}
	"/"					{return new Symbol(TokenConstants.DIV);}	
	"-"					{return new Symbol(TokenConstants.MINUS);}	
	"*"					{return new Symbol(TokenConstants.MULT);}	
	"<="				{return new Symbol(TokenConstants.LE);}
	"="					{return new Symbol(TokenConstants.EQ);}
	"<"					{return new Symbol(TokenConstants.LT);}	
	"<-"				{return new Symbol(TokenConstants.ASSIGN);}
	"~"					{return new Symbol(TokenConstants.NEG);}
	
	/* punctuation */
	"."					{return new Symbol(TokenConstants.DOT);}
	"@"					{return new Symbol(TokenConstants.AT);}
	";"					{return new Symbol(TokenConstants.SEMI);}
	":"					{return new Symbol(TokenConstants.COLON);}
	","					{return new Symbol(TokenConstants.COMMA);}
	"("					{return new Symbol(TokenConstants.LPAREN);}
	")"					{return new Symbol(TokenConstants.RPAREN);}
	"{"					{return new Symbol(TokenConstants.LBRACE);}
	"}"					{return new Symbol(TokenConstants.RBRACE);}
	"=>"				{return new Symbol(TokenConstants.DARROW);}

	/* to ignore */
	{WhiteSpace}		{/* ignore this */}
	{LineComment}		{/* ignore this */}
	
	//manca ERROR e STR_CONST
}	


/*
<COMMENT>{

}

*/

/*
<STRING>{

}
*/



//DOBBIAMO METTERE STRINGHE E COMMENTI




.                               { /* This rule should be the very last
                                     in your lexical specification and
                                     will match match everything not
                                     matched by other lexical rules. */
                                  System.err.println("LEXER BUG - UNMATCHED: " + yytext()); }