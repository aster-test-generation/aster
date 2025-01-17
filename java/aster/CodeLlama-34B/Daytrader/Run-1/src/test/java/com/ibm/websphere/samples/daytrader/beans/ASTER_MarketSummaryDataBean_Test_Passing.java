/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIA_IBKN0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(new BigDecimal(1000), openTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIAWithDifferentInputs_mxzy1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(new BigDecimal(1000), openTSIA);
    marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(500), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(new BigDecimal(500), openTSIA);
    marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1500), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(new BigDecimal(1500), openTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent_ZAID0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal gainPercent = marketSummaryDataBean.getGainPercent();
    assertEquals(0, gainPercent.compareTo(new BigDecimal(0)));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentWithNullTopGainers_aSTz5() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, null, new ArrayList<QuoteDataBean>());
    BigDecimal gainPercent = marketSummaryDataBean.getGainPercent();
    assertEquals(0, gainPercent.compareTo(new BigDecimal(0)));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_hEdX0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(900), 10000, null, null);
    String expected = "\n\tMarket Summary at: " + marketSummaryDataBean.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryDataBean.getTSIA() + "\n\t\t    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryDataBean.getGainPercent() + "\n\t\t      volume:" + marketSummaryDataBean.getVolume();
    assertEquals(expected, marketSummaryDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_BJUl0() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean);
    assertNotNull(marketSummaryDataBean.getOpenTSIA());
    assertNotNull(marketSummaryDataBean.getGainPercent());
    assertNotNull(marketSummaryDataBean.getSummaryDate());
    assertNotNull(marketSummaryDataBean.getTSIA());
    assertNotNull(marketSummaryDataBean.getVolume());
    assertNotNull(marketSummaryDataBean.getTopGainers());
    assertNotNull(marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithDifferentParameters_FkXb1() {
    BigDecimal openTSIA = TradeConfig.rndBigDecimal(1000000.0f);
    BigDecimal TSIA = TradeConfig.rndBigDecimal(1000000.0f);
    double volume = TradeConfig.rndQuantity();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    for (int ii = 0; ii < 5; ii++) {
      QuoteDataBean quote1 = QuoteDataBean.getRandomInstance();
      QuoteDataBean quote2 = QuoteDataBean.getRandomInstance();
      topGainers.add(quote1);
      topLosers.add(quote2);
    }
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    assertNotNull(marketSummaryDataBean);
    assertEquals(TSIA, marketSummaryDataBean.getTSIA());
    assertEquals(openTSIA, marketSummaryDataBean.getOpenTSIA());
    assertEquals(volume, marketSummaryDataBean.getVolume());
    assertEquals(topGainers, marketSummaryDataBean.getTopGainers());
    assertEquals(topLosers, marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIA_lDhA0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(50), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setOpenTSIA(new BigDecimal(150));
    assertEquals(new BigDecimal(150), marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIAWithNull_FbVc1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(50), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setOpenTSIA(null);
    assertNull(marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIA_MhtA0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal tSIA = new BigDecimal(1000);
    marketSummaryDataBean.setTSIA(tSIA);
    assertEquals(tSIA, marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIAWithZero_zUdA1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal tSIA = new BigDecimal(0);
    marketSummaryDataBean.setTSIA(tSIA);
    assertEquals(tSIA, marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIAWithNegative_xhum5() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal tSIA = new BigDecimal(-1000);
    marketSummaryDataBean.setTSIA(tSIA);
    assertEquals(tSIA, marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_Pukw0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setVolume(100);
    assertEquals(100, marketSummaryDataBean.getVolume(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolumeWithNegativeValue_yldB1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setVolume(-100);
    assertEquals(-100, marketSummaryDataBean.getVolume(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolumeWithZeroValue_tNTx2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setVolume(0);
    assertEquals(0, marketSummaryDataBean.getVolume(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDateWithNullSummaryDate_daMX1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(500), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setSummaryDate(null);
    Date summaryDate = marketSummaryDataBean.getSummaryDate();
    assertNull(summaryDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDate_UBvK0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Date summaryDate = new Date();
    marketSummaryDataBean.setSummaryDate(summaryDate);
    assertEquals(summaryDate, marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDateWithNull_qkWV1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setSummaryDate(null);
    assertNull(marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTSIA_kzyK0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(50), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal TSIA = marketSummaryDataBean.getTSIA();
    assertEquals(new BigDecimal(100), TSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_ceBY0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    assertEquals(100, marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolumeWithZeroVolume_RQSK1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    assertEquals(0, marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolumeWithNegativeVolume_nDSF2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), -100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    assertEquals(-100, marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopLosers_exAi0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
    assertNotNull(topLosers);
    assertEquals(0, topLosers.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML2_SnWS1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, null, null);
    String expected = "<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI>";
    assertEquals(expected, marketSummaryDataBean.toHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIAWithDifferentInputs_mxzy1_3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
    marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(500), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    openTSIA = marketSummaryDataBean.getOpenTSIA();
    marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1500), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(new BigDecimal(1500), openTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_BJUl0_1() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_BJUl0_2() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_BJUl0_3() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_BJUl0_4() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_BJUl0_5() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_BJUl0_6() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_BJUl0_7() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_BJUl0_8() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithDifferentParameters_FkXb1_1() {
    BigDecimal openTSIA = TradeConfig.rndBigDecimal(1000000.0f);
    BigDecimal TSIA = TradeConfig.rndBigDecimal(1000000.0f);
    double volume = TradeConfig.rndQuantity();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    for (int ii = 0; ii < 5; ii++) {
      QuoteDataBean quote1 = QuoteDataBean.getRandomInstance();
      QuoteDataBean quote2 = QuoteDataBean.getRandomInstance();
      topGainers.add(quote1);
      topLosers.add(quote2);
    }
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    assertNotNull(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithDifferentParameters_FkXb1_2() {
    BigDecimal openTSIA = TradeConfig.rndBigDecimal(1000000.0f);
    BigDecimal TSIA = TradeConfig.rndBigDecimal(1000000.0f);
    double volume = TradeConfig.rndQuantity();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    for (int ii = 0; ii < 5; ii++) {
      QuoteDataBean quote1 = QuoteDataBean.getRandomInstance();
      QuoteDataBean quote2 = QuoteDataBean.getRandomInstance();
      topGainers.add(quote1);
      topLosers.add(quote2);
    }
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    assertEquals(TSIA, marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithDifferentParameters_FkXb1_3() {
    BigDecimal openTSIA = TradeConfig.rndBigDecimal(1000000.0f);
    BigDecimal TSIA = TradeConfig.rndBigDecimal(1000000.0f);
    double volume = TradeConfig.rndQuantity();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    for (int ii = 0; ii < 5; ii++) {
      QuoteDataBean quote1 = QuoteDataBean.getRandomInstance();
      QuoteDataBean quote2 = QuoteDataBean.getRandomInstance();
      topGainers.add(quote1);
      topLosers.add(quote2);
    }
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    assertEquals(openTSIA, marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithDifferentParameters_FkXb1_4() {
    BigDecimal openTSIA = TradeConfig.rndBigDecimal(1000000.0f);
    BigDecimal TSIA = TradeConfig.rndBigDecimal(1000000.0f);
    double volume = TradeConfig.rndQuantity();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    for (int ii = 0; ii < 5; ii++) {
      QuoteDataBean quote1 = QuoteDataBean.getRandomInstance();
      QuoteDataBean quote2 = QuoteDataBean.getRandomInstance();
      topGainers.add(quote1);
      topLosers.add(quote2);
    }
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    assertEquals(volume, marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithDifferentParameters_FkXb1_5() {
    BigDecimal openTSIA = TradeConfig.rndBigDecimal(1000000.0f);
    BigDecimal TSIA = TradeConfig.rndBigDecimal(1000000.0f);
    double volume = TradeConfig.rndQuantity();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    for (int ii = 0; ii < 5; ii++) {
      QuoteDataBean quote1 = QuoteDataBean.getRandomInstance();
      QuoteDataBean quote2 = QuoteDataBean.getRandomInstance();
      topGainers.add(quote1);
      topLosers.add(quote2);
    }
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    assertEquals(topGainers, marketSummaryDataBean.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithDifferentParameters_FkXb1_6() {
    BigDecimal openTSIA = TradeConfig.rndBigDecimal(1000000.0f);
    BigDecimal TSIA = TradeConfig.rndBigDecimal(1000000.0f);
    double volume = TradeConfig.rndQuantity();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    for (int ii = 0; ii < 5; ii++) {
      QuoteDataBean quote1 = QuoteDataBean.getRandomInstance();
      QuoteDataBean quote2 = QuoteDataBean.getRandomInstance();
      topGainers.add(quote1);
      topLosers.add(quote2);
    }
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    assertEquals(topLosers, marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate_NNaO0_1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(500), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Date summaryDate = marketSummaryDataBean.getSummaryDate();
    assertNotNull(summaryDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate_NNaO0_2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(500), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Date summaryDate = marketSummaryDataBean.getSummaryDate();
    assertEquals(summaryDate, new Date());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopLosers_exAi0_1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
    assertNotNull(topLosers);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopLosers_exAi0_2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
    assertEquals(0, topLosers.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentWithNullVolume_wUZM4_wHag0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 0.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal gainPercent = marketSummaryDataBean.getGainPercent();
    assertEquals(0, gainPercent.compareTo(new BigDecimal(0)));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolumeWithNullValue_HBUO3_yTaV0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setVolume(0.0);
    assertEquals(0.0, marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIAWithDifferentInputs_mxzy1_1_fid2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
    marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(500), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    openTSIA = marketSummaryDataBean.getOpenTSIA();
    marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1500), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    openTSIA = marketSummaryDataBean.getOpenTSIA();
  }
}