/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XPathParserTokenManager_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_KOCj0() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        XPathParserTokenManager manager = new XPathParserTokenManager(stream, 0);
        manager.ReInit(stream, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit2_hbVj1() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
        manager.ReInit(stream, 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit3_lHJP2() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        XPathParserTokenManager manager = new XPathParserTokenManager(stream, 0);
        manager.ReInit(stream);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSwitchToInvalidState_ZhcQ1() throws Exception {
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
    public void testGetNextToken1_gfHO0() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken2_psCB1() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken3_vroB2() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken4_temc3() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken5_OmES4() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken6_itzO5() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e f"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken7_Kmre6() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e f g"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken8_SkGP7() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e f g h"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken9_DSDR8() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e f g h i"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken10_TruB9() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e f g h i j"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextToken11_tTnM10() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a b c d e f g h i j k"));
        XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    }
}