/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_XPathParserTokenManager_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSwitchToInvalidLexicalState_FNYY0() {
        XPathParserTokenManager manager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("")), 0);
        try {
            manager.SwitchTo(-1);
            fail("Expected TokenMgrError");
        } catch (TokenMgrError e) {
            assertEquals("Error: Ignoring invalid lexical state : -1. State unchanged.", e.getMessage());
            assertEquals(TokenMgrError.INVALID_LEXICAL_STATE, e.errorCode);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSwitchToValidLexicalState_hLUB1() {
        XPathParserTokenManager manager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("")), 0);
        manager.SwitchTo(0);
        assertEquals(0, manager.curLexState);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSwitchToOutOfRangeLexicalState_Wiwc2() {
        XPathParserTokenManager manager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("")), 0);
        try {
            manager.SwitchTo(1);
            fail("Expected TokenMgrError");
        } catch (TokenMgrError e) {
            assertEquals("Error: Ignoring invalid lexical state : 1. State unchanged.", e.getMessage());
            assertEquals(TokenMgrError.INVALID_LEXICAL_STATE, e.errorCode);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken1_ShXA0_YhGO0_1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1);
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        tokenManager.ReInit(stream);
        assertEquals(0, tokenManager.jjmatchedPos);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken1_ShXA0_YhGO0_2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1);
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        tokenManager.ReInit(stream);
        assertEquals(0, tokenManager.jjnewStateCnt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken1_ShXA0_YhGO0_3() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1);
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        tokenManager.ReInit(stream);
        assertEquals(0, tokenManager.curLexState);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken1_ShXA0_YhGO0_4() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 1, 1);
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        tokenManager.ReInit(stream);
        assertEquals(stream, tokenManager.input_stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken2_mXmM1_eCpz1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken4_Gjbl3_bWLQ0_1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""));
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        tokenManager.ReInit(stream);
        assertEquals(0, tokenManager.jjmatchedPos);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken4_Gjbl3_bWLQ0_2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""));
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        tokenManager.ReInit(stream);
        assertEquals(0, tokenManager.jjnewStateCnt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken4_Gjbl3_bWLQ0_3() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""));
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        tokenManager.ReInit(stream);
        assertEquals(0, tokenManager.curLexState);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken4_Gjbl3_bWLQ0_4() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""));
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
        tokenManager.ReInit(stream);
        assertEquals(stream, tokenManager.input_stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken3_QEYG2_OlYI1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]));
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(stream);
    }
}