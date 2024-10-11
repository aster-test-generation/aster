/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.ServletConfig;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingReentryServlet_Test_Failing {
PingReentryServlet pingreentryservlet;
ServletConfig servletConfig;
HttpServlet httpServlet;
HttpServletResponse httpservletresponse;
ServletOutputStream servletoutputstream;
HttpServletRequest httpservletrequest;
HttpServlet httpservlet;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithoutSleepParameter() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpservlet = mock(HttpServlet.class);
        pingreentryservlet = new PingReentryServlet();
        when(httpservletrequest.getParameter("numReentries")).thenReturn("1");
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        pingreentryservlet.doGet(httpservletrequest, httpservletresponse);
        verify(servletoutputstream, times(1)).println("1");
        verify(servletoutputstream, times(1)).flush();
        verify(servletoutputstream, times(1)).close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithoutNumReentriesParameter() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpservlet = mock(HttpServlet.class);
        pingreentryservlet = new PingReentryServlet();
        when(httpservletrequest.getParameter("sleep")).thenReturn("1000");
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        pingreentryservlet.doGet(httpservletrequest, httpservletresponse);
        verify(servletoutputstream, times(1)).println("0");
        verify(servletoutputstream, times(1)).flush();
        verify(servletoutputstream, times(1)).close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithInvalidParameters() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpservlet = mock(HttpServlet.class);
        pingreentryservlet = new PingReentryServlet();
        when(httpservletrequest.getParameter("numReentries")).thenReturn("abc");
        when(httpservletrequest.getParameter("sleep")).thenReturn("1000");
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        pingreentryservlet.doGet(httpservletrequest, httpservletresponse);
        verify(servletoutputstream, times(1)).println("500 Internal Server Error");
        verify(servletoutputstream, times(1)).flush();
        verify(servletoutputstream, times(1)).close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_UNhh0() {
        PingReentryServlet servlet = new PingReentryServlet();
        String result = servlet.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", result);
    }
}