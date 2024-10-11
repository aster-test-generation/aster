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
  public void testGetOpenTSIA_ibbu0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    BigDecimal expected = BigDecimal.ZERO; // Assuming default or mocked setup
    assertEquals(expected, marketSummary.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTSIA_aBuF0() {
    // Assuming the MarketSummaryJSF class has been corrected to handle null or a mock is provided
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null); // Mocking or handling of null should be implemented in the constructor
    BigDecimal expectedTSIA = new BigDecimal("12345.67"); // Assuming this is the expected value for TSIA
    BigDecimal actualTSIA = marketSummary.getTSIA(); // Assuming getTSIA() method exists and returns BigDecimal
    assertEquals(0, expectedTSIA.compareTo(actualTSIA));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainers_rvrP0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    QuoteData[] result = marketSummary.getTopGainers();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent_FCvV0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null); // Assuming null can be passed for simplicity
    BigDecimal expected = new BigDecimal("0.00"); // Assuming default or set value
    assertEquals(expected, marketSummary.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentHTML_cvEz0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    String result = marketSummary.getGainPercentHTML();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate_VlpK0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    Date expectedDate = new Date(); // Assuming summaryDate is initialized with current date
    assertEquals(expectedDate, marketSummary.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTSIA_aBuF0_fid2() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    BigDecimal expectedTSIA = new BigDecimal("12345.67"); // Assuming this is the expected value for TSIA
    assertEquals(expectedTSIA, marketSummary.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_wEys0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    double expectedVolume = 0.0; // Assuming default volume is 0.0, adjust based on actual default or setup
    double actualVolume = marketSummary.getVolume();
    assertEquals(expectedVolume, actualVolume, 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopLosers_vBoZ0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    QuoteData[] result = marketSummary.getTopLosers();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIA_HdEw0_LVRU0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    BigDecimal expected = new BigDecimal("123.45");
    marketSummary.setOpenTSIA(expected);
    assertEquals(expected, marketSummary.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIA_hkzb0_ydRg0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    BigDecimal expectedTSIA = new BigDecimal("12345.67");
    marketSummary.setTSIA(expectedTSIA);
    assertEquals(expectedTSIA, marketSummary.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainPercent_xBkc0_zWHN0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    BigDecimal expected = new BigDecimal("3.14567");
    marketSummary.setGainPercent(expected);
    BigDecimal result = marketSummary.getGainPercent();
    assertEquals(0, new BigDecimal("3.15").compareTo(result));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_FWoV0_LNki0() {
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(null);
    double expectedVolume = 1000.0;
    marketSummary.setVolume(expectedVolume);
    assertEquals(expectedVolume, marketSummary.getVolume(), 0.001);
  }
}