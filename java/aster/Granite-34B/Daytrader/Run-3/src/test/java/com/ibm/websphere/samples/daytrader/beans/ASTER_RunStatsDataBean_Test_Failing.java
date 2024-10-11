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
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSellOrderCount_BoundaryValues_gIVh1_1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSellOrderCount(Integer.MIN_VALUE);
    runStatsDataBean.setSellOrderCount(Integer.MAX_VALUE);
    assertEquals(Integer.MIN_VALUE, runStatsDataBean.getSellOrderCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderCountWithNegativeValue_kvPc2_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(-10);
    int actual = runStatsDataBean.getOrderCount();
    int expected = 0; // Initialize the expected value based on the method's return type and logic
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest1_asad1_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = 1;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest2_dCGi2_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = -1;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest3_agnV3_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = Integer.MAX_VALUE;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest4_JfMC4_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = Integer.MIN_VALUE;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest5_iNsE5_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = 100;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest6_HHqh6_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = -100;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest7_YMZE7_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = 1000;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest8_Nmmx8_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = -1000;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest9_hCFJ9_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = 10000;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest10_OXPZ10_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = -10000;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest11_xniT11_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = 100000;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest12_Zwbi12_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = -100000;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest13_EzeP13_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = 1000000;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getSumLoginCountTest14_evqP14_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int actual = runStatsDataBean.getSumLoginCount();
    int expected = -1000000;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSellOrderCountWithNegativeValue_vQNt2_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSellOrderCount(-5); // Set a negative value for sellOrderCount
    int actualResult = runStatsDataBean.getSellOrderCount();
    int expectedResult = 0; // Expected result should be 0 for negative values
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSellOrderCountAfterSettingNegativeValue_BFCQ5_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSellOrderCount(-10); // Set a negative value for sellOrderCount
    int actualResult = runStatsDataBean.getSellOrderCount();
    int expectedResult = 0; // Expected result should be 0 for negative values
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSellOrderCountAfterSettingMinIntValue_JUZd7_fid1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSellOrderCount(Integer.MIN_VALUE); // Set the minimum integer value for sellOrderCount
    int actualResult = runStatsDataBean.getSellOrderCount();
    int expectedResult = 0; // Expected result should be 0 for negative values
    assertEquals(expectedResult, actualResult);
  }
}