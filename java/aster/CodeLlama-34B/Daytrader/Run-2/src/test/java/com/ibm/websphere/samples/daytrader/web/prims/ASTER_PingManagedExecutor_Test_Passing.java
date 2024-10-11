/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingManagedExecutor_Test_Passing {
  @Mock
  private ServletOutputStream out;
  @Mock
  private AsyncContext asyncContext;
  private static String initTime;
  private static int hitCount;
  PingManagedExecutor pingmanagedexecutor;
  HttpServlet httpservlet;
  private ManagedExecutorService mes;
  private HttpServletRequest req;
  @Mock
  private HttpServletResponse res;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_1() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingmanagedexecutor = new PingManagedExecutor();
    ServletConfig servletConfig = mock(ServletConfig.class);
    pingmanagedexecutor.init(servletConfig);
    assertEquals(new java.util.Date().toString(), initTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_2() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingmanagedexecutor = new PingManagedExecutor();
    ServletConfig servletConfig = mock(ServletConfig.class);
    pingmanagedexecutor.init(servletConfig);
    assertEquals(0, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_xMli0() throws ServletException, IOException {
    PingManagedExecutor executor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    executor.doPost(req, res);
    verify(req).getParameter("param1");
    verify(req).getParameter("param2");
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).getWriter();
    verify(res).flushBuffer();
    // Fix the assertion
    assertEquals(HttpServletResponse.SC_OK, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidParameters_Vpja1() throws ServletException, IOException {
    PingManagedExecutor executor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("param1")).thenReturn("invalid");
    when(req.getParameter("param2")).thenReturn("invalid");
    executor.doPost(req, res);
    verify(req).getParameter("param1");
    verify(req).getParameter("param2");
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getWriter();
    verify(res).flushBuffer();
    // Fix the assertion
    assertEquals(HttpServletResponse.SC_BAD_REQUEST, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullParameters_VtVJ2() throws ServletException, IOException {
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
    // Fix the assertion
    assertEquals(HttpServletResponse.SC_BAD_REQUEST, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithEmptyParameters_FUOf3() throws ServletException, IOException {
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
    // Fix the assertion
    assertEquals(HttpServletResponse.SC_BAD_REQUEST, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidParameterValue_cIYH4() throws ServletException, IOException {
    PingManagedExecutor executor = new PingManagedExecutor();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("param1")).thenReturn("invalid");
    when(req.getParameter("param2")).thenReturn("invalid");
    executor.doPost(req, res);
    verify(req).getParameter("param1");
    verify(req).getParameter("param2");
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_AkIW0() {
    PingManagedExecutor executor = new PingManagedExecutor();
    String result = executor.getServletInfo();
    assertEquals("Tests a ManagedExecutor", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingmanagedexecutor = new PingManagedExecutor();
    ServletConfig servletConfig = mock(ServletConfig.class);
    pingmanagedexecutor.init(servletConfig);
    assertEquals(new java.util.Date().toString(), initTime);
    assertEquals(0, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_xMli0_fid1() throws ServletException, IOException {
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
  public void testDoPostWithNullParameters_VtVJ2_fid1() throws ServletException, IOException {
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
  public void testDoPostWithEmptyParameters_FUOf3_fid1() throws ServletException, IOException {
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
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_NullObject_Mpyb1() {
    PingManagedExecutor executor = null;
    String result = executor.getServletInfo();
    assertNull(result);
  }
}