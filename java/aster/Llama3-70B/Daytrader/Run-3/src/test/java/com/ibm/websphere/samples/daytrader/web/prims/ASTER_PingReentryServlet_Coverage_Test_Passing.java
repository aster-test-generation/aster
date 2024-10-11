/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.servlet.ServletConfig;
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
    private InputStreamReader isr;
    private PingReentryServlet servlet = new PingReentryServlet();    
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_EFQc0() throws ServletException {
        PingReentryServlet servlet = new PingReentryServlet();
        ServletConfig config = mock(ServletConfig.class);
        servlet.init(config);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetServletInfo_yjtR0() {
        PingReentryServlet servlet = new PingReentryServlet();
        String expected = "Basic dynamic HTML generation through a servlet";
        String actual = servlet.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_uYlv0() throws ServletException, IOException {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        servlet.doPost(req, res);
        verify(servlet).doGet(req, res);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_Exception_TsVy1() throws ServletException, IOException {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        servlet = spy(new PingReentryServlet());
        doThrow(new ServletException("Test exception")).when(servlet).doGet(req, res);
        try {
            servlet.doPost(req, res);
        } catch (ServletException e) {
            assertEquals("Test exception", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
void testGetServletInfo_yjtR0_fid1() {
    try {
        PingReentryServlet servlet = (PingReentryServlet) Class.forName("com.ibm.websphere.samples.daytrader.web.prims.PingReentryServlet").getDeclaredConstructor().newInstance();
        String actual = servlet.getServletInfo();
        assertNotNull(actual);
    } catch (Exception e) {
        fail("Exception occurred: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_2_bfaZ1_PCeU0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    PingReentryServlet servlet = new PingReentryServlet();
    when(req.getParameter("numReentries")).thenReturn("0");
    when(req.getParameter("sleep")).thenReturn("1000");
    when(res.getOutputStream()).thenReturn(out);
    servlet.doGet((HttpServletRequest) req, (HttpServletResponse) res);
    verify(out).println("0");
}
}