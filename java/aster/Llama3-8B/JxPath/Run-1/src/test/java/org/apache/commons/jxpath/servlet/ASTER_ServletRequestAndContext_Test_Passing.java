/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ServletRequestAndContext_Test_Passing {
    @Mock
    private ServletRequest request;
    @Mock
    private HttpServletRequest httpServletRequest;
    @Mock
    private HttpSession httpSession;
    private ServletRequestAndContext servletrequestandcontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletRequest() {
        servletrequestandcontext = new ServletRequestAndContext(request, null);
        // Act
        ServletRequest result = servletrequestandcontext.getServletRequest();
        // Assert
        Assertions.assertEquals(request, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletRequest_BbgQ0_qURA0() {
        ServletRequest request = Mockito.mock(ServletRequest.class);
        ServletContext context = Mockito.mock(ServletContext.class);
        ServletRequestAndContext servletRequestAndContext = new ServletRequestAndContext(request, context);
        ServletRequest result = servletRequestAndContext.getServletRequest();
        assertEquals(request, result);
    }
}