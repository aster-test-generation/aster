/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingInterceptor_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testMethodInterceptor_DSQx0() throws java.lang.Exception {
    PingInterceptor pingInterceptor = new PingInterceptor();
    Object result = pingInterceptor.methodInterceptor(null);
    assertEquals(null, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testMethodInterceptorWithException_lbdg2() throws java.lang.Exception {
    PingInterceptor pingInterceptor = new PingInterceptor();
    try {
      pingInterceptor.methodInterceptor(null);
    } catch (Exception e) {
      assertEquals("Exception message", e.getMessage());
    }
  }
}