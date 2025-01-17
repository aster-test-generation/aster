/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.jaxrs;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteResource_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesPost_IbpY0_2_fid2() {
        QuoteResource quoteResource = new QuoteResource();
        String symbols = "symbol1,symbol2";
        List<QuoteDataBean> quotes = quoteResource.quotesPost(symbols);
        assertFalse(quotes.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesPost_IbpY0() {
        QuoteResource quoteResource = new QuoteResource();
        String symbols = "symbol1,symbol2";
        List<QuoteDataBean> quotes = quoteResource.quotesPost(symbols);
        assertNotNull(quotes);
        assertFalse(quotes.isEmpty());
    }
}