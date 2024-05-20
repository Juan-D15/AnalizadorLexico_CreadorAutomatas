package Analizador;
import java_cup.runtime.Symbol;

class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  6,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 40,  7,  0,  0, 30, 38,  0, 43, 44,  5, 28,  3, 29, 31,  4, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0, 49, 42, 27, 41,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1, 25,  1,  1,  1,  1,  1,  1,  1, 47,  0, 48,  0,  1, 
     0, 16,  8, 14, 22, 11, 21, 20, 15, 12,  1, 32, 18, 36, 13, 19, 
    35,  1, 17, 24, 10, 23, 34, 26, 33,  9, 37, 45, 39, 46,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\20\2\1\10\1\11\1\12\1\13\1\14\3\2\3\15"+
    "\2\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\4\1\0\1\26\10\2\1\27\25\2\1\30\7\2"+
    "\1\16\1\31\6\2\1\15\2\0\6\2\1\32\4\2"+
    "\1\33\3\2\1\34\22\2\1\35\12\2\1\36\6\2"+
    "\1\0\1\4\1\0\1\33\3\2\1\37\3\2\1\40"+
    "\1\41\7\2\1\42\1\2\1\43\1\44\5\2\1\45"+
    "\3\2\1\46\13\2\1\47\4\2\1\50\1\3\1\2"+
    "\1\51\2\2\1\52\3\2\1\53\4\2\1\54\1\55"+
    "\1\2\1\56\2\2\1\57\2\2\1\60\4\2\1\61"+
    "\2\2\1\62\7\2\1\52\5\2\1\63\1\64\2\2"+
    "\1\65\3\2\1\66\2\2\1\67\1\70\1\71\3\2"+
    "\1\72\1\73\2\2\1\74\6\2\1\75\1\76\1\77"+
    "\1\2\1\100\1\101\6\2\1\102\1\103\1\104\3\2"+
    "\1\105\1\106\3\2\1\107\1\110\1\111\1\112\2\2"+
    "\1\113";

  private static int [] zzUnpackAction() {
    int [] result = new int[302];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\62"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\u02ee\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c"+
    "\0\u047e\0\u04b0\0\u04e2\0\u012c\0\62\0\u0514\0\u0546\0\u0578"+
    "\0\u05aa\0\u05dc\0\u047e\0\u060e\0\u0640\0\u0672\0\62\0\62"+
    "\0\62\0\62\0\62\0\62\0\u06a4\0\u06d6\0\62\0\u0708"+
    "\0\u073a\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\144"+
    "\0\u0898\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u0992\0\u09c4\0\u09f6"+
    "\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86"+
    "\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16"+
    "\0\u0d48\0\u0d7a\0\u0dac\0\u0dde\0\u0e10\0\62\0\62\0\u0e42"+
    "\0\u0e74\0\u0ea6\0\u0ed8\0\u0f0a\0\u0f3c\0\62\0\u0f6e\0\u0fa0"+
    "\0\u0fd2\0\u1004\0\u1036\0\u1068\0\u109a\0\u10cc\0\144\0\u10fe"+
    "\0\u1130\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u125c\0\144"+
    "\0\u128e\0\u12c0\0\u12f2\0\u1324\0\u1356\0\u1388\0\u13ba\0\u13ec"+
    "\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u154a\0\u157c"+
    "\0\u15ae\0\u15e0\0\144\0\u1612\0\u1644\0\u1676\0\u16a8\0\u16da"+
    "\0\u170c\0\u173e\0\u1770\0\u17a2\0\u17d4\0\144\0\u1806\0\u1838"+
    "\0\u186a\0\u189c\0\u18ce\0\u1900\0\u1932\0\62\0\u1964\0\144"+
    "\0\u1996\0\u19c8\0\u19fa\0\144\0\u1a2c\0\u1a5e\0\u1a90\0\144"+
    "\0\144\0\u1ac2\0\u1af4\0\u1b26\0\u1b58\0\u1b8a\0\u1bbc\0\u1bee"+
    "\0\144\0\u1c20\0\144\0\144\0\u1c52\0\u1c84\0\u1cb6\0\u1ce8"+
    "\0\u1d1a\0\144\0\u1d4c\0\u1d7e\0\u1db0\0\144\0\u1de2\0\u1e14"+
    "\0\u1e46\0\u1e78\0\u1eaa\0\u1edc\0\u1f0e\0\u1f40\0\u1f72\0\u1fa4"+
    "\0\u1fd6\0\144\0\u2008\0\u203a\0\u206c\0\u209e\0\144\0\62"+
    "\0\u20d0\0\144\0\u2102\0\u2134\0\u2166\0\u2198\0\u21ca\0\u21fc"+
    "\0\144\0\u222e\0\u2260\0\u2292\0\u22c4\0\144\0\144\0\u22f6"+
    "\0\144\0\u2328\0\u235a\0\144\0\u238c\0\u23be\0\u23f0\0\u2422"+
    "\0\u2454\0\u2486\0\u24b8\0\144\0\u24ea\0\u251c\0\144\0\u254e"+
    "\0\u2580\0\u25b2\0\u25e4\0\u2616\0\u2648\0\u267a\0\144\0\u26ac"+
    "\0\u26de\0\u2710\0\u2742\0\u2774\0\144\0\144\0\u27a6\0\u27d8"+
    "\0\144\0\u280a\0\u283c\0\u286e\0\144\0\u28a0\0\u28d2\0\144"+
    "\0\144\0\144\0\u2904\0\u2936\0\u2968\0\144\0\144\0\u299a"+
    "\0\u29cc\0\144\0\u29fe\0\u2a30\0\u2a62\0\u2a94\0\u2ac6\0\u2af8"+
    "\0\144\0\144\0\144\0\u2b2a\0\144\0\144\0\u2b5c\0\u2b8e"+
    "\0\u2bc0\0\u2bf2\0\u2c24\0\u2c56\0\144\0\144\0\144\0\u2c88"+
    "\0\u2cba\0\u2cec\0\144\0\144\0\u2d1e\0\u2d50\0\u2d82\0\144"+
    "\0\144\0\144\0\144\0\u2db4\0\u2de6\0\144";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[302];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\5\1\10"+
    "\1\11\1\3\1\12\1\13\1\14\1\15\1\16\1\3"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\3"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\2\3\1\36\1\37\1\40\1\3\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\63\0\2\3\5\0\23\3\5\0\6\3\16\0"+
    "\1\4\62\0\1\5\2\0\1\5\57\0\1\55\1\56"+
    "\25\0\1\57\61\0\1\57\27\0\2\3\5\0\1\3"+
    "\1\60\7\3\1\61\1\3\1\62\7\3\5\0\6\3"+
    "\15\0\2\3\5\0\7\3\1\63\1\3\1\64\11\3"+
    "\5\0\6\3\15\0\2\3\5\0\12\3\1\65\10\3"+
    "\5\0\1\3\1\66\4\3\15\0\2\3\5\0\5\3"+
    "\1\67\7\3\1\70\5\3\5\0\4\3\1\71\1\3"+
    "\15\0\2\3\5\0\3\3\1\72\4\3\1\73\6\3"+
    "\1\74\3\3\5\0\6\3\15\0\2\3\5\0\7\3"+
    "\1\75\1\76\1\3\1\77\1\100\7\3\5\0\6\3"+
    "\15\0\2\3\5\0\1\101\22\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\102\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\13\3\1\103\7\3\5\0\6\3\15\0"+
    "\2\3\5\0\17\3\1\104\3\3\5\0\3\3\1\105"+
    "\2\3\15\0\2\3\5\0\3\3\1\106\7\3\1\107"+
    "\7\3\5\0\6\3\15\0\2\3\5\0\4\3\1\110"+
    "\3\3\1\111\1\3\1\112\1\113\3\3\1\114\3\3"+
    "\5\0\6\3\15\0\2\3\5\0\3\3\1\115\7\3"+
    "\1\116\7\3\5\0\6\3\15\0\2\3\5\0\1\3"+
    "\1\117\1\120\4\3\1\121\7\3\1\122\2\3\1\123"+
    "\5\0\6\3\15\0\2\3\5\0\2\3\1\124\20\3"+
    "\5\0\6\3\15\0\2\3\5\0\7\3\1\125\13\3"+
    "\5\0\6\3\47\0\1\126\61\0\1\57\1\127\60\0"+
    "\1\57\1\0\1\127\25\0\2\3\5\0\10\3\1\130"+
    "\2\3\1\131\7\3\5\0\6\3\15\0\2\3\5\0"+
    "\10\3\1\132\1\133\5\3\1\134\3\3\5\0\6\3"+
    "\15\0\2\3\5\0\10\3\1\135\12\3\5\0\6\3"+
    "\62\0\1\136\62\0\1\136\45\0\1\126\15\0\1\126"+
    "\43\0\1\126\16\0\1\126\44\0\1\137\24\0\6\55"+
    "\1\0\53\55\5\56\1\140\54\56\1\0\2\3\5\0"+
    "\2\3\1\141\20\3\5\0\2\3\1\142\3\3\15\0"+
    "\2\3\5\0\3\3\1\143\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\13\3\1\144\7\3\5\0\6\3\15\0"+
    "\2\3\5\0\4\3\1\145\4\3\1\146\11\3\5\0"+
    "\6\3\15\0\2\3\5\0\1\3\1\147\6\3\1\150"+
    "\6\3\1\151\3\3\5\0\6\3\15\0\2\3\5\0"+
    "\20\3\1\152\2\3\5\0\6\3\15\0\2\3\5\0"+
    "\2\3\1\153\20\3\5\0\6\3\15\0\2\3\5\0"+
    "\2\3\1\154\2\3\1\155\12\3\1\156\2\3\5\0"+
    "\6\3\15\0\2\3\5\0\23\3\5\0\3\3\1\157"+
    "\2\3\15\0\2\3\5\0\22\3\1\160\5\0\6\3"+
    "\15\0\2\3\5\0\2\3\1\161\20\3\5\0\6\3"+
    "\15\0\2\3\5\0\12\3\1\162\10\3\5\0\6\3"+
    "\15\0\2\3\5\0\10\3\1\163\12\3\5\0\6\3"+
    "\15\0\2\3\5\0\2\3\1\164\15\3\1\165\2\3"+
    "\5\0\6\3\15\0\2\3\5\0\10\3\1\166\12\3"+
    "\5\0\6\3\15\0\2\3\5\0\5\3\1\167\15\3"+
    "\5\0\6\3\15\0\2\3\5\0\20\3\1\170\2\3"+
    "\5\0\6\3\15\0\2\3\5\0\2\3\1\171\15\3"+
    "\1\172\2\3\5\0\6\3\15\0\2\3\5\0\5\3"+
    "\1\173\15\3\5\0\6\3\15\0\2\3\5\0\2\3"+
    "\1\174\20\3\5\0\6\3\15\0\2\3\5\0\3\3"+
    "\1\175\17\3\5\0\6\3\15\0\2\3\5\0\5\3"+
    "\1\176\15\3\5\0\6\3\15\0\2\3\5\0\2\3"+
    "\1\177\20\3\5\0\6\3\15\0\2\3\5\0\5\3"+
    "\1\200\15\3\5\0\6\3\15\0\2\3\5\0\12\3"+
    "\1\201\10\3\5\0\6\3\15\0\2\3\5\0\13\3"+
    "\1\202\7\3\5\0\6\3\15\0\2\3\5\0\11\3"+
    "\1\203\11\3\5\0\6\3\15\0\2\3\5\0\2\3"+
    "\1\204\20\3\5\0\6\3\15\0\2\3\5\0\15\3"+
    "\1\205\5\3\5\0\6\3\15\0\2\3\5\0\17\3"+
    "\1\206\3\3\5\0\6\3\15\0\2\3\5\0\5\3"+
    "\1\207\15\3\5\0\6\3\15\0\2\3\5\0\10\3"+
    "\1\210\12\3\5\0\6\3\15\0\2\3\5\0\13\3"+
    "\1\211\7\3\5\0\6\3\15\0\2\3\5\0\23\3"+
    "\5\0\3\3\1\212\2\3\15\0\2\3\5\0\4\3"+
    "\1\213\16\3\5\0\6\3\15\0\2\3\5\0\11\3"+
    "\1\214\11\3\5\0\6\3\15\0\2\3\5\0\4\3"+
    "\1\215\16\3\5\0\6\3\15\0\2\3\5\0\11\3"+
    "\1\216\11\3\5\0\6\3\15\0\2\3\5\0\4\3"+
    "\1\217\16\3\5\0\6\3\15\0\2\3\5\0\6\3"+
    "\1\220\14\3\5\0\6\3\15\0\2\3\5\0\4\3"+
    "\1\221\6\3\1\222\7\3\5\0\6\3\15\0\2\3"+
    "\5\0\1\223\22\3\5\0\6\3\15\0\2\3\5\0"+
    "\4\3\1\224\16\3\5\0\6\3\16\0\1\225\57\0"+
    "\4\56\1\226\1\227\54\56\1\0\2\3\5\0\3\3"+
    "\1\230\17\3\5\0\6\3\15\0\2\3\5\0\10\3"+
    "\1\231\12\3\5\0\6\3\15\0\2\3\5\0\10\3"+
    "\1\232\12\3\5\0\6\3\15\0\2\3\5\0\12\3"+
    "\1\233\10\3\5\0\6\3\15\0\2\3\5\0\20\3"+
    "\1\234\2\3\5\0\6\3\15\0\2\3\5\0\3\3"+
    "\1\235\7\3\1\236\7\3\5\0\6\3\15\0\2\3"+
    "\5\0\5\3\1\237\15\3\5\0\6\3\15\0\2\3"+
    "\5\0\3\3\1\240\17\3\5\0\6\3\15\0\2\3"+
    "\5\0\3\3\1\241\17\3\5\0\6\3\15\0\2\3"+
    "\5\0\3\3\1\242\17\3\5\0\6\3\15\0\2\3"+
    "\5\0\3\3\1\243\17\3\5\0\6\3\15\0\2\3"+
    "\5\0\3\3\1\244\17\3\5\0\6\3\15\0\2\3"+
    "\5\0\2\3\1\245\20\3\5\0\6\3\15\0\2\3"+
    "\5\0\12\3\1\246\1\247\7\3\5\0\6\3\15\0"+
    "\2\3\5\0\4\3\1\250\16\3\5\0\6\3\15\0"+
    "\2\3\5\0\12\3\1\251\10\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\230\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\6\3\1\252\14\3\5\0\6\3\15\0"+
    "\2\3\5\0\2\3\1\253\1\254\17\3\5\0\6\3"+
    "\15\0\2\3\5\0\20\3\1\255\2\3\5\0\6\3"+
    "\15\0\2\3\5\0\2\3\1\256\15\3\1\257\2\3"+
    "\5\0\6\3\15\0\2\3\5\0\2\3\1\260\20\3"+
    "\5\0\6\3\15\0\2\3\5\0\17\3\1\261\3\3"+
    "\5\0\6\3\15\0\2\3\5\0\2\3\1\262\20\3"+
    "\5\0\6\3\15\0\2\3\5\0\14\3\1\230\6\3"+
    "\5\0\6\3\15\0\2\3\5\0\3\3\1\263\17\3"+
    "\5\0\6\3\15\0\2\3\5\0\11\3\1\264\11\3"+
    "\5\0\6\3\15\0\2\3\5\0\3\3\1\265\17\3"+
    "\5\0\6\3\15\0\2\3\5\0\13\3\1\266\7\3"+
    "\5\0\6\3\15\0\2\3\5\0\10\3\1\267\12\3"+
    "\5\0\6\3\15\0\2\3\5\0\20\3\1\151\2\3"+
    "\5\0\6\3\15\0\2\3\5\0\10\3\1\270\12\3"+
    "\5\0\6\3\15\0\2\3\5\0\17\3\1\271\3\3"+
    "\5\0\6\3\15\0\2\3\5\0\10\3\1\272\12\3"+
    "\5\0\6\3\15\0\2\3\5\0\1\273\22\3\5\0"+
    "\6\3\15\0\2\3\5\0\6\3\1\274\14\3\5\0"+
    "\6\3\15\0\2\3\5\0\2\3\1\275\20\3\5\0"+
    "\6\3\15\0\2\3\5\0\11\3\1\270\11\3\5\0"+
    "\6\3\15\0\2\3\5\0\3\3\1\276\17\3\5\0"+
    "\6\3\15\0\2\3\5\0\2\3\1\277\20\3\5\0"+
    "\6\3\15\0\2\3\5\0\4\3\1\300\16\3\5\0"+
    "\6\3\15\0\2\3\5\0\12\3\1\301\10\3\5\0"+
    "\6\3\15\0\2\3\5\0\16\3\1\302\4\3\5\0"+
    "\6\3\15\0\2\3\5\0\23\3\5\0\1\303\5\3"+
    "\15\0\2\3\5\0\23\3\5\0\2\3\1\304\3\3"+
    "\15\0\2\3\5\0\2\3\1\305\20\3\5\0\6\3"+
    "\15\0\2\3\5\0\12\3\1\306\10\3\5\0\6\3"+
    "\15\0\2\3\5\0\5\3\1\307\15\3\5\0\6\3"+
    "\16\0\1\225\51\0\1\310\5\0\4\56\1\0\1\227"+
    "\54\56\1\0\2\3\5\0\12\3\1\311\10\3\5\0"+
    "\6\3\15\0\2\3\5\0\23\3\5\0\1\312\5\3"+
    "\15\0\2\3\5\0\3\3\1\313\17\3\5\0\6\3"+
    "\15\0\2\3\5\0\10\3\1\314\12\3\5\0\6\3"+
    "\15\0\2\3\5\0\22\3\1\315\5\0\6\3\15\0"+
    "\2\3\5\0\20\3\1\316\2\3\5\0\6\3\15\0"+
    "\2\3\5\0\5\3\1\317\15\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\320\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\321\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\10\3\1\322\12\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\323\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\324\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\23\3\5\0\2\3\1\325\3\3\15\0"+
    "\2\3\5\0\7\3\1\326\13\3\5\0\6\3\15\0"+
    "\2\3\5\0\20\3\1\327\2\3\5\0\6\3\15\0"+
    "\2\3\5\0\4\3\1\330\16\3\5\0\6\3\15\0"+
    "\2\3\5\0\2\3\1\331\20\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\332\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\333\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\334\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\10\3\1\335\12\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\336\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\12\3\1\337\10\3\5\0\6\3\15\0"+
    "\2\3\5\0\2\3\1\230\20\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\340\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\17\3\1\341\3\3\5\0\6\3\15\0"+
    "\2\3\5\0\12\3\1\141\10\3\5\0\6\3\15\0"+
    "\2\3\5\0\7\3\1\342\13\3\5\0\6\3\15\0"+
    "\2\3\5\0\4\3\1\343\16\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\344\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\6\3\1\345\14\3\5\0\6\3\15\0"+
    "\2\3\5\0\5\3\1\346\15\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\347\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\10\3\1\350\12\3\5\0\6\3\15\0"+
    "\2\3\5\0\10\3\1\351\12\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\352\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\4\3\1\353\16\3\5\0\6\3\15\0"+
    "\2\3\5\0\17\3\1\354\3\3\5\0\6\3\15\0"+
    "\2\3\5\0\10\3\1\355\12\3\5\0\6\3\15\0"+
    "\2\3\5\0\16\3\1\356\4\3\5\0\6\3\15\0"+
    "\2\3\5\0\20\3\1\357\2\3\5\0\6\3\15\0"+
    "\2\3\5\0\4\3\1\360\16\3\5\0\6\3\15\0"+
    "\2\3\5\0\16\3\1\361\4\3\5\0\6\3\15\0"+
    "\2\3\5\0\15\3\1\362\5\3\5\0\6\3\15\0"+
    "\2\3\5\0\5\3\1\363\15\3\5\0\6\3\15\0"+
    "\2\3\5\0\23\3\5\0\4\3\1\364\1\3\15\0"+
    "\2\3\5\0\2\3\1\365\20\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\366\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\5\3\1\367\15\3\5\0\6\3\15\0"+
    "\2\3\5\0\10\3\1\370\12\3\5\0\6\3\15\0"+
    "\2\3\5\0\5\3\1\371\15\3\5\0\6\3\15\0"+
    "\2\3\5\0\2\3\1\372\20\3\5\0\6\3\15\0"+
    "\2\3\5\0\4\3\1\373\16\3\5\0\6\3\15\0"+
    "\2\3\5\0\12\3\1\374\10\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\375\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\12\3\1\376\10\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\377\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\6\3\1\u0100\14\3\5\0\6\3\15\0"+
    "\2\3\5\0\7\3\1\u0101\13\3\5\0\6\3\15\0"+
    "\2\3\5\0\14\3\1\u0102\6\3\5\0\6\3\15\0"+
    "\2\3\5\0\14\3\1\u0103\6\3\5\0\6\3\15\0"+
    "\2\3\5\0\2\3\1\u0104\20\3\5\0\6\3\15\0"+
    "\2\3\5\0\6\3\1\u0105\14\3\5\0\6\3\15\0"+
    "\2\3\5\0\6\3\1\u0106\14\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\u0107\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\5\3\1\230\15\3\5\0\6\3\15\0"+
    "\2\3\5\0\20\3\1\u0108\2\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\u0109\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\20\3\1\u010a\2\3\5\0\6\3\15\0"+
    "\2\3\5\0\10\3\1\u010b\12\3\5\0\6\3\15\0"+
    "\2\3\5\0\6\3\1\u010c\14\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\u010d\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\17\3\1\u010e\3\3\5\0\6\3\15\0"+
    "\2\3\5\0\6\3\1\u010f\14\3\5\0\6\3\15\0"+
    "\2\3\5\0\13\3\1\u0110\7\3\5\0\6\3\15\0"+
    "\2\3\5\0\6\3\1\u0111\14\3\5\0\6\3\15\0"+
    "\2\3\5\0\1\3\1\u0112\21\3\5\0\6\3\15\0"+
    "\2\3\5\0\2\3\1\u0113\20\3\5\0\6\3\15\0"+
    "\2\3\5\0\13\3\1\u0114\7\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\u0115\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\u0116\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\2\3\1\u0117\20\3\5\0\6\3\15\0"+
    "\2\3\5\0\10\3\1\u0118\12\3\5\0\6\3\15\0"+
    "\2\3\5\0\5\3\1\u0119\15\3\5\0\6\3\15\0"+
    "\2\3\5\0\6\3\1\u011a\14\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\u011b\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\5\3\1\u011c\15\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\u011d\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\2\3\1\u011e\20\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\u011f\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\5\3\1\u0120\15\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\u0121\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\15\3\1\u0122\5\3\5\0\6\3\15\0"+
    "\2\3\5\0\2\3\1\u0123\20\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\u0124\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\13\3\1\u0125\7\3\5\0\6\3\15\0"+
    "\2\3\5\0\2\3\1\u0126\20\3\5\0\6\3\15\0"+
    "\2\3\5\0\4\3\1\u0127\16\3\5\0\6\3\15\0"+
    "\2\3\5\0\16\3\1\u0128\4\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\u0129\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\15\3\1\u012a\5\3\5\0\6\3\15\0"+
    "\2\3\5\0\20\3\1\u012b\2\3\5\0\6\3\15\0"+
    "\2\3\5\0\23\3\5\0\5\3\1\u012c\15\0\2\3"+
    "\5\0\3\3\1\u012d\17\3\5\0\6\3\15\0\2\3"+
    "\5\0\16\3\1\u012e\4\3\5\0\6\3\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11800];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\1\11\24\1\1\11\11\1\6\11"+
    "\1\1\1\0\1\11\46\1\2\11\6\1\1\11\2\0"+
    "\64\1\1\0\1\11\1\0\60\1\1\11\146\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[302];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 58: 
          { return new Symbol(sym.Public, yychar, yyline, yytext());
          }
        case 76: break;
        case 7: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 77: break;
        case 29: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 78: break;
        case 60: 
          { return new Symbol(sym.Extends, yychar, yyline, yytext());
          }
        case 79: break;
        case 15: 
          { return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());
          }
        case 80: break;
        case 14: 
          { return new Symbol(sym.Op_relacional, yychar, yyline, yytext());
          }
        case 81: break;
        case 27: 
          { return new Symbol(sym.T_dato, yychar, yyline, yytext());
          }
        case 82: break;
        case 32: 
          { return new Symbol(sym.Op_booleano, yychar, yyline, yytext());
          }
        case 83: break;
        case 31: 
          { return new Symbol(sym.This, yychar, yyline, yytext());
          }
        case 84: break;
        case 13: 
          { return new Symbol(sym.Op_logico, yychar, yyline, yytext());
          }
        case 85: break;
        case 62: 
          { return new Symbol(sym.Finally, yychar, yyline, yytext());
          }
        case 86: break;
        case 69: 
          { return new Symbol(sym.Transient, yychar, yyline, yytext());
          }
        case 87: break;
        case 63: 
          { return new Symbol(sym.Default, yychar, yyline, yytext());
          }
        case 88: break;
        case 40: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 89: break;
        case 17: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 90: break;
        case 41: 
          { return new Symbol(sym.Break, yychar, yyline, yytext());
          }
        case 91: break;
        case 4: 
          { /*Ignore*/
          }
        case 92: break;
        case 71: 
          { return new Symbol(sym.Protected, yychar, yyline, yytext());
          }
        case 93: break;
        case 44: 
          { return new Symbol(sym.Catch, yychar, yyline, yytext());
          }
        case 94: break;
        case 57: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 95: break;
        case 56: 
          { return new Symbol(sym.Switch, yychar, yyline, yytext());
          }
        case 96: break;
        case 21: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 97: break;
        case 34: 
          { return new Symbol(sym.Null, yychar, yyline, yytext());
          }
        case 98: break;
        case 6: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 99: break;
        case 66: 
          { return new Symbol(sym.Continue, yychar, yyline, yytext());
          }
        case 100: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 101: break;
        case 43: 
          { return new Symbol(sym.Inner, yychar, yyline, yytext());
          }
        case 102: break;
        case 74: 
          { return new Symbol(sym.Implements, yychar, yyline, yytext());
          }
        case 103: break;
        case 22: 
          { return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());
          }
        case 104: break;
        case 11: 
          { return new Symbol(sym.Modulo, yychar, yyline, yytext());
          }
        case 105: break;
        case 52: 
          { return new Symbol(sym.Native, yychar, yyline, yytext());
          }
        case 106: break;
        case 70: 
          { return new Symbol(sym.Interface, yychar, yyline, yytext());
          }
        case 107: break;
        case 45: 
          { return new Symbol(sym.Class, yychar, yyline, yytext());
          }
        case 108: break;
        case 59: 
          { return new Symbol(sym.By_value, yychar, yyline, yytext());
          }
        case 109: break;
        case 8: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 110: break;
        case 36: 
          { return new Symbol(sym.Case, yychar, yyline, yytext());
          }
        case 111: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 112: break;
        case 20: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 113: break;
        case 33: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 114: break;
        case 67: 
          { return new Symbol(sym.Abstract, yychar, yyline, yytext());
          }
        case 115: break;
        case 28: 
          { return new Symbol(sym.New, yychar, yyline, yytext());
          }
        case 116: break;
        case 49: 
          { return new Symbol(sym.Super, yychar, yyline, yytext());
          }
        case 117: break;
        case 47: 
          { return new Symbol(sym.Outer, yychar, yyline, yytext());
          }
        case 118: break;
        case 9: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 119: break;
        case 35: 
          { return new Symbol(sym.Cast, yychar, yyline, yytext());
          }
        case 120: break;
        case 65: 
          { return new Symbol(sym.Private, yychar, yyline, yytext());
          }
        case 121: break;
        case 64: 
          { return new Symbol(sym.Package, yychar, yyline, yytext());
          }
        case 122: break;
        case 54: 
          { return new Symbol(sym.Future, yychar, yyline, yytext());
          }
        case 123: break;
        case 42: 
          { return new Symbol(sym.Throw_s, yychar, yyline, yytext());
          }
        case 124: break;
        case 16: 
          { return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());
          }
        case 125: break;
        case 23: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 126: break;
        case 18: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 127: break;
        case 12: 
          { return new Symbol(sym.Punto, yychar, yyline, yytext());
          }
        case 128: break;
        case 37: 
          { return new Symbol(sym.Rest, yychar, yyline, yytext());
          }
        case 129: break;
        case 39: 
          { return new Symbol(sym.Void, yychar, yyline, yytext());
          }
        case 130: break;
        case 68: 
          { return new Symbol(sym.Operator, yychar, yyline, yytext());
          }
        case 131: break;
        case 75: 
          { return new Symbol(sym.Synchronized, yychar, yyline, yytext());
          }
        case 132: break;
        case 24: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 133: break;
        case 5: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 134: break;
        case 25: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 135: break;
        case 38: 
          { return new Symbol(sym.Goto, yychar, yyline, yytext());
          }
        case 136: break;
        case 10: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 137: break;
        case 55: 
          { return new Symbol(sym.Static, yychar, yyline, yytext());
          }
        case 138: break;
        case 72: 
          { return new Symbol(sym.Threadsafe, yychar, yyline, yytext());
          }
        case 139: break;
        case 30: 
          { return new Symbol(sym.Var, yychar, yyline, yytext());
          }
        case 140: break;
        case 46: 
          { return new Symbol(sym.Const, yychar, yyline, yytext());
          }
        case 141: break;
        case 51: 
          { return new Symbol(sym.Import, yychar, yyline, yytext());
          }
        case 142: break;
        case 53: 
          { return new Symbol(sym.Return, yychar, yyline, yytext());
          }
        case 143: break;
        case 50: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 144: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 145: break;
        case 73: 
          { return new Symbol(sym.Instanceof, yychar, yyline, yytext());
          }
        case 146: break;
        case 48: 
          { return new Symbol(sym.Final, yychar, yyline, yytext());
          }
        case 147: break;
        case 26: 
          { return new Symbol(sym.Try, yychar, yyline, yytext());
          }
        case 148: break;
        case 61: 
          { return new Symbol(sym.Generic, yychar, yyline, yytext());
          }
        case 149: break;
        case 19: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 150: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
