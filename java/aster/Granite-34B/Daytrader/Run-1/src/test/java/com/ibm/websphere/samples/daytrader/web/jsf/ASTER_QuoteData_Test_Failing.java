/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteData_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainHTML_withPositiveGain_Oehn0() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("90.00"), "AAPL");
        String actual = quoteData.getGainHTML();
        String expected = FinancialUtils.printGainHTML(quoteData.getGain());
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainHTML_withNegativeGain_EHhD1() {
        QuoteData quoteData = new QuoteData(new BigDecimal("90.00"), new BigDecimal("100.00"), "AAPL");
        String actual = quoteData.getGainHTML();
        String expected = FinancialUtils.printGainHTML(quoteData.getGain());
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainHTML_withZeroGain_bQJO2() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "AAPL");
        String actual = quoteData.getGainHTML();
        String expected = FinancialUtils.printGainHTML(quoteData.getGain());
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCompanyNameTest1_qNnK0() {
        QuoteData q = new QuoteData(new BigDecimal("1.0"), new BigDecimal("2.0"), "sym");
        assertEquals("sym", q.getCompanyName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRange_QgcG0_1() {
        QuoteData q = new QuoteData(new BigDecimal("10.0"), new BigDecimal("11.0"), "AAPL");
        String range = q.getRange();
        assertNotNull(range);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRange_QgcG0_2() {
        QuoteData q = new QuoteData(new BigDecimal("10.0"), new BigDecimal("11.0"), "AAPL");
        String range = q.getRange();
        assertTrue(range.matches("^\\d+\\.\\d+-\\d+\\.\\d+$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrice2_bYgw1() {
        QuoteData q = new QuoteData(new BigDecimal("101.0"), new BigDecimal("100.0"), "AAPL", new BigDecimal("102.0"), new BigDecimal("99.0"), "Apple", 1000000.0, 1.0);
        assertEquals(new BigDecimal("101.0"), q.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGain_uqQY0() {
        QuoteData q = new QuoteData(new BigDecimal(100), new BigDecimal(100), "AAPL");
        assertEquals(q.getGain(), new BigDecimal(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGainWithVolume_LmRy1() {
        QuoteData q = new QuoteData(new BigDecimal(100), new BigDecimal(100), "AAPL", new BigDecimal(100), new BigDecimal(100), "Apple", 1000000.0, 0.0);
        assertEquals(q.getGain(), new BigDecimal(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpen4_HWyi3() {
        QuoteData qd = new QuoteData(new BigDecimal("100.00"), new BigDecimal("101.00"), "TEST");
        assertEquals(new BigDecimal("100.00"), qd.getOpen());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLow_KmEI0() {
        QuoteData q = new QuoteData(new BigDecimal("1.0"), new BigDecimal("2.0"), "sym");
        assertEquals(new BigDecimal("2.0"), q.getLow());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetChange_rMmg0() {
        QuoteData quoteData = new QuoteData(new BigDecimal("100.00"), new BigDecimal("105.00"), "ABC");
        double change = quoteData.getChange();
        assertEquals(5.0, change, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHigh_wecS0() {
        QuoteData q = new QuoteData(new BigDecimal("10.0"), new BigDecimal("10.0"), "TEST");
        assertEquals(new BigDecimal("10.0"), q.getHigh());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_uAVL0() {
        QuoteData qd = new QuoteData(new BigDecimal("100.00"), new BigDecimal("100.00"), "TEST");
        assertEquals(new BigDecimal("0.00"), qd.getGainPercent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_100_aeDd1() {
        QuoteData qd = new QuoteData(new BigDecimal("100.00"), new BigDecimal("0.00"), "TEST");
        assertEquals(new BigDecimal("100.00"), qd.getGainPercent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_50_HOhi2() {
        QuoteData qd = new QuoteData(new BigDecimal("100.00"), new BigDecimal("50.00"), "TEST");
        assertEquals(new BigDecimal("50.00"), qd.getGainPercent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_null_DmYF3() {
        QuoteData qd = new QuoteData(new BigDecimal("100.00"), null, "TEST");
        assertEquals(null, qd.getGainPercent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercentHTML_whenGainIsPositive_Yehh0() {
        QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(50), "AAPL");
        String actual = quoteData.getGainPercentHTML();
        String expected = FinancialUtils.printGainPercentHTML(new BigDecimal("200.00"));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercentHTML_whenGainIsNegative_XUPW1() {
        QuoteData quoteData = new QuoteData(new BigDecimal(50), new BigDecimal(100), "AAPL");
        String actual = quoteData.getGainPercentHTML();
        String expected = FinancialUtils.printGainPercentHTML(new BigDecimal("-200.00"));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercentHTML_whenGainIsZero_UhwS2() {
        QuoteData quoteData = new QuoteData(new BigDecimal(100), new BigDecimal(100), "AAPL");
        String actual = quoteData.getGainPercentHTML();
        String expected = FinancialUtils.printGainPercentHTML(new BigDecimal("0.00"));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLow_KmEI0_fid1() {
        QuoteData q = new QuoteData(new BigDecimal("1.0"), new BigDecimal("2.0"), "sym");
        assertNull(new BigDecimal("2.0"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHigh_wecS0_fid1() {
        QuoteData q = new QuoteData(new BigDecimal("10.0"), new BigDecimal("10.0"), "TEST");
        assertNull(new BigDecimal("10.0"));
    }
}