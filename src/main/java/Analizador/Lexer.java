package Analizador;
import static Analizador.Tokens.*;


class Lexer {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\6\2\0\1\3\22\0\1\3\1\50\1\7\2\0"+
    "\1\36\1\46\1\0\1\53\1\54\1\5\1\34\1\3\1\35\1\37"+
    "\1\4\12\2\1\0\1\61\1\52\1\33\1\51\2\0\22\1\1\31"+
    "\7\1\1\57\1\0\1\60\1\0\1\1\1\0\1\20\1\10\1\16"+
    "\1\26\1\13\1\25\1\24\1\17\1\14\1\1\1\40\1\22\1\44"+
    "\1\15\1\23\1\43\1\1\1\21\1\30\1\12\1\27\1\42\1\32"+
    "\1\41\1\11\1\45\1\55\1\47\1\56\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\20\2\1\11\1\12\1\13\1\14\1\15\3\2"+
    "\3\16\2\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\4\1\0\1\27\10\2\1\30\25\2\1\31"+
    "\7\2\1\17\1\32\6\2\1\16\2\0\6\2\1\33"+
    "\4\2\1\34\3\2\1\35\22\2\1\36\12\2\1\37"+
    "\6\2\1\0\1\4\1\0\1\34\3\2\1\40\3\2"+
    "\1\41\1\42\7\2\1\43\1\2\1\44\1\45\5\2"+
    "\1\46\3\2\1\47\13\2\1\50\4\2\1\51\1\3"+
    "\1\2\1\52\2\2\1\53\3\2\1\54\4\2\1\55"+
    "\1\56\1\2\1\57\2\2\1\60\2\2\1\61\4\2"+
    "\1\62\2\2\1\63\7\2\1\53\5\2\1\64\1\65"+
    "\2\2\1\66\3\2\1\67\2\2\1\70\1\71\1\72"+
    "\3\2\1\73\1\74\2\2\1\75\6\2\1\76\1\77"+
    "\1\100\1\2\1\101\1\102\6\2\1\103\1\104\1\105"+
    "\3\2\1\106\1\107\3\2\1\110\1\111\1\112\1\113"+
    "\2\2\1\114";

  private static int [] zzUnpackAction() {
    int [] result = new int[303];
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
    "\0\62\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a"+
    "\0\u02bc\0\u02ee\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a"+
    "\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u012c\0\62\0\u0514\0\u0546"+
    "\0\u0578\0\u05aa\0\u05dc\0\u047e\0\u060e\0\u0640\0\u0672\0\62"+
    "\0\62\0\62\0\62\0\62\0\62\0\u06a4\0\u06d6\0\62"+
    "\0\u0708\0\u073a\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866"+
    "\0\144\0\u0898\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u0992\0\u09c4"+
    "\0\u09f6\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\u0b54"+
    "\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4"+
    "\0\u0d16\0\u0d48\0\u0d7a\0\u0dac\0\u0dde\0\u0e10\0\62\0\62"+
    "\0\u0e42\0\u0e74\0\u0ea6\0\u0ed8\0\u0f0a\0\u0f3c\0\62\0\u0f6e"+
    "\0\u0fa0\0\u0fd2\0\u1004\0\u1036\0\u1068\0\u109a\0\u10cc\0\144"+
    "\0\u10fe\0\u1130\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u125c"+
    "\0\144\0\u128e\0\u12c0\0\u12f2\0\u1324\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u154a"+
    "\0\u157c\0\u15ae\0\u15e0\0\144\0\u1612\0\u1644\0\u1676\0\u16a8"+
    "\0\u16da\0\u170c\0\u173e\0\u1770\0\u17a2\0\u17d4\0\144\0\u1806"+
    "\0\u1838\0\u186a\0\u189c\0\u18ce\0\u1900\0\u1932\0\62\0\u1964"+
    "\0\144\0\u1996\0\u19c8\0\u19fa\0\144\0\u1a2c\0\u1a5e\0\u1a90"+
    "\0\144\0\144\0\u1ac2\0\u1af4\0\u1b26\0\u1b58\0\u1b8a\0\u1bbc"+
    "\0\u1bee\0\144\0\u1c20\0\144\0\144\0\u1c52\0\u1c84\0\u1cb6"+
    "\0\u1ce8\0\u1d1a\0\144\0\u1d4c\0\u1d7e\0\u1db0\0\144\0\u1de2"+
    "\0\u1e14\0\u1e46\0\u1e78\0\u1eaa\0\u1edc\0\u1f0e\0\u1f40\0\u1f72"+
    "\0\u1fa4\0\u1fd6\0\144\0\u2008\0\u203a\0\u206c\0\u209e\0\144"+
    "\0\62\0\u20d0\0\144\0\u2102\0\u2134\0\u2166\0\u2198\0\u21ca"+
    "\0\u21fc\0\144\0\u222e\0\u2260\0\u2292\0\u22c4\0\144\0\144"+
    "\0\u22f6\0\144\0\u2328\0\u235a\0\144\0\u238c\0\u23be\0\u23f0"+
    "\0\u2422\0\u2454\0\u2486\0\u24b8\0\144\0\u24ea\0\u251c\0\144"+
    "\0\u254e\0\u2580\0\u25b2\0\u25e4\0\u2616\0\u2648\0\u267a\0\144"+
    "\0\u26ac\0\u26de\0\u2710\0\u2742\0\u2774\0\144\0\144\0\u27a6"+
    "\0\u27d8\0\144\0\u280a\0\u283c\0\u286e\0\144\0\u28a0\0\u28d2"+
    "\0\144\0\144\0\144\0\u2904\0\u2936\0\u2968\0\144\0\144"+
    "\0\u299a\0\u29cc\0\144\0\u29fe\0\u2a30\0\u2a62\0\u2a94\0\u2ac6"+
    "\0\u2af8\0\144\0\144\0\144\0\u2b2a\0\144\0\144\0\u2b5c"+
    "\0\u2b8e\0\u2bc0\0\u2bf2\0\u2c24\0\u2c56\0\144\0\144\0\144"+
    "\0\u2c88\0\u2cba\0\u2cec\0\144\0\144\0\u2d1e\0\u2d50\0\u2d82"+
    "\0\144\0\144\0\144\0\144\0\u2db4\0\u2de6\0\144";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[303];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\3\1\13\1\14\1\15\1\16\1\17\1\3"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\3"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\2\3\1\37\1\40\1\41\1\3\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\63\0\2\3\5\0\23\3\5\0\6\3\16\0"+
    "\1\4\62\0\1\5\62\0\1\56\1\57\25\0\1\60"+
    "\61\0\1\60\27\0\2\3\5\0\1\3\1\61\7\3"+
    "\1\62\1\3\1\63\7\3\5\0\6\3\15\0\2\3"+
    "\5\0\7\3\1\64\1\3\1\65\11\3\5\0\6\3"+
    "\15\0\2\3\5\0\12\3\1\66\10\3\5\0\1\3"+
    "\1\67\4\3\15\0\2\3\5\0\5\3\1\70\7\3"+
    "\1\71\5\3\5\0\4\3\1\72\1\3\15\0\2\3"+
    "\5\0\3\3\1\73\4\3\1\74\6\3\1\75\3\3"+
    "\5\0\6\3\15\0\2\3\5\0\7\3\1\76\1\77"+
    "\1\3\1\100\1\101\7\3\5\0\6\3\15\0\2\3"+
    "\5\0\1\102\22\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\103\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\13\3\1\104\7\3\5\0\6\3\15\0\2\3\5\0"+
    "\17\3\1\105\3\3\5\0\3\3\1\106\2\3\15\0"+
    "\2\3\5\0\3\3\1\107\7\3\1\110\7\3\5\0"+
    "\6\3\15\0\2\3\5\0\4\3\1\111\3\3\1\112"+
    "\1\3\1\113\1\114\3\3\1\115\3\3\5\0\6\3"+
    "\15\0\2\3\5\0\3\3\1\116\7\3\1\117\7\3"+
    "\5\0\6\3\15\0\2\3\5\0\1\3\1\120\1\121"+
    "\4\3\1\122\7\3\1\123\2\3\1\124\5\0\6\3"+
    "\15\0\2\3\5\0\2\3\1\125\20\3\5\0\6\3"+
    "\15\0\2\3\5\0\7\3\1\126\13\3\5\0\6\3"+
    "\47\0\1\127\61\0\1\60\1\130\60\0\1\60\1\0"+
    "\1\130\25\0\2\3\5\0\10\3\1\131\2\3\1\132"+
    "\7\3\5\0\6\3\15\0\2\3\5\0\10\3\1\133"+
    "\1\134\5\3\1\135\3\3\5\0\6\3\15\0\2\3"+
    "\5\0\10\3\1\136\12\3\5\0\6\3\62\0\1\137"+
    "\62\0\1\137\45\0\1\127\15\0\1\127\43\0\1\127"+
    "\16\0\1\127\44\0\1\140\24\0\6\56\1\0\53\56"+
    "\5\57\1\141\54\57\1\0\2\3\5\0\2\3\1\142"+
    "\20\3\5\0\2\3\1\143\3\3\15\0\2\3\5\0"+
    "\3\3\1\144\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\13\3\1\145\7\3\5\0\6\3\15\0\2\3\5\0"+
    "\4\3\1\146\4\3\1\147\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\1\3\1\150\6\3\1\151\6\3\1\152"+
    "\3\3\5\0\6\3\15\0\2\3\5\0\20\3\1\153"+
    "\2\3\5\0\6\3\15\0\2\3\5\0\2\3\1\154"+
    "\20\3\5\0\6\3\15\0\2\3\5\0\2\3\1\155"+
    "\2\3\1\156\12\3\1\157\2\3\5\0\6\3\15\0"+
    "\2\3\5\0\23\3\5\0\3\3\1\160\2\3\15\0"+
    "\2\3\5\0\22\3\1\161\5\0\6\3\15\0\2\3"+
    "\5\0\2\3\1\162\20\3\5\0\6\3\15\0\2\3"+
    "\5\0\12\3\1\163\10\3\5\0\6\3\15\0\2\3"+
    "\5\0\10\3\1\164\12\3\5\0\6\3\15\0\2\3"+
    "\5\0\2\3\1\165\15\3\1\166\2\3\5\0\6\3"+
    "\15\0\2\3\5\0\10\3\1\167\12\3\5\0\6\3"+
    "\15\0\2\3\5\0\5\3\1\170\15\3\5\0\6\3"+
    "\15\0\2\3\5\0\20\3\1\171\2\3\5\0\6\3"+
    "\15\0\2\3\5\0\2\3\1\172\15\3\1\173\2\3"+
    "\5\0\6\3\15\0\2\3\5\0\5\3\1\174\15\3"+
    "\5\0\6\3\15\0\2\3\5\0\2\3\1\175\20\3"+
    "\5\0\6\3\15\0\2\3\5\0\3\3\1\176\17\3"+
    "\5\0\6\3\15\0\2\3\5\0\5\3\1\177\15\3"+
    "\5\0\6\3\15\0\2\3\5\0\2\3\1\200\20\3"+
    "\5\0\6\3\15\0\2\3\5\0\5\3\1\201\15\3"+
    "\5\0\6\3\15\0\2\3\5\0\12\3\1\202\10\3"+
    "\5\0\6\3\15\0\2\3\5\0\13\3\1\203\7\3"+
    "\5\0\6\3\15\0\2\3\5\0\11\3\1\204\11\3"+
    "\5\0\6\3\15\0\2\3\5\0\2\3\1\205\20\3"+
    "\5\0\6\3\15\0\2\3\5\0\15\3\1\206\5\3"+
    "\5\0\6\3\15\0\2\3\5\0\17\3\1\207\3\3"+
    "\5\0\6\3\15\0\2\3\5\0\5\3\1\210\15\3"+
    "\5\0\6\3\15\0\2\3\5\0\10\3\1\211\12\3"+
    "\5\0\6\3\15\0\2\3\5\0\13\3\1\212\7\3"+
    "\5\0\6\3\15\0\2\3\5\0\23\3\5\0\3\3"+
    "\1\213\2\3\15\0\2\3\5\0\4\3\1\214\16\3"+
    "\5\0\6\3\15\0\2\3\5\0\11\3\1\215\11\3"+
    "\5\0\6\3\15\0\2\3\5\0\4\3\1\216\16\3"+
    "\5\0\6\3\15\0\2\3\5\0\11\3\1\217\11\3"+
    "\5\0\6\3\15\0\2\3\5\0\4\3\1\220\16\3"+
    "\5\0\6\3\15\0\2\3\5\0\6\3\1\221\14\3"+
    "\5\0\6\3\15\0\2\3\5\0\4\3\1\222\6\3"+
    "\1\223\7\3\5\0\6\3\15\0\2\3\5\0\1\224"+
    "\22\3\5\0\6\3\15\0\2\3\5\0\4\3\1\225"+
    "\16\3\5\0\6\3\16\0\1\226\57\0\4\57\1\227"+
    "\1\230\54\57\1\0\2\3\5\0\3\3\1\231\17\3"+
    "\5\0\6\3\15\0\2\3\5\0\10\3\1\232\12\3"+
    "\5\0\6\3\15\0\2\3\5\0\10\3\1\233\12\3"+
    "\5\0\6\3\15\0\2\3\5\0\12\3\1\234\10\3"+
    "\5\0\6\3\15\0\2\3\5\0\20\3\1\235\2\3"+
    "\5\0\6\3\15\0\2\3\5\0\3\3\1\236\7\3"+
    "\1\237\7\3\5\0\6\3\15\0\2\3\5\0\5\3"+
    "\1\240\15\3\5\0\6\3\15\0\2\3\5\0\3\3"+
    "\1\241\17\3\5\0\6\3\15\0\2\3\5\0\3\3"+
    "\1\242\17\3\5\0\6\3\15\0\2\3\5\0\3\3"+
    "\1\243\17\3\5\0\6\3\15\0\2\3\5\0\3\3"+
    "\1\244\17\3\5\0\6\3\15\0\2\3\5\0\3\3"+
    "\1\245\17\3\5\0\6\3\15\0\2\3\5\0\2\3"+
    "\1\246\20\3\5\0\6\3\15\0\2\3\5\0\12\3"+
    "\1\247\1\250\7\3\5\0\6\3\15\0\2\3\5\0"+
    "\4\3\1\251\16\3\5\0\6\3\15\0\2\3\5\0"+
    "\12\3\1\252\10\3\5\0\6\3\15\0\2\3\5\0"+
    "\11\3\1\231\11\3\5\0\6\3\15\0\2\3\5\0"+
    "\6\3\1\253\14\3\5\0\6\3\15\0\2\3\5\0"+
    "\2\3\1\254\1\255\17\3\5\0\6\3\15\0\2\3"+
    "\5\0\20\3\1\256\2\3\5\0\6\3\15\0\2\3"+
    "\5\0\2\3\1\257\15\3\1\260\2\3\5\0\6\3"+
    "\15\0\2\3\5\0\2\3\1\261\20\3\5\0\6\3"+
    "\15\0\2\3\5\0\17\3\1\262\3\3\5\0\6\3"+
    "\15\0\2\3\5\0\2\3\1\263\20\3\5\0\6\3"+
    "\15\0\2\3\5\0\14\3\1\231\6\3\5\0\6\3"+
    "\15\0\2\3\5\0\3\3\1\264\17\3\5\0\6\3"+
    "\15\0\2\3\5\0\11\3\1\265\11\3\5\0\6\3"+
    "\15\0\2\3\5\0\3\3\1\266\17\3\5\0\6\3"+
    "\15\0\2\3\5\0\13\3\1\267\7\3\5\0\6\3"+
    "\15\0\2\3\5\0\10\3\1\270\12\3\5\0\6\3"+
    "\15\0\2\3\5\0\20\3\1\152\2\3\5\0\6\3"+
    "\15\0\2\3\5\0\10\3\1\271\12\3\5\0\6\3"+
    "\15\0\2\3\5\0\17\3\1\272\3\3\5\0\6\3"+
    "\15\0\2\3\5\0\10\3\1\273\12\3\5\0\6\3"+
    "\15\0\2\3\5\0\1\274\22\3\5\0\6\3\15\0"+
    "\2\3\5\0\6\3\1\275\14\3\5\0\6\3\15\0"+
    "\2\3\5\0\2\3\1\276\20\3\5\0\6\3\15\0"+
    "\2\3\5\0\11\3\1\271\11\3\5\0\6\3\15\0"+
    "\2\3\5\0\3\3\1\277\17\3\5\0\6\3\15\0"+
    "\2\3\5\0\2\3\1\300\20\3\5\0\6\3\15\0"+
    "\2\3\5\0\4\3\1\301\16\3\5\0\6\3\15\0"+
    "\2\3\5\0\12\3\1\302\10\3\5\0\6\3\15\0"+
    "\2\3\5\0\16\3\1\303\4\3\5\0\6\3\15\0"+
    "\2\3\5\0\23\3\5\0\1\304\5\3\15\0\2\3"+
    "\5\0\23\3\5\0\2\3\1\305\3\3\15\0\2\3"+
    "\5\0\2\3\1\306\20\3\5\0\6\3\15\0\2\3"+
    "\5\0\12\3\1\307\10\3\5\0\6\3\15\0\2\3"+
    "\5\0\5\3\1\310\15\3\5\0\6\3\16\0\1\226"+
    "\51\0\1\311\5\0\4\57\1\0\1\230\54\57\1\0"+
    "\2\3\5\0\12\3\1\312\10\3\5\0\6\3\15\0"+
    "\2\3\5\0\23\3\5\0\1\313\5\3\15\0\2\3"+
    "\5\0\3\3\1\314\17\3\5\0\6\3\15\0\2\3"+
    "\5\0\10\3\1\315\12\3\5\0\6\3\15\0\2\3"+
    "\5\0\22\3\1\316\5\0\6\3\15\0\2\3\5\0"+
    "\20\3\1\317\2\3\5\0\6\3\15\0\2\3\5\0"+
    "\5\3\1\320\15\3\5\0\6\3\15\0\2\3\5\0"+
    "\11\3\1\321\11\3\5\0\6\3\15\0\2\3\5\0"+
    "\11\3\1\322\11\3\5\0\6\3\15\0\2\3\5\0"+
    "\10\3\1\323\12\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\324\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\11\3\1\325\11\3\5\0\6\3\15\0\2\3\5\0"+
    "\23\3\5\0\2\3\1\326\3\3\15\0\2\3\5\0"+
    "\7\3\1\327\13\3\5\0\6\3\15\0\2\3\5\0"+
    "\20\3\1\330\2\3\5\0\6\3\15\0\2\3\5\0"+
    "\4\3\1\331\16\3\5\0\6\3\15\0\2\3\5\0"+
    "\2\3\1\332\20\3\5\0\6\3\15\0\2\3\5\0"+
    "\11\3\1\333\11\3\5\0\6\3\15\0\2\3\5\0"+
    "\11\3\1\334\11\3\5\0\6\3\15\0\2\3\5\0"+
    "\11\3\1\335\11\3\5\0\6\3\15\0\2\3\5\0"+
    "\10\3\1\336\12\3\5\0\6\3\15\0\2\3\5\0"+
    "\11\3\1\337\11\3\5\0\6\3\15\0\2\3\5\0"+
    "\12\3\1\340\10\3\5\0\6\3\15\0\2\3\5\0"+
    "\2\3\1\231\20\3\5\0\6\3\15\0\2\3\5\0"+
    "\11\3\1\341\11\3\5\0\6\3\15\0\2\3\5\0"+
    "\17\3\1\342\3\3\5\0\6\3\15\0\2\3\5\0"+
    "\12\3\1\142\10\3\5\0\6\3\15\0\2\3\5\0"+
    "\7\3\1\343\13\3\5\0\6\3\15\0\2\3\5\0"+
    "\4\3\1\344\16\3\5\0\6\3\15\0\2\3\5\0"+
    "\11\3\1\345\11\3\5\0\6\3\15\0\2\3\5\0"+
    "\6\3\1\346\14\3\5\0\6\3\15\0\2\3\5\0"+
    "\5\3\1\347\15\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\350\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\10\3\1\351\12\3\5\0\6\3\15\0\2\3\5\0"+
    "\10\3\1\352\12\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\353\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\4\3\1\354\16\3\5\0\6\3\15\0\2\3\5\0"+
    "\17\3\1\355\3\3\5\0\6\3\15\0\2\3\5\0"+
    "\10\3\1\356\12\3\5\0\6\3\15\0\2\3\5\0"+
    "\16\3\1\357\4\3\5\0\6\3\15\0\2\3\5\0"+
    "\20\3\1\360\2\3\5\0\6\3\15\0\2\3\5\0"+
    "\4\3\1\361\16\3\5\0\6\3\15\0\2\3\5\0"+
    "\16\3\1\362\4\3\5\0\6\3\15\0\2\3\5\0"+
    "\15\3\1\363\5\3\5\0\6\3\15\0\2\3\5\0"+
    "\5\3\1\364\15\3\5\0\6\3\15\0\2\3\5\0"+
    "\23\3\5\0\4\3\1\365\1\3\15\0\2\3\5\0"+
    "\2\3\1\366\20\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\367\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\5\3\1\370\15\3\5\0\6\3\15\0\2\3\5\0"+
    "\10\3\1\371\12\3\5\0\6\3\15\0\2\3\5\0"+
    "\5\3\1\372\15\3\5\0\6\3\15\0\2\3\5\0"+
    "\2\3\1\373\20\3\5\0\6\3\15\0\2\3\5\0"+
    "\4\3\1\374\16\3\5\0\6\3\15\0\2\3\5\0"+
    "\12\3\1\375\10\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\376\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\12\3\1\377\10\3\5\0\6\3\15\0\2\3\5\0"+
    "\11\3\1\u0100\11\3\5\0\6\3\15\0\2\3\5\0"+
    "\6\3\1\u0101\14\3\5\0\6\3\15\0\2\3\5\0"+
    "\7\3\1\u0102\13\3\5\0\6\3\15\0\2\3\5\0"+
    "\14\3\1\u0103\6\3\5\0\6\3\15\0\2\3\5\0"+
    "\14\3\1\u0104\6\3\5\0\6\3\15\0\2\3\5\0"+
    "\2\3\1\u0105\20\3\5\0\6\3\15\0\2\3\5\0"+
    "\6\3\1\u0106\14\3\5\0\6\3\15\0\2\3\5\0"+
    "\6\3\1\u0107\14\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\u0108\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\5\3\1\231\15\3\5\0\6\3\15\0\2\3\5\0"+
    "\20\3\1\u0109\2\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\u010a\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\20\3\1\u010b\2\3\5\0\6\3\15\0\2\3\5\0"+
    "\10\3\1\u010c\12\3\5\0\6\3\15\0\2\3\5\0"+
    "\6\3\1\u010d\14\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\u010e\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\17\3\1\u010f\3\3\5\0\6\3\15\0\2\3\5\0"+
    "\6\3\1\u0110\14\3\5\0\6\3\15\0\2\3\5\0"+
    "\13\3\1\u0111\7\3\5\0\6\3\15\0\2\3\5\0"+
    "\6\3\1\u0112\14\3\5\0\6\3\15\0\2\3\5\0"+
    "\1\3\1\u0113\21\3\5\0\6\3\15\0\2\3\5\0"+
    "\2\3\1\u0114\20\3\5\0\6\3\15\0\2\3\5\0"+
    "\13\3\1\u0115\7\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\u0116\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\u0117\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\2\3\1\u0118\20\3\5\0\6\3\15\0\2\3\5\0"+
    "\10\3\1\u0119\12\3\5\0\6\3\15\0\2\3\5\0"+
    "\5\3\1\u011a\15\3\5\0\6\3\15\0\2\3\5\0"+
    "\6\3\1\u011b\14\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\u011c\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\5\3\1\u011d\15\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\u011e\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\2\3\1\u011f\20\3\5\0\6\3\15\0\2\3\5\0"+
    "\11\3\1\u0120\11\3\5\0\6\3\15\0\2\3\5\0"+
    "\5\3\1\u0121\15\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\u0122\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\15\3\1\u0123\5\3\5\0\6\3\15\0\2\3\5\0"+
    "\2\3\1\u0124\20\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\u0125\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\13\3\1\u0126\7\3\5\0\6\3\15\0\2\3\5\0"+
    "\2\3\1\u0127\20\3\5\0\6\3\15\0\2\3\5\0"+
    "\4\3\1\u0128\16\3\5\0\6\3\15\0\2\3\5\0"+
    "\16\3\1\u0129\4\3\5\0\6\3\15\0\2\3\5\0"+
    "\3\3\1\u012a\17\3\5\0\6\3\15\0\2\3\5\0"+
    "\15\3\1\u012b\5\3\5\0\6\3\15\0\2\3\5\0"+
    "\20\3\1\u012c\2\3\5\0\6\3\15\0\2\3\5\0"+
    "\23\3\5\0\5\3\1\u012d\15\0\2\3\5\0\3\3"+
    "\1\u012e\17\3\5\0\6\3\15\0\2\3\5\0\16\3"+
    "\1\u012f\4\3\5\0\6\3\14\0";

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
    "\1\0\1\11\5\1\2\11\24\1\1\11\11\1\6\11"+
    "\1\1\1\0\1\11\46\1\2\11\6\1\1\11\2\0"+
    "\64\1\1\0\1\11\1\0\60\1\1\11\146\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[303];
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
    public String lexeme;
    InfoAnalisis dc = new InfoAnalisis();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 134) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 34: 
          { dc.linea=yyline; lexeme=yytext(); return Else;
          }
        case 77: break;
        case 62: 
          { dc.linea=yyline; lexeme=yytext(); return Generic;
          }
        case 78: break;
        case 70: 
          { dc.linea=yyline; lexeme=yytext(); return Transient;
          }
        case 79: break;
        case 39: 
          { dc.linea=yyline; lexeme=yytext(); return Goto;
          }
        case 80: break;
        case 16: 
          { dc.linea=yyline; lexeme=yytext(); return Parentesis_a;
          }
        case 81: break;
        case 41: 
          { dc.linea=yyline; lexeme=yytext(); return Main;
          }
        case 82: break;
        case 42: 
          { dc.linea=yyline; lexeme=yytext(); return Break;
          }
        case 83: break;
        case 52: 
          { dc.linea=yyline; lexeme=yytext(); return Import;
          }
        case 84: break;
        case 37: 
          { dc.linea=yyline; lexeme=yytext(); return Case;
          }
        case 85: break;
        case 6: 
          { dc.linea=yyline; lexeme=yytext(); return Multiplicacion;
          }
        case 86: break;
        case 32: 
          { dc.linea=yyline; lexeme=yytext(); return This;
          }
        case 87: break;
        case 61: 
          { dc.linea=yyline; lexeme=yytext(); return Extends;
          }
        case 88: break;
        case 31: 
          { dc.linea=yyline; lexeme=yytext(); return Var;
          }
        case 89: break;
        case 12: 
          { dc.linea=yyline; lexeme=yytext(); return Modulo;
          }
        case 90: break;
        case 50: 
          { dc.linea=yyline; lexeme=yytext(); return Super;
          }
        case 91: break;
        case 21: 
          { dc.linea=yyline; lexeme = yytext(); return Corchete_c;
          }
        case 92: break;
        case 43: 
          { dc.linea=yyline; lexeme=yytext(); return Throw_s;
          }
        case 93: break;
        case 25: 
          { dc.linea=yyline; lexeme=yytext(); return Do;
          }
        case 94: break;
        case 4: 
          { /*Ignore*/
          }
        case 95: break;
        case 74: 
          { dc.linea=yyline; lexeme=yytext(); return Instanceof;
          }
        case 96: break;
        case 45: 
          { dc.linea=yyline; lexeme=yytext(); return Catch;
          }
        case 97: break;
        case 18: 
          { dc.linea=yyline; lexeme=yytext(); return Llave_a;
          }
        case 98: break;
        case 75: 
          { dc.linea=yyline; lexeme=yytext(); return Implements;
          }
        case 99: break;
        case 30: 
          { dc.linea=yyline; lexeme=yytext(); return For;
          }
        case 100: break;
        case 60: 
          { dc.linea=yyline; lexeme=yytext(); return By_value;
          }
        case 101: break;
        case 33: 
          { dc.linea=yyline; lexeme = yytext(); return Op_booleano;
          }
        case 102: break;
        case 9: 
          { dc.linea=yyline; lexeme=yytext(); return Asignacion;
          }
        case 103: break;
        case 40: 
          { dc.linea=yyline; lexeme=yytext(); return Void;
          }
        case 104: break;
        case 1: 
          { return ERROR;
          }
        case 105: break;
        case 46: 
          { dc.linea=yyline; lexeme=yytext(); return Class;
          }
        case 106: break;
        case 64: 
          { dc.linea=yyline; lexeme=yytext(); return Default;
          }
        case 107: break;
        case 27: 
          { dc.linea=yyline; lexeme=yytext(); return Try;
          }
        case 108: break;
        case 56: 
          { dc.linea=yyline; lexeme=yytext(); return Static;
          }
        case 109: break;
        case 22: 
          { dc.linea=yyline; lexeme=yytext(); return P_coma;
          }
        case 110: break;
        case 11: 
          { dc.linea=yyline; lexeme=yytext(); return Resta;
          }
        case 111: break;
        case 10: 
          { dc.linea=yyline; lexeme=yytext(); return Suma;
          }
        case 112: break;
        case 65: 
          { dc.linea=yyline; lexeme=yytext(); return Package;
          }
        case 113: break;
        case 49: 
          { dc.linea=yyline; lexeme=yytext(); return Final;
          }
        case 114: break;
        case 24: 
          { dc.linea=yyline; lexeme=yytext(); return If;
          }
        case 115: break;
        case 20: 
          { dc.linea=yyline; lexeme = yytext(); return Corchete_a;
          }
        case 116: break;
        case 3: 
          { dc.linea=yyline; lexeme=yytext(); return Numero;
          }
        case 117: break;
        case 26: 
          { dc.linea=yyline; lexeme = yytext(); return Op_incremento;
          }
        case 118: break;
        case 15: 
          { dc.linea=yyline; lexeme = yytext(); return Op_relacional;
          }
        case 119: break;
        case 67: 
          { dc.linea=yyline; lexeme=yytext(); return Continue;
          }
        case 120: break;
        case 72: 
          { dc.linea=yyline; lexeme=yytext(); return Protected;
          }
        case 121: break;
        case 76: 
          { dc.linea=yyline; lexeme=yytext(); return Synchronized;
          }
        case 122: break;
        case 28: 
          { dc.linea=yyline; lexeme=yytext(); return T_dato;
          }
        case 123: break;
        case 35: 
          { dc.linea=yyline; lexeme=yytext(); return Null;
          }
        case 124: break;
        case 36: 
          { dc.linea=yyline; lexeme=yytext(); return Cast;
          }
        case 125: break;
        case 48: 
          { dc.linea=yyline; lexeme=yytext(); return Outer;
          }
        case 126: break;
        case 59: 
          { dc.linea=yyline; lexeme=yytext(); return Public;
          }
        case 127: break;
        case 54: 
          { dc.linea=yyline; lexeme=yytext(); return Return;
          }
        case 128: break;
        case 55: 
          { dc.linea=yyline; lexeme=yytext(); return Future;
          }
        case 129: break;
        case 13: 
          { dc.linea=yyline; lexeme=yytext(); return Punto;
          }
        case 130: break;
        case 73: 
          { dc.linea=yyline; lexeme=yytext(); return Threadsafe;
          }
        case 131: break;
        case 53: 
          { dc.linea=yyline; lexeme=yytext(); return Native;
          }
        case 132: break;
        case 69: 
          { dc.linea=yyline; lexeme=yytext(); return Operator;
          }
        case 133: break;
        case 17: 
          { dc.linea=yyline; lexeme=yytext(); return Parentesis_c;
          }
        case 134: break;
        case 57: 
          { dc.linea=yyline; lexeme=yytext(); return Switch;
          }
        case 135: break;
        case 7: 
          { return Linea;
          }
        case 136: break;
        case 23: 
          { dc.linea=yyline; lexeme = yytext(); return Op_atribucion;
          }
        case 137: break;
        case 71: 
          { dc.linea=yyline; lexeme=yytext(); return Interface;
          }
        case 138: break;
        case 68: 
          { dc.linea=yyline; lexeme=yytext(); return Abstract;
          }
        case 139: break;
        case 14: 
          { dc.linea=yyline; lexeme=yytext(); return Op_logico;
          }
        case 140: break;
        case 8: 
          { dc.linea=yyline; lexeme=yytext(); return Comillas;
          }
        case 141: break;
        case 63: 
          { dc.linea=yyline; lexeme=yytext(); return Finally;
          }
        case 142: break;
        case 66: 
          { dc.linea=yyline; lexeme=yytext(); return Private;
          }
        case 143: break;
        case 58: 
          { dc.linea=yyline; lexeme=yytext(); return Cadena_S;
          }
        case 144: break;
        case 5: 
          { dc.linea=yyline; lexeme=yytext(); return Division;
          }
        case 145: break;
        case 44: 
          { dc.linea=yyline; lexeme=yytext(); return Inner;
          }
        case 146: break;
        case 38: 
          { dc.linea=yyline; lexeme=yytext(); return Rest;
          }
        case 147: break;
        case 19: 
          { dc.linea=yyline; lexeme=yytext(); return Llave_c;
          }
        case 148: break;
        case 2: 
          { dc.linea=yyline; lexeme=yytext(); return Identificador;
          }
        case 149: break;
        case 29: 
          { dc.linea=yyline; lexeme=yytext(); return New;
          }
        case 150: break;
        case 51: 
          { dc.linea=yyline; lexeme=yytext(); return While;
          }
        case 151: break;
        case 47: 
          { dc.linea=yyline; lexeme=yytext(); return Const;
          }
        case 152: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
