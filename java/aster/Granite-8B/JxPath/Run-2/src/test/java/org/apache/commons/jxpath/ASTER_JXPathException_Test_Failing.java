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
    public void testGetException_MrrV0() {
        JXPathException jXPathException = new JXPathException("msg", new Throwable());
        Throwable exception = jXPathException.getException();
        assertEquals(new Throwable(), exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage2_SNDT1() {
        JXPathException jXPathException = new JXPathException("msg; java.lang.Throwable", new Throwable());
        String actual = jXPathException.getMessage();
        String expected = "msg; java.lang.Throwable";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage4_aZax3() {
        JXPathException jXPathException = new JXPathException();
        String actual = jXPathException.getMessage();
        String expected = "";
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage2_SNDT1_fid2() {
        JXPathException jXPathException = new JXPathException("msg", new Throwable());
        String actual = jXPathException.getMessage();
        String expected = "msg";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage3_lkBK2_fid2() {
        JXPathException jXPathException = new JXPathException(new Throwable());
        String actual = jXPathException.getMessage();
        String expected = "java.lang.Throwable";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage4_aZax3_fid2() {
        JXPathException jXPathException = new JXPathException();
        String actual = jXPathException.getMessage();
        String expected = "";
        assertEquals(expected, actual);
    }
}