/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.math.BigDecimal;
import java.util.Calendar;
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
    public void testgetQuantity_KMZV0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        double quantity = holdingDataBean.getQuantity();
        assertEquals(0.0, quantity, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetQuoteID1_kQHr0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        String symbol = "symbol";
        quoteDataBean.setSymbol(symbol);
        holdingDataBean.setQuote(quoteDataBean);
        String result = holdingDataBean.getQuoteID();
        assertEquals(symbol, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPurchaseDate_WIoj0() {
        HoldingDataBean holding = new HoldingDataBean();
        Date purchaseDate = holding.getPurchaseDate();
        assertNull(purchaseDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccount_Nmjo0_1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        AccountDataBean accountDataBean = new AccountDataBean();
        holdingDataBean.setAccount(accountDataBean);
        assertNotNull(holdingDataBean.getAccount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccount_Nmjo0_2() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        AccountDataBean accountDataBean = new AccountDataBean();
        holdingDataBean.setAccount(accountDataBean);
        assertEquals(accountDataBean, holdingDataBean.getAccount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRandomInstanceTest_cvSp0_1() {
        HoldingDataBean holding = HoldingDataBean.getRandomInstance();
        assertNotNull(holding);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRandomInstanceTest_cvSp0_2() {
        HoldingDataBean holding = HoldingDataBean.getRandomInstance();
        assertTrue(holding.getQuantity() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRandomInstanceTest_cvSp0_3() {
        HoldingDataBean holding = HoldingDataBean.getRandomInstance();
        assertTrue(holding.getPurchasePrice().compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRandomInstanceTest_cvSp0_4() {
        HoldingDataBean holding = HoldingDataBean.getRandomInstance();
        assertTrue(holding.getPurchaseDate().getTime() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRandomInstanceTest_cvSp0_5() {
        HoldingDataBean holding = HoldingDataBean.getRandomInstance();
        assertTrue(holding.getQuoteID().length() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_QOtD0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        int result = holdingDataBean.hashCode();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode1_wuWr1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean(1, 1.0, BigDecimal.valueOf(1.0), new Date(), "1");
        int result = holdingDataBean.hashCode();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchaseDate_EQTJ0() {
        HoldingDataBean holding = new HoldingDataBean();
        Date purchaseDate = new Date();
        holding.setPurchaseDate(purchaseDate);
        assertEquals(purchaseDate, holding.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchaseDateNull_BfbP1() {
        HoldingDataBean holding = new HoldingDataBean();
        holding.setPurchaseDate(null);
        assertNull(holding.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetQuoteID_bNaP0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        String quoteID = "123";
        holdingDataBean.setQuoteID(quoteID);
        assertEquals("123", holdingDataBean.getQuoteID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testPrint_ivem0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        AccountDataBean accountDataBean = new AccountDataBean();
        HoldingDataBean holdingDataBean = new HoldingDataBean(1.0, BigDecimal.ONE, new Date(), accountDataBean, quoteDataBean);
        holdingDataBean.print();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuote_IguR0_1() {
        HoldingDataBean holding = new HoldingDataBean();
        QuoteDataBean quote = new QuoteDataBean();
        holding.setQuote(quote);
        assertNotNull(holding.getQuote());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuote_IguR0_2() {
        HoldingDataBean holding = new HoldingDataBean();
        QuoteDataBean quote = new QuoteDataBean();
        holding.setQuote(quote);
        assertEquals(quote, holding.getQuote());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetHoldingID_KNFk0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        Integer holdingID = holdingDataBean.getHoldingID();
        assertEquals(null, holdingID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantity_dvrQ0() {
        AccountDataBean account = new AccountDataBean();
        QuoteDataBean quote = new QuoteDataBean();
        HoldingDataBean holding = new HoldingDataBean(1.0, new BigDecimal(1.0), new Date(), account, quote);
        holding.setQuantity(1.0);
        assertEquals(1.0, holding.getQuantity(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetHoldingID_zJgM0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        Integer holdingID = 1;
        holdingDataBean.setHoldingID(holdingID);
        assertEquals(holdingID, holdingDataBean.getHoldingID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPurchaseDate_EQTJ0_QIJb0() {
        HoldingDataBean holding = new HoldingDataBean();
        Calendar calendar = Calendar.getInstance();
        Date purchaseDate = calendar.getTime();
        holding.setPurchaseDate(purchaseDate);
        assertEquals(purchaseDate, holding.getPurchaseDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantity_dvrQ0_EMpr0() {
        AccountDataBean account = new AccountDataBean();
        QuoteDataBean quote = new QuoteDataBean();
        HoldingDataBean holding = new HoldingDataBean();
        holding.setQuantity(1.0);
        holding.setPurchasePrice(new BigDecimal(1.0));
        holding.setPurchaseDate(new Date());
        holding.setAccount(account);
        holding.setQuote(quote);
        assertEquals(1.0, holding.getQuantity(), 0);
    }
}