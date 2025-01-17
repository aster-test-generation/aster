/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

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
    public void testgetQuote_JJwH0() {
        HoldingDataBean holding = new HoldingDataBean();
        QuoteDataBean quote = holding.getQuote();
        assertNotNull(quote);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPurchasePrice_QSuT0() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal expectedPurchasePrice = BigDecimal.valueOf(100.0);
        BigDecimal actualPurchasePrice = holdingDataBean.getPurchasePrice();
        assertNull(expectedPurchasePrice);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccount_etFh0() {
        HoldingDataBean holding = new HoldingDataBean();
        AccountDataBean account = holding.getAccount();
        assertNotNull(account);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToHTML_aEVv0() {
        AccountDataBean account = new AccountDataBean();
        QuoteDataBean quote = new QuoteDataBean();
        HoldingDataBean holding = new HoldingDataBean(1.0, new BigDecimal(1.0), new Date(), account, quote);
        String expected = "<BR>Holding Data for holding: 1 </B>" + "<LI>      quantity:1.0</LI>" + "<LI> purchasePrice:1.0</LI>" + "<LI>  purchaseDate: sun Jan 01 01:00:00 EST 1970</LI>" + "<LI>       quoteID:null</LI>";
        assertEquals(expected, holding.toHTML());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPurchasePrice_QSuT0_fid1() {
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        BigDecimal expectedPurchasePrice = BigDecimal.valueOf(100.0);
        BigDecimal actualPurchasePrice = holdingDataBean.getPurchasePrice();
        assertEquals(expectedPurchasePrice, actualPurchasePrice);
    }
}