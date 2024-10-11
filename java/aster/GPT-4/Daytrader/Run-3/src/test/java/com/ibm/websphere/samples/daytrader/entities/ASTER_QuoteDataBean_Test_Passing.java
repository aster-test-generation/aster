/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteDataBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_SNjs0_1() {
    QuoteDataBean instance = QuoteDataBean.getRandomInstance();
    assertNotNull(instance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_SNjs0_2() {
    QuoteDataBean instance = QuoteDataBean.getRandomInstance();
    assertNotNull(instance.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_SNjs0_3() {
    QuoteDataBean instance = QuoteDataBean.getRandomInstance();
    assertTrue(instance.getCompanyName().contains("Incorporated"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_SNjs0_4() {
    QuoteDataBean instance = QuoteDataBean.getRandomInstance();
    assertTrue(instance.getVolume() >= 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_SNjs0_5() {
    QuoteDataBean instance = QuoteDataBean.getRandomInstance();
    assertTrue(instance.getPrice().compareTo(BigDecimal.ZERO) >= 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_SNjs0_6() {
    QuoteDataBean instance = QuoteDataBean.getRandomInstance();
    assertTrue(instance.getOpen().compareTo(BigDecimal.ZERO) >= 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_SNjs0_7() {
    QuoteDataBean instance = QuoteDataBean.getRandomInstance();
    assertTrue(instance.getLow().compareTo(BigDecimal.ZERO) >= 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_SNjs0_8() {
    QuoteDataBean instance = QuoteDataBean.getRandomInstance();
    assertTrue(instance.getHigh().compareTo(BigDecimal.ZERO) >= 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_SNjs0_9() {
    QuoteDataBean instance = QuoteDataBean.getRandomInstance();
    assertTrue(instance.getChange() >= 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompanyName_AdsB0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 5000000, new BigDecimal("150.00"), new BigDecimal("148.00"), new BigDecimal("147.00"), new BigDecimal("152.00"), 1.5);
    assertEquals("Apple Inc.", quoteDataBean.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithNonNullSymbol_BHIj0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    int expectedHashCode = "AAPL".hashCode();
    assertEquals(expectedHashCode, quoteDataBean.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithNullSymbol_shVf1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    assertEquals(0, quoteDataBean.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrice_arZx0() {
    BigDecimal expectedPrice = new BigDecimal("150.00");
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, expectedPrice, new BigDecimal("145.00"), new BigDecimal("140.00"), new BigDecimal("155.00"), 5.00);
    BigDecimal actualPrice = quoteDataBean.getPrice();
    assertEquals(expectedPrice, actualPrice);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_SHEg0() {
    BigDecimal price = new BigDecimal("150.00");
    BigDecimal open = new BigDecimal("145.00");
    BigDecimal low = new BigDecimal("140.00");
    BigDecimal high = new BigDecimal("155.00");
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 5000000, price, open, low, high, 5.00);
    String expectedHTML = "<BR>Quote Data for: AAPL<LI> companyName: Apple Inc.</LI><LI>      volume: 5000000.0</LI><LI>       price: 150.00</LI><LI>        open1: 145.00</LI><LI>         low: 140.00</LI><LI>        high: 155.00</LI><LI>      change1: 5.0</LI>";
    assertEquals(expectedHTML, quoteDataBean.toHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpen_xhBs0() {
    BigDecimal expectedOpen = new BigDecimal("150.00");
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, new BigDecimal("145.00"), expectedOpen, new BigDecimal("140.00"), new BigDecimal("155.00"), 5.00);
    BigDecimal actualOpen = quoteDataBean.getOpen();
    assertEquals(expectedOpen, actualOpen);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLow_fjMe0() {
    BigDecimal expectedLow = new BigDecimal("100.00");
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 5000, new BigDecimal("150.00"), new BigDecimal("155.00"), expectedLow, new BigDecimal("160.00"), 1.5);
    BigDecimal actualLow = quoteDataBean.getLow();
    assertEquals(expectedLow, actualLow);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChange_sFZN0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 5000000, new BigDecimal("150.50"), new BigDecimal("151.00"), new BigDecimal("148.00"), new BigDecimal("152.00"), 1.25);
    assertEquals(1.25, quoteDataBean.getChange(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHigh_omRh0() {
    BigDecimal expectedHigh = new BigDecimal("150.00");
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 5000, new BigDecimal("145.00"), new BigDecimal("140.00"), new BigDecimal("138.00"), expectedHigh, 5.00);
    BigDecimal actualHigh = quoteDataBean.getHigh();
    assertEquals(expectedHigh, actualHigh);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_NcoH0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    BigDecimal newPrice = new BigDecimal("150.00");
    quoteDataBean.setPrice(newPrice);
    assertEquals(newPrice, quoteDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSameSymbol_dfmC0() {
    QuoteDataBean quote1 = new QuoteDataBean("AAPL");
    QuoteDataBean quote2 = new QuoteDataBean("AAPL");
    assertTrue(quote1.equals(quote2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentSymbol_EMFj1() {
    QuoteDataBean quote1 = new QuoteDataBean("AAPL");
    QuoteDataBean quote2 = new QuoteDataBean("MSFT");
    assertFalse(quote1.equals(quote2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNullSymbolInFirstObject_iIfh2() {
    QuoteDataBean quote1 = new QuoteDataBean(null);
    QuoteDataBean quote2 = new QuoteDataBean("AAPL");
    assertFalse(quote1.equals(quote2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNullSymbolInBothObjects_ClNs3() {
    QuoteDataBean quote1 = new QuoteDataBean(null);
    QuoteDataBean quote2 = new QuoteDataBean(null);
    assertTrue(quote1.equals(quote2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithItself_IefP4() {
    QuoteDataBean quote1 = new QuoteDataBean("AAPL");
    assertTrue(quote1.equals(quote1));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbol_gTqD0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    String expected = "AAPL";
    String actual = quoteDataBean.getSymbol();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLow_dkfe0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    BigDecimal lowValue = new BigDecimal("123.45");
    quoteDataBean.setLow(lowValue);
    assertEquals(lowValue, quoteDataBean.getLow());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompanyName_HaUf0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    String expectedCompanyName = "Test Company";
    quoteDataBean.setCompanyName(expectedCompanyName);
    assertEquals(expectedCompanyName, quoteDataBean.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_QQfK0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 5000.0, new BigDecimal("150.00"), new BigDecimal("148.00"), new BigDecimal("147.00"), new BigDecimal("151.00"), 2.0);
    assertEquals(5000.0, quoteDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbol_hsPv0_rwqK0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    quoteDataBean.setSymbol("AAPL");
    assertEquals("AAPL", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHigh_VTdq0_XWqz0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    BigDecimal highValue = new BigDecimal("150.25");
    quoteDataBean.setHigh(highValue);
    assertEquals(highValue, quoteDataBean.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_YXIB0_zJEi0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    double expectedVolume = 1500.0;
    quoteDataBean.setVolume(expectedVolume);
    assertEquals(expectedVolume, quoteDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpen_BdQn0_MuXc0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    BigDecimal expectedOpen = new BigDecimal("123.45");
    quoteDataBean.setOpen(expectedOpen);
    assertEquals(expectedOpen, quoteDataBean.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetChange_gpit0_PDYM0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    double expectedChange = 5.0;
    quoteDataBean.setChange(expectedChange);
    assertEquals(expectedChange, quoteDataBean.getChange(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume() {
    BigDecimal price = new BigDecimal("150.25");
    BigDecimal open = new BigDecimal("145.00");
    BigDecimal low = new BigDecimal("140.00");
    BigDecimal high = new BigDecimal("155.00");
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 5000000, price, open, low, high, 2.5);
    double expectedVolume = 5000000;
    assertEquals(expectedVolume, quoteDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_SNjs0() {
    QuoteDataBean instance = QuoteDataBean.getRandomInstance();
    assertNotNull(instance);
    assertNotNull(instance.getSymbol());
    assertTrue(instance.getCompanyName().contains("Incorporated"));
    assertTrue(instance.getVolume() >= 0);
    assertTrue(instance.getPrice().compareTo(BigDecimal.ZERO) >= 0);
    assertTrue(instance.getOpen().compareTo(BigDecimal.ZERO) >= 0);
    assertTrue(instance.getLow().compareTo(BigDecimal.ZERO) >= 0);
    assertTrue(instance.getHigh().compareTo(BigDecimal.ZERO) >= 0);
    assertTrue(instance.getChange() >= 0);
  }
}