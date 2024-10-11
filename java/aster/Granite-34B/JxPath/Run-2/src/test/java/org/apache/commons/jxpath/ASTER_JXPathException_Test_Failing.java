/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathException_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getCause_2_saSP2() throws Exception {
        JXPathException jxPathException0 = new JXPathException("Error in JXPath", (Throwable) null);
        Throwable throwable0 = jxPathException0.getCause();
        assertNull(jxPathException0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getCause_3_mcPG3() throws Exception {
        JXPathException jxPathException0 = new JXPathException((Throwable) null);
        Throwable throwable0 = jxPathException0.getCause();
        assertNotNull(throwable0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetException_cqXR0() {
        JXPathException jxPathException = new JXPathException();
        Throwable exception = jxPathException.getException();
        Throwable expectedException = new Throwable();
        assertEquals(expectedException, exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExceptionWithMsg_hKqp1() {
        JXPathException jxPathException = new JXPathException("msg");
        Throwable exception = jxPathException.getException();
        assertNotNull(exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getCause_0_gFtP0_fid2() throws Exception {
        JXPathException jxPathException0 = new JXPathException("Error in J XPath");
        Throwable throwable0 = jxPathException0.getCause();
        assertEquals(jxPathException0, throwable0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getCause_1_RbWr1_fid2() throws Exception {
        JXPathException jxPathException0 = new JXPathException();
        Throwable throwable0 = jxPathException0.getCause();
        assertEquals(jxPathException0, throwable0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getCause_2_saSP2_fid2() throws Exception {
        JXPathException jxPathException0 = new JXPathException("Error in JXPath", (Throwable) null);
        Throwable throwable0 = jxPathException0.getCause();
        assertEquals(jxPathException0, throwable0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getCause_3_mcPG3_fid2() throws Exception {
        JXPathException jxPathException0 = new JXPathException((Throwable) null);
        Throwable throwable0 = jxPathException0.getCause();
        assertEquals(jxPathException0, throwable0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetException_cqXR0_fid2() {
        JXPathException jxPathException = new JXPathException();
        Throwable exception = jxPathException.getException();
        assertNotNull(exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMessage_withNoMessageAndCause_btpD4_fid2() {
        JXPathException exception = new JXPathException(null, null);
        assertEquals("JXPathException", exception.getMessage());
    }
}