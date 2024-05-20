package Analizador;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
Espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espacios en blanco */
{Espacio} {/*Ignore*/}

/* Comentarios de varias lineas */
("/*"([^*]|[*]+[^*/])*"*/" ) {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Tipos de datos */
( byte | int | char | long | float | double | boolean | short ) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}

/* Tipo de dato Int (Para el main) */
( "int" ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

/* Tipo de dato String */
( String ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Palabra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palabra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palabra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Nuevos */
( "%" ) {return new Symbol(sym.Modulo, yychar, yyline, yytext());}
( "." ) {return new Symbol(sym.Punto, yychar, yyline, yytext());}
( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}
( abstract ) {return new Symbol(sym.Abstract, yychar, yyline, yytext());}
( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}
( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());}
( catch ) {return new Symbol(sym.Catch, yychar, yyline, yytext());}
( class ) {return new Symbol(sym.Class, yychar, yyline, yytext());}
( const ) {return new Symbol(sym.Const, yychar, yyline, yytext());}
( default ) {return new Symbol(sym.Default, yychar, yyline, yytext());}
( extends ) {return new Symbol(sym.Extends, yychar, yyline, yytext());}
( finally ) {return new Symbol(sym.Finally, yychar, yyline, yytext());}
( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}
( try ) {return new Symbol(sym.Try, yychar, yyline, yytext());}
( byvalue ) {return new Symbol(sym.By_value, yychar, yyline, yytext());}
( cast ) {return new Symbol(sym.Cast, yychar, yyline, yytext());}
( operator ) {return new Symbol(sym.Operator, yychar, yyline, yytext());}
( continue ) {return new Symbol(sym.Continue, yychar, yyline, yytext());}
( final ) {return new Symbol(sym.Final, yychar, yyline, yytext());}
( future ) {return new Symbol(sym.Future, yychar, yyline, yytext());}
( outer ) {return new Symbol(sym.Outer, yychar, yyline, yytext());}
( goto ) {return new Symbol(sym.Goto, yychar, yyline, yytext());}
( implements ) {return new Symbol(sym.Implements, yychar, yyline, yytext());}
( import ) {return new Symbol(sym.Import, yychar, yyline, yytext());}
( interface ) {return new Symbol(sym.Interface, yychar, yyline, yytext());}
( native ) {return new Symbol(sym.Native, yychar, yyline, yytext());}
( generic ) {return new Symbol(sym.Generic, yychar, yyline, yytext());}
( rest ) {return new Symbol(sym.Rest, yychar, yyline, yytext());}
( instanceof ) {return new Symbol(sym.Instanceof, yychar, yyline, yytext());}
( new ) {return new Symbol(sym.New, yychar, yyline, yytext());}
( null ) {return new Symbol(sym.Null, yychar, yyline, yytext());}
( package ) {return new Symbol(sym.Package, yychar, yyline, yytext());}
( private ) {return new Symbol(sym.Private, yychar, yyline, yytext());}
( protected ) {return new Symbol(sym.Protected, yychar, yyline, yytext());}
( public ) {return new Symbol(sym.Public, yychar, yyline, yytext());}
( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}
( static ) {return new Symbol(sym.Static, yychar, yyline, yytext());}
( super ) {return new Symbol(sym.Super, yychar, yyline, yytext());}
( inner ) {return new Symbol(sym.Inner, yychar, yyline, yytext());}
( var ) {return new Symbol(sym.Var, yychar, yyline, yytext());}
( synchronized ) {return new Symbol(sym.Synchronized, yychar, yyline, yytext());}
( this ) {return new Symbol(sym.This, yychar, yyline, yytext());}
( threadsafe ) {return new Symbol(sym.Threadsafe, yychar, yyline, yytext());}
( throw | throws ) {return new Symbol(sym.Throw_s, yychar, yyline, yytext());}
( transient ) {return new Symbol(sym.Transient, yychar, yyline, yytext());}
( void ) {return new Symbol(sym.Void, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( true | false ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
