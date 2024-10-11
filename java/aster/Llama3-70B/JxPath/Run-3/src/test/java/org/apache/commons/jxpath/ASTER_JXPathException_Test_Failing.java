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
    public void testGetCause1_WwCA0() {
        JXPathException e = new JXPathException("msg", new Throwable());
        assertNull(e.getCause());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage3_nRTh2() {
        Throwable t = new Throwable("throwable msg");
        JXPathException e = new JXPathException("msg", t);
        assertEquals("msg; java.lang.Throwable: throwable msg", e.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage4_uYJU3() {
        Throwable t = new Throwable("throwable msg");
        JXPathException e = new JXPathException(t);
        assertEquals("java.lang.Throwable: throwable msg", e.getMessage());
    }
}