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
import com.ibm.websphere.samples.daytrader.util.Log;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletSetContentLength_Coverage_Test_Failing {
private PingServletSetContentLength pingServletSetContentLength;
    private HttpServletResponse res;
    private Log log;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_nxYb0() throws ServletException {
        PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
        ServletConfig config = mock(ServletConfig.class);
        pingServletSetContentLength.init(config);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_WhileLoop_DQpR7_oYhb0() throws Exception {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("contentLength")).thenReturn("1000");
    pingServlet.doGet(req, res);
    assertEquals(1000, 1000);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_LengthParamIsNegative_PHXh12_TMcz0() throws Exception {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("contentLength")).thenReturn("-100");
    pingServlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).sendError(400);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_Println_AUib8_iJfx0() throws Exception {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("contentLength")).thenReturn("1000");
    when(res.getOutputStream()).thenReturn(out);
    pingServlet.doGet(req, res);
    verify(out).println(anyString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_SetContentType_Rzlp0_RRwI0() throws Exception {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    pingServlet.doGet(req, res);
    verify(res).setContentType("text/plain");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_GetParameter_Wobr1_ntMs0() throws Exception {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("contentLength")).thenReturn("100");
    when(res.getOutputStream()).thenReturn(out);
    pingServlet.doGet(req, res);
    verify(req, times(1)).getParameter("contentLength");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_GetOutputStream_qYHO4_lIza0() throws Exception {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    when(req.getParameter("contentLength")).thenReturn("1000"); 
    pingServlet.doGet(req, res);
    verify(res, times(1)).getOutputStream();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_SendError_pGvg10_WCbI0() throws Exception {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("contentLength")).thenThrow(new IOException("IO Exception"));
    pingServlet.doGet((HttpServletRequest) req, (HttpServletResponse) res);
    verify(res).sendError(500, "java.io.IOException: IO Exception");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetServletInfo_qfrM0() {
        PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
        String expected = "Basic dynamic HTML generation through a servlet, with contentLength set by contentLength parameter.";
        String actual = pingServletSetContentLength.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_WhileLoop_DQpR7_oYhb0_fid2() throws Exception {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("contentLength")).thenReturn("1000");
    pingServletSetContentLength.doGet(req, res);
    assertEquals(833, 1000 - 167);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_LengthParamIsNegative_PHXh12_TMcz0_fid2() throws Exception {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("contentLength")).thenReturn("-100");
    pingServletSetContentLength.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).setStatus(200);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_CallsDoGet_wKLt0_rcKJ0() throws ServletException, IOException {
    PingServletSetContentLength servlet = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res); 
    verify(req, times(1)).getParameter("contentLength"); 
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_Println_AUib8_iJfx0_fid2() throws Exception {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("contentLength")).thenReturn("1000");
    when(res.getOutputStream()).thenReturn(out);
    pingServletSetContentLength.doGet(req, res);
    verify(out).println(anyString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_SetContentType_Rzlp0_RRwI0_fid2() throws Exception {
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
public void testDoGet_GetParameter_Wobr1_ntMs0_fid2() throws Exception {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("contentLength")).thenReturn("100");
    when(res.getOutputStream()).thenReturn(out);
    pingServletSetContentLength.doGet(req, res);
    verify(req, times(1)).getParameter("contentLength");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_GetOutputStream_qYHO4_lIza0_fid2() throws Exception {
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
public void testDoGet_SendError_pGvg10_WCbI0_fid2() throws Exception {
    PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("contentLength")).thenThrow(new IOException("IO Exception"));
    pingServletSetContentLength.doGet((HttpServletRequest) req, (HttpServletResponse) res);
    verify(res).sendError(500, "java.io.IOException: IO Exception");
}
}