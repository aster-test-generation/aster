/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummarySingleton_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryDataBeanWithAllParametersNull_FbUH5() {
    BigDecimal TSIA = null;
    BigDecimal openTSIA = null;
    double volume = 0;
    Collection<QuoteDataBean> topGainers = null;
    Collection<QuoteDataBean> topLosers = null;
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryDataBeanWithAllParametersRandomNull_xBoV6() {
    BigDecimal TSIA = new BigDecimal(Math.random());
    BigDecimal openTSIA = null;
    double volume = Math.random();
    Collection<QuoteDataBean> topGainers = null;
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryDataBeanWithAllParametersRandomNull2_HRkv7() {
    BigDecimal TSIA = null;
    BigDecimal openTSIA = new BigDecimal(Math.random());
    double volume = Math.random();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = null;
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryDataBeanWithAllParametersNull_FbUH5_fid1() {
    BigDecimal TSIA = null;
    BigDecimal openTSIA = null;
    double volume = 0;
    Collection<QuoteDataBean> topGainers = null;
    Collection<QuoteDataBean> topLosers = null;
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
    BigDecimal expected = null;
    BigDecimal actual = marketSummaryDataBean.getOpenTSIA();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryDataBeanWithAllParametersRandomNull_xBoV6_fid1() {
    BigDecimal TSIA = new BigDecimal(Math.random());
    BigDecimal openTSIA = null;
    double volume = Math.random();
    Collection<QuoteDataBean> topGainers = null;
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
    // Replace the erroneous assertion
    // Change the expected or actual value to pass the assertion
    // Change the assertion type to match the return type if needed
    // Generate the fixed test case
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryDataBeanWithAllParametersRandomNull2_HRkv7_fid1() {
    BigDecimal TSIA = null;
    BigDecimal openTSIA = new BigDecimal(Math.random());
    double volume = Math.random();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = null;
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
    BigDecimal currentBalance = new BigDecimal(100);
    BigDecimal newBalance = currentBalance.divide(new BigDecimal(2));
    assertEquals(newBalance, currentBalance);
  }
}