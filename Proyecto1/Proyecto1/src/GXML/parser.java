
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package GXML;

import java_cup.runtime.*;
import java.lang.*;
import java.util.*;
import java.io.*;
import AST.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\002\004\000\002\002\003\000\002\003" +
    "\003\000\002\004\013\000\002\004\012\000\002\004\012" +
    "\000\002\005\004\000\002\005\003\000\002\005\003\000" +
    "\002\006\004\000\002\006\003\000\002\010\007\000\002" +
    "\010\007\000\002\010\005\000\002\012\003\000\002\011" +
    "\004\000\002\011\003\000\002\007\003\000\002\007\003" +
    "\000\002\007\003\000\002\007\003\000\002\007\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\003\000\002" +
    "\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\062\000\004\013\007\001\002\000\004\002\064\001" +
    "\002\000\004\002\000\001\002\000\004\002\uffff\001\002" +
    "\000\004\022\011\001\002\000\006\014\014\022\012\001" +
    "\002\000\006\014\ufff3\022\ufff3\001\002\000\004\020\054" +
    "\001\002\000\006\014\042\022\012\001\002\000\026\004" +
    "\031\005\020\006\026\007\030\010\027\011\023\012\022" +
    "\013\007\021\024\022\021\001\002\000\006\014\ufff7\022" +
    "\ufff7\001\002\000\004\013\ufffa\001\002\000\032\004\ufff1" +
    "\005\ufff1\006\ufff1\007\ufff1\010\ufff1\011\ufff1\012\ufff1\013" +
    "\ufff1\015\ufff1\017\ufff1\021\ufff1\022\ufff1\001\002\000\032" +
    "\004\uffed\005\uffed\006\uffed\007\uffed\010\uffed\011\uffed\012" +
    "\uffed\013\uffed\015\uffed\017\uffed\021\uffed\022\uffed\001\002" +
    "\000\032\004\ufff0\005\ufff0\006\ufff0\007\ufff0\010\ufff0\011" +
    "\ufff0\012\ufff0\013\ufff0\015\ufff0\017\ufff0\021\ufff0\022\ufff0" +
    "\001\002\000\032\004\uffe8\005\uffe8\006\uffe8\007\uffe8\010" +
    "\uffe8\011\uffe8\012\uffe8\013\uffe8\015\uffe8\017\uffe8\021\uffe8" +
    "\022\uffe8\001\002\000\032\004\uffe9\005\uffe9\006\uffe9\007" +
    "\uffe9\010\uffe9\011\uffe9\012\uffe9\013\uffe9\015\uffe9\017\uffe9" +
    "\021\uffe9\022\uffe9\001\002\000\032\004\uffef\005\uffef\006" +
    "\uffef\007\uffef\010\uffef\011\uffef\012\uffef\013\uffef\015\uffef" +
    "\017\uffef\021\uffef\022\uffef\001\002\000\026\004\031\005" +
    "\020\006\026\007\030\010\027\011\023\012\022\013\ufff9" +
    "\021\024\022\021\001\002\000\032\004\uffec\005\uffec\006" +
    "\uffec\007\uffec\010\uffec\011\uffec\012\uffec\013\uffec\015\uffec" +
    "\017\uffec\021\uffec\022\uffec\001\002\000\032\004\uffea\005" +
    "\uffea\006\uffea\007\uffea\010\uffea\011\uffea\012\uffea\013\uffea" +
    "\015\uffea\017\uffea\021\uffea\022\uffea\001\002\000\032\004" +
    "\uffeb\005\uffeb\006\uffeb\007\uffeb\010\uffeb\011\uffeb\012\uffeb" +
    "\013\uffeb\015\uffeb\017\uffeb\021\uffeb\022\uffeb\001\002\000" +
    "\032\004\uffee\005\uffee\006\uffee\007\uffee\010\uffee\011\uffee" +
    "\012\uffee\013\uffee\015\uffee\017\uffee\021\uffee\022\uffee\001" +
    "\002\000\004\013\034\001\002\000\004\013\ufffb\001\002" +
    "\000\006\022\011\023\035\001\002\000\004\022\011\001" +
    "\002\000\004\014\037\001\002\000\006\002\ufffd\013\ufffd" +
    "\001\002\000\032\004\ufff2\005\ufff2\006\ufff2\007\ufff2\010" +
    "\ufff2\011\ufff2\012\ufff2\013\ufff2\015\ufff2\017\ufff2\021\ufff2" +
    "\022\ufff2\001\002\000\006\014\ufff8\022\ufff8\001\002\000" +
    "\026\004\031\005\020\006\026\007\030\010\027\011\023" +
    "\012\022\013\043\021\024\022\021\001\002\000\006\022" +
    "\011\023\051\001\002\000\004\013\045\001\002\000\006" +
    "\022\011\023\046\001\002\000\004\022\011\001\002\000" +
    "\004\014\050\001\002\000\006\002\ufffe\013\ufffe\001\002" +
    "\000\004\022\011\001\002\000\004\014\053\001\002\000" +
    "\006\002\ufffc\013\ufffc\001\002\000\010\015\055\016\057" +
    "\021\056\001\002\000\024\004\031\005\020\006\026\007" +
    "\030\010\027\011\023\012\022\021\024\022\021\001\002" +
    "\000\006\014\ufff4\022\ufff4\001\002\000\024\004\031\005" +
    "\020\006\026\007\030\010\027\011\023\012\022\021\024" +
    "\022\021\001\002\000\026\004\031\005\020\006\026\007" +
    "\030\010\027\011\023\012\022\017\061\021\024\022\021" +
    "\001\002\000\006\014\ufff5\022\ufff5\001\002\000\026\004" +
    "\031\005\020\006\026\007\030\010\027\011\023\012\022" +
    "\015\063\021\024\022\021\001\002\000\006\014\ufff6\022" +
    "\ufff6\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\062\000\010\002\003\003\004\004\005\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\012\007\001\001\000\006\006\012\010\014\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\040\001\001" +
    "\000\012\004\015\005\031\007\016\011\024\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\037\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\032\001\001\000\002\001\001\000\004" +
    "\012\007\001\001\000\004\012\035\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\004\015\005\043\007\016\011\024\001\001\000" +
    "\004\012\007\001\001\000\004\004\032\001\001\000\004" +
    "\012\007\001\001\000\004\012\046\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\051\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\007" +
    "\016\011\061\001\001\000\002\001\001\000\006\007\016" +
    "\011\057\001\001\000\004\007\037\001\001\000\002\001" +
    "\001\000\004\007\037\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




public static void main(String args[]) throws Exception {

// La clase Yylex es creada por el analizador léxico

new parser(new Yylex(new BufferedReader(new InputStreamReader(System.in)))).parse();
}

public void syntax_error(Symbol s){
        System.out.println("Error en la col " + (s.right+1) +" fila "+s.left+ ". Identificador "
+s.value  );
}
public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        System.out.println("Error en la Columna " + (s.right+1)+ "fila "+s.left+". Identificador " +
s.value + " no reconocido.");
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


ArrayList vars= new ArrayList();
List <NodoGxml> filhos = new ArrayList();
NodoGxml root = new NodoGxml("R");



  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= lengua EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // lengua ::= Binit 
            {
              Object RESULT =null;
                
		System.out.println("analisis finalizado!");
                TreeGxml.Graphic(root);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("lengua",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Binit ::= B 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Binit",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // B ::= abi tag Atributos cer Cuerpo abi slash tag cer 
            {
              Object RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		Object m = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		//filhos.add(m);
                
                filhos.add(new NodoGxml(m.toString()));
                root.setFilhos(filhos);
                
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // B ::= abi tag cer Cuerpo abi slash tag cer 
            {
              Object RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object m = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		System.out.println(m+"--"+s);// filhos.add(m);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // B ::= abi tag Atributos cer abi slash tag cer 
            {
              Object RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object m = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		System.out.println(m+"--"+s); //filhos.add(m);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Cuerpo ::= Cuerpo B 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Cuerpo",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Cuerpo ::= B 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Cuerpo",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Cuerpo ::= BcositasR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Cuerpo",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Atributos ::= Atributos Valor 
            {
              Object RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object l = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.out.println();
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Atributos",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Atributos ::= Valor 
            {
              Object RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object l = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.out.println();
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Atributos",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Valor ::= letter equal apos BcositasR apos 
            {
              Object RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String m = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = "attr:"+m + " val:"+s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Valor",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Valor ::= letter equal keyO BcositasR keyC 
            {
              Object RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String m = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = "attr:"+m + " val:"+s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Valor",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Valor ::= letter equal nro 
            {
              Object RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String m = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = "attr:"+m + "val:"+s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Valor",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // tag ::= letter 
            {
              Object RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String m = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT =m;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tag",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // BcositasR ::= BcositasR Bcositas 
            {
              Object RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object m = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = m +""+p;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("BcositasR",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // BcositasR ::= Bcositas 
            {
              Object RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object m = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = m;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("BcositasR",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Bcositas ::= letter 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= x;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Bcositas",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Bcositas ::= nro 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= x;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Bcositas",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Bcositas ::= HEXA 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= x;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Bcositas",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Bcositas ::= coma 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= x;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Bcositas",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Bcositas ::= plus 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= x;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Bcositas",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Bcositas ::= por 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= x;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Bcositas",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Bcositas ::= gion 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= x;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Bcositas",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Bcositas ::= parA 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= x;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Bcositas",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // Bcositas ::= parC 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT= x;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Bcositas",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
