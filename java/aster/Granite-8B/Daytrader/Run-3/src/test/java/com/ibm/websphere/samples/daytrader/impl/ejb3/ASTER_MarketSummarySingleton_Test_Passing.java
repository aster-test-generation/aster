/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummarySingleton_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMarketSummaryDataBean_pnfH0() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setOpenTSIA(new BigDecimal(1));
        marketSummaryDataBean.setTSIA(new BigDecimal(1));
        marketSummaryDataBean.setVolume(1);
        Collection<QuoteDataBean> topGainers = new ArrayList<>();
        topGainers.add(new QuoteDataBean());
        Collection<QuoteDataBean> topLosers = new ArrayList<>();
        topLosers.add(new QuoteDataBean());
        marketSummaryDataBean.setTopGainers(topGainers);
        marketSummaryDataBean.setTopLosers(topLosers);
        marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
        assertEquals(marketSummaryDataBean, marketSummarySingleton.getMarketSummaryDataBean());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetOpenTSIA_ynFX0() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertNotNull(openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetGainPercent_Xrxe1() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        BigDecimal gainPercent = marketSummaryDataBean.getGainPercent();
        assertNotNull(gainPercent);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetSummaryDate_eeXc3() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        Date summaryDate = marketSummaryDataBean.getSummaryDate();
        assertNotNull(summaryDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetTSIA_HAtD4() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        BigDecimal TSIA = marketSummaryDataBean.getTSIA();
        assertNotNull(TSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetVolume_qPtn5() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        double volume = marketSummaryDataBean.getVolume();
        assertTrue(volume >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetTopGainers_ibcc6_1() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
        assertNotNull(topGainers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetTopGainers_ibcc6_2() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
        assertTrue(topGainers.size() <= 5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetTopLosers_MoAg7_1() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
        assertNotNull(topLosers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetTopLosers_MoAg7_2() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
        assertTrue(topLosers.size() <= 5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetTopGainers_ibcc6() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
        assertNotNull(topGainers);
        assertTrue(topGainers.size() <= 5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryDataBeanGetTopLosers_MoAg7() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
        assertNotNull(topLosers);
        assertTrue(topLosers.size() <= 5);
    }
}