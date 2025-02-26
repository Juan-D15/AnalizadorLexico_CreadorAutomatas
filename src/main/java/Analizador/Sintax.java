package Analizador;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Sep 11 23:04:16 GMT-06:00 2023
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\054\000\002\002\004\000\002\002\011\000\002\002" +
    "\010\000\002\003\004\000\002\003\003\000\002\003\004" +
    "\000\002\003\003\000\002\003\004\000\002\003\003\000" +
    "\002\003\004\000\002\003\003\000\002\003\005\000\002" +
    "\003\004\000\002\003\003\000\002\004\005\000\002\004" +
    "\007\000\002\004\007\000\002\004\006\000\002\004\006" +
    "\000\002\004\005\000\002\004\007\000\002\004\007\000" +
    "\002\004\006\000\002\004\006\000\002\004\010\000\002" +
    "\004\010\000\002\004\011\000\002\004\011\000\002\006" +
    "\011\000\002\013\003\000\002\013\005\000\002\013\005" +
    "\000\002\013\005\000\002\013\006\000\002\013\007\000" +
    "\002\007\015\000\002\010\011\000\002\011\013\000\002" +
    "\012\011\000\002\014\012\000\002\014\011\000\002\005" +
    "\005\000\002\005\004\000\002\005\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\211\000\006\007\006\037\004\001\002\000\004\031" +
    "\207\001\002\000\004\002\206\001\002\000\004\037\007" +
    "\001\002\000\004\031\010\001\002\000\004\032\011\001" +
    "\002\000\004\033\012\001\002\000\016\006\021\007\024" +
    "\010\020\011\015\015\014\016\026\001\002\000\022\006" +
    "\ufff7\007\ufff7\010\ufff7\011\ufff7\013\ufff7\015\ufff7\016\ufff7" +
    "\034\ufff7\001\002\000\004\031\200\001\002\000\004\031" +
    "\166\001\002\000\022\006\ufff4\007\ufff4\010\ufff4\011\ufff4" +
    "\013\ufff4\015\ufff4\016\ufff4\034\ufff4\001\002\000\022\006" +
    "\ufffd\007\ufffd\010\ufffd\011\ufffd\013\ufffd\015\ufffd\016\ufffd" +
    "\034\ufffd\001\002\000\004\116\147\001\002\000\006\027" +
    "\132\116\133\001\002\000\022\006\ufff9\007\ufff9\010\ufff9" +
    "\011\ufff9\013\ufff9\015\ufff9\016\ufff9\034\ufff9\001\002\000" +
    "\022\006\ufffb\007\ufffb\010\ufffb\011\ufffb\013\ufffb\015\ufffb" +
    "\016\ufffb\034\ufffb\001\002\000\006\027\115\116\116\001" +
    "\002\000\022\006\021\007\024\010\020\011\015\013\076" +
    "\015\014\016\026\034\114\001\002\000\004\031\027\001" +
    "\002\000\006\006\031\116\032\001\002\000\004\032\070" +
    "\001\002\000\004\116\061\001\002\000\004\017\033\001" +
    "\002\000\004\117\034\001\002\000\004\040\035\001\002" +
    "\000\006\030\037\116\040\001\002\000\004\040\051\001" +
    "\002\000\006\032\uffe4\040\uffe4\001\002\000\004\025\041" +
    "\001\002\000\012\005\043\030\044\116\045\117\042\001" +
    "\002\000\006\032\uffe2\040\uffe2\001\002\000\006\005\046" +
    "\116\047\001\002\000\006\032\uffe3\040\uffe3\001\002\000" +
    "\006\032\uffe1\040\uffe1\001\002\000\006\032\uffe0\040\uffe0" +
    "\001\002\000\004\005\050\001\002\000\006\032\uffdf\040" +
    "\uffdf\001\002\000\006\027\053\116\054\001\002\000\004" +
    "\032\uffd9\001\002\000\004\116\060\001\002\000\006\026" +
    "\055\027\056\001\002\000\004\117\057\001\002\000\004" +
    "\032\uffd7\001\002\000\004\032\uffd8\001\002\000\004\032" +
    "\uffd6\001\002\000\004\017\062\001\002\000\004\117\063" +
    "\001\002\000\004\040\064\001\002\000\006\030\037\116" +
    "\040\001\002\000\004\040\066\001\002\000\006\027\053" +
    "\116\054\001\002\000\004\032\uffda\001\002\000\004\033" +
    "\071\001\002\000\016\006\021\007\024\010\020\011\015" +
    "\015\014\016\026\001\002\000\022\006\021\007\024\010" +
    "\020\011\015\013\076\015\014\016\026\034\101\001\002" +
    "\000\022\006\ufff8\007\ufff8\010\ufff8\011\ufff8\013\ufff8\015" +
    "\ufff8\016\ufff8\034\ufff8\001\002\000\022\006\ufff5\007\ufff5" +
    "\010\ufff5\011\ufff5\013\ufff5\015\ufff5\016\ufff5\034\ufff5\001" +
    "\002\000\022\006\ufffe\007\ufffe\010\ufffe\011\ufffe\013\ufffe" +
    "\015\ufffe\016\ufffe\034\ufffe\001\002\000\004\033\104\001" +
    "\002\000\022\006\ufffa\007\ufffa\010\ufffa\011\ufffa\013\ufffa" +
    "\015\ufffa\016\ufffa\034\ufffa\001\002\000\022\006\ufffc\007" +
    "\ufffc\010\ufffc\011\ufffc\013\ufffc\015\ufffc\016\ufffc\034\ufffc" +
    "\001\002\000\022\006\uffdb\007\uffdb\010\uffdb\011\uffdb\013" +
    "\uffdb\015\uffdb\016\uffdb\034\uffdb\001\002\000\004\013\076" +
    "\001\002\000\022\006\ufff6\007\ufff6\010\ufff6\011\ufff6\013" +
    "\ufff6\015\ufff6\016\ufff6\034\ufff6\001\002\000\016\006\021" +
    "\007\024\010\020\011\015\015\014\016\026\001\002\000" +
    "\022\006\021\007\024\010\020\011\015\013\076\015\014" +
    "\016\026\034\106\001\002\000\004\015\107\001\002\000" +
    "\004\031\110\001\002\000\006\030\037\116\040\001\002" +
    "\000\004\032\112\001\002\000\004\040\113\001\002\000" +
    "\022\006\uffdc\007\uffdc\010\uffdc\011\uffdc\013\uffdc\015\uffdc" +
    "\016\uffdc\034\uffdc\001\002\000\004\002\000\001\002\000" +
    "\004\116\130\001\002\000\012\017\122\026\117\027\121" +
    "\040\120\001\002\000\004\117\126\001\002\000\022\006" +
    "\ufff3\007\ufff3\010\ufff3\011\ufff3\013\ufff3\015\ufff3\016\ufff3" +
    "\034\ufff3\001\002\000\004\040\125\001\002\000\004\117" +
    "\123\001\002\000\004\040\124\001\002\000\022\006\ufff1" +
    "\007\ufff1\010\ufff1\011\ufff1\013\ufff1\015\ufff1\016\ufff1\034" +
    "\ufff1\001\002\000\022\006\ufff0\007\ufff0\010\ufff0\011\ufff0" +
    "\013\ufff0\015\ufff0\016\ufff0\034\ufff0\001\002\000\004\040" +
    "\127\001\002\000\022\006\ufff2\007\ufff2\010\ufff2\011\ufff2" +
    "\013\ufff2\015\ufff2\016\ufff2\034\ufff2\001\002\000\004\040" +
    "\131\001\002\000\022\006\uffef\007\uffef\010\uffef\011\uffef" +
    "\013\uffef\015\uffef\016\uffef\034\uffef\001\002\000\004\116" +
    "\145\001\002\000\012\017\137\026\134\027\136\040\135" +
    "\001\002\000\004\117\143\001\002\000\022\006\uffee\007" +
    "\uffee\010\uffee\011\uffee\013\uffee\015\uffee\016\uffee\034\uffee" +
    "\001\002\000\004\040\142\001\002\000\004\117\140\001" +
    "\002\000\004\040\141\001\002\000\022\006\uffec\007\uffec" +
    "\010\uffec\011\uffec\013\uffec\015\uffec\016\uffec\034\uffec\001" +
    "\002\000\022\006\uffeb\007\uffeb\010\uffeb\011\uffeb\013\uffeb" +
    "\015\uffeb\016\uffeb\034\uffeb\001\002\000\004\040\144\001" +
    "\002\000\022\006\uffed\007\uffed\010\uffed\011\uffed\013\uffed" +
    "\015\uffed\016\uffed\034\uffed\001\002\000\004\040\146\001" +
    "\002\000\022\006\uffea\007\uffea\010\uffea\011\uffea\013\uffea" +
    "\015\uffea\016\uffea\034\uffea\001\002\000\006\017\151\026" +
    "\150\001\002\000\004\005\160\001\002\000\004\005\152" +
    "\001\002\000\006\005\153\116\154\001\002\000\004\040" +
    "\157\001\002\000\004\005\155\001\002\000\004\040\156" +
    "\001\002\000\022\006\uffe6\007\uffe6\010\uffe6\011\uffe6\013" +
    "\uffe6\015\uffe6\016\uffe6\034\uffe6\001\002\000\022\006\uffe8" +
    "\007\uffe8\010\uffe8\011\uffe8\013\uffe8\015\uffe8\016\uffe8\034" +
    "\uffe8\001\002\000\006\005\161\116\162\001\002\000\004" +
    "\040\165\001\002\000\004\005\163\001\002\000\004\040" +
    "\164\001\002\000\022\006\uffe7\007\uffe7\010\uffe7\011\uffe7" +
    "\013\uffe7\015\uffe7\016\uffe7\034\uffe7\001\002\000\022\006" +
    "\uffe9\007\uffe9\010\uffe9\011\uffe9\013\uffe9\015\uffe9\016\uffe9" +
    "\034\uffe9\001\002\000\006\030\037\116\040\001\002\000" +
    "\004\032\170\001\002\000\004\033\171\001\002\000\016" +
    "\006\021\007\024\010\020\011\015\015\014\016\026\001" +
    "\002\000\022\006\021\007\024\010\020\011\015\013\076" +
    "\015\014\016\026\034\173\001\002\000\024\006\uffe5\007" +
    "\uffe5\010\uffe5\011\uffe5\012\174\013\uffe5\015\uffe5\016\uffe5" +
    "\034\uffe5\001\002\000\004\033\175\001\002\000\016\006" +
    "\021\007\024\010\020\011\015\015\014\016\026\001\002" +
    "\000\022\006\021\007\024\010\020\011\015\013\076\015" +
    "\014\016\026\034\177\001\002\000\022\006\uffde\007\uffde" +
    "\010\uffde\011\uffde\013\uffde\015\uffde\016\uffde\034\uffde\001" +
    "\002\000\006\030\037\116\040\001\002\000\004\032\202" +
    "\001\002\000\004\033\203\001\002\000\016\006\021\007" +
    "\024\010\020\011\015\015\014\016\026\001\002\000\022" +
    "\006\021\007\024\010\020\011\015\013\076\015\014\016" +
    "\026\034\205\001\002\000\022\006\uffdd\007\uffdd\010\uffdd" +
    "\011\uffdd\013\uffdd\015\uffdd\016\uffdd\034\uffdd\001\002\000" +
    "\004\002\001\001\002\000\004\032\210\001\002\000\004" +
    "\033\211\001\002\000\016\006\021\007\024\010\020\011" +
    "\015\015\014\016\026\001\002\000\022\006\021\007\024" +
    "\010\020\011\015\013\076\015\014\016\026\034\213\001" +
    "\002\000\004\002\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\211\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\003\024\004\016\006" +
    "\022\007\021\010\012\012\015\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\016\004" +
    "\074\006\077\007\076\010\072\011\101\012\073\001\001" +
    "\000\002\001\001\000\004\014\027\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\013\035\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\005\051\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\013\064" +
    "\001\001\000\002\001\001\000\004\005\066\001\001\000" +
    "\002\001\001\000\002\001\001\000\016\003\071\004\016" +
    "\006\022\007\021\010\012\012\015\001\001\000\016\004" +
    "\074\006\077\007\076\010\072\011\101\012\073\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\011\102\001\001\000\002\001\001\000" +
    "\016\003\104\004\016\006\022\007\021\010\012\012\015" +
    "\001\001\000\016\004\074\006\077\007\076\010\072\011" +
    "\101\012\073\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\013\110\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\013\166\001\001\000\002\001" +
    "\001\000\002\001\001\000\016\003\171\004\016\006\022" +
    "\007\021\010\012\012\015\001\001\000\016\004\074\006" +
    "\077\007\076\010\072\011\101\012\073\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\003\175\004\016\006" +
    "\022\007\021\010\012\012\015\001\001\000\016\004\074" +
    "\006\077\007\076\010\072\011\101\012\073\001\001\000" +
    "\002\001\001\000\004\013\200\001\001\000\002\001\001" +
    "\000\002\001\001\000\016\003\203\004\016\006\022\007" +
    "\021\010\012\012\015\001\001\000\016\004\074\006\077" +
    "\007\076\010\072\011\101\012\073\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\003\211\004\016\006\022\007\021\010\012\012" +
    "\015\001\001\000\016\004\074\006\077\007\076\010\072" +
    "\011\101\012\073\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // DECLARACION_FOR ::= Op_incremento Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // DECLARACION_FOR ::= Identificador Op_incremento 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // DECLARACION_FOR ::= Identificador Op_atribucion Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // SENTENCIA_FOR ::= Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // SENTENCIA_FOR ::= T_dato Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // FOR ::= For Parentesis_a SENTENCIA_FOR Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FOR",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // DO_WHILE ::= Do Llave_a SENTENCIA Llave_c While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DO_WHILE",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // WHILE ::= While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("WHILE",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // IF_ELSE ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c Else Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF_ELSE",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SENTENCIA_BOOLEANA ::= Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // IF ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // DECLARACION ::= Cadena Identificador Igual Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // DECLARACION ::= Cadena Identificador Igual Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // DECLARACION ::= T_dato Op_incremento Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACION ::= T_dato Identificador Op_incremento P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= T_dato Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= T_dato Identificador Op_atribucion Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACION ::= T_dato Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DECLARACION ::= Int Op_incremento Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARACION ::= Int Identificador Op_incremento P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACION ::= Int Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DECLARACION ::= Int Identificador Op_atribucion Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // DECLARACION ::= Int Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA ::= FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= SENTENCIA FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= SENTENCIA DO_WHILE DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= SENTENCIA WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= SENTENCIA IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= SENTENCIA IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Int Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

