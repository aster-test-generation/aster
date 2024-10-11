/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:18:00 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TradeConfig_ESTest extends TradeConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TradeConfig.rndFullName();
      TradeConfig.rndQuantity();
      TradeConfig.getRandomPriceChangeFactor();
      TradeConfig.getRandomPriceChangeFactor();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TradeConfig.getOrderFee("X+Ssm4<$Gh ");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TradeConfig.getOrderFee("8MxR");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TradeConfig.rndInt(197);
      TradeConfig.rndInt(46);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TradeConfig.rndCreditCard();
      TradeConfig.rndFloat(3);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TradeConfig.rndSymbols();
      TradeConfig.rndBigDecimal((-864.868F));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TradeConfig.rndInt(98);
      TradeConfig.rndFloat(0);
      TradeConfig.rndBigDecimal(4029.4917F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TradeConfig.rndSymbols();
      TradeConfig.random();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TradeConfig.setUpdateQuotePrices(false);
      TradeConfig.getUpdateQuotePrices();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TradeConfig.setPrimIterations(0);
      TradeConfig.getPrimIterations();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TradeConfig.setOrderProcessingMode(10);
      TradeConfig.getOrderProcessingMode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TradeConfig.setMarketSummaryInterval(0);
      TradeConfig.getMarketSummaryInterval();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TradeConfig.setMarketSummaryInterval((-278));
      TradeConfig.getMarketSummaryInterval();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TradeConfig.setMAX_USERS(0);
      TradeConfig.getMAX_USERS();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TradeConfig.setMAX_HOLDINGS(0);
      TradeConfig.getMAX_HOLDINGS();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TradeConfig.setJDBCDriverNeedsGlobalTransation(true);
      TradeConfig.getJDBCDriverNeedsGlobalTransation();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        TradeConfig.setConfigParam("first:0 last:500", ";CDq3:mju}");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      TradeConfig.rndUserID();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TradeConfig.setMAX_USERS(0);
      // Undeclared exception!
      try { 
        TradeConfig.rndUserID();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TradeConfig.setMAX_USERS((-1903));
      // Undeclared exception!
      try { 
        TradeConfig.rndUserID();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1903
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        TradeConfig.rndEmail((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.TradeConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TradeConfig.setMAX_USERS(0);
      // Undeclared exception!
      try { 
        TradeConfig.nextUserID();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.TradeConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TradeConfig.setMAX_USERS((-63));
      // Undeclared exception!
      try { 
        TradeConfig.getUserID();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -63
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        TradeConfig.getPage(913);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 913 out of bounds for length 10
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.TradeConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        TradeConfig.getOrderFee((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.TradeConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = TradeConfig.nextUserID();
      assertEquals("uid:0", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = TradeConfig.getMAX_USERS();
      assertEquals(15000, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TradeConfig.incrementScenarioCount();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TradeConfig.setMAX_USERS(1);
      TradeConfig.rndUserID();
      String string0 = TradeConfig.rndUserID();
      assertEquals("uid:0", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TradeConfig.random();
      String string0 = TradeConfig.rndSymbols();
      assertEquals("s:1999,s:2999", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TradeConfig.setMAX_USERS(1);
      String string0 = TradeConfig.nextUserID();
      assertEquals("uid:0", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TradeConfig.RND_USER = false;
      String string0 = TradeConfig.getUserID();
      assertEquals("uid:0", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char char0 = TradeConfig.getScenarioAction(true);
      assertEquals('h', char0);
      
      int int0 = TradeConfig.getScenarioCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = TradeConfig.rndSymbols();
      assertEquals("s:999", string0);
      
      char char0 = TradeConfig.getScenarioAction(false);
      assertEquals('q', char0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = TradeConfig.rndBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = TradeConfig.rndAddress();
      assertEquals("0 Oak St.", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = TradeConfig.getAccessMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = TradeConfig.getWebInterface();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = TradeConfig.rndFullName();
      assertEquals("first:0 last:500", string0);
      
      BigDecimal bigDecimal0 = TradeConfig.getRandomPriceChangeFactor();
      assertEquals((short)0, bigDecimal0.shortValue());
      
      BigDecimal bigDecimal1 = TradeConfig.getRandomPriceChangeFactor();
      assertEquals((short)1, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = TradeConfig.getMAX_HOLDINGS();
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = TradeConfig.getRunTimeModeNames();
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = TradeConfig.getMAX_QUOTES();
      assertEquals(10000, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TradeConfig.setMAX_QUOTES((-680));
      int int0 = TradeConfig.getMAX_QUOTES();
      assertEquals((-680), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TradeConfig.setListQuotePriceChangeFrequency((-577));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = TradeConfig.rndBalance();
      assertEquals("1000000", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = TradeConfig.getLongRun();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TradeConfig.rndNewUserID();
      String string0 = TradeConfig.rndNewUserID();
      assertEquals("ru:19213924092813201", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TradeConfig tradeConfig0 = new TradeConfig();
      assertFalse(TradeConfig.JDBCDriverNeedsGlobalTransation);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TradeConfig.setPublishQuotePriceChange(false);
      boolean boolean0 = TradeConfig.getPublishQuotePriceChange();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TradeConfig.setAccessMode((-1));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      boolean boolean0 = TradeConfig.getUpdateQuotePrices();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int int0 = TradeConfig.getRunTimeMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int[][] intArray0 = TradeConfig.getScenarioMixes();
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TradeConfig.setDisplayOrderAlerts(false);
      boolean boolean0 = TradeConfig.getDisplayOrderAlerts();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TradeConfig.setRunTimeMode(393);
      int int0 = TradeConfig.getRunTimeMode();
      assertEquals(393, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String[] stringArray0 = TradeConfig.getOrderProcessingModeNames();
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      TradeConfig.getUserID();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int int0 = TradeConfig.getPrimIterations();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TradeConfig.setPrimIterations((-1));
      int int0 = TradeConfig.getPrimIterations();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      float float0 = TradeConfig.rndQuantity();
      assertEquals(1.0F, float0, 0.01F);
      
      float float1 = TradeConfig.rndPrice();
      assertEquals(21.0F, float1, 0.01F);
      
      String string0 = TradeConfig.rndEmail("TradeConfig.setConfigParm(..): minor exception caughttrying to set orderProcessingMode to ");
      assertEquals("TradeConfig.setConfigParm(..) minor exception caughttrying to set orderProcessingMode to @20.com", string0);
      
      char char0 = TradeConfig.getScenarioAction(true);
      assertEquals('q', char0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = TradeConfig.getPage(6);
      assertEquals("/order.jsp", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BigDecimal bigDecimal0 = TradeConfig.getRandomPriceChangeFactor();
      assertEquals((short)1, bigDecimal0.shortValue());
      
      int int0 = TradeConfig.rndInt((-264));
      assertEquals((-52), int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String[] stringArray0 = TradeConfig.getWebInterfaceNames();
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      TradeConfig.setLongRun(false);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      TradeConfig.incrementSellDeficit();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      TradeConfig.setWebInterface(10);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      int int0 = TradeConfig.getScenarioCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      BigDecimal bigDecimal0 = TradeConfig.rndBigDecimal(4029.4917F);
      assertEquals((byte)0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      TradeConfig.setScenarioCount(0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      String string0 = TradeConfig.rndSymbol();
      assertEquals("s:0", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      boolean boolean0 = TradeConfig.getJDBCDriverNeedsGlobalTransation();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String string0 = TradeConfig.rndCreditCard();
      assertEquals("0-100-200-300", string0);
      
      float float0 = TradeConfig.rndFloat((-1));
      assertEquals((-0.4F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      int int0 = TradeConfig.getListQuotePriceChangeFrequency();
      assertEquals(100, int0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      boolean boolean0 = TradeConfig.getDisplayOrderAlerts();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      int int0 = TradeConfig.getMarketSummaryInterval();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      int int0 = TradeConfig.getOrderProcessingMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      boolean boolean0 = TradeConfig.getPublishQuotePriceChange();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      float float0 = TradeConfig.rndPrice();
      assertEquals(1.0F, float0, 0.01F);
      
      TradeConfig.random();
      TradeConfig.rndSymbol();
      String string0 = TradeConfig.rndSymbols();
      assertEquals("s:3999,s:4999,s:5999,s:6999", string0);
      
      String string1 = TradeConfig.rndFullName();
      assertEquals("first:800 last:4500", string1);
      
      String string2 = TradeConfig.rndCreditCard();
      assertEquals("0-100-200-300", string2);
      
      BigDecimal bigDecimal0 = TradeConfig.rndBigDecimal(620.36755F);
      assertEquals((short)248, bigDecimal0.shortValue());
  }
}
