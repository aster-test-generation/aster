/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingReentryServlet_Test_Passing {
    @Mock
    HttpServlet httpServlet;
    @InjectMocks
    PingReentryServlet pingReentryServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    @Mock
    ServletOutputStream servletOutputStream;
    @Mock
    HttpServletRequest httpServletRequest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws ServletException {
        MockitoAnnotations.openMocks(this);
        pingReentryServlet.init(null);
        verify(httpServlet).init(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost() throws Exception {
        pingReentryServlet = new PingReentryServlet();
        when(httpServletResponse.getOutputStream()).thenReturn(servletOutputStream);
        pingReentryServlet.doPost(httpServletRequest, httpServletResponse);
        verify(httpServletResponse).getOutputStream();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet() throws Exception {
        pingReentryServlet = new PingReentryServlet();
        when(httpServletResponse.getOutputStream()).thenReturn(servletOutputStream);
        pingReentryServlet.doGet(httpServletRequest, httpServletResponse);
        verify(httpServletResponse).setContentType("text/html");
        verify(httpServletResponse).getOutputStream();
        verify(servletOutputStream).println(anyInt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_fJrj0() {
        PingReentryServlet servlet = new PingReentryServlet();
        String actual = servlet.getServletInfo();
        String expected = "Basic dynamic HTML generation through a servlet";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNumReentriesAndSleep_iDtr0() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.getParameter("numReentries")).thenReturn("1");
        when(req.getParameter("sleep")).thenReturn("1000");
        servlet.doGet(req, res);
        verify(res, times(1)).setContentType("text/html");
        verify(res, times(1)).getOutputStream();
        verify(res, times(0)).sendError(anyInt(), anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNoNumReentriesAndNoSleep_aUJA1() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.getParameter("numReentries")).thenReturn(null);
        when(req.getParameter("sleep")).thenReturn(null);
        servlet.doGet(req, res);
        verify(res, times(1)).setContentType("text/html");
        verify(res, times(1)).getOutputStream();
        verify(res, times(0)).sendError(anyInt(), anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNumReentriesLessThanZeroAndNoSleep_IKJF2() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.getParameter("numReentries")).thenReturn("-1");
        when(req.getParameter("sleep")).thenReturn(null);
        servlet.doGet(req, res);
        verify(res, times(1)).setContentType("text/html");
        verify(res, times(1)).getOutputStream();
        verify(res, times(0)).sendError(anyInt(), anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNumReentriesZeroAndNoSleep_Hcyi3() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.getParameter("numReentries")).thenReturn("0");
        when(req.getParameter("sleep")).thenReturn(null);
        servlet.doGet(req, res);
        verify(res, times(1)).setContentType("text/html");
        verify(res, times(1)).getOutputStream();
        verify(res, times(0)).sendError(anyInt(), anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNumReentriesZeroAndSleep_hYVz4() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.getParameter("numReentries")).thenReturn("0");
        when(req.getParameter("sleep")).thenReturn("1000");
        servlet.doGet(req, res);
        verify(res, times(1)).setContentType("text/html");
        verify(res, times(1)).getOutputStream();
        verify(res, times(0)).sendError(anyInt(), anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNumReentriesGreaterThanZeroAndNoSleep_jiuY5() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.getParameter("numReentries")).thenReturn("1");
        when(req.getParameter("sleep")).thenReturn(null);
        servlet.doGet(req, res);
        verify(res, times(1)).setContentType("text/html");
        verify(res, times(1)).getOutputStream();
        verify(res, times(0)).sendError(anyInt(), anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_NIKY1_fYie0() throws ServletException {
        PingReentryServlet servlet = new PingReentryServlet();
        ServletConfig config = mock(ServletConfig.class);
        when(config.getServletName()).thenReturn("PingReentryServlet");
        when(config.getInitParameter("numReentries")).thenReturn("1");
        when(config.getInitParameter("sleep")).thenReturn("1");
        servlet.init(config);
    }
}