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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletBeanValSimple2_Test_Failing {
  private static LocalDateTime initTime;
  PingServletBeanValSimple2 pingServletBeanValSimple2;
  ServletConfig mockServletConfig;
  HttpServletRequest httpServletRequest;
  HttpServletResponse httpServletResponse;
  PingServletBeanValSimple2 pingServlet;
  HttpServletRequest request;
  HttpServletResponse response;
  ServletOutputStream outputStream;
  private static int hitCount = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost() throws ServletException, IOException {
    httpServletRequest = mock(HttpServletRequest.class);
    httpServletResponse = mock(HttpServletResponse.class);
    pingServletBeanValSimple2 = new PingServletBeanValSimple2();
    // Setup
    doNothing().when(httpServletResponse).sendRedirect(anyString());
    // Execute
    pingServletBeanValSimple2.doPost(httpServletRequest, httpServletResponse);
    // Verify
    verify(httpServletResponse, never()).sendRedirect(anyString()); // Since doPost just calls doGet and we don't know what doGet does, we assume it does nothing with the response
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_dQpn0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    doNothing().when(servlet).doGet(req, res);
    servlet.doPost(req, res);
    verify(servlet).doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_YCjH0() {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    String result = servlet.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet() throws ServletException, IOException {
    pingServlet = new PingServletBeanValSimple2();
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
  public void testGetServletInfo_YCjH0_fid1() {
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    String result = servlet.getServletInfo();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_IrzS0_iZym0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream outStream = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(outStream);
    PingServletBeanValSimple2 servlet = new PingServletBeanValSimple2();
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(outStream).println(anyString());
  }
}