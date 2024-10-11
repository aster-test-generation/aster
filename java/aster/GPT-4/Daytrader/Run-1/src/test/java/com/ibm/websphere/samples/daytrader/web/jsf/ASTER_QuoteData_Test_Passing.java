/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteData_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainHTML_wtvE0_1() {
    BigDecimal price = new BigDecimal("150.00");
    BigDecimal open = new BigDecimal("145.00");
    String symbol = "AAPL";
    BigDecimal high = new BigDecimal("155.00");
    BigDecimal low = new BigDecimal("144.00");
    String companyName = "Apple Inc.";
    Double volume = 1000000.0;
    Double change = 5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    String result = quoteData.getGainHTML();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainPercent_XaXv0() {
    BigDecimal price = new BigDecimal("100");
    BigDecimal open = new BigDecimal("95");
    String symbol = "AAPL";
    BigDecimal high = new BigDecimal("105");
    BigDecimal low = new BigDecimal("90");
    String companyName = "Apple Inc.";
    Double volume = 1000000.0;
    Double change = 2.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    BigDecimal gainPercent = new BigDecimal("5.00");
    quoteData.setGainPercent(gainPercent);
    assertEquals(new BigDecimal("5.00").setScale(2), quoteData.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChangeHTML_PositiveChange_RjlR0() {
    BigDecimal price = new BigDecimal("100");
    BigDecimal open = new BigDecimal("95");
    String symbol = "AAPL";
    BigDecimal high = new BigDecimal("105");
    BigDecimal low = new BigDecimal("90");
    String companyName = "Apple Inc.";
    Double volume = 1000.0;
    Double change = 5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    String result = quoteData.getChangeHTML();
    assertEquals("<FONT color=\"#009900\">5.00</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChangeHTML_NegativeChange_FUzu1() {
    BigDecimal price = new BigDecimal("85");
    BigDecimal open = new BigDecimal("90");
    String symbol = "GOOGL";
    BigDecimal high = new BigDecimal("92");
    BigDecimal low = new BigDecimal("80");
    String companyName = "Google LLC";
    Double volume = 1500.0;
    Double change = -5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    String result = quoteData.getChangeHTML();
    assertEquals("<FONT color=\"#cc0000\">-5.00</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompanyName_Frzg0() {
    BigDecimal price = new BigDecimal("100.0");
    BigDecimal open = new BigDecimal("95.0");
    BigDecimal high = new BigDecimal("105.0");
    BigDecimal low = new BigDecimal("90.0");
    String symbol = "AAPL";
    String companyName = "Apple Inc.";
    Double volume = 1000000.0;
    Double change = 2.5;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    assertEquals("Apple Inc.", quoteData.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGain_QmKl0() {
    BigDecimal initialGain = new BigDecimal("5.0");
    QuoteData quoteData = new QuoteData(new BigDecimal("100"), new BigDecimal("105"), "AAPL");
    quoteData.setGain(initialGain);
    assertEquals(initialGain, quoteData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_PczP0() {
    BigDecimal price = new BigDecimal("100");
    BigDecimal open = new BigDecimal("95");
    BigDecimal high = new BigDecimal("105");
    BigDecimal low = new BigDecimal("90");
    String symbol = "AAPL";
    String companyName = "Apple Inc.";
    Double initialVolume = 1000.0;
    Double newVolume = 1500.0;
    Double change = 5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, initialVolume, change);
    quoteData.setVolume(newVolume);
    assertEquals(newVolume, quoteData.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrice_clBq0() {
    BigDecimal expectedPrice = new BigDecimal("100.00");
    QuoteData quoteData = new QuoteData(expectedPrice, new BigDecimal("95.00"), "AAPL");
    BigDecimal actualPrice = quoteData.getPrice();
    assertEquals(expectedPrice, actualPrice);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLow_UQmx0() {
    BigDecimal open = new BigDecimal("100");
    BigDecimal price = new BigDecimal("105");
    BigDecimal high = new BigDecimal("110");
    BigDecimal low = new BigDecimal("95");
    String symbol = "XYZ";
    String companyName = "XYZ Corp";
    Double volume = 1000.0;
    Double change = 5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    BigDecimal expectedLow = new BigDecimal("95");
    assertEquals(expectedLow, quoteData.getLow());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChange_phcj0() {
    BigDecimal price = new BigDecimal("150.00");
    BigDecimal open = new BigDecimal("145.00");
    BigDecimal high = new BigDecimal("155.00");
    BigDecimal low = new BigDecimal("140.00");
    String symbol = "AAPL";
    String companyName = "Apple Inc.";
    Double volume = 1000000.0;
    Double change = 5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    assertEquals(5.0, quoteData.getChange(), 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHigh_AwlX0() {
    BigDecimal open = new BigDecimal("100");
    BigDecimal price = new BigDecimal("105");
    BigDecimal high = new BigDecimal("110");
    BigDecimal low = new BigDecimal("95");
    String symbol = "AAPL";
    String companyName = "Apple Inc.";
    Double volume = 1000000.0;
    Double change = 5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    assertEquals(new BigDecimal("110"), quoteData.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbol_Bqsr0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100.0"), new BigDecimal("105.0"), "AAPL");
    String expected = "AAPL";
    String actual = quoteData.getSymbol();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentHTML_Jrlj0() {
    BigDecimal price = new BigDecimal("150.00");
    BigDecimal open = new BigDecimal("145.00");
    String symbol = "AAPL";
    BigDecimal high = new BigDecimal("155.00");
    BigDecimal low = new BigDecimal("144.00");
    String companyName = "Apple Inc.";
    Double volume = 1000000.0;
    Double change = 5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    String result = quoteData.getGainPercentHTML();
    assertNotNull(result);
    assertTrue(result.contains("%"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLow_VgIb0() {
    BigDecimal initialLow = new BigDecimal("100");
    BigDecimal newLow = new BigDecimal("105");
    QuoteData quoteData = new QuoteData(new BigDecimal("200"), new BigDecimal("210"), "AAPL", new BigDecimal("215"), initialLow, "Apple Inc.", 5000000.0, 5.0);
    quoteData.setLow(newLow);
    assertEquals(newLow, quoteData.getLow());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_JfUm0() {
    BigDecimal open = new BigDecimal("100");
    BigDecimal price = new BigDecimal("105");
    BigDecimal high = new BigDecimal("110");
    BigDecimal low = new BigDecimal("95");
    String symbol = "AAPL";
    String companyName = "Apple Inc.";
    Double volume = 15000.0;
    Double change = 5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    assertEquals(15000.0, quoteData.getVolume(), 0.0);
  }
}