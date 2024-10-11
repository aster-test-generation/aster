/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
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
public class Aster_PingJDBCWrite_Test_Failing {
  private static int hitCount;
  private static String initTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_xkvw0() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingJDBCWrite.doPost(req, res);
    verify(req).getParameter("username");
    verify(req).getParameter("password");
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidUsername_lYGO1() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("username")).thenReturn("invalid_username");
    when(req.getParameter("password")).thenReturn("password");
    pingJDBCWrite.doPost(req, res);
    verify(req).getParameter("username");
    verify(req).getParameter("password");
    verify(res).setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidPassword_pgFG2() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("username")).thenReturn("username");
    when(req.getParameter("password")).thenReturn("invalid_password");
    pingJDBCWrite.doPost(req, res);
    verify(req).getParameter("username");
    verify(req).getParameter("password");
    verify(res).setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidUsernameAndPassword_MzkH3() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("username")).thenReturn("invalid_username");
    when(req.getParameter("password")).thenReturn("invalid_password");
    pingJDBCWrite.doPost(req, res);
    verify(req).getParameter("username");
    verify(req).getParameter("password");
    verify(res).setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithValidUsernameAndPassword_yoDh4() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("username")).thenReturn("username");
    when(req.getParameter("password")).thenReturn("password");
    pingJDBCWrite.doPost(req, res);
    verify(req).getParameter("username");
    verify(req).getParameter("password");
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_FlAG0() {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    String expected = "Basic JDBC Write using a prepared statment makes use of TradeJDBC code.";
    String actual = pingJDBCWrite.getServletInfo();
    assertEquals(expected, actual);
  }
}