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

public class Aster_JXPathException_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCauseWithoutCause_ouPm3() {
        JXPathException exception = new JXPathException();
        Throwable cause = exception.getCause();
        assertEquals(null, cause);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithSuperMessage_dcqP0() {
        JXPathException exception = new JXPathException("super message");
        JXPathException jxpathException = new JXPathException("message", exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithoutSuperMessage_qYdV1() {
        JXPathException exception = new JXPathException("exception message");
        JXPathException jxpathException = new JXPathException(exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithoutException_XDjJ2() {
        JXPathException jxpathException = new JXPathException("message");
        assertEquals("message", jxpathException.getMessage());
    }
}