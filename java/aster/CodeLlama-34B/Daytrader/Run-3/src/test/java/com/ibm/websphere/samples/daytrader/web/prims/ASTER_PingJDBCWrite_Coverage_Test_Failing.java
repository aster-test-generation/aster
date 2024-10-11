/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingJDBCWrite_Coverage_Test_Failing {
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_ZURg0() {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    String expected = "Basic JDBC Write using a prepared statment makes use of TradeJDBC code.";
    String actual = pingJDBCWrite.getServletInfo();
    assertEquals(expected, actual);
  }
}