/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
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
public class Aster_PingServlet2ServletRcv_Test_Failing {
  private static String initTime = null;
  PingServlet2ServletRcv pingservlet2servletrcv;
  HttpServlet httpservlet;
  HttpServletRequest httpservletrequest;
  HttpServletResponse httpservletresponse;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet() throws Exception {
    httpservlet = mock(HttpServlet.class);
    httpservletrequest = mock(HttpServletRequest.class);
    httpservletresponse = mock(HttpServletResponse.class);
    pingservlet2servletrcv = new PingServlet2ServletRcv();
    PingBean ab = mock(PingBean.class);
    when(httpservletrequest.getAttribute("ab")).thenReturn(ab);
    when(ab.getMsg()).thenReturn("Hello World!");
    pingservlet2servletrcv.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse).setContentType("text/html");
    verify(httpservletresponse).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_ZGyT0_wJOj0() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).getOutputStream();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_withNameParameter_CUkL1_SNdZ0() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("name")).thenReturn("John Doe");
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).getOutputStream();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_withInvalidNameParameter_aQLb2_WJbW0() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("name")).thenReturn("");
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getOutputStream();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_withNullNameParameter_EeUP3_ZxuU0() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("name")).thenReturn(null);
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getOutputStream();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_withInvalidRequest_IvIo4_qVjv0() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("name")).thenThrow(new ServletException());
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(res).getOutputStream();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet_f_DDKP0_1() throws Exception {
    // httpservlet = mock(HttpServlet.class); // Removed
    httpservletrequest = mock(HttpServletRequest.class);
    httpservletresponse = mock(HttpServletResponse.class);
    pingservlet2servletrcv = new PingServlet2ServletRcv();
    PingBean ab = new PingBean();
    ab.setMsg("Hello World!");
    httpservletrequest.setAttribute("ab", ab);
    pingservlet2servletrcv.doGet(httpservletrequest, httpservletresponse);
    assertEquals("text/html", httpservletresponse.getContentType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet_f_DDKP0_2() throws Exception {
    httpservlet = mock(HttpServlet.class);
    httpservletrequest = mock(HttpServletRequest.class);
    httpservletresponse = mock(HttpServletResponse.class);
    pingservlet2servletrcv = new PingServlet2ServletRcv();
    PingBean ab = new PingBean();
    ab.setMsg("Hello World!");
    httpservletrequest.setAttribute("ab", ab);
    pingservlet2servletrcv.doGet(httpservletrequest, httpservletresponse);
    assertNotNull(httpservletresponse.getWriter());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet_f_DDKP0_1_fid2() throws Exception {
    httpservlet = mock(HttpServlet.class);
    httpservletrequest = mock(HttpServletRequest.class);
    httpservletresponse = mock(HttpServletResponse.class);
    pingservlet2servletrcv = new PingServlet2ServletRcv();
    PingBean ab = new PingBean();
    ab.setMsg("Hello World!");
    httpservletrequest.setAttribute("ab", ab);
    pingservlet2servletrcv.doGet(httpservletrequest, httpservletresponse);
    assertEquals("text/html", httpservletresponse.getContentType());
  }
}