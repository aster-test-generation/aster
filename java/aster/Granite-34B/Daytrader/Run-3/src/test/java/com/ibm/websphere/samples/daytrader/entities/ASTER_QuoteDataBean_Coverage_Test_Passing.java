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
  public void testEqualsWithSameSymbol_Qntk0() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean("Symbol1");
    QuoteDataBean quoteDataBean2 = new QuoteDataBean("Symbol1");
    assertTrue(quoteDataBean1.equals(quoteDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentSymbol_CJDc1() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean("Symbol1");
    QuoteDataBean quoteDataBean2 = new QuoteDataBean("Symbol2");
    assertFalse(quoteDataBean1.equals(quoteDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNullSymbol_Ifxo2() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean("Symbol1");
    QuoteDataBean quoteDataBean2 = new QuoteDataBean(null);
    assertFalse(quoteDataBean1.equals(quoteDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSymbolNotEqualToOtherSymbol_zYlC3() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean("Symbol1");
    QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol1");
    assertFalse(quoteDataBean1.equals(quoteDataBean2));
  }
}