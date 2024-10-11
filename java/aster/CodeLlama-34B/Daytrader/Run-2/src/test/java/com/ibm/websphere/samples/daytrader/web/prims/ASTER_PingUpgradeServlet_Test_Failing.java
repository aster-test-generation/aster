/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingUpgradeServlet_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_EGpE0() throws ServletException, IOException {
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithInvalidMethod_oznY1() throws ServletException, IOException {
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("INVALID");
    servlet.doGet(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNullRequest_UVNG2() throws ServletException, IOException {
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest req = null;
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNullResponse_tgsP3() throws ServletException, IOException {
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = null;
    servlet.doGet(req, res);
    verify(req).getMethod();
    verify(res, never()).setStatus(anyInt());
    verify(res, never()).setContentType(anyString());
    verify(res, never()).getWriter();
    verify(res, never()).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithoutEchoUpgrade_pSPn1_ehyl0() throws ServletException, IOException {
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getHeader("Upgrade")).thenReturn("");
    servlet.doPost(req, res);
    verify(res).getWriter();
    verify(res).getWriter().println("No upgrade: ");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNullResponse_tgsP3_fid2() throws ServletException, IOException {
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(req).getMethod();
    verify(res, never()).setStatus(anyInt());
    verify(res, never()).setContentType(anyString());
    verify(res, never()).getWriter();
    verify(res, never()).flushBuffer();
  }
}