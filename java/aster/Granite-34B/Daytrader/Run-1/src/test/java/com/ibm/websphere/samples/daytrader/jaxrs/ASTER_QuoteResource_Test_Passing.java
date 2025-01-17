/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.jaxrs;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteResource_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesGet_zpod0() {
        QuoteResource quoteResource = new QuoteResource();
        List<QuoteDataBean> expected = new ArrayList<QuoteDataBean>();
        List<QuoteDataBean> actual = quoteResource.quotesGet("symbols");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesPost_QTxb0() {
        QuoteResource quoteResource = new QuoteResource();
        List<QuoteDataBean> quotes = quoteResource.quotesPost("symbols");
        assertNotNull(quotes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesPost2_CZCt1() {
        QuoteResource quoteResource = new QuoteResource();
        List<QuoteDataBean> quotes = quoteResource.quotesPost("symbols");
        assertEquals(0, quotes.size());
    }
}