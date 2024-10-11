/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuoteDataBean_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_LcWS0_1() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_LcWS0_2() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getSymbol());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_LcWS0_3() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getCompanyName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_LcWS0_4() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertTrue(quoteDataBean.getVolume() > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_LcWS0_5() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getPrice());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_LcWS0_6() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getOpen());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_LcWS0_7() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getLow());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_LcWS0_8() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean.getHigh());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_LcWS0_9() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertTrue(quoteDataBean.getChange() > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSymbol_ZDZp0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    quoteDataBean.setSymbol("TestSymbol");
    assertEquals("TestSymbol", quoteDataBean.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHigh_njPn0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    BigDecimal high = BigDecimal.valueOf(20.0);
    quoteDataBean.setHigh(high);
    assertEquals(high, quoteDataBean.getHigh());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompanyName_GgpZ0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 0.0, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, 0.0);
    assertEquals("companyName", quoteDataBean.getCompanyName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_SymbolNotNull_kWdi0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    int expected = "symbol".hashCode();
    int actual = quoteDataBean.hashCode();
    assert expected == actual;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_SymbolNull_CEpS1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    int expected = 0;
    int actual = quoteDataBean.hashCode();
    assert expected == actual;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetVolume_YUHr0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    quoteDataBean.setVolume(20.0);
    assertEquals(20.0, quoteDataBean.getVolume(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrice_jOju0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal(10.0), new BigDecimal(5.0), new BigDecimal(3.0), new BigDecimal(15.0), 2.0);
    assertEquals(new BigDecimal(10.0), quoteDataBean.getPrice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOpen_ThVA0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(7.0), 2.0);
    BigDecimal open = BigDecimal.valueOf(4.0);
    quoteDataBean.setOpen(open);
    assertEquals(open, quoteDataBean.getOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetChange_giLN0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), 10.0);
    quoteDataBean.setChange(20.0);
    assertEquals(20.0, quoteDataBean.getChange(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToHTML_zPbH0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("10.0"), new BigDecimal("9.0"), new BigDecimal("8.0"), new BigDecimal("11.0"), 1.0);
    String expected = "<BR>Quote Data for: symbol<LI> companyName: companyName</LI><LI>      volume: 100.0</LI><LI>       price: 10.0</LI><LI>        open1: 9.0</LI><LI>         low: 8.0</LI><LI>        high: 11.0</LI><LI>      change1: 1.0</LI>";
    assertEquals(expected, quoteDataBean.toHTML());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpen_ynFs0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal("10.0"), new BigDecimal("5.0"), new BigDecimal("4.0"), new BigDecimal("6.0"), 1.0);
    assertEquals(new BigDecimal("5.0"), quoteDataBean.getOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLow_JgJe0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal(10.0), new BigDecimal(5.0), new BigDecimal(3.0), new BigDecimal(15.0), 5.0);
    assertEquals(new BigDecimal(3.0), quoteDataBean.getLow());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetChange_jCKq0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("10.0"), new BigDecimal("5.0"), new BigDecimal("3.0"), new BigDecimal("15.0"), 2.0);
    assertEquals(2.0, quoteDataBean.getChange(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHigh_kkNh0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(15.0), 2.0);
    assertEquals(BigDecimal.valueOf(15.0), quoteDataBean.getHigh());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPrice_hoIE0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    BigDecimal price = BigDecimal.valueOf(20.0);
    quoteDataBean.setPrice(price);
    assertEquals(price, quoteDataBean.getPrice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_orUi0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    assertTrue(quoteDataBean.equals(quoteDataBean));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_UwzG1() {
    Object object = new Object();
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    assertFalse(quoteDataBean.equals(object));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameSymbol_fohj2() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean("symbol");
    QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol");
    assertTrue(quoteDataBean1.equals(quoteDataBean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentSymbol_oCAI3() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean("symbol1");
    QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol2");
    assertFalse(quoteDataBean1.equals(quoteDataBean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullSymbol_QNsI4() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean("symbol");
    QuoteDataBean quoteDataBean2 = new QuoteDataBean(null);
    assertFalse(quoteDataBean1.equals(quoteDataBean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_FEEq0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    assertEquals("symbol", quoteDataBean.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_Empty_KCFD1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    assertNull(quoteDataBean.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_FullConstructor_cmah2() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal(10.0), new BigDecimal(10.0), new BigDecimal(10.0), new BigDecimal(10.0), 10.0);
    assertEquals("symbol", quoteDataBean.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NXPY0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), 10.0);
    String expected = "\n\tQuote Data for: symbol\n\t\t companyName: companyName\n\t\t      volume: 10.0\n\t\t       price: 10.0\n\t\t        open1: 10.0\n\t\t         low: 10.0\n\t\t        high: 10.0\n\t\t      change1: 10.0";
    assertEquals(expected, quoteDataBean.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLow_ggTV0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), 10.0);
    BigDecimal low = BigDecimal.valueOf(5.0);
    quoteDataBean.setLow(low);
    assertEquals(low, quoteDataBean.getLow());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompanyName_nnow0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    quoteDataBean.setCompanyName("companyName");
    assertEquals("companyName", quoteDataBean.getCompanyName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetVolume_XEsa0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("10.0"), new BigDecimal("5.0"), new BigDecimal("3.0"), new BigDecimal("15.0"), 5.0);
    assertEquals(100.0, quoteDataBean.getVolume(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPrint_erIl0_ppMg0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 10.0, new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), 10.0);
    String result = quoteDataBean.toString();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_LcWS0() {
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    assertNotNull(quoteDataBean);
    assertNotNull(quoteDataBean.getSymbol());
    assertNotNull(quoteDataBean.getCompanyName());
    assertTrue(quoteDataBean.getVolume() > 0);
    assertNotNull(quoteDataBean.getPrice());
    assertNotNull(quoteDataBean.getOpen());
    assertNotNull(quoteDataBean.getLow());
    assertNotNull(quoteDataBean.getHigh());
    assertTrue(quoteDataBean.getChange() > 0);
}
}