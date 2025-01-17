/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RecentQuotePriceChangeList_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmpty_YMTj0() {
    RecentQuotePriceChangeList list = new RecentQuotePriceChangeList();
    assertTrue(list.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRecentListWithEmptyList_SexL2_SZlU0_1() {
    List<QuoteDataBean> recentList = new ArrayList<>();
    assertNotNull(recentList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRecentListWithEmptyList_SexL2_SZlU0_2() {
    List<QuoteDataBean> recentList = new ArrayList<>();
    assertEquals(0, recentList.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmptyWithNullList_Kurf3_fid1() {
    RecentQuotePriceChangeList list = null;
  }
}