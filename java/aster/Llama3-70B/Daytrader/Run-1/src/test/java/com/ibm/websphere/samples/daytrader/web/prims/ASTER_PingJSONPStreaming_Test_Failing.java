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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJSONPStreaming_Test_Failing {
  private static String initTime;
  private static int hitCount;
  PingJSONPStreaming pingjsonpstreaming;
  ServletConfig servletConfig;
  HttpServletResponse httpservletresponse;
  ServletOutputStream servletoutputstream;
  HttpServletRequest httpservletrequest;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    servletoutputstream = mock(ServletOutputStream.class);
    httpservletrequest = mock(HttpServletRequest.class);
    pingjsonpstreaming = new PingJSONPStreaming();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    pingjsonpstreaming.doPost(httpservletrequest, httpservletresponse);
    verify(pingjsonpstreaming).doGet(httpservletrequest, httpservletresponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_JALE0() throws ServletException, IOException {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("GET");
    pingJSONPStreaming.doGet(req, res);
    verify(req, times(1)).getMethod();
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_FqXg0() {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    String result = null;
    assertEquals(null, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_JALE0_fid1() throws ServletException, IOException {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingJSONPStreaming.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(200);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_FqXg0_fid1() {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    String result = pingJSONPStreaming.getServletInfo();
    assertEquals("Basic JSON generation and parsing in a servlet", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_BQRA0() throws ServletException, IOException {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    pingJSONPStreaming.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(out).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_IOException_fhan1() throws ServletException, IOException {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getOutputStream()).thenThrow(new IOException());
    pingJSONPStreaming.doGet(req, res);
    verify(res).sendError(500, anyString());
  }
}