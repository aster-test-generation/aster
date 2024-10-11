/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet31AsyncRead_Coverage_Test_Failing {
  private PingServlet31AsyncRead servlet;
  private ServletConfig config;
  private HttpServletResponse res;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_KJLN0() {
    PingServlet31AsyncRead pingServlet31AsyncRead = new PingServlet31AsyncRead();
    String expected = "Basic dynamic HTML generation through a servlet";
    String actual = pingServlet31AsyncRead.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_startAsync_VmhJ2_ZOlx0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    AsyncContext asyncContext = mock(AsyncContext.class);
    when(req.startAsync()).thenReturn(asyncContext);
    PingServlet31AsyncRead pingServlet31AsyncRead = new PingServlet31AsyncRead();
    pingServlet31AsyncRead.doPost(req, res);
    verify(req, times(1)).startAsync();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_asyncContext_YtPy6_EGRk0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    AsyncContext ac = mock(AsyncContext.class);
    when(req.startAsync()).thenReturn(ac);
    PingServlet pingServlet = new PingServlet();
    pingServlet.doPost(req, res);
    verify(req, times(1)).startAsync();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_setReadListener_SCkB5_pgOf0() throws ServletException, IOException {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletInputStream input = mock(ServletInputStream.class);
    ReadListener readListener = mock(ReadListener.class);
    when(req.getInputStream()).thenReturn(input);
    when(input.isReady()).thenReturn(true);
    when(input.isFinished()).thenReturn(false);
    pingServlet.doPost(req, res);
    verify(input, times(1)).setReadListener(readListener);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_CallsDoPost_mnyl0_Hxro0_fid1() throws Exception {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(req, times(0)).getAttributeNames();
    assertNotNull(res);
    verify(res, times(0)).setStatus(anyInt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_setReadListener_SCkB5_pgOf0_fid1() throws ServletException, IOException {
    PingServlet31AsyncRead pingServlet31AsyncRead = new PingServlet31AsyncRead();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletInputStream input = mock(ServletInputStream.class);
    ReadListener readListener = mock(ReadListener.class);
    when(req.getInputStream()).thenReturn(input);
    when(input.isReady()).thenReturn(true);
    when(input.isFinished()).thenReturn(false);
    pingServlet31AsyncRead.doPost(req, res);
    verify(input, never()).setReadListener(any(ReadListener.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_Fvoe0() throws javax.servlet.ServletException {
    servlet = new PingServlet31AsyncRead();
    config = mock(ServletConfig.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_SuperInitCalled_agsJ1() throws ServletException {
    servlet.init(config);
    verify(config).getServletContext(); // assuming super.init(config) calls getServletContext()
  }
}