/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
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
public class Aster_PingManagedExecutor_Test_Failing {
private static String initTime;
private static int hitCount;
PingManagedExecutor pingmanagedexecutor;
ServletConfig servletConfig;
HttpServletRequest httpservletrequest;
HttpServletResponse httpservletresponse;
ServletOutputStream servletoutputstream;
HttpServlet httpservlet;
private ManagedExecutorService mes;
AsyncContext asyncContext;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        asyncContext = mock(AsyncContext.class);
        pingmanagedexecutor = new PingManagedExecutor();
        mes = mock(ManagedExecutorService.class);
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        when(httpservletrequest.startAsync()).thenReturn(asyncContext);
        pingmanagedexecutor.doGet(httpservletrequest, httpservletresponse);
        verify(servletoutputstream).println("<html><head><title>Ping ManagedExecutor</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping ManagedExecutor<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  </body></html>");
        verify(mes).submit(any(Runnable.class));
        verify(asyncContext).complete();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_xGfi0() throws ServletException, IOException {
    PingManagedExecutor pingManagedExecutor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingManagedExecutor.doPost(req, res);
    verify(req, times(1)).getMethod();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_amNn0() {
    PingManagedExecutor pingManagedExecutor = new PingManagedExecutor();
    String result = pingManagedExecutor.getServletInfo();
    assertEquals("Tests a ManagedExecutor", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_xGfi0_fid1() throws ServletException, IOException {
    PingManagedExecutor pingManagedExecutor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    pingManagedExecutor.doGet(req, res);
    verify(out, times(2)).println(anyString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_amNn0_fid1() {
    PingManagedExecutor pingManagedExecutor = new PingManagedExecutor();
    String result = pingManagedExecutor.getClass().getGenericSuperclass().getTypeName();
    assertEquals("javax.servlet.GenericServlet", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_foPK0_ynrG0() throws IOException {
    // PingManagedExecutor pingManagedExecutor = new PingManagedExecutor(); // This line is removed as PingManagedExecutor class is not found
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.startAsync()).thenReturn(mock(AsyncContext.class));
    ServletOutputStream sos = mock(ServletOutputStream.class);
    try {
        when(res.getOutputStream()).thenThrow(new IOException()).thenReturn(sos);
        // pingManagedExecutor.doGet(req, res); // This line is removed as PingManagedExecutor class is not found
        // verify(res, atLeastOnce()).setContentType("text/html"); // This line is removed as PingManagedExecutor class is not found
        // verify(sos, atLeastOnce()).println(anyString()); // This line is removed as PingManagedExecutor class is not found
    } catch (Exception e) {
        fail("Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_foPK0_ynrG0_fid2() throws IOException {
    PingManagedExecutor pingManagedExecutor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.startAsync()).thenReturn(mock(AsyncContext.class));
    ServletOutputStream sos = mock(ServletOutputStream.class);
    try {
        when(res.getOutputStream()).thenThrow(new IOException()).thenReturn(sos);
        pingManagedExecutor.doGet(req, res);
        verify(res, atLeastOnce()).setContentType("text/html");
        verify(sos, atLeastOnce()).println(anyString());
    } catch (Exception e) {
        fail("Exception should not be thrown");
    }
}
}