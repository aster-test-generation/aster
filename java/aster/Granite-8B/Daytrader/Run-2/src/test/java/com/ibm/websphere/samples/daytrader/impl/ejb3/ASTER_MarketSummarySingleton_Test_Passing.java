/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummarySingleton_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMarketSummaryDataBean_bSRb0() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
        assertEquals(marketSummaryDataBean, marketSummarySingleton.getMarketSummaryDataBean());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetRandomInstance_VcNj2() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean randomInstance = MarketSummaryDataBean.getRandomInstance();
        assertNotNull(randomInstance);
    }
}