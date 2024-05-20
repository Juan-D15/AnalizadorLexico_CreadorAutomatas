package Analizador;
import static Analizador.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
Espacio=[ ,\t,\r]+
%{
    public String lexeme;
    InfoAnalisis dc = new InfoAnalisis();
%}
%%

/* Espacios en blanco */
{Espacio} {/*Ignore*/}

/* Comentarios de varias lineas */
("/*"([^*]|[*]+[^*/])*"*/" ) {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {dc.linea=yyline; lexeme=yytext(); return Comillas;}

/* Tipos de datos */
( byte | int | char | long | float | double | boolean | short ) {dc.linea=yyline; lexeme=yytext(); return T_dato;}

/* Tipo de dato String */
( String ) {dc.linea=yyline; lexeme=yytext(); return Cadena_S;}

/* Palabra reservada If */
( if ) {dc.linea=yyline; lexeme=yytext(); return If;}

/* Palabra reservada Else */
( else ) {dc.linea=yyline; lexeme=yytext(); return Else;}

/* Palabra reservada Do */
( do ) {dc.linea=yyline; lexeme=yytext(); return Do;}

/* Palabra reservada While */
( while ) {dc.linea=yyline; lexeme=yytext(); return While;}

/* Palabra reservada For */
( for ) {dc.linea=yyline; lexeme=yytext(); return For;}

/* Operador Igual */
( "=" ) {dc.linea=yyline; lexeme=yytext(); return Asignacion;}

/* Operador Suma */
( "+" ) {dc.linea=yyline; lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {dc.linea=yyline; lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {dc.linea=yyline; lexeme=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {dc.linea=yyline; lexeme=yytext(); return Division;}

/* Nuevos */
( "%" ) {dc.linea=yyline; lexeme=yytext(); return Modulo;}
( "." ) {dc.linea=yyline; lexeme=yytext(); return Punto;}
( "," ) {dc.linea=yyline; lexeme=yytext(); return Coma;}
( abstract ) {dc.linea=yyline; lexeme=yytext(); return Abstract;}
( break ) {dc.linea=yyline; lexeme=yytext(); return Break;}
( case ) {dc.linea=yyline; lexeme=yytext(); return Case;}
( catch ) {dc.linea=yyline; lexeme=yytext(); return Catch;}
( class ) {dc.linea=yyline; lexeme=yytext(); return Class;}
( const ) {dc.linea=yyline; lexeme=yytext(); return Const;}
( default ) {dc.linea=yyline; lexeme=yytext(); return Default;}
( extends ) {dc.linea=yyline; lexeme=yytext(); return Extends;}
( finally ) {dc.linea=yyline; lexeme=yytext(); return Finally;}
( switch ) {dc.linea=yyline; lexeme=yytext(); return Switch;}
( try ) {dc.linea=yyline; lexeme=yytext(); return Try;}
( byvalue ) {dc.linea=yyline; lexeme=yytext(); return By_value;}
( cast ) {dc.linea=yyline; lexeme=yytext(); return Cast;}
( operator ) {dc.linea=yyline; lexeme=yytext(); return Operator;}
( continue ) {dc.linea=yyline; lexeme=yytext(); return Continue;}
( final ) {dc.linea=yyline; lexeme=yytext(); return Final;}
( future ) {dc.linea=yyline; lexeme=yytext(); return Future;}
( outer ) {dc.linea=yyline; lexeme=yytext(); return Outer;}
( goto ) {dc.linea=yyline; lexeme=yytext(); return Goto;}
( implements ) {dc.linea=yyline; lexeme=yytext(); return Implements;}
( import ) {dc.linea=yyline; lexeme=yytext(); return Import;}
( interface ) {dc.linea=yyline; lexeme=yytext(); return Interface;}
( native ) {dc.linea=yyline; lexeme=yytext(); return Native;}
( generic ) {dc.linea=yyline; lexeme=yytext(); return Generic;}
( rest ) {dc.linea=yyline; lexeme=yytext(); return Rest;}
( instanceof ) {dc.linea=yyline; lexeme=yytext(); return Instanceof;}
( new ) {dc.linea=yyline; lexeme=yytext(); return New;}
( null ) {dc.linea=yyline; lexeme=yytext(); return Null;}
( package ) {dc.linea=yyline; lexeme=yytext(); return Package;}
( private ) {dc.linea=yyline; lexeme=yytext(); return Private;}
( protected ) {dc.linea=yyline; lexeme=yytext(); return Protected;}
( public ) {dc.linea=yyline; lexeme=yytext(); return Public;}
( return ) {dc.linea=yyline; lexeme=yytext(); return Return;}
( static ) {dc.linea=yyline; lexeme=yytext(); return Static;}
( super ) {dc.linea=yyline; lexeme=yytext(); return Super;}
( inner ) {dc.linea=yyline; lexeme=yytext(); return Inner;}
( var ) {dc.linea=yyline; lexeme=yytext(); return Var;}
( synchronized ) {dc.linea=yyline; lexeme=yytext(); return Synchronized;}
( this ) {dc.linea=yyline; lexeme=yytext(); return This;}
( threadsafe ) {dc.linea=yyline; lexeme=yytext(); return Threadsafe;}
( throw | throws ) {dc.linea=yyline; lexeme=yytext(); return Throw_s;}
( transient ) {dc.linea=yyline; lexeme=yytext(); return Transient;}
( void ) {dc.linea=yyline; lexeme=yytext(); return Void;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {dc.linea=yyline; lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {dc.linea=yyline; lexeme = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {dc.linea=yyline; lexeme = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {dc.linea=yyline; lexeme = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {dc.linea=yyline; lexeme = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {dc.linea=yyline; lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {dc.linea=yyline; lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {dc.linea=yyline; lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {dc.linea=yyline; lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {dc.linea=yyline; lexeme = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {dc.linea=yyline; lexeme = yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {dc.linea=yyline; lexeme=yytext(); return Main;}

/* Punto y coma */
( ";" ) {dc.linea=yyline; lexeme=yytext(); return P_coma;}

/* Identificador */
{L}({L}|{D})* {dc.linea=yyline; lexeme=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {dc.linea=yyline; lexeme=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}
