/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import javax.json.Json;
import javax.json.JsonObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Coverage_Test_Failing {
    public void testJSON1_lGKL0() throws Exception {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTSIA(new BigDecimal(0));
        marketSummaryDataBean.setOpenTSIA(new BigDecimal(0));
        marketSummaryDataBean.setVolume(0);
        marketSummaryDataBean.setTopGainers(new HashSet<>());
        marketSummaryDataBean.setTopLosers(new HashSet<>());
        marketSummaryDataBean.setSummaryDate(new Date());
        JsonObject expected = Json.createObjectBuilder()
        .add("tsia", new BigDecimal(0))
        .add("volume", 0)
        .add("date", new Date().toString())
        .build();
        JsonObject actual = marketSummaryDataBean.toJSON();
    }

    public void testJSON2_BFKI1() throws Exception {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTSIA(new BigDecimal(0));
        marketSummaryDataBean.setOpenTSIA(new BigDecimal(0));
        marketSummaryDataBean.setVolume(0);
        marketSummaryDataBean.setTopGainers(new HashSet<>());
        marketSummaryDataBean.setTopLosers(new HashSet<>());
        marketSummaryDataBean.setSummaryDate(new Date());
        JsonObject expected = Json.createObjectBuilder()
        .add("tsia", new BigDecimal(0))
        .add("volume", 0)
        .add("date", new Date().toString())
        .build();
        JsonObject actual = marketSummaryDataBean.toJSON();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithNullTopGainers_lHzm0() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTopGainers(null);
        String actualHTML = marketSummaryDataBean.toHTML();
        String expectedHTML = "<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI>" + "<BR> Current Top Gainers:" + "<BR>   Current Top Losers:";
        assertEquals(expectedHTML, actualHTML);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithNullTopLosers_Wmwj1() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTopLosers(null);
        String actualHTML = marketSummaryDataBean.toHTML();
        String expectedHTML = "<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI>" + "<BR> Current Top Gainers:" + "<BR>   Current Top Losers:";
        assertEquals(expectedHTML, actualHTML);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithEmptyTopGainers_wjTR2() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTopGainers(new ArrayList<QuoteDataBean>());
        String actualHTML = marketSummaryDataBean.toHTML();
        String expectedHTML = "<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI>" + "<BR> Current Top Gainers:" + "<BR>   Current Top Losers:";
        assertEquals(expectedHTML, actualHTML);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithEmptyTopLosers_RgQp3() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        marketSummaryDataBean.setTopLosers(new ArrayList<QuoteDataBean>());
        String actualHTML = marketSummaryDataBean.toHTML();
        String expectedHTML = "<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI>" + "<BR> Current Top Gainers:" + "<BR>   Current Top Losers:";
        assertEquals(expectedHTML, actualHTML);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithOneTopGain_roKT4() {
        MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
        QuoteDataBean quoteDataBean = new QuoteDataBean();
        marketSummaryDataBean.setTopGainers(new ArrayList<QuoteDataBean>());
        marketSummaryDataBean.getTopGainers().add(quoteDataBean);
        String actualHTML = marketSummaryDataBean.toHTML();
        String expectedHTML = "<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI>" + "<BR> Current Top Gainers:" + "<LI>" + quoteDataBean.toString() + "</LI>" + "<BR>   Current Top Losers:";
        assertEquals(expectedHTML, actualHTML);
    }
}