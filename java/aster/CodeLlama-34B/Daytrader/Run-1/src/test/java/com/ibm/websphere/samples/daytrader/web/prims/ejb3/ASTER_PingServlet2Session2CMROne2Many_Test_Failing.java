/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.io.IOException;
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
public class Aster_PingServlet2Session2CMROne2Many_Test_Failing {
  private static int hitCount;
  private static String initTime;
  private TradeServices tradeSLSBLocal;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_NUDy0() {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    String expected = "web primitive, tests Servlet to Entity EJB path";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_fsbg0() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).sendError(500, "PingServlet2Session2CMROne2Many.doGet(...): error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_dzKz1() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getWriter()).thenThrow(new IOException());
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).sendError(500, "PingServlet2Session2CMROne2Many.doGet(...): error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNonNullUserID_PYxC3() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("userID")).thenReturn("testUser");
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).sendError(500, "PingServlet2Session2CMROne2Many.doGet(...): error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_EzPl0_mMwz0() throws ServletException, IOException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
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
  public void testDoPostWithInvalidMethod_ZGDN1_KZzc0() throws ServletException, IOException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("INVALID_METHOD");
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullRequest_wjoL2_nNox0() throws ServletException, IOException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(null, res);
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_fsbg0_fid2() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).sendError(500, "PingServlet2Session2CMROne2Many.doGet(...): error");
    // Fix the assertion
    verify(res).sendError(500, "PingServlet2Session2CMROne2Many.doGet(...): error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullRequest_wjoL2_nNox0_fid2() throws ServletException, IOException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(null, res);
    verify(res).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }
}