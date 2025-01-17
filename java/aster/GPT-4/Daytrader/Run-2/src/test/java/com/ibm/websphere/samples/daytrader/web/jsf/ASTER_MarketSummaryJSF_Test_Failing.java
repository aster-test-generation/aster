/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryJSF_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIA_QGWE0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    BigDecimal expectedValue = new BigDecimal("12345.678");
    marketSummary.setTSIA(expectedValue);
    assertEquals(expectedValue, marketSummary.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIA_dVeu0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    BigDecimal expected = BigDecimal.ZERO; // Assuming default or mocked value
    assertEquals(expected, marketSummary.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent_KQgl0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null); // Assuming null is acceptable for the constructor
    BigDecimal expected = BigDecimal.ZERO; // Assuming default or a known set value
    assertEquals(expected, marketSummary.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentHTML_EFvb0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    String result = marketSummary.getGainPercentHTML();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_HPwF0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    double expectedVolume = 1000.0;
    marketSummary.setVolume(expectedVolume);
    assertEquals(expectedVolume, marketSummary.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate_HNmD0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    Date expectedDate = new Date(); // Assuming summaryDate is set to current date in constructor or elsewhere
    assertEquals(expectedDate, marketSummary.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTSIA_KTRV0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null); // Assuming null is acceptable for the constructor
    BigDecimal expectedTSIA = new BigDecimal("0"); // Assuming a default or expected value for TSIA
    assertEquals(expectedTSIA, marketSummary.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_RgDo0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null); // Assuming a default volume is set in the class
    assertEquals(0.0, marketSummary.getVolume(), 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainers_JrFs0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    QuoteData[] result = marketSummary.getTopGainers();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopLosers_eNjX0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    QuoteData[] result = marketSummary.getTopLosers();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIA_zDGM0_KdKm0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    BigDecimal expected = new BigDecimal("123.45");
    marketSummary.setOpenTSIA(expected);
    assertEquals(expected, marketSummary.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainPercent_HqVQ0_gXPh0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    BigDecimal expected = new BigDecimal("3.14567");
    marketSummary.setGainPercent(expected);
    BigDecimal result = marketSummary.getGainPercent();
    assertEquals(0, new BigDecimal("3.15").compareTo(result));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDate_sTsT0_DQuY0_fid3() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null); // Assuming null is acceptable for Instance<TradeServices>
    Date expectedDate = new Date();
    marketSummary.setSummaryDate(expectedDate);
    assertEquals(expectedDate, marketSummary.getSummaryDate());
  }
}