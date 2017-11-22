/* The following code was generated by JFlex 1.6.1 */

package jflexdemo; 

import java.util.ArrayList;
 

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Automata/java-lexical-analyzer/src/jflexdemo/description.flex</tt>
 */
public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int FIRST = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\1\1\35\1\35\1\34\22\0\1\33\1\0\1\31\5\0"+
    "\2\32\1\22\1\20\1\0\1\21\1\0\1\23\12\30\1\0\1\32"+
    "\1\25\1\24\1\25\2\0\32\27\6\0\1\17\2\27\1\12\1\6"+
    "\1\3\1\27\1\5\1\2\2\27\1\10\1\27\1\7\1\14\1\15"+
    "\1\27\1\16\1\11\1\4\2\27\1\13\3\27\12\0\1\35\u05da\0"+
    "\12\26\206\0\12\26\306\0\12\26\u019c\0\12\26\166\0\12\26\166\0"+
    "\12\26\166\0\12\26\166\0\12\26\166\0\12\26\166\0\12\26\166\0"+
    "\12\26\166\0\12\26\166\0\12\26\140\0\12\26\166\0\12\26\106\0"+
    "\12\26\u0116\0\12\26\106\0\12\26\u0746\0\12\26\46\0\12\26\u012c\0"+
    "\12\26\200\0\12\26\246\0\12\26\6\0\12\26\266\0\12\26\126\0"+
    "\12\26\206\0\12\26\6\0\12\26\u03ce\0\1\35\1\35\u85f6\0\12\26"+
    "\u02a6\0\12\26\46\0\12\26\306\0\12\26\26\0\12\26\126\0\12\26"+
    "\u0196\0\12\26\u5316\0\12\26\u0586\0\12\26\u0bbc\0\12\26\200\0\12\26"+
    "\74\0\12\26\220\0\12\26\u0116\0\12\26\u01d6\0\12\26\u0176\0\12\26"+
    "\146\0\12\26\u0216\0\12\26\u5176\0\12\26\346\0\12\26\u6c74\0\62\26"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u280f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\11\3\5\4\1\5\1\1\1\6"+
    "\1\2\1\7\7\3\1\0\1\2\1\0\1\10\7\3"+
    "\1\0\3\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[45];
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
    "\0\0\0\36\0\0\0\0\0\74\0\132\0\170\0\226"+
    "\0\264\0\322\0\360\0\u010e\0\u012c\0\u014a\0\u0168\0\0"+
    "\0\u0186\0\u01a4\0\u01c2\0\u01e0\0\0\0\u01fe\0\132\0\u021c"+
    "\0\u023a\0\u0258\0\u0276\0\u0294\0\u02b2\0\u02d0\0\u02ee\0\u030c"+
    "\0\u01e0\0\u01e0\0\u032a\0\u0348\0\u0366\0\u0384\0\u03a2\0\u03c0"+
    "\0\u03de\0\u03fc\0\u041a\0\u0438\0\u0456";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[45];
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
    "\36\0\1\3\1\4\1\5\1\6\1\7\1\6\1\10"+
    "\1\11\2\6\1\12\1\13\1\6\1\14\1\15\1\6"+
    "\1\16\1\17\1\20\1\21\2\22\1\23\1\6\1\23"+
    "\1\24\1\25\1\4\1\26\3\0\1\6\1\27\14\6"+
    "\7\0\2\6\7\0\16\6\7\0\2\6\7\0\3\6"+
    "\1\30\12\6\7\0\2\6\7\0\5\6\1\31\1\32"+
    "\7\6\7\0\2\6\7\0\4\6\1\33\11\6\7\0"+
    "\2\6\7\0\12\6\1\27\3\6\7\0\2\6\7\0"+
    "\3\6\1\34\12\6\7\0\2\6\7\0\14\6\1\35"+
    "\1\6\7\0\2\6\7\0\4\6\1\36\11\6\7\0"+
    "\2\6\25\0\1\20\36\0\1\20\36\0\1\37\1\40"+
    "\36\0\1\20\37\0\1\23\1\0\1\23\5\0\1\41"+
    "\1\0\27\41\1\42\4\41\1\0\1\4\36\0\4\6"+
    "\1\43\11\6\7\0\2\6\7\0\10\6\1\44\5\6"+
    "\7\0\2\6\7\0\7\6\1\45\6\6\7\0\2\6"+
    "\7\0\11\6\1\46\4\6\7\0\2\6\7\0\1\47"+
    "\15\6\7\0\2\6\7\0\1\50\15\6\7\0\2\6"+
    "\7\0\15\6\1\51\7\0\2\6\5\0\22\37\1\52"+
    "\13\37\1\40\1\0\34\40\2\0\5\6\1\27\10\6"+
    "\7\0\2\6\7\0\1\5\10\6\1\13\4\6\7\0"+
    "\2\6\7\0\4\6\1\27\11\6\7\0\2\6\7\0"+
    "\6\6\1\53\7\6\7\0\2\6\7\0\6\6\1\45"+
    "\7\6\7\0\2\6\7\0\5\6\1\54\10\6\7\0"+
    "\2\6\7\0\10\6\1\27\5\6\7\0\2\6\5\0"+
    "\22\37\1\52\1\4\12\37\2\0\1\55\15\6\7\0"+
    "\2\6\7\0\2\6\1\27\13\6\7\0\2\6\7\0"+
    "\5\6\1\45\10\6\7\0\2\6\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1140];
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
    "\1\10\1\0\2\11\13\1\1\11\4\1\1\11\11\1"+
    "\1\0\1\1\1\0\10\1\1\0\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[45];
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
	 private ArrayList<String> list= new ArrayList();


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
      yybegin( FIRST ); 
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
    while (i < 332) {
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
  public Void yylex() throws java.io.IOException {
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.err.println( "Invalid character \"" + yytext() + "\"" );
            }
          case 9: break;
          case 2: 
            { 
            }
          case 10: break;
          case 3: 
            { if(list.contains(yytext()))
        {
            System.out.println( "Identifier "+yytext() +" already in symbol table");
        }
        else
        {
            System.out.println( "New Identifier :\t" + yytext() );
            list.add(yytext());
        }
            }
          case 11: break;
          case 4: 
            { System.out.println( "Operator :\t" + yytext()  );
            }
          case 12: break;
          case 5: 
            { System.out.println( "Integer :\t" + yytext()  );
            }
          case 13: break;
          case 6: 
            { if(yytext().equals(";"))
        {
            System.out.println( "Semicolon :\t" + yytext()  ); 
        }
        else if(yytext().equals("("))
        {
            System.out.println( "Open Bracket :\t" + yytext()  ); 
        }
        else
        {
            System.out.println( "Close Bracket :\t" + yytext()  ); 
        }
            }
          case 14: break;
          case 7: 
            { System.out.println( "Keyword :\t" + yytext()  );
            }
          case 15: break;
          case 8: 
            { System.out.println( "String :\t" + yytext()  );
            }
          case 16: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
