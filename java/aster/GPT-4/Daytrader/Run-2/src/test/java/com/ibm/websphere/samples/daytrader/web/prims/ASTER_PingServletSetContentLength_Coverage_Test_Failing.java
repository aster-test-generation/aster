/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletSetContentLength_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_ldWP0() {
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        String expectedInfo = "Basic dynamic HTML generation through a servlet, with contentLength set by contentLength parameter.";
        assertEquals(expectedInfo, servlet.getServletInfo());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithValidConfig_oIhb0() throws ServletException {
        ServletConfig mockConfig = org.mockito.Mockito.mock(ServletConfig.class);
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        servlet.init(mockConfig);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostCallsDoGet_nJfH0() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        servlet.doPost(request, response);
        verify(servlet).doGet(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostCompletesWithoutException_dcMg1() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        servlet.doPost(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithValidContentLength_ifzE1() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(req.getParameter("contentLength")).thenReturn("1000");
        when(res.getOutputStream()).thenReturn(out);
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        servlet.doGet(req, res);
        verify(res).setContentType("text/html");
        verify(out).println(contains("aaaa"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithZeroContentLength_BCdY2() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(req.getParameter("contentLength")).thenReturn("0");
        when(res.getOutputStream()).thenReturn(out);
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        servlet.doGet(req, res);
        verify(res).setContentType("text/html");
        verify(out).println(contains("<body><HR><BR>"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNegativeContentLength_nuPo3() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(req.getParameter("contentLength")).thenReturn("-1");
        when(res.getOutputStream()).thenReturn(out);
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        servlet.doGet(req, res);
        verify(res).setContentType("text/html");
        verify(out).println(contains("<body><HR><BR>"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNonIntegerContentLength_ZZtR4() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(req.getParameter("contentLength")).thenReturn("abc");
        when(res.getOutputStream()).thenReturn(out);
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        try {
            servlet.doGet(req, res);
        } catch (NumberFormatException e) {
        }
        verify(res).setContentType("text/html");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithIOException_pkNk5() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(req.getParameter("contentLength")).thenReturn("100");
        when(res.getOutputStream()).thenReturn(out);
        doThrow(new IOException()).when(out).println(anyString());
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        try {
            servlet.doGet(req, res);
        } catch (IOException e) {
        }
        verify(res).setContentType("text/html");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithServletException_FgrT6() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(req.getParameter("contentLength")).thenReturn("100");
        when(res.getOutputStream()).thenReturn(out);
        doThrow(new ServletException()).when(out).println(anyString());
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        try {
            servlet.doGet(req, res);
        } catch (ServletException e) {
        }
        verify(res).setContentType("text/html");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithGeneralException_UMzq7() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(req.getParameter("contentLength")).thenReturn("100");
        when(res.getOutputStream()).thenReturn(out);
        doThrow(new RuntimeException()).when(out).println(anyString());
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        try {
            servlet.doGet(req, res);
        } catch (Exception e) {
        }
        verify(res).setContentType("text/html");
    }
}