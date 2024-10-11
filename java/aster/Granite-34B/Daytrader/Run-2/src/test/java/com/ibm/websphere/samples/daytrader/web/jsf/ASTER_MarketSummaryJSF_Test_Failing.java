/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryJSF_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopGainers_VPMa0() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] topGainers = new QuoteData[10];
        marketSummaryJSF.setTopGainers(topGainers);
        assertEquals(topGainers, marketSummaryJSF.getTopGainers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopGainersWithNullParameter_tjtm1() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        marketSummaryJSF.setTopGainers(null);
        assertEquals(null, marketSummaryJSF.getTopGainers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTopGainersWithEmptyArrayParameter_BBtm2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] topGainers = new QuoteData[0];
        marketSummaryJSF.setTopGainers(topGainers);
        assertEquals(topGainers, marketSummaryJSF.getTopGainers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTSIA_eUYr0() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        BigDecimal tSIA = new BigDecimal(0);
        marketSummaryJSF.setTSIA(tSIA);
        assertEquals(tSIA, marketSummaryJSF.getTSIA());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVolume_cPrs0() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        marketSummaryJSF.setVolume(0.0);
        assertEquals(0.0, marketSummaryJSF.getVolume(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getSummaryDate_QjXA0() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        Date summaryDate = marketSummaryJSF.getSummaryDate();
        assertEquals(null, summaryDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getSummaryDate_NotNull_OSnP1() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        Date summaryDate = new Date();
        marketSummaryJSF.setSummaryDate(summaryDate);
        Date returnedSummaryDate = marketSummaryJSF.getSummaryDate();
        Assertions.assertNotNull(returnedSummaryDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getSummaryDate_NotNull_AfterSet_AfterSet_AfterSet_cfIQ4() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        Date summaryDate = new Date();
        marketSummaryJSF.setSummaryDate(summaryDate);
        Date returnedSummaryDate = marketSummaryJSF.getSummaryDate();
        Assertions.assertEquals(summaryDate, returnedSummaryDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_SLMY0() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        double volume = marketSummaryJSF.getVolume();
        Assertions.assertEquals(0.0, volume, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_sDot3() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        double volume = marketSummaryJSF.getVolume();
        assertEquals(25.0, volume, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_xtRU4() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        double volume = marketSummaryJSF.getVolume();
        assertEquals(0.0, volume, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_iEHa5() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        double volume = marketSummaryJSF.getVolume();
        Assertions.assertEquals(125.0, volume, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_eNyL0() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[0];
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_loAj1() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[100];
        assertEquals(expected.length, actual.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_UrPg3() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[50];
        assertEquals(expected.length, actual.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_uXXe4() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[200];
        assertEquals(expected.length, actual.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_hlxU5() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[150];
        assertEquals(expected.length, actual.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_ruJv6() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[250];
        assertEquals(expected.length, actual.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_jOeY7() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[300];
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_EGwU8() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[350];
        assertEquals(expected.length, actual.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTopLosers_DEOJ0() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopLosers();
        QuoteData[] expected = new QuoteData[10]; // Assuming 10 QuoteData objects
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTopLosers_coverage_CSdA1_1() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopLosers();
        QuoteData[] topLosers = new QuoteData[10];
        marketSummaryJSF.setTopLosers(topLosers);
        actual = marketSummaryJSF.getTopLosers();
        assertEquals(1, actual.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTopLosers_coverage_CSdA1_2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopLosers();
        QuoteData[] topLosers = new QuoteData[10];
        marketSummaryJSF.setTopLosers(topLosers);
        actual = marketSummaryJSF.getTopLosers();
        assertEquals(10, actual.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercentHTML_0_oUsi0_QfeU0() {
        double gainPercent = 0.0;
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        String actual = marketSummaryJSF.getGainPercentHTML();
        String expected = FinancialUtils.printGainPercentHTML(BigDecimal.valueOf(gainPercent));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGainPercentHTML_100_jIBn1_Tnun0() {
        double gainPercent = 100.0;
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        String actual = marketSummaryJSF.getGainPercentHTML();
        String expected = FinancialUtils.printGainPercentHTML(BigDecimal.valueOf(gainPercent));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSummaryDate_TOcb0() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        Date date = new Date();
        marketSummaryJSF.setSummaryDate(date);
        assertEquals(date, marketSummaryJSF.getSummaryDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getSummaryDate_NotNull_OSnP1_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        Date summaryDate = new Date();
        marketSummaryJSF.setSummaryDate(summaryDate);
        Date returnedSummaryDate = marketSummaryJSF.getSummaryDate();
        assertEquals(summaryDate, returnedSummaryDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_zcrB1_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        double volume = marketSummaryJSF.getVolume();
        assertEquals(100.0, volume, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_MxOR2_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        double volume = marketSummaryJSF.getVolume();
        assertEquals(50.0, volume, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_xtRU4_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        double volume = marketSummaryJSF.getVolume();
        assertEquals(75.0, volume, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_iEHa5_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        double volume = marketSummaryJSF.getVolume();
        assertEquals(125.0, volume, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_uhpl6_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        double volume = marketSummaryJSF.getVolume();
        assertEquals(150.0, volume, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_eNyL0_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = null;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_loAj1_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[100];
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_UrPg3_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[50];
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_uXXe4_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[200];
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_hlxU5_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[150];
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_ruJv6_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[250];
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getTopGainersTest_EGwU8_fid2() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopGainers();
        QuoteData[] expected = new QuoteData[350];
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTopLosers_coverage_CSdA1() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        QuoteData[] actual = marketSummaryJSF.getTopLosers();
        assertEquals(1, actual.length);
        QuoteData[] topLosers = new QuoteData[10];
        marketSummaryJSF.setTopLosers(topLosers);
        actual = marketSummaryJSF.getTopLosers();
        assertEquals(10, actual.length);
    }
}