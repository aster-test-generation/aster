/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA_cTtx0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal(100), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA_lXGH1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(0), new BigDecimal(0), 0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal(0), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA_jAyU3() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(-1), new BigDecimal(-1), -1, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal(-1), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoTopLosersOrTopGainers_oYUv1() {
        MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000, null, null);
        String expected = "\n\tMarket Summary at: " + marketSummaryData.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryData.getTSIA() + "\n\t\t    openTSIA:" + marketSummaryData.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryData.getGainPercent() + "\n\t\t      volume:" + marketSummaryData.getVolume();
        assertEquals(expected, marketSummaryData.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMethod1_LFuK0() {
        Collection<QuoteDataBean> gain = new ArrayList<QuoteDataBean>();
        Collection<QuoteDataBean> lose = new ArrayList<QuoteDataBean>();
        for (int ii = 0; ii < 5; ii++) {
            QuoteDataBean quote1 = QuoteDataBean.getRandomInstance();
            QuoteDataBean quote2 = QuoteDataBean.getRandomInstance();
            gain.add(quote1);
            lose.add(quote2);
        }
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(TradeConfig.rndBigDecimal(1000000.0f), TradeConfig.rndBigDecimal(1000000.0f), TradeConfig.rndQuantity(), gain, lose);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMethod2_UGpC1() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenTSIA_NuYs0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        BigDecimal openTSIA = new BigDecimal("100.00");
        marketSummaryDataBean.setOpenTSIA(openTSIA);
        assertEquals(openTSIA, marketSummaryDataBean.getOpenTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenTSIAWithNull_LFXg1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setOpenTSIA(null);
        assertEquals(null, marketSummaryDataBean.getOpenTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenTSIAWithZero_ZoPQ2() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        BigDecimal openTSIA = new BigDecimal("0.00");
        marketSummaryDataBean.setOpenTSIA(openTSIA);
        assertEquals(openTSIA, marketSummaryDataBean.getOpenTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenTSIAWithNegativeValue_Ldih3() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        BigDecimal openTSIA = new BigDecimal("-100.00");
        marketSummaryDataBean.setOpenTSIA(openTSIA);
        assertEquals(openTSIA, marketSummaryDataBean.getOpenTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVolume_zvso0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        double volume = 100.0;
        marketSummaryDataBean.setVolume(volume);
        assertEquals(volume, marketSummaryDataBean.getVolume());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVolumeWith100PercentCoverage_EBkK1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        double volume = 100.0;
        marketSummaryDataBean.setVolume(volume);
        assertEquals(volume, marketSummaryDataBean.getVolume());
        marketSummaryDataBean.setVolume(0.0);
        assertEquals(0.0, marketSummaryDataBean.getVolume());
        marketSummaryDataBean.setVolume(-100.0);
        assertEquals(-100.0, marketSummaryDataBean.getVolume());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopLosers_kfAT0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        Collection<QuoteDataBean> topLosers = new ArrayList<QuoteDataBean>();
        QuoteDataBean quoteDataBean1 = new QuoteDataBean();
        QuoteDataBean quoteDataBean2 = new QuoteDataBean();
        topLosers.add(quoteDataBean1);
        topLosers.add(quoteDataBean2);
        marketSummaryDataBean.setTopLosers(topLosers);
        assertEquals(topLosers, marketSummaryDataBean.getTopLosers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopLosersWithNullParameter_FTFh1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        marketSummaryDataBean.setTopLosers(null);
        assertEquals(null, marketSummaryDataBean.getTopLosers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopLosersWithEmptyCollection_yIBx2() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        marketSummaryDataBean.setTopLosers(new ArrayList<QuoteDataBean>());
        assertEquals(new ArrayList<QuoteDataBean>(), marketSummaryDataBean.getTopLosers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSummaryDate_tnRV0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000, null, null);
        Date actual = marketSummaryDataBean.getSummaryDate();
        Date expected = new Date();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSummaryDateWithEmptyObject_kiaH3() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(0), new BigDecimal(0), 0, null, null);
        Date actual = marketSummaryDataBean.getSummaryDate();
        Date expected = new Date();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSummaryDateWithRandomObject_khKi7() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(2000), 10000, null, null);
        Date actual = marketSummaryDataBean.getSummaryDate();
        Date expected = new Date();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSummaryDate_FPMC0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        Date summaryDate = new Date();
        marketSummaryDataBean.setSummaryDate(summaryDate);
        assertEquals(summaryDate, marketSummaryDataBean.getSummaryDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSummaryDateWithNull_wXuF1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setSummaryDate(null);
        assertEquals(null, marketSummaryDataBean.getSummaryDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSummaryDateWithEmptyDate_QoVS2() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        Date summaryDate = new Date(0L);
        marketSummaryDataBean.setSummaryDate(summaryDate);
        assertEquals(summaryDate, marketSummaryDataBean.getSummaryDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintWithParameters_yezT1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        marketSummaryDataBean.print();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTSIA_mfgD0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100.0), new BigDecimal(100.0), 100.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        assertEquals(new BigDecimal(100.0), marketSummaryDataBean.getTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTSIAWithZeroVolume_iAaX2() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100.0), new BigDecimal(100.0), 0.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        assertEquals(new BigDecimal(100.0), marketSummaryDataBean.getTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTSIAWithNoTopLosers_mkiT3() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100.0), new BigDecimal(100.0), 0.0, new ArrayList<QuoteDataBean>(), null);
        assertEquals(new BigDecimal(100.0), marketSummaryDataBean.getTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTSIAWithNoTopGainers_WDuP4() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100.0), new BigDecimal(100.0), 0.0, null, new ArrayList<QuoteDataBean>());
        assertEquals(new BigDecimal(100.0), marketSummaryDataBean.getTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_aGKX0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100.00"), new BigDecimal("90.00"), 1000.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        double volume = marketSummaryDataBean.getVolume();
        assertEquals(1000.0, volume);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolumeWithNoParameters_IuRA1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        double volume = marketSummaryDataBean.getVolume();
        assertEquals(0.0, volume);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolumeWithZeroVolume_kDoq4() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100.00"), new BigDecimal("90.00"), 0.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        double volume = marketSummaryDataBean.getVolume();
        assertEquals(0.0, volume);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTopGainers_xIUC0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100.00"), new BigDecimal("90.00"), 1000.0, null, null);
        Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
        assertEquals(null, topGainers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTopLosers_qIVP0() {
        QuoteDataBean quoteDataBean1 = new QuoteDataBean();
        QuoteDataBean quoteDataBean2 = new QuoteDataBean();
        QuoteDataBean quoteDataBean3 = new QuoteDataBean();
        Collection<QuoteDataBean> collection = new ArrayList<QuoteDataBean>();
        collection.add(quoteDataBean1);
        collection.add(quoteDataBean2);
        collection.add(quoteDataBean3);
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1), new BigDecimal(1), 1, collection, collection);
        Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
        assertNotNull(topLosers);
        assertEquals(3, topLosers.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTopLosersNull_Izzg1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
        assertNull(topLosers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithNoGainersOrLosers_jOTP0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100.00"), new BigDecimal("90.00"), 1000000, null, null);
        String expected = "<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI>";
        assertEquals(expected, marketSummaryDataBean.toHTML());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopGainers_leyd0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        Collection<QuoteDataBean> topGainers = new ArrayList<QuoteDataBean>();
        marketSummaryDataBean.setTopGainers(topGainers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopGainers2_ReKf1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(0), new BigDecimal(0), 0, null, null);
        Collection<QuoteDataBean> topGainers = new ArrayList<QuoteDataBean>();
        marketSummaryDataBean.setTopGainers(topGainers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopGainers3_FiCH2() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(0), new BigDecimal(0), 0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        Collection<QuoteDataBean> topGainers = new ArrayList<QuoteDataBean>();
        marketSummaryDataBean.setTopGainers(topGainers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopGainers4_ShPl3() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(0), new BigDecimal(0), 0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        Collection<QuoteDataBean> topGainers = null;
        marketSummaryDataBean.setTopGainers(topGainers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopGainers6_zjPP5() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        Collection<QuoteDataBean> topGainers = null;
        marketSummaryDataBean.setTopGainers(topGainers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVolumeWith100PercentCoverage_EBkK1_3() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        double volume = 100.0;
        marketSummaryDataBean.setVolume(volume);
        marketSummaryDataBean.setVolume(0.0);
        marketSummaryDataBean.setVolume(-100.0);
        assertEquals(-100.0, marketSummaryDataBean.getVolume());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTopLosers_qIVP0_1() {
        QuoteDataBean quoteDataBean1 = new QuoteDataBean();
        QuoteDataBean quoteDataBean2 = new QuoteDataBean();
        QuoteDataBean quoteDataBean3 = new QuoteDataBean();
        Collection<QuoteDataBean> collection = new ArrayList<QuoteDataBean>();
        collection.add(quoteDataBean1);
        collection.add(quoteDataBean2);
        collection.add(quoteDataBean3);
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1), new BigDecimal(1), 1, collection, collection);
        Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
        assertNotNull(topLosers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTopLosers_qIVP0_2() {
        QuoteDataBean quoteDataBean1 = new QuoteDataBean();
        QuoteDataBean quoteDataBean2 = new QuoteDataBean();
        QuoteDataBean quoteDataBean3 = new QuoteDataBean();
        Collection<QuoteDataBean> collection = new ArrayList<QuoteDataBean>();
        collection.add(quoteDataBean1);
        collection.add(quoteDataBean2);
        collection.add(quoteDataBean3);
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1), new BigDecimal(1), 1, collection, collection);
        Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
        assertEquals(3, topLosers.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopLosersWithIterator_BkNi3_xVjR0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        Collection<QuoteDataBean> topLosers = new ArrayList<QuoteDataBean>();
        QuoteDataBean quoteDataBean1 = new QuoteDataBean();
        QuoteDataBean quoteDataBean2 = new QuoteDataBean();
        topLosers.add(quoteDataBean1);
        topLosers.add(quoteDataBean2);
        Iterator<QuoteDataBean> iterator = topLosers.iterator();
        marketSummaryDataBean.setTopLosers(topLosers);
        assertEquals(topLosers, marketSummaryDataBean.getTopLosers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercent_1_tNTZ1_fid2() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(0), new BigDecimal(0), 0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        BigDecimal result = marketSummaryDataBean.getGainPercent();
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_NheF0_fid2() {
        MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(200), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        String expected = "\n\tMarket Summary at: " + marketSummaryData.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryData.getTSIA() + "\n\t\t    openTSIA:" + marketSummaryData.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryData.getGainPercent() + "\n\t\t      volume:" + marketSummaryData.getVolume();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVolumeWith100PercentCoverage_EBkK1_1_fid2() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        double volume = -100.0;
        marketSummaryDataBean.setVolume(volume);
        marketSummaryDataBean.setVolume(0.0);
        marketSummaryDataBean.setVolume(-100.0);
        assertEquals(volume, marketSummaryDataBean.getVolume());
    }
}