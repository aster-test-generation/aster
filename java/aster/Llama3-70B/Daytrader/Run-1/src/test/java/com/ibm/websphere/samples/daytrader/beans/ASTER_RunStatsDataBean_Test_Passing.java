/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RunStatsDataBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeUserCount_HJyP0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getTradeUserCount();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBuyOrderCount_ZcZR0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int buyOrderCount = 10;
    runStatsDataBean.setBuyOrderCount(buyOrderCount);
    assertEquals(buyOrderCount, runStatsDataBean.getBuyOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDeletedOrderCount_KHHK0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int deletedOrderCount = 10;
    runStatsDataBean.setDeletedOrderCount(deletedOrderCount);
    assertEquals(deletedOrderCount, runStatsDataBean.getDeletedOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCount_YfnT0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = 10;
    runStatsDataBean.setTradeUserCount(tradeUserCount);
    assertEquals(tradeUserCount, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBuyOrderCount_SfcO0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getBuyOrderCount();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_JfRm0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getOrderCount();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenOrderCount_dLww0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOpenOrderCount(10);
    assertEquals(10, runStatsDataBean.getOpenOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCount_QgVr0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getNewUserCount();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeStockCount_jRHI0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = 10;
    runStatsDataBean.setTradeStockCount(tradeStockCount);
    assertEquals(tradeStockCount, runStatsDataBean.getTradeStockCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSumLoginCount_DiIU0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sumLoginCount = 10;
    runStatsDataBean.setSumLoginCount(sumLoginCount);
    assertEquals(sumLoginCount, runStatsDataBean.getSumLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingCount_qbcV0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(10);
    assertEquals(10, runStatsDataBean.getHoldingCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCancelledOrderCount_XVcz0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setCancelledOrderCount(5);
    assertEquals(5, runStatsDataBean.getCancelledOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSellOrderCount_MGSJ0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sellOrderCount = 10;
    runStatsDataBean.setSellOrderCount(sellOrderCount);
    assertEquals(sellOrderCount, runStatsDataBean.getSellOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_Ooke0_1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    String result = runStatsDataBean.toString();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_Ooke0_2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    String result = runStatsDataBean.toString();
    assertNotEquals("", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_mSev0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getTradeStockCount();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDeletedOrderCount_cATw0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setDeletedOrderCount(5);
    assertEquals(5, runStatsDataBean.getDeletedOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCount_qFpA0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getSumLogoutCount();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetNewUserCount_dpGL0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int newUserCount = 10;
    runStatsDataBean.setNewUserCount(newUserCount);
    assertEquals(newUserCount, runStatsDataBean.getNewUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderCount_aJMe0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(10);
    assertEquals(10, runStatsDataBean.getOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLoginCount_rnCd0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getSumLoginCount();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCancelledOrderCount_buEV0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int cancelledOrderCount = 5;
    runStatsDataBean.setCancelledOrderCount(cancelledOrderCount);
    assertEquals(cancelledOrderCount, runStatsDataBean.getCancelledOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSumLogoutCount_Gdcs0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sumLogoutCount = 10;
    runStatsDataBean.setSumLogoutCount(sumLogoutCount);
    assertEquals(sumLogoutCount, runStatsDataBean.getSumLogoutCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSellOrderCount_UxJQ0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getSellOrderCount();
    assertEquals(0, result);
  }
}