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
    public void testAddEscapes1_FVJI0() {
        assertEquals("\\b", TokenMgrError.addEscapes("\\b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes2_URQq1() {
        assertEquals("\\t", TokenMgrError.addEscapes("\\t"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes3_nJQj2() {
        assertEquals("\\n", TokenMgrError.addEscapes("\\n"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLexicalError_QjFQ0() {
        assertEquals("Lexical error at line 1, column 1.  Encountered: <EOF> , after : \"\"", TokenMgrError.LexicalError(true, 0, 1, 1, "", '\0'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes1_FVJI0_fid1() {
        assertEquals("\\\b", TokenMgrError.addEscapes("\\\b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes2_URQq1_fid1() {
        assertEquals("\\\t", TokenMgrError.addEscapes("\\\t"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes3_nJQj2_fid1() {
        assertEquals("\\\n", TokenMgrError.addEscapes("\\\n"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes4_tlBH3_NlsX0() {
        assertEquals("\\u000A", TokenMgrError.addEscapes("\\u000A"));
    }
}