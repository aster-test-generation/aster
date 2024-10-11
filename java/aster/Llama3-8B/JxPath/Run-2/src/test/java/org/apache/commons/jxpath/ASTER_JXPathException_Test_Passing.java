/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathException_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCauseWithNoCause_SMII2() {
        JXPathException exception = new JXPathException();
        Throwable cause = exception.getCause();
        assertEquals(null, cause);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithMessageAndCause_NHJs2_1() {
        JXPathException jxpathException = new JXPathException("cause", new Exception("cause"));
        Throwable exception = jxpathException.getException();
        assertEquals("cause", exception.getMessage());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithCause_mgOm3_1() {
        JXPathException jxpathException = new JXPathException(new Exception("cause"));
        Throwable exception = jxpathException.getException();
    assertNull(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMessageWithMessage_KjUI1() {
    JXPathException exception = new JXPathException("Test Message");
    String result = exception.getMessage();
    assertEquals("Test Message", result);
}
}