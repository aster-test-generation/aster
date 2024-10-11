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

public class Aster_JXPathException_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCause2_KRQA1() {
        JXPathException e = new JXPathException(new Throwable());
        assertNotNull(e.getCause());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCause3_EboI2() {
        JXPathException e = new JXPathException("msg");
        assertNull(e.getCause());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCause4_IOYS3() {
        JXPathException e = new JXPathException();
        assertNull(e.getCause());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetException1_DqPa0() {
        JXPathException jXPathException = new JXPathException("msg");
        assertNull(jXPathException.getException());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetException2_kOrq1() {
        JXPathException jXPathException = new JXPathException();
        assertNull(jXPathException.getException());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetException3_mSHf2() {
        Throwable e = new Throwable();
        JXPathException jXPathException = new JXPathException("msg", e);
        assertEquals(e, jXPathException.getException());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetException4_ERwo3() {
        Throwable e = new Throwable();
        JXPathException jXPathException = new JXPathException(e);
        assertEquals(e, jXPathException.getException());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage1_EcFN0() {
        JXPathException e = new JXPathException("msg");
        assertEquals("msg", e.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage2_kwaL1() {
        JXPathException e = new JXPathException();
        assertEquals(null, e.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCause1_WwCA0_fid1() {
        JXPathException e = new JXPathException("msg", new Throwable());
        assertNotNull(e.getCause());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage3_nRTh2_fid1() {
        Throwable t = new Throwable("throwable msg");
        JXPathException e = new JXPathException("msg", t);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage4_uYJU3_fid1() {
        Throwable t = new Throwable("throwable msg");
        JXPathException e = new JXPathException(t);
        assertEquals("java.lang.Throwable: throwable msg; throwable msg", e.getMessage());
    }
}