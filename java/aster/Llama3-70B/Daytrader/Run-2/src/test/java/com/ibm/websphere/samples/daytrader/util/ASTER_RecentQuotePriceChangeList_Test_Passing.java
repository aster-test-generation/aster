/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;
import java.util.List;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RecentQuotePriceChangeList_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEmpty_WhenListIsEmpty_ReturnTrue_Pxtj0() {
    RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
    assert(recentQuotePriceChangeList.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRecentList_wgYW0() {
    RecentQuotePriceChangeList recentQuotePriceChangeList = new RecentQuotePriceChangeList();
    List<QuoteDataBean> result = recentQuotePriceChangeList.recentList();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_NullQuoteData_ReturnFalse_tPBl2_fid1() {
    RecentQuotePriceChangeList list = new RecentQuotePriceChangeList();
    try {
        list.add(null);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        // expected
    }
}
}