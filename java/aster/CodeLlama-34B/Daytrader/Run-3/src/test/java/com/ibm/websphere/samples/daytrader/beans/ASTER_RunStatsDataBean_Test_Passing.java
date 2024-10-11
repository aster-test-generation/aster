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
  public void testGetTradeUserCount_hudg0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = runStatsDataBean.getTradeUserCount();
    assertEquals(0, tradeUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeUserCountWithDifferentInputs_oGen1_2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = runStatsDataBean.getTradeUserCount();
    runStatsDataBean.setTradeUserCount(20);
    tradeUserCount = runStatsDataBean.getTradeUserCount();
    runStatsDataBean.setTradeUserCount(20);
    tradeUserCount = runStatsDataBean.getTradeUserCount();
    assertEquals(20, tradeUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeUserCountWithDifferentInputs_oGen1_3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = runStatsDataBean.getTradeUserCount();
    runStatsDataBean.setTradeUserCount(10);
    tradeUserCount = runStatsDataBean.getTradeUserCount();
    runStatsDataBean.setTradeUserCount(20);
    tradeUserCount = runStatsDataBean.getTradeUserCount();
    assertEquals(20, tradeUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSumLoginCount_VVbj0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sumLoginCount = 10;
    runStatsDataBean.setSumLoginCount(sumLoginCount);
    assertEquals(sumLoginCount, runStatsDataBean.getSumLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBuyOrderCountWithDifferentValues_Dokk1_1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int buyOrderCount = 10;
    runStatsDataBean.setBuyOrderCount(buyOrderCount);
    buyOrderCount = 20;
    runStatsDataBean.setBuyOrderCount(buyOrderCount);
    buyOrderCount = 30;
    runStatsDataBean.setBuyOrderCount(buyOrderCount);
    assertEquals(buyOrderCount, runStatsDataBean.getBuyOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDeletedOrderCount_FbqE0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int deletedOrderCount = 10;
    runStatsDataBean.setDeletedOrderCount(deletedOrderCount);
    assertEquals(deletedOrderCount, runStatsDataBean.getDeletedOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDeletedOrderCount_zero_Xayj1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int deletedOrderCount = 0;
    runStatsDataBean.setDeletedOrderCount(deletedOrderCount);
    assertEquals(deletedOrderCount, runStatsDataBean.getDeletedOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDeletedOrderCount_negative_CHlE2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int deletedOrderCount = -1;
    runStatsDataBean.setDeletedOrderCount(deletedOrderCount);
    assertEquals(deletedOrderCount, runStatsDataBean.getDeletedOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenOrderCount_dXOD0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOpenOrderCount(10);
    assertEquals(10, runStatsDataBean.getOpenOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenOrderCountWithNegativeValue_LUQu1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOpenOrderCount(-1);
    assertEquals(-1, runStatsDataBean.getOpenOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenOrderCountWithZeroValue_RTkD2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOpenOrderCount(0);
    assertEquals(0, runStatsDataBean.getOpenOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenOrderCountWithLargeValue_LShL3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOpenOrderCount(1000);
    assertEquals(1000, runStatsDataBean.getOpenOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBuyOrderCount_IXEq0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int buyOrderCount = runStatsDataBean.getBuyOrderCount();
    assertEquals(0, buyOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBuyOrderCountWithPositiveCount_iylz1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setBuyOrderCount(10);
    int buyOrderCount = runStatsDataBean.getBuyOrderCount();
    assertEquals(10, buyOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBuyOrderCountWithNegativeCount_diaa2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setBuyOrderCount(-10);
    int buyOrderCount = runStatsDataBean.getBuyOrderCount();
    assertEquals(-10, buyOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenOrderCount_RPrm0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int openOrderCount = runStatsDataBean.getOpenOrderCount();
    assertEquals(0, openOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCancelledOrderCount_nPKw0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int cancelledOrderCount = runStatsDataBean.getCancelledOrderCount();
    assertEquals(0, cancelledOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCancelledOrderCountWithNonZeroValue_HqlW1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setCancelledOrderCount(10);
    int cancelledOrderCount = runStatsDataBean.getCancelledOrderCount();
    assertEquals(10, cancelledOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCancelledOrderCountWithNegativeValue_Zxaq2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setCancelledOrderCount(-10);
    int cancelledOrderCount = runStatsDataBean.getCancelledOrderCount();
    assertEquals(-10, cancelledOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_RrcS0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(0, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCountWithPositiveCount_OSEL1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setTradeStockCount(10);
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(10, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCountWithNegativeCount_rKLb2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setTradeStockCount(-10);
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(-10, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCountWithZeroCount_Jttf3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setTradeStockCount(0);
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(0, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCount_hZjc0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int newUserCount = runStatsDataBean.getNewUserCount();
    assertEquals(0, newUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCountWithPositiveValue_heLI1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setNewUserCount(10);
    int newUserCount = runStatsDataBean.getNewUserCount();
    assertEquals(10, newUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCountWithNegativeValue_AJuT2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setNewUserCount(-10);
    int newUserCount = runStatsDataBean.getNewUserCount();
    assertEquals(-10, newUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCountWithZeroValue_TbYN3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setNewUserCount(0);
    int newUserCount = runStatsDataBean.getNewUserCount();
    assertEquals(0, newUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCountWithMaxValue_bKei4() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setNewUserCount(Integer.MAX_VALUE);
    int newUserCount = runStatsDataBean.getNewUserCount();
    assertEquals(Integer.MAX_VALUE, newUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCountWithMinValue_fYdH5() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setNewUserCount(Integer.MIN_VALUE);
    int newUserCount = runStatsDataBean.getNewUserCount();
    assertEquals(Integer.MIN_VALUE, newUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingCount_lnqs0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(10);
    assertEquals(10, runStatsDataBean.getHoldingCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingCountWithNegativeValue_WbQz1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(-10);
    assertEquals(-10, runStatsDataBean.getHoldingCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingCountWithZeroValue_esUF2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(0);
    assertEquals(0, runStatsDataBean.getHoldingCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingCountWithMaxValue_vQLJ3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(Integer.MAX_VALUE);
    assertEquals(Integer.MAX_VALUE, runStatsDataBean.getHoldingCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingCountWithMinValue_Itts4() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(Integer.MIN_VALUE);
    assertEquals(Integer.MIN_VALUE, runStatsDataBean.getHoldingCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSellOrderCount_JnQT0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sellOrderCount = 10;
    runStatsDataBean.setSellOrderCount(sellOrderCount);
    assertEquals(sellOrderCount, runStatsDataBean.getSellOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSellOrderCountWithZeroValue_QYfS2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sellOrderCount = 0;
    runStatsDataBean.setSellOrderCount(sellOrderCount);
    assertEquals(0, runStatsDataBean.getSellOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSellOrderCountWithLargeValue_vFiP3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sellOrderCount = 1000;
    runStatsDataBean.setSellOrderCount(sellOrderCount);
    assertEquals(1000, runStatsDataBean.getSellOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSellOrderCountWithInvalidValue_IHhw4() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sellOrderCount = -1;
    runStatsDataBean.setSellOrderCount(sellOrderCount);
    assertEquals(-1, runStatsDataBean.getSellOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeStockCount_xdQt0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = 10;
    runStatsDataBean.setTradeStockCount(tradeStockCount);
    assertEquals(tradeStockCount, runStatsDataBean.getTradeStockCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeStockCountWithZeroValue_Wgkz2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = 0;
    runStatsDataBean.setTradeStockCount(tradeStockCount);
    assertEquals(0, runStatsDataBean.getTradeStockCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDeletedOrderCount_Xlbo0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int deletedOrderCount = runStatsDataBean.getDeletedOrderCount();
    assertEquals(0, deletedOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDeletedOrderCount_NonZero_BKxr1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setDeletedOrderCount(10);
    int deletedOrderCount = runStatsDataBean.getDeletedOrderCount();
    assertEquals(10, deletedOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDeletedOrderCount_Negative_piRC2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setDeletedOrderCount(-1);
    int deletedOrderCount = runStatsDataBean.getDeletedOrderCount();
    assertEquals(-1, deletedOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLoginCount_fnsu0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sumLoginCount = runStatsDataBean.getSumLoginCount();
    assertEquals(0, sumLoginCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderCount_BsKO0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(10);
    assertEquals(10, runStatsDataBean.getOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderCountWithNegativeValue_dJHG1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(-10);
    assertEquals(-10, runStatsDataBean.getOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderCountWithZeroValue_OKxL2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(0);
    assertEquals(0, runStatsDataBean.getOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderCountWithLargeValue_Icoc3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(1000);
    assertEquals(1000, runStatsDataBean.getOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCancelledOrderCount_tsHk0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int cancelledOrderCount = 10;
    runStatsDataBean.setCancelledOrderCount(cancelledOrderCount);
    assertEquals(cancelledOrderCount, runStatsDataBean.getCancelledOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCancelledOrderCount_zero_TIaY2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int cancelledOrderCount = 0;
    runStatsDataBean.setCancelledOrderCount(cancelledOrderCount);
    assertEquals(0, runStatsDataBean.getCancelledOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCount_validInput_vTZi0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = 10;
    runStatsDataBean.setTradeUserCount(tradeUserCount);
    assertEquals(tradeUserCount, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCount_invalidInput_gDnk1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = -1;
    runStatsDataBean.setTradeUserCount(tradeUserCount);
    assertEquals(-1, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCount_emptyInput_JXoP3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = 0;
    runStatsDataBean.setTradeUserCount(tradeUserCount);
    assertEquals(0, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCount_largeInput_XsQT4() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = 1000;
    runStatsDataBean.setTradeUserCount(tradeUserCount);
    assertEquals(1000, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCount_smallInput_FfOX5() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = 1;
    runStatsDataBean.setTradeUserCount(tradeUserCount);
    assertEquals(1, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCount_negativeInput_wQdD6() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = -10;
    runStatsDataBean.setTradeUserCount(tradeUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSellOrderCount_evPz0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sellOrderCount = runStatsDataBean.getSellOrderCount();
    assertEquals(0, sellOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_1_nzJK0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int orderCount = runStatsDataBean.getOrderCount();
    assertEquals(0, orderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_2_xLRo1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(10);
    int orderCount = runStatsDataBean.getOrderCount();
    assertEquals(10, orderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_3_AdVP2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(100);
    int orderCount = runStatsDataBean.getOrderCount();
    assertEquals(100, orderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_4_LfZd3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(1000);
    int orderCount = runStatsDataBean.getOrderCount();
    assertEquals(1000, orderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_5_BqMx4() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(10000);
    int orderCount = runStatsDataBean.getOrderCount();
    assertEquals(10000, orderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_6_gOyl5() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(100000);
    int orderCount = runStatsDataBean.getOrderCount();
    assertEquals(100000, orderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_7_FAyY6() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(1000000);
    int orderCount = runStatsDataBean.getOrderCount();
    assertEquals(1000000, orderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_8_BEci7() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(10000000);
    int orderCount = runStatsDataBean.getOrderCount();
    assertEquals(10000000, orderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_9_ILgM8() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(100000000);
    int orderCount = runStatsDataBean.getOrderCount();
    assertEquals(100000000, orderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCount_10_YBJd9() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(1000000000);
    int orderCount = runStatsDataBean.getOrderCount();
    assertEquals(1000000000, orderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSumLogoutCount_LdrF0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sumLogoutCount = 10;
    runStatsDataBean.setSumLogoutCount(sumLogoutCount);
    assertEquals(sumLogoutCount, runStatsDataBean.getSumLogoutCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingCount_EQHg0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int holdingCount = runStatsDataBean.getHoldingCount();
    assertEquals(0, holdingCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingCountWithPositiveValue_LNir1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(10);
    int holdingCount = runStatsDataBean.getHoldingCount();
    assertEquals(10, holdingCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingCountWithNegativeValue_QopL2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(-10);
    int holdingCount = runStatsDataBean.getHoldingCount();
    assertEquals(-10, holdingCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingCountWithZeroValue_SrZG3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(0);
    int holdingCount = runStatsDataBean.getHoldingCount();
    assertEquals(0, holdingCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingCountWithMaxValue_emrm4() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(Integer.MAX_VALUE);
    int holdingCount = runStatsDataBean.getHoldingCount();
    assertEquals(Integer.MAX_VALUE, holdingCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingCountWithMinValue_NmXR5() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(Integer.MIN_VALUE);
    int holdingCount = runStatsDataBean.getHoldingCount();
    assertEquals(Integer.MIN_VALUE, holdingCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_fAlz0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    String expected = "\n\tRunStatsData for reset at " + new java.util.Date() + "\n\t\t      tradeUserCount: " + runStatsDataBean.getTradeUserCount() + "\n\t\t        newUserCount: " + runStatsDataBean.getNewUserCount() + "\n\t\t       sumLoginCount: " + runStatsDataBean.getSumLoginCount() + "\n\t\t      sumLogoutCount: " + runStatsDataBean.getSumLogoutCount() + "\n\t\t        holdingCount: " + runStatsDataBean.getHoldingCount() + "\n\t\t          orderCount: " + runStatsDataBean.getOrderCount() + "\n\t\t       buyOrderCount: " + runStatsDataBean.getBuyOrderCount() + "\n\t\t      sellOrderCount: " + runStatsDataBean.getSellOrderCount() + "\n\t\t cancelledOrderCount: " + runStatsDataBean.getCancelledOrderCount() + "\n\t\t      openOrderCount: " + runStatsDataBean.getOpenOrderCount() + "\n\t\t   deletedOrderCount: " + runStatsDataBean.getDeletedOrderCount();
    String actual = runStatsDataBean.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCount_LcVr0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sumLogoutCount = runStatsDataBean.getSumLogoutCount();
    assertEquals(0, sumLogoutCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCountWithPositiveValue_wUnR3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSumLogoutCount(10);
    int sumLogoutCount = runStatsDataBean.getSumLogoutCount();
    assertEquals(10, sumLogoutCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCountWithMaxValue_flGb4() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSumLogoutCount(Integer.MAX_VALUE);
    int sumLogoutCount = runStatsDataBean.getSumLogoutCount();
    assertEquals(Integer.MAX_VALUE, sumLogoutCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCountWithMinValue_cMbW5() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSumLogoutCount(Integer.MIN_VALUE);
    int sumLogoutCount = runStatsDataBean.getSumLogoutCount();
    assertEquals(Integer.MIN_VALUE, sumLogoutCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetNewUserCount_dXZD0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int newUserCount = 10;
    runStatsDataBean.setNewUserCount(newUserCount);
    assertEquals(newUserCount, runStatsDataBean.getNewUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetNewUserCountWithZeroValue_Wmdx2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int newUserCount = 0;
    runStatsDataBean.setNewUserCount(newUserCount);
    assertEquals(0, runStatsDataBean.getNewUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetNewUserCountWithMaxValue_toeI3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int newUserCount = Integer.MAX_VALUE;
    runStatsDataBean.setNewUserCount(newUserCount);
    assertEquals(newUserCount, runStatsDataBean.getNewUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetNewUserCountWithMinValue_OtIu9() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int newUserCount = Integer.MIN_VALUE;
    runStatsDataBean.setNewUserCount(newUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenOrderCountWithOpenOrders_Yreu1_MaCH0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setNewUserCount(1);
    int openOrderCount = runStatsDataBean.getOpenOrderCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenOrderCountWithMultipleOpenOrders_Fukw0_UblG0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setNewUserCount(0);
    int openOrderCount = runStatsDataBean.getOpenOrderCount();
    assertEquals(0, openOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCount_decimalInput_LPKY7_UaDU0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = 10;
    runStatsDataBean.setTradeUserCount(tradeUserCount);
    assertEquals(10, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCount_stringInput_DsPz8_lqNf0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = Integer.parseInt("10");
    runStatsDataBean.setTradeUserCount(tradeUserCount);
    assertEquals(10, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCount_emptyObjectInput_jZyS11_ZwDh0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = 0;
    runStatsDataBean.setTradeUserCount(tradeUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeUserCountWithDifferentInputs_oGen1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeUserCount = runStatsDataBean.getTradeUserCount();
    assertEquals(0, tradeUserCount);
    runStatsDataBean.setTradeUserCount(10);
    tradeUserCount = runStatsDataBean.getTradeUserCount();
    assertEquals(10, tradeUserCount);
    runStatsDataBean.setTradeUserCount(20);
    tradeUserCount = runStatsDataBean.getTradeUserCount();
    assertEquals(20, tradeUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBuyOrderCountWithDifferentValues_Dokk1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int buyOrderCount = 10;
    runStatsDataBean.setBuyOrderCount(buyOrderCount);
    assertEquals(buyOrderCount, runStatsDataBean.getBuyOrderCount());
    buyOrderCount = 20;
    runStatsDataBean.setBuyOrderCount(buyOrderCount);
    assertEquals(buyOrderCount, runStatsDataBean.getBuyOrderCount());
    buyOrderCount = 30;
    runStatsDataBean.setBuyOrderCount(buyOrderCount);
    assertEquals(buyOrderCount, runStatsDataBean.getBuyOrderCount());
  }
}