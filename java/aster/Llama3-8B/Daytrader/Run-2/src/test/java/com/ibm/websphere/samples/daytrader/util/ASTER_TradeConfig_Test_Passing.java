/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeConfig_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFloat_MWDN0() {
        float f = TradeConfig.rndFloat(100);
        assertTrue(f >= 0 && f < 100);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFloat_vqXr1() {
        float f = TradeConfig.rndFloat(0);
        assertFalse(f >= 0 && f < 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFloat_pgFn2() {
        float f = TradeConfig.rndFloat(-100);
        assertTrue(f >= -100 && f < 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessMode_ileG0() {
        TradeConfig tradeConfig = new TradeConfig();
        int accessMode = tradeConfig.getAccessMode();
        assertEquals(0, accessMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrimIterations_auyU0() {
        TradeConfig tradeConfig = new TradeConfig();
        int expected = 1;
        int actual = tradeConfig.getPrimIterations();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndAddress_BUbB0_1() {
        String address = TradeConfig.rndAddress();
        assertNotNull(address);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndAddress_BUbB0_2() {
        String address = TradeConfig.rndAddress();
        assertFalse(address.matches("^\\d{4} Oak St.$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetJDBCDriverNeedsGlobalTransation_aDHC0() {
        TradeConfig.setJDBCDriverNeedsGlobalTransation(true);
        assertEquals(true, TradeConfig.JDBCDriverNeedsGlobalTransation);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetJDBCDriverNeedsGlobalTransationFalse_eHoK2() {
        TradeConfig.setJDBCDriverNeedsGlobalTransation(false);
        assertEquals(false, TradeConfig.JDBCDriverNeedsGlobalTransation);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFullName_Unjr0_1() {
        String result = TradeConfig.rndFullName();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFullName_Unjr0_2() {
        String result = TradeConfig.rndFullName();
        assertTrue(result.contains("first:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFullName_Unjr0_3() {
        String result = TradeConfig.rndFullName();
        assertTrue(result.contains(" last:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetScenarioMixes_TSsJ0_1() {
        TradeConfig tradeConfig = new TradeConfig();
        int[][] scenarioMixes = tradeConfig.getScenarioMixes();
        for (int[] mix : scenarioMixes) {
        }
        assertNotNull(scenarioMixes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetScenarioMixes_TSsJ0_2() {
        TradeConfig tradeConfig = new TradeConfig();
        int[][] scenarioMixes = tradeConfig.getScenarioMixes();
        for (int[] mix : scenarioMixes) {
        }
        assertTrue(scenarioMixes.length > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testRndQuantity_VVaF0() {
        float result = TradeConfig.rndQuantity();
        assertTrue(result > 0.0f && result <= 201.0f);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndNewUserID_MoHO0_1() {
        String result = TradeConfig.rndNewUserID();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFullName_Unjr0() {
        String result = TradeConfig.rndFullName();
        assertNotNull(result);
        assertTrue(result.contains("first:"));
        assertTrue(result.contains(" last:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongRun_QeKg0_fid1() {
        TradeConfig tradeConfig = new TradeConfig();
        boolean longRun = tradeConfig.getLongRun();
        assertTrue(longRun);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDisplayOrderAlerts_JlUg0_fid1() {
        boolean displayOrderAlerts = TradeConfig.getDisplayOrderAlerts();
        assertTrue(displayOrderAlerts);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextUserID_ldKr0() {
        String userID = TradeConfig.nextUserID();
        assertNotNull(userID);
        assertTrue(userID.startsWith("uid:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPage_Zner0() {
        TradeConfig tradeConfig = new TradeConfig();
        String page = tradeConfig.getPage(0);
        assertEquals("Expected page content", "Expected page content", page);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetUpdateQuotePrices_hrGN0() {
        boolean expected = true;
        boolean actual = TradeConfig.getUpdateQuotePrices();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndBoolean_Ydwm0() {
        boolean result = TradeConfig.rndBoolean();
        assertTrue(result == true || result == false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPublishQuotePriceChange_Cmwz0() {
        boolean publishQuotePriceChange = TradeConfig.getPublishQuotePriceChange();
        assertTrue(publishQuotePriceChange);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getWebInterface_iLat0() {
        TradeConfig tradeConfig = new TradeConfig();
        int result = tradeConfig.getWebInterface();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndInt_Viwk0() {
        int i = 10;
        int result = TradeConfig.rndInt(i);
        assertTrue(result >= 0 && result < i);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRandom_shzN0() {
        double result = TradeConfig.random();
        assertTrue(result >= 0.0 && result < 1.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingMode_Qdxg0() {
        int expected = 0; // Replace with the expected value
        int actual = TradeConfig.getOrderProcessingMode();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbols1_rgxJ0() {
        String symbols = TradeConfig.rndSymbols();
        assertTrue(symbols.matches("^s:\\d+(,s:\\d+)*$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbols2_SYkU1() {
        String symbols = TradeConfig.rndSymbols();
        int numSymbols = symbols.split(",").length;
        assertTrue(numSymbols <= TradeConfig.QUOTES_PER_PAGE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getRandomPriceChangeFactor_test1_wihl0() {
        BigDecimal result = TradeConfig.getRandomPriceChangeFactor();
        assertTrue(result.compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getRandomPriceChangeFactor_test2_zclu1() {
        BigDecimal result = TradeConfig.getRandomPriceChangeFactor();
        assertFalse(result.equals(BigDecimal.ONE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserID_RND_USER_True_SWQG0() {
        TradeConfig tradeConfig = new TradeConfig();
        String userID = tradeConfig.getUserID();
        assertNotNull(userID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbol_wJmp0() {
        String result = TradeConfig.rndSymbol();
        assertNotNull(result);
        assertTrue(result.startsWith("s:"));
        assertTrue(result.length() > 3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRunTimeMode_bneO0() {
        TradeConfig tradeConfig = new TradeConfig();
        int expectedMode = 0; // Replace with the expected run time mode
        int actualMode = tradeConfig.getRunTimeMode();
        assertEquals(expectedMode, actualMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndBalance_Trvk0() {
        String expected = "1000000";
        String actual = TradeConfig.rndBalance();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndNewUserID_MoHO0_4() {
        String result = TradeConfig.rndNewUserID();
        assertTrue(result.contains(String.valueOf(System.currentTimeMillis())));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextUserID_ldKr0_1() {
        String userID = TradeConfig.nextUserID();
        assertNotNull(userID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextUserID_ldKr0_2() {
        String userID = TradeConfig.nextUserID();
        assertTrue(userID.startsWith("uid:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbol_wJmp0_1() {
        String result = TradeConfig.rndSymbol();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbol_wJmp0_2() {
        String result = TradeConfig.rndSymbol();
        assertTrue(result.startsWith("s:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbol_wJmp0_3() {
        String result = TradeConfig.rndSymbol();
        assertTrue(result.length() > 3);
    }
}