/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:13:35 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FinancialUtils_ESTest extends FinancialUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = FinancialUtils.printChangeHTML(0.0);
      assertEquals("<FONT color=\"#009900\">0.0</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-1L));
      BigDecimal bigDecimal1 = FinancialUtils.computeGainPercent(bigDecimal0, bigDecimal0);
      assertEquals((short)0, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HoldingDataBean holdingDataBean0 = HoldingDataBean.getRandomInstance();
      List<HoldingDataBean> list0 = List.of(holdingDataBean0, holdingDataBean0, holdingDataBean0, holdingDataBean0, holdingDataBean0, holdingDataBean0, holdingDataBean0, holdingDataBean0);
      BigDecimal bigDecimal0 = FinancialUtils.computeHoldingsTotal(list0);
      assertEquals((short) (-31936), bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HoldingDataBean holdingDataBean0 = HoldingDataBean.getRandomInstance();
      List<HoldingDataBean> list0 = List.of(holdingDataBean0, holdingDataBean0);
      BigDecimal bigDecimal0 = FinancialUtils.computeHoldingsTotal(list0);
      assertEquals((byte) (-48), bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FinancialUtils financialUtils0 = new FinancialUtils();
      BigDecimal bigDecimal0 = FinancialUtils.computeGain(financialUtils0.HUNDRED, financialUtils0.ONE);
      BigDecimal bigDecimal1 = FinancialUtils.computeGainPercent(bigDecimal0, financialUtils0.ONE);
      assertEquals((short)9800, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        FinancialUtils.printGainPercentHTML((BigDecimal) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.FinancialUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.valueOf((-5643L), (-1732064533));
      // Undeclared exception!
      try { 
        FinancialUtils.printGainPercentHTML(bigDecimal0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // BigInteger would overflow supported range
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        FinancialUtils.printGainHTML((BigDecimal) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.FinancialUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.valueOf((-1914L), 2141463314);
      // Undeclared exception!
      try { 
        FinancialUtils.printGainHTML(bigDecimal0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // BigInteger would overflow supported range
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HoldingDataBean holdingDataBean0 = new HoldingDataBean();
      List<HoldingDataBean> list0 = List.of(holdingDataBean0, holdingDataBean0);
      // Undeclared exception!
      try { 
        FinancialUtils.computeHoldingsTotal(list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.FinancialUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FinancialUtils financialUtils0 = new FinancialUtils();
      List<Object> list0 = List.of((Object) financialUtils0, (Object) financialUtils0);
      // Undeclared exception!
      try { 
        FinancialUtils.computeHoldingsTotal(list0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.ibm.websphere.samples.daytrader.util.FinancialUtils cannot be cast to class com.ibm.websphere.samples.daytrader.entities.HoldingDataBean (com.ibm.websphere.samples.daytrader.util.FinancialUtils and com.ibm.websphere.samples.daytrader.entities.HoldingDataBean are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @75e12265)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.FinancialUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-1163.84));
      MockDate mockDate0 = new MockDate();
      HoldingDataBean holdingDataBean0 = new HoldingDataBean((Integer) null, (-1163.84), bigDecimal0, mockDate0, ")UW]l");
      List<HoldingDataBean> list0 = List.of(holdingDataBean0, holdingDataBean0);
      // Undeclared exception!
      try { 
        FinancialUtils.computeHoldingsTotal(list0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        FinancialUtils.computeGainPercent((BigDecimal) null, (BigDecimal) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.FinancialUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        FinancialUtils.computeGain((BigDecimal) null, (BigDecimal) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.FinancialUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-1100.211221));
      BigDecimal bigDecimal1 = FinancialUtils.computeGain(bigDecimal0, bigDecimal0);
      // Undeclared exception!
      try { 
        FinancialUtils.computeGain(bigDecimal1, bigDecimal0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FinancialUtils financialUtils0 = new FinancialUtils();
      String string0 = FinancialUtils.printGainPercentHTML(financialUtils0.ONE);
      assertEquals("(<B><FONT color=\"#009900\">+1.00%</FONT></B>)<IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = FinancialUtils.printChangeHTML((-3572.1739));
      assertEquals("<FONT color=\"#ff0000\">-3572.1739</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = FinancialUtils.printChangeHTML(108.231120870761);
      assertEquals("<FONT color=\"#009900\">108.231120870761</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FinancialUtils financialUtils0 = new FinancialUtils();
      String string0 = FinancialUtils.printGainHTML(financialUtils0.HUNDRED);
      assertEquals("<FONT color=\"#009900\">100.00</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BigDecimal bigDecimal0 = FinancialUtils.computeHoldingsTotal((Collection<?>) null);
      assertEquals((byte)0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FinancialUtils financialUtils0 = new FinancialUtils();
      BigDecimal bigDecimal0 = FinancialUtils.computeGainPercent(financialUtils0.ONE, financialUtils0.HUNDRED);
      String string0 = FinancialUtils.printGainHTML(bigDecimal0);
      assertEquals("<FONT color=\"#ff0000\">-99.00</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = FinancialUtils.printQuoteLink("");
      assertEquals("<A href=\"app?action=quotes&symbols=\"></A>", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FinancialUtils financialUtils0 = new FinancialUtils();
      BigDecimal bigDecimal0 = FinancialUtils.computeGain(financialUtils0.ONE, financialUtils0.HUNDRED);
      String string0 = FinancialUtils.printGainPercentHTML(bigDecimal0);
      assertEquals("(<B><FONT color=\"#ff0000\">-99.00%</FONT></B>)<IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", string0);
  }
}