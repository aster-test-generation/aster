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
    public void testAdd1_UdjF0() {
        RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("TEST");
        recentQuotePriceChangeList.add(quoteData);
    }
}