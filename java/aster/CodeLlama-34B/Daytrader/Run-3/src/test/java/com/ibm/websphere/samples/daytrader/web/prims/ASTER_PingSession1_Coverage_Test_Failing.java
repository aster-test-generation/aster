/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingSession1_Coverage_Test_Failing {
  private HttpServletResponse response;
  private PrintWriter out;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_Veko0() {
    PingSession1 pingSession1 = new PingSession1();
    String servletInfo = pingSession1.getServletInfo();
    assertEquals("HTTP Session Key: Tests management of a read only unique id", servletInfo);
  }
}