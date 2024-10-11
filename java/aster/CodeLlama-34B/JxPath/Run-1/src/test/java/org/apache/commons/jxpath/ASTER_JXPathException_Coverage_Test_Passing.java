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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathException_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessageWithMessageAndException_iPTn0() {
        JXPathException exception = new JXPathException("Test message", new Exception("Test exception"));
        String message = exception.getMessage();
        Assertions.assertEquals("Test message; Test exception", message);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessageWithMessageOnly_lFpu1() {
        JXPathException exception = new JXPathException("Test message");
        String message = exception.getMessage();
        Assertions.assertEquals("Test message", message);
    }
}