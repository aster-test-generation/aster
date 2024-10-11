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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathException_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessageWithMessageAndException_jrrl0() {
        JXPathException ex = new JXPathException("Test message", new Exception("Test exception"));
        String message = ex.getMessage();
        Assertions.assertEquals("Test message; Test exception", message);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessageWithMessageAndNullException_Ikrf1() {
        JXPathException ex = new JXPathException("Test message", null);
        String message = ex.getMessage();
        Assertions.assertEquals("Test message", message);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessageWithNullMessageAndException_jSty2() {
        JXPathException ex = new JXPathException(null, new Exception("Test exception"));
        String message = ex.getMessage();
        Assertions.assertEquals("Test exception", message);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessageWithNullMessageAndNullException_rirk3() {
        JXPathException ex = new JXPathException(null, null);
        String message = ex.getMessage();
        Assertions.assertNull(message);
    }
}