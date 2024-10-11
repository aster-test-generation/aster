/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.persistence.EntityManager;
import javax.servlet.ServletConfig;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Entity_Test_Failing {
  private static int hitCount;
  private static String initTime;
  PingServlet2Entity pingservlet2entity;
  HttpServlet httpservlet;
  private EntityManager em;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_1() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingservlet2entity = new PingServlet2Entity();
    httpservlet = mock(HttpServlet.class);
    pingservlet2entity = new PingServlet2Entity();
    httpservlet = mock(HttpServlet.class);
    pingservlet2entity = new PingServlet2Entity();
    httpservlet = mock(HttpServlet.class);
    pingservlet2entity = new PingServlet2Entity();
    ServletConfig servletConfig = mock(ServletConfig.class);
    pingservlet2entity.init(servletConfig);
    assertEquals(0, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_2() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingservlet2entity = new PingServlet2Entity();
    httpservlet = mock(HttpServlet.class);
    pingservlet2entity = new PingServlet2Entity();
    httpservlet = mock(HttpServlet.class);
    pingservlet2entity = new PingServlet2Entity();
    httpservlet = mock(HttpServlet.class);
    pingservlet2entity = new PingServlet2Entity();
    ServletConfig servletConfig = mock(ServletConfig.class);
    pingservlet2entity.init(servletConfig);
    assertNotNull(initTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_KxXU0() throws ServletException, IOException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNameParameter_ANje1() throws ServletException, IOException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("name")).thenReturn("John Doe");
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidNameParameter_xtOT2() throws ServletException, IOException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("name")).thenReturn("");
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullNameParameter_qWps3() throws ServletException, IOException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("name")).thenReturn(null);
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidRequest_MVPK4() throws ServletException, IOException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("name")).thenThrow(new ServletException());
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidResponse_dfcQ5() throws ServletException, IOException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getWriter()).thenThrow(new IOException());
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_tlAT0() {
    PingServlet2Entity servlet = new PingServlet2Entity();
    String result = servlet.getServletInfo();
    assertEquals("web primitive, tests Servlet to Entity EJB path", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNullServlet_YomP5() {
    PingServlet2Entity servlet = new PingServlet2Entity();
    String result = servlet.getServletInfo();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_hcwC0() throws IOException, ServletException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).sendError(500, "PingServlet2Entity.doGet(...): error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_KBxa1() throws IOException, ServletException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getWriter()).thenThrow(new IOException());
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).sendError(500, "PingServlet2Entity.doGet(...): error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNullResponse_Tekd3() throws IOException, ServletException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(req).getParameter("symbol");
    verify(req).getParameter("iterations");
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).sendError(500, "PingServlet2Entity.doGet(...): error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithInvalidSymbol_aqyb4() throws IOException, ServletException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("symbol")).thenReturn("INVALID_SYMBOL");
    servlet.doGet(req, res);
    verify(req).getParameter("symbol");
    verify(req).getParameter("iterations");
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).sendError(500, "PingServlet2Entity.doGet(...): error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithInvalidIterations_Rczw5() throws IOException, ServletException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("iterations")).thenReturn("INVALID_ITERATIONS");
    servlet.doGet(req, res);
    verify(req).getParameter("symbol");
    verify(req).getParameter("iterations");
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).sendError(500, "PingServlet2Entity.doGet(...): error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingservlet2entity = new PingServlet2Entity();
    httpservlet = mock(HttpServlet.class);
    pingservlet2entity = new PingServlet2Entity();
    httpservlet = mock(HttpServlet.class);
    pingservlet2entity = new PingServlet2Entity();
    httpservlet = mock(HttpServlet.class);
    pingservlet2entity = new PingServlet2Entity();
    ServletConfig servletConfig = mock(ServletConfig.class);
    pingservlet2entity.init(servletConfig);
    assertEquals(0, hitCount);
    assertNotNull(initTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNullServlet_YomP5_fid1() {
    PingServlet2Entity servlet = null;
    String result = servlet.getServletInfo();
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNullRequest_pxfp2_fid1() throws IOException, ServletException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = null;
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).sendError(500, "PingServlet2Entity.doGet(...): error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithNullResponse_Tekd3_fid1() throws IOException, ServletException {
    PingServlet2Entity servlet = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = null;
    servlet.doGet(req, res);
    verify(req).getParameter("symbol");
    verify(req).getParameter("iterations");
    verify(res).setContentType("text/html");
    verify(res).getWriter();
    verify(res).sendError(500, "PingServlet2Entity.doGet(...): error");
  }
}