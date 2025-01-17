/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeConfigJSF_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade_vvZy0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        assertEquals("stats", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetResult_cByO0_fid1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.getResult();
        assertEquals("expectedResult", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingMode_RyNV0_fid1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
        assertEquals(null, orderProcessingMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingModeCoverage_PSKk1_1_fid1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
        orderProcessingMode = "value";
        assertEquals(null, orderProcessingMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPopulateDatabaseWithResult_rjeT4() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setResult("TradeBuildDB: **** DayTrader Database Built - 100 users created, 1000 quotes created. ****<br/>");
        tradeConfigJSF.populateDatabase();
        assertEquals("TradeBuildDB: **** DayTrader Database Built - 100 users created, 1000 quotes created. ****<br/>", tradeConfigJSF.getResult());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuntimeModeList_ReturnSizeTwo_xKtt2_Dkva0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
        assertEquals(2, runtimeModeList.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuntimeModeList_ReturnFirstElement_Hgsd3_NgfQ0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
        assertEquals("Mode1", runtimeModeList[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuntimeModeList_ReturnSecondElement_ilHS4_CWbL0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
        assertEquals("Mode2", runtimeModeList[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuntimeModeList_ReturnFirstElement_Uppercase_KGhU5_gBqV0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
        assertEquals("MODE1", runtimeModeList[0].toUpperCase());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuntimeModeList_ReturnSecondElement_Uppercase_HmWc6_UitG0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
        assertEquals("MODE2", runtimeModeList[1].toUpperCase());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuntimeModeList_ReturnFirstElement_Lowercase_nkLp7_Pjdd0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
        assertEquals("mode1", runtimeModeList[0].toLowerCase());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuntimeModeList_ReturnSecondElement_Lowercase_OGYy8_Zzkx0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
        assertEquals("mode2", runtimeModeList[1].toLowerCase());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuntimeModeList_ReturnFirstElement_Titlecase_MMlC9_kLSV0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
        assertEquals("Mode1", runtimeModeList[0].substring(0, 1).toUpperCase() + runtimeModeList[0].substring(1).toLowerCase());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuntimeModeList_ReturnSecondElement_Titlecase_wpnN10_NGhZ0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
        assertEquals("Mode2", runtimeModeList[1].substring(0, 1).toUpperCase() + runtimeModeList[1].substring(1).toLowerCase());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPopulateDatabaseWithResultAndMaxQuotes_WwBk7_GQLd0_1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.setResult("TradeBuildDB: **** DayTrader Database Built - 100 users created, 1000 quotes created. ****<br/>");
        TradeConfig.setMAX_QUOTES(1000);
        tradeConfigJSF.populateDatabase();
        assertEquals("TradeBuildDB: **** DayTrader Database Built - 100 users created, 1000 quotes created. ****<br/>TradeBuildDB: **** Check System.Out for any errors. ****<br/>", tradeConfigJSF.getResult());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingModeCoverage_PSKk1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
        assertEquals(null, orderProcessingMode);
        orderProcessingMode = "value";
        assertEquals("value", orderProcessingMode);
    }
}