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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingReentryServlet_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_EauM0() {
    PingReentryServlet servlet = new PingReentryServlet();
    String actual = servlet.getServletInfo();
    String expected = "Basic dynamic HTML generation through a servlet";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidMethod_SABo1() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("INVALID");
    servlet.doPost(req, res);
    verify(res).sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithException_jfUs2() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenThrow(new ServletException());
    servlet.doPost(req, res);
    verify(res).sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_numReentries_0_vqQj0() throws Exception {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("numReentries")).thenReturn("0");
    when(req.getParameter("sleep")).thenReturn("0");
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "Invalid number of reentries");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_numReentries_1_dSiv1() throws Exception {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("numReentries")).thenReturn("1");
    when(req.getParameter("sleep")).thenReturn("0");
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "Invalid number of reentries");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_numReentries_2_ASDh2() throws Exception {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("numReentries")).thenReturn("2");
    when(req.getParameter("sleep")).thenReturn("0");
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "Invalid number of reentries");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_numReentries_3_EQfL3() throws Exception {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("numReentries")).thenReturn("3");
    when(req.getParameter("sleep")).thenReturn("0");
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "Invalid number of reentries");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_numReentries_4_IFXz4() throws Exception {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("numReentries")).thenReturn("4");
    when(req.getParameter("sleep")).thenReturn("0");
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
    verify(res).sendError(500, "Invalid number of reentries");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithNullConfig_Vmei1_WkWs0() {
    PingReentryServlet servlet = new PingReentryServlet();
    try {
      servlet.init(null);
      assertNull(servlet.getServletConfig());
    } catch (ServletException e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_aKge0_mKrf0() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }
}