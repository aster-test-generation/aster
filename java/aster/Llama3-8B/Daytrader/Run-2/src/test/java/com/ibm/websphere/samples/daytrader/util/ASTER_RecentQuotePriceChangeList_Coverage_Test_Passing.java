/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RecentQuotePriceChangeList_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_QuoteDataBeanWithInvalidSymbol_Oeba1_gJOP0() {
    RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
    QuoteDataBean quoteData = new QuoteDataBean(); // Initialize QuoteDataBean with default constructor
    recentQuotePriceChangeList.add(quoteData);
    assertEquals(0, recentQuotePriceChangeList.recentList().size());
}
}