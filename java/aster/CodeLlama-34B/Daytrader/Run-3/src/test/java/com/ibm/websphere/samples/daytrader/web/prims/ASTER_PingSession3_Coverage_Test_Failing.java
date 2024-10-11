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

public class Aster_PingSession3_Coverage_Test_Failing {
  private ServletConfig config;
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_bodL0() {
    PingSession3 session = new PingSession3();
    String expected = "HTTP Session Object: Tests management of a large custom session class";
    String actual = session.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_num_objects_tzpQ0_baTX0() throws javax.servlet.ServletException, java.io.IOException {
    PingSession3 pingSession3 = new PingSession3();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter out = mock(PrintWriter.class);
    StringBuffer outputBuffer = new StringBuffer();
    HttpSession session = mock(HttpSession.class);
    PingSession3Object[] sessionData = new PingSession3Object[10];
    when(request.getParameter("num_objects")).thenReturn("10");
    when(request.getSession(true)).thenReturn(session);
    when(response.getWriter()).thenReturn(out);
    when(session.getAttribute("sessiontest.sessionData")).thenReturn(sessionData);
    pingSession3.doGet(request, response);
    verify(out).print("<html><head> Session object size set to 10K bytes </head><body></body></html>");
    verify(session).invalidate();
    verify(out).close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_num_objects_invalid_lENB1_hVeH0() throws javax.servlet.ServletException, java.io.IOException {
    PingSession3 pingSession3 = new PingSession3();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter out = mock(PrintWriter.class);
    StringBuffer outputBuffer = new StringBuffer();
    HttpSession session = mock(HttpSession.class);
    when(request.getParameter("num_objects")).thenReturn("invalid");
    when(request.getSession(true)).thenReturn(session);
    when(response.getWriter()).thenReturn(out);
    pingSession3.doGet(request, response);
    verify(out).print("<html><head> Session object size set to 10K bytes </head><body></body></html>");
    verify(session, never()).invalidate();
    verify(out, never()).close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_num_objects_exception_sTFz2_PgII0() throws javax.servlet.ServletException, java.io.IOException {
    PingSession3 pingSession3 = new PingSession3();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter out = mock(PrintWriter.class);
    StringBuffer outputBuffer = new StringBuffer();
    HttpSession session = mock(HttpSession.class);
    when(request.getParameter("num_objects")).thenThrow(new NumberFormatException());
    when(request.getSession(true)).thenReturn(session);
    when(response.getWriter()).thenReturn(out);
    pingSession3.doGet(request, response);
    verify(out).print("<html><head> Session object size set to 10K bytes </head><body></body></html>");
    verify(session, never()).invalidate();
    verify(out, never()).close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_num_objects_tzpQ0_baTX0_fid2() throws javax.servlet.ServletException, java.io.IOException {
    PingSession3 pingSession3 = new PingSession3();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter out = mock(PrintWriter.class);
    StringBuffer outputBuffer = new StringBuffer();
    HttpSession session = mock(HttpSession.class);
    PingSession3Object[] sessionData = new PingSession3Object[10];
    when(request.getParameter("num_objects")).thenReturn("10");
    when(request.getSession(true)).thenReturn(session);
    when(response.getWriter()).thenReturn(out);
    when(session.getAttribute("sessiontest.sessionData")).thenReturn(sessionData);
    pingSession3.doGet(request, response);
    verify(out).print("<html><head> Session object size set to 10K bytes </head><body></body></html>");
    verify(session).setAttribute("sessiontest.sessionData", sessionData);
    verify(session).invalidate();
    verify(out).close();
  }
}