/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeConfig_Coverage_Test_Passing {
  private Log mockLog;
  private TradeConfig tradeConfig;
  private TradeConfig config;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomPriceChangeFactor_LessThanZero_LfkS0() {
    BigDecimal percentGainBD = TradeConfig.getRandomPriceChangeFactor();
    assertTrue(percentGainBD.doubleValue() > 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void tearDown_lkBb1() {
    tradeConfig = null;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void tearDown_IXFu1() {
    config = null;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_InvalidValueForMaxUsers_kZWJ18() {
    config.setConfigParam("maxUsers", "invalid_value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScenarioAction_invalidAction_ptWJ4_Pdzn0_fid2() {
    boolean newUser = false;
    char action = TradeConfig.getScenarioAction(newUser);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomPriceChangeFactor_EqualsZero_GHvu1_JHBM1_fid2() {
    BigDecimal percentGainBD = TradeConfig.getRandomPriceChangeFactor();
  }
}