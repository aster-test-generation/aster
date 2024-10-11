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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteResource_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesGetWithOneSymbol_dLGH0_fid2() {
        QuoteResource resource = new QuoteResource();
        List<QuoteDataBean> quotes = resource.quotesGet("TEST");
        assertEquals(1, quotes.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesGetWithTwoSymbols_LVtL1_fid2() {
        QuoteResource resource = new QuoteResource();
        List<QuoteDataBean> quotes = resource.quotesGet("TEST,TEST2");
        assertEquals(2, quotes.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesGetWithThreeSymbols_NJsE2_fid2() {
        QuoteResource resource = new QuoteResource();
        List<QuoteDataBean> quotes = resource.quotesGet("TEST,TEST2,TEST3");
        assertEquals(3, quotes.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesGetWithFourSymbols_YXqH3_fid2() {
        QuoteResource resource = new QuoteResource();
        List<QuoteDataBean> quotes = resource.quotesGet("TEST,TEST2,TEST3,TEST4");
        assertEquals(4, quotes.size());
    }
}