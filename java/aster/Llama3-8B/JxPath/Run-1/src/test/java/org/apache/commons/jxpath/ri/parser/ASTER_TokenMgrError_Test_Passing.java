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
    public void testAddEscapes1_bGGY0() {
        assertEquals("\\b", TokenMgrError.addEscapes("\b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes2_Nnsh1() {
        assertEquals("\\t", TokenMgrError.addEscapes("\t"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes3_HnuH2() {
        assertEquals("\\n", TokenMgrError.addEscapes("\n"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLexicalError2_lUxV1() {
        String result = TokenMgrError.LexicalError(false, 1, 2, 3, "abc", 'd');
        assertEquals("Lexical error at line 2, column 3.  Encountered: \"d\" (100), after : \"abc\"", result);
    }
}