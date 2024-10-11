/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ServletRequestAndContext_Test_Passing {
    private ServletRequest request;
    private ServletContext context;
    private HttpSession session;
    private ServletRequestAndContext servletrequestandcontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullRequest_dLvU0() {
        ServletRequest request = null;
        ServletContext context = mock(ServletContext.class);
        ServletRequestAndContext servletRequestAndContext = new ServletRequestAndContext(request, context);
        HttpSession session = servletRequestAndContext.getSession();
        assertNull(session);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonHttpServletRequest_ZRJv1() {
        ServletRequest request = mock(ServletRequest.class);
        ServletContext context = mock(ServletContext.class);
        ServletRequestAndContext servletRequestAndContext = new ServletRequestAndContext(request, context);
        HttpSession session = servletRequestAndContext.getSession();
        assertNull(session);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletRequest() {
        request = mock(ServletRequest.class);
        context = mock(ServletContext.class);
        servletrequestandcontext = new ServletRequestAndContext(request, context);
        when(request.getAttribute("attributeName")).thenReturn("attributeValue");
        assertEquals("attributeValue", servletrequestandcontext.getServletRequest().getAttribute("attributeName"));
    }
}