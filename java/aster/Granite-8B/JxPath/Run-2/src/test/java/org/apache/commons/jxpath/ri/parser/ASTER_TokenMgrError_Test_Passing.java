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
    public void testAddEscapes1_NFCz0() {
        String str = "Hello, World!";
        String expected = "Hello, World!";
        String actual = TokenMgrError.addEscapes(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes2_bWBk1() {
        String str = "This is a test string with \"quotes\" and 'single quotes'";
        String expected = "This is a test string with \\\"quotes\\\" and \\'single quotes\\'";
        String actual = TokenMgrError.addEscapes(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes3_BjdM2() {
        String str = "This is a test string with \\ and \n";
        String expected = "This is a test string with \\\\ and \\n";
        String actual = TokenMgrError.addEscapes(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLexicalError2_wbTs1() {
        boolean EOFSeen = false;
        int lexState = 1;
        int errorLine = 2;
        int errorColumn = 2;
        String errorAfter = "test2";
        char curChar = 'b';
        String result = TokenMgrError.LexicalError(EOFSeen, lexState, errorLine, errorColumn, errorAfter, curChar);
        assertEquals("Lexical error at line 2, column 2.  Encountered: \"b\" (98), after : \"test2\"", result);
    }
}