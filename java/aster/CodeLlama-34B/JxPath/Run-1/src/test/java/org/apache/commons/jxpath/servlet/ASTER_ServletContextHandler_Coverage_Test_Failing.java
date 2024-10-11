/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ServletContextHandler_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_tlwD0() {
        ServletContextHandler contextHandler = new ServletContextHandler();
        String[] propertyNames = contextHandler.getPropertyNames(null);
        assertNotNull(propertyNames);
        assertEquals(0, propertyNames.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithContext_HCfG1() {
        ServletContextHandler contextHandler = new ServletContextHandler();
        Object context = new Object();
        String[] propertyNames = contextHandler.getPropertyNames(context);
        assertNotNull(propertyNames);
        assertEquals(0, propertyNames.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_Bgvy0() {
        ServletContextHandler contextHandler = new ServletContextHandler();
        Object context = new Object();
        String property = "property";
        Object expected = new Object();
        ((ServletContext) context).setAttribute(property, expected);
        Object actual = contextHandler.getProperty(context, property);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_tlwD0_1() {
        ServletContextHandler contextHandler = new ServletContextHandler();
        String[] propertyNames = contextHandler.getPropertyNames(null);
        assertNotNull(propertyNames);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_tlwD0_2() {
        ServletContextHandler contextHandler = new ServletContextHandler();
        String[] propertyNames = contextHandler.getPropertyNames(null);
        assertEquals(0, propertyNames.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithContext_HCfG1_1() {
        ServletContextHandler contextHandler = new ServletContextHandler();
        Object context = new Object();
        String[] propertyNames = contextHandler.getPropertyNames(context);
        assertNotNull(propertyNames);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithContext_HCfG1_2() {
        ServletContextHandler contextHandler = new ServletContextHandler();
        Object context = new Object();
        String[] propertyNames = contextHandler.getPropertyNames(context);
        assertEquals(0, propertyNames.length);
    }
}