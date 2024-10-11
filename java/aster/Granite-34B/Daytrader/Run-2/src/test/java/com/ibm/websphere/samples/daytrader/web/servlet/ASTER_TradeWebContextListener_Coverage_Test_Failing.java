/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeWebContextListener_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_xezC0() {
        TradeWebContextListener tradeWebContextListener = new TradeWebContextListener();
        tradeWebContextListener.contextInitialized(null);
        assertEquals(0, TradeConfig.getPrimIterations());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_hcyi1() {
        TradeWebContextListener tradeWebContextListener = new TradeWebContextListener();
        tradeWebContextListener.contextInitialized(null);
        assertEquals(0, TradeConfig.getMarketSummaryInterval());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_NMKG2() {
        TradeWebContextListener tradeWebContextListener = new TradeWebContextListener();
        tradeWebContextListener.contextInitialized(null);
        assertEquals(false, TradeConfig.getLongRun());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_XMHU3() {
        TradeWebContextListener tradeWebContextListener = new TradeWebContextListener();
        tradeWebContextListener.contextInitialized(null);
        assertEquals(true, TradeConfig.getPublishQuotePriceChange());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_vtAH4() {
        TradeWebContextListener tradeWebContextListener = new TradeWebContextListener();
        tradeWebContextListener.contextInitialized(null);
        assertEquals(true, TradeConfig.getDisplayOrderAlerts());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test6_tSfI5() {
        TradeWebContextListener tradeWebContextListener = new TradeWebContextListener();
        tradeWebContextListener.contextInitialized(null);
        assertEquals(0, TradeConfig.getWebInterface());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test7_cDLa6() {
        TradeWebContextListener tradeWebContextListener = new TradeWebContextListener();
        tradeWebContextListener.contextInitialized(null);
        assertEquals(0, TradeConfig.getListQuotePriceChangeFrequency());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test8_fseV7() {
        TradeWebContextListener tradeWebContextListener = new TradeWebContextListener();
        tradeWebContextListener.contextInitialized(null);
        assertEquals(0, TradeConfig.getRunTimeMode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test9_RCDB8() {
        TradeWebContextListener tradeWebContextListener = new TradeWebContextListener();
        tradeWebContextListener.contextInitialized(null);
        assertEquals(0, TradeConfig.getOrderProcessingMode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test10_WITR9() {
        TradeWebContextListener tradeWebContextListener = new TradeWebContextListener();
        tradeWebContextListener.contextInitialized(null);
        assertEquals(10000, TradeConfig.getMAX_USERS());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test11_tSfZ10() {
        TradeWebContextListener tradeWebContextListener = new TradeWebContextListener();
        tradeWebContextListener.contextInitialized(null);
        assertEquals(10000, TradeConfig.getMAX_QUOTES());
    }
}