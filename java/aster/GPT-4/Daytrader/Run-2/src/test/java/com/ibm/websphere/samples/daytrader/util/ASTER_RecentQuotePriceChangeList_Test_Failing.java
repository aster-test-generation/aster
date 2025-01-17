/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RecentQuotePriceChangeList_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAdd_WithinThreshold_lhoZ0() {
    RecentQuotePriceChangeList list = new RecentQuotePriceChangeList();
    QuoteDataBean quote = new QuoteDataBean("SY10");
    boolean result = list.add(quote);
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAdd_AboveThreshold_qGWP1() {
    RecentQuotePriceChangeList list = new RecentQuotePriceChangeList();
    QuoteDataBean quote = new QuoteDataBean("SY1000");
    boolean result = list.add(quote);
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAdd_AtThreshold_rhHl2() {
    RecentQuotePriceChangeList list = new RecentQuotePriceChangeList();
    QuoteDataBean quote = new QuoteDataBean("SY950");
    boolean result = list.add(quote);
    assertTrue(result);
  }
}