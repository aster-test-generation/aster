/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummarySingleton_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMarketSummaryDataBean_niOc0_1() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTSIA(new BigDecimal("100"));
        marketSummaryDataBean.setOpenTSIA(new BigDecimal("50"));
        marketSummaryDataBean.setVolume(1000);
        marketSummaryDataBean.setTopGainers(new ArrayList<>());
        marketSummaryDataBean.setTopLosers(new ArrayList<>());
        marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
        assertEquals(marketSummaryDataBean.getTSIA(), marketSummarySingleton.getMarketSummaryDataBean().getTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMarketSummaryDataBean_niOc0_2() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTSIA(new BigDecimal("100"));
        marketSummaryDataBean.setOpenTSIA(new BigDecimal("50"));
        marketSummaryDataBean.setVolume(1000);
        marketSummaryDataBean.setTopGainers(new ArrayList<>());
        marketSummaryDataBean.setTopLosers(new ArrayList<>());
        marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
        assertEquals(marketSummaryDataBean.getOpenTSIA(), marketSummarySingleton.getMarketSummaryDataBean().getOpenTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMarketSummaryDataBean_niOc0_3() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTSIA(new BigDecimal("100"));
        marketSummaryDataBean.setOpenTSIA(new BigDecimal("50"));
        marketSummaryDataBean.setVolume(1000);
        marketSummaryDataBean.setTopGainers(new ArrayList<>());
        marketSummaryDataBean.setTopLosers(new ArrayList<>());
        marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
        assertEquals(marketSummaryDataBean.getVolume(), marketSummarySingleton.getMarketSummaryDataBean().getVolume());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMarketSummaryDataBean_niOc0_4() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTSIA(new BigDecimal("100"));
        marketSummaryDataBean.setOpenTSIA(new BigDecimal("50"));
        marketSummaryDataBean.setVolume(1000);
        marketSummaryDataBean.setTopGainers(new ArrayList<>());
        marketSummaryDataBean.setTopLosers(new ArrayList<>());
        marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
        assertEquals(marketSummaryDataBean.getTopGainers(), marketSummarySingleton.getMarketSummaryDataBean().getTopGainers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMarketSummaryDataBean_niOc0_5() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTSIA(new BigDecimal("100"));
        marketSummaryDataBean.setOpenTSIA(new BigDecimal("50"));
        marketSummaryDataBean.setVolume(1000);
        marketSummaryDataBean.setTopGainers(new ArrayList<>());
        marketSummaryDataBean.setTopLosers(new ArrayList<>());
        marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
        assertEquals(marketSummaryDataBean.getTopLosers(), marketSummarySingleton.getMarketSummaryDataBean().getTopLosers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMarketSummaryDataBeanUpdate_QLOy1_bVtp0_fid1() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = marketSummarySingleton.getMarketSummaryDataBean();
        assertNull(marketSummaryDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMarketSummaryDataBean_niOc0() {
        MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTSIA(new BigDecimal("100"));
        marketSummaryDataBean.setOpenTSIA(new BigDecimal("50"));
        marketSummaryDataBean.setVolume(1000);
        marketSummaryDataBean.setTopGainers(new ArrayList<>());
        marketSummaryDataBean.setTopLosers(new ArrayList<>());
        marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
        assertEquals(marketSummaryDataBean.getTSIA(), marketSummarySingleton.getMarketSummaryDataBean().getTSIA());
        assertEquals(marketSummaryDataBean.getOpenTSIA(), marketSummarySingleton.getMarketSummaryDataBean().getOpenTSIA());
        assertEquals(marketSummaryDataBean.getVolume(), marketSummarySingleton.getMarketSummaryDataBean().getVolume());
        assertEquals(marketSummaryDataBean.getTopGainers(), marketSummarySingleton.getMarketSummaryDataBean().getTopGainers());
        assertEquals(marketSummaryDataBean.getTopLosers(), marketSummarySingleton.getMarketSummaryDataBean().getTopLosers());
    }
}