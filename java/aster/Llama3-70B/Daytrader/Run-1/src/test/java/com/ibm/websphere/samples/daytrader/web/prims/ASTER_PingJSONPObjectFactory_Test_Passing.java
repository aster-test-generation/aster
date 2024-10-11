/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonReaderFactory;
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
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJSONPObjectFactory_Test_Passing {
  private static int hitCount;
  private static String initTime;
  PingJSONPObjectFactory pingjsonpobjectfactory;
  ServletConfig servletConfig;
  HttpServletRequest httpservletrequest;
  HttpServletResponse httpservletresponse;
  ServletOutputStream servletoutputstream;
  private static JsonBuilderFactory jSONObjectFactory = Json.createBuilderFactory(null);
  private static JsonReaderFactory jSONReaderFactory = Json.createReaderFactory(null);

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost() throws Exception {
    httpservletrequest = mock(HttpServletRequest.class);
    httpservletresponse = mock(HttpServletResponse.class);
    servletoutputstream = mock(ServletOutputStream.class);
    pingjsonpobjectfactory = new PingJSONPObjectFactory();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    pingjsonpobjectfactory.doPost(httpservletrequest, httpservletresponse);
    verify(httpservletrequest, times(1)).getAttribute(anyString());
    verify(httpservletresponse, times(1)).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WdDB0() {
    PingJSONPObjectFactory pingJSONPObjectFactory = new PingJSONPObjectFactory();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
      pingJSONPObjectFactory.doPost(req, res);
      verify(req, times(1)).getMethod();
    } catch (ServletException | IOException e) {
      fail("Exception should not be thrown");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_pCxv0() {
    PingJSONPObjectFactory pingJSONPObjectFactory = new PingJSONPObjectFactory();
    String result = pingJSONPObjectFactory.getServletInfo();
    assertEquals("Basic JSON generation and parsing in a servlet", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet_CtOi0() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    servletoutputstream = mock(ServletOutputStream.class);
    httpservletrequest = mock(HttpServletRequest.class);
    pingjsonpobjectfactory = new PingJSONPObjectFactory();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    pingjsonpobjectfactory.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse).setContentType("text/html");
    verify(servletoutputstream).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_PYKm0_Pzxo0() {
    PingJSONPObjectFactory pingJSONPObjectFactory = new PingJSONPObjectFactory();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    try {
      when(res.getOutputStream()).thenThrow(new IOException()).thenReturn(out);
      pingJSONPObjectFactory.doGet(req, res);
      verify(out).println(anyString());
    } catch (Exception e) {
      fail("Exception should not be thrown");
    }
  }
}