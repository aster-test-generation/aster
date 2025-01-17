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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingJDBCWrite_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getServletInfoTest_uISe0() {
    PingJDBCWrite testObject = new PingJDBCWrite();
    assertEquals("Basic JDBC Write using a prepared statment makes use of TradeJDBC code.", testObject.getServletInfo());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_Fyhk0() throws javax.servlet.ServletException, java.io.IOException {
    PingJDBCWrite testObject = new PingJDBCWrite();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_doGet_1_IfZJ0() throws Exception {
    PingJDBCWrite testObject = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    doNothing().when(testObject).doGet(req, res);
    testObject.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_doGet_2_IDFy1() throws Exception {
    PingJDBCWrite testObject = new PingJDBCWrite();
    HttpServletRequest req = null;
    HttpServletResponse res = null;
    testObject.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_doGet_3_wtQN2() throws Exception {
    PingJDBCWrite testObject = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    testObject.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_doGet_13_TlYA12() throws Exception {
    PingJDBCWrite testObject = new PingJDBCWrite();
    HttpServletRequest req = null;
    HttpServletResponse res = null;
    testObject.doGet(req, res);
    // Add assertion here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_doGet_16_oQBC15() throws Exception {
    PingJDBCWrite testObject = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    testObject.doGet(req, res);
    verify(res).setStatus(500);
  }
}