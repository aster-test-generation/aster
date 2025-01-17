/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RunStatsDataBean_Test_Failing {
  private RunStatsDataBean runStatsDataBean;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCountWithNegativeValue_XfOM1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setTradeUserCount(-10);
    assertEquals(0, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCountWithPositiveValue_KWmz1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int newUserCount = runStatsDataBean.getNewUserCount();
    assertEquals(10, newUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCountWithNegativeValue_QkuR2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int newUserCount = runStatsDataBean.getNewUserCount();
    assertEquals(-10, newUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCountWithMaxValue_ICve4() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int newUserCount = runStatsDataBean.getNewUserCount();
    assertEquals(Integer.MAX_VALUE, newUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNewUserCountWithMinValue_quDE5() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int newUserCount = runStatsDataBean.getNewUserCount();
    assertEquals(Integer.MIN_VALUE, newUserCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenOrderCount_InvalidInput_kOTh1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int openOrderCount = -1;
    runStatsDataBean.setOpenOrderCount(openOrderCount);
    assertEquals(0, runStatsDataBean.getOpenOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCount_mzvf1() {
    int expected = 10;
    int actual = runStatsDataBean.getSumLogoutCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCountWithZero_nbRJ2() {
    int expected = 0;
    int actual = runStatsDataBean.getSumLogoutCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCountWithNegative_Czkk3() {
    int expected = -1;
    int actual = runStatsDataBean.getSumLogoutCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCountWithMaxValue_GzRp7() {
    int expected = Integer.MAX_VALUE;
    int actual = runStatsDataBean.getSumLogoutCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCountWithMinValue_mfzl8() {
    int expected = Integer.MIN_VALUE;
    int actual = runStatsDataBean.getSumLogoutCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCountWithRandomValue_jRgg9() {
    int expected = 123456789;
    int actual = runStatsDataBean.getSumLogoutCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLogoutCountWithRandomNegativeValue_uwmG10() {
    int expected = -123456789;
    int actual = runStatsDataBean.getSumLogoutCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderCountWithNegativeValue_XIIN1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int orderCount = -10;
    runStatsDataBean.setOrderCount(orderCount);
    assertEquals(0, runStatsDataBean.getOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderCountWithInvalidValue_Oawp4() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int orderCount = -1;
    runStatsDataBean.setOrderCount(orderCount);
    assertEquals(0, runStatsDataBean.getOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSellOrderCountWithNullObject_mgFf8() {
    RunStatsDataBean runStatsDataBean = null;
    int sellOrderCount = runStatsDataBean.getSellOrderCount();
    assertEquals(0, sellOrderCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTradeUserCountWithNegativeValue_XfOM1_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setTradeUserCount(-1 - 10);
    assertEquals(-10, runStatsDataBean.getTradeUserCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_Gqgy1_1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(1100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(2100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(3100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(4100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(5100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(6100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(7100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(8100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(9100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(1100100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(100, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_Gqgy1_2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(20);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(30);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(40);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(50);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(60);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(70);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(80);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(90);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(1000);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(100, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_Gqgy1_1_fid3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(10);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(20);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(30);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(40);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(50);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(60);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(70);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(80);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(90);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(0, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_Gqgy1_2_fid3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(10);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(20);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(30);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(40);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(50);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(60);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(70);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(80);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(90);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(10, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_Gqgy1_3_fid3() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(10);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(20);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(30);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(40);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(50);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(60);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(70);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(80);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(90);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(20, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_Gqgy1_4() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(10);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(20);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(30);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(40);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(50);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(60);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(70);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(80);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(90);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(30, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_Gqgy1_5() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(10);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(20);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(30);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(40);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(50);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(60);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(70);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(80);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(90);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(40, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_Gqgy1_6() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(10);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(20);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(30);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(40);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(50);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(60);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(70);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(80);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(90);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(50, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_Gqgy1_7() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(10);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(20);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(30);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(40);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(50);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(60);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(70);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(80);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(90);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(60, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_Gqgy1_8() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(10);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(20);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(30);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(40);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(50);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(60);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(70);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(80);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(90);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(70, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_Gqgy1_9() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(10);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(20);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(30);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(40);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(50);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(60);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(70);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(80);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(90);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(80, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTradeStockCount_Gqgy1_10() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(10);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(20);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(30);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(40);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(50);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(60);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(70);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(80);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(90);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    runStatsDataBean.setTradeStockCount(100);
    tradeStockCount = runStatsDataBean.getTradeStockCount();
    assertEquals(90, tradeStockCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDeletedOrderCountWithNull_UjBp4_aocO0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    Integer deletedOrderCount = null;
    runStatsDataBean.setDeletedOrderCount(deletedOrderCount);
    assertEquals(deletedOrderCount, runStatsDataBean.getDeletedOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLoginCount_4_PeEE3_LfhS0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSellOrderCount(1);
    runStatsDataBean.setSellOrderCount(2);
    runStatsDataBean.setSellOrderCount(3);
    int sumLoginCount = runStatsDataBean.getSellOrderCount();
    assertEquals(6, sumLoginCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumLoginCount_7_szoM6_BUfC0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSellOrderCount(1);
    runStatsDataBean.setSellOrderCount(2);
    runStatsDataBean.setSellOrderCount(3);
    runStatsDataBean.setSellOrderCount(4);
    runStatsDataBean.setSellOrderCount(5);
    runStatsDataBean.setSellOrderCount(6);
    int sumLoginCount = runStatsDataBean.getSumLoginCount();
    assertEquals(21, sumLoginCount);
  }
}