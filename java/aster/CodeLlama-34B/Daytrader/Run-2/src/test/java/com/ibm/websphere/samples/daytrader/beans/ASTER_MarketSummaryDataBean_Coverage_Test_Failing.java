/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.json.JsonObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Coverage_Test_Failing {
  private Iterator<QuoteDataBean> iterator;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_TopGainersNull_QYTK0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0.0, null, null);
    String expected = "\n\tMarket Summary at: null\n\t\t        TSIA:0\n\t\t    openTSIA:0\n\t\t        gain:0.0\n\t\t      volume:0.0";
    assertEquals(expected, marketSummaryDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_TopGainersEmpty_LBJu2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0.0, new ArrayList<QuoteDataBean>(), null);
    String expected = "\n\tMarket Summary at: null\n\t\t        TSIA:0\n\t\t    openTSIA:0\n\t\t        gain:0.0\n\t\t      volume:0.0\n\t\t   Current Top Gainers:";
    assertEquals(expected, marketSummaryDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_TopLosersEmpty_VaVi3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0.0, null, new ArrayList<QuoteDataBean>());
    String expected = "\n\tMarket Summary at: null\n\t\t        TSIA:0\n\t\t    openTSIA:0\n\t\t        gain:0.0\n\t\t      volume:0.0\n\t\t   Current Top Losers:";
    assertEquals(expected, marketSummaryDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_TopGainersAndLosersEmpty_gLCR4() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    String expected = "\n\tMarket Summary at: null\n\t\t        TSIA:0\n\t\t    openTSIA:0\n\t\t        gain:0.0\n\t\t      volume:0.0\n\t\t   Current Top Gainers:\n\t\t   Current Top Losers:";
    assertEquals(expected, marketSummaryDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithEmptyCollections_MDvI1_jNPC1_1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal TSIA = BigDecimal.valueOf(1000);
    BigDecimal openTSIA = BigDecimal.valueOf(900);
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    marketSummaryDataBean.setTSIA(TSIA);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    marketSummaryDataBean.setVolume(volume);
    marketSummaryDataBean.setTopGainers(topGainers);
    marketSummaryDataBean.setTopLosers(topLosers);
    JsonObject actual = marketSummaryDataBean.toJSON();
    assertEquals(TSIA.toString(), actual.get("tsia").toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithEmptyCollections_MDvI1_jNPC1_2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal TSIA = BigDecimal.valueOf(1000);
    BigDecimal openTSIA = BigDecimal.valueOf(900);
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    marketSummaryDataBean.setTSIA(TSIA);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    marketSummaryDataBean.setVolume(volume);
    marketSummaryDataBean.setTopGainers(topGainers);
    marketSummaryDataBean.setTopLosers(topLosers);
    JsonObject actual = marketSummaryDataBean.toJSON();
    assertEquals(volume, actual.get("volume"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithEmptyCollections_MDvI1_jNPC1_5() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal TSIA = BigDecimal.valueOf(1000);
    BigDecimal openTSIA = BigDecimal.valueOf(900);
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    marketSummaryDataBean.setTSIA(TSIA);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    marketSummaryDataBean.setVolume(volume);
    marketSummaryDataBean.setTopGainers(topGainers);
    marketSummaryDataBean.setTopLosers(topLosers);
    JsonObject actual = marketSummaryDataBean.toJSON();
    assertEquals(0, actual.get("gainer1_change"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopGainers_ZZtf1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    marketSummaryDataBean.setTopGainers(topGainers);
    String html = marketSummaryDataBean.toHTML();
    assertTrue(html.contains("<BR> Current Top Gainers:"));
    assertTrue(html.contains("<LI>"));
    assertTrue(html.contains("</LI>"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopLosers_yBQQ2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    marketSummaryDataBean.setTopLosers(topLosers);
    String html = marketSummaryDataBean.toHTML();
    assertTrue(html.contains("<BR>   Current Top Losers:"));
    assertTrue(html.contains("<LI>"));
    assertTrue(html.contains("</LI>"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopGainers_ZZtf1_1_fid2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    marketSummaryDataBean.setTopGainers(topGainers);
    String html = marketSummaryDataBean.toHTML();
    assertTrue(html.contains("<BR> Current Top Gainers:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithTopLosers_yBQQ2_1_fid2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    marketSummaryDataBean.setTopLosers(topLosers);
    String html = marketSummaryDataBean.toHTML();
    assertTrue(html.contains("<BR>   Current Top Losers:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithEmptyCollections_MDvI1_jNPC1_1_fid2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal TSIA = BigDecimal.valueOf(1000);
    BigDecimal openTSIA = BigDecimal.valueOf(900);
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    marketSummaryDataBean.setTSIA(TSIA);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    marketSummaryDataBean.setVolume(volume);
    marketSummaryDataBean.setTopGainers(topGainers);
    marketSummaryDataBean.setTopLosers(topLosers);
    JsonObject actual = marketSummaryDataBean.toJSON();
    assertEquals(TSIA.toString(), actual.get("tsia"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithEmptyCollections_MDvI1_jNPC1_3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal TSIA = BigDecimal.valueOf(1000);
    BigDecimal openTSIA = BigDecimal.valueOf(900);
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    marketSummaryDataBean.setTSIA(TSIA);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    marketSummaryDataBean.setVolume(volume);
    marketSummaryDataBean.setTopGainers(topGainers);
    marketSummaryDataBean.setTopLosers(topLosers);
    JsonObject actual = marketSummaryDataBean.toJSON();
    assertEquals(0, actual.get("gainer1_stock"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithEmptyCollections_MDvI1_jNPC1_4() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal TSIA = BigDecimal.valueOf(1000);
    BigDecimal openTSIA = BigDecimal.valueOf(900);
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    marketSummaryDataBean.setTSIA(TSIA);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    marketSummaryDataBean.setVolume(volume);
    marketSummaryDataBean.setTopGainers(topGainers);
    marketSummaryDataBean.setTopLosers(topLosers);
    JsonObject actual = marketSummaryDataBean.toJSON();
    assertEquals(0, actual.get("gainer1_price"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithEmptyCollections_MDvI1_jNPC1_6() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal TSIA = BigDecimal.valueOf(1000);
    BigDecimal openTSIA = BigDecimal.valueOf(900);
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    marketSummaryDataBean.setTSIA(TSIA);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    marketSummaryDataBean.setVolume(volume);
    marketSummaryDataBean.setTopGainers(topGainers);
    marketSummaryDataBean.setTopLosers(topLosers);
    JsonObject actual = marketSummaryDataBean.toJSON();
    assertEquals(0, actual.get("loser1_stock"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithEmptyCollections_MDvI1_jNPC1_7() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal TSIA = BigDecimal.valueOf(1000);
    BigDecimal openTSIA = BigDecimal.valueOf(900);
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    marketSummaryDataBean.setTSIA(TSIA);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    marketSummaryDataBean.setVolume(volume);
    marketSummaryDataBean.setTopGainers(topGainers);
    marketSummaryDataBean.setTopLosers(topLosers);
    JsonObject actual = marketSummaryDataBean.toJSON();
    assertEquals(0, actual.get("loser1_price"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithEmptyCollections_MDvI1_jNPC1_8() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal TSIA = BigDecimal.valueOf(1000);
    BigDecimal openTSIA = BigDecimal.valueOf(900);
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    marketSummaryDataBean.setTSIA(TSIA);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    marketSummaryDataBean.setVolume(volume);
    marketSummaryDataBean.setTopGainers(topGainers);
    marketSummaryDataBean.setTopLosers(topLosers);
    JsonObject actual = marketSummaryDataBean.toJSON();
    assertEquals(0, actual.get("loser1_change"));
  }
}