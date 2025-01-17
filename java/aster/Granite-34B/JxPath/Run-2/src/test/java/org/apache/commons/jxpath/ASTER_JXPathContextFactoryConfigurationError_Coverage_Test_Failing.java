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

public class Aster_JXPathContextFactoryConfigurationError_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMessage_with_null_message_and_exception_returns_exception_message_HGxp0() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError(new Exception("test"));
        assertEquals("test", error.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMessage_with_null_message_and_exception_returns_exception_message_HGxp0_fid1() {
        JXPathContextFactoryConfigurationError error = new JXPathContextFactoryConfigurationError(new Exception("java.lang.Exception: test"));
        assertEquals("java.lang.Exception: test", error.getMessage());
    }
}