/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ServletContextHandler_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames1_GVEt0() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        String[] propertyNames = servletContextHandler.getPropertyNames(new Object());
        assertNotNull(propertyNames);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames2_zsrX1() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        String[] propertyNames = servletContextHandler.getPropertyNames(new Object());
        assertEquals(0, propertyNames.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCollectPropertyNames1_WPAr1() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        HashSet<String> set = new HashSet<>();
        servletContextHandler.collectPropertyNames(set, null);
        assertTrue(set.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCollectPropertyNames2_TRdV2() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        HashSet<String> set = new HashSet<>();
        servletContextHandler.collectPropertyNames(set, new HashSet<>());
        assertTrue(set.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCollectPropertyNames3_viPz3() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        HashSet<String> set = new HashSet<>();
        servletContextHandler.collectPropertyNames(set, new Object());
        assertTrue(set.isEmpty());
    }
}