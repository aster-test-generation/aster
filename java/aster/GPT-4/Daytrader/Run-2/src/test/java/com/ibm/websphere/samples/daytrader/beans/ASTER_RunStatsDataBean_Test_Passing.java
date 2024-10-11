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
  public void testGetTradeUserCount_GARU0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 0; // Assuming default or initial value
    assertEquals(expected, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBuyOrderCount_rXRe0() {
    RunStatsDataBean statsBean = new RunStatsDataBean();
    statsBean.setBuyOrderCount(5);
    assertEquals(5, statsBean.getBuyOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDeletedOrderCount_ditZ0() {
    RunStatsDataBean runStats = new RunStatsDataBean();
    runStats.setDeletedOrderCount(5);
    assertEquals(5, runStats.getDeletedOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCount_TcQz0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 5;
    runStatsDataBean.setTradeUserCount(expected);
    assertEquals(expected, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBuyOrderCount_Xefi0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    assertEquals(0, runStatsDataBean.getBuyOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_cnrd0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    assertEquals(0, runStatsDataBean.getOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenOrderCount_uxCB0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 0; // Assuming default value of openOrderCount is 0
    assertEquals(expected, runStatsDataBean.getOpenOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCount_hkIM0() {
    RunStatsDataBean statsBean = new RunStatsDataBean();
    assertEquals(0, statsBean.getNewUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeStockCount_zFhx0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setTradeStockCount(5);
    assertEquals(5, runStatsDataBean.getTradeStockCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSumLoginCount_OQZm0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSumLoginCount(5);
    assertEquals(5, runStatsDataBean.getSumLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingCount_xvVf0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(5);
    assertEquals(5, runStatsDataBean.getHoldingCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCancelledOrderCount_VzcL0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 0; // Assuming default value of cancelledOrderCount is 0
    int actual = runStatsDataBean.getCancelledOrderCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSellOrderCount_KEOY0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSellOrderCount(5);
    assertEquals(5, runStatsDataBean.getSellOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringOutputsCorrectFormat_RCuw0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    String expectedOutput = "\n\tRunStatsData for reset at " + new java.util.Date() +
        "\n\t\t      tradeUserCount: " + runStatsDataBean.getTradeUserCount() +
        "\n\t\t        newUserCount: " + runStatsDataBean.getNewUserCount() +
        "\n\t\t       sumLoginCount: " + runStatsDataBean.getSumLoginCount() +
        "\n\t\t      sumLogoutCount: " + runStatsDataBean.getSumLogoutCount() +
        "\n\t\t        holdingCount: " + runStatsDataBean.getHoldingCount() +
        "\n\t\t          orderCount: " + runStatsDataBean.getOrderCount() +
        "\n\t\t       buyOrderCount: " + runStatsDataBean.getBuyOrderCount() +
        "\n\t\t      sellOrderCount: " + runStatsDataBean.getSellOrderCount() +
        "\n\t\t cancelledOrderCount: " + runStatsDataBean.getCancelledOrderCount() +
        "\n\t\t      openOrderCount: " + runStatsDataBean.getOpenOrderCount() +
        "\n\t\t   deletedOrderCount: " + runStatsDataBean.getDeletedOrderCount();
    assertEquals(expectedOutput, runStatsDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_UCoj0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 0; // Assuming default value of tradeStockCount is 0
    int actual = runStatsDataBean.getTradeStockCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDeletedOrderCount_CaAh0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getDeletedOrderCount();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCount_xFYW0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    assertEquals(0, runStatsDataBean.getSumLogoutCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetNewUserCount_RfOR0() {
    RunStatsDataBean runStats = new RunStatsDataBean();
    runStats.setNewUserCount(5);
    assertEquals(5, runStats.getNewUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderCount_sQsX0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(5);
    assertEquals(5, runStatsDataBean.getOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLoginCount_whJY0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    assertEquals(0, runStatsDataBean.getSumLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCancelledOrderCount_nqwO0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setCancelledOrderCount(5);
    assertEquals(5, runStatsDataBean.getCancelledOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSumLogoutCount_evFz0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSumLogoutCount(5);
    assertEquals(5, runStatsDataBean.getSumLogoutCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingCount_vcQE0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 0; // Assuming default holdingCount is 0
    assertEquals(expected, runStatsDataBean.getHoldingCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSellOrderCount_WFxD0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int expected = 0; // Assuming default value of sellOrderCount is 0
    int actual = runStatsDataBean.getSellOrderCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenOrderCount_NynX0_ikJQ0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOpenOrderCount(5);
    assertEquals(5, runStatsDataBean.getOpenOrderCount());
  }
}