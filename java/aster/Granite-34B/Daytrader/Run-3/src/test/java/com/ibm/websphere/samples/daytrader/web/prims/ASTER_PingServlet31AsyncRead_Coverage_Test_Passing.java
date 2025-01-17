/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_PingServlet31AsyncRead_Coverage_Test_Passing {
  private PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_YzWp0() {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    String result = servlet.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSuperInit_FbFu0() throws javax.servlet.ServletException {
    servlet.init(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testClose_KQPZ3() throws javax.servlet.ServletException {
    servlet.init(null);
    servlet.destroy();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_pHGz0() throws ServletException, IOException {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_GluA1() throws ServletException, IOException {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test2_afqJ1() throws ServletException, IOException {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    servlet.doPost(request, response);
    AsyncContext ac = request.startAsync();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test3_yoUE2() throws ServletException, IOException {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    servlet.doPost(request, response);
    ServletInputStream input = request.getInputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test6_SfxL5() throws ServletException, IOException {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    servlet.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_ZBPO0_KZLg0() throws ServletException, IOException {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    servlet.doGet(request, response);
    Assertions.assertEquals(response.getContentType(), "text/html");
  }
}