/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingReentryServlet_Coverage_Test_Passing {
private PingReentryServlet servlet = new PingReentryServlet();
    private URL obj;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
void testGetServletInfo_Qepe0() {
    // Assuming PingReentryServlet is in the same package
    PingReentryServlet servlet = new PingReentryServlet();
    String actual = servlet.getServletInfo();
    assertNotNull(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_Joww0() throws ServletException, IOException {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        servlet.doPost(req, res);
        verify(req).getAttributeNames();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_6_Zggg5_nbKq0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("numReentries")).thenReturn("1");
    when(req.getParameter("sleep")).thenReturn("1000");
    PingReentryServlet servlet = new PingReentryServlet();
    try {
        servlet.doGet(req, res);
    } catch (ServletException e) {
    } catch (IOException e) {
    }
    verify(res, times(1)).getOutputStream();
    verify(req, times(1)).getParameter("numReentries");
    verify(req, times(1)).getParameter("sleep");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_9_oTqv8_tgbH0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getServerName()).thenReturn("localhost");
    when(req.getServerPort()).thenReturn(8080);
    when(req.getParameter("numReentries")).thenReturn("1");
    when(req.getParameter("sleep")).thenReturn(String.valueOf(1000));
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.doGet(req, res);
    verify(res, times(1)).getOutputStream();
    verify(req, times(1)).getServerName();
    verify(req, times(1)).getServerPort();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_7_ReXs6_JECR0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    PingReentryServlet servlet = new PingReentryServlet();
    when(req.getParameter("numReentries")).thenReturn("1");
    when(req.getParameter("sleep")).thenReturn("1000");
    when(res.getOutputStream()).thenReturn(out);
    when(req.getServerName()).thenReturn("localhost");
    when(req.getServerPort()).thenReturn(8080);
    when(req.getContextPath()).thenReturn("");
    servlet.doGet(req, res);
    verify(req, times(1)).getParameter("sleep");
    verify(req, times(1)).getParameter("numReentries");
    verify(res, times(1)).getOutputStream();
    verify(req, times(1)).getServerName();
    verify(req, times(1)).getServerPort();
    verify(req, times(1)).getContextPath();
    verify(out).println(anyString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetServletInfo_Qepe0_fid1() {
        PingReentryServlet servlet = new PingReentryServlet();
        String expected = "Basic dynamic HTML generation through a servlet";
        String actual = servlet.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_IOException_WAHx1() throws ServletException, IOException {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        IOException ioException = new IOException();
        try {
            servlet.doPost(req, res);
            assert false; // Should not reach here
        } catch (IOException e) {
            assert e == ioException; // Verify that the same exception is thrown
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_2_jzQL1_EsFE0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    PingReentryServlet servlet = new PingReentryServlet();
    when(req.getParameter("numReentries")).thenReturn("1");
    when(req.getParameter("sleep")).thenReturn("1000");
    when(res.getOutputStream()).thenReturn(out);
    try {
        servlet.doGet(req, res);
    } catch (ServletException e) {
    } catch (IOException e) {
    }
    verify(out).println(anyString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_1_Atxs0_Upsc0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    PingReentryServlet servlet = new PingReentryServlet();
    when(req.getParameter("numReentries")).thenReturn("1");
    when(req.getParameter("sleep")).thenReturn("1000");
    when(res.getOutputStream()).thenReturn(out);
    try {
        servlet.doGet(req, res);
    } catch (ServletException e) {
        fail("ServletException should not be thrown");
    } catch (IOException e) {
        fail("IOException should not be thrown");
    }
    verify(out).println("1");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_6_Zggg5_nbKq0_fid3() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    PingReentryServlet servlet = new PingReentryServlet();
    when(req.getParameter("numReentries")).thenReturn("1");
    when(req.getParameter("sleep")).thenReturn("1000");
    when(res.getOutputStream()).thenReturn(out);
    try {
        servlet.doGet(req, res);
    } catch (ServletException e) {
    } catch (IOException e) {
    }
    verify(res, times(1)).getOutputStream();
    verify(req, times(1)).getParameter("numReentries");
    verify(req, times(1)).getParameter("sleep"); // No error here
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_9_oTqv8_tgbH0_fid3() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getServerName()).thenReturn("localhost");
    when(req.getServerPort()).thenReturn(8080);
    when(req.getParameter("numReentries")).thenReturn("1");
    when(req.getParameter("sleep")).thenReturn(String.valueOf(1000));
    when(res.getOutputStream()).thenReturn(out);
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.doGet(req, res);
    verify(res, times(1)).getOutputStream();
    verify(req, times(1)).getServerName();
    verify(req, times(1)).getServerPort();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_10_WbAO9_WEif0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    PingReentryServlet servlet = new PingReentryServlet();
    when(req.getParameter("numReentries")).thenReturn("1");
    when(req.getParameter("sleep")).thenReturn(String.valueOf(1000));
    when(res.getOutputStream()).thenReturn(out);
    when(req.getServerName()).thenReturn("localhost");
    when(req.getServerPort()).thenReturn(8080);
    when(req.getContextPath()).thenReturn("");
    servlet.doGet(req, res);
    verify(res, times(1)).getOutputStream();
    verify(req, times(1)).getParameter("numReentries");
    verify(req, times(1)).getParameter("sleep");
    verify(req, times(1)).getServerName();
    verify(req, times(1)).getServerPort();
    verify(req, times(1)).getContextPath();
}
}