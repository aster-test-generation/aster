/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummarySingleton_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean4_yWVd3_fid1() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryDataBeanNull_poLc1_uLRZ0() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    marketSummarySingleton.setMarketSummaryDataBean(null);
    assertNull(marketSummarySingleton.getMarketSummaryDataBean());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryDataBean_AkZa0_NMGr0() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0.0, null, null);
    marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
    assertEquals(marketSummaryDataBean, marketSummarySingleton.getMarketSummaryDataBean());
  }
}