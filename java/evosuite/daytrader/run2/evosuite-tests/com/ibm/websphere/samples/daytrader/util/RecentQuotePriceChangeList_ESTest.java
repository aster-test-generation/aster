/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:10:52 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.RecentQuotePriceChangeList;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RecentQuotePriceChangeList_ESTest extends RecentQuotePriceChangeList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RecentQuotePriceChangeList recentQuotePriceChangeList0 = new RecentQuotePriceChangeList();
      TradeConfig.setMAX_QUOTES(2147483645);
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      boolean boolean0 = recentQuotePriceChangeList0.add(quoteDataBean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RecentQuotePriceChangeList recentQuotePriceChangeList0 = new RecentQuotePriceChangeList();
      QuoteDataBean quoteDataBean0 = new QuoteDataBean("");
      // Undeclared exception!
      try { 
        recentQuotePriceChangeList0.add(quoteDataBean0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RecentQuotePriceChangeList recentQuotePriceChangeList0 = new RecentQuotePriceChangeList();
      QuoteDataBean quoteDataBean0 = new QuoteDataBean("MxFc@N<JaZ)#1b=f.R");
      // Undeclared exception!
      try { 
        recentQuotePriceChangeList0.add(quoteDataBean0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Fc@N<JaZ)#1b=f.R\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RecentQuotePriceChangeList recentQuotePriceChangeList0 = new RecentQuotePriceChangeList();
      QuoteDataBean quoteDataBean0 = new QuoteDataBean();
      // Undeclared exception!
      try { 
        recentQuotePriceChangeList0.add(quoteDataBean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.RecentQuotePriceChangeList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RecentQuotePriceChangeList recentQuotePriceChangeList0 = new RecentQuotePriceChangeList();
      boolean boolean0 = recentQuotePriceChangeList0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RecentQuotePriceChangeList recentQuotePriceChangeList0 = new RecentQuotePriceChangeList();
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      // Undeclared exception!
      try { 
        recentQuotePriceChangeList0.add(quoteDataBean0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/enterprise/event/NotificationOptions
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.RecentQuotePriceChangeList", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RecentQuotePriceChangeList recentQuotePriceChangeList0 = new RecentQuotePriceChangeList();
      TradeConfig.setMAX_QUOTES(0);
      QuoteDataBean quoteDataBean0 = QuoteDataBean.getRandomInstance();
      boolean boolean0 = recentQuotePriceChangeList0.add(quoteDataBean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RecentQuotePriceChangeList recentQuotePriceChangeList0 = new RecentQuotePriceChangeList();
      List<QuoteDataBean> list0 = recentQuotePriceChangeList0.recentList();
      assertTrue(list0.isEmpty());
  }
}
