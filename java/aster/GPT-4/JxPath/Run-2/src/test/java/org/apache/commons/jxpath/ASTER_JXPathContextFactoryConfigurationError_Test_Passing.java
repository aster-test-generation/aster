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
public class Aster_JXPathContextFactoryConfigurationError_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetExceptionWithExceptionConstructor_nWMZ0() {
    Exception expectedException = new Exception("Test Exception");
    JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError(expectedException);
    assertEquals(expectedException, error.getException());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_NullMessageWithException_RVos0() {
        Exception exception = new Exception("Exception message");
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError(exception);
        assertEquals("Exception message", error.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_OnlyMessage_zDjD1() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError("Error message");
        assertEquals("Error message", error.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_NullMessageAndNoException_ByfJ2() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError();
        assertNull(error.getMessage());
    }
}