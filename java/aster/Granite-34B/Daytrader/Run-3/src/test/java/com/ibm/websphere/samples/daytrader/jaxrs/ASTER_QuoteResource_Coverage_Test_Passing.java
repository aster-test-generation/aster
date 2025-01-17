/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.jaxrs;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteResource_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesGetOneSymbol_XRab0() {
    QuoteResource quoteResource = new QuoteResource();
    List<QuoteDataBean> quotes = quoteResource.quotesGet("TEST");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesGetTwoSymbols_VmAV1() {
    QuoteResource quoteResource = new QuoteResource();
    List<QuoteDataBean> quotes = quoteResource.quotesGet("TEST,TEST1");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesGetThreeSymbols_yXmA2() {
    QuoteResource quoteResource = new QuoteResource();
    List<QuoteDataBean> quotes = quoteResource.quotesGet("TEST,TEST1,TEST2");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesGetFourSymbols_eYvV3() {
    QuoteResource quoteResource = new QuoteResource();
    List<QuoteDataBean> quotes = quoteResource.quotesGet("TEST,TEST1,TEST2,TEST3");
    assertEquals(0, quotes.size());
  }
}