/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_ServletRequestAndContext_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getSession_HttpServletRequest_ReturnsSession_SntO0() {
        final ServletRequest request = mock(HttpServletRequest.class);
        final ServletContext context = mock(ServletContext.class);
        final HttpSession session = mock(HttpSession.class);
        final ServletRequestAndContext servletRequestAndContext = new ServletRequestAndContext(request, context);
        when(((HttpServletRequest) request).getSession(false)).thenReturn(session);
        final HttpSession result = servletRequestAndContext.getSession();
        assertEquals(session, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getSession_NotHttpServletRequest_ReturnsNull_xZFb1() {
        final ServletRequest request = mock(ServletRequest.class);
        final ServletContext context = mock(ServletContext.class);
        final ServletRequestAndContext servletRequestAndContext = new ServletRequestAndContext(request, context);
        final HttpSession result = servletRequestAndContext.getSession();
        assertEquals(null, result);
    }
}