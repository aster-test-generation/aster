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
    public void testGetRandomInstance_QpqP0_1() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_QpqP0_2() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_QpqP0_3() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean.getCompanyName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_QpqP0_4() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertTrue(quoteDataBean.getVolume() >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_QpqP0_5() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_QpqP0_6() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean.getOpen());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_QpqP0_7() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean.getLow());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_QpqP0_8() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertTrue(quoteDataBean.getChange() >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_QpqP0_9() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean.getHigh());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHigh_vEKK0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        BigDecimal high = new BigDecimal(100.0);
        quoteDataBean.setHigh(high);
        assertEquals(high, quoteDataBean.getHigh());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompanyName_rPHX0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), 100.0);
        assertEquals("companyName", quoteDataBean.getCompanyName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetVolume_FIyu0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setVolume(100.0);
        assertEquals(100.0, quoteDataBean.getVolume(), 0.01);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetPrice_qRoR0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), 100.0);
        BigDecimal expectedPrice = new BigDecimal("100.0");
        BigDecimal actualPrice = quoteDataBean.getPrice();
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetOpen_efRf0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        BigDecimal open = new BigDecimal(100);
        quoteDataBean.setOpen(open);
        assertEquals(open, quoteDataBean.getOpen());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpen_CCvr0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol1", "companyName1", 1.0, new BigDecimal(1.0), new BigDecimal(1.0), new BigDecimal(1.0), new BigDecimal(1.0), 1.0);
        BigDecimal open = quoteDataBean.getOpen();
        assertEquals(new BigDecimal(1.0), open);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLow_rtxT0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("10.0"), new BigDecimal("100.0"), 10.0);
        BigDecimal expected = new BigDecimal("10.0");
        BigDecimal actual = quoteDataBean.getLow();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetChange_CSxc0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol1", "companyName1", 1.0, new BigDecimal(1.0), new BigDecimal(1.0), new BigDecimal(1.0), new BigDecimal(1.0), 1.0);
        assertEquals(1.0, quoteDataBean.getChange(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetHigh_ILyg0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setHigh(new BigDecimal(100.0));
        assertEquals(new BigDecimal(100.0), quoteDataBean.getHigh());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPrice_djnl0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        BigDecimal price = new BigDecimal(100.0);
        quoteDataBean.setPrice(price);
        assertEquals(price, quoteDataBean.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull_jUnB0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        assertFalse(quoteDataBean.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_Erlo1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        assertTrue(quoteDataBean.equals(quoteDataBean));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameValues_EBWQ2() {
        QuoteDataBean quoteDataBean1 = new QuoteDataBean("symbol1", "companyName1", 100.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol1", "companyName1", 100.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        assertTrue(quoteDataBean1.equals(quoteDataBean2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentSymbol_ZGfK3() {
        QuoteDataBean quoteDataBean1 = new QuoteDataBean("symbol1", "companyName1", 100.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol2", "companyName1", 100.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        assertFalse(quoteDataBean1.equals(quoteDataBean2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentCompanyName_DfEi4() {
        QuoteDataBean quoteDataBean1 = new QuoteDataBean("symbol1", "companyName1", 100.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol1", "companyName2", 100.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        assertTrue(quoteDataBean1.equals(quoteDataBean2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentVolume_QJVv5() {
        QuoteDataBean quoteDataBean1 = new QuoteDataBean("symbol1", "companyName1", 100.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol1", "companyName1", 200.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        assertTrue(quoteDataBean1.equals(quoteDataBean2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentPrice_sWKZ6() {
        QuoteDataBean quoteDataBean1 = new QuoteDataBean("symbol1", "companyName1", 100.0, new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        QuoteDataBean quoteDataBean2 = new QuoteDataBean("symbol1", "companyName1", 100.0, new BigDecimal(200.0), new BigDecimal(100.0), new BigDecimal(100.0), new BigDecimal(100.0), 100.0);
        assertTrue(quoteDataBean1.equals(quoteDataBean2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSymbol_jhRe0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
        String symbol = quoteDataBean.getSymbol();
        assertEquals("symbol", symbol);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSymbolWithParams_tEiX1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), 100.0);
        String symbol = quoteDataBean.getSymbol();
        assertEquals("symbol", symbol);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_JXdd0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol1", "companyName1", 100.0, new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), 100.0);
        String expected = "\n\tQuote Data for: symbol1\n\t\t companyName: companyName1\n\t\t      volume: 100.0\n\t\t       price: 100.0\n\t\t        open1: 100.0\n\t\t         low: 100.0\n\t\t        high: 100.0\n\t\t      change1: 100.0";
        assertEquals(expected, quoteDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLow_eerF0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        BigDecimal low = new BigDecimal(100.0);
        quoteDataBean.setLow(low);
        assertEquals(low, quoteDataBean.getLow());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompanyName_Jzwc0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setCompanyName("Test Company");
        assertEquals("Test Company", quoteDataBean.getCompanyName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetVolume_amyn0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setVolume(100.0);
        assertEquals(100.0, quoteDataBean.getVolume(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetChange_IhXC0_Htde0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setChange(100.0);
        assertEquals(100.0, quoteDataBean.getChange(), 0.0);
    }
}