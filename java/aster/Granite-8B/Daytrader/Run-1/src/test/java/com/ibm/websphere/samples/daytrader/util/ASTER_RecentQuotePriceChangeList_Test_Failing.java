/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RecentQuotePriceChangeList_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_fEGM0() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        boolean result = recentQuotePriceChangeList.add(quoteDataBean);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddWithLargeSymbolNumber_DzFN1() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setSymbol("symbol12345678901234567890123456789012345678901234567890");
        boolean result = recentQuotePriceChangeList.add(quoteDataBean);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddWithMaxSizeExceeded_thiv2() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteDataBean1 = new QuoteDataBean();
        QuoteDataBean quoteDataBean2 = new QuoteDataBean();
        QuoteDataBean quoteDataBean3 = new QuoteDataBean();
        QuoteDataBean quoteDataBean4 = new QuoteDataBean();
        QuoteDataBean quoteDataBean5 = new QuoteDataBean();
        recentQuotePriceChangeList.add(quoteDataBean1);
        recentQuotePriceChangeList.add(quoteDataBean2);
        recentQuotePriceChangeList.add(quoteDataBean3);
        recentQuotePriceChangeList.add(quoteDataBean4);
        recentQuotePriceChangeList.add(quoteDataBean5);
        QuoteDataBean quoteDataBean6 = new QuoteDataBean();
        boolean result = recentQuotePriceChangeList.add(quoteDataBean6);
        assertFalse(result);
    }
}