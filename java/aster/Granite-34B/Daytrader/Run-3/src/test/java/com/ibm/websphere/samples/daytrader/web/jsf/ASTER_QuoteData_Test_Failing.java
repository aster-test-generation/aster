/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteData_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainHTML_negativeGain_TSPn2() {
    QuoteData qd = new QuoteData(new BigDecimal("100.00"), new BigDecimal("110.00"), "AAPL");
    String actual = qd.getGainHTML();
    String expected = FinancialUtils.printGainHTML(qd.getGain());
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChange_jHOX0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("10-5.00"), "ABC");
    assertEquals(-5.0, quoteData.getChange(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainPercent_null_iSPm2() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "TEST");
    quoteData.setGainPercent(null);
    Assertions.assertNull(quoteData.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_negativeVolume_kQfE2() {
    QuoteData quoteData = new QuoteData(new BigDecimal(0), new BigDecimal(0), "symbol");
    quoteData.setVolume(-100.0);
    assertEquals(0.0, quoteData.getVolume(), -100.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_FKbD0() {
    QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("105.0"), "AAPL");
    assertNull(new BigDecimal("5.0"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain3_osAc2() {
    QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("100.0"), "AAPL");
    assertNull(new BigDecimal("0.0"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainPercentHTML_vahm0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(100), "TEST");
    quoteData.setGain(null);
    String result = quoteData.getGainPercentHTML();
    assertEquals("0.00%", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent_xjJn0() {
    QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("100.0"), "TEST");
    assertNull(BigDecimal.ZERO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent2_rVgb1() {
    QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("101.0"), "TEST");
    assertNull(new BigDecimal("1.0"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent3_jPBa2() {
    QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("99.0"), "TEST");
    assertNull(new BigDecimal("-1.0"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRange_uNpa1_fid2() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(10), "AAPL", new BigDecimal(100), new BigDecimal(10), "Apple", 1000.0, 10.0);
    String range = quoteData.getRange();
    assertEquals(null, range);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainHTML_ufxQ0() {
    QuoteData qd = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "AAPL");
    String actual = qd.getGainHTML();
    String expected = FinancialUtils.printGainHTML(qd.getGain());
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainHTML_zeroGain_Uvgb1() {
    QuoteData qd = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "AAPL");
    String actual = qd.getGainHTML();
    String expected = FinancialUtils.printGainHTML(qd.getGain());
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChange_jHOX0_fid2() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("105.00"), "ABC");
    assertEquals(5.0, quoteData.getChange(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainPercent_null_iSPm2_fid2() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "TEST");
    quoteData.setGainPercent(null);
    assertEquals(new BigDecimal("0.00"), quoteData.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLow_ANxa0_fid2() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "AAPL");
    BigDecimal result = quoteData.getLow();
    assertEquals(new BigDecimal("90.00"), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_negativeVolume_kQfE2_fid2() {
    QuoteData quoteData = new QuoteData(new BigDecimal(0), new BigDecimal(0), "symbol");
    quoteData.setVolume(-100.0);
    assertEquals(0.0, quoteData.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_minVolume_JZky4_fid2() {
    QuoteData quoteData = new QuoteData(new BigDecimal(0), new BigDecimal(0), "symbol");
    quoteData.setVolume(Double.MIN_VALUE);
    assertEquals(0.0, quoteData.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_invalidVolume_Bivm5() {
    QuoteData quoteData = new QuoteData(new BigDecimal(0), new BigDecimal(0), "symbol");
    quoteData.setVolume(Double.NaN);
    assertEquals(0.0, quoteData.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_FKbD0_fid2() {
    QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("105.0"), "AAPL");
    assertEquals(new BigDecimal("5.0"), qd.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain2_PpIx1_fid2() {
    QuoteData qd = new QuoteData(new BigDecimal("105.0"), new BigDecimal("100.0"), "AAPL");
    assertEquals(new BigDecimal("-5.0"), qd.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain3_osAc2_fid2() {
    QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("100.0"), "AAPL");
    assertEquals(new BigDecimal("0.0"), qd.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain4_HjEJ3_fid2() {
    QuoteData qd = new QuoteData(new BigDecimal("105.0"), new BigDecimal("105.0"), "AAPL");
    assertEquals(new BigDecimal("0.0"), qd.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainPercentHTML_vahm0_fid2() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(100), "TEST");
    String result = quoteData.getGainPercentHTML();
    assertEquals("0.00%", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainPercentHTML_100_coverage_Exzz1_fid2() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(100), "TEST");
    quoteData.setGainPercent(new BigDecimal(100));
    String result = quoteData.getGainPercentHTML();
    assertEquals("100.00%", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainPercentHTML_50_coverage_fWpx2() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(100), "TEST");
    quoteData.setGainPercent(new BigDecimal(50));
    String result = quoteData.getGainPercentHTML();
    assertEquals("50.00%", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainPercentHTML_minus50_coverage_EqRM3() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(100), "TEST");
    quoteData.setGainPercent(new BigDecimal(-50));
    String result = quoteData.getGainPercentHTML();
    assertEquals("-50.00%", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainPercentHTML_minus100_coverage_foMF4_fid2() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(100), "TEST");
    quoteData.setGainPercent(new BigDecimal(-100));
    String result = quoteData.getGainPercentHTML();
    assertEquals("-100.00%", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent_xjJn0_fid2() {
    QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("100.0"), "TEST");
    assertEquals(BigDecimal.ZERO, qd.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent2_rVgb1_fid2() {
    QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("101.0"), "TEST");
    assertEquals(new BigDecimal("1.0"), qd.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent3_jPBa2_fid2() {
    QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("99.0"), "TEST");
    assertEquals(new BigDecimal("-1.0"), qd.getGainPercent());
  }
}