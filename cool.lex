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

    //our variables
    private int open_comments = 0;
    private boolean stringlen_ok = true;
    
    // Max size of string constants
    static int MAX_STR_CONST = 1025;

    // For assembling string constants
    StringBuffer string_buf = new StringBuffer();

    private int curr_lineno = 1;
    int get_curr_lineno() {
		return curr_lineno;
    //	return yyline;
    }

    //int get_curr_column() {
    //	return yycolumn;
    //}
    
    private AbstractSymbol filename;

    void set_filename(String fname) {
	filename = AbstractTable.stringtable.addString(fname);
    }
    
    /*
    AbstractSymbol set_number_in_filename(String fname) {
    filename = AbstractTable.inttable.addString(fname);
    return filename;
    }
    */
    
    /*
    AbstractSymbol set_identifier_in_filename(String fname) {
    filename = AbstractTable.idtable.addString(fname);
    return filename;
    }
    */
    

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
    case YYINITIAL:
		/* nothing special to do in the initial state */
	break;
	case COMMENT:
		return new Symbol(TokenConstants.ERROR, "EOF in comment"); 
	//break;
	case STRING:
		return new Symbol(TokenConstants.ERROR, "EOF in string constant"); 
	//break;
	}
    return new Symbol(TokenConstants.EOF);
%eofval}

LineTerminator = \n
WhiteSpace = [ \f\v\t\r]

Digit = [0-9]
Digits = 0 | [1-9]{Digit}*

Letter = [a-zA-Z_]

InputCharacter = [^\r\n]

Identifier_type = [A-Z]({Letter}|{Digit})*
Identifier_object = [a-z]({Letter}|{Digit})*

LineComment = "--"{InputCharacter}*({LineTerminator}|EOF)

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
	{Identifier_type}	{return new Symbol(TokenConstants.TYPEID,AbstractTable.idtable.addString(yytext()));}
	{Identifier_object}	{return new Symbol(TokenConstants.OBJECTID,AbstractTable.idtable.addString(yytext()));}
	
	/* number */
	{Digits}			{return new Symbol(TokenConstants.INT_CONST,AbstractTable.inttable.addString(yytext()));}					
	
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
	{LineTerminator}	{curr_lineno++;}
	{WhiteSpace}		{/* ignore this */}
	{LineComment}		{curr_lineno++;}
	
	//manca ERROR e STR_CONST

	"(*"				{yybegin(COMMENT);}
	
	"*)"				{return new Symbol(TokenConstants.ERROR,"Unmatched *)");}
	
	\"					{
						yybegin(STRING);
						}
}	


<COMMENT>{
	"(*"				{open_comments++;}
	
	"*)"				{
						open_comments--;
						if(open_comments==0)
						yybegin(YYINITIAL);
						}
	
	{LineTerminator}	{curr_lineno++;}
	
	.					{/* ignore this */}
}


//DOBBIAMO METTERE STRINGHE


<STRING>{

	\"					{
						yybegin(YYINITIAL);
						set_filename(string_buf.toString());
						string_buf.delete(0,string_buf.length());
						return new Symbol(TokenConstants.STR_CONST,curr_filename());
						}

	\\\[n]				{
						//if(stringlen_ok==true && string_buf.length>=MAX_STR_CONST)
						string_buf.append('\n');
						}
	
	\0					{return new Symbol(TokenConstants.ERROR,"String contains null character");}

	\{LineTerminator}	{string_buf.append("\n");}

	\\[b]				{string_buf.append("\b");}
	
	\\[t]				{string_buf.append("\t");}
	
	\\[f]				{string_buf.append("\f");}

	\\\"				{string_buf.append("\"");}
	
	\\					{/* ignore this */}
	
	{LineTerminator}	{
						curr_lineno++;	
						return new Symbol(TokenConstants.ERROR,"Unterminated string constant");
						}
	
	//\\[a-zA-Z]			{string_buf.append(yytext().substring(1));}
	
	\\.					{string_buf.append(yytext().substring(1));} //alternativa a quello commentato sopra. Ma serve davvero???
	
	[^\n\r]				{string_buf.append(yytext());}	

}


//il resto, da errore
.						{ /* This rule should be the very last
						in your lexical specification and
						will match match everything not
						matched by other lexical rules. */
						System.err.println("LEXER BUG - UNMATCHED: " + yytext());
						return new Symbol(TokenConstants.ERROR, yytext());}

						
//NOTE: QUANDO LANCIAMO UN TOKEN DI ERRORE, DOBBIAMO TORNARE NELLO STATO INIZIALE E CONTINUARE