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

public class Aster_HoldingDataBean_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuoteIDWithQuoteNotNull_nHNV0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    holdingDataBean.setQuote(new QuoteDataBean("ABC"));
    String quoteID = holdingDataBean.getQuoteID();
    assertEquals("ABC", quoteID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuoteIDWithQuoteNull_zsoL1() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    holdingDataBean.setQuote(null);
    String quoteID = holdingDataBean.getQuoteID();
    assertEquals(null, quoteID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_pZCD0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    holdingDataBean.setHoldingID(1);
    int actual = holdingDataBean.hashCode();
    int expected = 1;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentHoldingID_fRBw0() {
    HoldingDataBean holdingDataBean1 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), new Date(), "QUOTE1");
    HoldingDataBean holdingDataBean2 = new HoldingDataBean(2, 10.0, BigDecimal.valueOf(10.0), new Date(), "QUOTE1");
    assertFalse(holdingDataBean1.equals(holdingDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullHoldingID_NcOd1() {
    HoldingDataBean holdingDataBean1 = new HoldingDataBean(null, 10.0, BigDecimal.valueOf(10.0), new Date(), "QUOTE1");
    HoldingDataBean holdingDataBean2 = new HoldingDataBean(2, 10.0, BigDecimal.valueOf(10.0), new Date(), "QUOTE1");
    assertFalse(holdingDataBean1.equals(holdingDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentQuoteID_aWNG2() {
    HoldingDataBean holdingDataBean1 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), new Date(), "QUOTE1");
    HoldingDataBean holdingDataBean2 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), new Date(), "QUOTE2");
    assertTrue(holdingDataBean1.equals(holdingDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullQuoteID_vejB3() {
    HoldingDataBean holdingDataBean1 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), new Date(), null);
    HoldingDataBean holdingDataBean2 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), new Date(), "QUOTE1");
    assertTrue(holdingDataBean1.equals(holdingDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameHoldingIDAndQuoteID_CfFI4() {
    HoldingDataBean holdingDataBean1 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), new Date(), "QUOTE1");
    HoldingDataBean holdingDataBean2 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), new Date(), "QUOTE1");
    assertTrue(holdingDataBean1.equals(holdingDataBean2));
  }
}