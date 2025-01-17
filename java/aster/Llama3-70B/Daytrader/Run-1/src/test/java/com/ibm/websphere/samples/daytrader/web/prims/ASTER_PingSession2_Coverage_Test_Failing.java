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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingSession2_Coverage_Test_Failing {
  private ServletConfig servletConfig;
  private PingSession2 pingSession2;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_oeiU0() {
    PingSession2 pingSession2 = new PingSession2();
    String actual = pingSession2.getServletInfo();
    assertNotNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_PrintWriter_FdcT0() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(response.getWriter()).thenReturn(mock(PrintWriter.class));
    pingSession2.doGet(request, response);
    verify(response, times(1)).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_out_println_html_KsRr1() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter out = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(out);
    pingSession2.doGet(request, response);
    verify(out, times(1)).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_catch_Exception_fGkP4() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(response.getWriter()).thenThrow(new IOException());
    pingSession2.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_throw_Exception_bipL6() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(response.getWriter()).thenThrow(new IOException());
    try {
      pingSession2.doGet(request, response);
      fail("Expected IOException");
    } catch (IOException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_catch_Exception2_fEFO7() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getSession(true)).thenThrow(new ServletException());
    pingSession2.doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_throw_Exception2_Ugfj9() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getSession(true)).thenThrow(new ServletException());
    try {
      pingSession2.doGet(request, response);
      fail("Expected ServletException");
    } catch (ServletException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_session_GmFK10() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    pingSession2.doGet(request, response);
    verify(request, times(1)).getSession(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_EZgL0() throws javax.servlet.ServletException {
    pingSession2 = new PingSession2();
    servletConfig = mock(ServletConfig.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_SuperInitCalled_PAHv1() throws ServletException {
    pingSession2.init(servletConfig);
    verify(servletConfig).getServletContext();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_oeiU0_fid3() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = "HTTP Session Key: Tests management of a read/write unique id";
    String actual = pingSession2.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_Log_error2_leyv8_uPXc0() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    Log log = mock(Log.class);
    when(request.getSession(true)).thenThrow(new ServletException());
    pingSession2.doGet(request, response);
    verify(log, times(1)).error(any(Exception.class), anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ServletException_QAqe1_bSJL0() throws ServletException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
      pingSession2.doGet(req, res);
    } catch (IOException e) {
      fail("IOException should not be thrown");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_gEUu0_jwcf0() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getSession(true)).thenReturn(mock(HttpSession.class));
    pingSession2.doGet(req, res);
  }
}