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
  public void testSetVolume_xcRj0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.setVolume(1000.0);
    assertEquals(1000.0, quoteDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolumeWithNegativeValue_VTUd1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.setVolume(-1000.0);
    assertEquals(-1000.0, quoteDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolumeWithZeroValue_GbrZ2() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.setVolume(0.0);
    assertEquals(0.0, quoteDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_SymbolNotNull_Kdlu0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    int expectedHashCode = "AAPL".hashCode();
    int actualHashCode = quoteDataBean.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_SymbolNull_CdWr1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    int expectedHashCode = 0;
    int actualHashCode = quoteDataBean.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHigh_VDlN0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, BigDecimal.valueOf(100.00), BigDecimal.valueOf(90.00), BigDecimal.valueOf(80.00), BigDecimal.valueOf(100.00), 10.0);
    quoteDataBean.setHigh(BigDecimal.valueOf(110.00));
    assertEquals(BigDecimal.valueOf(110.00), quoteDataBean.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbol_dMkc0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    assertEquals("AAPL", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_fjFy0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, BigDecimal.valueOf(100.00), BigDecimal.valueOf(90.00), BigDecimal.valueOf(80.00), BigDecimal.valueOf(95.00), 5.0);
    assertEquals(1000000, quoteDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolumeWithZeroVolume_TZwP1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 0, BigDecimal.valueOf(100.00), BigDecimal.valueOf(90.00), BigDecimal.valueOf(80.00), BigDecimal.valueOf(95.00), 5.0);
    assertEquals(0, quoteDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolumeWithNegativeVolume_ygpU2() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", -1000000, BigDecimal.valueOf(100.00), BigDecimal.valueOf(90.00), BigDecimal.valueOf(80.00), BigDecimal.valueOf(95.00), 5.0);
    assertEquals(-1000000, quoteDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrint_withSymbol_sPAd0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.print();
    assertEquals("AAPL", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrint_withChange_JFHx7() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, new BigDecimal("100.00"), new BigDecimal("90.00"), new BigDecimal("80.00"), new BigDecimal("120.00"), 20.0);
    quoteDataBean.print();
    assertEquals(20.0, quoteDataBean.getChange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_VMfy0_1() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_VMfy0_2() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_VMfy0_3() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_VMfy0_4() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_VMfy0_5() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getLow());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_VMfy0_6() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_VMfy0_7() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getChange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_VMfy0_8() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbol_rHVB0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.setSymbol("GOOG");
    assertEquals("GOOG", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbolWithNull_AHiv1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.setSymbol(null);
    assertEquals(null, quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbolWithEmptyString_RCta2() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.setSymbol("");
    assertEquals("", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbolWithInvalidSymbol_NfNN3() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.setSymbol("INVALID");
    assertEquals("INVALID", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbolWithDifferentSymbol_EcKd5() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.setSymbol("FB");
    assertEquals("FB", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbolWithSameSymbol_PMgf6() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.setSymbol("AAPL");
    assertEquals("AAPL", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbolWithDifferentCaseSymbol_fRJz7() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.setSymbol("aapl");
    assertEquals("aapl", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpen_Dlmn0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    BigDecimal open = new BigDecimal(10.0);
    quoteDataBean.setOpen(open);
    assertEquals(open, quoteDataBean.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenWithNull_RtgK1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    BigDecimal open = null;
    quoteDataBean.setOpen(open);
    assertNull(quoteDataBean.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenWithZero_hRnf2() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    BigDecimal open = new BigDecimal(0.0);
    quoteDataBean.setOpen(open);
    assertEquals(open, quoteDataBean.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenWithNegative_HsAF3() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    BigDecimal open = new BigDecimal(-10.0);
    quoteDataBean.setOpen(open);
    assertEquals(open, quoteDataBean.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenWithMaxValue_nGMW4() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    BigDecimal open = new BigDecimal(Double.MAX_VALUE);
    quoteDataBean.setOpen(open);
    assertEquals(open, quoteDataBean.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenWithMinValue_tZoe5() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    BigDecimal open = new BigDecimal(Double.MIN_VALUE);
    quoteDataBean.setOpen(open);
    assertEquals(open, quoteDataBean.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenWithRandomValue_kFHy9() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    BigDecimal open = new BigDecimal(Math.random() * 100);
    quoteDataBean.setOpen(open);
    assertEquals(open, quoteDataBean.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrice_CompanyName_FkoX1_sGRz0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 100.0, BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0), 0.0);
    BigDecimal price = quoteDataBean.getPrice();
    assertEquals(BigDecimal.valueOf(100.0), price);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrice_Volume_tMMM2_nYKD0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0), 0.0);
    BigDecimal price = quoteDataBean.getPrice();
    assertEquals(BigDecimal.valueOf(100.0), price);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompanyName_InvalidSymbol_aToa3_Ydzc0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("INVALID");
    assertNull(quoteDataBean.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrint_withPrice_vSCF3_rMxA0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, new BigDecimal("100.00"), new BigDecimal("100.00"), new BigDecimal("100.00"), new BigDecimal("100.00"), 0.0);
    quoteDataBean.print();
    assertEquals(new BigDecimal("100.00"), quoteDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidSymbol_bvud2_MnZh0_1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    assertNotNull(quoteDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidCompanyName_chnI4_OUhX0_1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 10000, BigDecimal.valueOf(123.45), BigDecimal.valueOf(123.45), BigDecimal.valueOf(123.45), BigDecimal.valueOf(123.45), 0.0);
    assertNotNull(quoteDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidCompanyName_chnI4_OUhX0_2() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 10000, BigDecimal.valueOf(123.45), BigDecimal.valueOf(123.45), BigDecimal.valueOf(123.45), BigDecimal.valueOf(123.45), 0.0);
    assertEquals("AAPL", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidCompanyName_chnI4_OUhX0_3() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 10000, BigDecimal.valueOf(123.45), BigDecimal.valueOf(123.45), BigDecimal.valueOf(123.45), BigDecimal.valueOf(123.45), 0.0);
    assertEquals("Apple Inc.", quoteDataBean.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrice_Symbol_lYAq0_fid1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    BigDecimal price = quoteDataBean.getPrice();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrint_withCompanyName_LERL1_LUjp0_fid1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.print();
    assertNull(quoteDataBean.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenWithNullCompanyName_Lpuo2_aZaJ0_fid1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", null, 1000000, BigDecimal.valueOf(100.0), BigDecimal.valueOf(90.0), BigDecimal.valueOf(80.0), BigDecimal.valueOf(100.0), 10.0);
    BigDecimal open = quoteDataBean.getOpen();
    assertEquals(BigDecimal.valueOf(90.0), open);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLowWithEmptySymbol_JpVf2_vXdZ0_fid1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("", "Apple Inc.", 1000000, BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0), BigDecimal.valueOf(90.0), BigDecimal.valueOf(110.0), 10.0);
    BigDecimal low = quoteDataBean.getLow();
    assertEquals(BigDecimal.valueOf(90.0), low);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLowWithInvalidSymbol_OqbD3_MGNF0_fid1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("ABC", "Apple Inc.", 1000000, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(90.0), new BigDecimal(110.0), 10.0);
    BigDecimal low = quoteDataBean.getLow();
    assertEquals(new BigDecimal(90.0), low);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_VMfy0() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean);
    assertNotNull(quoteDataBean.getCompanyName());
    assertNotNull(quoteDataBean.getPrice());
    assertNotNull(quoteDataBean.getOpen());
    assertNotNull(quoteDataBean.getLow());
    assertNotNull(quoteDataBean.getHigh());
    assertNotNull(quoteDataBean.getChange());
    assertNotNull(quoteDataBean.getVolume());
  }
}