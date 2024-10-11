/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeConfigJSF_Test_Passing {
    private String result = "";
    private ExternalContext context;
    TradeConfigJSF tradeconfigjsf;
    HttpSession httpsession;
    ExternalContext externalcontext;
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWebInterfaceList_piPh0_1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] webInterfaceList = tradeConfigJSF.getWebInterfaceList();
        assertNotNull(webInterfaceList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWebInterfaceList_piPh0_2() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] webInterfaceList = tradeConfigJSF.getWebInterfaceList();
        assertEquals(2, webInterfaceList.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuntimeModeList_WxZe0_1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
        assertEquals(1, runtimeModeList.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuntimeModeList_WxZe0_2() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
        assertEquals("full", runtimeModeList[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetResult_HtNL0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.getResult();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetMarketSummaryInterval_nFTu0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        int expectedMarketSummaryInterval = 0; // Replace with the expected value
        int actualMarketSummaryInterval = tradeConfigJSF.getMarketSummaryInterval();
        assertEquals(expectedMarketSummaryInterval, actualMarketSummaryInterval);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetWebInterfaceList_XJXm0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] webInterfaceList = {"interface1", "interface2"};
        tradeConfigJSF.setWebInterfaceList(webInterfaceList);
        assertEquals(webInterfaceList, tradeConfigJSF.getWebInterfaceList());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRuntimeMode_BNgT0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String runtimeMode = tradeConfigJSF.getRuntimeMode();
        assertEquals("TradeConfigJSF.getRuntimeMode() should return the correct runtime mode", "expectedRuntimeMode", runtimeMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPrimIterations_cmfr0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        int primIterations = 10;
        tradeConfigJSF.setPrimIterations(primIterations);
        assertEquals(10, tradeConfigJSF.getPrimIterations());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrimIterations_xgka0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        int iterations = tradeConfigJSF.getPrimIterations();
        Assertions.assertEquals(10, iterations);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxUsers_MQnj0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        int maxUsers = tradeConfigJSF.getMaxUsers();
        Assertions.assertEquals(100, maxUsers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingModeList_Nclo0_1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] orderProcessingModeList = tradeConfigJSF.getOrderProcessingModeList();
        assertNotNull(orderProcessingModeList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingModeList_Nclo0_2() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] orderProcessingModeList = tradeConfigJSF.getOrderProcessingModeList();
        assertTrue(orderProcessingModeList.length > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxQuotes_oqlV0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        int maxQuotes = tradeConfigJSF.getMaxQuotes();
        Assertions.assertEquals(0, maxQuotes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsPublishQuotePriceChange_YNeT0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        boolean result = tradeConfigJSF.isPublishQuotePriceChange();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsPublishQuotePriceChangeWhenFalse_krSq2() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setPublishQuotePriceChange(false);
        boolean result = tradeConfigJSF.isPublishQuotePriceChange();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetResult_eojH0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setResult("Sample result");
        assertEquals("Sample result", tradeConfigJSF.getResult());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxUsers_HXej0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setMaxUsers(10);
        assertEquals(10, tradeConfigJSF.getMaxUsers());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDisplayOrderAlerts_MhgD0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setDisplayOrderAlerts(true);
        Assertions.assertEquals(true, tradeConfigJSF.isDisplayOrderAlerts());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMarketSummaryInterval_TpJh0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        int marketSummaryInterval = 10;
        tradeConfigJSF.setMarketSummaryInterval(marketSummaryInterval);
        assertEquals(10, tradeConfigJSF.getMarketSummaryInterval());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetWebInterface_fzzY0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String webInterface = tradeConfigJSF.getWebInterface();
        assertEquals("TradeConfigJSF.getWebInterface() returned an incorrect value", "webInterface", webInterface);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade_mQzq0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        assertEquals("Trade Reset completed successfully", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPublishQuotePriceChange_rCUn0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setPublishQuotePriceChange(true);
        assertTrue(tradeConfigJSF.isPublishQuotePriceChange());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPublishQuotePriceChangeFalse_tjzg1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setPublishQuotePriceChange(false);
        assertFalse(tradeConfigJSF.isPublishQuotePriceChange());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingMode_FlsB0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
        assertNotNull(orderProcessingMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetListQuotePriceChangeFrequency_eMFS0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setListQuotePriceChangeFrequency(1);
        assertEquals(1, tradeConfigJSF.getListQuotePriceChangeFrequency());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRuntimeModeList_jmOw0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = {"mode1", "mode2"};
        tradeConfigJSF.setRuntimeModeList(runtimeModeList);
        assertEquals(runtimeModeList, tradeConfigJSF.getRuntimeModeList());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetListQuotePriceChangeFrequency_griV0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        int listQuotePriceChangeFrequency = tradeConfigJSF.getListQuotePriceChangeFrequency();
        assertEquals(0, listQuotePriceChangeFrequency);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDisplayOrderAlerts_harj0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        boolean result = tradeConfigJSF.isDisplayOrderAlerts();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetmaxQuotes_VzJe0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setmaxQuotes(100);
        assertEquals(100, tradeConfigJSF.getMaxQuotes());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPopulateDatabase_FSkS0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.populateDatabase();
        assertEquals("database", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateConfig_RunTimeMode_eLGo0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.updateConfig();
        assertEquals(TradeConfig.getRunTimeMode(), 0); // Assuming 0 is the default value
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateConfig_OrderProcessingMode_khPd1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.updateConfig();
        assertEquals(TradeConfig.getOrderProcessingMode(), 0); // Assuming 0 is the default value
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateConfig_WebInterface_tBzG2() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.updateConfig();
        assertEquals(TradeConfig.getWebInterface(), 0); // Assuming 0 is the default value
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateConfig_MAX_USERS_OeNW3() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.updateConfig();
        assertEquals(TradeConfig.getMAX_USERS(), 100); // Assuming 100 is the default value
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateConfig_MAX_QUOTES_Oycs4() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.updateConfig();
        assertEquals(TradeConfig.getMAX_QUOTES(), 100); // Assuming 100 is the default value
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateConfig_MarketSummaryInterval_DjkL5() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.updateConfig();
        assertEquals(TradeConfig.getMarketSummaryInterval(), 10); // Assuming 10 is the default value
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateConfig_PrimIterations_huBP6() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.updateConfig();
        assertEquals(TradeConfig.getPrimIterations(), 10); // Assuming 10 is the default value
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuildDatabaseTables_GDFU0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.buildDatabaseTables();
        assertEquals("database", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetWebInterface_AXhp0_yjPa0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setWebInterface("webInterfaceValue");
        assertEquals("webInterfaceValue", tradeConfigJSF.getWebInterface());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLongRun_gueB0_tcud0_1() {
        tradeConfigJSF.setLongRun(true);
        tradeConfigJSF.setLongRun(false);
        assertTrue(tradeConfigJSF.isLongRun());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLongRun_gueB0_tcud0_2() {
        tradeConfigJSF.setLongRun(true);
        tradeConfigJSF.setLongRun(false);
        assertFalse(tradeConfigJSF.isLongRun());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWebInterfaceList_piPh0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] webInterfaceList = tradeConfigJSF.getWebInterfaceList();
        assertNotNull(webInterfaceList);
        assertEquals(2, webInterfaceList.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuntimeModeList_WxZe0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
        assertEquals(1, runtimeModeList.length);
        assertEquals("full", runtimeModeList[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingModeList_Nclo0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] orderProcessingModeList = tradeConfigJSF.getOrderProcessingModeList();
        assertNotNull(orderProcessingModeList);
        assertTrue(orderProcessingModeList.length > 0);
    }
}