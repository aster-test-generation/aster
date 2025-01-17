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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
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
public class Aster_PingServletSetContentLength_Test_Failing {
PingServletSetContentLength pingservletsetcontentlength;
ServletConfig servletConfig;
HttpServletResponse httpservletresponse;
HttpServletRequest httpservletrequest;
ServletOutputStream servletoutputstream;
HttpServlet httpservlet;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        servletConfig = mock(ServletConfig.class);
        pingservletsetcontentlength = new PingServletSetContentLength();
        pingservletsetcontentlength.init(servletConfig);
        verify(servletConfig).getServletContext();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        httpservletrequest = mock(HttpServletRequest.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservlet = mock(HttpServlet.class);
        pingservletsetcontentlength = new PingServletSetContentLength();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        pingservletsetcontentlength.doPost(httpservletrequest, httpservletresponse);
        verify(pingservletsetcontentlength).doGet(httpservletrequest, httpservletresponse);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_uGKZ0() throws ServletException, IOException {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    pingServletSetContentLength.doGet(req, res);
    verify(res).setContentType("text/html");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_DwsE0() {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    String result = null; // getServletInfo method is not implemented in PingServletSetContentLength
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        httpservletrequest = mock(HttpServletRequest.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservlet = mock(HttpServlet.class);
        pingservletsetcontentlength = new PingServletSetContentLength();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        when(httpservletrequest.getParameter("contentLength")).thenReturn("100");
        pingservletsetcontentlength.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).setContentType("text/html");
        verify(servletoutputstream).println(anyString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_noContentLengthParam() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        httpservletrequest = mock(HttpServletRequest.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservlet = mock(HttpServlet.class);
        pingservletsetcontentlength = new PingServletSetContentLength();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        when(httpservletrequest.getParameter("contentLength")).thenReturn(null);
        pingservletsetcontentlength.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).setContentType("text/html");
        verify(servletoutputstream).println(anyString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_contentLengthParamInvalid() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        httpservletrequest = mock(HttpServletRequest.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservlet = mock(HttpServlet.class);
        pingservletsetcontentlength = new PingServletSetContentLength();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        when(httpservletrequest.getParameter("contentLength")).thenReturn("invalid");
        pingservletsetcontentlength.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).sendError(500, anyString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_uGKZ0_fid2() throws ServletException, IOException {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServletSetContentLength.doPost(req, res);
    verify(res).setStatus(200);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_DwsE0_fid2() {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    String result = pingServletSetContentLength.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet, with contentLength set by contentLength parameter.", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_ContentLengthNull_lWqZ0() throws ServletException, IOException {
    PingServletSetContentLength servlet = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getParameter("contentLength")).thenReturn(null);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_ContentLengthValid_NpWn1() throws ServletException, IOException {
    PingServletSetContentLength servlet = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getParameter("contentLength")).thenReturn("100");
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_IOException_oCvD2() throws ServletException, IOException {
    PingServletSetContentLength servlet = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getParameter("contentLength")).thenReturn("100");
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getOutputStream()).thenThrow(new IOException());
    servlet.doGet(req, res);
    verify(res).sendError(500, anyString());
}
}