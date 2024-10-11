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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HoldingDataBean_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_symbol_QcVW4() {
    HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
    assertNotNull(holdingDataBean.getQuote().getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NonNullHoldingID_VYJZ1_fid2() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10, BigDecimal.valueOf(100), new Date(), "ABC");
    int actualHashCode = holdingDataBean.hashCode();
    assertEquals(100, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullHoldingID_NwIX1_yYyw0_fid2() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    HoldingDataBean other = new HoldingDataBean();
    other.setHoldingID(null);
    assertFalse(holdingDataBean.equals(other));
  }
}