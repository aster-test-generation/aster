/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XPathParserTokenManager_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReInit_yIBp0_HOuv0() {
    SimpleCharStream stream = new SimpleCharStream(System.in);
    XPathParserTokenManager manager = new XPathParserTokenManager(stream);
    manager.ReInit(stream, 1);
    assertEquals(1, manager.curLexState);
}
}