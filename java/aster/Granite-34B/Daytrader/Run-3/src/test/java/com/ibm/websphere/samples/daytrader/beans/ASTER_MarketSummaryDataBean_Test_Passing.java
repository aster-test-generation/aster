/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Test_Passing {
  private MarketSummaryDataBean marketSummaryDataBean;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testSetVolume_SixP0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setVolume(100.0);
    assertEquals(100.0, marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_CdTz0() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    Assertions.assertNotNull(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eTlY1() {
    List<QuoteDataBean> topLosers = new ArrayList<QuoteDataBean>();
    List<QuoteDataBean> topGainers = new ArrayList<QuoteDataBean>();
    for (int i = 0; i < 5; i++) {
      topLosers.add(QuoteDataBean.getRandomInstance());
      topGainers.add(QuoteDataBean.getRandomInstance());
    }
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(
        new BigDecimal(Double.toString(Math.random() * 1000000)),
        new BigDecimal(Double.toString(Math.random() * 1000000)),
        Math.random() * 1000000, topGainers, topLosers);
    Assertions.assertNotNull(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTopLosers_QwIX0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    marketSummaryDataBean.setTopLosers(topLosers);
    assertEquals(topLosers, marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTopLosersWithNull_mOpv1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopLosers(null);
    assertEquals(null, marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrint_JLoO0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100.00"), new BigDecimal("200.00"), 1000.0, new ArrayList<>(), new ArrayList<>());
    marketSummaryDataBean.print();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIA_QskF0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setTSIA(new BigDecimal(500));
    assertEquals(new BigDecimal(500), marketSummaryDataBean.getTSIA());
  }

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setUp_lgrK0() {
    marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 500, new ArrayList<>(), new ArrayList<>());
  }

  @AfterEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void tearDown_JNCf1() {
    marketSummaryDataBean = null;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getVolume_moiD2() {
    assertEquals(500, marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopLosers_lymr0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("1.0"), new BigDecimal("2.0"), 100.0, null, null);
    Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
    assertEquals(null, topLosers);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIA_nxOM0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100.00"), new BigDecimal("90.00"), 1000.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(new BigDecimal("90.00"), openTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainers_OkJY0() {
    QuoteDataBean quote1 = new QuoteDataBean();
    QuoteDataBean quote2 = new QuoteDataBean();
    QuoteDataBean quote3 = new QuoteDataBean();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(quote1);
    topGainers.add(quote2);
    topGainers.add(quote3);
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopGainers(topGainers);
    Collection<QuoteDataBean> actualTopGainers = marketSummaryDataBean.getTopGainers();
    assertEquals(topGainers, actualTopGainers);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIA_BHSu0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal openTSIA = new BigDecimal(100.0);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    assertEquals(openTSIA, marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIAWithNull_Hjts1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setOpenTSIA(null);
    assertEquals(null, marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainPercent_0_zZCh0() {
    BigDecimal TSIA = new BigDecimal(0.00);
    BigDecimal openTSIA = new BigDecimal(0.00);
    double volume = 0.0;
    Collection<QuoteDataBean> topGainers = new ArrayList<QuoteDataBean>();
    Collection<QuoteDataBean> topLosers = new ArrayList<QuoteDataBean>();
    MarketSummaryDataBean bean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    BigDecimal result = bean.getGainPercent();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainPercent_1_EAKH1() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(0.00);
    double volume = 10000000000.0;
    Collection<QuoteDataBean> topGainers = new ArrayList<QuoteDataBean>();
    Collection<QuoteDataBean> topLosers = new ArrayList<QuoteDataBean>();
    MarketSummaryDataBean bean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    BigDecimal result = bean.getGainPercent();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDate_dRNX0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Date summaryDate = new Date();
    marketSummaryDataBean.setSummaryDate(summaryDate);
    assertEquals(summaryDate, marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDateWithNullDate_LVIC1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setSummaryDate(null);
    assertNull(marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTopGainers_oBxX0() {
    QuoteDataBean bean1 = new QuoteDataBean();
    QuoteDataBean bean2 = new QuoteDataBean();
    QuoteDataBean bean3 = new QuoteDataBean();
    List<QuoteDataBean> gainers = new ArrayList<QuoteDataBean>();
    gainers.add(bean1);
    gainers.add(bean2);
    gainers.add(bean3);
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean();
    marketSummaryData.setTopGainers(gainers);
    assertEquals(gainers, marketSummaryData.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTopGainersNull_Edkd1() {
    List<QuoteDataBean> gainers = null;
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean();
    marketSummaryData.setTopGainers(gainers);
    assertEquals(gainers, marketSummaryData.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTopGainersEmptyList_GMDi2() {
    List<QuoteDataBean> gainers = new ArrayList<QuoteDataBean>();
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean();
    marketSummaryData.setTopGainers(gainers);
    assertEquals(gainers, marketSummaryData.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_MKEU0_1() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
    assertNotNull(html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_MKEU0_2() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("TSIA"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_MKEU0_3() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("openTSIA"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_MKEU0_4() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("volume"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNoTopGainersOrLosers_Osck1_1() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, null, null);
    String html = marketSummaryData.toHTML();
    assertNotNull(html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNoTopGainersOrLosers_Osck1_2() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, null, null);
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("TSIA"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNoTopGainersOrLosers_Osck1_3() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, null, null);
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("openTSIA"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNoTopGainersOrLosers_Osck1_4() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, null, null);
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("volume"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNoTopGainersOrLosers_Osck1_5() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, null, null);
    String html = marketSummaryData.toHTML();
    assertFalse(html.contains("Top Gainers"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNoTopGainersOrLosers_Osck1_6() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, null, null);
    String html = marketSummaryData.toHTML();
    assertFalse(html.contains("Top Losers"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopGainers_KknQ2_1() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
    assertNotNull(html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopGainers_KknQ2_2() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("TSIA"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopGainers_KknQ2_3() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("openTSIA"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopGainers_KknQ2_4() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("volume"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopGainers_KknQ2_5() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("Top Gainers"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopGainers_KknQ2_6() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_MKEU0() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
    assertNotNull(html);
    assertTrue(html.contains("TSIA"));
    assertTrue(html.contains("openTSIA"));
    assertTrue(html.contains("volume"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNoTopGainersOrLosers_Osck1() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, null, null);
    String html = marketSummaryData.toHTML();
    assertNotNull(html);
    assertTrue(html.contains("TSIA"));
    assertTrue(html.contains("openTSIA"));
    assertTrue(html.contains("volume"));
    assertFalse(html.contains("Top Gainers"));
    assertFalse(html.contains("Top Losers"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithBothTopGainersAndLosers_ALkF4() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, topLosers);
    String html = marketSummaryData.toHTML();
    assertNotNull(html);
    assertTrue(html.contains("TSIA"));
    assertTrue(html.contains("openTSIA"));
    assertTrue(html.contains("volume"));
    assertTrue(html.contains("Top Gainers"));
    assertTrue(html.contains("Top Losers"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCoverage_GMpg5() {
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean();
    marketSummaryData.setSummaryDate(new java.util.Date());
    marketSummaryData.setTSIA(new BigDecimal(100));
    marketSummaryData.setOpenTSIA(new BigDecimal(200));
    marketSummaryData.setVolume(1000000);
    marketSummaryData.setTopGainers(new ArrayList<QuoteDataBean>());
    marketSummaryData.setTopLosers(new ArrayList<QuoteDataBean>());
    marketSummaryData.toString();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate_ugCX0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTSIA_OIXG0() {
    MarketSummaryDataBean bean = new MarketSummaryDataBean(new BigDecimal(1), new BigDecimal(2), 3, null, null);
    assertEquals(bean.getTSIA(), new BigDecimal(1));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopLosers_ziJq3_1() {
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, new ArrayList<QuoteDataBean>(), topLosers);
    String html = marketSummaryData.toHTML();
    assertNotNull(html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopLosers_ziJq3_2() {
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, new ArrayList<QuoteDataBean>(), topLosers);
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("TSIA"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopLosers_ziJq3_3() {
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, new ArrayList<QuoteDataBean>(), topLosers);
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("openTSIA"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopLosers_ziJq3_4() {
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, new ArrayList<QuoteDataBean>(), topLosers);
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("volume"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopLosers_ziJq3_6() {
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, new ArrayList<QuoteDataBean>(), topLosers);
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("Top Losers"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithBothTopGainersAndLosers_ALkF4_1() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, topLosers);
    String html = marketSummaryData.toHTML();
    assertNotNull(html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithBothTopGainersAndLosers_ALkF4_2() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, topLosers);
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("TSIA"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithBothTopGainersAndLosers_ALkF4_3() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, topLosers);
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("openTSIA"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithBothTopGainersAndLosers_ALkF4_4() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, topLosers);
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("volume"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithBothTopGainersAndLosers_ALkF4_5() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, topLosers);
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("Top Gainers"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithBothTopGainersAndLosers_ALkF4_6() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, topLosers);
    String html = marketSummaryData.toHTML();
    assertTrue(html.contains("Top Losers"));
  }
}