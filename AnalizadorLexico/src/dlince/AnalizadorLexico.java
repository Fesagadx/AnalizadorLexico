/* The following code was generated by JFlex 1.6.1 */

package dlince;
import java_cup.runtime.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/FELIPE/eclipse/eclipse/AnalizadorLexico/AnalizadorLexico/bin/dlince/lenguaje.lex</tt>
 */
public class AnalizadorLexico {

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
    "\11\0\1\46\1\47\25\0\1\45\1\57\1\1\1\53\1\3\1\60"+
    "\1\0\1\2\1\52\1\52\1\60\1\60\1\54\1\13\1\14\1\60"+
    "\1\11\1\37\10\12\2\0\1\56\1\55\1\56\1\0\1\6\32\7"+
    "\1\50\1\0\1\51\1\60\1\5\1\0\1\34\1\43\1\31\1\15"+
    "\1\16\1\17\1\36\1\41\1\21\1\4\1\44\1\22\1\32\1\24"+
    "\1\33\1\26\1\40\1\27\1\25\1\30\1\23\1\4\1\42\1\35"+
    "\1\20\1\4\1\0\1\10\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff93\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\0\1\2\2\3\1\4\1\0\23\1"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\0\1\13"+
    "\1\4\1\14\1\0\1\4\1\15\1\16\1\1\1\17"+
    "\2\2\1\0\1\20\1\1\1\21\5\1\1\22\23\1"+
    "\1\23\10\1\1\24\1\14\1\16\1\1\1\17\3\2"+
    "\1\25\1\26\1\27\2\1\1\30\1\31\2\1\1\32"+
    "\4\1\1\33\1\23\1\1\1\34\7\1\1\35\1\1"+
    "\1\36\4\1\1\37\3\1\1\40\3\1\1\16\1\1"+
    "\1\17\4\2\2\1\1\41\6\1\1\42\1\43\1\1"+
    "\1\44\1\45\1\1\1\46\4\1\1\47\3\1\1\50"+
    "\1\51\1\52\1\53\2\1\1\16\1\1\1\17\5\2"+
    "\2\1\1\54\1\1\1\55\1\56\1\1\1\57\1\60"+
    "\1\61\2\1\1\62\1\63\1\64\1\1\1\65\1\66"+
    "\1\67\1\16\1\1\1\17\6\2\1\1\1\70\1\1"+
    "\1\71\1\72\1\73\1\74\1\16\1\1\1\17\7\2"+
    "\1\75\1\76\1\16\1\1\1\17\10\2\1\16\1\1"+
    "\1\17\11\2\1\16\1\1\1\17\12\2\1\16\1\17";

  private static int [] zzUnpackAction() {
    int [] result = new int[264];
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
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
    "\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae\0\u02df"+
    "\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405\0\u0436\0\u0467"+
    "\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c\0\u058d\0\u0157\0\u0157"+
    "\0\u0157\0\u0157\0\u0157\0\u0157\0\u05be\0\u0157\0\u05ef\0\u05ef"+
    "\0\u05ef\0\u0157\0\u0157\0\u0620\0\u0651\0\u0682\0\u06b3\0\u06e4"+
    "\0\u0715\0\u0157\0\u0746\0\u0651\0\u0777\0\u07a8\0\u07d9\0\u080a"+
    "\0\u083b\0\u0651\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0930\0\u0961"+
    "\0\u0992\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9"+
    "\0\u0b1a\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u0651\0\u0c0f\0\u0c40"+
    "\0\u0c71\0\u0ca2\0\u0cd3\0\u0d04\0\u0d35\0\u0d66\0\u0d97\0\u0157"+
    "\0\u0dc8\0\u0df9\0\u0e2a\0\u0e5b\0\u0e8c\0\u0ebd\0\u0715\0\u0eee"+
    "\0\u0df9\0\u0f1f\0\u0f50\0\u0df9\0\u0df9\0\u0f81\0\u0fb2\0\u0fe3"+
    "\0\u1014\0\u1045\0\u1076\0\u10a7\0\u0df9\0\u0df9\0\u10d8\0\u0df9"+
    "\0\u1109\0\u113a\0\u116b\0\u119c\0\u11cd\0\u11fe\0\u122f\0\u0df9"+
    "\0\u1260\0\u0df9\0\u1291\0\u12c2\0\u12f3\0\u1324\0\u0df9\0\u1355"+
    "\0\u1386\0\u13b7\0\u0df9\0\u13e8\0\u1419\0\u144a\0\u147b\0\u14ac"+
    "\0\u14dd\0\u150e\0\u153f\0\u1570\0\u15a1\0\u15d2\0\u1603\0\u14ac"+
    "\0\u1634\0\u1665\0\u1696\0\u16c7\0\u16f8\0\u1729\0\u14ac\0\u14ac"+
    "\0\u175a\0\u14ac\0\u14ac\0\u178b\0\u14ac\0\u17bc\0\u17ed\0\u181e"+
    "\0\u184f\0\u14ac\0\u1880\0\u18b1\0\u18e2\0\u14ac\0\u14ac\0\u14ac"+
    "\0\u14ac\0\u1913\0\u1944\0\u1975\0\u19a6\0\u19d7\0\u1a08\0\u1a39"+
    "\0\u1a6a\0\u1a9b\0\u1acc\0\u1afd\0\u1b2e\0\u19a6\0\u1b5f\0\u19a6"+
    "\0\u19a6\0\u1b90\0\u19a6\0\u19a6\0\u19a6\0\u1bc1\0\u1bf2\0\u19a6"+
    "\0\u19a6\0\u19a6\0\u1c23\0\u19a6\0\u19a6\0\u19a6\0\u1c54\0\u1c85"+
    "\0\u1cb6\0\u1ce7\0\u1d18\0\u1d49\0\u1d7a\0\u1dab\0\u1ddc\0\u1e0d"+
    "\0\u1c85\0\u1e3e\0\u1c85\0\u1c85\0\u1c85\0\u1c85\0\u1e6f\0\u1ea0"+
    "\0\u1ed1\0\u1f02\0\u1f33\0\u1f64\0\u1f95\0\u1fc6\0\u1ff7\0\u2028"+
    "\0\u1ea0\0\u1ea0\0\u2059\0\u208a\0\u20bb\0\u20ec\0\u211d\0\u214e"+
    "\0\u217f\0\u21b0\0\u21e1\0\u2212\0\u2243\0\u2274\0\u22a5\0\u22d6"+
    "\0\u2307\0\u2338\0\u2369\0\u239a\0\u23cb\0\u23fc\0\u242d\0\u245e"+
    "\0\u248f\0\u24c0\0\u0157\0\u24f1\0\u0157\0\u2522\0\u2553\0\u2584"+
    "\0\u25b5\0\u25e6\0\u2617\0\u2648\0\u2679\0\u26aa\0\u0157\0\u0157";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[264];
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
    "\1\0\1\2\1\3\1\4\1\5\1\0\1\6\1\7"+
    "\1\5\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\5\1\34\1\11"+
    "\2\5\1\35\1\36\1\5\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\2\1\53\57\2\2\3\1\53\56\3\4\0\1\54"+
    "\2\0\2\54\4\0\22\54\1\0\5\54\20\0\2\55"+
    "\1\0\4\55\2\0\30\55\20\0\1\56\2\0\2\56"+
    "\4\0\22\56\1\0\5\56\20\0\1\55\1\57\1\0"+
    "\1\60\3\57\2\0\22\55\1\57\5\55\106\0\2\11"+
    "\1\0\1\61\22\0\1\11\33\0\1\11\24\0\1\11"+
    "\35\0\1\62\50\0\2\55\1\0\4\55\2\0\1\55"+
    "\1\63\14\55\1\64\11\55\20\0\2\55\1\0\4\55"+
    "\2\0\7\55\1\65\7\55\1\66\1\67\7\55\20\0"+
    "\2\55\1\0\4\55\2\0\16\55\1\70\11\55\20\0"+
    "\2\55\1\0\4\55\2\0\4\55\1\71\23\55\20\0"+
    "\2\55\1\0\4\55\2\0\2\55\1\72\4\55\1\73"+
    "\20\55\20\0\2\55\1\0\4\55\2\0\16\55\1\74"+
    "\11\55\20\0\2\55\1\0\4\55\2\0\7\55\1\75"+
    "\20\55\20\0\2\55\1\0\4\55\2\0\1\55\1\76"+
    "\2\55\1\77\11\55\1\100\11\55\20\0\2\55\1\0"+
    "\4\55\2\0\1\55\1\101\2\55\1\102\1\55\1\103"+
    "\14\55\1\104\4\55\20\0\2\55\1\0\4\55\2\0"+
    "\6\55\1\105\3\55\1\106\15\55\20\0\2\55\1\0"+
    "\4\55\2\0\1\55\1\107\26\55\20\0\2\55\1\0"+
    "\4\55\2\0\17\55\1\110\10\55\20\0\2\55\1\0"+
    "\4\55\2\0\5\55\1\111\10\55\1\112\1\113\4\55"+
    "\1\114\3\55\20\0\2\55\1\0\4\55\2\0\16\55"+
    "\1\115\11\55\20\0\2\55\1\0\4\55\2\0\12\55"+
    "\1\116\15\55\20\0\2\55\1\0\4\55\2\0\5\55"+
    "\1\117\1\55\1\120\1\121\2\55\1\122\1\123\13\55"+
    "\20\0\2\55\1\0\4\55\2\0\1\55\1\124\26\55"+
    "\20\0\2\55\1\0\4\55\2\0\24\55\1\125\3\55"+
    "\20\0\2\55\1\0\4\55\2\0\12\55\1\126\15\55"+
    "\20\0\2\127\1\0\4\127\2\0\30\127\6\0\1\45"+
    "\62\0\1\130\7\0\2\131\1\0\4\131\2\0\30\131"+
    "\20\0\2\132\1\0\4\132\2\0\30\132\20\0\2\133"+
    "\1\0\4\133\2\0\30\133\20\0\1\132\1\134\1\0"+
    "\4\134\2\0\22\132\1\134\5\132\20\0\1\132\1\135"+
    "\1\0\1\136\3\135\2\0\22\132\1\135\5\132\25\0"+
    "\2\137\24\0\1\137\25\0\2\132\1\0\4\132\2\0"+
    "\2\132\1\140\25\132\20\0\2\132\1\0\4\132\2\0"+
    "\1\141\7\132\1\142\17\132\20\0\2\132\1\0\4\132"+
    "\2\0\14\132\1\143\13\132\20\0\2\132\1\0\4\132"+
    "\2\0\11\132\1\144\16\132\20\0\2\132\1\0\4\132"+
    "\2\0\12\132\1\145\15\132\20\0\2\132\1\0\4\132"+
    "\2\0\1\132\1\146\26\132\20\0\2\132\1\0\4\132"+
    "\2\0\14\132\1\147\13\132\20\0\2\132\1\0\4\132"+
    "\2\0\21\132\1\150\6\132\20\0\2\132\1\0\4\132"+
    "\2\0\1\151\4\132\1\152\5\132\1\153\14\132\20\0"+
    "\2\132\1\0\4\132\2\0\20\132\1\154\7\132\20\0"+
    "\2\132\1\0\4\132\2\0\5\132\1\155\22\132\20\0"+
    "\2\132\1\0\4\132\2\0\13\132\1\156\14\132\20\0"+
    "\2\132\1\0\4\132\2\0\5\132\1\157\22\132\20\0"+
    "\2\132\1\0\4\132\2\0\7\132\1\160\20\132\20\0"+
    "\2\132\1\0\4\132\2\0\11\132\1\161\16\132\20\0"+
    "\2\132\1\0\4\132\2\0\12\132\1\162\15\132\20\0"+
    "\2\132\1\0\4\132\2\0\13\132\1\163\14\132\20\0"+
    "\2\132\1\0\4\132\2\0\4\132\1\164\23\132\20\0"+
    "\2\132\1\0\4\132\2\0\1\165\7\132\1\166\2\132"+
    "\1\167\14\132\20\0\2\132\1\0\4\132\2\0\7\132"+
    "\1\170\20\132\20\0\2\132\1\0\4\132\2\0\17\132"+
    "\1\171\10\132\20\0\2\132\1\0\4\132\2\0\10\132"+
    "\1\172\17\132\20\0\2\132\1\0\4\132\2\0\10\132"+
    "\1\173\17\132\20\0\2\132\1\0\4\132\2\0\16\132"+
    "\1\174\11\132\20\0\2\132\1\0\4\132\2\0\1\175"+
    "\27\132\20\0\2\132\1\0\4\132\2\0\4\132\1\176"+
    "\23\132\20\0\2\132\1\0\4\132\2\0\1\177\27\132"+
    "\20\0\2\132\1\0\4\132\2\0\4\132\1\200\23\132"+
    "\20\0\2\132\1\0\4\132\2\0\17\132\1\201\10\132"+
    "\20\0\2\132\1\0\4\132\2\0\16\132\1\202\11\132"+
    "\20\0\2\132\1\0\4\132\2\0\13\132\1\203\14\132"+
    "\20\0\2\132\1\0\4\132\2\0\1\132\1\204\2\132"+
    "\1\205\23\132\20\0\2\132\1\0\4\132\2\0\1\132"+
    "\1\206\26\132\20\0\2\127\1\0\4\127\2\0\30\127"+
    "\20\0\2\207\1\0\4\207\2\0\30\207\20\0\2\210"+
    "\1\0\4\210\2\0\30\210\20\0\2\211\1\0\4\211"+
    "\2\0\30\211\20\0\1\210\1\212\1\0\4\212\2\0"+
    "\22\210\1\212\5\210\20\0\1\210\1\213\1\0\4\213"+
    "\2\0\22\210\1\213\5\210\20\0\1\210\1\214\1\0"+
    "\1\215\3\214\2\0\22\210\1\214\5\210\20\0\2\210"+
    "\1\0\4\210\2\0\4\210\1\216\23\210\20\0\2\210"+
    "\1\0\4\210\2\0\6\210\1\217\21\210\20\0\2\210"+
    "\1\0\4\210\2\0\24\210\1\220\3\210\20\0\2\210"+
    "\1\0\4\210\2\0\5\210\1\221\22\210\20\0\2\210"+
    "\1\0\4\210\2\0\5\210\1\222\22\210\20\0\2\210"+
    "\1\0\4\210\2\0\22\210\1\223\5\210\20\0\2\210"+
    "\1\0\4\210\2\0\1\210\1\224\26\210\20\0\2\210"+
    "\1\0\4\210\2\0\1\210\1\225\26\210\20\0\2\210"+
    "\1\0\4\210\2\0\4\210\1\226\23\210\20\0\2\210"+
    "\1\0\4\210\2\0\13\210\1\227\14\210\20\0\2\210"+
    "\1\0\4\210\2\0\2\210\1\230\25\210\20\0\2\210"+
    "\1\0\4\210\2\0\1\210\1\231\26\210\20\0\2\210"+
    "\1\0\4\210\2\0\13\210\1\232\14\210\20\0\2\210"+
    "\1\0\4\210\2\0\10\210\1\233\17\210\20\0\2\210"+
    "\1\0\4\210\2\0\7\210\1\234\20\210\20\0\2\210"+
    "\1\0\4\210\2\0\16\210\1\235\11\210\20\0\2\210"+
    "\1\0\4\210\2\0\14\210\1\236\13\210\20\0\2\210"+
    "\1\0\4\210\2\0\6\210\1\237\3\210\1\240\15\210"+
    "\20\0\2\210\1\0\4\210\2\0\10\210\1\241\17\210"+
    "\20\0\2\210\1\0\4\210\2\0\1\210\1\242\26\210"+
    "\20\0\2\210\1\0\4\210\2\0\15\210\1\243\12\210"+
    "\20\0\2\210\1\0\4\210\2\0\6\210\1\244\21\210"+
    "\20\0\2\210\1\0\4\210\2\0\17\210\1\245\10\210"+
    "\20\0\2\210\1\0\4\210\2\0\7\210\1\246\20\210"+
    "\20\0\2\210\1\0\4\210\2\0\7\210\1\247\20\210"+
    "\20\0\2\210\1\0\4\210\2\0\10\210\1\250\17\210"+
    "\20\0\2\210\1\0\4\210\2\0\7\210\1\251\20\210"+
    "\20\0\2\210\1\0\4\210\2\0\5\210\1\252\22\210"+
    "\20\0\2\210\1\0\4\210\2\0\17\210\1\253\10\210"+
    "\20\0\2\254\1\0\4\254\2\0\30\254\20\0\2\255"+
    "\1\0\4\255\2\0\30\255\20\0\2\256\1\0\4\256"+
    "\2\0\30\256\20\0\1\255\1\257\1\0\4\257\2\0"+
    "\22\255\1\257\5\255\20\0\1\255\1\260\1\0\4\260"+
    "\2\0\22\255\1\260\5\255\20\0\1\255\1\261\1\0"+
    "\4\261\2\0\22\255\1\261\5\255\20\0\1\255\1\262"+
    "\1\0\1\263\3\262\2\0\22\255\1\262\5\255\20\0"+
    "\2\255\1\0\4\255\2\0\7\255\1\264\20\255\20\0"+
    "\2\255\1\0\4\255\2\0\12\255\1\265\15\255\20\0"+
    "\2\255\1\0\4\255\2\0\1\266\27\255\20\0\2\255"+
    "\1\0\4\255\2\0\6\255\1\267\21\255\20\0\2\255"+
    "\1\0\2\255\1\270\1\255\2\0\30\255\20\0\2\255"+
    "\1\0\4\255\2\0\2\255\1\271\25\255\20\0\2\255"+
    "\1\0\4\255\2\0\10\255\1\272\17\255\20\0\2\255"+
    "\1\0\4\255\2\0\5\255\1\273\22\255\20\0\2\255"+
    "\1\0\4\255\2\0\12\255\1\274\15\255\20\0\2\255"+
    "\1\0\4\255\2\0\13\255\1\275\14\255\20\0\2\255"+
    "\1\0\4\255\2\0\6\255\1\276\21\255\20\0\2\255"+
    "\1\0\4\255\2\0\12\255\1\277\15\255\20\0\2\255"+
    "\1\0\4\255\2\0\3\255\1\300\24\255\20\0\2\255"+
    "\1\0\4\255\2\0\10\255\1\301\17\255\20\0\2\255"+
    "\1\0\4\255\2\0\11\255\1\302\16\255\20\0\2\255"+
    "\1\0\4\255\2\0\5\255\1\303\22\255\20\0\2\255"+
    "\1\0\4\255\2\0\10\255\1\304\17\255\20\0\2\255"+
    "\1\0\4\255\2\0\1\255\1\305\26\255\20\0\2\255"+
    "\1\0\4\255\2\0\27\255\1\306\20\0\2\307\1\0"+
    "\4\307\2\0\30\307\20\0\2\310\1\0\4\310\2\0"+
    "\30\310\20\0\2\311\1\0\4\311\2\0\30\311\20\0"+
    "\1\310\1\312\1\0\4\312\2\0\22\310\1\312\5\310"+
    "\20\0\1\310\1\313\1\0\4\313\2\0\22\310\1\313"+
    "\5\310\20\0\1\310\1\314\1\0\4\314\2\0\22\310"+
    "\1\314\5\310\20\0\1\310\1\315\1\0\4\315\2\0"+
    "\22\310\1\315\5\310\20\0\1\310\1\316\1\0\1\317"+
    "\3\316\2\0\22\310\1\316\5\310\20\0\2\310\1\0"+
    "\4\310\2\0\1\310\1\320\26\310\20\0\2\310\1\0"+
    "\4\310\2\0\1\310\1\321\26\310\20\0\2\310\1\0"+
    "\4\310\2\0\1\322\27\310\20\0\2\310\1\0\4\310"+
    "\2\0\10\310\1\323\17\310\20\0\2\310\1\0\4\310"+
    "\2\0\1\310\1\324\26\310\20\0\2\310\1\0\4\310"+
    "\2\0\7\310\1\325\20\310\20\0\2\310\1\0\4\310"+
    "\2\0\1\310\1\326\26\310\20\0\2\327\1\0\4\327"+
    "\2\0\30\327\20\0\2\330\1\0\4\330\2\0\30\330"+
    "\20\0\2\331\1\0\4\331\2\0\30\331\20\0\1\330"+
    "\1\332\1\0\4\332\2\0\22\330\1\332\5\330\20\0"+
    "\1\330\1\333\1\0\4\333\2\0\22\330\1\333\5\330"+
    "\20\0\1\330\1\334\1\0\4\334\2\0\22\330\1\334"+
    "\5\330\20\0\1\330\1\335\1\0\4\335\2\0\22\330"+
    "\1\335\5\330\20\0\1\330\1\336\1\0\4\336\2\0"+
    "\22\330\1\336\5\330\20\0\1\330\1\337\1\0\1\340"+
    "\3\337\2\0\22\330\1\337\5\330\20\0\2\330\1\0"+
    "\4\330\2\0\1\341\27\330\20\0\2\330\1\0\4\330"+
    "\2\0\1\330\1\342\26\330\20\0\2\343\1\0\4\343"+
    "\2\0\30\343\20\0\2\344\1\0\4\344\2\0\30\344"+
    "\20\0\2\345\1\0\4\345\2\0\30\345\20\0\1\344"+
    "\1\346\1\0\4\346\2\0\22\344\1\346\5\344\20\0"+
    "\1\344\1\347\1\0\4\347\2\0\22\344\1\347\5\344"+
    "\20\0\1\344\1\350\1\0\4\350\2\0\22\344\1\350"+
    "\5\344\20\0\1\344\1\351\1\0\4\351\2\0\22\344"+
    "\1\351\5\344\20\0\1\344\1\352\1\0\4\352\2\0"+
    "\22\344\1\352\5\344\20\0\1\344\1\353\1\0\4\353"+
    "\2\0\22\344\1\353\5\344\20\0\1\344\1\354\1\0"+
    "\1\355\3\354\2\0\22\344\1\354\5\344\20\0\2\356"+
    "\1\0\4\356\2\0\30\356\20\0\2\357\1\0\4\357"+
    "\2\0\30\357\20\0\2\360\1\0\4\360\2\0\30\360"+
    "\20\0\1\357\1\361\1\0\4\361\2\0\22\357\1\361"+
    "\5\357\20\0\1\357\1\362\1\0\4\362\2\0\22\357"+
    "\1\362\5\357\20\0\1\357\1\363\1\0\4\363\2\0"+
    "\22\357\1\363\5\357\20\0\1\357\1\364\1\0\4\364"+
    "\2\0\22\357\1\364\5\357\20\0\1\357\1\365\1\0"+
    "\4\365\2\0\22\357\1\365\5\357\20\0\1\357\1\366"+
    "\1\0\4\366\2\0\22\357\1\366\5\357\20\0\1\357"+
    "\1\367\1\0\4\367\2\0\22\357\1\367\5\357\20\0"+
    "\1\357\1\370\1\0\1\371\3\370\2\0\22\357\1\370"+
    "\5\357\20\0\2\372\1\0\4\372\2\0\30\372\20\0"+
    "\2\373\1\0\4\373\2\0\30\373\20\0\2\374\1\0"+
    "\4\374\2\0\30\374\20\0\1\373\1\375\1\0\4\375"+
    "\2\0\22\373\1\375\5\373\20\0\1\373\1\376\1\0"+
    "\4\376\2\0\22\373\1\376\5\373\20\0\1\373\1\377"+
    "\1\0\4\377\2\0\22\373\1\377\5\373\20\0\1\373"+
    "\1\u0100\1\0\4\u0100\2\0\22\373\1\u0100\5\373\20\0"+
    "\1\373\1\u0101\1\0\4\u0101\2\0\22\373\1\u0101\5\373"+
    "\20\0\1\373\1\u0102\1\0\4\u0102\2\0\22\373\1\u0102"+
    "\5\373\20\0\1\373\1\u0103\1\0\4\u0103\2\0\22\373"+
    "\1\u0103\5\373\20\0\1\373\1\u0104\1\0\4\u0104\2\0"+
    "\22\373\1\u0104\5\373\20\0\1\373\1\u0105\1\0\1\u0106"+
    "\3\u0105\2\0\22\373\1\u0105\5\373\20\0\2\u0107\1\0"+
    "\4\u0107\2\0\30\u0107\20\0\2\u0108\1\0\4\u0108\2\0"+
    "\30\u0108\21\0\1\375\1\0\4\375\24\0\1\375\26\0"+
    "\1\376\1\0\4\376\24\0\1\376\26\0\1\377\1\0"+
    "\4\377\24\0\1\377\26\0\1\u0100\1\0\4\u0100\24\0"+
    "\1\u0100\26\0\1\u0101\1\0\4\u0101\24\0\1\u0101\26\0"+
    "\1\u0102\1\0\4\u0102\24\0\1\u0102\26\0\1\u0103\1\0"+
    "\4\u0103\24\0\1\u0103\26\0\1\u0104\1\0\4\u0104\24\0"+
    "\1\u0104\26\0\1\u0105\1\0\1\u0106\3\u0105\24\0\1\u0105"+
    "\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9947];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\1\1\0\1\1\1\11\2\1\1\0\23\1"+
    "\6\11\1\0\1\11\2\1\1\0\2\11\5\1\1\0"+
    "\1\11\45\1\1\11\242\1\1\11\1\1\1\11\11\1"+
    "\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[264];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
/*-*
* funciones y variables
*/
private void imprimir(String descripcion, String lexema) {

GUIAnalizadorLexicoRuby.Anadir(descripcion, lexema);
System.out.println(lexema + " - " + descripcion);
}

private void mandar_error(String texto, String lexema,String linea, String colum) {
GUIAnalizadorLexicoRuby.MostrarError(texto, lexema,linea,colum);
}



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 162) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public void yylex() throws java.io.IOException {
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return ;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { imprimir("Variable Local",yytext());
            }
          case 63: break;
          case 2: 
            { imprimir("Constante",yytext());
            }
          case 64: break;
          case 3: 
            { imprimir("Entero",yytext());
            }
          case 65: break;
          case 4: 
            { imprimir("Operador algebraico",yytext());
            }
          case 66: break;
          case 5: 
            { imprimir("Espacio en blanco", yytext());
            }
          case 67: break;
          case 6: 
            { imprimir("Tabulacion", yytext());
            }
          case 68: break;
          case 7: 
            { imprimir("Salto de linea", yytext());
            }
          case 69: break;
          case 8: 
            { imprimir("inicio arreglo ", yytext());
            }
          case 70: break;
          case 9: 
            { imprimir("fin arreglo ", yytext());
            }
          case 71: break;
          case 10: 
            { imprimir("parentesis ", yytext());
            }
          case 72: break;
          case 11: 
            { imprimir("concatenación ",yytext());
            }
          case 73: break;
          case 12: 
            { imprimir("Operador de relacion",yytext());
            }
          case 74: break;
          case 13: 
            { imprimir("Cadena",yytext());
            }
          case 75: break;
          case 14: 
            { imprimir("Variable Global",yytext());
            }
          case 76: break;
          case 15: 
            { imprimir("Variable de Instancia",yytext());
            }
          case 77: break;
          case 16: 
            { imprimir("..",yytext());
            }
          case 78: break;
          case 17: 
            { imprimir("Control DO",yytext());
            }
          case 79: break;
          case 18: 
            { imprimir("Control IF",yytext());
            }
          case 80: break;
          case 19: 
            { imprimir("Declaracion or",yytext());
            }
          case 81: break;
          case 20: 
            { imprimir("comentario ", yytext());
            }
          case 82: break;
          case 21: 
            { imprimir("Decimal",yytext());
            }
          case 83: break;
          case 22: 
            { imprimir("Declaracion def",yytext());
            }
          case 84: break;
          case 23: 
            { imprimir("Finalizador de control",yytext());
            }
          case 85: break;
          case 24: 
            { imprimir("Funcion exponencial",yytext());
            }
          case 86: break;
          case 25: 
            { imprimir("Control FOR",yytext());
            }
          case 87: break;
          case 26: 
            { imprimir("Funcion Logaritmo Natural",yytext());
            }
          case 88: break;
          case 27: 
            { imprimir("Declaracion nil",yytext());
            }
          case 89: break;
          case 28: 
            { imprimir("Funcion Seno",yytext());
            }
          case 90: break;
          case 29: 
            { imprimir("Funcion tangente",yytext());
            }
          case 91: break;
          case 30: 
            { imprimir("Funcion Coseno",yytext());
            }
          case 92: break;
          case 31: 
            { imprimir("Declaracion and",yytext());
            }
          case 93: break;
          case 32: 
            { imprimir("continuador de funcion",yytext());
            }
          case 94: break;
          case 33: 
            { imprimir("Control EACH",yytext());
            }
          case 95: break;
          case 34: 
            { imprimir("Continuador de instrucción",yytext());
            }
          case 96: break;
          case 35: 
            { imprimir("Declaracion self",yytext());
            }
          case 97: break;
          case 36: 
            { imprimir("Funcion Raiz Cuadrada",yytext());
            }
          case 98: break;
          case 37: 
            { imprimir("Control PUTS",yytext());
            }
          case 99: break;
          case 38: 
            { imprimir("Reinicio de iteración",yytext());
            }
          case 100: break;
          case 39: 
            { imprimir("Control CASE",yytext());
            }
          case 101: break;
          case 40: 
            { imprimir("Funcion Seno inverso",yytext());
            }
          case 102: break;
          case 41: 
            { imprimir("Funcion Tangente inversa",yytext());
            }
          case 103: break;
          case 42: 
            { imprimir("Funcion Coseno inverso",yytext());
            }
          case 104: break;
          case 43: 
            { imprimir("Control WHEN",yytext());
            }
          case 105: break;
          case 44: 
            { imprimir("Declaracion yield",yytext());
            }
          case 106: break;
          case 45: 
            { imprimir("Funcion Logaritmo Base 10",yytext());
            }
          case 107: break;
          case 46: 
            { imprimir("Declaracion undef",yytext());
            }
          case 108: break;
          case 47: 
            { imprimir("Control UNTIL",yytext());
            }
          case 109: break;
          case 48: 
            { imprimir("Declaracion super",yytext());
            }
          case 110: break;
          case 49: 
            { imprimir("Control PRINT",yytext());
            }
          case 111: break;
          case 50: 
            { imprimir("Declaracion retry",yytext());
            }
          case 112: break;
          case 51: 
            { imprimir("Declaracion class",yytext());
            }
          case 113: break;
          case 52: 
            { imprimir("capturar datos por pantalla",yytext());
            }
          case 114: break;
          case 53: 
            { imprimir("Declaracion alias",yytext());
            }
          case 115: break;
          case 54: 
            { imprimir("Control WHILE",yytext());
            }
          case 116: break;
          case 55: 
            { imprimir("Finalizador de instrucción",yytext());
            }
          case 117: break;
          case 56: 
            { imprimir("Declaracion ensure",yytext());
            }
          case 118: break;
          case 57: 
            { imprimir("Control UNLESS",yytext());
            }
          case 119: break;
          case 58: 
            { imprimir("Declaracion rescue",yytext());
            }
          case 120: break;
          case 59: 
            { imprimir("Declaracion return",yytext());
            }
          case 121: break;
          case 60: 
            { imprimir("Declaracion module",yytext());
            }
          case 122: break;
          case 61: 
            { imprimir("Verificador de funcion",yytext());
            }
          case 123: break;
          case 62: 
            { imprimir("Declaracion include",yytext());
            }
          case 124: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
