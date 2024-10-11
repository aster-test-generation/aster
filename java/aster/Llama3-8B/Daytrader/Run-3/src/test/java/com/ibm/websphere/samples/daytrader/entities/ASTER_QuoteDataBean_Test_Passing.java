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
    public void testSetHigh_QYBr0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
        BigDecimal high = BigDecimal.valueOf(100.0);
        quoteDataBean.setHigh(high);
        assertEquals(high, quoteDataBean.getHigh());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_tfLe0_1() {
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        assertNotNull(quoteDataBean);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompanyName_orhS0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, new BigDecimal("100.0"), new BigDecimal("90.0"), new BigDecimal("80.0"), new BigDecimal("110.0"), 10.0);
        assertEquals("Apple Inc.", quoteDataBean.getCompanyName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSymbol_Obey0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
        quoteDataBean.setSymbol("GOOG");
        assertEquals("GOOG", quoteDataBean.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSymbolNull_ttka1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setSymbol(null);
        assertEquals(null, quoteDataBean.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSymbolEmpty_ygoX2() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setSymbol("");
        assertEquals("", quoteDataBean.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSymbolSame_hgty3() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
        quoteDataBean.setSymbol("AAPL");
        assertEquals("AAPL", quoteDataBean.getSymbol());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeNullSymbol_lXuU0() {
    QuoteDataBean bean = new QuoteDataBean();
    int result = bean.hashCode();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeNonNullSymbol_sGKW3() {
    QuoteDataBean bean = new QuoteDataBean("ABC");
    int result = bean.hashCode();
    assertNotEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVolume_egTa1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
        quoteDataBean.setVolume(100.0);
        assertEquals(100.0, quoteDataBean.getVolume(), 0.0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrice_snKq0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, new BigDecimal("100.00"), new BigDecimal("100.00"), new BigDecimal("90.00"), new BigDecimal("110.00"), 10.0);
        assertEquals(new BigDecimal("100.00"), quoteDataBean.getPrice());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetChange_TCgH0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, new BigDecimal("100.00"), new BigDecimal("100.00"), new BigDecimal("90.00"), new BigDecimal("110.00"), 5.0);
        quoteDataBean.setChange(10.0);
        assertEquals(10.0, quoteDataBean.getChange(), 0.0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpen_OvIN0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
        BigDecimal open = BigDecimal.valueOf(100.0);
        quoteDataBean.setOpen(open);
        assertEquals(open, quoteDataBean.getOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenNull_Pytx1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
        quoteDataBean.setOpen(null);
        assertEquals(null, quoteDataBean.getOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenZero_qPzE2() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
        BigDecimal open = BigDecimal.valueOf(0.0);
        quoteDataBean.setOpen(open);
        assertEquals(open, quoteDataBean.getOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenNegative_UHJR3() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
        BigDecimal open = BigDecimal.valueOf(-100.0);
        quoteDataBean.setOpen(open);
        assertEquals(open, quoteDataBean.getOpen());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpen_ejuM0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("9.0"), new BigDecimal("11.0"), 0.0);
        assertEquals(new BigDecimal("10.0"), quoteDataBean.getOpen());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHigh_xuLC0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("50.0"), new BigDecimal("150.0"), 10.0);
        assertEquals(new BigDecimal("150.0"), quoteDataBean.getHigh());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetChange_LzWK0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(15.0), 5.0);
        assertEquals(5.0, quoteDataBean.getChange(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetChangeDefault_YUbx1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        assertEquals(0.0, quoteDataBean.getChange(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetChangeWithSymbol_Mwok2() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
        assertEquals(0.0, quoteDataBean.getChange(), 0.0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPrice_fhDp0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 10000, BigDecimal.valueOf(100.0), BigDecimal.valueOf(90.0), BigDecimal.valueOf(80.0), BigDecimal.valueOf(110.0), 10.0);
        BigDecimal expectedPrice = BigDecimal.valueOf(150.0);
        quoteDataBean.setPrice(expectedPrice);
        assertEquals(expectedPrice, quoteDataBean.getPrice());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_ulhA0() {
    QuoteDataBean bean = new QuoteDataBean("AAPL");
    boolean result = bean.equals(bean);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_oUHS1() {
    QuoteDataBean bean = new QuoteDataBean("AAPL");
    boolean result = bean.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_NMHF2() {
    QuoteDataBean bean = new QuoteDataBean("AAPL");
    boolean result = bean.equals("String");
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentSymbol_IKwk3() {
    QuoteDataBean bean1 = new QuoteDataBean("AAPL");
    QuoteDataBean bean2 = new QuoteDataBean("GOOG");
    boolean result = bean1.equals(bean2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameSymbol_hofP4() {
    QuoteDataBean bean1 = new QuoteDataBean("AAPL");
    QuoteDataBean bean2 = new QuoteDataBean("AAPL");
    boolean result = bean1.equals(bean2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_QNbH0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
        assertEquals("AAPL", quoteDataBean.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithDefaultConstructor_ruTJ1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        assertEquals(null, quoteDataBean.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithThreeParameterConstructor_rYTl2() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 100.0, BigDecimal.valueOf(100.0), BigDecimal.valueOf(90.0), BigDecimal.valueOf(110.0), BigDecimal.valueOf(90.0), 10.0);
        assertEquals("AAPL", quoteDataBean.getSymbol());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLow_QQjx0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
        BigDecimal low = BigDecimal.valueOf(100.00);
        quoteDataBean.setLow(low);
        assertEquals(low, quoteDataBean.getLow());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompanyName_bjhn0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    quoteDataBean.setCompanyName("Apple Inc.");
    assertEquals("Apple Inc.", quoteDataBean.getCompanyName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetVolume_Xhyx0() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, new BigDecimal("100.00"), new BigDecimal("100.00"), new BigDecimal("90.00"), new BigDecimal("110.00"), 10.0);
    double volume = quoteDataBean.getVolume();
    assertEquals(1000000, volume);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTML_dFuJ0_fid1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, BigDecimal.valueOf(150.0), BigDecimal.valueOf(140.0), BigDecimal.valueOf(120.0), BigDecimal.valueOf(160.0), 10.0);
        String result = quoteDataBean.toHTML();
        assertEquals("<BR>Quote Data for: AAPL<LI> companyName: Apple Inc.</LI><LI>      volume: 1000000.0</LI><LI>       price: 150.0</LI><LI>        open1: 140.0</LI><LI>         low: 120.0</LI><LI>        high: 160.0</LI><LI>      change1: 10.0</LI>", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLEmpty_fLdC1_fid1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        String result = quoteDataBean.toHTML();
        assertEquals("<BR>Quote Data for: null<LI> companyName: null</LI><LI>      volume: 0.0</LI><LI>       price: null</LI><LI>        open1: null</LI><LI>         low: null</LI><LI>        high: null</LI><LI>      change1: 0.0</LI>", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithSymbol_sTqv2_fid1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("GOOG");
        String result = quoteDataBean.toHTML();
        assertEquals("<BR>Quote Data for: GOOG<LI> companyName: null</LI><LI>      volume: 0.0</LI><LI>       price: null</LI><LI>        open1: null</LI><LI>         low: null</LI><LI>        high: null</LI><LI>      change1: 0.0</LI>", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPrintWithoutParameters_LWAH1_JNOs0_fid1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPrintWithSymbol_czgX2_WZie0_fid1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("GOOG");
}
}