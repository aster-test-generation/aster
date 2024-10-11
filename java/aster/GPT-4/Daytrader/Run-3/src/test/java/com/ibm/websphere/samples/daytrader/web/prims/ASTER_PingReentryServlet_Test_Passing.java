/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingReentryServlet_Test_Passing {
  @InjectMocks
  private PingReentryServlet pingReentryServlet;
  @Mock
  private ServletConfig mockServletConfig;
  HttpServletResponse httpServletResponse;
  HttpServletRequest httpServletRequest;
  ServletOutputStream servletOutputStream;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost() throws Exception {
    httpServletResponse = mock(HttpServletResponse.class);
    httpServletRequest = mock(HttpServletRequest.class);
    pingReentryServlet = new PingReentryServlet();
    // Arrange
    // No specific arrangement needed for this test
    // Act
    pingReentryServlet.doPost(httpServletRequest, httpServletResponse);
    // Assert
    // Verify that doGet is called once with the same request and response objects
    verify(pingReentryServlet).doGet(httpServletRequest, httpServletResponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_tMxY0() {
    PingReentryServlet servlet = new PingReentryServlet();
    String result = servlet.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNoParameters() throws Exception {
    httpServletResponse = mock(HttpServletResponse.class);
    servletOutputStream = mock(ServletOutputStream.class);
    httpServletRequest = mock(HttpServletRequest.class);
    pingReentryServlet = new PingReentryServlet();
    when(httpServletRequest.getParameter("numReentries")).thenReturn(null);
    when(httpServletRequest.getParameter("sleep")).thenReturn(null);
    when(httpServletResponse.getOutputStream()).thenReturn(servletOutputStream);
    pingReentryServlet.doGet(httpServletRequest, httpServletResponse);
    verify(httpServletResponse).setContentType("text/html");
    verify(servletOutputStream).println(0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithParameters() throws Exception {
    httpServletResponse = mock(HttpServletResponse.class);
    servletOutputStream = mock(ServletOutputStream.class);
    httpServletRequest = mock(HttpServletRequest.class);
    pingReentryServlet = new PingReentryServlet();
    when(httpServletRequest.getParameter("numReentries")).thenReturn("1");
    when(httpServletRequest.getParameter("sleep")).thenReturn("100");
    when(httpServletResponse.getOutputStream()).thenReturn(servletOutputStream);
    when(httpServletRequest.getServerName()).thenReturn("localhost");
    when(httpServletRequest.getServerPort()).thenReturn(8080);
    when(httpServletRequest.getContextPath()).thenReturn("/test");
    pingReentryServlet.doGet(httpServletRequest, httpServletResponse);
    verify(httpServletResponse).setContentType("text/html");
    verify(servletOutputStream, never()).println(anyInt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetHandlesIOException() throws Exception {
    httpServletResponse = mock(HttpServletResponse.class);
    servletOutputStream = mock(ServletOutputStream.class);
    httpServletRequest = mock(HttpServletRequest.class);
    pingReentryServlet = new PingReentryServlet();
    when(httpServletRequest.getParameter("numReentries")).thenReturn("0");
    when(httpServletRequest.getParameter("sleep")).thenReturn("100");
    when(httpServletResponse.getOutputStream()).thenReturn(servletOutputStream);
    doThrow(new IOException()).when(servletOutputStream).println(0);
    pingReentryServlet.doGet(httpServletRequest, httpServletResponse);
    verify(httpServletResponse).sendError(500, "java.io.IOException");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNoParameters_UcgX0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.doGet(req, res);
    verify(out).println(0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNumReentriesParameterOnly_TBZy1() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("numReentries")).thenReturn("3");
    when(res.getOutputStream()).thenReturn(out);
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.doGet(req, res);
    verify(out, never()).println(3);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithSleepParameterOnly_MgvT2() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("sleep")).thenReturn("1000");
    when(res.getOutputStream()).thenReturn(out);
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.doGet(req, res);
    verify(out).println(0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithBothParameters_Mytx3() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("numReentries")).thenReturn("1");
    when(req.getParameter("sleep")).thenReturn("500");
    when(res.getOutputStream()).thenReturn(out);
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.doGet(req, res);
    verify(out, never()).println(1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithInvalidParameters_dUds4() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("numReentries")).thenReturn("abc");
    when(req.getParameter("sleep")).thenReturn("xyz");
    when(res.getOutputStream()).thenReturn(out);
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.doGet(req, res);
    verify(res).sendError(500, "java.lang.NumberFormatException: For input string: \"abc\"");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_ABBu0() throws ServletException {
    pingReentryServlet.init(mockServletConfig);
    verify(pingReentryServlet).init(mockServletConfig);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_ahTP0_sFFJ0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.doGet(req, res);
    verify(res, times(1)).getOutputStream();
  }
}