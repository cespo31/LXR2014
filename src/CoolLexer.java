/* The following code was generated by JFlex 1.4.3 on 25/03/14 16.19 */

/*
 *  The scanner definition for COOL.
 */

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 25/03/14 16.19 from the specification file
 * <tt>C:/Users/Mattia/git/LXR2014/build/cool.lex</tt>
 */
class CoolLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\1\100\10\0\1\2\1\1\1\0\1\2\1\7\22\0\1\2\1\0"+
    "\1\74\5\0\1\67\1\70\1\56\1\54\1\66\1\12\1\62\1\55"+
    "\1\4\11\3\1\65\1\64\1\57\1\60\1\73\1\0\1\63\1\25"+
    "\1\10\1\21\1\43\1\13\1\17\1\10\1\35\1\31\2\10\1\23"+
    "\1\101\1\33\1\15\1\46\1\10\1\37\1\27\1\41\1\52\1\45"+
    "\1\50\3\10\1\76\1\75\1\77\1\0\1\5\1\0\1\26\1\103"+
    "\1\22\1\44\1\14\1\20\1\11\1\36\1\32\2\11\1\24\1\102"+
    "\1\34\1\16\1\47\1\11\1\40\1\30\1\42\1\53\1\6\1\51"+
    "\3\11\1\71\1\0\1\72\1\61\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\2\4\1\5\1\6\1\7"+
    "\1\6\1\5\1\6\1\5\1\6\1\5\1\6\1\5"+
    "\1\6\1\5\1\6\1\5\1\6\1\5\1\6\1\5"+
    "\1\6\1\5\1\6\1\5\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\30\1\32"+
    "\1\3\1\33\2\3\1\0\2\6\2\5\2\34\1\35"+
    "\1\5\1\35\2\6\2\5\2\6\2\5\1\36\1\37"+
    "\1\6\1\36\1\37\1\5\2\6\2\5\1\6\2\5"+
    "\1\6\1\5\1\6\1\5\1\40\1\41\1\42\1\43"+
    "\1\44\1\0\1\45\1\46\1\47\1\50\1\45\1\51"+
    "\1\52\1\53\1\0\2\6\3\5\2\6\2\5\1\54"+
    "\1\6\1\54\1\5\2\6\2\5\1\55\1\56\1\55"+
    "\1\56\1\6\2\5\1\6\1\5\1\6\1\5\3\0"+
    "\1\57\1\60\1\57\1\60\1\5\1\6\1\61\1\5"+
    "\1\61\2\62\2\6\2\5\2\63\1\64\2\65\1\6"+
    "\1\5\1\0\1\66\1\2\1\67\2\70\2\6\2\5"+
    "\2\71\1\0\1\6\1\72\1\5\1\72\1\0\1\6"+
    "\1\5\1\0\2\73\10\0\1\74";

  private static int [] zzUnpackAction() {
    int [] result = new int[190];
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
    "\0\0\0\104\0\210\0\314\0\314\0\314\0\u0110\0\314"+
    "\0\u0154\0\u0198\0\u01dc\0\u0220\0\u0264\0\u02a8\0\u02ec\0\u0330"+
    "\0\u0374\0\u03b8\0\u03fc\0\u0440\0\u0484\0\u04c8\0\u050c\0\u0550"+
    "\0\u0594\0\u05d8\0\u061c\0\u0660\0\u06a4\0\u06e8\0\u072c\0\314"+
    "\0\314\0\u0770\0\u07b4\0\u07f8\0\314\0\314\0\314\0\314"+
    "\0\314\0\314\0\u083c\0\314\0\314\0\314\0\314\0\314"+
    "\0\314\0\u0880\0\314\0\u08c4\0\314\0\u0908\0\u094c\0\u0990"+
    "\0\u09d4\0\u0a18\0\u0a5c\0\u0aa0\0\u0198\0\u0154\0\u0198\0\u0ae4"+
    "\0\u0154\0\u0b28\0\u0b6c\0\u0bb0\0\u0bf4\0\u0c38\0\u0c7c\0\u0cc0"+
    "\0\u0d04\0\u0198\0\u0d48\0\u0d8c\0\u0154\0\u0dd0\0\u0e14\0\u0e58"+
    "\0\u0e9c\0\u0ee0\0\u0f24\0\u0f68\0\u0fac\0\u0ff0\0\u1034\0\u1078"+
    "\0\u10bc\0\u1100\0\314\0\314\0\314\0\314\0\314\0\u1144"+
    "\0\314\0\314\0\314\0\314\0\u1188\0\314\0\314\0\314"+
    "\0\u11cc\0\u1210\0\u1254\0\u1298\0\u12dc\0\u1320\0\u1364\0\u13a8"+
    "\0\u13ec\0\u1430\0\u0198\0\u1474\0\u0154\0\u14b8\0\u14fc\0\u1540"+
    "\0\u1584\0\u15c8\0\u0198\0\u0198\0\u0154\0\u0154\0\u160c\0\u1650"+
    "\0\u1694\0\u16d8\0\u171c\0\u1760\0\u17a4\0\u17e8\0\u182c\0\u1870"+
    "\0\u0198\0\u0198\0\u0154\0\u0154\0\u18b4\0\u18f8\0\u0198\0\u193c"+
    "\0\u0154\0\u0198\0\u0154\0\u1980\0\u19c4\0\u1a08\0\u1a4c\0\u0198"+
    "\0\u0154\0\u0154\0\u0198\0\u0154\0\u1a90\0\u1ad4\0\u1b18\0\314"+
    "\0\u0990\0\u0154\0\u0198\0\u0154\0\u1b5c\0\u1ba0\0\u1be4\0\u1c28"+
    "\0\u0198\0\u0154\0\u1c6c\0\u1cb0\0\u0198\0\u1cf4\0\u0154\0\u1d38"+
    "\0\u1d7c\0\u1dc0\0\u1e04\0\u0198\0\u0154\0\u1e48\0\u1e8c\0\u1ed0"+
    "\0\u1f14\0\u1f58\0\u1f9c\0\u1fe0\0\u2024\0\314";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[190];
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
    "\1\4\1\5\1\6\1\7\1\10\1\4\1\11\1\6"+
    "\1\12\1\11\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\12\1\11\1\12"+
    "\1\11\1\26\1\27\1\30\1\31\1\12\1\11\1\12"+
    "\1\11\1\32\1\33\1\12\1\11\1\12\1\34\1\35"+
    "\1\36\1\37\1\12\1\11\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\4\1\57\4\4\1\12\2\11"+
    "\1\60\1\61\5\60\1\4\61\60\1\62\2\60\1\63"+
    "\1\64\2\60\1\65\3\60\1\6\1\5\54\6\1\66"+
    "\10\6\1\67\14\6\107\0\2\7\102\0\4\11\1\0"+
    "\2\11\1\0\41\11\25\0\3\11\3\0\4\12\1\0"+
    "\2\12\1\0\41\12\25\0\3\12\12\0\1\70\74\0"+
    "\4\12\1\0\2\12\1\0\10\12\2\71\2\12\2\72"+
    "\23\12\25\0\3\12\3\0\4\11\1\0\2\11\1\0"+
    "\10\11\2\73\2\11\2\74\23\11\25\0\3\11\3\0"+
    "\4\12\1\0\2\12\1\0\4\12\2\75\33\12\25\0"+
    "\3\12\3\0\4\11\1\0\2\11\1\0\4\11\2\76"+
    "\33\11\25\0\3\11\3\0\4\12\1\0\2\12\1\0"+
    "\16\12\2\77\21\12\25\0\3\12\3\0\4\11\1\0"+
    "\2\11\1\0\12\11\2\100\2\11\2\101\21\11\25\0"+
    "\3\11\3\0\4\12\1\0\2\12\1\0\10\12\2\102"+
    "\2\103\25\12\25\0\3\12\3\0\4\11\1\0\2\11"+
    "\1\0\10\11\2\104\2\105\25\11\25\0\3\11\3\0"+
    "\4\12\1\0\2\12\1\0\2\106\2\107\35\12\25\0"+
    "\3\12\3\0\4\11\1\0\2\11\1\0\2\110\2\111"+
    "\35\11\25\0\3\11\3\0\4\12\1\0\2\12\1\0"+
    "\4\12\2\112\12\12\2\113\6\12\2\114\7\12\25\0"+
    "\3\12\3\0\4\11\1\0\2\11\1\0\4\11\2\115"+
    "\12\11\2\116\6\11\2\117\7\11\25\0\3\11\3\0"+
    "\4\12\1\0\2\12\1\0\2\120\2\121\35\12\25\0"+
    "\3\12\3\0\4\11\1\0\2\11\1\0\2\122\2\123"+
    "\35\11\25\0\3\11\3\0\4\12\1\0\2\12\1\0"+
    "\22\12\2\124\15\12\25\0\3\12\3\0\4\11\1\0"+
    "\2\11\1\0\22\11\2\125\2\126\13\11\25\0\3\11"+
    "\3\0\4\12\1\0\2\12\1\0\2\12\2\127\35\12"+
    "\25\0\3\12\3\0\4\11\1\0\2\11\1\0\2\11"+
    "\2\130\35\11\25\0\3\11\3\0\4\12\1\0\2\12"+
    "\1\0\22\12\2\131\15\12\25\0\3\12\3\0\4\11"+
    "\1\0\2\11\1\0\22\11\2\132\15\11\25\0\3\11"+
    "\70\0\1\133\25\0\1\134\45\0\1\135\116\0\1\136"+
    "\66\0\1\137\50\0\2\140\57\0\1\141\1\0\16\141"+
    "\1\142\21\141\1\143\31\141\1\144\1\141\1\145\4\141"+
    "\1\146\70\0\1\147\71\0\1\150\25\0\1\70\1\5"+
    "\5\70\1\0\3\70\2\151\67\70\3\0\4\12\1\0"+
    "\2\12\1\0\14\12\2\152\23\12\25\0\3\12\3\0"+
    "\4\12\1\0\2\12\1\0\12\12\2\153\25\12\25\0"+
    "\3\12\3\0\4\11\1\0\2\11\1\0\14\11\2\154"+
    "\23\11\25\0\3\11\3\0\4\11\1\0\2\11\1\0"+
    "\12\11\2\155\25\11\25\0\3\11\3\0\4\11\1\0"+
    "\2\11\1\0\10\11\2\156\27\11\25\0\3\11\3\0"+
    "\4\12\1\0\2\12\1\0\12\12\2\157\25\12\25\0"+
    "\3\12\3\0\4\12\1\0\2\12\1\0\14\12\2\160"+
    "\23\12\25\0\3\12\3\0\4\11\1\0\2\11\1\0"+
    "\12\11\2\161\25\11\25\0\3\11\3\0\4\11\1\0"+
    "\2\11\1\0\14\11\2\162\23\11\25\0\3\11\3\0"+
    "\4\12\1\0\2\12\1\0\26\12\2\163\11\12\25\0"+
    "\3\12\3\0\4\12\1\0\2\12\1\0\2\12\2\164"+
    "\35\12\25\0\3\12\3\0\4\11\1\0\2\11\1\0"+
    "\26\11\2\165\11\11\25\0\3\11\3\0\4\11\1\0"+
    "\2\11\1\0\2\11\2\166\35\11\25\0\3\11\3\0"+
    "\4\12\1\0\2\12\1\0\22\12\2\167\15\12\25\0"+
    "\3\12\3\0\3\12\1\170\1\0\2\12\1\0\32\12"+
    "\1\170\6\12\25\0\3\12\3\0\4\11\1\0\2\11"+
    "\1\0\22\11\2\171\15\11\25\0\3\11\3\0\3\11"+
    "\1\172\1\0\2\11\1\0\32\11\1\172\6\11\25\0"+
    "\3\11\3\0\4\12\1\0\2\12\1\0\35\12\2\173"+
    "\2\12\25\0\3\12\3\0\4\12\1\0\2\12\1\0"+
    "\26\12\2\174\11\12\25\0\3\12\3\0\4\11\1\0"+
    "\2\11\1\0\35\11\2\175\2\11\25\0\3\11\3\0"+
    "\4\11\1\0\2\11\1\0\26\11\2\176\11\11\25\0"+
    "\3\11\3\0\4\12\1\0\2\12\1\0\2\177\37\12"+
    "\25\0\3\12\3\0\4\11\1\0\2\11\1\0\2\200"+
    "\37\11\25\0\3\11\3\0\4\11\1\0\2\11\1\0"+
    "\37\11\2\201\25\0\3\11\3\0\4\12\1\0\2\12"+
    "\1\0\2\12\2\202\35\12\25\0\3\12\3\0\4\11"+
    "\1\0\2\11\1\0\2\11\2\203\35\11\25\0\3\11"+
    "\3\0\4\12\1\0\2\12\1\0\16\12\2\204\21\12"+
    "\25\0\3\12\3\0\4\11\1\0\2\11\1\0\16\11"+
    "\2\205\21\11\25\0\3\11\31\0\2\206\104\0\2\207"+
    "\47\0\1\70\1\5\5\70\1\0\3\70\2\151\2\210"+
    "\65\70\3\0\4\12\1\0\2\12\1\0\2\211\37\12"+
    "\25\0\3\12\3\0\4\12\1\0\2\12\1\0\6\12"+
    "\2\212\31\12\25\0\3\12\3\0\4\11\1\0\2\11"+
    "\1\0\2\213\37\11\25\0\3\11\3\0\4\11\1\0"+
    "\2\11\1\0\6\11\2\214\31\11\25\0\3\11\3\0"+
    "\4\11\1\0\2\11\1\0\14\11\2\215\23\11\25\0"+
    "\3\11\3\0\4\12\1\0\2\12\1\0\14\12\2\216"+
    "\23\12\25\0\3\12\3\0\4\12\1\0\2\12\1\0"+
    "\2\217\37\12\25\0\3\12\3\0\4\11\1\0\2\11"+
    "\1\0\14\11\2\220\23\11\25\0\3\11\3\0\4\11"+
    "\1\0\2\11\1\0\2\221\37\11\25\0\3\11\3\0"+
    "\4\12\1\0\2\12\1\0\33\12\2\222\4\12\25\0"+
    "\3\12\3\0\4\11\1\0\2\11\1\0\33\11\2\223"+
    "\4\11\25\0\3\11\3\0\4\12\1\0\2\12\1\0"+
    "\2\224\37\12\25\0\3\12\3\0\4\12\1\0\2\12"+
    "\1\0\2\12\2\225\35\12\25\0\3\12\3\0\4\11"+
    "\1\0\2\11\1\0\2\226\37\11\25\0\3\11\3\0"+
    "\4\11\1\0\2\11\1\0\2\11\2\227\35\11\25\0"+
    "\3\11\3\0\4\12\1\0\2\12\1\0\20\12\2\230"+
    "\17\12\25\0\3\12\3\0\4\11\1\0\2\11\1\0"+
    "\20\11\2\231\17\11\25\0\3\11\3\0\4\11\1\0"+
    "\2\11\1\0\2\232\37\11\25\0\3\11\3\0\4\12"+
    "\1\0\2\12\1\0\10\12\2\233\27\12\25\0\3\12"+
    "\3\0\4\11\1\0\2\11\1\0\10\11\2\234\27\11"+
    "\25\0\3\11\3\0\4\12\1\0\2\12\1\0\10\12"+
    "\2\235\27\12\25\0\3\12\3\0\4\11\1\0\2\11"+
    "\1\0\10\11\2\236\27\11\25\0\3\11\33\0\2\237"+
    "\146\0\1\240\4\0\1\70\1\5\5\70\1\0\3\70"+
    "\2\151\2\70\2\241\63\70\3\0\4\11\1\0\2\11"+
    "\1\0\2\242\37\11\25\0\3\11\3\0\4\12\1\0"+
    "\2\12\1\0\14\12\2\243\23\12\25\0\3\12\3\0"+
    "\4\11\1\0\2\11\1\0\14\11\2\244\23\11\25\0"+
    "\3\11\3\0\4\12\1\0\2\12\1\0\24\12\2\245"+
    "\13\12\25\0\3\12\3\0\4\12\1\0\2\12\1\0"+
    "\16\12\2\246\21\12\25\0\3\12\3\0\4\11\1\0"+
    "\2\11\1\0\24\11\2\247\13\11\25\0\3\11\3\0"+
    "\4\11\1\0\2\11\1\0\16\11\2\250\21\11\25\0"+
    "\3\11\3\0\4\12\1\0\2\12\1\0\2\251\37\12"+
    "\25\0\3\12\3\0\4\11\1\0\2\11\1\0\2\252"+
    "\37\11\25\0\3\11\13\0\2\253\72\0\4\12\1\0"+
    "\2\12\1\0\16\12\2\254\21\12\25\0\3\12\3\0"+
    "\4\12\1\0\2\12\1\0\30\12\2\255\7\12\25\0"+
    "\3\12\3\0\4\11\1\0\2\11\1\0\16\11\2\256"+
    "\21\11\25\0\3\11\3\0\4\11\1\0\2\11\1\0"+
    "\30\11\2\257\7\11\25\0\3\11\41\0\2\260\44\0"+
    "\4\12\1\0\2\12\1\0\26\12\2\261\11\12\25\0"+
    "\3\12\3\0\4\11\1\0\2\11\1\0\26\11\2\262"+
    "\11\11\25\0\3\11\13\0\2\263\72\0\4\12\1\0"+
    "\2\12\1\0\14\12\2\264\23\12\25\0\3\12\3\0"+
    "\4\11\1\0\2\11\1\0\14\11\2\265\23\11\25\0"+
    "\3\11\37\0\2\266\144\0\2\267\32\0\2\270\104\0"+
    "\2\271\74\0\2\272\116\0\2\273\56\0\2\274\124\0"+
    "\2\275\135\0\1\276\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8296];
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
    "\3\0\3\11\1\1\1\11\27\1\2\11\3\1\6\11"+
    "\1\1\6\11\1\1\1\11\1\1\1\11\2\1\1\0"+
    "\42\1\5\11\1\0\4\11\1\1\3\11\1\0\34\1"+
    "\3\0\26\1\1\0\1\11\12\1\1\0\4\1\1\0"+
    "\2\1\1\0\2\1\10\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[190];
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


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CoolLexer(java.io.Reader in) {
  
/*  Stuff enclosed in %init{ %init} is copied verbatim to the lexer
 *  class constructor, all the extra initialization you want to do should
 *  go here.  Don't remove or modify anything that was there initially. */

    // empty for now
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  CoolLexer(java.io.InputStream in) {
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
    while (i < 172) {
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
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
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
        case 21: 
          { return new Symbol(TokenConstants.LBRACE);
          }
        case 61: break;
        case 55: 
          { return new Symbol(TokenConstants.BOOL_CONST, false);
          }
        case 62: break;
        case 42: 
          { open_comments--;
						if(open_comments==0)
						yybegin(YYINITIAL);
          }
        case 63: break;
        case 33: 
          { return new Symbol(TokenConstants.ASSIGN);
          }
        case 64: break;
        case 13: 
          { return new Symbol(TokenConstants.NEG);
          }
        case 65: break;
        case 30: 
          { return new Symbol(TokenConstants.IF);
          }
        case 66: break;
        case 44: 
          { return new Symbol(TokenConstants.LET);
          }
        case 67: break;
        case 3: 
          { /* ignore this */
          }
        case 68: break;
        case 43: 
          { open_comments++;
          }
        case 69: break;
        case 31: 
          { return new Symbol(TokenConstants.IN);
          }
        case 70: break;
        case 12: 
          { return new Symbol(TokenConstants.EQ);
          }
        case 71: break;
        case 15: 
          { return new Symbol(TokenConstants.AT);
          }
        case 72: break;
        case 45: 
          { return new Symbol(TokenConstants.NEW);
          }
        case 73: break;
        case 39: 
          { string_buf.append("\t");
          }
        case 74: break;
        case 50: 
          { return new Symbol(TokenConstants.LOOP);
          }
        case 75: break;
        case 17: 
          { return new Symbol(TokenConstants.COLON);
          }
        case 76: break;
        case 8: 
          { return new Symbol(TokenConstants.PLUS);
          }
        case 77: break;
        case 48: 
          { return new Symbol(TokenConstants.ESAC);
          }
        case 78: break;
        case 19: 
          { return new Symbol(TokenConstants.LPAREN);
          }
        case 79: break;
        case 57: 
          { return new Symbol(TokenConstants.WHILE);
          }
        case 80: break;
        case 36: 
          { yybegin(COMMENT);
          }
        case 81: break;
        case 49: 
          { return new Symbol(TokenConstants.CASE);
          }
        case 82: break;
        case 52: 
          { return new Symbol(TokenConstants.BOOL_CONST, true);
          }
        case 83: break;
        case 59: 
          { return new Symbol(TokenConstants.INHERITS);
          }
        case 84: break;
        case 47: 
          { return new Symbol(TokenConstants.ELSE);
          }
        case 85: break;
        case 22: 
          { return new Symbol(TokenConstants.RBRACE);
          }
        case 86: break;
        case 14: 
          { return new Symbol(TokenConstants.DOT);
          }
        case 87: break;
        case 51: 
          { return new Symbol(TokenConstants.THEN);
          }
        case 88: break;
        case 34: 
          { return new Symbol(TokenConstants.LE);
          }
        case 89: break;
        case 10: 
          { return new Symbol(TokenConstants.MULT);
          }
        case 90: break;
        case 38: 
          { string_buf.append("\f");
          }
        case 91: break;
        case 35: 
          { return new Symbol(TokenConstants.DARROW);
          }
        case 92: break;
        case 2: 
          { curr_lineno++;
          }
        case 93: break;
        case 29: 
          { return new Symbol(TokenConstants.FI);
          }
        case 94: break;
        case 6: 
          { return new Symbol(TokenConstants.TYPEID,AbstractTable.idtable.addString(yytext()));
          }
        case 95: break;
        case 7: 
          { return new Symbol(TokenConstants.MINUS);
          }
        case 96: break;
        case 40: 
          { string_buf.append("\"");
          }
        case 97: break;
        case 23: 
          { yybegin(STRING);
          }
        case 98: break;
        case 32: 
          { return new Symbol(TokenConstants.ERROR,"Unmatched *)");
          }
        case 99: break;
        case 58: 
          { return new Symbol(TokenConstants.ISVOID);
          }
        case 100: break;
        case 28: 
          { return new Symbol(TokenConstants.OF);
          }
        case 101: break;
        case 16: 
          { return new Symbol(TokenConstants.SEMI);
          }
        case 102: break;
        case 46: 
          { return new Symbol(TokenConstants.NOT);
          }
        case 103: break;
        case 25: 
          { curr_lineno++;	
						return new Symbol(TokenConstants.ERROR,"Unterminated string constant");
          }
        case 104: break;
        case 18: 
          { return new Symbol(TokenConstants.COMMA);
          }
        case 105: break;
        case 37: 
          { string_buf.append(yytext().substring(1));
          }
        case 106: break;
        case 9: 
          { return new Symbol(TokenConstants.DIV);
          }
        case 107: break;
        case 11: 
          { return new Symbol(TokenConstants.LT);
          }
        case 108: break;
        case 5: 
          { return new Symbol(TokenConstants.OBJECTID,AbstractTable.idtable.addString(yytext()));
          }
        case 109: break;
        case 60: 
          { string_buf.append("\n");
          }
        case 110: break;
        case 27: 
          { return new Symbol(TokenConstants.ERROR,"String contains null character");
          }
        case 111: break;
        case 54: 
          { //if(stringlen_ok==true && string_buf.length>=MAX_STR_CONST)
						string_buf.append('\n');
          }
        case 112: break;
        case 56: 
          { return new Symbol(TokenConstants.CLASS);
          }
        case 113: break;
        case 53: 
          { return new Symbol(TokenConstants.POOL);
          }
        case 114: break;
        case 20: 
          { return new Symbol(TokenConstants.RPAREN);
          }
        case 115: break;
        case 41: 
          { string_buf.append("\b");
          }
        case 116: break;
        case 4: 
          { return new Symbol(TokenConstants.INT_CONST,AbstractTable.inttable.addString(yytext()));
          }
        case 117: break;
        case 1: 
          { /* This rule should be the very last
						in your lexical specification and
						will match match everything not
						matched by other lexical rules. */
						System.err.println("LEXER BUG - UNMATCHED: " + yytext());
						return new Symbol(TokenConstants.ERROR, yytext());
          }
        case 118: break;
        case 24: 
          { string_buf.append(yytext());
          }
        case 119: break;
        case 26: 
          { yybegin(YYINITIAL);
						set_filename(string_buf.toString());
						string_buf.delete(0,string_buf.length());
						return new Symbol(TokenConstants.STR_CONST,curr_filename());
          }
        case 120: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { 
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
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
