/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteDataBean_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNonQuoteDataBeanObject_IPRY0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    String nonQuoteDataBeanObject = "This is not a QuoteDataBean";
    assertFalse(quoteDataBean.equals(nonQuoteDataBeanObject));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNullSymbol_NulV1() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean(null);
    QuoteDataBean quoteDataBean2 = new QuoteDataBean(null);
    assertTrue(quoteDataBean1.equals(quoteDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentSymbols_WWRL2() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean("AAPL");
    QuoteDataBean quoteDataBean2 = new QuoteDataBean("GOOGL");
    assertFalse(quoteDataBean1.equals(quoteDataBean2));
  }
}