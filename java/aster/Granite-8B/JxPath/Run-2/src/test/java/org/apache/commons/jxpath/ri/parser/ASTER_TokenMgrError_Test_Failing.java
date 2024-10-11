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

public class Aster_TokenMgrError_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes4_RSfT3() {
        String str = "This is a test string with \u00A0 and \u2028";
        String expected = "This is a test string with \\u00A0 and \\u2028";
        String actual = TokenMgrError.addEscapes(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLexicalError1_JKst0() {
        boolean EOFSeen = true;
        int lexState = 0;
        int errorLine = 1;
        int errorColumn = 1;
        String errorAfter = "test";
        char curChar = 'a';
        String result = TokenMgrError.LexicalError(EOFSeen, lexState, errorLine, errorColumn, errorAfter, curChar);
        assertEquals("Lexical error at line 1, column 1.  Encountered: \"a\" (97), after : \"test\"", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes4_RSfT3_fid1() {
        String str = "This is a test string with \u00a0 and \u2028";
        String expected = "This is a test string with \\u00A0 and \\u2028";
        String actual = TokenMgrError.addEscapes(str);
        assertEquals(expected, actual);
    }
}