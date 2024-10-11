/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

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

public class Aster_MarketSummaryDataBean_Test_Passing {
    private MarketSummaryDataBean marketSummaryDataBean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA_LFZc0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100"), new BigDecimal("10"), 100.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal("10"), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA2_gDDx1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100"), new BigDecimal("20"), 100.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal("20"), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA3_EAIM2() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100"), new BigDecimal("30"), 100.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal("30"), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA4_zhbV3() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100"), new BigDecimal("40"), 100.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal("40"), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA5_wKQv4() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100"), new BigDecimal("50"), 100.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal("50"), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA6_UinL5() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100"), new BigDecimal("60"), 100.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal("60"), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA7_cZDy6() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100"), new BigDecimal("70"), 100.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal("70"), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA8_uQmn7() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100"), new BigDecimal("80"), 100.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal("80"), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA9_nfir8() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100"), new BigDecimal("90"), 100.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal("90"), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA10_ziDf9() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100"), new BigDecimal("100"), 100.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertEquals(new BigDecimal("100"), openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetGainPercent_KnjW0() throws Exception {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTSIA(new BigDecimal(1));
        marketSummaryDataBean.setOpenTSIA(new BigDecimal(1));
        marketSummaryDataBean.setVolume(1.0);
        marketSummaryDataBean.setTopGainers(new ArrayList<>());
        marketSummaryDataBean.setTopLosers(new ArrayList<>());
        marketSummaryDataBean.getGainPercent();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_TBos3() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        double volume = marketSummaryDataBean.getVolume();
        assertTrue(volume >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_Hanh6() {
        MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
        assertNotNull(marketSummaryDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenTSIA_MBfj0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setOpenTSIA(new BigDecimal(100));
        assertEquals(new BigDecimal(100), marketSummaryDataBean.getOpenTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTSIA_zczt0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        BigDecimal tSIA = new BigDecimal(100);
        marketSummaryDataBean.setTSIA(tSIA);
        assertEquals(tSIA, marketSummaryDataBean.getTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVolume_Otag0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setVolume(100.0);
        assertEquals(100.0, marketSummaryDataBean.getVolume(), 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopLosers_YZSn0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        QuoteDataBean quoteDataBean1 = new QuoteDataBean();
        QuoteDataBean quoteDataBean2 = new QuoteDataBean();
        Collection<QuoteDataBean> topLosers = new ArrayList<>();
        topLosers.add(quoteDataBean1);
        topLosers.add(quoteDataBean2);
        marketSummaryDataBean.setTopLosers(topLosers);
        assertEquals(topLosers, marketSummaryDataBean.getTopLosers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSummaryDate_ELSO0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setSummaryDate(new Date());
        Date summaryDate = marketSummaryDataBean.getSummaryDate();
        assertNotNull(summaryDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSummaryDate_ZMem0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        Date summaryDate = new Date();
        marketSummaryDataBean.setSummaryDate(summaryDate);
        assertEquals(summaryDate, marketSummaryDataBean.getSummaryDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTSIA_CRpJ0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100.00"), new BigDecimal("90.00"), 1000.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal tSIA = marketSummaryDataBean.getTSIA();
        assertNotNull(tSIA);
        assertEquals(new BigDecimal("100.00"), tSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetVolume_szVS0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setVolume(100.0);
        assertEquals(100.0, marketSummaryDataBean.getVolume(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_wQGB0() {
        marketSummaryDataBean = new MarketSummaryDataBean();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithNullTopGainers_umUk2() {
        marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("1.0"), new BigDecimal("2.0"), 100.0, null, new ArrayList<QuoteDataBean>());
        String expected = "<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:1.0</LI>" + "<LI>    openTSIA:2.0</LI>" + "<LI>      volume:100.0</LI>";
        String actual = marketSummaryDataBean.toHTML();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithNullTopLosers_JkML3() {
        marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("1.0"), new BigDecimal("2.0"), 100.0, new ArrayList<QuoteDataBean>(), null);
        String expected = "<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:1.0</LI>" + "<LI>    openTSIA:2.0</LI>" + "<LI>      volume:100.0</LI>";
        String actual = marketSummaryDataBean.toHTML();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithNullTopGainersAndTopLosers_mJtj6() {
        marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("1.0"), new BigDecimal("2.0"), 100.0, null, null);
        String expected = "<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:1.0</LI>" + "<LI>    openTSIA:2.0</LI>" + "<LI>      volume:100.0</LI>";
        String actual = marketSummaryDataBean.toHTML();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopGainers_fQMz0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        Collection<QuoteDataBean> topGainers = new ArrayList<QuoteDataBean>();
        marketSummaryDataBean.setTopGainers(topGainers);
        assertEquals(topGainers, marketSummaryDataBean.getTopGainers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTSIA_CRpJ0_1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100.00"), new BigDecimal("90.00"), 1000.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal tSIA = marketSummaryDataBean.getTSIA();
        assertNotNull(tSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTSIA_CRpJ0_2() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("100.00"), new BigDecimal("90.00"), 1000.0, new ArrayList<>(), new ArrayList<>());
        BigDecimal tSIA = marketSummaryDataBean.getTSIA();
        assertEquals(new BigDecimal("100.00"), tSIA);
    }
}