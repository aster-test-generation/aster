/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet_Test_Failing {
  private static int hitCount;
  private static String initTime;
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_bRxD0() {
    PingServlet servlet = new PingServlet();
    String expected = "Basic dynamic HTML generation through a servlet";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_yNYb0_1() throws Exception {
    PingServlet pingServlet = new PingServlet();
    pingServlet.doGet(request, response);
    assertEquals("text/html", response.getContentType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_yNYb0_2() throws Exception {
    PingServlet pingServlet = new PingServlet();
    pingServlet.doGet(request, response);
    assertEquals(200, response.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_yNYb0_3() throws Exception {
    PingServlet pingServlet = new PingServlet();
    pingServlet.doGet(request, response);
    assertEquals("Ping Servlet", response.getHeader("title"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_yNYb0_4() throws Exception {
    PingServlet pingServlet = new PingServlet();
    pingServlet.doGet(request, response);
    assertEquals("Init time : " + initTime, response.getHeader("Init time"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_yNYb0_5() throws Exception {
    PingServlet pingServlet = new PingServlet();
    pingServlet.doGet(request, response);
    assertEquals("Hit Count: " + hitCount, response.getHeader("Hit Count"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_HIeD0_pduy0() throws ServletException, IOException {
    PingServlet servlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
    verify(res).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithContentType_vcOz1_iPTf0() throws ServletException, IOException {
    PingServlet servlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getContentType()).thenReturn("application/json");
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("application/json");
    verify(res).getWriter();
    verify(res).flushBuffer();
    verify(res).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithContentLength_UuMg2_dNai0() throws ServletException, IOException {
    PingServlet servlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getContentLength()).thenReturn(100);
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
    verify(res).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithContentTypeAndContentLength_IPuz3_NhnI0() throws ServletException, IOException {
    PingServlet servlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getContentType()).thenReturn("application/json");
    when(req.getContentLength()).thenReturn(100);
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("application/json");
    verify(res).getWriter();
    verify(res).flushBuffer();
    verify(res).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithError_YNMD4_AyYR0() throws ServletException, IOException {
    PingServlet servlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenThrow(new IOException());
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(res).setContentType("text/plain");
    verify(res).getWriter();
    verify(res).flushBuffer();
    verify(res).getOutputStream();
  }
}