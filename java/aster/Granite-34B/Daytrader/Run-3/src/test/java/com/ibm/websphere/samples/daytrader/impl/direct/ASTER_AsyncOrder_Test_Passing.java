/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AsyncOrder_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProperties_sutv0() {
    AsyncOrder asyncOrder = new AsyncOrder();
    asyncOrder.setProperties(1, true);
    assertEquals(1, asyncOrder.orderID);
    assertEquals(true, asyncOrder.twoPhase);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProperties_sutv0_1() {
    AsyncOrder asyncOrder = new AsyncOrder();
    asyncOrder.setProperties(1, true);
    assertEquals(1, asyncOrder.orderID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProperties_sutv0_2() {
    AsyncOrder asyncOrder = new AsyncOrder();
    asyncOrder.setProperties(1, true);
    assertEquals(true, asyncOrder.twoPhase);
  }
}