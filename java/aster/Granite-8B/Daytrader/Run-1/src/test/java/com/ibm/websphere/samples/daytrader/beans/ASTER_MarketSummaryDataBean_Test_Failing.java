/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.json.JsonObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Test_Failing {
    private MarketSummaryDataBean marketSummaryDataBean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_rQGq0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        assertEquals("Market Summary at: null\n\t\t        TSIA:null\n\t\t    openTSIA:0.0\n\t\t        gain:0.0\n\t\t      volume:0.0", marketSummaryDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString2_WOre1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("1"), new BigDecimal("2"), 3.0, null, null);
        assertEquals("Market Summary at: null\n\t\t        TSIA:1.0\n\t\t    openTSIA:2.0\n\t\t        gain:0.0\n\t\t      volume:3.0", marketSummaryDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString3_YBdM2() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("1"), new BigDecimal("2"), 3.0, new ArrayList<>(), new ArrayList<>());
        assertEquals("Market Summary at: null\n\t\t        TSIA:1.0\n\t\t    openTSIA:2.0\n\t\t        gain:0.0\n\t\t      volume:3.0", marketSummaryDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenTSIA_RsvS0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
        assertNotNull(openTSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGainPercent_ttEa1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        BigDecimal gainPercent = marketSummaryDataBean.getGainPercent();
        assertNotNull(gainPercent);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTSIA_Sryn2() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        BigDecimal TSIA = marketSummaryDataBean.getTSIA();
        assertNotNull(TSIA);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTopGainers_Ibyp4() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
        assertNotNull(topGainers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTopLosers_BZHM5() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        Collection<QuoteDataBean> topLosers = marketSummaryDataBean.getTopLosers();
        assertNotNull(topLosers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrint_mRnT1() {
        MarketSummaryDataBean m = new MarketSummaryDataBean();
        m.print();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTML_YdBE1() {
        marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal("1.0"), new BigDecimal("2.0"), 100.0, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
        String expected = "<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:1.0</LI>" + "<LI>    openTSIA:2.0</LI>" + "<LI>      volume:100.0</LI>";
        String actual = marketSummaryDataBean.toHTML();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJSON_DhKM0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        JsonObject json = marketSummaryDataBean.toJSON();
        assertNotNull(json);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJSONWithTopVolume_HngC1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(90), 1000, new ArrayList<>(), new ArrayList<>());
        JsonObject json = marketSummaryDataBean.toJSON();
        assertNotNull(json);
    }
}