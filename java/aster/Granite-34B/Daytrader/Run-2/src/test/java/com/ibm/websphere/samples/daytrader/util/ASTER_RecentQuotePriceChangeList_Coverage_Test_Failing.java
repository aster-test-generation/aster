/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RecentQuotePriceChangeList_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd1_MXVW0() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("1");
        recentQuotePriceChangeList.add(quoteData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd2_HtaP1() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("2");
        recentQuotePriceChangeList.add(quoteData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd3_YEpc2() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("3");
        recentQuotePriceChangeList.add(quoteData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd4_yxSr3() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("4");
        recentQuotePriceChangeList.add(quoteData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd5_XcRc4() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("5");
        recentQuotePriceChangeList.add(quoteData);
    }
}