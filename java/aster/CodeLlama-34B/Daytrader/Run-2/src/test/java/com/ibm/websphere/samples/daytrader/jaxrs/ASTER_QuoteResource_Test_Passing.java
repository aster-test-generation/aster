/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.jaxrs;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteResource_Test_Passing {
  private TradeServices tradeServices;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesPost_ZTPw0_1() {
    QuoteResource quoteResource = new QuoteResource();
    List<QuoteDataBean> quotes = quoteResource.quotesPost("AAPL,GOOG");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesPostWithEmptySymbols_VUjS1() {
    QuoteResource quoteResource = new QuoteResource();
    List<QuoteDataBean> quotes = quoteResource.quotesPost("");
    assertEquals(0, quotes.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesPostWithInvalidSymbols_HQwL2() {
    QuoteResource quoteResource = new QuoteResource();
    List<QuoteDataBean> quotes = quoteResource.quotesPost("ABC,DEF");
    assertEquals(0, quotes.size());
  }
}