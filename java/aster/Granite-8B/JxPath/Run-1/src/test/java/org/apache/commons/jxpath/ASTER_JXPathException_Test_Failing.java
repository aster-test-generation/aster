/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathException_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCause_avVB0() {
        JXPathException exception = new JXPathException("msg");
        Throwable cause = exception.getCause();
        assertNull(exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCauseWithMessageAndCause_BcxC1() {
        JXPathException exception = new JXPathException("msg", new Exception("cause"));
        Throwable cause = exception.getCause();
        assertEquals(new Exception("cause"), cause);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCauseWithCause_vwgV2() {
        JXPathException exception = new JXPathException(new Exception("cause"));
        Throwable cause = exception.getCause();
        assertEquals(new Exception("cause"), cause);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetException_dBPY0() {
        JXPathException exception = new JXPathException("test message");
        Throwable result = exception.getException();
        assert result instanceof JXPathException;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithNoMessage_bagf1() {
        JXPathException exception = new JXPathException();
        Throwable result = exception.getException();
        assert result instanceof JXPathException;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithMessageAndThrowable_xcHE2() {
        JXPathException exception = new JXPathException("test message", new Exception("test exception"));
        Throwable result = exception.getException();
        assert result instanceof JXPathException;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithOnlyThrowable_ePVM3() {
        JXPathException exception = new JXPathException(new Exception("test exception"));
        Throwable result = exception.getException();
        assert result instanceof JXPathException;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithoutMessage_DGar3() {
        JXPathException jxpathException = new JXPathException();
        assertNull(JXPathException.class.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCause_avVB0_fid2() {
        JXPathException exception = new JXPathException("msg");
        Throwable cause = exception.getCause();
        assertEquals(exception, cause);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithSuperMessage_dcqP0_fid2() {
        JXPathException exception = new JXPathException("super message");
        JXPathException jxpathException = new JXPathException("message", exception);
        assertEquals("super message; message", jxpathException.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithoutSuperMessage_qYdV1_fid2() {
        JXPathException exception = new JXPathException("exception message");
        JXPathException jxpathException = new JXPathException(exception);
        assertEquals("exception message", jxpathException.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessageWithoutMessage_DGar3_fid2() {
        JXPathException jxpathException = new JXPathException();
        assertEquals(JXPathException.class.getName(), jxpathException.getMessage());
    }
}