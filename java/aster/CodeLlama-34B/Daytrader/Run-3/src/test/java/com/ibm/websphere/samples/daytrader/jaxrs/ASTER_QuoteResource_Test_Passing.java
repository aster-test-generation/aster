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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteResource_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesPost_YGlG0_1() {
    QuoteResource quoteResource = new QuoteResource();
    List<QuoteDataBean> quotes = quoteResource.quotesPost("AAPL,GOOG");
    assertNotNull(quotes);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesPost_YGlG0_0() {
    QuoteResource quoteResource = new QuoteResource();
    List<QuoteDataBean> quotes = quoteResource.quotesPost("AAPL,GOOG");
    assertEquals(0, quotes.size());
  }
}