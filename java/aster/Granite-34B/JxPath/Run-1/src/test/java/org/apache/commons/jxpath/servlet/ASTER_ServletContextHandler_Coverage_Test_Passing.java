/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_ServletContextHandler_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCollectPropertyNames_tAjA0() {
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        HashSet<String> set = new HashSet<>();
        Enumeration<String> e = mock(Enumeration.class);
        when(e.hasMoreElements()).thenReturn(true, false);
        when(e.nextElement()).thenReturn("test");
        ServletContext servletContext = mock(ServletContext.class);
        when(servletContext.getAttributeNames()).thenReturn(e);
        servletContextHandler.collectPropertyNames(set, servletContext);
        assertTrue(set.contains("test"));
    }
}