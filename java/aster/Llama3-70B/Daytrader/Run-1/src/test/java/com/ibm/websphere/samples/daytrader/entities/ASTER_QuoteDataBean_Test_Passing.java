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
  public void testGetRandomInstance_MxcQ0_1() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_MxcQ0_2() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_MxcQ0_3() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_MxcQ0_4() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_MxcQ0_5() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_MxcQ0_6() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getLow());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_MxcQ0_7() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_MxcQ0_8() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertTrue(quoteDataBean.getVolume() >= 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_MxcQ0_9() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertTrue(quoteDataBean.getChange() >= 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbol_LqKx0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    quoteDataBean.setSymbol("TEST_SYMBOL");
    assertEquals("TEST_SYMBOL", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHigh_WscA0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    BigDecimal high = BigDecimal.valueOf(20.0);
    quoteDataBean.setHigh(high);
    assertEquals(high, quoteDataBean.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompanyName_oDRH0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    assertEquals("companyName", quoteDataBean.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_SymbolNotNull_wmCt0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    assertEquals(-887523944, quoteDataBean.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_SymbolNull_QjGu1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    assertEquals(0, quoteDataBean.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_gYwl0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    quoteDataBean.setVolume(10.0);
    assertEquals(10.0, quoteDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrice_Eism0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal("10.0"), new BigDecimal("5.0"), new BigDecimal("3.0"), new BigDecimal("15.0"), 5.0);
    assertEquals(new BigDecimal("10.0"), quoteDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpen_oDPl0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(7.0), 2.0);
    BigDecimal open = BigDecimal.valueOf(5.1);
    quoteDataBean.setOpen(open);
    assertEquals(open, quoteDataBean.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetChange_DSyL0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    quoteDataBean.setChange(20.0);
    assertEquals(20.0, quoteDataBean.getChange(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_yzeC0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("10.0"), new BigDecimal("5.0"), new BigDecimal("3.0"), new BigDecimal("15.0"), 2.0);
    String expected = "<BR>Quote Data for: symbol<LI> companyName: companyName</LI><LI>      volume: 100.0</LI><LI>       price: 10.0</LI><LI>        open1: 5.0</LI><LI>         low: 3.0</LI><LI>        high: 15.0</LI><LI>      change1: 2.0</LI>";
    assertEquals(expected, quoteDataBean.toHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpen_gukA0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(7.0), 2.0);
    assertEquals(BigDecimal.valueOf(5.0), quoteDataBean.getOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLow_PqPt0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal(10.0), new BigDecimal(5.0), new BigDecimal(3.0), new BigDecimal(15.0), 2.0);
    assertEquals(new BigDecimal(3.0), quoteDataBean.getLow());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetChange_nwap0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("10.0"), new BigDecimal("5.0"), new BigDecimal("3.0"), new BigDecimal("15.0"), 2.0);
    assertEquals(2.0, quoteDataBean.getChange(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHigh_lKim0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal("10.0"), new BigDecimal("5.0"), new BigDecimal("3.0"), new BigDecimal("15.0"), 2.0);
    assertEquals(new BigDecimal("15.0"), quoteDataBean.getHigh());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_Fihv0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, 0.0);
    BigDecimal price = new BigDecimal("10.0");
    quoteDataBean.setPrice(price);
    assertEquals(price, quoteDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_Bcuh0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    assertTrue(quoteDataBean.equals(quoteDataBean));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_HeHd1() {
    Object object = new Object();
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    assertFalse(quoteDataBean.equals(object));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameValues_NWPN2() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    assertTrue(quoteDataBean1.equals(quoteDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentSymbol_hiTI3() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean("symbol1", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol2", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    assertFalse(quoteDataBean1.equals(quoteDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullSymbol_QxPQ4() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean(null, "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    assertFalse(quoteDataBean1.equals(quoteDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbol1_bybW0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    assertEquals("symbol", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbol2_UCLq1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    assertNull(quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSymbol3_lvYi2() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal(10.0), new BigDecimal(5.0), new BigDecimal(3.0), new BigDecimal(15.0), 5.0);
    assertEquals("symbol", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_YHTe0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), 10.0);
    String expected = "\n\tQuote Data for: symbol\n\t\t companyName: companyName\n\t\t      volume: 10.0\n\t\t       price: 10.0\n\t\t        open1: 10.0\n\t\t         low: 10.0\n\t\t        high: 10.0\n\t\t      change1: 10.0";
    assertEquals(expected, quoteDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLow_TvHv0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    BigDecimal low = BigDecimal.valueOf(5.0);
    quoteDataBean.setLow(low);
    assertEquals(low, quoteDataBean.getLow());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompanyName_PjGS0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    quoteDataBean.setCompanyName("companyName");
    assertEquals("companyName", quoteDataBean.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_eLxD0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("10.0"), new BigDecimal("9.0"), new BigDecimal("8.0"), new BigDecimal("11.0"), 1.0);
    assertEquals(100.0, quoteDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_SMmD0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(15.0), 2.0);
    assertEquals(10.0, quoteDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_MxcQ0() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean);
    assertNotNull(quoteDataBean.getSymbol());
    assertNotNull(quoteDataBean.getCompanyName());
    assertNotNull(quoteDataBean.getPrice());
    assertNotNull(quoteDataBean.getOpen());
    assertNotNull(quoteDataBean.getLow());
    assertNotNull(quoteDataBean.getHigh());
    assertTrue(quoteDataBean.getVolume() >= 0);
    assertTrue(quoteDataBean.getChange() >= 0);
  }
}