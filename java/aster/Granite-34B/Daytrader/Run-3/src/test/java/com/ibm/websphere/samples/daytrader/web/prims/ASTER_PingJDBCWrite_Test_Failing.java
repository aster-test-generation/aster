/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJDBCWrite_Test_Failing {
  private static int hitCount;
  private static String initTime;
  PingJDBCWrite pingjdbcwrite;
  HttpServlet httpservlet;
  HttpServletResponse httpservletresponse;
  HttpServletRequest httpservletrequest;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    httpservletrequest = mock(HttpServletRequest.class);
    pingjdbcwrite = new PingJDBCWrite();
    pingjdbcwrite.doPost(httpservletrequest, httpservletresponse);
    verify(httpservletresponse, times(1)).getWriter();
    verify(httpservletresponse, times(1)).setStatus(HttpServletResponse.SC_OK);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getServletInfo_QUzh1() {
    PingJDBCWrite ping = new PingJDBCWrite();
    String expected = "Basic JDBC Write using a prepared statment makes use of TradeJDBC code.";
    String actual = ping.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getServletInfo_notExpected_lbMO2() {
    PingJDBCWrite ping = new PingJDBCWrite();
    String expected = "Some other string";
    String actual = ping.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullRequest_rsDL1_XQQg0() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = null;
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingJDBCWrite.doPost(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_XbHz0_vaMI0() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingJDBCWrite.doPost(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ZsXO0_Laxk0() {
    PingJDBCWrite ping = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
      ping.doGet(req, res);
    } catch (ServletException | IOException e) {
      fail("Exception was thrown during doGet");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithSymbol_wHMJ1_dnkc0() {
    PingJDBCWrite ping = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    String symbol = "TEST";
    try {
      when(req.getParameter("symbol")).thenReturn(symbol);
      ping.doGet(req, res);
    } catch (ServletException | IOException e) {
      fail("Exception was thrown during doGet");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost_fid2() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    httpservletrequest = mock(HttpServletRequest.class);
    pingjdbcwrite = new PingJDBCWrite();
    doNothing().when(httpservletresponse).getWriter();
    doNothing().when(httpservletresponse).setStatus(HttpServletResponse.SC_OK);
    pingjdbcwrite.doPost(httpservletrequest, httpservletresponse);
    verify(httpservletresponse, times(1)).getWriter();
    verify(httpservletresponse, times(1)).setStatus(HttpServletResponse.SC_OK);
  }
}