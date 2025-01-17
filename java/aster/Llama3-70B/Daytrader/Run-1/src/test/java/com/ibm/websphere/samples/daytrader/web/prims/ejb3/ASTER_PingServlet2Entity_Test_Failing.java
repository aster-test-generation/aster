/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
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
public class Aster_PingServlet2Entity_Test_Failing {
  private static int expectedHitCount;
  private static String expectedInitTime;
  PingServlet2Entity pingservlet2entity;
  ServletConfig servletConfig;
  HttpServletResponse httpservletresponse;
  HttpServletRequest httpservletrequest;
  private static String initTime = "initTime";
  private static int hitCount = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    httpservletrequest = mock(HttpServletRequest.class);
    pingservlet2entity = new PingServlet2Entity();
    pingservlet2entity.doPost(httpservletrequest, httpservletresponse);
    verify(pingservlet2entity).doGet(httpservletrequest, httpservletresponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_wYKA0() throws ServletException, IOException {
    PingServlet2Entity pingServlet2Entity = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("GET");
    pingServlet2Entity.doGet(req, res);
    verify(res, times(1)).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_wYKA0_fid1() throws ServletException, IOException {
    PingServlet2Entity pingServlet2Entity = new PingServlet2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet2Entity.doPost(req, res);
    verify(req, times(1)).getMethod();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_PRXr0_fid1() {
    PingServlet2Entity pingServlet2Entity = new PingServlet2Entity();
    String result = pingServlet2Entity.getServletInfo();
    assertEquals("web primitive, tests Servlet to Entity EJB path", result);
  }
}