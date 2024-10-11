/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingJDBCRead2JSP_Coverage_Test_Failing {
  private ServletConfig config;
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_glCG0() {
    PingJDBCRead2JSP jdbcRead2JSP = new PingJDBCRead2JSP();
    String expected = "Basic JDBC Read using a prepared statment forwarded to a JSP, makes use of TradeJDBC class";
    String actual = jdbcRead2JSP.getServletInfo();
    assertEquals(expected, actual);
  }
}