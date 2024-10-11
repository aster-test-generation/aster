/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuoteDataBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_aLzN0() {
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        int hash = quoteDataBean.hashCode();
        assertEquals(0, hash);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithSymbol_hIaE1() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
        int hash = quoteDataBean.hashCode();
        assertEquals(-887523944, hash);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithSymbolAndCompanyName_cLAI2() {
        QuoteDataBean quoteDataBean = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal(100.0), new BigDecimal(90.0), new BigDecimal(80.0), new BigDecimal(110.0), 10.0);
        int hash = quoteDataBean.hashCode();
        assertEquals(-887523944, hash);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEquals_OeCC0() {
		QuoteDataBean quoteDataBean = new QuoteDataBean();
		QuoteDataBean other = new QuoteDataBean();
		boolean equals = quoteDataBean.equals(other);
		assertTrue(equals);
	}
}