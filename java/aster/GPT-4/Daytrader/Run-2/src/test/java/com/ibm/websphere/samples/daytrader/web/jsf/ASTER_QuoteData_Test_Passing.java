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
  public void testSetRange_Bnpc0() {
    BigDecimal price = new BigDecimal("100");
    BigDecimal open = new BigDecimal("95");
    String symbol = "AAPL";
    BigDecimal high = new BigDecimal("105");
    BigDecimal low = new BigDecimal("90");
    String companyName = "Apple Inc.";
    Double volume = 1000000.0;
    Double change = 2.5;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    quoteData.setRange("52 Week");
    assertEquals("52 Week", quoteData.getRange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainHTML_dXsg0_1() {
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
  public void testSetHigh_FcCL0() {
    BigDecimal initialHigh = new BigDecimal("150.00");
    BigDecimal newHigh = new BigDecimal("155.00");
    QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("105.00"), "AAPL", initialHigh, new BigDecimal("95.00"), "Apple Inc.", 5000000.0, 2.5);
    quoteData.setHigh(newHigh);
    assertEquals(newHigh, quoteData.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChangeHTML_PositiveChange_GgaG0() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(100), BigDecimal.valueOf(105), "AAPL", BigDecimal.valueOf(110), BigDecimal.valueOf(95), "Apple Inc.", 50000.0, 5.0);
    String result = quoteData.getChangeHTML();
    assertTrue(result.contains("#009900"));
    assertTrue(result.contains("arrowup.gif"));
    assertTrue(result.contains("5.00"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChangeHTML_NegativeChange_wuQy1() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(100), BigDecimal.valueOf(95), "AAPL", BigDecimal.valueOf(105), BigDecimal.valueOf(90), "Apple Inc.", 50000.0, -5.0);
    String result = quoteData.getChangeHTML();
    assertTrue(result.contains("#cc0000"));
    assertTrue(result.contains("arrowdown.gif"));
    assertTrue(result.contains("-5.00"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompanyName_qJJQ0() {
    BigDecimal price = new BigDecimal("100");
    BigDecimal open = new BigDecimal("95");
    BigDecimal high = new BigDecimal("105");
    BigDecimal low = new BigDecimal("90");
    String symbol = "AAPL";
    String companyName = "Apple Inc.";
    Double volume = 1000.0;
    Double change = 2.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    assertEquals("Apple Inc.", quoteData.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGain_QdhY0() {
    BigDecimal initialGain = new BigDecimal("5.0");
    QuoteData quoteData = new QuoteData(new BigDecimal("100"), new BigDecimal("105"), "AAPL");
    quoteData.setGain(initialGain);
    assertEquals(initialGain, quoteData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_CFCs0() {
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
  public void testGetPrice_ZZuE0() {
    BigDecimal expectedPrice = new BigDecimal("100.00");
    QuoteData quoteData = new QuoteData(expectedPrice, new BigDecimal("95.00"), "AAPL");
    BigDecimal actualPrice = quoteData.getPrice();
    assertEquals(expectedPrice, actualPrice);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLow_fIHU0() {
    BigDecimal open = new BigDecimal("100");
    BigDecimal price = new BigDecimal("105");
    BigDecimal high = new BigDecimal("110");
    BigDecimal low = new BigDecimal("95");
    String symbol = "XYZ";
    String companyName = "XYZ Corp";
    Double volume = 1000.0;
    Double change = 5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    BigDecimal expected = new BigDecimal("95");
    assertEquals(expected, quoteData.getLow());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChange_UZez0() {
    BigDecimal open = new BigDecimal("100");
    BigDecimal price = new BigDecimal("105");
    BigDecimal high = new BigDecimal("110");
    BigDecimal low = new BigDecimal("95");
    String symbol = "AAPL";
    String companyName = "Apple Inc.";
    Double volume = 1000000.0;
    Double change = 5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    assertEquals(5.0, quoteData.getChange(), 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHigh_bzIn0() {
    BigDecimal open = new BigDecimal("100");
    BigDecimal price = new BigDecimal("105");
    BigDecimal high = new BigDecimal("110");
    BigDecimal low = new BigDecimal("95");
    String symbol = "AAPL";
    String companyName = "Apple Inc.";
    Double volume = 1000000.0;
    Double change = 5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    BigDecimal result = quoteData.getHigh();
    assertEquals(high, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_tJug0() {
    BigDecimal initialPrice = new BigDecimal("100.00");
    BigDecimal newPrice = new BigDecimal("150.00");
    QuoteData quoteData = new QuoteData(initialPrice, new BigDecimal("95.00"), "AAPL");
    quoteData.setPrice(newPrice);
    assertEquals(newPrice, quoteData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbol_FerD0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("100"), new BigDecimal("95"), "AAPL");
    String expected = "AAPL";
    assertEquals(expected, quoteData.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLow_JOir0() {
    BigDecimal initialLow = new BigDecimal("100");
    BigDecimal newLow = new BigDecimal("95");
    QuoteData quoteData = new QuoteData(new BigDecimal("120"), new BigDecimal("110"), "AAPL", new BigDecimal("130"), initialLow, "Apple Inc.", 5000000.0, 5.0);
    quoteData.setLow(newLow);
    assertEquals(newLow, quoteData.getLow());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompanyName_WHfW0() {
    BigDecimal price = new BigDecimal("100.00");
    BigDecimal open = new BigDecimal("95.00");
    BigDecimal high = new BigDecimal("105.00");
    BigDecimal low = new BigDecimal("90.00");
    String symbol = "AAPL";
    String companyName = "Apple Inc.";
    Double volume = 1000.0;
    Double change = 5.0;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    quoteData.setCompanyName("New Apple Inc.");
    assertEquals("New Apple Inc.", quoteData.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_fshS0() {
    BigDecimal price = new BigDecimal("100");
    BigDecimal open = new BigDecimal("95");
    BigDecimal high = new BigDecimal("105");
    BigDecimal low = new BigDecimal("90");
    String symbol = "XYZ";
    String companyName = "XYZ Corp";
    Double volume = 1500.0;
    Double change = 2.5;
    QuoteData quoteData = new QuoteData(open, price, symbol, high, low, companyName, volume, change);
    assertEquals(1500.0, quoteData.getVolume(), 0.0);
  }
}