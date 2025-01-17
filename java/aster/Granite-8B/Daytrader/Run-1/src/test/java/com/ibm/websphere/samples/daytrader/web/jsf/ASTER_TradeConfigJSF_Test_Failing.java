/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.util.concurrent.TimeUnit;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeConfigJSF_Test_Failing {
    private String result = "";
    private ExternalContext context;
    TradeConfigJSF tradeconfigjsf;
    HttpSession httpsession;
    ExternalContext externalcontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetMarketSummaryIntervalWithNegativeValue_ocfe2() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setMarketSummaryInterval(-1 - 10);
        int result = tradeConfigJSF.getMarketSummaryInterval();
        assertEquals(-10, result);
    }

    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingModeList_oLmv0_1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] orderProcessingModeList = tradeConfigJSF.getOrderProcessingModeList();
        assertEquals(1, orderProcessingModeList.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetWebInterface_TrHp0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String webInterface = tradeConfigJSF.getWebInterface();
        assertEquals("TradeConfigJSF.getWebInterface() should return the correct web interface", "expectedWebInterface", webInterface);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade_zqHl0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        assertEquals("Trade Reset completed successfully", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingMode_fAVp0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
        assertEquals("Default", orderProcessingMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetListQuotePriceChangeFrequency_MDKK0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        int expectedListQuotePriceChangeFrequency = 0;
        int actualListQuotePriceChangeFrequency = tradeConfigJSF.getListQuotePriceChangeFrequency();
        assertEquals(expectedListQuotePriceChangeFrequency, actualListQuotePriceChangeFrequency);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetResult_jibO0_fid1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.getResult();
        assertEquals("Result should be empty", "", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetMarketSummaryInterval_lygt0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        int result = tradeConfigJSF.getMarketSummaryInterval();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetMarketSummaryIntervalWithNegativeValue_ocfe2_fid1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setMarketSummaryInterval(-10);
        int result = tradeConfigJSF.getMarketSummaryInterval();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrimIterations_pUCK0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        int result = tradeConfigJSF.getPrimIterations();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingModeList_oLmv0_2_fid1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] orderProcessingModeList = tradeConfigJSF.getOrderProcessingModeList();
        assertEquals("NewOrderProcessing", orderProcessingModeList[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxQuotes_uxvC0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        int maxQuotes = tradeConfigJSF.getMaxQuotes();
        Assertions.assertEquals(0, maxQuotes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingModeList_oLmv0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] orderProcessingModeList = tradeConfigJSF.getOrderProcessingModeList();
        assertEquals(1, orderProcessingModeList.length);
        assertEquals("NewOrderProcessing", orderProcessingModeList[0]);
    }
}