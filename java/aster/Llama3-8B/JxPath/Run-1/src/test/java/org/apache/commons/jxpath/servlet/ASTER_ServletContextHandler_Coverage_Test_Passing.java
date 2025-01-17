/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_ServletContextHandler_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNull_ykZa1() {
        ServletContext servletContext = mock(ServletContext.class);
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        String property = "testProperty";
        when(servletContext.getAttribute(property)).thenReturn(null);
        Object result = servletContextHandler.getProperty(servletContext, property);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNullProperty_feaq3() {
        ServletContext servletContext = mock(ServletContext.class);
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        String property = null;
        Object result = servletContextHandler.getProperty(servletContext, property);
        assertNull(result);
    }
}