/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServlet2PDF_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostCallsDoGet_vYVT0() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingServlet2PDF servlet = new PingServlet2PDF();
        servlet.doPost(request, response);
        verify(servlet).doGet(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostExecutionCompletes_NLPS1() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingServlet2PDF servlet = new PingServlet2PDF();
        servlet.doPost(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_LogError_SiKg0() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        PingServlet2PDF servlet = new PingServlet2PDF();
        when(res.getOutputStream()).thenThrow(new IOException("Simulated IOException"));
        servlet.doGet(req, res);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_SendError_gvNa1() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        PingServlet2PDF servlet = new PingServlet2PDF();
        when(res.getOutputStream()).thenThrow(new IOException("Simulated IOException"));
        servlet.doGet(req, res);
        verify(res).sendError(500, "PingServlet2Jsp.doGet(...): request errorSimulated IOException");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_CloseBISNotNull_nkFN2() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(res.getOutputStream()).thenReturn(out);
        PingServlet2PDF servlet = new PingServlet2PDF();
        servlet.doGet(req, res);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_PingBeanOperations_MbfW5() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(res.getOutputStream()).thenReturn(out);
        PingServlet2PDF servlet = new PingServlet2PDF();
        servlet.doGet(req, res);
        verify(req).setAttribute(eq("ab"), any());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_SetContentType_sOTL6() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(res.getOutputStream()).thenReturn(out);
        PingServlet2PDF servlet = new PingServlet2PDF();
        servlet.doGet(req, res);
        verify(res).setContentType("application/pdf");
    }
}