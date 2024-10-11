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

public class Aster_QuoteResource_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesGet_NewArrayList_MvXW0() {
    QuoteResource quoteResource = new QuoteResource();
    String symbols = "symbol1,symbol2";
    List<QuoteDataBean> result = quoteResource.quotesGet(symbols);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesGet_SplitSymbols_rssW1() {
    QuoteResource quoteResource = new QuoteResource();
    String symbols = "symbol1,symbol0";
    List<QuoteDataBean> result = quoteResource.quotesGet(symbols);
    assertEquals(0, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesGet_ForLoop_pmGk2() {
    QuoteResource quoteResource = new QuoteResource();
    String symbols = "symbol1,symbol2,symbol0";
    List<QuoteDataBean> result = quoteResource.quotesGet(symbols);
    assertEquals(0, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesGet_PrintStackTrace_cMCn6() {
    QuoteResource quoteResource = new QuoteResource();
    String symbols = "symbol1";
    List<QuoteDataBean> result = quoteResource.quotesGet(symbols);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuotesGet_EmptySymbols_Vvfo8() {
    QuoteResource quoteResource = new QuoteResource();
    String symbols = "";
    List<QuoteDataBean> result = quoteResource.quotesGet(symbols);
    assertEquals(0, result.size());
  }
}