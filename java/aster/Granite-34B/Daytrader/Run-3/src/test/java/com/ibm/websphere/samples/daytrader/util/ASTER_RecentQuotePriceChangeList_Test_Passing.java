/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RecentQuotePriceChangeList_Test_Passing {
  private Random random;
  private QuoteDataBean quoteData;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmpty_WGdC0() {
    RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
    assertTrue(recentQuotePriceChangeList.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRecentList_BNhj0_1() {
    RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
    List<QuoteDataBean> list = recentQuotePriceChangeList.recentList();
    assertNotNull(list);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRecentList_BNhj0_2_fid1() {
    RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
    List<QuoteDataBean> list = recentQuotePriceChangeList.recentList();
    assertEquals(0, list.size());
  }
}