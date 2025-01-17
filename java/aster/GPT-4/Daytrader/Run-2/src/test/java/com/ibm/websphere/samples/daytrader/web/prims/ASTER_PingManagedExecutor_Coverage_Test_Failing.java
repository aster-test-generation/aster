/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.AsyncContext;
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
public class Aster_PingManagedExecutor_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_TpLG0() {
        PingManagedExecutor executor = new PingManagedExecutor();
        String expected = "Tests a ManagedExecutor";
        String actual = executor.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostCallsDoGet_yxQr0() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingManagedExecutor executor = new PingManagedExecutor();
        executor.doPost(request, response);
        verify(executor).doGet(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostExecutionCompletes_BrCy1() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingManagedExecutor executor = new PingManagedExecutor();
        executor.doPost(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_StartAsync_YNVw0() throws ServletException, IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        AsyncContext asyncContext = mock(AsyncContext.class);
        when(req.startAsync()).thenReturn(asyncContext);
        PingManagedExecutor executor = new PingManagedExecutor();
        executor.doGet(req, res);
        verify(req).startAsync();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_GetOutputStream_tNVT1() throws ServletException, IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(res.getOutputStream()).thenReturn(mock(ServletOutputStream.class));
        PingManagedExecutor executor = new PingManagedExecutor();
        executor.doGet(req, res);
        verify(res).getOutputStream();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_SetContentType_eubk2() throws ServletException, IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(res.getOutputStream()).thenReturn(mock(ServletOutputStream.class));
        PingManagedExecutor executor = new PingManagedExecutor();
        executor.doGet(req, res);
        verify(res).setContentType("text/html");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_PrintInitialHtml_oFOM3() throws ServletException, IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(res.getOutputStream()).thenReturn(out);
        PingManagedExecutor executor = new PingManagedExecutor();
        executor.doGet(req, res);
        verify(out).println("<html><head><title>Ping ManagedExecutor</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping ManagedExecutor<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + null + "<BR><BR></FONT>  </body></html>");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_PrintHitCount_XqRk5() throws ServletException, IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        AsyncContext asyncContext = mock(AsyncContext.class);
        when(req.startAsync()).thenReturn(asyncContext);
        when(res.getOutputStream()).thenReturn(out);
        PingManagedExecutor executor = new PingManagedExecutor();
        executor.doGet(req, res);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_HandleIOExceptionInRunnable_iRSd6() throws ServletException, IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(res.getOutputStream()).thenReturn(out);
        doThrow(new IOException()).when(out).println(anyString());
        PingManagedExecutor executor = new PingManagedExecutor();
        executor.doGet(req, res);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_CompleteAsyncContext_QDHD7() throws ServletException, IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        AsyncContext asyncContext = mock(AsyncContext.class);
        when(req.startAsync()).thenReturn(asyncContext);
        PingManagedExecutor executor = new PingManagedExecutor();
        executor.doGet(req, res);
        verify(asyncContext).complete();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_CatchException_hRvv8() throws ServletException, IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.startAsync()).thenThrow(new RuntimeException());
        PingManagedExecutor executor = new PingManagedExecutor();
        executor.doGet(req, res);
    }
}