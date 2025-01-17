/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.jaxrs;
import java.util.List;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuoteResource_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesGet_SplitSymbols_zMtW1() {
        QuoteResource quoteResource = new QuoteResource();
        List<QuoteDataBean> result = quoteResource.quotesGet("symbol1,symbol2");
        assertEquals(2, result.size());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesGet_ForLoop_KEjc2() {
        QuoteResource quoteResource = new QuoteResource();
        List<QuoteDataBean> result = quoteResource.quotesGet("symbol1,symbol2,symbol3");
        assertEquals(3, result.size());
    }
}