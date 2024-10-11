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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Coverage_Test_Failing {
  MarketSummaryDataBean bean;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_IYLf2() {
    String result = bean.toHTML();
    System.out.println(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString1_krsm0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    String actual = marketSummaryDataBean.toString();
    String expected = "\n\tMarket Summary at: " + marketSummaryDataBean.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryDataBean.getTSIA() + "\n\t\t    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryDataBean.getGainPercent() + "\n\t\t      volume:" + marketSummaryDataBean.getVolume();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString2_PcqT1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopGainers(new ArrayList<QuoteDataBean>());
    Iterator<QuoteDataBean> it = marketSummaryDataBean.getTopGainers().iterator();
    String actual = marketSummaryDataBean.toString();
    String expected = "\n\tMarket Summary at: " + marketSummaryDataBean.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryDataBean.getTSIA() + "\n\t\t    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryDataBean.getGainPercent() + "\n\t\t      volume:" + marketSummaryDataBean.getVolume() + "\n\t\t   Current Top Gainers:";
    while (it.hasNext()) {
      QuoteDataBean quoteData = it.next();
      expected += ("\n\t\t\t" + quoteData.toString());
    }
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString3_NRbc2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Iterator<QuoteDataBean> it = marketSummaryDataBean.getTopLosers().iterator();
    String actual = marketSummaryDataBean.toString();
    String expected = "\n\tMarket Summary at: " + marketSummaryDataBean.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryDataBean.getTSIA() + "\n\t\t    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryDataBean.getGainPercent() + "\n\t\t      volume:" + marketSummaryDataBean.getVolume() + "\n\t\t   Current Top Losers:";
    while (it.hasNext()) {
      QuoteDataBean quoteData = it.next();
      expected += ("\n\t\t\t" + quoteData.toString());
    }
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString4_NTDU3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(10), new BigDecimal(10), 10, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Iterator<QuoteDataBean> it = marketSummaryDataBean.getTopGainers().iterator();
    String actual = marketSummaryDataBean.toString();
    String expected = "\n\tMarket Summary at: " + marketSummaryDataBean.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryDataBean.getTSIA() + "\n\t\t    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryDataBean.getGainPercent() + "\n\t\t      volume:" + marketSummaryDataBean.getVolume() + "\n\t\t   Current Top Gainers:";
    while (it.hasNext()) {
      QuoteDataBean quoteData = it.next();
      expected += ("\n\t\t\t" + quoteData.toString());
    }
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_ogqd0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNotNull(jsonObject);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithValidData_iJdL1_1() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(100.00);
    double volume = 100.00;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNotNull(jsonObject);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithValidData_iJdL1_2() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(100.00);
    double volume = 100.00;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertEquals(TSIA, jsonObject.getJsonNumber("tsia").bigDecimalValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithValidData_iJdL1_3() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(100.00);
    double volume = 100.00;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertEquals(volume, jsonObject.getJsonNumber("volume").doubleValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithInvalidData_qqXz2_2() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(100.00);
    double volume = 100.00;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNotEquals(TSIA.add(new BigDecimal(100.00)), jsonObject.getJsonNumber("tsia").bigDecimalValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithInvalidData_qqXz2_3() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(100.00);
    double volume = 100.00;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNotEquals(volume + 100.00, jsonObject.getJsonNumber("volume").doubleValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithNullData_GYNQ3_2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNull(jsonObject.getJsonNumber("tsla"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithNullData_GYNQ3_3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNull(jsonObject.getJsonNumber("volume"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithEmptyData_QUIU4_2() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(100.00);
    double volume = 100.00;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertEquals(0, jsonObject.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithPartialData_EyFK5_1() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(100.00);
    double volume = 100.00;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNotNull(jsonObject);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithPartialData_EyFK5_2() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(100.00);
    double volume = 100.00;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertEquals(2, jsonObject.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString2_PcqT1_fid2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Iterator<QuoteDataBean> it = marketSummaryDataBean.getTopGainers().iterator();
    String actual = marketSummaryDataBean.toString();
    String expected = "\n\tMarket Summary at: " + marketSummaryDataBean.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryDataBean.getTSIA() + "\n\t\t    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryDataBean.getGainPercent() + "\n\t\t      volume:" + marketSummaryDataBean.getVolume() + "\n\t\t   Current Top Gainers:";
    while (it.hasNext()) {
      QuoteDataBean quoteData = it.next();
      expected += ("\n\t\t\t" + quoteData.toString());
    }
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithValidData_iJdL1() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(100.00);
    double volume = 100.00;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNotNull(jsonObject);
    Assertions.assertEquals(TSIA, jsonObject.getJsonNumber("tsia").bigDecimalValue());
    Assertions.assertEquals(volume, jsonObject.getJsonNumber("volume").doubleValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithInvalidData_qqXz2() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(100.00);
    double volume = 100.00;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNotNull(jsonObject);
    Assertions.assertNotEquals(TSIA.add(new BigDecimal(100.00)), jsonObject.getJsonNumber("tsia").bigDecimalValue());
    Assertions.assertNotEquals(volume + 100.00, jsonObject.getJsonNumber("volume").doubleValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithNullData_GYNQ3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNotNull(jsonObject);
    Assertions.assertNull(jsonObject.getJsonNumber("tsia"));
    Assertions.assertNull(jsonObject.getJsonNumber("volume"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithEmptyData_QUIU4() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(100.00);
    double volume = 100.00;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNotNull(jsonObject);
    Assertions.assertEquals(0, jsonObject.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithPartialData_EyFK5() {
    BigDecimal TSIA = new BigDecimal(100.00);
    BigDecimal openTSIA = new BigDecimal(100.00);
    double volume = 100.00;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    topGainers.add(new QuoteDataBean());
    topLosers.add(new QuoteDataBean());
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNotNull(jsonObject);
    Assertions.assertEquals(2, jsonObject.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSONWithNullData_GYNQ3_2_fid3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    JsonObject jsonObject = marketSummaryDataBean.toJSON();
    Assertions.assertNull(jsonObject.getJsonNumber("tsia"));
  }
}