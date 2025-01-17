/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import java.math.BigDecimal;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_HoldingDataBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NotInstanceOfHoldingDataBean_YXjn0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        Object object = new Object();
        assertFalse(holdingDataBean.equals(object));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullObject_iXUu1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        assertFalse(holdingDataBean.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentHoldingID_iIsY2() {
        HoldingDataBean holdingDataBean1 = new HoldingDataBean(1, 0, null, null, null);
        HoldingDataBean holdingDataBean2 = new HoldingDataBean(2, 0, null, null, null);
        assertFalse(holdingDataBean1.equals(holdingDataBean2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameHoldingID_kXea3() {
        HoldingDataBean holdingDataBean1 = new HoldingDataBean(1, 0, null, null, null);
        HoldingDataBean holdingDataBean2 = new HoldingDataBean(1, 0, null, null, null);
        assertTrue(holdingDataBean1.equals(holdingDataBean2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteID_QuoteNotNull_qSSC0() {
        QuoteDataBean quote = new QuoteDataBean("symbol");
        HoldingDataBean holding = new HoldingDataBean(10.0, BigDecimal.valueOf(100.0), new Date(), null, quote);
        assertEquals("symbol", holding.getQuoteID());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteID_QuoteNull_dmxg1() {
        HoldingDataBean holding = new HoldingDataBean(10.0, BigDecimal.valueOf(100.0), new Date(), null, null);
        holding.setQuoteID("quoteID");
        assertEquals("quoteID", holding.getQuoteID());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteID_QuoteNullAndQuoteIDNull_vJdD2() {
        HoldingDataBean holding = new HoldingDataBean(10.0, BigDecimal.valueOf(100.0), new Date(), null, null);
        assertNull(holding.getQuoteID());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_withoutHoldingID_HSjK1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(10.0, BigDecimal.valueOf(100.0), new Date(), new AccountDataBean(), new QuoteDataBean("symbol"));
        String expected = "\n\tHolding Data for holding: null\n\t\t      quantity:10.0\n\t\t purchasePrice:100.0\n\t\t  purchaseDate:" + new Date() + "\n\t\t       quoteID:" + "symbol";
        assertEquals(expected, holdingDataBean.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_WhenHoldingIDIsNull_ThenReturn0_ovRW0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        assertEquals(0, holdingDataBean.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_WhenHoldingIDIsNotNull_ThenReturnHoldingIDHashCode_pbvX1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(1, 0.0, null, null, null);
        assertEquals(1, holdingDataBean.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_WhenHoldingIDIsNotNullAndHasValue_ThenReturnHoldingIDHashCode_TnGV2() {
        Integer holdingID = 10;
        HoldingDataBean holdingDataBean = new HoldingDataBean(holdingID, 0.0, null, null, null);
        assertEquals(holdingID.hashCode(), holdingDataBean.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_HoldingID_Fgqb0_1() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getHoldingID());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_HoldingID_Fgqb0_2() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertTrue(holdingDataBean.getHoldingID() instanceof Integer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_Quantity_zALA1() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertTrue(holdingDataBean.getQuantity() > 0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_PurchasePrice_qdDG2_1() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getPurchasePrice());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_PurchasePrice_qdDG2_2() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertTrue(holdingDataBean.getPurchasePrice().compareTo(BigDecimal.ZERO) > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_PurchaseDate_qwkR3_1() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getPurchaseDate());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_PurchaseDate_qwkR3_2() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertTrue(holdingDataBean.getPurchaseDate().before(new Date()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_QuoteID_RAoX4_1() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getQuoteID());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_QuoteID_RAoX4_2() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertTrue(holdingDataBean.getQuoteID().length() > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withHoldingID_aJPp0_WOaf0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(10.0, BigDecimal.valueOf(100.0), new Date(), new AccountDataBean(1, 0, 0, new Date(), new Date(), BigDecimal.ZERO, BigDecimal.ZERO, "profileID"), new QuoteDataBean("symbol"));
    holdingDataBean.setHoldingID(1);
    String expected = "\n\tHolding Data for holding: 1\n\t\t      quantity:10.0\n\t\t purchasePrice:100.0\n\t\t  purchaseDate:" + new Date() + "\n\t\t       quoteID:" + "symbol";
    assertEquals(expected, holdingDataBean.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_HoldingID_Fgqb0() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getHoldingID());
        assertTrue(holdingDataBean.getHoldingID() instanceof Integer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_PurchasePrice_qdDG2() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getPurchasePrice());
        assertTrue(holdingDataBean.getPurchasePrice().compareTo(BigDecimal.ZERO) > 0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_PurchaseDate_qwkR3() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getPurchaseDate());
        assertTrue(holdingDataBean.getPurchaseDate().before(new Date()));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_QuoteID_RAoX4() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getQuoteID());
        assertTrue(holdingDataBean.getQuoteID().length() > 0);
    }
}