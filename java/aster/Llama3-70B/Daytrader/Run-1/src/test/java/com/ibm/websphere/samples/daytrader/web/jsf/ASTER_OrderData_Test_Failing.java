/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OrderData_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotal_aaFZ0_kYQF0_fid2() {
    OrderData orderData = new OrderData(1, "open", new Date(), null, BigDecimal.ZERO, "buy", 10.0, "AAPL", BigDecimal.valueOf(100.0));
    BigDecimal total = BigDecimal.valueOf(orderData.getOpenDate().getTime()).multiply(orderData.getOrderFee()).multiply(BigDecimal.valueOf(orderData.getQuantity()));
    assertEquals(total, orderData.getTotal());
  }
}