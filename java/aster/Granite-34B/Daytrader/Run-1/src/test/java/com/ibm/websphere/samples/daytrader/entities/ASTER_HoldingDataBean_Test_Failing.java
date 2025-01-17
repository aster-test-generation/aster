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

public class Aster_HoldingDataBean_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoQuantity_aVxA2() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(100.0, new BigDecimal(100.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        String expected = "\n\tHolding Data for holding: " + holdingDataBean.getHoldingID() + "\n\t\t      quantity:null\n\t\t purchasePrice:" + holdingDataBean.getPurchasePrice() + "\n\t\t  purchaseDate:" + holdingDataBean.getPurchaseDate() + "\n\t\t       quoteID:" + holdingDataBean.getQuoteID();
        assertEquals(expected, holdingDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoPurchasePrice_JzFt3() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(100.0, new BigDecimal(100.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        String expected = "\n\tHolding Data for holding: " + holdingDataBean.getHoldingID() + "\n\t\t      quantity:" + holdingDataBean.getQuantity() + "\n\t\t purchasePrice:null\n\t\t  purchaseDate:" + holdingDataBean.getPurchaseDate() + "\n\t\t       quoteID:" + holdingDataBean.getQuoteID();
        assertEquals(expected, holdingDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoPurchaseDate_NkIw4() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(100.0, new BigDecimal(100.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        String expected = "\n\tHolding Data for holding: " + holdingDataBean.getHoldingID() + "\n\t\t      quantity:" + holdingDataBean.getQuantity() + "\n\t\t purchasePrice:" + holdingDataBean.getPurchasePrice() + "\n\t\t  purchaseDate:null\n\t\t       quoteID:" + holdingDataBean.getQuoteID();
        assertEquals(expected, holdingDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_YcSN0_7() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getQuote());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_YcSN0_8() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean.getAccount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithAllParameters_bLYv1_2() {
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
        assertNotNull(holdingDataBean.getHoldingID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchaseDateInvalidDate_NFrA4() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(1.0, new BigDecimal(1.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        Date purchaseDate = new Date("Invalid Date");
        holdingDataBean.setPurchaseDate(purchaseDate);
        assertNotEquals(purchaseDate, holdingDataBean.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHoldingID_gNEt0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(1.0, new BigDecimal(1.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        Integer actual = holdingDataBean.getHoldingID();
        Integer expected = 0;
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_YcSN0() {
        HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
        assertNotNull(holdingDataBean);
        assertNotNull(holdingDataBean.getHoldingID());
        assertNotNull(holdingDataBean.getQuantity());
        assertNotNull(holdingDataBean.getPurchasePrice());
        assertNotNull(holdingDataBean.getPurchaseDate());
        assertNotNull(holdingDataBean.getQuoteID());
        assertNotNull(holdingDataBean.getQuote());
        assertNotNull(holdingDataBean.getAccount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithAllParameters_bLYv1() {
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
        assertNotNull(holdingDataBean.getHoldingID());
        assertNotNull(holdingDataBean.getQuantity());
        assertNotNull(holdingDataBean.getPurchasePrice());
        assertNotNull(holdingDataBean.getPurchaseDate());
        assertNotNull(holdingDataBean.getQuoteID());
        assertNotNull(holdingDataBean.getQuote());
        assertNotNull(holdingDataBean.getAccount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHoldingID_gNEt0_fid1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(1.0, new BigDecimal(1.0), new Date(), new AccountDataBean(), new QuoteDataBean());
        Integer actual = holdingDataBean.getHoldingID();
        Integer expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantityWithNegativeValue_VVNi1_fid1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        holdingDataBean.setQuantity(-100.0);
        assertEquals(0.0, holdingDataBean.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantityWithNaNValue_aaPe6_fid1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        holdingDataBean.setQuantity(Double.NaN);
        assertEquals(0.0, holdingDataBean.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantityWithPositiveInfinityValue_IDeY7() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        holdingDataBean.setQuantity(Double.POSITIVE_INFINITY);
        assertEquals(Double.MAX_VALUE, holdingDataBean.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantityWithNegativeInfinityValue_zUAv8_fid1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        holdingDataBean.setQuantity(Double.NEGATIVE_INFINITY);
        assertEquals(0.0, holdingDataBean.getQuantity(), 0.0);
    }
}