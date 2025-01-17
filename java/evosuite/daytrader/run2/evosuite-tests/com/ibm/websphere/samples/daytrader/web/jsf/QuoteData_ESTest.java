/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:52:00 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.web.jsf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.websphere.samples.daytrader.web.jsf.QuoteData;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QuoteData_ESTest extends QuoteData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      BigInteger bigInteger0 = BigInteger.TWO;
      BigDecimal bigDecimal1 = new BigDecimal(bigInteger0);
      QuoteData quoteData0 = new QuoteData(bigDecimal1, bigDecimal0, "");
      String string0 = quoteData0.getChangeHTML();
      assertEquals("<FONT color=\"#009900\">1.00</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-1));
      Double double0 = new Double(0.0);
      Double double1 = new Double(2235.00637578);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "", bigDecimal0, bigDecimal0, "i2", double0, double1);
      assertEquals("i2", quoteData0.getCompanyName());
      assertEquals("", quoteData0.getSymbol());
      assertEquals(0.0, quoteData0.getVolume(), 0.01);
      assertEquals("-1--1", quoteData0.getRange());
      assertEquals(2235.00637578, quoteData0.getChange(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-1));
      BigDecimal bigDecimal1 = bigDecimal0.movePointLeft(0);
      Double double0 = new Double(0.0);
      QuoteData quoteData0 = new QuoteData(bigDecimal1, bigDecimal1, "", bigDecimal0, bigDecimal0, "\"C1", double0, double0);
      assertEquals("", quoteData0.getSymbol());
      assertEquals("\"C1", quoteData0.getCompanyName());
      assertEquals("-1--1", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-105L));
      Double double0 = new Double(1.0);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "", bigDecimal0, bigDecimal0, "", double0, double0);
      double double1 = quoteData0.getVolume();
      assertEquals(1.0, double1, 0.01);
      assertEquals("-105--105", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double((-579.32494028));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "", bigDecimal0, bigDecimal0, "/x&p", double0, double0);
      double double1 = quoteData0.getVolume();
      assertEquals("10-10", quoteData0.getRange());
      assertEquals("", quoteData0.getSymbol());
      assertEquals("/x&p", quoteData0.getCompanyName());
      assertEquals((-579.32494028), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-579.32494028));
      Double double0 = new Double((-579.32494028));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "", bigDecimal0, bigDecimal0, "####0.00", double0, double0);
      String string0 = quoteData0.getSymbol();
      assertEquals("-579.324940279999964332091622054576873779296875--579.324940279999964332091622054576873779296875", quoteData0.getRange());
      assertEquals("", string0);
      assertEquals("####0.00", quoteData0.getCompanyName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "dF?`u\"/]F)VR`:");
      String string0 = quoteData0.getRange();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-919));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "arrowdown.gif");
      quoteData0.setPrice((BigDecimal) null);
      BigDecimal bigDecimal1 = quoteData0.getPrice();
      assertNull(bigDecimal1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "</FONT><IMG src=\"images/");
      BigDecimal bigDecimal1 = quoteData0.getPrice();
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "dF?`u\"/]F)VR`:");
      BigDecimal bigDecimal1 = BigDecimal.valueOf((-1L), 0);
      quoteData0.setPrice(bigDecimal1);
      BigDecimal bigDecimal2 = quoteData0.getPrice();
      assertEquals((short) (-1), bigDecimal2.shortValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      BigDecimal bigDecimal1 = new BigDecimal(0L);
      Double double0 = new Double((-3675.9031996491));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, (String) null, bigDecimal0, bigDecimal1, "", double0, double0);
      quoteData0.setOpen(bigDecimal1);
      quoteData0.getOpen();
      assertEquals("10-0", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      BigDecimal bigDecimal1 = BigDecimal.valueOf((-1L), 0);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal1, "2w#f0qk");
      BigDecimal bigDecimal2 = quoteData0.getOpen();
      assertEquals(1.0, quoteData0.getChange(), 0.01);
      assertEquals((short) (-1), bigDecimal2.shortValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "dF?`u\"/]F)VR`:");
      quoteData0.setLow(bigDecimal0);
      BigDecimal bigDecimal1 = quoteData0.getLow();
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double((-579.32494028));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "", bigDecimal0, bigDecimal0, "/x&p", double0, double0);
      quoteData0.getLow();
      assertEquals("/x&p", quoteData0.getCompanyName());
      assertEquals("", quoteData0.getSymbol());
      assertEquals("10-10", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-1));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "");
      quoteData0.setLow(bigDecimal0);
      BigDecimal bigDecimal1 = quoteData0.getLow();
      assertSame(bigDecimal0, bigDecimal1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "");
      BigDecimal bigDecimal1 = quoteData0.getHigh();
      assertNull(bigDecimal1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "dF?`u\"/]F)VR`:");
      quoteData0.setHigh(bigDecimal0);
      BigDecimal bigDecimal1 = quoteData0.getHigh();
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "dF?`u\"/]F)VR`:");
      BigDecimal bigDecimal1 = BigDecimal.valueOf((-1L), 0);
      quoteData0.setHigh(bigDecimal1);
      BigDecimal bigDecimal2 = quoteData0.getHigh();
      assertEquals((short) (-1), bigDecimal2.shortValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double((-579.32494028));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "", bigDecimal0, bigDecimal0, "/x&p", double0, double0);
      quoteData0.getGainPercentHTML();
      assertEquals("10-10", quoteData0.getRange());
      assertEquals("", quoteData0.getSymbol());
      assertEquals("/x&p", quoteData0.getCompanyName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-1));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "");
      BigDecimal bigDecimal1 = quoteData0.getGainPercent();
      assertNull(bigDecimal1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double((-579.32494028));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "", bigDecimal0, bigDecimal0, "/x&p", double0, double0);
      quoteData0.setGainPercent(bigDecimal0);
      BigDecimal bigDecimal1 = quoteData0.getGainPercent();
      assertNotSame(bigDecimal1, bigDecimal0);
      assertEquals("/x&p", quoteData0.getCompanyName());
      assertEquals("10-10", quoteData0.getRange());
      assertEquals("", quoteData0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "dF?`u\"/]F)VR`:");
      BigDecimal bigDecimal1 = BigDecimal.valueOf((-1L), 0);
      quoteData0.setGainPercent(bigDecimal1);
      BigDecimal bigDecimal2 = quoteData0.getGainPercent();
      assertNotSame(bigDecimal2, bigDecimal1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "dF?`u\"/]F)VR`:");
      quoteData0.setGain(bigDecimal0);
      String string0 = quoteData0.getGainHTML();
      assertEquals("<FONT color=\"#009900\">0.00</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "dF?`u\"/]F)VR`:");
      BigDecimal bigDecimal1 = quoteData0.getGain();
      assertNull(bigDecimal1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double((-579.32494028));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "", bigDecimal0, bigDecimal0, "/x&p", double0, double0);
      quoteData0.setGain(bigDecimal0);
      quoteData0.getGain();
      assertEquals("10-10", quoteData0.getRange());
      assertEquals("", quoteData0.getSymbol());
      assertEquals("/x&p", quoteData0.getCompanyName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      BigDecimal bigDecimal1 = new BigDecimal(1.0);
      Double double0 = new Double(1463.905545787433);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal1, "FTAuIY6PP\"Nh#|LU", bigDecimal0, bigDecimal1, "FTAuIY6PP\"Nh#|LU", double0, double0);
      BigDecimal bigDecimal2 = quoteData0.getGain();
      assertEquals("10-1", quoteData0.getRange());
      assertEquals((byte) (-9), bigDecimal2.byteValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "dF?`u\"/]F)VR`:");
      String string0 = quoteData0.getCompanyName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-1651L));
      Double double0 = new Double((-1325.90442));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "", bigDecimal0, bigDecimal0, ")KM(`[>", double0, double0);
      assertEquals(")KM(`[>", quoteData0.getCompanyName());
      
      quoteData0.setCompanyName("");
      quoteData0.getCompanyName();
      assertEquals("", quoteData0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-919));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "arrowdown.gif");
      double double0 = quoteData0.getChange();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double((-1.0));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "Ve", bigDecimal0, bigDecimal0, "Ve", double0, double0);
      double double1 = quoteData0.getChange();
      assertEquals("10-10", quoteData0.getRange());
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-1));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "!~==I:'5@[J}p],[3");
      // Undeclared exception!
      try { 
        quoteData0.setGainPercent((BigDecimal) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.web.jsf.QuoteData", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "V");
      BigDecimal bigDecimal1 = new BigDecimal((-1314.579));
      // Undeclared exception!
      try { 
        quoteData0.setGainPercent(bigDecimal1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      QuoteData quoteData0 = null;
      try {
        quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "", bigDecimal0, bigDecimal0, "", (Double) null, (Double) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.web.jsf.QuoteData", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(1167.603067531899);
      BigDecimal bigDecimal1 = BigDecimal.ZERO;
      Double double0 = new Double(2235.00637578);
      QuoteData quoteData0 = null;
      try {
        quoteData0 = new QuoteData(bigDecimal0, bigDecimal1, "", bigDecimal0, bigDecimal0, "", double0, double0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QuoteData quoteData0 = null;
      try {
        quoteData0 = new QuoteData((BigDecimal) null, (BigDecimal) null, "k&2pq;0D$dIo");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.web.jsf.QuoteData", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigDecimal bigDecimal1 = new BigDecimal((-1912.7563038348));
      QuoteData quoteData0 = null;
      try {
        quoteData0 = new QuoteData(bigDecimal1, bigDecimal0, "");
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Rounding necessary
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double((-579.32494028));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "", bigDecimal0, bigDecimal0, "/x&p", double0, double0);
      String string0 = quoteData0.getChangeHTML();
      assertEquals("/x&p", quoteData0.getCompanyName());
      assertEquals("", quoteData0.getSymbol());
      assertEquals("<FONT color=\"#cc0000\">-579.32</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", string0);
      assertEquals("10-10", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "dF?`u\"/]F)VR`:");
      String string0 = quoteData0.getChangeHTML();
      assertEquals("<FONT color=\"#009900\">0.00</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double(1463.905545787433);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", double0, double0);
      String string0 = quoteData0.getRange();
      assertEquals("10-10", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double(1463.905545787433);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", double0, double0);
      quoteData0.getHigh();
      assertEquals("10-10", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "dF?`u\"/]F)VR`:");
      double double0 = quoteData0.getVolume();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double(1463.905545787433);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", double0, double0);
      quoteData0.getSymbol();
      assertEquals("10-10", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double(1463.905545787433);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", double0, double0);
      quoteData0.getCompanyName();
      assertEquals("10-10", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double(1463.905545787433);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", double0, double0);
      quoteData0.getOpen();
      assertEquals("10-10", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "(<B><FONT color=\"#009900\">+");
      quoteData0.setVolume(3859.69);
      assertEquals(3859.69, quoteData0.getVolume(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double(1463.905545787433);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", double0, double0);
      double double1 = quoteData0.getChange();
      assertEquals("10-10", quoteData0.getRange());
      assertEquals(1463.905545787433, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double(1463.905545787433);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", double0, double0);
      quoteData0.getPrice();
      assertEquals("10-10", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double(1463.905545787433);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", double0, double0);
      quoteData0.getGainPercent();
      assertEquals("10-10", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double(1463.905545787433);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", double0, double0);
      quoteData0.getGain();
      assertEquals("10-10", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "dF?`u\"/]F)VR`:");
      // Undeclared exception!
      try { 
        quoteData0.getGainHTML();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.FinancialUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Double double0 = new Double(1463.905545787433);
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", bigDecimal0, bigDecimal0, "FTAuIY6PP\"Nh#|LU", double0, double0);
      quoteData0.setSymbol((String) null);
      quoteData0.getSymbol();
      assertEquals("10-10", quoteData0.getRange());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "t");
      // Undeclared exception!
      try { 
        quoteData0.getGainPercentHTML();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.FinancialUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-1));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "");
      quoteData0.setRange("");
      String string0 = quoteData0.getRange();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-919));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "");
      quoteData0.setChange((-919));
      assertEquals((-919.0), quoteData0.getChange(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-1));
      QuoteData quoteData0 = new QuoteData(bigDecimal0, bigDecimal0, "");
      BigDecimal bigDecimal1 = quoteData0.getLow();
      assertNull(bigDecimal1);
  }
}
