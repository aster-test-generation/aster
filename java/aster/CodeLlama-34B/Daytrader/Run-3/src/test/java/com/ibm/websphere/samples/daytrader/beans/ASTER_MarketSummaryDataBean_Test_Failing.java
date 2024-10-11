/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.json.JsonObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIAWithNullValues_eYYl2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, null, 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertNull(openTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithNullValues_MFWR1_1() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNull(marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithNullValues_MFWR1_2() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNull(marketSummaryDataBean.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithNullValues_MFWR1_3() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNull(marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithNullValues_MFWR1_4() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNull(marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithNullValues_MFWR1_5() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNull(marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithNullValues_MFWR1_6() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNull(marketSummaryDataBean.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithNullValues_MFWR1_7() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNull(marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidValues_bvHB2_9() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertEquals(marketSummaryDataBean.getOpenTSIA(), TradeConfig.rndBigDecimal(1000000.0f));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidValues_bvHB2_10() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertEquals(marketSummaryDataBean.getGainPercent(), TradeConfig.rndBigDecimal(1000000.0f));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidValues_bvHB2_11() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertEquals(marketSummaryDataBean.getSummaryDate(), TradeConfig.rndQuantity());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidValues_bvHB2_12() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertEquals(marketSummaryDataBean.getTSIA(), TradeConfig.rndBigDecimal(1000000.0f));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidValues_bvHB2_13() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertEquals(marketSummaryDataBean.getVolume(), TradeConfig.rndQuantity());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithEmptyTopGainersAndTopLosers_FUga2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100.0), new BigDecimal(90.0), 10000.0, Collections.emptyList(), Collections.emptyList());
    String expected = "\n\tMarket Summary at: " + marketSummaryDataBean.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryDataBean.getTSIA() + "\n\t\t    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryDataBean.getGainPercent() + "\n\t\t      volume:" + marketSummaryDataBean.getVolume();
    assertEquals(expected, marketSummaryDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDateWithNull_sOmv1_fid1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, null, 0, null, null);
    Date summaryDate = marketSummaryDataBean.getSummaryDate();
    assertNull(summaryDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDateWithDifferentDate_FMpY2_fid1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Date summaryDate = new Date();
    marketSummaryDataBean.setSummaryDate(summaryDate);
    assertNotEquals(summaryDate, marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent_XKeB0_fid1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(50), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal gainPercent = marketSummaryDataBean.getGainPercent();
    assertEquals(200.0, gainPercent.doubleValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentWithZeroOpenTSIA_dogA1_fid1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(0), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal gainPercent = marketSummaryDataBean.getGainPercent();
    assertEquals(Double.POSITIVE_INFINITY, gainPercent.doubleValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithNullValues_MFWR1() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNull(marketSummaryDataBean.getOpenTSIA());
    assertNull(marketSummaryDataBean.getGainPercent());
    assertNull(marketSummaryDataBean.getSummaryDate());
    assertNull(marketSummaryDataBean.getTSIA());
    assertNull(marketSummaryDataBean.getVolume());
    assertNull(marketSummaryDataBean.getTopGainers());
    assertNull(marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidValues_bvHB2() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean);
    assertNotNull(marketSummaryDataBean.getOpenTSIA());
    assertNotNull(marketSummaryDataBean.getGainPercent());
    assertNotNull(marketSummaryDataBean.getSummaryDate());
    assertNotNull(marketSummaryDataBean.getTSIA());
    assertNotNull(marketSummaryDataBean.getVolume());
    assertNotNull(marketSummaryDataBean.getTopGainers());
    assertNotNull(marketSummaryDataBean.getTopLosers());
    assertEquals(marketSummaryDataBean.getOpenTSIA(), TradeConfig.rndBigDecimal(1000000.0f));
    assertEquals(marketSummaryDataBean.getGainPercent(), TradeConfig.rndBigDecimal(1000000.0f));
    assertEquals(marketSummaryDataBean.getSummaryDate(), TradeConfig.rndQuantity());
    assertEquals(marketSummaryDataBean.getTSIA(), TradeConfig.rndBigDecimal(1000000.0f));
    assertEquals(marketSummaryDataBean.getVolume(), TradeConfig.rndQuantity());
    assertEquals(marketSummaryDataBean.getTopGainers().size(), 5);
    assertEquals(marketSummaryDataBean.getTopLosers().size(), 5);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainersWithGainers_aKJP1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
    assertNotNull(topGainers);
    assertEquals(1, topGainers.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainersWithGainersAndLosers2_iJaU5() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
    assertNotNull(topGainers);
    assertEquals(2, topGainers.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainersWithGainersAndLosers3_Qhbm6() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
    assertNotNull(topGainers);
    assertEquals(3, topGainers.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_jewP0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(900), 10000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    assertEquals(1000, jsonObject.getInt("tsia"));
    assertEquals(10000, jsonObject.getInt("volume"));
    assertEquals("2023-02-28", jsonObject.getString("date"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainersWithGainers_aKJP1_2_fid3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
    assertEquals(1, topGainers.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainersWithGainersAndLosers2_iJaU5_2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
    assertEquals(2, topGainers.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainersWithGainersAndLosers3_Qhbm6_2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
    assertEquals(3, topGainers.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_jewP0_1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(900), 10000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    assertEquals(1000, jsonObject.getInt("tsia"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_jewP0_2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(900), 10000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    assertEquals(10000, jsonObject.getInt("volume"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_jewP0_3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(900), 10000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    assertEquals("2023-02-28", jsonObject.getString("date"));
  }
}