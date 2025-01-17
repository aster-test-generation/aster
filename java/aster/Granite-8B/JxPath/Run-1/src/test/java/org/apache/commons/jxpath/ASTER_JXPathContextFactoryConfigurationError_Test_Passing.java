/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathContextFactoryConfigurationError_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithExceptionParameter_DXYy0() {
        Exception e = new Exception();
        JXPathContextFactoryConfigurationError jxpath = new JXPathContextFactoryConfigurationError(e);
        Exception result = jxpath.getException();
        assertEquals(e, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithStringParameter_RfoI1() {
        String msg = "Test message";
        JXPathContextFactoryConfigurationError jxpath = new JXPathContextFactoryConfigurationError(msg);
        Exception result = jxpath.getException();
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithoutParameter_pJoq2() {
        JXPathContextFactoryConfigurationError jxpath = new JXPathContextFactoryConfigurationError();
        Exception result = jxpath.getException();
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithExceptionAndStringParameter_Azgf3() {
        Exception e = new Exception();
        String msg = "Test message";
        JXPathContextFactoryConfigurationError jxpath = new JXPathContextFactoryConfigurationError(e, msg);
        Exception result = jxpath.getException();
        assertEquals(e, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithNullMessageAndException_Jbrs0() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError(null, "test exception");
        assertEquals("test exception", error.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithMessageAndNullException_VmCD1() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError("test message");
        assertEquals("test message", error.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithNullMessageAndNullException_cuOV2_TCwR1() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError(null, "test message");
        assertEquals("test message", error.getMessage());
    }
}