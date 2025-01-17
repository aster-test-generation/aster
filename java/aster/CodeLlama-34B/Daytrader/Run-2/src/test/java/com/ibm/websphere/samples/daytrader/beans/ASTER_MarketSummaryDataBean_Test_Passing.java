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
  public void testGetOpenTSIA_Xnlo0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(50), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(new BigDecimal(50), openTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIA_ZeroVolume_iCaD3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(50), 0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(new BigDecimal(50), openTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_DgQh0() {
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
  public void testSetOpenTSIA_tDoR0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal openTSIA = new BigDecimal(1000000);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    assertEquals(openTSIA, marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIAWithNull_YTEG1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setOpenTSIA(null);
    assertNull(marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIAWithZero_sYcT2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal openTSIA = new BigDecimal(0);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    assertEquals(openTSIA, marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIAWithNegativeValue_xPQQ3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal openTSIA = new BigDecimal(-1000000);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    assertEquals(openTSIA, marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIA_OzvE0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setTSIA(new BigDecimal(200));
    assertEquals(new BigDecimal(200), marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIA_TyrR1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setTSIA(new BigDecimal(200));
    assertEquals(new BigDecimal(200), marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(null);
    assertNull(marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(new BigDecimal(300));
    assertEquals(new BigDecimal(300), marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(new BigDecimal(400));
    assertEquals(new BigDecimal(400), marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(null);
    assertNull(marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(new BigDecimal(500));
    assertEquals(new BigDecimal(500), marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(new BigDecimal(600));
    assertEquals(new BigDecimal(600), marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(null);
    assertNull(marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(new BigDecimal(700));
    assertEquals(new BigDecimal(700), marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(new BigDecimal(800));
    assertEquals(new BigDecimal(800), marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(null);
    assertNull(marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(new BigDecimal(900));
    assertEquals(new BigDecimal(900), marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(new BigDecimal(1000));
    assertEquals(new BigDecimal(1000), marketSummaryDataBean.getTSIA());
    marketSummaryDataBean.setTSIA(null);
    assertNull(marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_zgVc0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setVolume(100);
    assertEquals(100, marketSummaryDataBean.getVolume(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate_KfCD0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Date summaryDate = marketSummaryDataBean.getSummaryDate();
    assertNotNull(summaryDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDate_orBI0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Date summaryDate = new Date();
    marketSummaryDataBean.setSummaryDate(summaryDate);
    assertEquals(summaryDate, marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDateNull_EaEQ1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setSummaryDate(null);
    assertNull(marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDateNonNull_QbED2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Date summaryDate = new Date();
    marketSummaryDataBean.setSummaryDate(summaryDate);
    assertNotNull(marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTSIA_dsTM0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(50), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal tsiA = marketSummaryDataBean.getTSIA();
    assertEquals(new BigDecimal(100), tsiA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTSIAWithNullTopGainers_kQpv3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(50), 1000, null, new ArrayList<QuoteDataBean>());
    BigDecimal tsiA = marketSummaryDataBean.getTSIA();
    assertEquals(new BigDecimal(100), tsiA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTSIAWithNullTopLosers_bOPq4() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(50), 1000, new ArrayList<QuoteDataBean>(), null);
    BigDecimal tsiA = marketSummaryDataBean.getTSIA();
    assertEquals(new BigDecimal(100), tsiA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_tilp0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    assertEquals(1000, marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolumeWithZeroVolume_KAaA1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    assertEquals(0, marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolumeWithNegativeVolume_uBGt2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), -1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    assertEquals(-1000, marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_ALgC0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, null, null);
    String html = marketSummaryDataBean.toHTML();
    assertEquals("<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI>", html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_DgQh0_1() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_DgQh0_2() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_DgQh0_3() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_DgQh0_4() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_DgQh0_5() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_DgQh0_6() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_DgQh0_7() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_DgQh0_8() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIA_TyrR1_2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setTSIA(new BigDecimal(200));
    marketSummaryDataBean.setTSIA(null);
    marketSummaryDataBean.setTSIA(new BigDecimal(300));
    marketSummaryDataBean.setTSIA(new BigDecimal(400));
    marketSummaryDataBean.setTSIA(null);
    marketSummaryDataBean.setTSIA(new BigDecimal(500));
    marketSummaryDataBean.setTSIA(new BigDecimal(600));
    marketSummaryDataBean.setTSIA(null);
    marketSummaryDataBean.setTSIA(new BigDecimal(700));
    marketSummaryDataBean.setTSIA(new BigDecimal(800));
    marketSummaryDataBean.setTSIA(null);
    marketSummaryDataBean.setTSIA(new BigDecimal(900));
    marketSummaryDataBean.setTSIA(new BigDecimal(1000));
    marketSummaryDataBean.setTSIA(null);
    assertNull(marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidParameters_YSzh2_piRQ0_1() {
    BigDecimal TSIA = new BigDecimal(1000000.0f);
    BigDecimal openTSIA = new BigDecimal(1000000.0f);
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
  public void testGetRandomInstanceWithValidParameters_YSzh2_piRQ0_2() {
    BigDecimal TSIA = new BigDecimal(1000000.0f);
    BigDecimal openTSIA = new BigDecimal(1000000.0f);
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
  public void testGetRandomInstanceWithValidParameters_YSzh2_piRQ0_3() {
    BigDecimal TSIA = new BigDecimal(1000000.0f);
    BigDecimal openTSIA = new BigDecimal(1000000.0f);
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
  public void testGetRandomInstanceWithValidParameters_YSzh2_piRQ0_4() {
    BigDecimal TSIA = new BigDecimal(1000000.0f);
    BigDecimal openTSIA = new BigDecimal(1000000.0f);
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
  public void testGetRandomInstanceWithValidParameters_YSzh2_piRQ0_5() {
    BigDecimal TSIA = new BigDecimal(1000000.0f);
    BigDecimal openTSIA = new BigDecimal(1000000.0f);
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
  public void testGetRandomInstanceWithValidParameters_YSzh2_piRQ0_6() {
    BigDecimal TSIA = new BigDecimal(1000000.0f);
    BigDecimal openTSIA = new BigDecimal(1000000.0f);
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
}