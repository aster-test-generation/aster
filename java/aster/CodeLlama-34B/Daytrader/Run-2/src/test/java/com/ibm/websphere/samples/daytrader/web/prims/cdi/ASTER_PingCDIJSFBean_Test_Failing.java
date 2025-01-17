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

public class Aster_PingCDIJSFBean_Test_Failing {
  @Test
  @Timeout(value = 3, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCountWithMultipleCalls_fGcU1_1() {
    PingCDIJSFBean pingCDIJSFBean = new PingCDIJSFBean();
    int hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    assertEquals(1, hitCount);
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCountWithNegativeInput_Efrh2_1() {
    PingCDIJSFBean pingCDIJSFBean = new PingCDIJSFBean();
    int hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    assertEquals(1, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCountWithMultipleCalls_fGcU1_2() {
    PingCDIJSFBean pingCDIJSFBean = new PingCDIJSFBean();
    int hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    assertEquals(2, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCountWithNegativeInput_Efrh2_2() {
    PingCDIJSFBean pingCDIJSFBean = new PingCDIJSFBean();
    int hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    assertEquals(2, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCountWithNegativeInput_Efrh2_3() {
    PingCDIJSFBean pingCDIJSFBean = new PingCDIJSFBean();
    int hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    assertEquals(3, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCountWithNegativeInput_Efrh2_4() {
    PingCDIJSFBean pingCDIJSFBean = new PingCDIJSFBean();
    int hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    hitCount = pingCDIJSFBean.getHitCount();
    assertEquals(4, hitCount);
  }
}