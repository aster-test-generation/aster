/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RunStatsDataBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeUserCount_nRfA0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 0; // Assuming default value of tradeUserCount is 0
    int actual = runStatsDataBean.getTradeUserCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBuyOrderCount_ndGX0() {
    RunStatsDataBean runStats = new RunStatsDataBean();
    runStats.setBuyOrderCount(5);
    assertEquals(5, runStats.getBuyOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDeletedOrderCount_ISYm0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setDeletedOrderCount(5);
    assertEquals(5, runStatsDataBean.getDeletedOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCount_ekoz0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 5;
    runStatsDataBean.setTradeUserCount(expected);
    assertEquals(expected, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBuyOrderCount_DefaultValue_Fami0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    assertEquals(0, runStatsDataBean.getBuyOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_pUUF0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    assertEquals(0, runStatsDataBean.getOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenOrderCount_QnkR0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 0; // Assuming default value of openOrderCount is 0
    int actual = runStatsDataBean.getOpenOrderCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCount_SCtl0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    assertEquals(0, runStatsDataBean.getNewUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeStockCount_HkbI0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 5;
    runStatsDataBean.setTradeStockCount(expected);
    assertEquals(expected, runStatsDataBean.getTradeStockCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSumLoginCount_ZKnQ0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSumLoginCount(5);
    assertEquals(5, runStatsDataBean.getSumLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingCount_vZCg0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(5);
    assertEquals(5, runStatsDataBean.getHoldingCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCancelledOrderCount_tvlG0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 0; // Assuming default count is 0
    assertEquals(expected, runStatsDataBean.getCancelledOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSellOrderCount_zxRY0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSellOrderCount(5);
    assertEquals(5, runStatsDataBean.getSellOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_HZQx0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 0; // Assuming default value of tradeStockCount is 0
    int actual = runStatsDataBean.getTradeStockCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDeletedOrderCount_PCDI0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getDeletedOrderCount();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCount_GFne0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    assertEquals(0, runStatsDataBean.getSumLogoutCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetNewUserCount_OsrV0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setNewUserCount(5);
    assertEquals(5, runStatsDataBean.getNewUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderCount_JbTb0() {
    RunStatsDataBean runStats = new RunStatsDataBean();
    runStats.setOrderCount(5);
    assertEquals(5, runStats.getOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLoginCount_fDfh0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    assertEquals(0, runStatsDataBean.getSumLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSumLogoutCount_WDBn0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSumLogoutCount(5);
    assertEquals(5, runStatsDataBean.getSumLogoutCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingCount_wfwG0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    assertEquals(0, runStatsDataBean.getHoldingCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSellOrderCount_AecW0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 0; // Assuming default value of sellOrderCount is 0
    assertEquals(expected, runStatsDataBean.getSellOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenOrderCount_baac0_KxOM0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOpenOrderCount(5);
    assertEquals(5, runStatsDataBean.getOpenOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_IjhI0_fsXs0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    String expected = "\n\tRunStatsData for reset at " + new java.util.Date() + "\n\t\t      tradeUserCount: " + runStatsDataBean.getTradeUserCount() + "\n\t\t        newUserCount: " + runStatsDataBean.getNewUserCount() + "\n\t\t       sumLoginCount: " + runStatsDataBean.getSumLoginCount() + "\n\t\t      sumLogoutCount: " + runStatsDataBean.getSumLogoutCount() + "\n\t\t        holdingCount: " + runStatsDataBean.getHoldingCount() + "\n\t\t          orderCount: " + runStatsDataBean.getOrderCount() + "\n\t\t       buyOrderCount: " + runStatsDataBean.getBuyOrderCount() + "\n\t\t      sellOrderCount: " + runStatsDataBean.getSellOrderCount() + "\n\t\t cancelledOrderCount: " + runStatsDataBean.getCancelledOrderCount() + "\n\t\t      openOrderCount: " + runStatsDataBean.getOpenOrderCount() + "\n\t\t   deletedOrderCount: " + runStatsDataBean.getDeletedOrderCount();
    assertEquals(expected, runStatsDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCancelledOrderCount_wmrn0_EVbu0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setCancelledOrderCount(5);
    assertEquals(5, runStatsDataBean.getCancelledOrderCount());
  }
}