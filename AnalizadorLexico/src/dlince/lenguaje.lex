package dlince;
import java_cup.runtime.*;
%%
%{
/*-*
* funciones y variables
*/
private void imprimir(String descripcion, String lexema) {
/*GUIAnalizadorLexicoRuby.Anadir(descripcion, lexema); */
System.out.println(lexema + " - " + descripcion);
}
/*private void mandar_error(String texto, String lexema,String linea, String colum) {
GUIAnalizadorLexicoRuby.MostrarError(texto, lexema,linea,colum);
}*/
%}
/*-* 
* Información sobre la clase generada
*/
%public
%class AnalizadorLexico
%type void
/*-*
* Ajustes regulares
*/



CADENA= \"[^\"]*\"
CADENA2=\'[^\']*\'
VARIABLE_GLOBAL= "$"[a-z|A-Z][a-z|A-Z|0-9|"_"]{0,9}
VARIABLE_INSTANCIA="@"[a-z|A-Z][a-z|A-Z|0-9|"_"]{0,9}
VARIABLE_LOCAL= [a-z|A-Z][a-z|A-Z|0-9|"_"]{0,9}
CONSTANTE= [A-Z]+[0-9|"_"]{0,9}
ENTERO = 0|([1-9][0-9]*)|("-"[1-9][0-9]*)
DECIMAL = (("-"[1-9][0-9]*)|([1-9][0-9]*))"."[0-9]+
DEF=[d][e][f]
YIELD=[y][i][e][l][d]
UNDEF=[u][n][d][e][f]
SUPER=[s][u][p][e][r]
SELF=[s][e][l][f]
RETURN=[r][e][t][u][r][n]
RESCUE=[r][e][s][c][u][e]
RETRY=[r][e][t][r][y]
NIL=[n][i][l]
MODULE=[m][o][d][u][l][e]
ENSURE=[e][n][s][u][r][e]
CLASS=[c][l][a][s][s]
ALIAS=[a][l][i][a][s]
INCLUDE=[i][n][c][l][u][d][e]
EXP=[e][x][p]
LOG_NAT=[l][o][g]
LOG_10=[l][o][g][1][0]
SIN=[s][i][n]
COS=[c][o][s]
TAN=[t][a][n]
COS_INV=[a][c][o][s]
SIN_INV=[a][s][i][n]
TAN_INV=[a][t][a][n]
RAIZ=[s][q][r][t]
PUTS  = [p][u][t][s]
PRINT =[p][r][i][n][t]
DEFINED = [d][e][f][i][n][e][d] 
CHOMP=[c][h][o][m][p]
GET=[g][e][t]
IN=[i][n]
CASE=[c][a][s][e]
WHEN=[w][h][e][n]
END=[e][n][d]
IF=[i][f]
WHILE=[w][h][i][l][e]
DO=[d][o]
UNLESS=[u][n][l][e][s][s]
UNTIL=[u][n][t][i][l]
BREAK=[b][r][e][a][k]
NEXT=[n][e][x][t]
REDO=[r][e][d][o]
FOR=[f][o][r]
EACH=[e][a][c][h]


BLANCO=[\n| |\t] 
INICIO_ARREGLO="["
FIN_ARREGLO="]"
PARENTESIS="("|")"
COMENTARIO="#"
COMA=","
DOS_PUNTOS=".."

RELACIONAL= ("=="|"<"|">"|"<="|">="|"!=")
LOGICO=[a][n][d]|[o][r]|[n][o][t]
ALGEBRAICO=("+"|"-"|"*"|"/"|"^"|"%"|"=")

%%

{DEF} {imprimir("Declaracion def",yytext());}
{YIELD} {imprimir("Declaracion yield",yytext());}
{UNDEF} {imprimir("Declaracion undef",yytext());}
{SUPER} {imprimir("Declaracion super",yytext());}
{SELF} {imprimir("Declaracion self",yytext());}
{RESCUE} {imprimir("Declaracion rescue",yytext());}
{RETRY} {imprimir("Declaracion retry",yytext());}
{NIL} {imprimir("Declaracion nil",yytext());}
{MODULE} {imprimir("Declaracion module",yytext());}
{ENSURE} {imprimir("Declaracion ensure",yytext());}
{CLASS} {imprimir("Declaracion class",yytext());}
{ALIAS} {imprimir("Declaracion alias",yytext());}
{RETURN} {imprimir("Declaracion return",yytext());}
{INCLUDE} {imprimir("Declaracion include",yytext());}
{EXP} {imprimir("Funcion exponencial",yytext());}
{LOG_NAT} {imprimir("Funcion Logaritmo Natural",yytext());}
{LOG_10} {imprimir("Funcion Logaritmo Base 10",yytext());}
{SIN} {imprimir("Funcion Seno",yytext());}
{COS} {imprimir("Funcion Coseno",yytext());}
{TAN} {imprimir("Funcion tangente",yytext());}
{COS_INV} {imprimir("Funcion Coseno inverso",yytext());}
{SIN_INV} {imprimir("Funcion Seno inverso",yytext());}
{TAN_INV} {imprimir("Funcion Tangente inversa",yytext());}
{RAIZ} {imprimir("Funcion Raiz Cuadrada",yytext());}
{PUTS} {imprimir("Control PUTS",yytext());}
{PRINT} {imprimir("Control PRINT",yytext());}
{DEFINED} {imprimir("Verificador de funcion",yytext());}
{CHOMP} {imprimir("capturar datos por pantalla",yytext());}
{GET} {imprimir("continuador de funcion",yytext());}
{CASE} {imprimir("Control CASE",yytext());}
{WHEN} {imprimir("Control WHEN",yytext());}
{END} {imprimir("Finalizador de control",yytext());}
{IF} {imprimir("Control IF",yytext());}
{WHILE} {imprimir("Control WHILE",yytext());}
{DO} {imprimir("Control DO",yytext());}
{UNLESS} {imprimir("Control UNLESS",yytext());}
{UNTIL} {imprimir("Control UNTIL",yytext());}
{BREAK} {imprimir("Finalizador de instrucción",yytext());}
{NEXT} {imprimir("Continuador de instrucción",yytext());}
{REDO} {imprimir("Reinicio de iteración",yytext());}
{FOR} {imprimir("Control FOR",yytext());}
{EACH} {imprimir("Control EACH",yytext());}
{BLANCO} { imprimir("blanco", yytext()); }
{INICIO_ARREGLO} { imprimir("inicio arreglo ", yytext()); }
{FIN_ARREGLO} { imprimir("fin arreglo ", yytext()); }
{PARENTESIS} { imprimir("parentesis ", yytext()); }
{COMENTARIO} { imprimir("comentario ", yytext()); }
{COMA} { imprimir("concatenación ",yytext());}
{DOS_PUNTOS} { imprimir("..",yytext());}
{CONSTANTE} {imprimir("Constante",yytext());}
{VARIABLE_GLOBAL} {imprimir("Variable Global",yytext());}
{VARIABLE_LOCAL} {imprimir("Variable Local",yytext());}
{VARIABLE_INSTANCIA} {imprimir("Variable de Instancia",yytext());}
{ENTERO} {imprimir("Entero",yytext());}
{DECIMAL} {imprimir("Decimal",yytext());}
{CADENA} {imprimir("Cadena",yytext());}
{CADENA2} {imprimir("Cadena",yytext());}
{RELACIONAL} {imprimir("Operador de relacion",yytext());}
{LOGICO} {imprimir("Operador Logico",yytext());}
{ALGEBRAICO} {imprimir("Operador algebraico",yytext());}


/*. { mandar_error("Caracter invalido",yytext(),""+yyline,""+yycolumn);}*/

. { throw new RuntimeException("Caracter invalido \""+yytext() +
"\" en la linea "+yyline+", columna "+yycolumn); }

