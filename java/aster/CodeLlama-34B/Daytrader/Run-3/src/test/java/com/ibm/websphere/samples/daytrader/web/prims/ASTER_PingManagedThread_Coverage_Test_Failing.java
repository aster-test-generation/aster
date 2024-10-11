/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingManagedThread_Coverage_Test_Failing {
  private ManagedThreadFactory managedThreadFactory;
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_lzaO0() {
    PingManagedThread pingManagedThread = new PingManagedThread();
    String servletInfo = pingManagedThread.getServletInfo();
    assertEquals("Tests a ManagedThread asynchronous servlet", servletInfo);
  }
}