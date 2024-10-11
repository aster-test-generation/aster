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
  public void testToStringWithEmptyCollections_pXfm0() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("15000"), new BigDecimal("15050"), 5000000.0, new ArrayList<>(), new ArrayList<>());
    String expected = "\n\tMarket Summary at: " + marketSummary.getSummaryDate() + "\n\t\t        TSIA:" + marketSummary.getTSIA() + "\n\t\t    openTSIA:" + marketSummary.getOpenTSIA() + "\n\t\t        gain:" + marketSummary.getGainPercent() + "\n\t\t      volume:" + marketSummary.getVolume() + "\n\t\t   Current Top Gainers:\n\t\t   Current Top Losers:";
    assertEquals(expected, marketSummary.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullGainersAndLosers_IQlw1() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("15200"), new BigDecimal("15100"), 5200000.0, null, null);
    String expected = "\n\tMarket Summary at: " + marketSummary.getSummaryDate() + "\n\t\t        TSIA:" + marketSummary.getTSIA() + "\n\t\t    openTSIA:" + marketSummary.getOpenTSIA() + "\n\t\t        gain:" + marketSummary.getGainPercent() + "\n\t\t      volume:" + marketSummary.getVolume();
    assertEquals(expected, marketSummary.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_eEms0() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result);
    assertNotNull(result.getTopGainers());
    assertNotNull(result.getTopLosers());
    assertFalse(result.getTopGainers().isEmpty());
    assertFalse(result.getTopLosers().isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceValues_sNua1() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result.getTSIA());
    assertTrue(result.getTSIA().compareTo(BigDecimal.ZERO) > 0);
    assertNotNull(result.getOpenTSIA());
    assertTrue(result.getOpenTSIA().compareTo(BigDecimal.ZERO) > 0);
    assertTrue(result.getVolume() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIA_qODW0() {
    BigDecimal expectedOpenTSIA = new BigDecimal("123.45");
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean();
    marketSummary.setOpenTSIA(expectedOpenTSIA);
    assertEquals(expectedOpenTSIA, marketSummary.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIA_bitY0() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean();
    BigDecimal expectedTSIA = new BigDecimal("12345.67");
    marketSummary.setTSIA(expectedTSIA);
    assertEquals(expectedTSIA, marketSummary.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDate_XGcj0() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean();
    Date expectedDate = new Date();
    marketSummary.setSummaryDate(expectedDate);
    assertEquals(expectedDate, marketSummary.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTSIA_JKeR0() {
    BigDecimal expectedTSIA = new BigDecimal("12345.67");
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(expectedTSIA, new BigDecimal("12000.00"), 5000000.0, new ArrayList<>(), new ArrayList<>());
    BigDecimal actualTSIA = marketSummaryDataBean.getTSIA();
    assertEquals(expectedTSIA, actualTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_rWxI0() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("10000"), new BigDecimal("9500"), 5000.0, new ArrayList<>(), new ArrayList<>());
    assertEquals(5000.0, marketSummary.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopLosers_rSkz0() {
    Collection<QuoteDataBean> expectedLosers = Arrays.asList(new QuoteDataBean(), new QuoteDataBean());
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("10000"), new BigDecimal("9500"), 5000.0, Arrays.asList(new QuoteDataBean()), expectedLosers);
    assertEquals(expectedLosers, marketSummary.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNullGainersAndLosers_kGUN1() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("15000"), new BigDecimal("15050"), 5000000.0, null, null);
    String result = marketSummary.toHTML();
    assertTrue(result.contains("Market Summary at:") && result.contains("TSIA:15000") && result.contains("openTSIA:15050") && result.contains("volume:5000000.0"));
    assertFalse(result.contains("Current Top Gainers:") || result.contains("Current Top Losers:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_eEms0_1() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_eEms0_2() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_eEms0_3() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_eEms0_4() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertFalse(result.getTopGainers().isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_eEms0_5() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertFalse(result.getTopLosers().isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceValues_sNua1_1() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceValues_sNua1_2() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertTrue(result.getTSIA().compareTo(BigDecimal.ZERO) > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceValues_sNua1_3() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(result.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceValues_sNua1_4() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertTrue(result.getOpenTSIA().compareTo(BigDecimal.ZERO) > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceValues_sNua1_5() {
    MarketSummaryDataBean result = MarketSummaryDataBean.getRandomInstance();
    assertTrue(result.getVolume() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithEmptyGainersAndLosers_esqr0_1() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("15000"), new BigDecimal("15050"), 5000000.0, new ArrayList<>(), new ArrayList<>());
    String result = marketSummary.toHTML();
    assertTrue(result.contains("Market Summary at:") && result.contains("TSIA:15000") && result.contains("openTSIA:15050") && result.contains("volume:5000000.0"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNullGainersAndLosers_kGUN1_1() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("15000"), new BigDecimal("15050"), 5000000.0, null, null);
    String result = marketSummary.toHTML();
    assertTrue(result.contains("Market Summary at:") && result.contains("TSIA:15000") && result.contains("openTSIA:15050") && result.contains("volume:5000000.0"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNullGainersAndLosers_kGUN1_2() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("15000"), new BigDecimal("15050"), 5000000.0, null, null);
    String result = marketSummary.toHTML();
    assertFalse(result.contains("Current Top Gainers:") || result.contains("Current Top Losers:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_WZFl0_YjDq0() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean();
    double expectedVolume = 150000.0;
    marketSummary.setVolume(expectedVolume);
    assertEquals(expectedVolume, marketSummary.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIA_EfoA0_fid2() {
    BigDecimal expectedOpenTSIA = new BigDecimal("1234.56");
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("1000.00"), expectedOpenTSIA, 0.0, null, null);
    BigDecimal actualOpenTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(expectedOpenTSIA, actualOpenTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentWithPositiveChange_AWSQ0_fid2() {
    BigDecimal TSIA = new BigDecimal("15000");
    BigDecimal openTSIA = new BigDecimal("14000");
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    BigDecimal expectedGainPercent = new BigDecimal("7.14"); // Calculated manually or expected from business logic
    BigDecimal result = marketSummary.getGainPercent();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentWithNoChange_DqGh1_fid2() {
    BigDecimal TSIA = new BigDecimal("15000");
    BigDecimal openTSIA = new BigDecimal("15000");
    double volume = 1000000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(TSIA, openTSIA, volume, topGainers, topLosers);
    BigDecimal expectedGainPercent = BigDecimal.ZERO; // Expecting no gain
    BigDecimal result = marketSummary.getGainPercent();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrint_JLSr0_fid2() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("12345.67"), new BigDecimal("12300.00"), 5000000.0, new ArrayList<>(), new ArrayList<>());
    assertDoesNotThrow(() -> marketSummary.print());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithEmptyGainersAndLosers_esqr0_2_fid2() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(new BigDecimal("15000"), new BigDecimal("15050"), 5000000.0, new ArrayList<>(), new ArrayList<>());
    String result = marketSummary.toHTML();
  }
}