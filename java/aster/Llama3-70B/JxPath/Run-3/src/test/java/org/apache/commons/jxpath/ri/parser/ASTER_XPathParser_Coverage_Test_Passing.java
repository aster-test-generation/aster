/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XPathParser_Coverage_Test_Passing {
  private XPathParser xpathparser;
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_QLyX0() throws Exception {
    xpathparser = new XPathParser(new java.io.StringReader("")); // create a dummy XPathParser instance
  }
@BeforeEach
  @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAbsoluteLocationPath_ArrayListInitialization_zsNF1() throws Exception {
    ArrayList steps = new ArrayList();
    Object result = xpathparser.AbsoluteLocationPath();
    assertNotNull(result);
}
@BeforeEach
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_tokenSource_Jnba0() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        XPathParserTokenManager tm = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader(""), 1, 1));
        parser.ReInit(tm);
        assertEquals(tm, parser.token_source);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_token_RKHY1() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        XPathParserTokenManager tm = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader(""), 1, 1));
        parser.ReInit(tm);
        assertNotNull(parser.token);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_tokenNext_ntub2() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        XPathParserTokenManager tm = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader(""), 1, 1));
        parser.ReInit(tm);
        assertNotNull(parser.token.next);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_jj_nt_DWns3() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        XPathParserTokenManager tm = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader(""), 1, 1));
        parser.ReInit(tm);
        assertNotNull(parser.jj_nt);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_tokenSourceNotNull_rWXJ7() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        XPathParserTokenManager tm = null;
        try {
            parser.ReInit(tm);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
}