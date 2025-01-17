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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingJSONPStreaming_Coverage_Test_Failing {
  private PingJSONPStreaming pingJSONPStreaming;
  private ServletConfig servletConfig;
  private HttpServletResponse res;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_JsonParserEvent_pjIr0() throws ServletException, IOException {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    pingJSONPStreaming.doGet(req, res);
    verify(out).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_CatchBlock_HOxc5() throws ServletException, IOException {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    doThrow(new Exception()).when(pingJSONPStreaming).doGet(req, res);
    pingJSONPStreaming.doGet(req, res);
    verify(res).sendError(500, anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SetContentType_ojFa7() throws ServletException, IOException {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingJSONPStreaming.doGet(req, res);
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_GetOutputStream_qaQv8() throws ServletException, IOException {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    pingJSONPStreaming.doGet(req, res);
    verify(res).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_YGBN0() {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    String expected = "Basic JSON generation and parsing in a servlet";
    String actual = pingJSONPStreaming.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_kzMo0() throws javax.servlet.ServletException {
    pingJSONPStreaming = new PingJSONPStreaming();
    servletConfig = mock(ServletConfig.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_SuperInitCalled_CueP1() throws ServletException {
    pingJSONPStreaming.init(servletConfig);
  }
}