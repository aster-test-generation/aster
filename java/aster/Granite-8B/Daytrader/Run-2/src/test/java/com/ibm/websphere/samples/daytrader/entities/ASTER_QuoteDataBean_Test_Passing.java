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
    public void testGetRandomInstance_VndX0_1() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_VndX0_2() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean.getCompanyName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_VndX0_3() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_VndX0_4() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_VndX0_5() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean.getOpen());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_VndX0_6() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean.getLow());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_VndX0_7() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean.getHigh());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_VndX0_8() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertTrue(quoteDataBean.getChange() >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_VndX0_9() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertTrue(quoteDataBean.getVolume() >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSymbol_mIQa0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setSymbol("TEST_SYMBOL");
        assertEquals("TEST_SYMBOL", quoteDataBean.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompanyName_Axbw2() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("TEST_COMPANY_NAME");
        assertEquals("TEST_COMPANY_NAME", quoteDataBean.getCompanyName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVolume_qWyY3() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setVolume(100.0);
        assertEquals(100.0, quoteDataBean.getVolume(), 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPrice_Bypk4() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setPrice(new BigDecimal("100.0"));
        assertEquals(new BigDecimal("100.0"), quoteDataBean.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpen_RZuT5() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setOpen(new BigDecimal("100.0"));
        assertEquals(new BigDecimal("100.0"), quoteDataBean.getOpen());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLow_seLD6() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setLow(new BigDecimal("100.0"));
        assertEquals(new BigDecimal("100.0"), quoteDataBean.getLow());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHigh_irvQ7() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setHigh(new BigDecimal("100.0"));
        assertEquals(new BigDecimal("100.0"), quoteDataBean.getHigh());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetChange_jSmV8() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setChange(100.0);
        assertEquals(100.0, quoteDataBean.getChange(), 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHigh_dPPE0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        BigDecimal high = new BigDecimal(100.0);
        quoteDataBean.setHigh(high);
        assertEquals(high, quoteDataBean.getHigh());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetCompanyName_YGax0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), 100.0);
        assertEquals("companyName", quoteDataBean.getCompanyName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVolume_FmWF0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setVolume(100.0);
        assertEquals(100.0, quoteDataBean.getVolume(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrice_wBIf0_1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        BigDecimal price = quoteDataBean.getPrice();
        assertNotNull(price);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrice_wBIf0_2() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        BigDecimal price = quoteDataBean.getPrice();
        assertEquals(new BigDecimal(100.0), price);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrint_PAaw0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.print();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintWithSymbol_uHIA1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
        quoteDataBean.print();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintWithAllParameters_iIDN2() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        quoteDataBean.print();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpen_csDO0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        BigDecimal open = new BigDecimal(100.0);
        quoteDataBean.setOpen(open);
        assertEquals(open, quoteDataBean.getOpen());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLow_fYMM0()
    {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        assertEquals(quoteDataBean.getLow(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLow_lBIe1()
    {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 1.0, new BigDecimal(1.0), new BigDecimal(1.0), new BigDecimal(1.0), new BigDecimal(1.0), 1.0);
        assertEquals(quoteDataBean.getLow(), new BigDecimal(1.0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetChange_NNCR0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol1", "companyName1", 100.0, new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), 100.0);
        double change = quoteDataBean.getChange();
        assertEquals(100.0, change, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHigh_RJZR0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        BigDecimal high = quoteDataBean.getHigh();
        assertEquals(null, high);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHigh2_NZXp1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 1.0, new BigDecimal(1.0), new BigDecimal(1.0), new BigDecimal(1.0), new BigDecimal(1.0), 1.0);
        BigDecimal high = quoteDataBean.getHigh();
        assertEquals(new BigDecimal(1.0), high);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNullObject_jvdv0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        boolean result = quoteDataBean.equals(null);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_SXPY1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        boolean result = quoteDataBean.equals(quoteDataBean);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentClassObject_qpro2() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        boolean result = quoteDataBean.equals(new Object());
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameSymbol_LoNc3() {
        QuoteDataBean quoteDataBean1 = new QuoteDataBean("symbol1");
        QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol1");
        boolean result = quoteDataBean1.equals(quoteDataBean2);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentSymbol_rXcA4() {
        QuoteDataBean quoteDataBean1 = new QuoteDataBean("symbol1");
        QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol2");
        boolean result = quoteDataBean1.equals(quoteDataBean2);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetSymbol_GkVW0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), 100.0);
        assertEquals("symbol", quoteDataBean.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLow_TYnI0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        BigDecimal low = new BigDecimal(100.0);
        quoteDataBean.setLow(low);
        assertEquals(low, quoteDataBean.getLow());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLowWithNull_iHmw1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setLow(null);
        assertNull(quoteDataBean.getLow());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLowWithZero_wGxb2() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        BigDecimal low = BigDecimal.ZERO;
        quoteDataBean.setLow(low);
        assertEquals(low, quoteDataBean.getLow());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLowWithNegativeValue_KTuG3() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        BigDecimal low = new BigDecimal(-100.0);
        quoteDataBean.setLow(low);
        assertEquals(low, quoteDataBean.getLow());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompanyName_cSxs0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Test Company");
        assertEquals("Test Company", quoteDataBean.getCompanyName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPrice_aESQ0_lQft0() {
        QuoteDataBean quote = new QuoteDataBean();
        BigDecimal price = new BigDecimal(100.0);
        quote.setPrice(price);
        assertEquals(0, quote.getPrice().compareTo(price), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_VndX0() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean);
        assertNotNull(quoteDataBean.getCompanyName());
        assertNotNull(quoteDataBean.getSymbol());
        assertNotNull(quoteDataBean.getPrice());
        assertNotNull(quoteDataBean.getOpen());
        assertNotNull(quoteDataBean.getLow());
        assertNotNull(quoteDataBean.getHigh());
        assertTrue(quoteDataBean.getChange() >= 0);
        assertTrue(quoteDataBean.getVolume() >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrice_wBIf0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        BigDecimal price = quoteDataBean.getPrice();
        assertNotNull(price);
        assertEquals(new BigDecimal(100.0), price);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpen_Zxgq0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol1", "companyName1", 100.0, new BigDecimal("100.0"), new BigDecimal("10.0"), new BigDecimal("5.0"), new BigDecimal("15.0"), 5.0);
        BigDecimal expectedOpen = new BigDecimal("10.0");
        BigDecimal actualOpen = quoteDataBean.getOpen();
        assertEquals(expectedOpen, actualOpen);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompanyName_mpqu1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName(null);
        assertEquals(null, quoteDataBean.getCompanyName());
        quoteDataBean.setCompanyName("");
        assertEquals("", quoteDataBean.getCompanyName());
        quoteDataBean.setCompanyName("Test Company");
        assertEquals("Test Company", quoteDataBean.getCompanyName());
    }
}