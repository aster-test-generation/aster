/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummarySingleton_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_DXgf0_1() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotNull(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_DXgf0_2() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotNull(marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_DXgf0_3() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotNull(marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_DXgf0_4() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotEquals(0.0, marketSummaryDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_DXgf0_5() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotNull(marketSummaryDataBean.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_DXgf0_6() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotNull(marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_EJB3Mode_vDlD1_1() {
    TradeConfig.setRunTimeMode(TradeConfig.EJB3);
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotNull(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_EJB3Mode_vDlD1_2() {
    TradeConfig.setRunTimeMode(TradeConfig.EJB3);
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotNull(marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_EJB3Mode_vDlD1_3() {
    TradeConfig.setRunTimeMode(TradeConfig.EJB3);
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotNull(marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_EJB3Mode_vDlD1_4() {
    TradeConfig.setRunTimeMode(TradeConfig.EJB3);
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotEquals(0.0, marketSummaryDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_EJB3Mode_vDlD1_5() {
    TradeConfig.setRunTimeMode(TradeConfig.EJB3);
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotNull(marketSummaryDataBean.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryDataBean_EJB3Mode_vDlD1_6() {
    TradeConfig.setRunTimeMode(TradeConfig.EJB3);
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
    assertNotNull(marketSummaryDataBean.getTopLosers());
  }
}