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
  private ManagedExecutorService mes;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_IYvj0() {
    PingManagedExecutor executor = new PingManagedExecutor();
    String actual = executor.getServletInfo();
    assertEquals("Tests a ManagedExecutor", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_QslI0() throws ServletException, IOException {
    PingManagedExecutor executor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    AsyncContext asyncContext = mock(AsyncContext.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.startAsync()).thenReturn(asyncContext);
    when(res.getOutputStream()).thenReturn(out);
    executor.doGet(req, res);
    verify(out).println("<html><head><title>Ping ManagedExecutor</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping ManagedExecutor<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  </body></html>");
    verify(asyncContext).complete();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_AsyncContextNotCompleted_hsKy1() throws ServletException, IOException {
    PingManagedExecutor executor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    AsyncContext asyncContext = mock(AsyncContext.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.startAsync()).thenReturn(asyncContext);
    when(res.getOutputStream()).thenReturn(out);
    executor.doGet(req, res);
    verify(out).println("<html><head><title>Ping ManagedExecutor</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping ManagedExecutor<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  </body></html>");
    verify(asyncContext, never()).complete();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNullArgument_NTYD1_ygZf0() {
    PingManagedExecutor executor = new PingManagedExecutor();
    String actual = executor.getServletInfo();
    assertEquals("PingManagedExecutor", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_npTR0_dKba0() throws ServletException, IOException {
    PingManagedExecutor executor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    executor.doPost(req, res);
    verify(req).getParameter("param1");
    verify(req).getParameter("param2");
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidParameters_cJzX1_AYWx0() throws ServletException, IOException {
    PingManagedExecutor executor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("param1")).thenReturn("invalid_param1");
    when(req.getParameter("param2")).thenReturn("invalid_param2");
    executor.doPost(req, res);
    verify(req).getParameter("param1");
    verify(req).getParameter("param2");
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullParameters_nxxz2_usDQ0() throws ServletException, IOException {
    PingManagedExecutor executor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("param1")).thenReturn(null);
    when(req.getParameter("param2")).thenReturn(null);
    executor.doPost(req, res);
    verify(req).getParameter("param1");
    verify(req).getParameter("param2");
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithEmptyParameters_VlEB3_bcqH1() throws ServletException, IOException {
    PingManagedExecutor executor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("param1")).thenReturn("");
    when(req.getParameter("param2")).thenReturn("");
    executor.doPost(req, res);
    verify(req).getParameter("param1");
    verify(req).getParameter("param2");
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getWriter();
    verify(res).flushBuffer();
    verify(res.getOutputStream()).close();
  }
}