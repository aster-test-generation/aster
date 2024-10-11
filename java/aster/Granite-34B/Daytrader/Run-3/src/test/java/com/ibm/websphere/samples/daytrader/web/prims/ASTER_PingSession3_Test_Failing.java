/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
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
public class Aster_PingSession3_Test_Failing {
  private static String initTime = null;
  private static int hitCount = 0;
  PingSession3 pingsession3;
  HttpServlet httpservlet;
  @Mock
  HttpServletRequest httpservletrequest;
  @Mock
  HttpServletResponse httpservletresponse;
  @Mock
  HttpSession httpsession;
  private static int NUM_OBJECTS = 2;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_1() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingsession3 = new PingSession3();
    ServletConfig config = mock(ServletConfig.class);
    when(config.getInitParameterNames()).thenReturn(Collections.enumeration(Arrays.asList("initTime", "hitCount")));
    when(config.getInitParameter("initTime")).thenReturn("12:00:00");
    when(config.getInitParameter("hitCount")).thenReturn("100");
    pingsession3.init(config);
    assertEquals("12:00:00", initTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit_2() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingsession3 = new PingSession3();
    ServletConfig config = mock(ServletConfig.class);
    when(config.getInitParameterNames()).thenReturn(Collections.enumeration(Arrays.asList("initTime", "hitCount")));
    when(config.getInitParameter("initTime")).thenReturn("12:00:00");
    when(config.getInitParameter("hitCount")).thenReturn("100");
    pingsession3.init(config);
    assertEquals(100, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost() throws Exception {
    pingsession3 = new PingSession3();
    Mockito.when(httpservletrequest.getSession(anyBoolean())).thenReturn(httpsession);
    pingsession3.doPost(httpservletrequest, httpservletresponse);
    Mockito.verify(httpservletrequest, Mockito.times(1)).getSession(anyBoolean());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet() throws Exception {
    initTime = "sometime";
    NUM_OBJECTS = 2;
    hitCount = 0;
    pingsession3 = new PingSession3();
    httpservlet = mock(HttpServlet.class);
    httpservletresponse = mock(HttpServletResponse.class);
    httpservletrequest = mock(HttpServletRequest.class);
    httpsession = mock(HttpSession.class);
    when(httpservletrequest.getSession(anyBoolean())).thenReturn(httpsession);
    when(httpservletrequest.getParameter("num_objects")).thenReturn(String.valueOf(NUM_OBJECTS));
    PingSession3Object[] sessionData = new PingSession3Object[NUM_OBJECTS];
    for (int i = 0; i < NUM_OBJECTS; i++) {
      sessionData[i] = new PingSession3Object();
    }
    when(httpsession.getAttribute("sessiontest.sessionData")).thenReturn(sessionData);
    when(httpsession.getAttribute("hitCount")).thenReturn(hitCount);
    when(httpsession.getAttribute("initTime")).thenReturn(initTime);
    pingsession3.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletrequest, times(1)).getSession(anyBoolean());
    verify(httpservletrequest, times(1)).getParameter("num_objects");
    verify(httpsession, times(1)).setAttribute("sessiontest.sessionData", sessionData);
    verify(httpsession, times(1)).setAttribute("hitCount", hitCount + 1);
    verify(httpsession, times(1)).setAttribute("initTime", initTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_SPRu0() {
    PingSession3 servlet = new PingSession3();
    String result = servlet.getServletInfo();
    assertEquals("HTTP Session Object: Tests management of a large custom session class", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithNullConfig_ujyx1() {
    PingSession3 session = new PingSession3();
    try {
      session.init(null);
      fail("Expected ServletException");
    } catch (ServletException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_xlVy0() throws ServletException, IOException {
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    PingSession3 pingSession = new PingSession3();
    pingSession.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithSession_dUZk1() throws ServletException, IOException {
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    HttpSession session = request.getSession();
    PingSession3 pingSession = new PingSession3();
    pingSession.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_DjCX2() throws ServletException, IOException {
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    PingSession3 pingSession = new PingSession3();
    try {
      pingSession.doGet(request, response);
      fail("Should have thrown an exception");
    } catch (Exception e) {
      assertTrue(true);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithSessionData_zOzP3() throws ServletException, IOException {
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    HttpSession session = request.getSession();
    PingSession3 pingSession = new PingSession3();
    PingSession3Object[] sessionData = new PingSession3Object[10];
    session.setAttribute("sessiontest.sessionData", sessionData);
    pingSession.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithOutputBuffer_LvSE4() throws ServletException, IOException {
    HttpServletRequest request = new MockHttpServletRequest();
    HttpServletResponse response = new MockHttpServletResponse();
    HttpSession session = request.getSession();
    PingSession3 pingSession = new PingSession3();
    StringBuffer outputBuffer = new StringBuffer();
    outputBuffer.append("<html><head><title>Session Large Data Test</title></head><body><HR><BR><FONT size=\"+2\" color=\"#000066\">HTTP Session Test 3: Large Data<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time: ").append(initTime).append("</FONT><BR><BR>");
    pingSession.doGet(request, response);
    assertNotNull(outputBuffer);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullRequestAndResponse_kkUS4() throws ServletException, IOException {
    PingSession3 pingSession = new PingSession3();
    HttpServletRequest request = null;
    HttpServletResponse response = null;
    try {
      pingSession.doPost(request, response);
      fail("Expected ServletException");
    } catch (ServletException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullRequest_IJRQ2_ySZz0() throws ServletException, IOException {
    PingSession3 pingSession = new PingSession3();
    HttpServletRequest request = null;
    HttpServletResponse response = mock(HttpServletResponse.class);
    doNothing().when(response).sendError(Mockito.anyInt(), Mockito.anyString());
    pingSession.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullResponse_unzf3_hqVr0() throws ServletException, IOException {
    PingSession3 pingSession = new PingSession3();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = null;
    try {
      pingSession.doPost(request, response);
      fail("Expected ServletException");
    } catch (ServletException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_Itgp0_BAqU0() throws ServletException, IOException {
    PingSession3 pingSession = new PingSession3();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    pingSession.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost_fid1() throws Exception {
    pingsession3 = new PingSession3();
    Mockito.when(httpservletrequest.getSession(any())).thenReturn(httpsession);
    pingsession3.doPost(httpservletrequest, httpservletresponse);
    Mockito.verify(httpservletrequest, Mockito.times(1)).getSession(any());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingsession3 = new PingSession3();
    ServletConfig config = mock(ServletConfig.class);
    when(config.getInitParameterNames()).thenReturn(Collections.enumeration(Arrays.asList("initTime", "hitCount")));
    when(config.getInitParameter("initTime")).thenReturn("12:00:00");
    when(config.getInitParameter("hitCount")).thenReturn("100");
    pingsession3.init(config);
    assertEquals("12:00:00", initTime);
    assertEquals(100, hitCount);
  }
}