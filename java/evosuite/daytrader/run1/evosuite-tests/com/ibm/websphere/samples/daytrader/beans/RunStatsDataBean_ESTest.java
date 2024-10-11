/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:08:36 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RunStatsDataBean_ESTest extends RunStatsDataBean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setTradeUserCount(33);
      int int0 = runStatsDataBean0.getTradeUserCount();
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setTradeUserCount((-2762));
      int int0 = runStatsDataBean0.getTradeUserCount();
      assertEquals((-2762), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setTradeStockCount(1508);
      int int0 = runStatsDataBean0.getTradeStockCount();
      assertEquals(1508, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setTradeStockCount((-5987));
      int int0 = runStatsDataBean0.getTradeStockCount();
      assertEquals((-5987), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setSumLogoutCount((-567));
      int int0 = runStatsDataBean0.getSumLogoutCount();
      assertEquals((-567), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setSumLoginCount(1878);
      int int0 = runStatsDataBean0.getSumLoginCount();
      assertEquals(1878, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setSumLoginCount((-624));
      int int0 = runStatsDataBean0.getSumLoginCount();
      assertEquals((-624), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setSellOrderCount(837);
      int int0 = runStatsDataBean0.getSellOrderCount();
      assertEquals(837, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setSellOrderCount((-1344));
      int int0 = runStatsDataBean0.getSellOrderCount();
      assertEquals((-1344), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setOrderCount(1);
      int int0 = runStatsDataBean0.getOrderCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setOrderCount((-754));
      int int0 = runStatsDataBean0.getOrderCount();
      assertEquals((-754), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setOpenOrderCount(1);
      int int0 = runStatsDataBean0.getOpenOrderCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setOpenOrderCount((-1251));
      int int0 = runStatsDataBean0.getOpenOrderCount();
      assertEquals((-1251), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setNewUserCount(364);
      int int0 = runStatsDataBean0.getNewUserCount();
      assertEquals(364, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setHoldingCount(1886);
      int int0 = runStatsDataBean0.getHoldingCount();
      assertEquals(1886, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setHoldingCount((-1));
      int int0 = runStatsDataBean0.getHoldingCount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setDeletedOrderCount(1321);
      int int0 = runStatsDataBean0.getDeletedOrderCount();
      assertEquals(1321, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setDeletedOrderCount((-2361));
      int int0 = runStatsDataBean0.getDeletedOrderCount();
      assertEquals((-2361), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setCancelledOrderCount(1508);
      int int0 = runStatsDataBean0.getCancelledOrderCount();
      assertEquals(1508, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setCancelledOrderCount((-754));
      int int0 = runStatsDataBean0.getCancelledOrderCount();
      assertEquals((-754), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setBuyOrderCount(341);
      int int0 = runStatsDataBean0.getBuyOrderCount();
      assertEquals(341, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      int int0 = runStatsDataBean0.getSumLoginCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      int int0 = runStatsDataBean0.getOpenOrderCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      int int0 = runStatsDataBean0.getCancelledOrderCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      int int0 = runStatsDataBean0.getOrderCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      int int0 = runStatsDataBean0.getNewUserCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      int int0 = runStatsDataBean0.getSumLogoutCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      int int0 = runStatsDataBean0.getTradeUserCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      int int0 = runStatsDataBean0.getSellOrderCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      int int0 = runStatsDataBean0.getDeletedOrderCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      int int0 = runStatsDataBean0.getBuyOrderCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      int int0 = runStatsDataBean0.getHoldingCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setSumLogoutCount(1);
      int int0 = runStatsDataBean0.getSumLogoutCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setBuyOrderCount((-1));
      int int0 = runStatsDataBean0.getBuyOrderCount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      int int0 = runStatsDataBean0.getTradeStockCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      runStatsDataBean0.setNewUserCount((-1389));
      int int0 = runStatsDataBean0.getNewUserCount();
      assertEquals((-1389), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RunStatsDataBean runStatsDataBean0 = new RunStatsDataBean();
      String string0 = runStatsDataBean0.toString();
      assertEquals("\n\tRunStatsData for reset at Fri Feb 14 20:21:21 GMT 2014\n\t\t      tradeUserCount: 0\n\t\t        newUserCount: 0\n\t\t       sumLoginCount: 0\n\t\t      sumLogoutCount: 0\n\t\t        holdingCount: 0\n\t\t          orderCount: 0\n\t\t       buyOrderCount: 0\n\t\t      sellOrderCount: 0\n\t\t cancelledOrderCount: 0\n\t\t      openOrderCount: 0\n\t\t   deletedOrderCount: 0", string0);
  }
}
