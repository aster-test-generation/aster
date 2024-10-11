/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:19:33 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.entities;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QuoteDataBean_ESTest extends QuoteDataBean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = new QuoteDataBean();
      double double0 = quoteDataBean0.getVolume();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      QuoteDataBean quoteDataBean0 = new QuoteDataBean("TradeConfig.setConfigParm(..): minor exception caughtSetting maxusers, error parsing string to int:", "B", (-1.0), bigDecimal0, bigDecimal0, bigDecimal0, bigDecimal0, (-1.0));
      double double0 = quoteDataBean0.getVolume();
      assertEquals("B", quoteDataBean0.getCompanyName());
      assertEquals((-1.0), quoteDataBean0.getChange(), 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertEquals("TradeConfig.setConfigParm(..): minor exception caughtSetting maxusers, error parsing string to int:", quoteDataBean0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = new QuoteDataBean();
      String string0 = quoteDataBean0.getSymbol();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = new QuoteDataBean("");
      String string0 = quoteDataBean0.getSymbol();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Random.setNextRandom(3);
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      assertEquals("s:2999", quoteDataBean0.getSymbol());
      assertEquals(0.0, quoteDataBean0.getChange(), 0.01);
      assertEquals(50000.0, quoteDataBean0.getVolume(), 0.01);
      assertEquals("s:3999 Incorporated", quoteDataBean0.getCompanyName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Random.setNextRandom((-2147483645));
      QuoteDataBean.getRandomInstance();
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      assertEquals((-10000.0), quoteDataBean0.getVolume(), 0.01);
      assertEquals((-60000.0), quoteDataBean0.getChange(), 0.01);
      assertEquals("s:-1999 Incorporated", quoteDataBean0.getCompanyName());
      assertEquals("s:-2999", quoteDataBean0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      QuoteDataBean quoteDataBean0 = new QuoteDataBean("'35!1g[.+", "'35!1g[.+", 1805.67635509, bigDecimal0, bigDecimal0, bigDecimal0, bigDecimal0, 3048);
      quoteDataBean0.getPrice();
      assertEquals(3048.0, quoteDataBean0.getChange(), 0.01);
      assertEquals(1805.67635509, quoteDataBean0.getVolume(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      QuoteDataBean quoteDataBean0 = new QuoteDataBean("TradeConfig.setConfigParm(..): minor exception caughtSetting maxusers, error parsing string to int:", "B", (-1.0), bigDecimal0, bigDecimal0, bigDecimal0, bigDecimal0, (-1.0));
      quoteDataBean0.getPrice();
      assertEquals("B", quoteDataBean0.getCompanyName());
      assertEquals((-1.0), quoteDataBean0.getChange(), 0.01);
      assertEquals((-1.0), quoteDataBean0.getVolume(), 0.01);
      assertEquals("TradeConfig.setConfigParm(..): minor exception caughtSetting maxusers, error parsing string to int:", quoteDataBean0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = new QuoteDataBean();
      BigDecimal bigDecimal0 = quoteDataBean0.getOpen();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      BigDecimal bigDecimal0 = new BigDecimal((-324));
      quoteDataBean0.setOpen(bigDecimal0);
      quoteDataBean0.getOpen();
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertEquals("s:0", quoteDataBean0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      BigDecimal bigDecimal1 = BigDecimal.valueOf(0L);
      QuoteDataBean quoteDataBean0 = new QuoteDataBean("TradeConfig.setConfigParm(..): minor exception caughtSetting maxusers, error parsing string to int:", "B", (-1.0), bigDecimal0, bigDecimal0, bigDecimal0, bigDecimal0, (-1.0));
      quoteDataBean0.setOpen(bigDecimal1);
      quoteDataBean0.getOpen();
      assertEquals((-1.0), quoteDataBean0.getChange(), 0.01);
      assertEquals((-1.0), quoteDataBean0.getVolume(), 0.01);
      assertEquals("TradeConfig.setConfigParm(..): minor exception caughtSetting maxusers, error parsing string to int:", quoteDataBean0.getSymbol());
      assertEquals("B", quoteDataBean0.getCompanyName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      BigDecimal bigDecimal0 = quoteDataBean0.getOpen();
      assertEquals((short)400, bigDecimal0.shortValue());
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
      assertEquals("s:0", quoteDataBean0.getSymbol());
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-324));
      QuoteDataBean quoteDataBean0 = new QuoteDataBean(" Incorporated", " Incorporated", (-324.0F), bigDecimal0, bigDecimal0, bigDecimal0, bigDecimal0, 70000.0);
      quoteDataBean0.getLow();
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
      assertEquals((-324.0), quoteDataBean0.getVolume(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = new QuoteDataBean();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      quoteDataBean0.setLow(bigDecimal0);
      BigDecimal bigDecimal1 = quoteDataBean0.getLow();
      assertEquals((short)0, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      BigDecimal bigDecimal0 = quoteDataBean0.getLow();
      assertEquals("s:0", quoteDataBean0.getSymbol());
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
      assertEquals((byte) (-12), bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      quoteDataBean0.setHigh(bigDecimal0);
      quoteDataBean0.getHigh();
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertEquals("s:0", quoteDataBean0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      BigDecimal bigDecimal0 = quoteDataBean0.getHigh();
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertEquals("s:0", quoteDataBean0.getSymbol());
      assertEquals((short)600, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-324));
      QuoteDataBean quoteDataBean0 = new QuoteDataBean(" Incorporated", " Incorporated", (-324.0F), bigDecimal0, bigDecimal0, bigDecimal0, bigDecimal0, 70000.0);
      quoteDataBean0.getHigh();
      assertEquals((-324.0), quoteDataBean0.getVolume(), 0.01);
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
      
      quoteDataBean0.setCompanyName((String) null);
      quoteDataBean0.getCompanyName();
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertEquals("s:0", quoteDataBean0.getSymbol());
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      String string0 = quoteDataBean0.getCompanyName();
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
      assertEquals("s:999 Incorporated", string0);
      assertEquals("s:0", quoteDataBean0.getSymbol());
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      double double0 = quoteDataBean0.getChange();
      assertEquals(70000.0, double0, 0.01);
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
      assertEquals("s:0", quoteDataBean0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TWO;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      QuoteDataBean quoteDataBean0 = new QuoteDataBean("|F4'la!#:<,8=RH", "|F4'la!#:<,8=RH", (-2346.0), bigDecimal0, bigDecimal0, bigDecimal0, bigDecimal0, (-2487.473113431597));
      double double0 = quoteDataBean0.getChange();
      assertEquals((-2346.0), quoteDataBean0.getVolume(), 0.01);
      assertEquals((-2487.473113431597), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      double double0 = quoteDataBean0.getVolume();
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
      assertEquals(20000.0, double0, 0.01);
      assertEquals("s:0", quoteDataBean0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = new QuoteDataBean();
      BigDecimal bigDecimal0 = quoteDataBean0.getLow();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      
      quoteDataBean0.setVolume(70000.0);
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = new QuoteDataBean((String) null);
      double double0 = quoteDataBean0.getChange();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = new QuoteDataBean("&(`z");
      BigDecimal bigDecimal0 = quoteDataBean0.getHigh();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = new QuoteDataBean(",5s:]ns%k]@}");
      quoteDataBean0.setChange(136.725);
      assertEquals(136.725, quoteDataBean0.getChange(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = new QuoteDataBean(",5s:]ns%k]@}");
      BigDecimal bigDecimal0 = quoteDataBean0.getPrice();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      assertEquals("s:0", quoteDataBean0.getSymbol());
      
      quoteDataBean0.setSymbol("8ktd^f{Fu$]\"zf<");
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      BigDecimal bigDecimal0 = new BigDecimal((-324));
      quoteDataBean0.setPrice(bigDecimal0);
      quoteDataBean0.getPrice();
      assertEquals("s:0", quoteDataBean0.getSymbol());
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      String string0 = quoteDataBean0.toString();
      assertEquals("\n\tQuote Data for: s:0\n\t\t companyName: s:999 Incorporated\n\t\t      volume: 20000.0\n\t\t       price: 300.00\n\t\t        open1: 400.00\n\t\t         low: 500.00\n\t\t        high: 600.00\n\t\t      change1: 70000.0", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((double) (-5715));
      QuoteDataBean quoteDataBean0 = new QuoteDataBean("", "", (-5715), bigDecimal0, bigDecimal0, bigDecimal0, bigDecimal0, (-5715));
      quoteDataBean0.getCompanyName();
      assertEquals((-5715.0), quoteDataBean0.getChange(), 0.01);
      assertEquals((-5715.0), quoteDataBean0.getVolume(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      String string0 = quoteDataBean0.getSymbol();
      assertEquals("s:0", string0);
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      QuoteDataBean quoteDataBean0 = new QuoteDataBean("TradeConfig.setConfigParm(..): minor exception caughtSetting maxusers, error parsing string to int:", "B", (-1.0), bigDecimal0, bigDecimal0, bigDecimal0, bigDecimal0, (-1.0));
      quoteDataBean0.getOpen();
      assertEquals((-1.0), quoteDataBean0.getChange(), 0.01);
      assertEquals("B", quoteDataBean0.getCompanyName());
      assertEquals("TradeConfig.setConfigParm(..): minor exception caughtSetting maxusers, error parsing string to int:", quoteDataBean0.getSymbol());
      assertEquals((-1.0), quoteDataBean0.getVolume(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(1892L);
      QuoteDataBean quoteDataBean0 = new QuoteDataBean("Hk*", "l:\"c)", (-207.483), bigDecimal0, bigDecimal0, bigDecimal0, bigDecimal0, 1892L);
      quoteDataBean0.getLow();
      assertEquals((-207.483), quoteDataBean0.getVolume(), 0.01);
      assertEquals("Hk*", quoteDataBean0.getSymbol());
      assertEquals(1892.0, quoteDataBean0.getChange(), 0.01);
      assertEquals("l:\"c)", quoteDataBean0.getCompanyName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      TradeConfig.setMAX_QUOTES(1);
      QuoteDataBean quoteDataBean1 = QuoteDataBean.getRandomInstance();
      boolean boolean0 = quoteDataBean0.equals(quoteDataBean1);
      assertTrue(boolean0);
      assertEquals(50000.0, quoteDataBean1.getChange(), 0.01);
      assertEquals("s:0 Incorporated", quoteDataBean1.getCompanyName());
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = new QuoteDataBean();
      QuoteDataBean quoteDataBean1 = QuoteDataBean.getRandomInstance();
      boolean boolean0 = quoteDataBean0.equals(quoteDataBean1);
      assertEquals(20000.0, quoteDataBean1.getVolume(), 0.01);
      assertEquals("s:999 Incorporated", quoteDataBean1.getCompanyName());
      assertEquals("s:0", quoteDataBean1.getSymbol());
      assertFalse(boolean0);
      assertEquals(70000.0, quoteDataBean1.getChange(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      QuoteDataBean quoteDataBean1 = QuoteDataBean.getRandomInstance();
      boolean boolean0 = quoteDataBean0.equals(quoteDataBean1);
      assertEquals(50000.0, quoteDataBean1.getChange(), 0.01);
      assertEquals("s:8999 Incorporated", quoteDataBean1.getCompanyName());
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertFalse(boolean0);
      assertEquals("s:7999", quoteDataBean1.getSymbol());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      Object object0 = new Object();
      boolean boolean0 = quoteDataBean0.equals(object0);
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertFalse(boolean0);
      assertEquals("s:0", quoteDataBean0.getSymbol());
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      boolean boolean0 = quoteDataBean0.equals(quoteDataBean0);
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
      assertTrue(boolean0);
      assertEquals("s:0", quoteDataBean0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      quoteDataBean0.hashCode();
      assertEquals(20000.0, quoteDataBean0.getVolume(), 0.01);
      assertEquals("s:0", quoteDataBean0.getSymbol());
      assertEquals(70000.0, quoteDataBean0.getChange(), 0.01);
      assertEquals("s:999 Incorporated", quoteDataBean0.getCompanyName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      // Undeclared exception!
      try { 
        quoteDataBean0.print();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = new QuoteDataBean();
      quoteDataBean0.hashCode();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      String string0 = quoteDataBean0.toHTML();
      assertEquals("<BR>Quote Data for: s:0<LI> companyName: s:999 Incorporated</LI><LI>      volume: 20000.0</LI><LI>       price: 300.00</LI><LI>        open1: 400.00</LI><LI>         low: 500.00</LI><LI>        high: 600.00</LI><LI>      change1: 70000.0</LI>", string0);
  }
}