/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import com.ibm.websphere.samples.daytrader.util.Log;
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
  private PingSession1 pingSession1;
  private ServletConfig servletConfig;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_zYHH0() {
    PingSession1 pingSession1 = new PingSession1();
    String expected = "HTTP Session Key: Tests management of a read only unique id";
    String actual = pingSession1.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_PrintHitCount_qBQf1() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter out = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(out);
    pingSession1.doGet(request, response);
    verify(out).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_CatchException_JKJi2() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    doThrow(new Exception()).when(request).getSession(true);
    pingSession1.doGet(request, response);
    verify(response).sendError(500, anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SessionNull_yqRj4() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getSession(true)).thenReturn(null);
    pingSession1.doGet(request, response);
    verify(response).sendError(500, anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SessionGetAttribute_pxbK5() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(1);
    pingSession1.doGet(request, response);
    verify(session).getAttribute("sessiontest.counter");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SessionSetAttribute_oicE6() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(null);
    pingSession1.doGet(request, response);
    verify(session).setAttribute("sessiontest.counter", any(Integer.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SessionID_DAtJ7() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(1);
    pingSession1.doGet(request, response);
    verify(response).setHeader("SessionKeyTest-SessionID", anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_HttpSession_ugtB9() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    pingSession1.doGet(request, response);
    verify(session).getAttribute("sessiontest.counter");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_LogError_FNgz3_EKtl0() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    Log log = mock(Log.class);
    doThrow(new Exception()).when(request).getSession(true);
    pingSession1.doGet(request, response);
    verify(log).error(any(Exception.class), eq("PingSession1.doGet(...): error getting session"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_Xshu0_KNBv0() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(req.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(null);
    pingSession1.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).setHeader("SessionKeyTest-SessionID", "SessionID:0");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_Xshu0_KNBv0_fid1() throws ServletException, IOException {
    com.ibm.websphere.samples.daytrader.web.prims.PingSession1 pingSession1 = new com.ibm.websphere.samples.daytrader.web.prims.PingSession1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(req.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(null);
    pingSession1.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).setHeader("Set-Cookie", "JSESSIONID=SessionID:0");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_BIwH0() throws javax.servlet.ServletException {
    pingSession1 = new PingSession1();
    servletConfig = mock(ServletConfig.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_SuperInitCalled_WfHq1() throws ServletException {
    pingSession1.init(servletConfig);
  }
}