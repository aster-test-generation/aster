/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonReaderFactory;
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
public class Aster_PingJSONPObjectFactory_Test_Passing {
  private static int hitCount;
  private static String initTime;
  private static JsonBuilderFactory jSONObjectFactory = Json.createBuilderFactory(null);
  private static JsonReaderFactory jSONReaderFactory = Json.createReaderFactory(null);
  private PingJSONPObjectFactory factory;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_rBqX0() {
    factory = new PingJSONPObjectFactory();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_wgfA1() {
    String expected = "Basic JSON generation and parsing in a servlet";
    String actual = factory.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_VySD0() throws ServletException, IOException {
    PingJSONPObjectFactory pingJSONPObjectFactory = new PingJSONPObjectFactory();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    when(req.getParameter("initTime")).thenReturn("1234567890");
    when(req.getParameter("hitCount")).thenReturn("1");
    pingJSONPObjectFactory.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(out).println("<html><head><title>Ping JSONP</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping JSONP</FONT><BR>Generated JSON: {\"initTime\":1234567890,\"hitCount\":1}</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_qPki0_rlRc0() throws ServletException, IOException {
    PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    factory.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("application/json");
    verify(res).setCharacterEncoding("UTF-8");
    verify(res).getWriter();
    verify(res).flushBuffer();
    verify(res).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void tearDown_TWhZ2() {
  }
}