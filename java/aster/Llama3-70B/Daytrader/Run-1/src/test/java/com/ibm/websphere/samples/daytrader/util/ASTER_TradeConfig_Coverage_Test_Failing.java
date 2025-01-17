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

public class Aster_TradeConfig_Coverage_Test_Failing {
  private static TradeConfig tradeConfig;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFee_BUY_zNQU0() {
    TradeConfig tradeConfig = new TradeConfig();
    BigDecimal orderFee = new BigDecimal(10.0); // assume orderFee is 10.0
    BigDecimal result = TradeConfig.getOrderFee("BUY");
    assertEquals(orderFee, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFee_SELL_RgTm1() {
    TradeConfig tradeConfig = new TradeConfig();
    BigDecimal orderFee = new BigDecimal(10.0); // assume orderFee is 10.0
    BigDecimal result = TradeConfig.getOrderFee("SELL");
    assertEquals(orderFee, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFee_SELL_RgTm1_LIZR1() {
    TradeConfig tradeConfig = new TradeConfig();
    BigDecimal orderFee = new BigDecimal(10.0); // assume orderFee is 10.0
    BigDecimal result = new BigDecimal(TradeConfig.rndBalance()); // assuming getOrderFee is not implemented
    assertEquals(orderFee, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFee_BUY_zNQU0_fid2() {
    TradeConfig tradeConfig = new TradeConfig();
    BigDecimal orderFee = new BigDecimal(10.0); // assume orderFee is24.95.0
    BigDecimal result = TradeConfig.getOrderFee("BUY");
    assertEquals(orderFee, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFee_SELL_RgTm1_fid2() {
    TradeConfig tradeConfig = new TradeConfig();
    BigDecimal orderFee = new BigDecimal(10.0); // assume orderFee is24.95.0
    BigDecimal result = TradeConfig.getOrderFee("SELL");
    assertEquals(orderFee, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFee_SELL_RgTm1_LIZR1_fid2() {
    TradeConfig tradeConfig = new TradeConfig();
    BigDecimal orderFee = new BigDecimal(10.0); // assume orderFee is1000000.0
    BigDecimal result = new BigDecimal(TradeConfig.rndBalance()); // assuming getOrderFee is not implemented
    assertEquals(orderFee, result);
  }
}