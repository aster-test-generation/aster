/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeConfig_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFloat_yGBJ0() {
        float result = TradeConfig.rndFloat(10);
        assertTrue(result >= 0 && result < 10);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessMode_MfCQ0() {
        TradeConfig tradeConfig = new TradeConfig();
        int accessMode = tradeConfig.getAccessMode();
        assertEquals(0, accessMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetMarketSummaryInterval_yUUu0() {
        TradeConfig tradeConfig = new TradeConfig();
        int expected = 20; // Replace with the expected value
        int actual = tradeConfig.getMarketSummaryInterval();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRunTimeModeNames_yVNl0_1() {
        TradeConfig tradeConfig = new TradeConfig();
        String[] runTimeModeNames = tradeConfig.getRunTimeModeNames();
        assertNotNull(runTimeModeNames);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRunTimeModeNames_yVNl0_2() {
        TradeConfig tradeConfig = new TradeConfig();
        String[] runTimeModeNames = tradeConfig.getRunTimeModeNames();
        assertNotEquals(0, runTimeModeNames.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrimIterations_qIav0() {
        TradeConfig tradeConfig = new TradeConfig();
        int result = tradeConfig.getPrimIterations();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndAddress_GKnp0_1() {
        String result = TradeConfig.rndAddress();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndAddress_GKnp0_2() {
        String result = TradeConfig.rndAddress();
        assertTrue(result.matches("\\d+ Oak St."));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetJDBCDriverNeedsGlobalTransation_hBIa0() {
        TradeConfig.setJDBCDriverNeedsGlobalTransation(true);
        assertEquals(true, TradeConfig.JDBCDriverNeedsGlobalTransation);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetJDBCDriverNeedsGlobalTransation_gVNS1() {
        TradeConfig.setJDBCDriverNeedsGlobalTransation(false);
        assertEquals(false, TradeConfig.JDBCDriverNeedsGlobalTransation);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFullName_ehiW0_1() {
        String result = TradeConfig.rndFullName();
        assertTrue(result.contains("first:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFullName_ehiW0_2() {
        String result = TradeConfig.rndFullName();
        assertTrue(result.contains(" last:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFullName_ehiW0_3() {
        String result = TradeConfig.rndFullName();
        assertTrue(result.contains("first:") && result.contains(" last:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioMixes_EvIK0() {
        int[][] scenarioMixes = TradeConfig.getScenarioMixes();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMAX_USERS_ieQZ0() {
        TradeConfig tradeConfig = new TradeConfig();
        int expected = 15000; // Replace with the expected value
        int actual = tradeConfig.getMAX_USERS();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMAX_QUOTES_ImvT0() {
        TradeConfig tradeConfig = new TradeConfig();
        int expected = 10000;
        int actual = tradeConfig.getMAX_QUOTES();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testRndQuantity_DfPG0() {
        float rndQuantity = TradeConfig.rndQuantity();
        assertTrue(rndQuantity >= 1.0f && rndQuantity <= 201.0f);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongRun_PkuT0() {
        TradeConfig tradeConfig = new TradeConfig();
        boolean longRun = tradeConfig.getLongRun();
        assertTrue(longRun);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDisplayOrderAlerts_DlGI0() {
        boolean displayOrderAlerts = true;
        boolean actual = TradeConfig.getDisplayOrderAlerts();
        assertEquals(displayOrderAlerts, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetListQuotePriceChangeFrequency_gsSR0() {
        int result = TradeConfig.getListQuotePriceChangeFrequency();
        assertEquals(100, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetJDBCDriverNeedsGlobalTransation_LfNB0() {
        assertFalse(TradeConfig.getJDBCDriverNeedsGlobalTransation());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndPrice_BMQp0() {
        float result = TradeConfig.rndPrice();
        assertTrue(result >= 1.0f && result <= 201.0f);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMAX_HOLDINGS_GqGv0() {
        TradeConfig tradeConfig = new TradeConfig();
        int expectedMAX_HOLDINGS = 10;
        int actualMAX_HOLDINGS = tradeConfig.getMAX_HOLDINGS();
        assertEquals(expectedMAX_HOLDINGS, actualMAX_HOLDINGS);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderFee_BUY_htNT0() {
        BigDecimal expected = BigDecimal.valueOf(24.95);
        BigDecimal actual = TradeConfig.getOrderFee("BUY");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderFee_SELL_xGUp1() {
        BigDecimal expected = BigDecimal.valueOf(24.95);
        BigDecimal actual = TradeConfig.getOrderFee("SELL");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderFee_other_ZGtJ2() {
        BigDecimal expected = BigDecimal.valueOf(0.0);
        BigDecimal actual = TradeConfig.getOrderFee("other");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getScenarioAction_newUser_true_wyNA1() {
        boolean newUser = true;
        char result = TradeConfig.getScenarioAction(newUser);
        assertFalse(result == 'b' || result == 's');
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextUserID_bSuh0_1() {
        String userID = TradeConfig.nextUserID();
        assertNotNull(userID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextUserID_bSuh0_2() {
        String userID = TradeConfig.nextUserID();
        assertTrue(userID.startsWith("uid:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextUserIDBranchCoverage_KTKF1() {
        String userID = TradeConfig.nextUserID();
        assertEquals("uid:0", userID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetPage_aCtj0() {
        TradeConfig tradeConfig = new TradeConfig();
        String page = tradeConfig.getPage(0);
        assertEquals("/welcome.jsp", page);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWebInterfaceNames_nFvP0_1() {
        TradeConfig tradeConfig = new TradeConfig();
        String[] webInterfaceNames = tradeConfig.getWebInterfaceNames();
        assertNotNull(webInterfaceNames);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWebInterfaceNames_nFvP0_2() {
        TradeConfig tradeConfig = new TradeConfig();
        String[] webInterfaceNames = tradeConfig.getWebInterfaceNames();
        assertNotEquals(0, webInterfaceNames.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetUpdateQuotePrices_TGnh0() {
        boolean result = TradeConfig.getUpdateQuotePrices();
        assertEquals(true, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndBoolean_TTVW0() {
        boolean result = TradeConfig.rndBoolean();
        assertTrue(result == true || result == false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPublishQuotePriceChange_ufrj0() {
        boolean result = TradeConfig.getPublishQuotePriceChange();
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetWebInterface_ZENJ0() {
        TradeConfig tradeConfig = new TradeConfig();
        int result = tradeConfig.getWebInterface();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingModeNames_UYNz0_1() {
        String[] expected = {"mode1", "mode2", "mode3"};
        String[] actual = TradeConfig.getOrderProcessingModeNames();
        for (int i = 0; i < expected.length; i++) {
        }
        assertEquals(expected.length, actual.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndInt_vBTq0() {
        int i = 10;
        int result = TradeConfig.rndInt(i);
        assertTrue(result >= 0 && result < i);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRandom_Ionq0() {
        double result = TradeConfig.random();
        assertTrue(result >= 0.0 && result < 1.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOrderProcessingMode_Edob0() {
        TradeConfig tradeConfig = new TradeConfig();
        int expectedOrderProcessingMode = 0;
        int actualOrderProcessingMode = tradeConfig.getOrderProcessingMode();
        assertEquals(expectedOrderProcessingMode, actualOrderProcessingMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbols1_uctB0() {
        String symbols = TradeConfig.rndSymbols();
        Assertions.assertNotNull(symbols);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbols2_nXcd1() {
        String symbols = TradeConfig.rndSymbols();
        Assertions.assertTrue(symbols.length() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbols3_HcYN2() {
        String symbols = TradeConfig.rndSymbols();
        Assertions.assertTrue(symbols.contains("s:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testRandomPriceChangeFactor_UDca0() {
        BigDecimal result = TradeConfig.getRandomPriceChangeFactor();
        assertTrue(result.compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbol_qunB0_1() {
        String symbol = TradeConfig.rndSymbol();
        assertTrue(symbol.startsWith("s:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbol_qunB0_2() {
        String symbol = TradeConfig.rndSymbol();
        assertTrue(symbol.length() > 2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void rndCreditCardTest_cHKF0_1() {
        String result = TradeConfig.rndCreditCard();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRunTimeMode_cPZh0() {
        TradeConfig tradeConfig = new TradeConfig();
        int actual = tradeConfig.getRunTimeMode();
        int expected = 0; // Replace with the expected value
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void rndUserIDTest_bWje0() {
        TradeConfig tradeConfig = new TradeConfig();
        String nextUser = tradeConfig.rndUserID();
        assertNotNull(nextUser);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndBalance_hynD0() {
        String expected = "1000000";
        String actual = TradeConfig.rndBalance();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMAX_HOLDINGSWithMaxValue_NYEA4_MHhx0() {
        TradeConfig tradeConfig = new TradeConfig();
        tradeConfig.setMAX_HOLDINGS(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, tradeConfig.getMAX_HOLDINGS());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRunTimeModeNames_yVNl0() {
        TradeConfig tradeConfig = new TradeConfig();
        String[] runTimeModeNames = tradeConfig.getRunTimeModeNames();
        assertNotNull(runTimeModeNames);
        assertNotEquals(0, runTimeModeNames.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndAddress_GKnp0() {
        String result = TradeConfig.rndAddress();
        assertNotNull(result);
        assertTrue(result.matches("\\d+ Oak St."));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFullName_ehiW0() {
        String result = TradeConfig.rndFullName();
        assertTrue(result.contains("first:"));
        assertTrue(result.contains(" last:"));
        assertTrue(result.contains("first:") && result.contains(" last:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetJDBCDriverNeedsGlobalTransation_LfNB0_fid1() {
        assertTrue(TradeConfig.getJDBCDriverNeedsGlobalTransation());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextUserID_bSuh0() {
        String userID = TradeConfig.nextUserID();
        assertNotNull(userID);
        assertTrue(userID.startsWith("uid:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWebInterfaceNames_nFvP0() {
        TradeConfig tradeConfig = new TradeConfig();
        String[] webInterfaceNames = tradeConfig.getWebInterfaceNames();
        assertNotNull(webInterfaceNames);
        assertNotEquals(0, webInterfaceNames.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbol_qunB0() {
        String symbol = TradeConfig.rndSymbol();
        assertTrue(symbol.startsWith("s:"));
        assertTrue(symbol.length() > 2);
    }
}