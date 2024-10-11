/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummarySingleton_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_JeYA0_1() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotNull(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_JeYA0_2() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertEquals(marketSummaryDataBean.getTSIA(), new BigDecimal(100));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_JeYA0_3() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertEquals(marketSummaryDataBean.getOpenTSIA(), new BigDecimal(100));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_JeYA0_4() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertEquals(marketSummaryDataBean.getVolume(), 100.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_JeYA0_5() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertEquals(marketSummaryDataBean.getTopGainers().size(), 5);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_JeYA0_6() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertEquals(marketSummaryDataBean.getTopLosers().size(), 5);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBeanWithEmptyQuotes_XPPN1_2() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertEquals(marketSummaryDataBean.getTSIA(), new BigDecimal(0));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBeanWithEmptyQuotes_XPPN1_3() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertEquals(marketSummaryDataBean.getOpenTSIA(), new BigDecimal(0));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBeanWithEmptyQuotes_XPPN1_4() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertEquals(marketSummaryDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBeanWithEmptyQuotes_XPPN1_5() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertEquals(marketSummaryDataBean.getTopGainers().size(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBeanWithEmptyQuotes_XPPN1_6() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertEquals(marketSummaryDataBean.getTopLosers().size(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryDataBean_vwVu0() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setOpenTSIA(BigDecimal.valueOf(100.0));
    marketSummaryDataBean.setTSIA(BigDecimal.valueOf(100.0));
    marketSummaryDataBean.setVolume(100.0);
    marketSummaryDataBean.setTopGainers(new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setTopLosers(new ArrayList<QuoteDataBean>());
    marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
    assertEquals(marketSummaryDataBean, marketSummarySingleton.getMarketSummaryDataBean());
  }
}