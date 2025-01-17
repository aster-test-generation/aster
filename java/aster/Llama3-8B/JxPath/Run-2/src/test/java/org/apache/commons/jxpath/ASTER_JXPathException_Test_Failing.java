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
public class Aster_JXPathException_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCause_IJEg0() {
        JXPathException exception = new JXPathException("test message");
        Throwable cause = exception.getCause();
    assertNull(exception);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCauseWithNestedException_Wxwl1() {
        JXPathException exception = new JXPathException("test message", new Exception("nested exception"));
        Throwable cause = exception.getCause();
        assertEquals(new Exception("nested exception"), cause);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCauseWithWrappedCause_DtFq3() {
        JXPathException exception = new JXPathException(new Exception("wrapped exception"));
        Throwable cause = exception.getCause();
        assertEquals(new Exception("wrapped exception"), cause);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetException_kPYE0() {
        JXPathException jxpathException = new JXPathException("message");
        Throwable exception = jxpathException.getException();
        assertEquals("message", exception.getMessage());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionNoMessage_ljNo1() {
        JXPathException jxpathException = new JXPathException();
        Throwable exception = jxpathException.getException();
        assertEquals(null, exception.getMessage());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithMessageAndCause_NHJs2_2() {
        JXPathException jxpathException = new JXPathException("message", new Exception("cause"));
        Throwable exception = jxpathException.getException();
        assertEquals("cause", exception.getCause().getMessage());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCause_IJEg0_fid2() {
        JXPathException exception = new JXPathException("test message");
        Throwable cause = exception.getCause();
        assertEquals(exception, cause);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithMessageAndCause_NHJs2_1_fid2() {
        JXPathException jxpathException = new JXPathException("message", new Exception("cause"));
        Throwable exception = jxpathException.getException();
        assertEquals("message", exception.getMessage());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithCause_mgOm3_1_fid2() {
        JXPathException jxpathException = new JXPathException(new Exception("cause"));
        Throwable exception = jxpathException.getException();
        assertEquals(null, exception.getMessage());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithCause_mgOm3_2() {
        JXPathException jxpathException = new JXPathException(new Exception("cause"));
        Throwable exception = jxpathException.getException();
        assertEquals("cause", exception.getCause().getMessage());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMessageWithNullException_ncFm0() {
    JXPathException exception = new JXPathException();
    String result = exception.getMessage();
    assertEquals("null", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMessageWithException_QoqS2() {
    JXPathException exception = new JXPathException(new Exception("Test Exception"));
    String result = exception.getMessage();
    assertEquals("java.lang.Exception; Test Exception", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMessageWithMessageAndException_PelL3() {
    JXPathException exception = new JXPathException("Test Message", new Exception("Test Exception"));
    String result = exception.getMessage();
    assertEquals("Test Message; java.lang.Exception", result);
}
}