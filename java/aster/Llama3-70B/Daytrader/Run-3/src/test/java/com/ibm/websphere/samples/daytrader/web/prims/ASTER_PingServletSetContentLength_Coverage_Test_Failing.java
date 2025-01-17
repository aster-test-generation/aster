/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.util.Log;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletSetContentLength_Coverage_Test_Failing {
private HttpServletResponse res;
    private Log log;
    private PingServletSetContentLength pingServletSetContentLength;    
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_nNeP0() throws ServletException {
        PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
        ServletConfig config = mock(ServletConfig.class);
        pingServletSetContentLength.init(config);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetServletInfo_KYuX0() {
        PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
        String expected = "Basic dynamic HTML generation through a servlet, with contentLength set by contentLength parameter.";
        String actual = pingServletSetContentLength.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_GetOutputStream_pRRB4_byqj0() throws Exception {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    when(req.getParameter("contentLength")).thenReturn("1000");
    pingServletSetContentLength.doGet(req, res);
    verify(res, times(1)).getOutputStream();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_SetContentType_dDJo0_crGv0() throws Exception {
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
public void testDoGet_GetParameter_IdmK1_RPNR0() throws Exception {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("contentLength")).thenReturn("10");
    when(res.getOutputStream()).thenReturn(out);
    pingServlet.doGet(req, res);
    verify(req, times(1)).getParameter("contentLength");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_GetOutputStream_pRRB4_byqj0_fid2() throws Exception {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    when(req.getParameter("contentLength")).thenReturn("1000");
    pingServlet.doGet(req, res);
    verify(res, times(1)).getOutputStream();
}
}