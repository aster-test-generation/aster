/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingManagedExecutor_Test_Failing {
  private static String initTime;
  private static int hitCount;
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;
  private ManagedExecutorService mes;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_hMFn0() {
    PingManagedExecutor executor = new PingManagedExecutor();
    String result = executor.getServletInfo();
    assertEquals("Tests a ManagedExecutor", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ZnWL0() throws ServletException, IOException {
    PingManagedExecutor executor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    AsyncContext asyncContext = mock(AsyncContext.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.startAsync()).thenReturn(asyncContext);
    when(res.getOutputStream()).thenReturn(out);
    executor.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(out).println("<html><head><title>Ping ManagedExecutor</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping ManagedExecutor<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  </body></html>");
    verify(asyncContext).complete();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_MZzF1() throws ServletException, IOException {
    PingManagedExecutor executor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    AsyncContext asyncContext = mock(AsyncContext.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.startAsync()).thenReturn(asyncContext);
    when(res.getOutputStream()).thenReturn(out);
    doThrow(new IOException()).when(out).println(anyString());
    executor.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(out).println("<html><head><title>Ping ManagedExecutor</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping ManagedExecutor<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  </body></html>");
    verify(asyncContext).complete();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNullRequest_eqLI2() throws ServletException, IOException {
    PingManagedExecutor executor = new PingManagedExecutor();
    HttpServletRequest req = null;
    HttpServletResponse res = mock(HttpServletResponse.class);
    AsyncContext asyncContext = mock(AsyncContext.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.startAsync()).thenReturn(asyncContext);
    when(res.getOutputStream()).thenReturn(out);
    executor.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(out).println("<html><head><title>Ping ManagedExecutor</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping ManagedExecutor<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  </body></html>");
    verify(asyncContext).complete();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithEmptyString_hEYH2_CVQT0() {
    PingManagedExecutor executor = new PingManagedExecutor();
    String result = executor.getServletInfo();
    assertEquals("", result);
  }
}