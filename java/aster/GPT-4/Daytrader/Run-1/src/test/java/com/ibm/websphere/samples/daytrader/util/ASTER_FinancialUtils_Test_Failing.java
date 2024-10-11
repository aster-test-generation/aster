/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FinancialUtils_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeGainPercentWithZeroOpenBalance_ItPl1() {
    BigDecimal currentBalance = new BigDecimal("150.00");
    BigDecimal openBalance = new BigDecimal("0.00");
    BigDecimal expected = BigDecimal.ZERO;
    BigDecimal result = FinancialUtils.computeGainPercent(currentBalance, openBalance);
    assertEquals(expected, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeGainPercentWithNonZeroOpenBalance_suiM0_fid1() {
    BigDecimal currentBalance = new BigDecimal("120");
    BigDecimal openBalance = new BigDecimal("100");
    BigDecimal expected = new BigDecimal("20.00");
    BigDecimal result = FinancialUtils.computeGainPercent(currentBalance, openBalance);
    assertEquals(expected, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeGainPercentWithZeroOpenBalance_ItPl1_fid1() {
    BigDecimal currentBalance = new BigDecimal("150");
    BigDecimal openBalance = new BigDecimal("0");
    BigDecimal expected = BigDecimal.ZERO;
    BigDecimal result = FinancialUtils.computeGainPercent(currentBalance, openBalance);
    assertEquals(expected, result);
  }
}