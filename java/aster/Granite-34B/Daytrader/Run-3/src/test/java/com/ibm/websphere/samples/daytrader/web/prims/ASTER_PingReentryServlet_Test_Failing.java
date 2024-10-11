/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
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
public class Aster_PingReentryServlet_Test_Failing {
  PingReentryServlet pingreentryservlet;
  ServletConfig servletconfig;
  HttpServletResponse httpservletresponse;
  ServletOutputStream servletoutputstream;
  HttpServletRequest httpservletrequest;
  HttpServlet httpservlet;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit() throws Exception {
    servletconfig = mock(ServletConfig.class);
    pingreentryservlet = new PingReentryServlet();
    // Mock the behavior of the super.init() method
    doCallRealMethod().when(pingreentryservlet).init(servletconfig);
    // Call the init method to be tested
    pingreentryservlet.init(servletconfig);
    // Add meaningful assertions here
    // For example:
    verify(servletconfig, times(1)).getInitParameterNames();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet() throws Exception {
    httpservlet = mock(HttpServlet.class);
    httpservletresponse = mock(HttpServletResponse.class);
    servletoutputstream = mock(ServletOutputStream.class);
    httpservletrequest = mock(HttpServletRequest.class);
    pingreentryservlet = new PingReentryServlet();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    when(httpservletrequest.getParameter("numReentries")).thenReturn("10");
    when(httpservletrequest.getParameter("sleep")).thenReturn("5000");
    when(httpservletrequest.getServerName()).thenReturn("localhost");
    when(httpservletrequest.getServerPort()).thenReturn(8080);
    when(httpservletrequest.getContextPath()).thenReturn("/context");
    when(httpservletresponse.getContentType()).thenReturn("text/html");
    pingreentryservlet.doGet(httpservletrequest, httpservletresponse);
    verify(servletoutputstream).println(anyInt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_YavK0() throws ServletException {
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.init(null);
    assertTrue(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullRequestAndResponse_UbyF3() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest request = null;
    HttpServletResponse response = null;
    servlet.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getServletInfo_fqCU0() {
    PingReentryServlet servlet = new PingReentryServlet();
    String result = servlet.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getServletInfo_null_BuFF2() {
    PingReentryServlet servlet = new PingReentryServlet();
    String result = servlet.getServletInfo();
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getServletInfo_empty_AeDk3() {
    PingReentryServlet servlet = new PingReentryServlet();
    String result = servlet.getServletInfo();
    assertEquals("", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithZeroReentriesAndZeroSleep_anmc0() throws Exception {
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getParameter("numReentries")).thenReturn("0");
    when(request.getParameter("sleep")).thenReturn("0");
    when(request.getContextPath()).thenReturn("");
    HttpServletResponse response = mock(HttpServletResponse.class);
    ServletOutputStream output = mock(ServletOutputStream.class);
    when(response.getOutputStream()).thenReturn(output);
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.doGet(request, response);
    verify(request, times(1)).getParameter("numReentries");
    verify(request, times(1)).getParameter("sleep");
    verify(request, times(1)).getContextPath();
    verify(response, times(1)).setContentType("text/html");
    verify(response, times(1)).getOutputStream();
    verify(output, times(1)).println(0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithZeroReentriesAndNonZeroSleep_fZSr2() throws Exception {
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getParameter("numReentries")).thenReturn("0");
    when(request.getParameter("sleep")).thenReturn("5000");
    when(request.getContextPath()).thenReturn("");
    HttpServletResponse response = mock(HttpServletResponse.class);
    ServletOutputStream output = mock(ServletOutputStream.class);
    when(response.getOutputStream()).thenReturn(output);
    PingReentryServlet servlet = new PingReentryServlet();
    servlet.doGet(request, response);
    verify(request, times(1)).getParameter("numReentries");
    verify(request, times(1)).getParameter("sleep");
    verify(request, times(1)).getContextPath();
    verify(response, times(1)).setContentType("text/html");
    verify(response, times(1)).getOutputStream();
    verify(output, times(1)).println(0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullRequest_AZzF1_cHur0() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest request = null;
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullResponse_GYcL2_KDZe0() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = null;
    servlet.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_lWIO0_GcNp0() throws ServletException, IOException {
    PingReentryServlet servlet = new PingReentryServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost_fid2() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    servletoutputstream = mock(ServletOutputStream.class);
    httpservletrequest = mock(HttpServletRequest.class);
    httpservlet = mock(HttpServlet.class);
    pingreentryservlet = new PingReentryServlet();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    pingreentryservlet.doPost(httpservletrequest, httpservletresponse);
    verify(httpservletresponse, times(1)).getOutputStream();
    verify(servletoutputstream, times(1)).println("Pong");
  }
}