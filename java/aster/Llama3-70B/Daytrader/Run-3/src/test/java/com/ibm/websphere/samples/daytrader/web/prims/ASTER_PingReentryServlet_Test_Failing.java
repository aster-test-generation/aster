/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.*;
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
HttpServlet httpservlet;
ServletConfig servletConfig;
HttpServletResponse httpservletresponse;
ServletOutputStream servletoutputstream;
HttpServletRequest httpservletrequest;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpservlet = mock(HttpServlet.class);
        pingreentryservlet = new PingReentryServlet();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        pingreentryservlet.doPost(httpservletrequest, httpservletresponse);
        verify(pingreentryservlet).doGet(httpservletrequest, httpservletresponse);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpservlet = mock(HttpServlet.class);
        pingreentryservlet = new PingReentryServlet();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        when(httpservletrequest.getParameter("numReentries")).thenReturn("2");
        when(httpservletrequest.getParameter("sleep")).thenReturn("1000");
        when(httpservletrequest.getServerName()).thenReturn("localhost");
        when(httpservletrequest.getServerPort()).thenReturn(8080);
        when(httpservletrequest.getContextPath()).thenReturn("/");
        pingreentryservlet.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).setContentType("text/html");
        verify(servletoutputstream).println("1"); // verify the output
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_NoReentries() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpservlet = mock(HttpServlet.class);
        pingreentryservlet = new PingReentryServlet();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        when(httpservletrequest.getParameter("numReentries")).thenReturn(null);
        when(httpservletrequest.getParameter("sleep")).thenReturn("1000");
        pingreentryservlet.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).setContentType("text/html");
        verify(servletoutputstream).println("0"); // verify the output
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_Exception() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpservlet = mock(HttpServlet.class);
        pingreentryservlet = new PingReentryServlet();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        when(httpservletrequest.getParameter("numReentries")).thenReturn("2");
        when(httpservletrequest.getParameter("sleep")).thenReturn("1000");
        when(httpservletrequest.getServerName()).thenReturn("localhost");
        when(httpservletrequest.getServerPort()).thenReturn(8080);
        when(httpservletrequest.getContextPath()).thenReturn("/");
        when(httpservletrequest.getServerName()).thenThrow(new Exception("Mock exception"));
        pingreentryservlet.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).sendError(500, "Mock exception");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_DgHX0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("GET");
    new PingReentryServlet().doGet(req, res);
    verify(res, times(1)).getOutputStream();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_AZlR0() {
    PingReentryServlet pingReentryServlet = new PingReentryServlet();
    String result = pingReentryServlet.getServletInfo();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_anlr0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("numReentries")).thenReturn("5");
    when(req.getParameter("sleep")).thenReturn("1000");
    when(req.getServerName()).thenReturn("localhost");
    when(req.getServerPort()).thenReturn(8080);
    when(req.getContextPath()).thenReturn("/ping");
    when(res.getOutputStream()).thenReturn(out);
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(out).println(anyString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_NoReentries_WVeJ1() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("numReentries")).thenReturn(null);
    when(res.getOutputStream()).thenReturn(out);
    servlet.doGet(req, res);
    verify(out).println(0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_NoSleep_LFCt2() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("numReentries")).thenReturn("5");
    when(req.getParameter("sleep")).thenReturn(null);
    when(res.getOutputStream()).thenReturn(out);
    new PingReentryServlet().doGet(req, res);
    verify(res).setContentType("text/html");
    verify(out).println("5");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_Exception_IHWa3() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("numReentries")).thenReturn("5");
    when(req.getParameter("sleep")).thenReturn("1000");
    when(req.getServerName()).thenReturn("localhost");
    when(req.getServerPort()).thenReturn(8080);
    when(req.getContextPath()).thenReturn("/ping");
    doThrow(new IOException()).when(req).getServerPort();
    PingReentryServlet servlet = new PingReentryServlet();
    try {
        servlet.doGet(req, res);
        fail("Should have thrown ServletException");
    } catch (ServletException e) {
        verify(res).sendError(500, e.toString());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_Reentry_Oroi4() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("numReentries")).thenReturn("5");
    when(req.getParameter("sleep")).thenReturn("1000");
    when(req.getServerName()).thenReturn("localhost");
    when(req.getServerPort()).thenReturn(8080);
    when(req.getContextPath()).thenReturn("/ping");
    when(res.getOutputStream()).thenReturn(out);
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.doGet(req, res);
    verify(res).getOutputStream();
    verify(out).println(anyString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_DgHX0_fid2() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(req, times(1)).getMethod();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_AZlR0_fid2() {
    PingReentryServlet pingReentryServlet = new PingReentryServlet();
    String result = pingReentryServlet.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_anlr0_fid2() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("numReentries")).thenReturn("5");
    when(req.getParameter("sleep")).thenReturn("1000");
    when(req.getServerName()).thenReturn("localhost");
    when(req.getServerPort()).thenReturn(8080);
    when(req.getContextPath()).thenReturn("/ping");
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_NoReentries_WVeJ1_fid2() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("numReentries")).thenReturn(null);
    servlet.doGet(req, res);
    verify(res).sendError(500, anyString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_NoSleep_LFCt2_fid2() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("numReentries")).thenReturn("5");
    when(req.getParameter("sleep")).thenReturn(null);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_Exception_IHWa3_fid2() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("numReentries")).thenReturn("5");
    when(req.getParameter("sleep")).thenReturn("1000");
    when(req.getServerName()).thenReturn("localhost");
    when(req.getServerPort()).thenReturn(8080);
    when(req.getContextPath()).thenReturn("/ping");
    doThrow(new IOException()).when(req).getServerName();
    servlet.doGet(req, res);
    verify(res).sendError(500, anyString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_Reentry_Oroi4_fid2() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("numReentries")).thenReturn("5");
    when(req.getParameter("sleep")).thenReturn("1000");
    when(req.getServerName()).thenReturn("localhost");
    when(req.getServerPort()).thenReturn(8080);
    when(req.getContextPath()).thenReturn("/ping");
    servlet.doGet(req, res);
    verify(res).getOutputStream();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_sKZq0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    PingReentryServlet pingReentryservlet = new PingReentryServlet();
    pingReentryservlet.doGet(req, res);
    verify(res).setContentType("text/html");
}
}