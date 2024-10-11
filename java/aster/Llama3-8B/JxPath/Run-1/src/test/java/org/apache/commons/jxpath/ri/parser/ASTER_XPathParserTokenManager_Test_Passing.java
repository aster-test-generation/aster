/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_XPathParserTokenManager_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_mGqs0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        XPathParserTokenManager manager = new XPathParserTokenManager(stream, 0);
        manager.ReInit(stream, 0);
        assertEquals(true, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSwitchToInvalidState_yTGF1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        XPathParserTokenManager manager = new XPathParserTokenManager(stream, 0);
        try {
            manager.SwitchTo(1);
            fail("Expected TokenMgrError");
        } catch (TokenMgrError e) {
            assertEquals("Error: Ignoring invalid lexical state : 1. State unchanged.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken1_GBhI0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken2_hudt1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken3_HsEX2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken4_pIDO3() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken5_JIXb4() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken6_WRyT5() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e f"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken7_Vidp6() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e f g"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken8_bEUE7() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e f g h"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken9_MbKn8() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e f g h i"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken10_hpsx9() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e f g h i j"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken11_VsgL10() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e f g h i j k"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken2_eAgU1_LxFd0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("a")));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken4_dHJM3_oQxG0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("abc")));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken2_Igzh1_CdTV0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("a")));
        Assertions.assertNotNull(tokenManager);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken4_ybqO3_JXtK0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("a b c")));
        Assertions.assertNotNull(tokenManager);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken5_AIiA4_iuCL0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("a b c d")));
        tokenManager.setDebugStream(System.out);
        tokenManager.getNextToken();
        Assertions.assertNotNull(tokenManager);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken8_gyHc7_OGss1() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("a b c d e f g")));
        Assertions.assertNotNull(tokenManager);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken9_UCfC8_iRuk0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("a b c d e f g h")));
        Assertions.assertNotNull(tokenManager);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken11_Jaof10_WQNW0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("a b c d e f g h i j")));
        tokenManager.setDebugStream(System.out);
        tokenManager.getNextToken();
        Assertions.assertNotNull(tokenManager);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken3_JvTD2_JVmx1() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("a=")), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken2_aGjo1_rIlu0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("abc")));
        tokenManager.setDebugStream(System.out);
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        Object token = tokenManager.getNextToken();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken2_wqFu1_jwPT0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("abc")));
        tokenManager.setDebugStream(System.out);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken3_pSOa2_hrFg0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("abc")));
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken4_UZnl3_SvAV0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("abc")));
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken5_pmbf4_Blxu0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("abc")));
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken6_TcaO5_mdkP0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("abc")));
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken8_yQiL7_buhk0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("abc")));
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken9_rtnl8_DPfX0() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("abc")));
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        tokenManager.getNextToken();
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken1_lYNw0_Agen0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        XPathParserTokenManager parser = new XPathParserTokenManager(stream);
        assertNotNull(parser);
    }
}