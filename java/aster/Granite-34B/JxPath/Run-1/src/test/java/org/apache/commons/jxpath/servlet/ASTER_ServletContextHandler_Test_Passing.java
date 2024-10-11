/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.lenient;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ServletContextHandler_Test_Passing {
    private static int DEFAULT_PROPERTY_COUNT = 16;
    ServletContextHandler servletcontexthandler;
    @Mock
    ServletContext servletContext;
    ServletContext mockServletContext;
    Object mockContext;
    String mockProperty;
    Object mockValue;
    @Mock
    HttpSessionAndServletContext httpSessionAndServletContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetProperty() throws Exception {
        servletcontexthandler = new ServletContextHandler();
        lenient().when(servletContext.getAttribute(anyString())).thenReturn("test");
        Object context = servletContext;
        String property = "test";
        Object result = servletcontexthandler.getProperty(context, property);
        assertEquals("test", result);
    }
}