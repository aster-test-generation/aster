/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.jaxrs;
import java.util.List;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuoteResource_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesGet_EmptySymbols_ziTj0() {
        QuoteResource quoteResource = new QuoteResource();
        String symbols = "";
        List<QuoteDataBean> result = quoteResource.quotesGet(symbols);
        assertEquals(0, result.size());
}
@Test
@Timeout(value =0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesGet_SingleSymbol_Gpfs2() {
        QuoteResource quoteResource = new QuoteResource();
        String symbols = "AAPL";
        List<QuoteDataBean> result = quoteResource.quotesGet(symbols);
        assertEquals(1, result.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesGet_MultipleSymbols_HGwO0() {
        QuoteResource quoteResource = new QuoteResource();
        String symbols = "AAPL,MSFT,GOOG";
        List<QuoteDataBean> result = quoteResource.quotesGet(symbols);
        assertEquals(0, result.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQuotesGet_ReturnList_KYfp6() {
        QuoteResource quoteResource = new QuoteResource();
        String symbols = "AAPL";
        List<QuoteDataBean> result = quoteResource.quotesGet(symbols);
        assertNotNull(result);
}
}