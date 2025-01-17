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
import javax.json.JsonObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent_pvZQ0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(90), 0.000000, null, null);
    BigDecimal gainPercent = marketSummaryDataBean.getGainPercent();
    assertEquals(BigDecimal.valueOf(10), gainPercent);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString1_RKZQ0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    String result = marketSummaryDataBean.toString();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString2_KazK1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopGainers(null);
    String result = marketSummaryDataBean.toString();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString3_jFho2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopLosers(null);
    String result = marketSummaryDataBean.toString();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString4_SeVc3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopGainers(new ArrayList<QuoteDataBean>());
    String result = marketSummaryDataBean.toString();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString5_PQMg4() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopLosers(new ArrayList<QuoteDataBean>());
    String result = marketSummaryDataBean.toString();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString6_pYTu5() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopGainers(Arrays.asList(new QuoteDataBean()));
    String result = marketSummaryDataBean.toString();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString7_OKhm6() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopLosers(Arrays.asList(new QuoteDataBean()));
    String result = marketSummaryDataBean.toString();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString8_NjIp7() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopGainers(Arrays.asList(new QuoteDataBean(), new QuoteDataBean()));
    String result = marketSummaryDataBean.toString();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString9_iyjb8() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopLosers(Arrays.asList(new QuoteDataBean(), new QuoteDataBean()));
    String result = marketSummaryDataBean.toString();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_UnWE0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    assertNotNull(jsonObject);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithTSIA_FIdR1() {
    BigDecimal TSIA = new BigDecimal(1000);
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, null, 0, null, null);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    assertEquals(TSIA, jsonObject.getJsonNumber("tsia").bigDecimalValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithOpenTSIA_qmTr2() {
    BigDecimal openTSIA = new BigDecimal(1000);
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, openTSIA, 0, null, null);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    assertEquals(openTSIA, jsonObject.getJsonNumber("openTSIA").bigDecimalValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithVolume_PVyD3() {
    double volume = 1000;
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, null, volume, null, null);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    assertEquals(volume, jsonObject.getJsonNumber("volume").doubleValue(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent_pvZQ0_fid1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(90), 1000, null, null);
    BigDecimal gainPercent = marketSummaryDataBean.getGainPercent();
    assertEquals(BigDecimal.valueOf(10), gainPercent);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_nullTopGainers_xBEE0_fid1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    String html = marketSummaryDataBean.toHTML();
    Assertions.assertTrue(html.contains("Current Top Gainers:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_nullTopLosers_INIu1_fid1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    String html = marketSummaryDataBean.toHTML();
    Assertions.assertTrue(html.contains("Current Top Losers:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_nonNullTopGainers_gskD2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    marketSummaryDataBean.setTopGainers(topGainers);
    String html = marketSummaryDataBean.toHTML();
    Assertions.assertTrue(html.contains("Current Top Gainers:"));
    Assertions.assertTrue(html.contains("<LI>"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_nonNullTopLosers_GXoS3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    marketSummaryDataBean.setTopLosers(topLosers);
    String html = marketSummaryDataBean.toHTML();
    Assertions.assertTrue(html.contains("Current Top Losers:"));
    Assertions.assertTrue(html.contains("<LI>"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_nonNullTopGainers_gskD2_1_fid2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    marketSummaryDataBean.setTopGainers(topGainers);
    String html = marketSummaryDataBean.toHTML();
    Assertions.assertTrue(html.contains("Current Top Gainers:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_nonNullTopLosers_GXoS3_1_fid2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(new QuoteDataBean());
    marketSummaryDataBean.setTopLosers(topLosers);
    String html = marketSummaryDataBean.toHTML();
    Assertions.assertTrue(html.contains("Current Top Losers:"));
  }
}