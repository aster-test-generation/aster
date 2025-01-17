/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.io.IOException;
import java.time.LocalDateTime;
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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletBeanValSimple1_Test_Failing {
  PingServletBeanValSimple1 pingServletBeanValSimple1;
  ServletConfig mockServletConfig;
  HttpServletRequest httpServletRequest;
  HttpServletResponse httpServletResponse;
  PingServletBeanValSimple1 pingServlet;
  HttpServletRequest request;
  HttpServletResponse response;
  ServletOutputStream outputStream;
  private static LocalDateTime initTime;
  private static int hitCount = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost() throws ServletException, IOException {
    pingServletBeanValSimple1 = new PingServletBeanValSimple1();
    httpServletRequest = mock(HttpServletRequest.class);
    httpServletResponse = mock(HttpServletResponse.class);
    // Setup
    pingServletBeanValSimple1.doPost(httpServletRequest, httpServletResponse);
    // Verify that doGet is called once since doPost delegates to doGet
    verify(httpServletResponse, never()).getOutputStream(); // Since doGet is not implemented, no output stream should be used
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_WdWG0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    servlet.doPost(req, res);
    verify(req, atLeastOnce()).getMethod();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_JzTe0() {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    String result = servlet.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet() throws ServletException, IOException {
    pingServlet = new PingServletBeanValSimple1();
    request = mock(HttpServletRequest.class);
    response = mock(HttpServletResponse.class);
    outputStream = mock(ServletOutputStream.class);
    when(response.getOutputStream()).thenReturn(outputStream);
    pingServlet.doGet(request, response);
    verify(response).setContentType("text/html");
    verify(response).getOutputStream();
    verify(outputStream).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_WdWG0_fid2() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream outputStream = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(outputStream);
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    servlet.doGet(req, res);
    verify(res, atLeastOnce()).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_JzTe0_fid2() {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    String result = servlet.getServletInfo();
    assertEquals("Ping Servlet Bean Validation Simple", result);
  }
}