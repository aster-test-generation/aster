/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathException_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCauseWithThrowable_ZJQW0() {
    Throwable expectedException = new Exception("Test Exception");
    JXPathException jxPathException = new JXPathException(expectedException);
    Throwable actualException = jxPathException.getCause();
    assertEquals(expectedException, actualException);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetExceptionWithThrowable_fDcd0() {
    Throwable expectedException = new Throwable("Sample Throwable");
    JXPathException jXPathException = new JXPathException(expectedException);
    Throwable actualException = jXPathException.getException();
    assertEquals(expectedException, actualException);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_NullException_fPtK0() {
        JXPathException exception = new JXPathException("Test message");
        assertEquals("Test message", exception.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_WithNullExceptionMessage_rEXm1() {
        Throwable cause = new RuntimeException();
        JXPathException exception = new JXPathException("Test message", cause);
        assertEquals("Test message; RuntimeException", exception.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_WithExceptionMessage_iJsx2() {
        Throwable cause = new RuntimeException("Cause message");
        JXPathException exception = new JXPathException("Test message", cause);
        assertEquals("Test message; Cause message", exception.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_NoMessageWithException_ChmV3() {
        Throwable cause = new RuntimeException("Only cause message");
        JXPathException exception = new JXPathException(cause);
        assertEquals("Only cause message", exception.getMessage());
    }
}