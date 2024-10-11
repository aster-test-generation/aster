/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.List;
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
    public void testAdd_PPNZ0() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        boolean result = recentQuotePriceChangeList.add(quoteDataBean);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddWithNullQuoteDataBean_CeAX1() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        boolean result = recentQuotePriceChangeList.add(null);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddWithLargeSymbolNumber_xIOW2() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        quoteDataBean.setSymbol("symbol1234567890");
        boolean result = recentQuotePriceChangeList.add(quoteDataBean);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRecentList_GTRW0_2_fid2() {
        RecentQuotePriceChangeList recentList = new RecentQuotePriceChangeList();
        List<QuoteDataBean> result = recentList.recentList();
        assertTrue(result.size() > 0);
    }
}