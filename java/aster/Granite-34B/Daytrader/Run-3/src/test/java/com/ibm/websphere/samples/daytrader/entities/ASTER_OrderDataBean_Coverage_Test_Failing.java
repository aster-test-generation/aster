/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OrderDataBean_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testisOpen3_seHI2() {
    OrderDataBean order = new OrderDataBean(1, "closed", "processing", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(1.0), "symbol");
    boolean actual = order.isOpen();
    boolean expected = false;
    assertEquals(expected, actual);
  }
}