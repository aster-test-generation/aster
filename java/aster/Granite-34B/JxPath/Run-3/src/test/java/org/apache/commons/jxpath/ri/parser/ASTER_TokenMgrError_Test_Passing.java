/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TokenMgrError_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLexicalErrorEOFSeen_FSYy0() throws Exception {
        String result = TokenMgrError.LexicalError(true, 1, 2, 3, "error", 'a');
        String expected = "Lexical error at line 2, column 3.  Encountered: \"<EOF> \" (0), after : \"error\"";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLexicalErrorNoEOFSeen_vLJi1() throws Exception {
        String result = TokenMgrError.LexicalError(false, 1, 2, 3, "error", 'a');
        String expected = "Lexical error at line 2, column 3.  Encountered: \"a\" (97), after : \"error\"";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_QSHT0() throws Exception {
        String input = "Hello, World!";
        String expected = "Hello, World!";
        String actual = TokenMgrError.addEscapes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesWithSpecialChars_ZLSR1() throws Exception {
        String input = "\b\t\n\f\r\"\'\\";
        String expected = "\\b\\t\\n\\f\\r\\\"\\'\\\\";
        String actual = TokenMgrError.addEscapes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesWithControlChars_eqTs2() throws Exception {
        String input = "\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F";
        String expected = "\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000b\\f\\r\\u000e\\u000f\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001a\\u001b\\u001c\\u001d\\u001e\\u001f";
        String actual = TokenMgrError.addEscapes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesWithEmptyInput_oqVs3() throws Exception {
        String input = "";
        String expected = "";
        String actual = TokenMgrError.addEscapes(input);
        assertEquals(expected, actual);
    }
}