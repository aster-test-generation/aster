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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteResource_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesGetWithMultipleSymbols_YZIi0_1() {
    QuoteResource quoteResource = new QuoteResource();
    List<QuoteDataBean> result = quoteResource.quotesGet("AAPL,GOOGL,MSFT");
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesPostWithValidSymbols_mTko0_1() {
    QuoteResource quoteResource = new QuoteResource();
    String symbols = "AAPL,GOOGL,MSFT";
    List<QuoteDataBean> result = quoteResource.quotesPost(symbols);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesGetWithMultipleSymbols_YZIi0_2_fid1() {
    QuoteResource quoteResource = new QuoteResource();
    List<QuoteDataBean> result = quoteResource.quotesGet("AAPL,GOOGL,MSFT");
    assertEquals(0, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesPostWithValidSymbols_mTko0_2_fid1() {
    QuoteResource quoteResource = new QuoteResource();
    String symbols = "AAPL,GOOGL,MSFT";
    List<QuoteDataBean> result = quoteResource.quotesPost(symbols);
    assertTrue(result.isEmpty());
  }
}