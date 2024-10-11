/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingSession1_Coverage_Test_Failing {
  private ServletConfig config;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_RmWR0() {
    PingSession1 session = new PingSession1();
    String expected = "HTTP Session Key: Tests management of a read only unique id";
    String actual = session.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_FEXq0() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingSession1.doPost(req, res);
    verify(pingSession1).doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_hitCount_kfiu0() throws Exception {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    Integer ival = new Integer(1);
    when(session.getAttribute("sessiontest.counter")).thenReturn(ival);
    PrintWriter out = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(out);
    pingSession1.doGet(request, response);
    verify(out).println("<B>Hit Count: " + 1 + "<BR>Your HTTP Session key is " + "SessionID:" + ival.toString() + "</B></body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_exception_hkwb1() throws Exception {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenThrow(new RuntimeException("error"));
    PrintWriter out = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(out);
    pingSession1.doGet(request, response);
    verify(response).sendError(500, "PingSession1.doGet(...): error. java.lang.RuntimeException: error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_sessionNull_EPTX2() throws Exception {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getSession(true)).thenReturn(null);
    PrintWriter out = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(out);
    pingSession1.doGet(request, response);
    verify(response).sendError(500, "PingSession1.doGet(...): error getting session");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_sessionAttributeNull_NcxW3() throws Exception {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(null);
    PrintWriter out = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(out);
    pingSession1.doGet(request, response);
    verify(out).println("<B>Hit Count: " + 1 + "<BR>Your HTTP Session key is " + "SessionID:" + 1 + "</B></body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithException_uiYF1() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    doThrow(new ServletException()).when(pingSession1).doGet(req, res);
    pingSession1.doPost(req, res);
    verify(pingSession1).doGet(req, res);
  }
}