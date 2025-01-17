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
    public void testGetExceptionWithExceptionParameter_cntE0() {
        Exception e = new Exception();
        JXPathContextFactoryConfigurationError jxpath = new JXPathContextFactoryConfigurationError(e);
        Exception result = jxpath.getException();
        assertEquals(e, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithStringParameter_RrXD1() {
        String msg = "Test message";
        JXPathContextFactoryConfigurationError jxpath = new JXPathContextFactoryConfigurationError(msg);
        Exception result = jxpath.getException();
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithoutParameter_jsfi2() {
        JXPathContextFactoryConfigurationError jxpath = new JXPathContextFactoryConfigurationError();
        Exception result = jxpath.getException();
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithExceptionAndStringParameter_mmWq3() {
        Exception e = new Exception();
        String msg = "Test message";
        JXPathContextFactoryConfigurationError jxpath = new JXPathContextFactoryConfigurationError(e, msg);
        Exception result = jxpath.getException();
        assertEquals(e, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithNullMessageAndException_LhTj0() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError(null, "exception message");
        String message = error.getMessage();
        assertEquals("exception message", message);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithNullMessageAndNoException_mnKy1() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError();
        String message = error.getMessage();
        assertEquals(null, message);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithMessageAndNoException_zTmq2() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError("message");
        String message = error.getMessage();
        assertEquals("message", message);
    }
}