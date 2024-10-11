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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Test_Failing {
  private MarketSummaryDataBean marketSummaryDataBean;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintWithNoData_lORx1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.print();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIAWithNullOpenTSIA_PKnw1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, null, 1000.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(null, openTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainPercent_0_zZCh0_fid1() {
    BigDecimal TSIA = new BigDecimal(0.00);
    BigDecimal openTSIA = new BigDecimal(0.00);
    double volume = 0.0;
    Collection<QuoteDataBean> topGainers = new ArrayList<QuoteDataBean>();
    Collection<QuoteDataBean> topLosers = new ArrayList<QuoteDataBean>();
    MarketSummaryDataBean bean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    BigDecimal result = bean.getGainPercent();
    assertEquals(result, new BigDecimal(0.00));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainPercent_1_EAKH1_fid1() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(0.00);
    double volume = 10000000000.0;
    Collection<QuoteDataBean> topGainers = new ArrayList<QuoteDataBean>();
    Collection<QuoteDataBean> topLosers = new ArrayList<QuoteDataBean>();
    MarketSummaryDataBean bean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    BigDecimal result = bean.getGainPercent();
    assertEquals(result, new BigDecimal(100.00));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopGainers_KknQ2() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
    assertNotNull(html);
    assertTrue(html.contains("TSIA"));
    assertTrue(html.contains("openTSIA"));
    assertTrue(html.contains("volume"));
    assertTrue(html.contains("Top Gainers"));
    assertFalse(html.contains("Top Losers"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopLosers_ziJq3() {
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, new ArrayList<QuoteDataBean>(), topLosers);
    String html = marketSummaryData.toHTML();
    assertNotNull(html);
    assertTrue(html.contains("TSIA"));
    assertTrue(html.contains("openTSIA"));
    assertTrue(html.contains("volume"));
    assertFalse(html.contains("Top Gainers"));
    assertTrue(html.contains("Top Losers"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate2_zRqj1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(0), new BigDecimal(0), 0.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate3_OzMg2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(0), new BigDecimal(0), 0.0, new ArrayList<QuoteDataBean>(), null);
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate4_afek3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(0), new BigDecimal(0), 0.0, null, new ArrayList<QuoteDataBean>());
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate5_IuFx4() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(0), new BigDecimal(0), 0.0, null, null);
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate6_DpNw5() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, new BigDecimal(0), 0.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate7_xUax6() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, new BigDecimal(0), 0.0, new ArrayList<QuoteDataBean>(), null);
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate8_IrnI7() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, new BigDecimal(0), 0.0, null, new ArrayList<QuoteDataBean>());
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate9_KRoy8() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, new BigDecimal(0), 0.0, null, null);
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate10_WfIR9() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, null, 0.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate11_pBeL10() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, null, 0.0, new ArrayList<QuoteDataBean>(), null);
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate12_gOYN11() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, null, 0.0, null, new ArrayList<QuoteDataBean>());
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate13_tMhz12() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, null, 0.0, null, null);
    Date actual = marketSummaryDataBean.getSummaryDate();
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopGainers_KknQ2_6_fid3() {
    List<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, topGainers, new ArrayList<QuoteDataBean>());
    String html = marketSummaryData.toHTML();
    assertFalse(html.contains("Top Losers"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopLosers_ziJq3_5() {
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000000, new ArrayList<QuoteDataBean>(), topLosers);
    String html = marketSummaryData.toHTML();
    assertFalse(html.contains("Top Gainers"));
  }
}