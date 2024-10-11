/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteData_Test_Failing {
  public void testSetRange_JUQu0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setRange("1d");
    assertEquals("1d", quoteData.getRange());
  }

  public void testSetRangeWithDifferentRange_yIFC1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setRange("1w");
    assertEquals("1w", quoteData.getRange());
  }

  public void testSetRangeWithInvalidRange_TEgQ2() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setRange("invalid");
    assertEquals("invalid", quoteData.getRange());
  }

  public void testSetRangeWithNullRange_NnSw3() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setRange(null);
    assertNull(quoteData.getRange());
  }

  public void testSetRangeWithEmptyRange_AgdO4() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setRange("");
    assertEquals("", quoteData.getRange());
  }

  public void testSetRangeWithBlankRange_QqjR5() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setRange(" ");
    assertEquals(" ", quoteData.getRange());
  }

  public void testSetRangeWithMultipleRanges_LByi6() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setRange("1d, 1w");
    assertEquals("1d, 1w", quoteData.getRange());
  }

  public void testSetRangeWithMultipleRangesAndInvalidRange_EXqR7() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setRange("1d, invalid");
    assertEquals("1d, invalid", quoteData.getRange());
  }

  public void testSetRangeWithMultipleRangesAndNullRange_YTSF8() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setRange("1d, null");
    assertEquals("1d, null", quoteData.getRange());
  }

  public void testSetRangeWithMultipleRangesAndEmptyRange_jhmD9() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setRange("1d, ");
    assertEquals("1d, ", quoteData.getRange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbolWithInvalidSymbol_gnSv3() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setSymbol("INVALID");
    assertEquals("ABC", quoteData.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainPercent_1_EJhb0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "TEST");
    quoteData.setGainPercent(new BigDecimal(10.0));
    assertEquals(new BigDecimal(10.0), quoteData.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainPercent_2_DwTO1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "TEST", new BigDecimal(10.0), new BigDecimal(10.0), "TEST", 10.0, 10.0);
    quoteData.setGainPercent(new BigDecimal(10.0));
    assertEquals(new BigDecimal(10.0), quoteData.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChangeHTML_NegativeChange_HMMi0() {
    QuoteData quoteData = new QuoteData(BigDecimal.ZERO, BigDecimal.ZERO, "TEST");
    String htmlString = quoteData.getChangeHTML();
    assertEquals("<FONT color=\"#cc0000\">-0.00</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", htmlString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompanyName1_gjvk0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(12.0), "ABC");
    assertEquals("ABC", quoteData.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRange_1_aCLy0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    String range = quoteData.getRange();
    assertEquals("10.0 - 10.0", range);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRange_2_gxMu1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC", new BigDecimal(10.0), new BigDecimal(10.0), "Company Name", 100.0, 0.0);
    String range = quoteData.getRange();
    assertEquals("10.0 - 10.0", range);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPriceWithHighAndLow_tnyx1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.5), new BigDecimal(10.0), "ABC", new BigDecimal(11.0), new BigDecimal(9.0), "Company Name", 1000.0, 0.5);
    BigDecimal price = quoteData.getPrice();
    assertEquals(new BigDecimal(10.5), price);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_priceGreaterThanOpen_odhQ0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(90), "ABC");
    BigDecimal gain = quoteData.getGain();
    assertEquals(new BigDecimal(10), gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_priceLessThanOpen_sfQi1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(90), new BigDecimal(100), "ABC");
    BigDecimal gain = quoteData.getGain();
    assertEquals(new BigDecimal(-10), gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpen_withNullInputs_ZNSA2() {
    QuoteData quoteData = new QuoteData(null, null, null);
    BigDecimal open = quoteData.getOpen();
    assertNull(open);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpen_withNaNInputs_eplE7() {
    QuoteData quoteData = new QuoteData(new BigDecimal(Double.NaN), new BigDecimal(Double.NaN), "ABC");
    BigDecimal open = quoteData.getOpen();
    assertEquals(new BigDecimal(Double.NaN), open);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpen_withInfinityInputs_KmkJ8() {
    QuoteData quoteData = new QuoteData(new BigDecimal(Double.POSITIVE_INFINITY), new BigDecimal(Double.POSITIVE_INFINITY), "ABC");
    BigDecimal open = quoteData.getOpen();
    assertEquals(new BigDecimal(Double.POSITIVE_INFINITY), open);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpen_withNegativeInfinityInputs_iipk9() {
    QuoteData quoteData = new QuoteData(new BigDecimal(Double.NEGATIVE_INFINITY), new BigDecimal(Double.NEGATIVE_INFINITY), "ABC");
    BigDecimal open = quoteData.getOpen();
    assertEquals(new BigDecimal(Double.NEGATIVE_INFINITY), open);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpen_withNullSymbol_xRAv10() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), null);
    BigDecimal open = quoteData.getOpen();
    assertNull(open);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpen_withEmptySymbol_Hzla11() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "");
    BigDecimal open = quoteData.getOpen();
    assertNull(open);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLow_URCO0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(12.0), "ABC");
    BigDecimal low = quoteData.getLow();
    assertEquals(new BigDecimal(10.0), low);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChange_kBkw0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(12.0), "ABC");
    assertEquals(2.0, quoteData.getChange(), 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHigh_DdkS0() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(100), BigDecimal.valueOf(100), "ABC");
    assertEquals(BigDecimal.valueOf(100), quoteData.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHighWithNullHighValue_MgGM3() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(100), BigDecimal.valueOf(100), "ABC", null, BigDecimal.valueOf(100), "Company Name", 1000.0, 10.0);
    assertNull(quoteData.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHighWithNullLowValue_eBwq4() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(100), BigDecimal.valueOf(100), "ABC", BigDecimal.valueOf(110), null, "Company Name", 1000.0, 10.0);
    assertNull(quoteData.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHighWithNullCompanyName_psjB5() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(100), BigDecimal.valueOf(100), "ABC", BigDecimal.valueOf(110), BigDecimal.valueOf(100), null, 1000.0, 10.0);
    assertNull(quoteData.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHighWithNullVolume_gBhs6() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(100), BigDecimal.valueOf(100), "ABC", BigDecimal.valueOf(110), BigDecimal.valueOf(100), "Company Name", null, 10.0);
    assertNull(quoteData.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHighWithNullChange_bfEo7() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(100), BigDecimal.valueOf(100), "ABC", BigDecimal.valueOf(110), BigDecimal.valueOf(100), "Company Name", 1000.0, null);
    assertNull(quoteData.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_InvalidPrice_gnvT6() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setPrice(new BigDecimal(Double.NaN));
    assertEquals(new BigDecimal(Double.NaN), quoteData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_InvalidPrice2_EjyT7() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setPrice(new BigDecimal(Double.NEGATIVE_INFINITY));
    assertEquals(new BigDecimal(Double.NEGATIVE_INFINITY), quoteData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_InvalidPrice3_fWjD8() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    quoteData.setPrice(new BigDecimal(Double.POSITIVE_INFINITY));
    assertEquals(new BigDecimal(Double.POSITIVE_INFINITY), quoteData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent_Whac0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(12.0), "ABC");
    BigDecimal gainPercent = quoteData.getGainPercent();
    assertEquals(new BigDecimal(20.0), gainPercent);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentWithHighAndLow_dpUd1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(12.0), "ABC", new BigDecimal(15.0), new BigDecimal(8.0), "Company Inc.", 1000.0, 2.0);
    BigDecimal gainPercent = quoteData.getGainPercent();
    assertEquals(new BigDecimal(33.33), gainPercent);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentHTML1_uZle0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC");
    String expected = "<span class=\"gain\">10.00%</span>";
    String actual = quoteData.getGainPercentHTML();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentHTML2_scXb1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(10.0), "ABC", new BigDecimal(10.0), new BigDecimal(10.0), "Company Name", 10.0, 10.0);
    String expected = "<span class=\"gain\">10.00%</span>";
    String actual = quoteData.getGainPercentHTML();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_FDSz0() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.5), new BigDecimal(10.0), "ABC");
    assertEquals(100.0, quoteData.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_priceGreaterThanOpen_odhQ0_fid1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(90), "ABC");
    BigDecimal gain = quoteData.getGain();
    assertNull(new BigDecimal(10));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_priceLessThanOpen_sfQi1_fid1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(90), new BigDecimal(100), "ABC");
    BigDecimal gain = quoteData.getGain();
    assertNull(new BigDecimal(-10));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpen_withNegativeInfinityInputs_iipk9_fid1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(Double.NEGATIVE_INFINITY), new BigDecimal(Double.NEGATIVE_INFINITY), "ABC");
    BigDecimal open = quoteData.getOpen();
    assertEquals(new BigDecimal(Double.NEGATIVE_INFINITY), open);
    // Fix the assertion to match the return type of the method under test
    assertEquals(Double.NEGATIVE_INFINITY, open.doubleValue(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLow_URCO0_fid1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(12.0), "ABC");
    BigDecimal low = quoteData.getLow();
    assertNull(new BigDecimal(10.0));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChange_kBkw0_fid1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(1 - 2.0), "ABC");
    assertEquals(-2.0, quoteData.getChange(), 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHighWithNullChange_bfEo7_fid1() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(100), BigDecimal.valueOf(100), "ABC", BigDecimal.valueOf(110), BigDecimal.valueOf(100), "Company Name", 1000.0, null);
    assertEquals(110.0, quoteData.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent_Whac0_fid1() {
    QuoteData quoteData = new QuoteData(new BigDecimal(10.0), new BigDecimal(12.0), "ABC");
    BigDecimal gainPercent = quoteData.getGainPercent();
    assertNull(new BigDecimal(20.0));
  }
}