/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_XPathParserTokenManager_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSwitchToInvalidState_VlOp1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        try {
            tokenManager.SwitchTo(2);
            fail("Expected TokenMgrError");
        } catch (TokenMgrError e) {
            assertEquals("Error: Ignoring invalid lexical state : 2. State unchanged.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSwitchToNegativeState_CjoF2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        try {
            tokenManager.SwitchTo(-1);
            fail("Expected TokenMgrError");
        } catch (TokenMgrError e) {
            assertEquals("Error: Ignoring invalid lexical state : -1. State unchanged.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken10_ipdo9_CJxg0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a"), 1, 1);
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        tokenManager.setDebugStream(System.out);
        assertNotNull(tokenManager);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDebugStream_CgYO0_KqAw0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        java.io.PrintStream printStream = new java.io.PrintStream(new java.io.ByteArrayOutputStream());
        tokenManager.setDebugStream(printStream);
        assertSame(printStream, tokenManager.debugStream);
    }
}