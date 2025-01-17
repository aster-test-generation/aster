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
    public void getMessage_withNoSuperMessageAndNoException_returnsNull_nRYi0() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError();
        assertEquals(null, error.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMessage_withSuperMessageAndNoException_returnsSuperMessage_hkCF2() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError("test super message");
        assertEquals("test super message", error.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMessage_withSuperMessageAndExceptionWithMessage_returnsSuperMessage_VpHc3() {
        Exception exception = new Exception("test exception message");
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError(exception, "test super message");
        assertEquals("test super message", error.getMessage());
    }
}