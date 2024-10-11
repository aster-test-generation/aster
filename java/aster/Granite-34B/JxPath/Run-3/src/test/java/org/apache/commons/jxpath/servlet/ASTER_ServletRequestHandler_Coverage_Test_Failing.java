/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ServletRequestHandler_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetProperty_1_VnUf0() {
        ServletRequestHandler servletRequestHandler = new ServletRequestHandler();
        servletRequestHandler.setProperty(new Object(), "property", new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWhenInputBeanIsNull_QBlf0() {
        ServletRequestHandler servletRequestHandler = new ServletRequestHandler();
        Object result = servletRequestHandler.getProperty(null, "property");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWhenInputBeanIsNotServletRequestAndContext_vFlx1() {
        ServletRequestHandler servletRequestHandler = new ServletRequestHandler();
        Object result = servletRequestHandler.getProperty(new Object(), "property");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExceptionHandling_rCug1() {
        HashSet set = new HashSet();
        Object bean = new Object();
        ServletRequestHandler servletRequestHandler = new ServletRequestHandler();
        servletRequestHandler.collectPropertyNames(set, bean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithNullBean_sXdF3() {
        HashSet<String> set = new HashSet<>();
        Object bean = null;
        ServletRequestHandler servletRequestHandler = new ServletRequestHandler();
        servletRequestHandler.collectPropertyNames(set, bean);
        assertEquals(0, set.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithNullBean_sXdF3_fid1() {
        HashSet set = new HashSet();
        Object bean = null;
        ServletRequestHandler servletRequestHandler = new ServletRequestHandler();
        servletRequestHandler.collectPropertyNames(set, bean);
    }
}