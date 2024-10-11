/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_KeyBlock_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize_minMax_Lqyd0() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    assertEquals(10, keyBlock.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize_minMax_negative_ZDtI1() {
    KeyBlock keyBlock = new KeyBlock(-10, 10);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize_minMax_same_bcWM3() {
    KeyBlock keyBlock = new KeyBlock(11, 11);
    assertEquals(1, keyBlock.size());
  }
}