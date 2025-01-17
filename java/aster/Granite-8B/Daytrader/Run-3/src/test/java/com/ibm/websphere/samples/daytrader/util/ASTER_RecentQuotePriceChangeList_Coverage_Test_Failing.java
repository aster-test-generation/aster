/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RecentQuotePriceChangeList_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd1_NUfw0_ANBU0() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("symbol1");
        recentQuotePriceChangeList.add(quoteData);
        assertEquals(1, recentQuotePriceChangeList.recentList().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd2_WXMa1_OZlI0() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("symbol2");
        recentQuotePriceChangeList.add(quoteData);
        assertEquals(1, recentQuotePriceChangeList.recentList().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd3_jhwY2_SLWt0() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("symbol3");
        recentQuotePriceChangeList.add(quoteData);
        assertEquals(1, recentQuotePriceChangeList.recentList().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd4_riyg3_qIKz0() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("symbol4");
        recentQuotePriceChangeList.add(quoteData);
        assertEquals(1, recentQuotePriceChangeList.recentList().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd5_oSIb4_RiXh0() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("symbol5");
        recentQuotePriceChangeList.add(quoteData);
        assertEquals(1, recentQuotePriceChangeList.recentList().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd6_ACAP5_DKFR0() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("symbol6");
        recentQuotePriceChangeList.add(quoteData);
        assertEquals(1, recentQuotePriceChangeList.recentList().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd7_rHHT6_rGcR0() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("symbol7");
        recentQuotePriceChangeList.add(quoteData);
        assertEquals(1, recentQuotePriceChangeList.recentList().size());
    }
}