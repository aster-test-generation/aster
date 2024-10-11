/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
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
public class Aster_PingServletBeanValSimple2_Test_Failing {
  private static LocalDateTime initTime;
  private static int hitCount = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_WAuB0() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "Exception");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_hJGT0() {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    String servletInfo = servlet.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet", servletInfo);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_XamZ0() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithInvalidMethod_FrJN1() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("INVALID");
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithNullRequest_ngPu2() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = null;
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithNullResponse_siJF3() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = null;
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res, never()).setStatus(HttpServletResponse.SC_OK);
    verify(res, never()).setContentType("text/plain");
    verify(res, never()).getWriter();
    verify(res, never()).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_WAuB0_fid1() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).sendError(500, "Exception");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithNullRequest_ngPu2_fid1() throws ServletException, IOException {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }
}