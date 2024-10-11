/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FinancialUtils_Coverage_Test_Passing {
  private static final int SCALE = 2;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeHoldingsTotal_NullHoldingDataBeans_PTbH0() {
    Collection<HoldingDataBean> holdingDataBeans = null;
    BigDecimal expected = new BigDecimal(0.0).setScale(SCALE);
    BigDecimal actual = FinancialUtils.computeHoldingsTotal(holdingDataBeans);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeHoldingsTotal_EmptyHoldingDataBeans_cTiP1() {
    Collection<HoldingDataBean> holdingDataBeans = new ArrayList<>();
    BigDecimal expected = new BigDecimal(0.0).setScale(SCALE);
    BigDecimal actual = FinancialUtils.computeHoldingsTotal(holdingDataBeans);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeHoldingsTotal_NullHoldingDataBeans_PTbH0_caVs0() {
    Collection<HoldingDataBean> holdingDataBeans = null;
    BigDecimal expected = BigDecimal.ZERO.setScale(SCALE);
    BigDecimal actual = FinancialUtils.computeHoldingsTotal(holdingDataBeans);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeHoldingsTotal_EmptyHoldingDataBeans_cTiP1_KGUr0() {
    Collection<HoldingDataBean> holdingDataBeans = new ArrayList<>();
    BigDecimal expected = BigDecimal.ZERO.setScale(SCALE);
    BigDecimal actual = FinancialUtils.computeHoldingsTotal(holdingDataBeans);
    assertEquals(expected, actual);
  }
}