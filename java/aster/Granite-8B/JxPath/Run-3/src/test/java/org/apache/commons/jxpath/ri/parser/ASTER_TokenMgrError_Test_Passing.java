/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TokenMgrError_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes1_NdjS0() {
        String str = "Hello, World!";
        String expected = "Hello, World!";
        String actual = TokenMgrError.addEscapes(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes2_yPXO1() {
        String str = "This is a test string with \"quotes\" and 'single quotes'";
        String expected = "This is a test string with \\\"quotes\\\" and \\'single quotes\\'";
        String actual = TokenMgrError.addEscapes(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes3_ToHJ2() {
        String str = "This is a test string with \\ and \n";
        String expected = "This is a test string with \\\\ and \\n";
        String actual = TokenMgrError.addEscapes(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes4_qqtV3() {
        String str = "This is a test string with \u00A0 and \u2028";
        String expected = "This is a test string with \\u00A0 and \\u2028";
        String actual = TokenMgrError.addEscapes(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLexicalError1_JtMD0() {
        boolean EOFSeen = true;
        int lexState = 0;
        int errorLine = 1;
        int errorColumn = 2;
        String errorAfter = "errorAfter";
        char curChar = 'a';
        String expected = "Lexical error at line 1, column 2.  Encountered: <EOF>  (128), after : \"errorAfter\"";
        String actual = TokenMgrError.LexicalError(EOFSeen, lexState, errorLine, errorColumn, errorAfter, curChar);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLexicalError2_kTio1() {
        boolean EOFSeen = false;
        int lexState = 1;
        int errorLine = 3;
        int errorColumn = 4;
        String errorAfter = "errorAfter2";
        char curChar = 'b';
        String expected = "Lexical error at line 3, column 4.  Encountered: \"b\" (98), after : \"errorAfter2\"";
        String actual = TokenMgrError.LexicalError(EOFSeen, lexState, errorLine, errorColumn, errorAfter, curChar);
        assertEquals(expected, actual);
    }
}