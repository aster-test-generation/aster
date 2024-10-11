/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.io.PrintWriter;
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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingSession2_Test_Failing {
  private static int hitCount;
  private static String initTime;
  PingSession2 pingsession2;
  ServletConfig servletConfig;
  HttpServlet httpservlet;
  HttpServletRequest httpservletrequest;
  HttpSession httpsession;
  HttpServletResponse httpservletresponse;
  PrintWriter printWriter;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost() throws Exception {
    httpservletrequest = mock(HttpServletRequest.class);
    httpsession = mock(HttpSession.class);
    httpservletresponse = mock(HttpServletResponse.class);
    httpservlet = mock(HttpServlet.class);
    pingsession2 = new PingSession2();
    when(httpservletrequest.getSession(any())).thenReturn(httpsession);
    pingsession2.doPost(httpservletrequest, httpservletresponse);
    verify(pingsession2).doGet(httpservletrequest, httpservletresponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_XjjI0() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingSession2.doPost(req, res);
    verify(req, times(1)).getAttribute(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_LjNn0() {
    PingSession2 pingSession2 = new PingSession2();
    String result = pingSession2.getServletInfo();
    assertEquals("HTTP Session Key: Tests management of a read/write unique id", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet() throws Exception {
    httpservletrequest = mock(HttpServletRequest.class);
    httpsession = mock(HttpSession.class);
    httpservletresponse = mock(HttpServletResponse.class);
    httpservlet = mock(HttpServlet.class);
    printWriter = mock(PrintWriter.class);
    pingsession2 = new PingSession2();
    when(httpservletrequest.getSession(anyBoolean())).thenReturn(httpsession);
    when(httpsession.getAttribute("sessiontest.counter")).thenReturn(null);
    when(httpservletresponse.getWriter()).thenReturn(printWriter);
    pingsession2.doGet(httpservletrequest, httpservletresponse);
    verify(httpsession).setAttribute("sessiontest.counter", 1);
    verify(httpservletresponse).setContentType("text/html");
    verify(httpservletresponse).setHeader("SessionTrackingTest-counter", "1");
    verify(printWriter).println(anyString());
    assertEquals(1, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet_SessionAlreadyExists() throws Exception {
    httpservletrequest = mock(HttpServletRequest.class);
    httpsession = mock(HttpSession.class);
    httpservletresponse = mock(HttpServletResponse.class);
    httpservlet = mock(HttpServlet.class);
    printWriter = mock(PrintWriter.class);
    pingsession2 = new PingSession2();
    when(httpservletrequest.getSession(anyBoolean())).thenReturn(httpsession);
    when(httpsession.getAttribute("sessiontest.counter")).thenReturn(2);
    when(httpservletresponse.getWriter()).thenReturn(printWriter);
    pingsession2.doGet(httpservletrequest, httpservletresponse);
    verify(httpsession).setAttribute("sessiontest.counter", 3);
    verify(httpservletresponse).setContentType("text/html");
    verify(httpservletresponse).setHeader("SessionTrackingTest-counter", "3");
    verify(printWriter).println(anyString());
    assertEquals(1, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet_SessionInvalidation() throws Exception {
    httpservletrequest = mock(HttpServletRequest.class);
    httpsession = mock(HttpSession.class);
    httpservletresponse = mock(HttpServletResponse.class);
    httpservlet = mock(HttpServlet.class);
    printWriter = mock(PrintWriter.class);
    pingsession2 = new PingSession2();
    when(httpservletrequest.getSession(anyBoolean())).thenReturn(httpsession);
    when(httpsession.getAttribute("sessiontest.counter")).thenReturn(5);
    when(httpservletresponse.getWriter()).thenReturn(printWriter);
    pingsession2.doGet(httpservletrequest, httpservletresponse);
    verify(httpsession).invalidate();
    verify(httpservletresponse).setContentType("text/html");
    verify(httpservletresponse).setHeader("SessionTrackingTest-counter", "5");
    verify(printWriter).println(anyString());
    assertEquals(1, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SessionCreated_Uyma0() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getSession(true)).thenReturn(mock(HttpSession.class));
    pingSession2.doGet(request, response);
    verify(response).setContentType("text/html");
    verify(response).setHeader("SessionTrackingTest-counter", "1");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SessionIncremented_eEvW1() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(2);
    pingSession2.doGet(request, response);
    verify(response).setContentType("text/html");
    verify(response).setHeader("SessionTrackingTest-counter", "3");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SessionInvalidated_Wnqr2() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(5);
    pingSession2.doGet(request, response);
    verify(session).invalidate();
    verify(response).sendError(500, "PingSession2.doGet(...): error. ");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_XjjI0_fid1() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getSession(true)).thenReturn(mock(HttpSession.class));
    pingSession2.doGet(req, res);
    verify(req, times(1)).getSession(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_LjNn0_fid1() {
    PingSession2 pingSession2 = new PingSession2();
    String result = pingSession2.getServletInfo();
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SessionCreated_Uyma0_fid1() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(null);
    pingSession2.doGet(request, response);
    verify(response).setContentType("text/html");
    verify(response).setHeader("SessionTrackingTest-counter", "1");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SessionIncremented_eEvW1_fid1() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(2);
    pingSession2.doGet(request, response);
    verify(response).setContentType("text/html");
    verify(response).setHeader("SessionTrackingTest-counter", "3");
    verify(response, times(1)).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SessionInvalidated_Wnqr2_fid1() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(5);
    pingSession2.doGet(request, response);
    verify(session).invalidate();
    verify(response, never()).sendError(500, "PingSession2.doGet(...): error. ");
  }
}