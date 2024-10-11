/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
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
public class Aster_PingServlet30Async_Test_Failing {
  private static String initTime;
  private static int hitCount;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_nswz0() throws ServletException, IOException {
    PingServlet30Async servlet = new PingServlet30Async();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    AsyncContext ac = mock(AsyncContext.class);
    when(req.startAsync()).thenReturn(ac);
    servlet.doPost(req, res);
    verify(ac).complete();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_PECM0() {
    PingServlet30Async servlet = new PingServlet30Async();
    String expected = "Basic dynamic HTML generation through a servlet";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_kTnH0() throws ServletException, IOException {
    PingServlet30Async servlet = new PingServlet30Async();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithPostMethod_UOZp1() throws ServletException, IOException {
    PingServlet30Async servlet = new PingServlet30Async();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("POST");
    servlet.doGet(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithGetMethod_QlQZ2() throws ServletException, IOException {
    PingServlet30Async servlet = new PingServlet30Async();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("GET");
    servlet.doGet(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithOtherMethod_gexm3() throws ServletException, IOException {
    PingServlet30Async servlet = new PingServlet30Async();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("OTHER");
    servlet.doGet(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_uvAg4() throws ServletException, IOException {
    PingServlet30Async servlet = new PingServlet30Async();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenThrow(new IOException());
    servlet.doGet(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }
}