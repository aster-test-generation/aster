/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:52:55 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.web.jsf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.websphere.samples.daytrader.web.jsf.HoldingData;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HoldingData_ESTest extends HoldingData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      holdingData0.setQuoteID("com.ibm.websphere.samples.daytrader.web.jsf.HoldingData");
      String string0 = holdingData0.getQuoteID();
      assertEquals("com.ibm.websphere.samples.daytrader.web.jsf.HoldingData", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      holdingData0.setQuoteID("");
      String string0 = holdingData0.getQuoteID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      holdingData0.setQuantity(2710.530549881);
      double double0 = holdingData0.getQuantity();
      assertEquals(2710.530549881, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      holdingData0.setQuantity((-2928.459109004));
      double double0 = holdingData0.getQuantity();
      assertEquals((-2928.459109004), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      holdingData0.setPurchasePrice(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getPurchasePrice();
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = BigDecimal.valueOf(1632L);
      holdingData0.setPurchasePrice(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getPurchasePrice();
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      MockDate mockDate0 = new MockDate();
      holdingData0.setPurchaseDate(mockDate0);
      Date date0 = holdingData0.getPurchaseDate();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      holdingData0.setPrice(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getPrice();
      assertEquals((short)0, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      holdingData0.setPrice(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getPrice();
      assertEquals((byte)10, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigInteger bigInteger0 = BigInteger.ZERO;
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      MathContext mathContext0 = new MathContext(1, roundingMode0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0, mathContext0);
      holdingData0.setMarketValue(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getMarketValue();
      assertEquals((short)0, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = new BigDecimal(1);
      holdingData0.setMarketValue(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getMarketValue();
      assertEquals((short)1, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      Integer integer0 = new Integer(0);
      holdingData0.setHoldingID(integer0);
      Integer integer1 = holdingData0.getHoldingID();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      Integer integer0 = new Integer((-1380));
      holdingData0.setHoldingID(integer0);
      Integer integer1 = holdingData0.getHoldingID();
      assertEquals((-1380), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      byte[] byteArray0 = new byte[9];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      MathContext mathContext0 = MathContext.DECIMAL64;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0, 2142, mathContext0);
      holdingData0.setGain(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getGain();
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = new BigDecimal(1);
      holdingData0.setGain(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getGain();
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = new BigDecimal((-1880.90974782378));
      holdingData0.setGain(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getGain();
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      holdingData0.setBasis(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getBasis();
      assertEquals((short)0, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      holdingData0.setBasis(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getBasis();
      assertEquals((byte)10, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      Integer integer0 = holdingData0.getHoldingID();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = holdingData0.getBasis();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      Date date0 = holdingData0.getPurchaseDate();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      String string0 = holdingData0.getQuoteID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = holdingData0.getMarketValue();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      Integer integer0 = new Integer(2273);
      holdingData0.setHoldingID(integer0);
      Integer integer1 = holdingData0.getHoldingID();
      assertEquals(2273, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = new BigDecimal((-2065L));
      holdingData0.setPrice(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getPrice();
      assertEquals((short) (-2065), bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      double double0 = holdingData0.getQuantity();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      // Undeclared exception!
      try { 
        holdingData0.getGainHTML();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.FinancialUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      MathContext mathContext0 = MathContext.DECIMAL64;
      BigDecimal bigDecimal0 = new BigDecimal((-796.319209663743), mathContext0);
      holdingData0.setPurchasePrice(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getPurchasePrice();
      assertEquals((short) (-796), bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = holdingData0.getGain();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = new BigDecimal((-1.0));
      holdingData0.setGain(bigDecimal0);
      String string0 = holdingData0.getGainHTML();
      assertEquals("<FONT color=\"#ff0000\">-1.00</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = new BigDecimal((-1.0));
      holdingData0.setBasis(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getBasis();
      assertEquals((byte) (-1), bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = holdingData0.getPurchasePrice();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = holdingData0.getPrice();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HoldingData holdingData0 = new HoldingData();
      BigDecimal bigDecimal0 = new BigDecimal((-2351));
      holdingData0.setMarketValue(bigDecimal0);
      BigDecimal bigDecimal1 = holdingData0.getMarketValue();
      assertEquals((short) (-2351), bigDecimal1.shortValue());
  }
}