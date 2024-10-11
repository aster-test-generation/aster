/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HoldingDataBean_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuantity_KPns0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(1.0, new BigDecimal(1.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        assertEquals(1.0, holdingDataBean.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getQuoteID_3_ptVZ3() {
        HoldingDataBean holdingData = new HoldingDataBean();
        assertEquals(null, holdingData.getQuoteID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice_Mnvp0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(0);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice2_zoEh1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(100);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice3_dthU2() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(1000);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice4_feYL3() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(10000);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice5_varf4() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(100000);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice6_jGzQ5() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(1000000);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice7_BSrR6() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(10000000);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice8_zAYA7() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(100000000);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice9_URwr8() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(1000000000);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNullObject_WXbF0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        boolean actual = holdingDataBean.equals(null);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithObjectOfDifferentType_gGDE1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        boolean actual = holdingDataBean.equals(new Object());
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithObjectWithDifferentHoldingID_hzxz2() {
        HoldingDataBean holdingDataBean1 = new HoldingDataBean();
        HoldingDataBean holdingDataBean2 = new HoldingDataBean();
        boolean actual = holdingDataBean1.equals(holdingDataBean2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithObjectWithSameHoldingID_MuOk3() {
        HoldingDataBean holdingDataBean1 = new HoldingDataBean();
        HoldingDataBean holdingDataBean2 = new HoldingDataBean();
        holdingDataBean1.setHoldingID(1);
        holdingDataBean2.setHoldingID(1);
        boolean actual = holdingDataBean1.equals(holdingDataBean2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithObjectWithNullHoldingID_BYrj4() {
        HoldingDataBean holdingDataBean1 = new HoldingDataBean();
        HoldingDataBean holdingDataBean2 = new HoldingDataBean();
        holdingDataBean1.setHoldingID(1);
        boolean actual = holdingDataBean1.equals(holdingDataBean2);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchaseDateNull_wfmw1() {
        HoldingDataBean holdingData = new HoldingDataBean();
        Date purchaseDate = holdingData.getPurchaseDate();
        assertNull(purchaseDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_Qlfq0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(100.0, new BigDecimal(100.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        String expected = "\n\tHolding Data for holding: " + holdingDataBean.getHoldingID() + "\n\t\t      quantity:" + holdingDataBean.getQuantity() + "\n\t\t purchasePrice:" + holdingDataBean.getPurchasePrice() + "\n\t\t  purchaseDate:" + holdingDataBean.getPurchaseDate() + "\n\t\t       quoteID:" + holdingDataBean.getQuoteID();
        assertEquals(expected, holdingDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoHoldingID_QoeS1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(100.0, new BigDecimal(100.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        String expected = "\n\tHolding Data for holding: null\n\t\t      quantity:" + holdingDataBean.getQuantity() + "\n\t\t purchasePrice:" + holdingDataBean.getPurchasePrice() + "\n\t\t  purchaseDate:" + holdingDataBean.getPurchaseDate() + "\n\t\t       quoteID:" + holdingDataBean.getQuoteID();
        assertEquals(expected, holdingDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoQuoteID_WfGh5() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(100.0, new BigDecimal(100.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        String expected = "\n\tHolding Data for holding: " + holdingDataBean.getHoldingID() + "\n\t\t      quantity:" + holdingDataBean.getQuantity() + "\n\t\t purchasePrice:" + holdingDataBean.getPurchasePrice() + "\n\t\t  purchaseDate:" + holdingDataBean.getPurchaseDate() + "\n\t\t       quoteID:null";
        assertEquals(expected, holdingDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccount_IZdA0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        AccountDataBean accountDataBean = new AccountDataBean();
        holdingDataBean.setAccount(accountDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_YcSN0_1() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_YcSN0_2() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getHoldingID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_YcSN0_3() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getQuantity());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_YcSN0_4() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_YcSN0_5() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_YcSN0_6() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getQuoteID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithAllParameters_bLYv1_1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(
                                TradeConfig.rndQuantity(),
                                TradeConfig.rndBigDecimal(1000.0f),
                                new java.util.Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                new AccountDataBean(
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndSymbol()
                                ),
                                new QuoteDataBean(
                                                        TradeConfig.rndSymbol()
                                )
        );
        assertNotNull(holdingDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithAllParameters_bLYv1_3() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(
                                TradeConfig.rndQuantity(),
                                TradeConfig.rndBigDecimal(1000.0f),
                                new java.util.Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                new AccountDataBean(
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndSymbol()
                                ),
                                new QuoteDataBean(
                                                        TradeConfig.rndSymbol()
                                )
        );
        assertNotNull(holdingDataBean.getQuantity());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithAllParameters_bLYv1_4() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(
                                TradeConfig.rndQuantity(),
                                TradeConfig.rndBigDecimal(1000.0f),
                                new java.util.Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                new AccountDataBean(
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndSymbol()
                                ),
                                new QuoteDataBean(
                                                        TradeConfig.rndSymbol()
                                )
        );
        assertNotNull(holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithAllParameters_bLYv1_5() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(
                                TradeConfig.rndQuantity(),
                                TradeConfig.rndBigDecimal(1000.0f),
                                new java.util.Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                new AccountDataBean(
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndSymbol()
                                ),
                                new QuoteDataBean(
                                                        TradeConfig.rndSymbol()
                                )
        );
        assertNotNull(holdingDataBean.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithAllParameters_bLYv1_6() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(
                                TradeConfig.rndQuantity(),
                                TradeConfig.rndBigDecimal(1000.0f),
                                new java.util.Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                new AccountDataBean(
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndSymbol()
                                ),
                                new QuoteDataBean(
                                                        TradeConfig.rndSymbol()
                                )
        );
        assertNotNull(holdingDataBean.getQuoteID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithAllParameters_bLYv1_7() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(
                                TradeConfig.rndQuantity(),
                                TradeConfig.rndBigDecimal(1000.0f),
                                new java.util.Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                new AccountDataBean(
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndSymbol()
                                ),
                                new QuoteDataBean(
                                                        TradeConfig.rndSymbol()
                                )
        );
        assertNotNull(holdingDataBean.getQuote());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithAllParameters_bLYv1_8() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(
                                TradeConfig.rndQuantity(),
                                TradeConfig.rndBigDecimal(1000.0f),
                                new java.util.Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                new AccountDataBean(
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        TradeConfig.rndInt(100000),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        new Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndBigDecimal(1000.0f),
                                                        TradeConfig.rndSymbol()
                                ),
                                new QuoteDataBean(
                                                        TradeConfig.rndSymbol()
                                )
        );
        assertNotNull(holdingDataBean.getAccount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchaseDate_BPhz0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(1.0, new BigDecimal(1.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        Date purchaseDate = new Date();
        holdingDataBean.setPurchaseDate(purchaseDate);
        assertEquals(purchaseDate, holdingDataBean.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchaseDateNull_LxkC1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(1.0, new BigDecimal(1.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        Date purchaseDate = null;
        holdingDataBean.setPurchaseDate(purchaseDate);
        assertEquals(purchaseDate, holdingDataBean.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchaseDateMaxDate_cvfo2() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(1.0, new BigDecimal(1.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        Date purchaseDate = new Date(Long.MAX_VALUE);
        holdingDataBean.setPurchaseDate(purchaseDate);
        assertEquals(purchaseDate, holdingDataBean.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchaseDateMinDate_mZss3() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(1.0, new BigDecimal(1.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        Date purchaseDate = new Date(Long.MIN_VALUE);
        holdingDataBean.setPurchaseDate(purchaseDate);
        assertEquals(purchaseDate, holdingDataBean.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_PEJU0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(1, 1.0, new BigDecimal(1.0), new Date(), "testString");
        int expected = 0;
        expected += (holdingDataBean.getHoldingID() != null ? holdingDataBean.getHoldingID().hashCode() : 0);
        int actual = holdingDataBean.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode2_jkOa1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(1, 1.0, new BigDecimal(1.0), new Date(), "testString");
        int expected = 0;
        expected += (holdingDataBean.getHoldingID() != null ? holdingDataBean.getHoldingID().hashCode() : 0);
        int actual = holdingDataBean.hashCode();
        assertNotEquals(expected + 1, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuoteID_gTkt0() {
        HoldingDataBean holdingData = new HoldingDataBean();
        holdingData.setQuoteID("testString");
        assertEquals("testString", holdingData.getQuoteID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuoteIDNull_iHaD1() {
        HoldingDataBean holdingData = new HoldingDataBean();
        holdingData.setQuoteID(null);
        assertEquals(null, holdingData.getQuoteID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuoteIDEmpty_VMtY2() {
        HoldingDataBean holdingData = new HoldingDataBean();
        holdingData.setQuoteID("");
        assertEquals("", holdingData.getQuoteID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuoteIDMax_YUJV3() {
        HoldingDataBean holdingData = new HoldingDataBean();
        String maxString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla convallis egestas rhoncus. Donec exposing a WithEvents. Proin ac eros adipiscing.phasellus. Curabitur justo. Vivamus pharetra posuereblandit. Praesent imperdietmi nec ante. Donec ullamcorper, felis non sodales...";
        holdingData.setQuoteID(maxString);
        assertEquals(maxString, holdingData.getQuoteID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuoteIDMin_vgIt4() {
        HoldingDataBean holdingData = new HoldingDataBean();
        String minString = "a";
        holdingData.setQuoteID(minString);
        assertEquals(minString, holdingData.getQuoteID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuote_DLua0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean("TEST");
        holdingDataBean.setQuote(quoteDataBean);
        assertEquals(quoteDataBean, holdingDataBean.getQuote());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuoteWithNull_WRdM1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        QuoteDataBean quoteDataBean = null;
        holdingDataBean.setQuote(quoteDataBean);
        assertEquals(quoteDataBean, holdingDataBean.getQuote());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHoldingID2_AKGd1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(new Integer(1), 1.0, new BigDecimal(1.0), new Date(), "a");
        Integer actual = holdingDataBean.getHoldingID();
        Integer expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantity_ftZm0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        holdingDataBean.setQuantity(100.0);
        assertEquals(100.0, holdingDataBean.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantityWithNegativeValue_VVNi1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        holdingDataBean.setQuantity(-100.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantityWithZeroValue_KykV2() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        holdingDataBean.setQuantity(0.0);
        assertEquals(0.0, holdingDataBean.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantityWithMaxDoubleValue_xQkR4() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        holdingDataBean.setQuantity(Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, holdingDataBean.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantityWithMinDoubleValue_ozkB5() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        holdingDataBean.setQuantity(Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, holdingDataBean.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantityWithNaNValue_aaPe6() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        holdingDataBean.setQuantity(Double.NaN);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantityWithNegativeInfinityValue_zUAv8() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        holdingDataBean.setQuantity(Double.NEGATIVE_INFINITY);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingID_JsFp0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        Integer holdingID = new Integer(1);
        holdingDataBean.setHoldingID(holdingID);
        assertEquals(holdingID, holdingDataBean.getHoldingID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingIDWithNull_lBhm1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        Integer holdingID = null;
        holdingDataBean.setHoldingID(holdingID);
        assertEquals(holdingID, holdingDataBean.getHoldingID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingIDWithNegativeValue_RcXq2() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        Integer holdingID = new Integer(-1);
        holdingDataBean.setHoldingID(holdingID);
        assertEquals(holdingID, holdingDataBean.getHoldingID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingIDWithZeroValue_oaoj3() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        Integer holdingID = new Integer(0);
        holdingDataBean.setHoldingID(holdingID);
        assertEquals(holdingID, holdingDataBean.getHoldingID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingIDWithMaxPositiveValue_uZUp5() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        Integer holdingID = new Integer(Integer.MAX_VALUE);
        holdingDataBean.setHoldingID(holdingID);
        assertEquals(holdingID, holdingDataBean.getHoldingID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingIDWithMinPositiveValue_oJTT6() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        Integer holdingID = new Integer(Integer.MIN_VALUE);
        holdingDataBean.setHoldingID(holdingID);
        assertEquals(holdingID, holdingDataBean.getHoldingID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingIDWithRandomValue_jSfO7() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        Integer holdingID = new Integer((int) (Math.random() * Integer.MAX_VALUE));
        holdingDataBean.setHoldingID(holdingID);
        assertEquals(holdingID, holdingDataBean.getHoldingID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPurchasePriceNull_dWSz1() {
        HoldingDataBean holdingData = new HoldingDataBean();
        assertNull(holdingData.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTML4_Bfuk3() {
        HoldingDataBean holdingData = new HoldingDataBean(1.0, new BigDecimal(100.0), new Date(), new AccountDataBean(), new QuoteDataBean("symbol"));
        assertEquals("<BR>Holding Data for holding: " + holdingData.getHoldingID() + "</B>" + "<LI>      quantity:" + holdingData.getQuantity() + "</LI>" + "<LI> purchasePrice:" + holdingData.getPurchasePrice() + "</LI>" + "<LI>  purchaseDate:" + holdingData.getPurchaseDate() + "</LI>" + "<LI>       quoteID:" + holdingData.getQuoteID() + "</LI>", holdingData.toHTML());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccount_tbnZ0() {
        HoldingDataBean holdingData = new HoldingDataBean(1.0, new BigDecimal(1.0), new Date(1), new AccountDataBean(), new QuoteDataBean());
        assertEquals(holdingData.getAccount(), new AccountDataBean());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice10_XYir9_isJg0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(10000000000L);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice11_YeAW10_bgWf0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(100000000000L);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice12_RTIB11_yqHS0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(1000000000000L);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchasePrice13_FagZ12_ktrj0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal purchasePrice = new BigDecimal(10000000000000L);
        holdingDataBean.setPurchasePrice(purchasePrice);
        assertEquals(purchasePrice, holdingDataBean.getPurchasePrice());
    }
}