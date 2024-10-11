/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.jms.ConnectionFactory;
import javax.jms.Topic;
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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2MDBTopic_Test_Passing {
  private static String initTime;
  private static int hitCount;
  PingServlet2MDBTopic pingservlet2mdbtopic;
  HttpServlet httpservlet;
  HttpServletResponse httpservletresponse;
  private ConnectionFactory topicConnectionFactory;
  private Topic tradeStreamerTopic;
  HttpServletRequest httpservletrequest;
  private PingServlet2MDBTopic servlet;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    httpservlet = mock(HttpServlet.class);
    pingservlet2mdbtopic = new PingServlet2MDBTopic();
    HttpServletRequest request = mock(HttpServletRequest.class);
    pingservlet2mdbtopic.doPost(request, httpservletresponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_ekWf1() {
    String expected = "web primitive, configured with trade runtime configs, tests Servlet to Session EJB path";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoCoverage_iJgr2() {
    servlet.getServletInfo();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_GHxO0() throws ServletException, IOException {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullRequest_NivP1() throws ServletException, IOException {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest request = null;
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullResponse_SYPU2() throws ServletException, IOException {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = null;
    servlet.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullRequestAndResponse_vVCq3() throws ServletException, IOException {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest request = null;
    HttpServletResponse response = null;
    servlet.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_VgeC0() {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    try {
      servlet.doGet(request, response);
    } catch (Exception e) {
      fail("An exception was thrown: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_NullRequest_zASb1() {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletResponse response = new MockHttpServletResponse();
    try {
      servlet.doGet(null, response);
    } catch (Exception e) {
      assertTrue(e instanceof NullPointerException);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_NullResponse_pGNW2() {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest request = new MockHttpServletRequest();
    try {
      servlet.doGet(request, null);
    } catch (Exception e) {
      assertTrue(e instanceof NullPointerException);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_IOException_jKeO3() {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    try {
      doAnswer(invocation -> {
        throw new IOException("Mock IOException");
      }).when(response).setContentType("text/html");
      servlet.doGet(request, response);
    } catch (Exception e) {
      assertTrue(e instanceof IOException);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ServletException_wwvK4() {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    try {
      doAnswer(invocation -> {
        throw new ServletException("Mock ServletException");
      }).when(response).setContentType("text/html");
      servlet.doGet(request, response);
    } catch (Exception e) {
      assertTrue(e instanceof ServletException);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_EpsW0_1() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingservlet2mdbtopic = new PingServlet2MDBTopic();
    initTime = new java.util.Date().toString();
    hitCount = 0;
    pingservlet2mdbtopic.init(httpservlet);
    verify(httpservlet, times(1)).init(httpservlet);
    assertEquals(initTime, initTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_EpsW0_2() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingservlet2mdbtopic = new PingServlet2MDBTopic();
    initTime = new java.util.Date().toString();
    hitCount = 0;
    pingservlet2mdbtopic.init(httpservlet);
    verify(httpservlet, times(1)).init(httpservlet);
    assertEquals(hitCount, 0);
  }
}