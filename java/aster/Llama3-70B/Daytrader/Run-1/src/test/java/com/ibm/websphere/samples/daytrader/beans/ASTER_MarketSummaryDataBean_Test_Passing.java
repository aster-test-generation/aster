/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIA_UADb0() {
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("10.0"), new BigDecimal("5.0"), 100.0, topGainers, topLosers);
    assertEquals(new BigDecimal("5.0"), marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_withNullTopGainersAndTopLosers_iAVo0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(10), BigDecimal.valueOf(5), 100, null, null);
    String result = marketSummaryDataBean.toString();
    assertEquals("\n\tMarket Summary at: " + marketSummaryDataBean.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryDataBean.getTSIA() + "\n\t\t    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryDataBean.getGainPercent() + "\n\t\t      volume:" + marketSummaryDataBean.getVolume(), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_TSIA_WhRU0() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_TopGainers_xHgV1() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getTopGainers());
    assertEquals(5, marketSummaryDataBean.getTopGainers().size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIA_oGYO0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("10.0"), new BigDecimal("10.0"), 10.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setOpenTSIA(new BigDecimal("20.0"));
    assertEquals(new BigDecimal("20.0"), marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIA_BFmZ0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0, new ArrayList<>(), new ArrayList<>());
    BigDecimal bigDecimal = new BigDecimal("10.0");
    marketSummaryDataBean.setTSIA(bigDecimal);
    assertEquals(bigDecimal, marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_ivWw0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(10), BigDecimal.valueOf(5), 100, new ArrayList<>(), new ArrayList<>());
    marketSummaryDataBean.setVolume(200);
    assertEquals(200, marketSummaryDataBean.getVolume(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTopLosers_KOmb0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0, new ArrayList<>(), new ArrayList<>());
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    marketSummaryDataBean.setTopLosers(topLosers);
    assertEquals(topLosers, marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainers_OsGz0() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean();
    QuoteDataBean quoteDataBean2 = new QuoteDataBean();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(quoteDataBean1);
    topGainers.add(quoteDataBean2);
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("10.0"), new BigDecimal("10.0"), 10.0, topGainers, topLosers);
    assertEquals(topGainers, marketSummaryDataBean.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopLosers_jJcN0() {
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("10.0"), new BigDecimal("10.0"), 10.0, topGainers, topLosers);
    assertEquals(topLosers, marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_withNullTopGainersAndTopLosers_GOKo0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(10), BigDecimal.valueOf(5), 100, null, null);
    String result = marketSummaryDataBean.toHTML();
    assertEquals("<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI>", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTopGainers_nNAV0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0, new ArrayList<>(), new ArrayList<>());
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    marketSummaryDataBean.setTopGainers(topGainers);
    assertEquals(topGainers, marketSummaryDataBean.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_TopGainers_xHgV1_1() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_TopGainers_xHgV1_2() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertEquals(5, marketSummaryDataBean.getTopGainers().size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent2_oteo1_xzzK0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    assertEquals(new BigDecimal("0.00"), marketSummaryDataBean.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate_uwjf0_ngyR1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopGainers(Arrays.asList(new QuoteDataBean()));
    marketSummaryDataBean.setTopLosers(Arrays.asList(new QuoteDataBean()));
    assertNull(marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_withEmptyTopGainersAndTopLosers_tJED1_fid2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(10), BigDecimal.valueOf(5), 100, new ArrayList<>(), new ArrayList<>());
    String result = marketSummaryDataBean.toHTML();
    assertEquals("<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI><BR> Current Top Gainers:<BR>   Current Top Losers:", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent1_tzBm0_dWKK0_fid2() {
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100.0"), new BigDecimal("100.0"), 0.0, topGainers, topLosers);
    assertEquals(new BigDecimal("0.0000"), marketSummaryDataBean.getGainPercent());
  }
}