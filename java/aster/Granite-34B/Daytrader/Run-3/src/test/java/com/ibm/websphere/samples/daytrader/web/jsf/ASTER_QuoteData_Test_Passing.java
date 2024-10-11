/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteData_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRange_aybT0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(10), "AAPL");
    String range = quoteData.getRange();
    assertEquals(null, range);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRange_uNpa1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(10), "AAPL", new BigDecimal(100), new BigDecimal(10), "Apple", 1000.0, 10.0);
    String range = quoteData.getRange();
    assertNull(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHigh_gusn0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.0"), new BigDecimal("90.0"), "AAPL");
    quoteData.setHigh(new BigDecimal("110.0"));
    assertEquals(new BigDecimal("110.0"), quoteData.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHighWithNull_DeIY1() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.0"), new BigDecimal("90.0"), "AAPL");
    quoteData.setHigh(null);
    assertEquals(null, quoteData.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHighWithNegativeValue_Npub2() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.0"), new BigDecimal("90.0"), "AAPL");
    quoteData.setHigh(new BigDecimal("-10.0"));
    assertEquals(new BigDecimal("-10.0"), quoteData.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getPrice_MAln0() {
    QuoteData q = new QuoteData(new BigDecimal(100.0), new BigDecimal(101.0), "AAPL");
    assertEquals(new BigDecimal(100.0), q.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getPrice_branchCoverage_IWul1() {
    QuoteData q = new QuoteData(new BigDecimal(100.0), new BigDecimal(101.0), "AAPL");
    q.getPrice();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRange_fBRs0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(90), "AAPL");
    quoteData.setRange("10-20");
    assertEquals("10-20", quoteData.getRange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRange_ZRgg1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(90), "AAPL", new BigDecimal(110), new BigDecimal(80), "Apple Inc.", 1000000.0, 10.0);
    quoteData.setRange("10-20");
    assertEquals("10-20", quoteData.getRange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCompanyName_WhenCompanyNameIsNotEmpty_ReturnsCompanyName_ZCkh0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(20.0), "AAPL", new BigDecimal(30.0), new BigDecimal(40.0), "Apple Inc.", 1000000.0, 10.0);
    String companyName = quoteData.getCompanyName();
    assertEquals("Apple Inc.", companyName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCompanyName_WhenCompanyNameIsEmpty_ReturnsEmpty_RJIr1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(20.0), "AAPL", new BigDecimal(30.0), new BigDecimal(40.0), "", 1000000.0, 10.0);
    String companyName = quoteData.getCompanyName();
    assertEquals("", companyName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setPrice_fjCU0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("10.0"), new BigDecimal("10.0"), "TEST");
    quoteData.setPrice(new BigDecimal("15.0"));
    org.junit.jupiter.api.Assertions.assertEquals(new BigDecimal("15.0"), quoteData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpen_EAOk0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.0"), new BigDecimal("90.0"), "AAPL");
    quoteData.setOpen(new BigDecimal("110.0"));
    assertEquals(new BigDecimal("110.0"), quoteData.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenWithVolume_NNkj1() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.0"), new BigDecimal("90.0"), "AAPL", new BigDecimal("120.0"), new BigDecimal("80.0"), "Apple Inc.", 1000000.0, 10.0);
    quoteData.setOpen(new BigDecimal("110.0"));
    assertEquals(new BigDecimal("110.0"), quoteData.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getChangeHTML_green_kcvC0() {
    QuoteData q = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "XYZ", new BigDecimal("110.00"), new BigDecimal("80.00"), "XYZ Co.", 1000000.0, 10.0);
    assertEquals("<FONT color=\"#009900\">10.00</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", q.getChangeHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getChangeHTML_red_PlZR1() {
    QuoteData q = new QuoteData(new BigDecimal("100.00"), new BigDecimal("110.00"), "XYZ", new BigDecimal("110.00"), new BigDecimal("80.00"), "XYZ Co.", 1000000.0, -10.0);
    assertEquals("<FONT color=\"#cc0000\">-10.00</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", q.getChangeHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChangeWithVolumeAndChange_rZOr1() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("105.00"), "ABC", new BigDecimal("110.00"), new BigDecimal("95.00"), "XYZ", 100000.0, 5.0);
    assertEquals(5.0, quoteData.getChange(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainPercent_EqZM0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "TEST");
    quoteData.setGainPercent(new BigDecimal("100.00"));
    assertEquals(new BigDecimal("100.00"), quoteData.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainPercent_zero_xaqL1() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "TEST");
    quoteData.setGainPercent(new BigDecimal("0.00"));
    assertEquals(new BigDecimal("0.00"), quoteData.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainPercent_negative_yJkk3() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "TEST");
    quoteData.setGainPercent(new BigDecimal("-100.00"));
    assertEquals(new BigDecimal("-100.00"), quoteData.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetChange_YDQe0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100.0), new BigDecimal(100.0), "TEST");
    quoteData.setChange(100.0);
    assertEquals(100.0, quoteData.getChange(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetChangeWithNegativeValue_bHbo1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100.0), new BigDecimal(100.0), "TEST");
    quoteData.setChange(-100.0);
    assertEquals(-100.0, quoteData.getChange(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetChangeWithZeroValue_sMnU2() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100.0), new BigDecimal(100.0), "TEST");
    quoteData.setChange(0.0);
    assertEquals(0.0, quoteData.getChange(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getHigh_HpmH0() {
    BigDecimal price = new BigDecimal("100.00");
    BigDecimal open = new BigDecimal("90.00");
    String symbol = "AAPL";
    QuoteData quoteData = new QuoteData(price, open, symbol);
    BigDecimal result = quoteData.getHigh();
    Assertions.assertEquals(null, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLow_ANxa0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "AAPL");
    BigDecimal result = quoteData.getLow();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLowWithVolumeAndChange_bZvr1() {
    QuoteData quoteData = new QuoteData(new BigDecimal("90.00"), new BigDecimal("100.00"), "AAPL", new BigDecimal("110.00"), new BigDecimal("90.00"), "Apple Inc.", 1000000.0, 10.0);
    BigDecimal result = quoteData.getLow();
    assertEquals(new BigDecimal("90.00"), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_GGAX0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(0), new BigDecimal(0), "symbol");
    quoteData.setVolume(100.0);
    assertEquals(100.0, quoteData.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_zeroVolume_JdjO1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(0), new BigDecimal(0), "symbol");
    quoteData.setVolume(0.0);
    assertEquals(0.0, quoteData.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_maxVolume_CgEV3() {
    QuoteData quoteData = new QuoteData(new BigDecimal(0), new BigDecimal(0), "symbol");
    quoteData.setVolume(Double.MAX_VALUE);
    assertEquals(Double.MAX_VALUE, quoteData.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_minVolume_JZky4() {
    QuoteData quoteData = new QuoteData(new BigDecimal(0), new BigDecimal(0), "symbol");
    quoteData.setVolume(Double.MIN_VALUE);
    assertEquals(0.0, quoteData.getVolume(), 4.9E-324);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVolumeTest1_hhkg0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("12.34"), new BigDecimal("12.35"), "TEST");
    double volume = quoteData.getVolume();
    assertEquals(0.0, volume, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVolumeTest2_jTEl1() {
    QuoteData quoteData = new QuoteData(new BigDecimal("12.34"), new BigDecimal("12.35"), "TEST", new BigDecimal("12.36"), new BigDecimal("12.37"), "TEST COMPANY", 100.0, 10.0);
    double volume = quoteData.getVolume();
    assertEquals(100.0, volume, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain2_PpIx1() {
    QuoteData qd = new QuoteData(new BigDecimal("105.0"), new BigDecimal("100.0"), "AAPL");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain4_HjEJ3() {
    QuoteData qd = new QuoteData(new BigDecimal("105.0"), new BigDecimal("105.0"), "AAPL");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompanyName_kXNV0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "ABC", new BigDecimal("110.00"), new BigDecimal("80.00"), null, 100000.0, 10.0);
    quoteData.setCompanyName("XYZ");
    assertEquals("XYZ", quoteData.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompanyNameNull_NzTU1() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "ABC", new BigDecimal("110.00"), new BigDecimal("80.00"), null, 100000.0, 10.0);
    quoteData.setCompanyName(null);
    assertEquals(null, quoteData.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompanyNameEmpty_YUhS2() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "ABC", new BigDecimal("110.00"), new BigDecimal("80.00"), null, 100000.0, 10.0);
    quoteData.setCompanyName("");
    assertEquals("", quoteData.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainPercentHTML_100_coverage_Exzz1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(100), "TEST");
    quoteData.setGainPercent(new BigDecimal(100));
    String result = quoteData.getGainPercentHTML();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getGainPercentHTML_minus100_coverage_foMF4() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(100), "TEST");
    quoteData.setGainPercent(new BigDecimal(-100));
    String result = quoteData.getGainPercentHTML();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbol_syEd0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "ABC");
    assertEquals("ABC", quoteData.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbolWithVolumeAndChange_xzSy1() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "ABC", new BigDecimal("110.00"), new BigDecimal("80.00"), "XYZ", 100000.0, 10.0);
    assertEquals("ABC", quoteData.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbolWithNullSymbol_eqpn4() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), null);
    assertEquals(null, quoteData.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbolWithEmptySymbol_PaZD5() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "");
    assertEquals("", quoteData.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbol_gyvc0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100.00), new BigDecimal(90.00), "AAPL");
    quoteData.setSymbol("MSFT");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbol_drRa1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100.00), new BigDecimal(90.00), "AAPL");
    quoteData.setSymbol(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbol_QBTv2() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100.00), new BigDecimal(90.00), "AAPL");
    quoteData.setSymbol("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGain_xrpq0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(10), "AAPL", new BigDecimal(100), new BigDecimal(50), "Apple", 1000000.0, 10.0);
    quoteData.setGain(new BigDecimal(10));
    assertEquals(new BigDecimal(10), quoteData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithZeroGain_boOC1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(10), "AAPL", new BigDecimal(100), new BigDecimal(50), "Apple", 1000000.0, 10.0);
    quoteData.setGain(new BigDecimal(0));
    assertEquals(new BigDecimal(0), quoteData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithNegativeGain_KubQ2() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(10), "AAPL", new BigDecimal(100), new BigDecimal(50), "Apple", 1000000.0, 10.0);
    quoteData.setGain(new BigDecimal(-10));
    assertEquals(new BigDecimal(-10), quoteData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithNullGain_tlpJ3() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(10), "AAPL", new BigDecimal(100), new BigDecimal(50), "Apple", 1000000.0, 10.0);
    quoteData.setGain(null);
    assertNull(quoteData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithMaxGain_thgV5() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(10), "AAPL", new BigDecimal(100), new BigDecimal(50), "Apple", 1000000.0, 10.0);
    quoteData.setGain(new BigDecimal(1000000));
    assertEquals(new BigDecimal(1000000), quoteData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainWithMinGain_zSAi6() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(10), "AAPL", new BigDecimal(100), new BigDecimal(50), "Apple", 1000000.0, 10.0);
    quoteData.setGain(new BigDecimal(-1000000));
    assertEquals(new BigDecimal(-1000000), quoteData.getGain());
  }
}