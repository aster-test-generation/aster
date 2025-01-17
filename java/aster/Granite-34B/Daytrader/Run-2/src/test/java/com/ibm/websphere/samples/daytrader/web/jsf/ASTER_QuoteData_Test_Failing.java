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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteData_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainHTML_withPositiveGain_KRUm0() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "AAPL");
        String actual = quoteData.getGainHTML();
        String expected = FinancialUtils.printGainHTML(quoteData.getGain());
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainHTML_withNegativeGain_gBgn1() {
        QuoteData quoteData = new QuoteData(new BigDecimal("90.00"), new BigDecimal("100.00"), "AAPL");
        String actual = quoteData.getGainHTML();
        String expected = FinancialUtils.printGainHTML(quoteData.getGain());
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainHTML_withZeroGain_iWOJ2() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "AAPL");
        String actual = quoteData.getGainHTML();
        String expected = FinancialUtils.printGainHTML(quoteData.getGain());
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGainPercent_null_NwbO2() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "TEST");
        quoteData.setGainPercent(null);
        assertEquals(new BigDecimal("0.00"), quoteData.getGainPercent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGainPercent_max_tuxk3() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "TEST");
        quoteData.setGainPercent(new BigDecimal("10000.00"));
        assertEquals(new BigDecimal("100.00"), quoteData.getGainPercent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGainPercent_min_Cefp4() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "TEST");
        quoteData.setGainPercent(new BigDecimal("-10000.00"));
        assertEquals(new BigDecimal("-100.00"), quoteData.getGainPercent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getCompanyName_1_TWur0() {
        QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("101.0"), "AAPL");
        assertEquals("AAPL", qd.getCompanyName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVolume_xBYD0() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "AAPL", new BigDecimal("110.00"), new BigDecimal("80.00"), "Apple Inc.", null, null);
        quoteData.setVolume(100000.0);
        assertEquals(100000.0, quoteData.getVolume());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrice_2_vZHa1() {
        QuoteData quoteData = new QuoteData(new BigDecimal("1.0"), new BigDecimal("2.0"), "symbol", new BigDecimal("3.0"), new BigDecimal("4.0"), "companyName", 5.0, 6.0);
        BigDecimal result = quoteData.getPrice();
        assertEquals(new BigDecimal("1.0"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGain_SDXe0() {
        QuoteData q = new QuoteData(new BigDecimal(100), new BigDecimal(100), "AAPL");
        assertEquals(q.getGain(), new BigDecimal(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGainWithVolume_Dzsc1() {
        QuoteData q = new QuoteData(new BigDecimal(100), new BigDecimal(100), "AAPL", new BigDecimal(100), new BigDecimal(100), "Apple", 1000000.0, 0.0);
        assertEquals(q.getGain(), new BigDecimal(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLow_TEsW0() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "AAPL");
        assertEquals(new BigDecimal("90.00"), quoteData.getLow());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetChange_zjGm0() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("105.00"), "AAPL");
        double change = quoteData.getChange();
        assertEquals(5.0, change, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_whenPriceIsGreaterThanOpen_thenGainPercentIsPositive_ITEm0() {
        QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(50), "AAPL");
        BigDecimal gainPercent = quoteData.getGainPercent();
        assertTrue(gainPercent.compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_whenPriceIsLessThanOpen_thenGainPercentIsNegative_KRgl1() {
        QuoteData quoteData = new QuoteData(new BigDecimal(50), new BigDecimal(100), "AAPL");
        BigDecimal gainPercent = quoteData.getGainPercent();
        assertTrue(gainPercent.compareTo(BigDecimal.ZERO) < 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_whenPriceIsEqualToOpen_thenGainPercentIsZero_bXTp2() {
        QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(100), "AAPL");
        BigDecimal gainPercent = quoteData.getGainPercent();
        assertEquals(BigDecimal.ZERO, gainPercent);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_whenOpenIsZero_thenGainPercentIsPositive_xxAM3() {
        QuoteData quoteData = new QuoteData(new BigDecimal(100), BigDecimal.ZERO, "AAPL");
        BigDecimal gainPercent = quoteData.getGainPercent();
        assertTrue(gainPercent.compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_whenPriceIsZero_thenGainPercentIsPositive_YgqL4() {
        QuoteData quoteData = new QuoteData(BigDecimal.ZERO, new BigDecimal(100), "AAPL");
        BigDecimal gainPercent = quoteData.getGainPercent();
        assertTrue(gainPercent.compareTo(BigDecimal.ZERO) < 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_whenOpenAndPriceAreZero_thenGainPercentIsZero_FEKt5() {
        QuoteData quoteData = new QuoteData(BigDecimal.ZERO, BigDecimal.ZERO, "AAPL");
        BigDecimal gainPercent = quoteData.getGainPercent();
        assertEquals(BigDecimal.ZERO, gainPercent);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercentHTML_0_vUQU0() {
        QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("100.0"), "TEST");
        assertEquals("0.00%", qd.getGainPercentHTML());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercentHTML_1_DAVB1() {
        QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("101.0"), "TEST");
        assertEquals("1.00%", qd.getGainPercentHTML());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercentHTML_2_iIQc2() {
        QuoteData qd = new QuoteData(new BigDecimal("100.0"), new BigDecimal("99.0"), "TEST");
        assertEquals("-1.00%", qd.getGainPercentHTML());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getVolume_eGhw2() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "AAPL", new BigDecimal("110.00"), new BigDecimal("80.00"), "Apple Inc.", null, null);
        double volume = quoteData.getVolume();
        org.junit.jupiter.api.Assertions.assertNull(volume, "Volume should be null");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGainPercent_null_NwbO2_fid1() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "TEST");
        quoteData.setGainPercent(null);
        assertEquals(null, quoteData.getGainPercent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLow_TEsW0_fid1() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "AAPL");
        assertNull(new BigDecimal("90.00"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetChange_zjGm0_fid1() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("10-5.00"), "AAPL");
        double change = quoteData.getChange();
        assertEquals(-5.0, change, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_whenPriceIsEqualToOpen_thenGainPercentIsZero_bXTp2_fid1() {
        QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(100), "AAPL");
        BigDecimal gainPercent = quoteData.getGainPercent();
        assertNull(BigDecimal.ZERO);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_whenOpenAndPriceAreZero_thenGainPercentIsZero_FEKt5_fid1() {
        QuoteData quoteData = new QuoteData(BigDecimal.ZERO, BigDecimal.ZERO, "AAPL");
        BigDecimal gainPercent = quoteData.getGainPercent();
        assertNull(BigDecimal.ZERO);
    }
}