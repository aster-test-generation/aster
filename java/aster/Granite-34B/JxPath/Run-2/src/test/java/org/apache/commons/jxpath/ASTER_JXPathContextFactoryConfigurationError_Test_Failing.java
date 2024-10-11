/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathContextFactoryConfigurationError_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetException_mevp0() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError();
        Exception exception = error.getException();
        assertNotNull(exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithMessage_XuZH1_1() {
        String message = "This is a test message";
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError(message);
        Exception exception = error.getException();
        assertNotNull(exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithMessage_XuZH1_2() {
        String message = "This is a test message";
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError(message);
        Exception exception = error.getException();
        assertEquals(message, exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithMessageAndCause_YuHs3_2_fid2() {
        String message = "This is a test message";
        Exception cause = new Exception("This is a test cause");
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError(cause, message);
        Exception exception = error.getException();
        assertEquals(message, exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMessage_withNoMessageAndExceptionWithMessage_returnsExceptionMessage_MpjI1_fid2() {
        Exception exception = new Exception("exception message");
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError(exception);
        String message = error.getMessage();
        Assertions.assertEquals("exception message", message);
    }
}