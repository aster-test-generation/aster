/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AsyncOrder_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProperties_gJFQ0() {
    AsyncOrder asyncOrder = new AsyncOrder();
    asyncOrder.setProperties(123, true);
    assertEquals((Integer) 123, asyncOrder.orderID);
    assertTrue(asyncOrder.twoPhase);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProperties_gJFQ0_1() {
    AsyncOrder asyncOrder = new AsyncOrder();
    asyncOrder.setProperties(123, true);
    assertEquals((Integer) 123, asyncOrder.orderID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProperties_gJFQ0_2() {
    AsyncOrder asyncOrder = new AsyncOrder();
    asyncOrder.setProperties(123, true);
    assertTrue(asyncOrder.twoPhase);
  }
}