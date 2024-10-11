/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummarySingleton_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetOpenTSIA_wegH0() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertNotNull(openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetGainPercent_KNPq1() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        BigDecimal gainPercent = marketSummaryDataBean.getGainPercent();
        assertNotNull(gainPercent);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetSummaryDate_CHYP3() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        Date summaryDate = marketSummaryDataBean.getSummaryDate();
        assertNotNull(summaryDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetTSIA_VYmv4() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        BigDecimal tSIA = marketSummaryDataBean.getTSIA();
        assertNotNull(tSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetVolume_DQzp5() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        double volume = marketSummaryDataBean.getVolume();
        assertTrue(volume >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetTopGainers_DewG6_1() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
        assertNotNull(topGainers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetTopGainers_DewG6_2() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
        assertTrue(topGainers.size() <= 5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetTopLosers_eOux7_1() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
        assertNotNull(topLosers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetTopLosers_eOux7_2() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
        assertTrue(topLosers.size() <= 5);
    }
}