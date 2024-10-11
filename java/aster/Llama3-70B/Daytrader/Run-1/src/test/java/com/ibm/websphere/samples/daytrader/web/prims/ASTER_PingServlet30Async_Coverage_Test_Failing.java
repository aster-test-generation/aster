/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet30Async_Coverage_Test_Failing {
  private PingServlet30Async pingServlet30Async;
  private ServletOutputStream servletOutputStream;
  private ServletConfig config;
  private PingServlet30Async servlet;
  private HttpServletResponse res;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_zTTT0() {
    PingServlet30Async pingServlet30Async = new PingServlet30Async();
    String expected = "Basic dynamic HTML generation through a servlet";
    String actual = pingServlet30Async.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_NHJT1() {
    PingServlet30Async pingServlet30Async = new PingServlet30Async();
    String actual = pingServlet30Async.getServletInfo();
    assertNotNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_CallsDoPost_rTTi1_rcwD0() throws ServletException, IOException {
    PingServlet servlet = new PingServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingServlet doPostSpy = spy(servlet);
    doPostSpy.doGet(request, response);
    verify(doPostSpy, never()).doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_CallsDoPost_rTTi1_rcwD0_fid2() throws ServletException, IOException {
    PingServlet30Async servlet = new PingServlet30Async();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingServlet30Async doPostSpy = spy(servlet);
    doPostSpy.doGet(request, response);
    verify(doPostSpy).doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_StartAsync_Bbhj2_peCR0() throws ServletException, IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    AsyncContext asyncContext = mock(AsyncContext.class);
    when(request.startAsync(request, response)).thenReturn(asyncContext);
    PingServlet30Async pingServlet30Async = new PingServlet30Async();
    pingServlet30Async.doGet(request, response);
    verify(request, times(1)).startAsync(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_Erdi0() throws javax.servlet.ServletException {
    servlet = new PingServlet30Async();
    config = mock(ServletConfig.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_SuperInitCalled_bGdq1() throws ServletException {
    servlet.init(config);
    verify(config).getServletContext(); // assuming super.init(config) calls getServletContext()
  }
}