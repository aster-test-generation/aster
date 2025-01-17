/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
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
  public void testGetOpenTSIA_giHE0() {
    BigDecimal expectedOpenTSIA = new BigDecimal("1234.56");
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("1000"), expectedOpenTSIA, 0.0, null, null);
    BigDecimal result = marketSummaryDataBean.getOpenTSIA();
    assertEquals(expectedOpenTSIA, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentWithPositiveChange_sjWU0() {
    BigDecimal tsia = new BigDecimal("15000");
    BigDecimal openTsia = new BigDecimal("14000");
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(tsia, openTsia, volume, topGainers, topLosers);
    BigDecimal expectedGainPercent = new BigDecimal("0.0000"); // Calculated manually or expected from business logic
    BigDecimal resultGainPercent = marketSummary.getGainPercent();
    assertEquals(expectedGainPercent, resultGainPercent);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentWithNoChange_kCHK1() {
    BigDecimal tsia = new BigDecimal("15000");
    BigDecimal openTsia = new BigDecimal("15000");
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(tsia, openTsia, volume, topGainers, topLosers);
    BigDecimal expectedGainPercent = BigDecimal.ZERO;
    BigDecimal resultGainPercent = marketSummary.getGainPercent();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_VsbF0_1() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_VsbF0_2() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_VsbF0_3() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_VsbF0_4() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertFalse(result.getTopGainers().isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_VsbF0_5() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertFalse(result.getTopLosers().isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceValues_MUGA1_1() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceValues_MUGA1_2() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertTrue(result.getTSIA().compareTo(BigDecimal.ZERO) > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceValues_MUGA1_3() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceValues_MUGA1_4() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertTrue(result.getOpenTSIA().compareTo(BigDecimal.ZERO) > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceValues_MUGA1_5() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertTrue(result.getVolume() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIA_rybz0() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean();
    BigDecimal expected = new BigDecimal("123.45");
    marketSummary.setOpenTSIA(expected);
    assertEquals(expected, marketSummary.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIA_pYaZ0() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean();
    BigDecimal expectedTSIA = new BigDecimal("12345.67");
    marketSummary.setTSIA(expectedTSIA);
    assertEquals(expectedTSIA, marketSummary.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate_jGNL0() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean();
    Date expectedDate = new Date();
    marketSummary.setSummaryDate(expectedDate);
    Date actualDate = marketSummary.getSummaryDate();
    assertEquals(expectedDate, actualDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDate_UdQB0() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean();
    Date expectedDate = new Date();
    marketSummary.setSummaryDate(expectedDate);
    assertEquals(expectedDate, marketSummary.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrint_wmNU0() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("12345.67"), new BigDecimal("12300.00"), 5000000.0, new ArrayList<>(), new ArrayList<>());
    assertDoesNotThrow(() -> marketSummary.print());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTSIA_xCCw0() {
    BigDecimal expectedTSIA = new BigDecimal("12345.67");
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(expectedTSIA, BigDecimal.ZERO, 0.0, null, null);
    BigDecimal resultTSIA = marketSummaryDataBean.getTSIA();
    assertEquals(expectedTSIA, resultTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_iOYB0() {
    BigDecimal TSIA = new BigDecimal("10000");
    BigDecimal openTSIA = new BigDecimal("9950");
    double volume = 1500000.0;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    assertEquals(1500000.0, marketSummary.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopLosers_Beti0() {
    Collection<QuoteDataBean> expectedLosers = Arrays.asList(new QuoteDataBean(), new QuoteDataBean());
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("10000"), new BigDecimal("9500"), 5000000.0, Arrays.asList(new QuoteDataBean()), expectedLosers);
    Collection<QuoteDataBean> actualLosers = marketSummary.getTopLosers();
    assertEquals(expectedLosers, actualLosers);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithEmptyCollections_DIEW0_1() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("10000"), new BigDecimal("9500"), 5000.0, new ArrayList<>(), new ArrayList<>());
    String result = marketSummary.toHTML();
    assertTrue(result.contains("TSIA:10000"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithEmptyCollections_DIEW0_2() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("10000"), new BigDecimal("9500"), 5000.0, new ArrayList<>(), new ArrayList<>());
    String result = marketSummary.toHTML();
    assertTrue(result.contains("openTSIA:9500"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithEmptyCollections_DIEW0_3() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("10000"), new BigDecimal("9500"), 5000.0, new ArrayList<>(), new ArrayList<>());
    String result = marketSummary.toHTML();
    assertTrue(result.contains("volume:5000.0"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithEmptyCollections_DIEW0_4() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("10000"), new BigDecimal("9500"), 5000.0, new ArrayList<>(), new ArrayList<>());
    String result = marketSummary.toHTML();
    assertTrue(result.contains("Current Top Gainers:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithEmptyCollections_DIEW0_5() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("10000"), new BigDecimal("9500"), 5000.0, new ArrayList<>(), new ArrayList<>());
    String result = marketSummary.toHTML();
    assertTrue(result.contains("Current Top Losers:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNullCollections_KISd1_1() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("10000"), new BigDecimal("9500"), 5000.0, null, null);
    String result = marketSummary.toHTML();
    assertFalse(result.contains("Current Top Gainers:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNullCollections_KISd1_2() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("10000"), new BigDecimal("9500"), 5000.0, null, null);
    String result = marketSummary.toHTML();
    assertFalse(result.contains("Current Top Losers:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_KCRq0_tTcp0() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean();
    double expectedVolume = 10000.0;
    marketSummary.setVolume(expectedVolume);
    assertEquals(expectedVolume, marketSummary.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_VsbF0() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result);
    assertNotNull(result.getTopGainers());
    assertNotNull(result.getTopLosers());
    assertFalse(result.getTopGainers().isEmpty());
    assertFalse(result.getTopLosers().isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceValues_MUGA1() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result.getTSIA());
    assertTrue(result.getTSIA().compareTo(BigDecimal.ZERO) > 0);
    assertNotNull(result.getOpenTSIA());
    assertTrue(result.getOpenTSIA().compareTo(BigDecimal.ZERO) > 0);
    assertTrue(result.getVolume() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithEmptyCollections_DIEW0() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("10000"), new BigDecimal("9500"), 5000.0, new ArrayList<>(), new ArrayList<>());
    String result = marketSummary.toHTML();
    assertTrue(result.contains("TSIA:10000"));
    assertTrue(result.contains("openTSIA:9500"));
    assertTrue(result.contains("volume:5000.0"));
    assertTrue(result.contains("Current Top Gainers:"));
    assertTrue(result.contains("Current Top Losers:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNullCollections_KISd1() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("10000"), new BigDecimal("9500"), 5000.0, null, null);
    String result = marketSummary.toHTML();
    assertFalse(result.contains("Current Top Gainers:"));
    assertFalse(result.contains("Current Top Losers:"));
  }
}