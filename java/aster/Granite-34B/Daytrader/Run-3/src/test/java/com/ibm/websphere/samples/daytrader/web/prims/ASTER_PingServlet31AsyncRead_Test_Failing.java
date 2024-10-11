/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockServletConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet31AsyncRead_Test_Failing {
  ServletInputStream servletinputstream;
  private static int hitCount;
  HttpServlet httpservlet;
  private static String initTime;
  PingServlet31AsyncRead pingservlet31asyncread;
  HttpServletResponse httpservletresponse;
  HttpServletRequest httpservletrequest;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_xDwE0() {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    String result = servlet.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_1() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingservlet31asyncread = new PingServlet31AsyncRead();
    ServletConfig config = mock(ServletConfig.class);
    when(config.getInitParameter("initTime")).thenReturn("testInitTime");
    when(config.getInitParameter("hitCount")).thenReturn("10");
    pingservlet31asyncread.init(config);
    assertEquals("testInitTime", initTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_2() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingservlet31asyncread = new PingServlet31AsyncRead();
    ServletConfig config = mock(ServletConfig.class);
    when(config.getInitParameter("initTime")).thenReturn("testInitTime");
    when(config.getInitParameter("hitCount")).thenReturn("10");
    pingservlet31asyncread.init(config);
    assertEquals(10, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet_sKVF0_iuUa0() throws ServletException, IOException {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    servlet.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_nEhB0_SROL0_1() throws ServletException {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    ServletConfig config = new MockServletConfig();
    servlet.init(config);
    assertEquals("init", initTime);
    assertEquals(0, 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_nEhB0_SROL0_2() throws ServletException {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    ServletConfig config = new MockServletConfig();
    servlet.init(config);
    assertEquals(0, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_nEhB0_SROL0_1_fid3() throws ServletException {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    ServletConfig config = new MockServletConfig();
    servlet.init(config);
    assertEquals("init", initTime);
  }
}