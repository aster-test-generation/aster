/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuoteData_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRange_BLrW0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("10.0"), new BigDecimal("11.0"), "symbol");
    quoteData.setRange("1d");
    assertEquals("1d", quoteData.getRange());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGainHTML_EpkI0() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(10.0), BigDecimal.valueOf(5.0), "symbol", BigDecimal.valueOf(15.0), BigDecimal.valueOf(3.0), "companyName", 100.0, 2.0);
    String result = quoteData.getGainHTML();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSymbol_GbQM0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("10.0"), new BigDecimal("11.0"), "ABC");
    quoteData.setSymbol("XYZ");
    assertEquals("XYZ", quoteData.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHigh_zwCp0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("10.0"), new BigDecimal("11.0"), "symbol");
    BigDecimal high = new BigDecimal("12.0");
    quoteData.setHigh(high);
    assertEquals(high, quoteData.getHigh());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGainPercent_LxSR0() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(10), BigDecimal.valueOf(5), "symbol");
    quoteData.setGainPercent(BigDecimal.valueOf(0.05));
    assertEquals(BigDecimal.valueOf(0.05).setScale(2), quoteData.getGainPercent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetChangeHTML_PositiveChange_Ozja0() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(10.0), BigDecimal.valueOf(9.0), "symbol", BigDecimal.valueOf(11.0), BigDecimal.valueOf(8.0), "companyName", 100.0, 1.0);
    String result = quoteData.getChangeHTML();
    assertEquals("<FONT color=\"#009900\">1.00</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetChangeHTML_NegativeChange_YpLT1() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(10.0), BigDecimal.valueOf(11.0), "symbol", BigDecimal.valueOf(12.0), BigDecimal.valueOf(9.0), "companyName", 100.0, -1.0);
    String result = quoteData.getChangeHTML();
    assertEquals("<FONT color=\"#cc0000\">-1.00</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompanyName_aJAJ0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("10.0"), new BigDecimal("11.0"), "symbol", new BigDecimal("12.0"), new BigDecimal("9.0"), "companyName", 100.0, 1.0);
    assertEquals("companyName", quoteData.getCompanyName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGain_zjZc0() {
    QuoteData quoteData = new QuoteData(BigDecimal.ZERO, BigDecimal.ZERO, "symbol");
    BigDecimal gain = BigDecimal.ONE;
    quoteData.setGain(gain);
    assertEquals(gain, quoteData.getGain());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetVolume_Jaxr0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("10.0"), new BigDecimal("10.0"), "symbol");
    quoteData.setVolume(100.0);
    assertEquals(100.0, quoteData.getVolume(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrice_VTbE0() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(10.5), BigDecimal.valueOf(11.5), "ABC");
    assertEquals(BigDecimal.valueOf(10.5), quoteData.getPrice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrice2_uyuB1() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(11.5), BigDecimal.valueOf(10.5), "ABC", BigDecimal.valueOf(12.5), BigDecimal.valueOf(9.5), "ABC Company", 100.0, 1.0);
    assertEquals(BigDecimal.valueOf(10.5), quoteData.getPrice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOpen_YNNj0() {
    QuoteData quoteData = new QuoteData(BigDecimal.ZERO, BigDecimal.ZERO, "symbol");
    BigDecimal open = BigDecimal.ONE;
    quoteData.setOpen(open);
    assertEquals(open, quoteData.getOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetChange_bLwN0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("10.0"), new BigDecimal("11.0"), "symbol");
    quoteData.setChange(5.0);
    assertEquals(5.0, quoteData.getChange(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpen2_enzx1() {
    QuoteData quoteData = new QuoteData(new BigDecimal("10.0"), new BigDecimal("15.0"), "symbol", new BigDecimal("20.0"), new BigDecimal("5.0"), "companyName", 100.0, 5.0);
    assertEquals(new BigDecimal("10.0"), quoteData.getOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLow_URWO0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("10.0"), new BigDecimal("15.0"), "symbol", new BigDecimal("20.0"), new BigDecimal("5.0"), "companyName", 100.0, 5.0);
    assertEquals(new BigDecimal("5.0"), quoteData.getLow());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetChange_gMCE0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("10.0"), new BigDecimal("15.0"), "symbol", new BigDecimal("20.0"), new BigDecimal("5.0"), "companyName", 100.0, 5.0);
    assertEquals(5.0, quoteData.getChange(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHigh_qDUi0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("10.0"), new BigDecimal("5.0"), "symbol", new BigDecimal("15.0"), new BigDecimal("3.0"), "companyName", 100.0, 2.0);
    assertEquals(new BigDecimal("15.0"), quoteData.getHigh());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPrice_ktPA0() {
    QuoteData quoteData = new QuoteData(BigDecimal.ZERO, BigDecimal.ZERO, "symbol");
    BigDecimal price = BigDecimal.ONE;
    quoteData.setPrice(price);
    assertEquals(price, quoteData.getPrice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_BhQc0() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(10.0), BigDecimal.valueOf(5.0), "ABC");
    assertEquals("ABC", quoteData.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol2_hGZm1() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(5.0), BigDecimal.valueOf(10.0), "ABC", BigDecimal.valueOf(15.0), BigDecimal.valueOf(3.0), "ABC Company", 100.0, 2.0);
    assertEquals("ABC", quoteData.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLow_dAgk0() {
    QuoteData quoteData = new QuoteData(BigDecimal.ZERO, BigDecimal.ZERO, "symbol");
    quoteData.setLow(BigDecimal.ONE);
    assertEquals(BigDecimal.ONE, quoteData.getLow());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompanyName_Uckx0() {
    QuoteData quoteData = new QuoteData(BigDecimal.ZERO, BigDecimal.ZERO, "symbol");
    quoteData.setCompanyName("New Company Name");
    assertEquals("New Company Name", quoteData.getCompanyName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetVolume_cIqA0() {
    QuoteData quoteData = new QuoteData(new BigDecimal("10.0"), new BigDecimal("11.0"), "symbol", new BigDecimal("12.0"), new BigDecimal("9.0"), "companyName", 100.0, 1.0);
    assertEquals(100.0, quoteData.getVolume(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRange_gOEZ0_fid1() {
    QuoteData quoteData = new QuoteData(BigDecimal.valueOf(10.0), BigDecimal.valueOf(5.0), "ABC", BigDecimal.valueOf(15.0), BigDecimal.valueOf(3.0), "ABC Company", 100.0, 2.0);
    String range = quoteData.getRange();
    assertNull(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpen_EHwM0_fid1() {
    QuoteData quoteData = new QuoteData(new BigDecimal("15.0"), new BigDecimal("15.0"), "symbol");
    assertEquals(new BigDecimal("15.0"), quoteData.getOpen());
}
}