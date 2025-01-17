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

public class Aster_PingCDIJSFBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCount_QXxz0() {
    PingCDIJSFBean bean = new PingCDIJSFBean();
    int hitCount = bean.getHitCount();
    assertEquals(1, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCount_Zero_PBuJ1() {
    PingCDIJSFBean bean = new PingCDIJSFBean();
    int hitCount = bean.getHitCount();
    assertEquals(0, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCount_Negative_RyRi2() {
    PingCDIJSFBean bean = new PingCDIJSFBean();
    int hitCount = bean.getHitCount();
    assertEquals(-1, hitCount);
  }
}