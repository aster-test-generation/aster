/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2ServletRcv_Test_Failing {
  private static String initTime = null;
  HttpServlet httpservlet;
  PingServlet2ServletRcv pingservlet2servletrcv;
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;
  @Mock
  private PingBean ab;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_KmwP0() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidRequest_tsuG1() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("POST");
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidResponse_vrnS2() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getWriter()).thenThrow(new IOException());
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithValidRequestAndResponse_WgvO3() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("POST");
    when(res.getWriter()).thenReturn(mock(PrintWriter.class));
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithValidRequestAndResponseAndContentType_zGjV4() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("POST");
    when(res.getWriter()).thenReturn(mock(PrintWriter.class));
    when(res.getContentType()).thenReturn("text/html");
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithValidRequestAndResponseAndContentTypeAndCharacterEncoding_mVee5() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("POST");
    when(res.getWriter()).thenReturn(mock(PrintWriter.class));
    when(res.getContentType()).thenReturn("text/html");
    when(res.getCharacterEncoding()).thenReturn("UTF-8");
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_efJI0() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    servlet.doGet(request, response);
    Mockito.verify(response).setContentType("text/html");
    Mockito.verify(response).getWriter();
    Mockito.verify(ab).getMsg();
    assertEquals("Ping Servlet2Servlet", response.getHeader("title"));
    assertEquals("PingServlet2Servlet:", response.getHeader("init time"));
    assertEquals("Message from Servlet: ", response.getHeader("message from servlet"));
    assertEquals("", response.getHeader("body"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_LWSJ1() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    Mockito.when(request.getAttribute("ab")).thenThrow(new ServletException("Test exception"));
    servlet.doGet(request, response);
    Mockito.verify(response).sendError(500, "PingServlet2ServletRcv.doGet(...): general exception");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingservlet2servletrcv = new PingServlet2ServletRcv();
    ServletConfig servletConfig = mock(ServletConfig.class);
    pingservlet2servletrcv.init(servletConfig);
    assertEquals(initTime, new java.util.Date().toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidRequest_tsuG1_fid1() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("POST");
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_efJI0_1() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    servlet.doGet(request, response);
    Mockito.verify(response).setContentType("text/html");
    Mockito.verify(response).getWriter();
    Mockito.verify(ab).getMsg();
    assertEquals("Ping Servlet2Servlet", response.getHeader("title"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_efJI0_2() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    servlet.doGet(request, response);
    Mockito.verify(response).setContentType("text/html");
    Mockito.verify(response).getWriter();
    Mockito.verify(ab).getMsg();
    assertEquals("PingServlet2Servlet:", response.getHeader("init time"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_efJI0_3() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    servlet.doGet(request, response);
    Mockito.verify(response).setContentType("text/html");
    Mockito.verify(response).getWriter();
    Mockito.verify(ab).getMsg();
    assertEquals("Message from Servlet: ", response.getHeader("message from servlet"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_efJI0_4() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    servlet.doGet(request, response);
    Mockito.verify(response).setContentType("text/html");
    Mockito.verify(response).getWriter();
    Mockito.verify(ab).getMsg();
    assertEquals("", response.getHeader("body"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_TIIq0() throws Exception {
    PingServlet2ServletRcv pingservlet2servletrcv = new PingServlet2ServletRcv();
    ServletConfig servletConfig = mock(ServletConfig.class);
    pingservlet2servletrcv.init(servletConfig);
    assertEquals(new java.util.Date().toString(), initTime);
  }
}