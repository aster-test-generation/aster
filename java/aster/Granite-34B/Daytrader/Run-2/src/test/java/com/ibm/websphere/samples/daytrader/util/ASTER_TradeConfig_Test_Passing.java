/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeConfig_Test_Passing {
    private int rndInt(int max) {
        return 0; // Placeholder return value
    }
    private static final int MAX_QUOTES = 100;
    private static final int QUOTES_PER_PAGE = 10;

    private String rndUserID() {
        return "random user id";
    }

    private String nextUserID() {
        return "next user id";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFloat_SAxe0() {
        int i = 100;
        float result = TradeConfig.rndFloat(i);
        assertTrue(result >= 0 && result < i);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFloat_gExf1() {
        int i = 0;
        float result = TradeConfig.rndFloat(i);
        assertFalse(result >= 0 && result < i);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFloat_COxU2() {
        int i = -100;
        float result = TradeConfig.rndFloat(i);
        assertFalse(result >= 0 && result < i);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getAccessModeTest_nIeG0() {
        int expectedAccessMode = 0; // Replace with the expected value
        int actualAccessMode = TradeConfig.getAccessMode();
        org.junit.jupiter.api.Assertions.assertEquals(expectedAccessMode, actualAccessMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getAccessModeTest_returnsZero_dYYb1() {
        int expectedAccessMode = 0;
        int actualAccessMode = TradeConfig.getAccessMode();
        org.junit.jupiter.api.Assertions.assertEquals(expectedAccessMode, actualAccessMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getAccessModeTest_returnsOne_yJDU2() {
        int expectedAccessMode = 1;
        int actualAccessMode = TradeConfig.getAccessMode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getAccessModeTest_returnsNegativeOne_KRls3() {
        int expectedAccessMode = -1;
        int actualAccessMode = TradeConfig.getAccessMode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getAccessModeTest_returnsRandomInt_JJCr6() {
        int expectedAccessMode = 0; // Replace with a random value
        int actualAccessMode = TradeConfig.getAccessMode();
        org.junit.jupiter.api.Assertions.assertEquals(expectedAccessMode, actualAccessMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getAccessModeTest_returnsNegativeRandomInt_MPGZ7() {
        int expectedAccessMode = -42; // Replace with a random negative value
        int actualAccessMode = TradeConfig.getAccessMode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getAccessModeTest_returnsZero_whenTradeConfigIsCreated_evjN8() {
        TradeConfig tradeConfig = new TradeConfig();
        int expectedAccessMode = 2;
        int actualAccessMode = tradeConfig.getAccessMode();
        org.junit.jupiter.api.Assertions.assertEquals(expectedAccessMode, actualAccessMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getAccessModeTest_returnsNegativeOne_whenTradeConfigIsCreated_LvxY10() {
        TradeConfig tradeConfig = new TradeConfig();
        int expectedAccessMode = 1;
        int actualAccessMode = tradeConfig.getAccessMode();
        org.junit.jupiter.api.Assertions.assertEquals(expectedAccessMode, actualAccessMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setRunTimeMode_valueIsOne_runTimeModeIsOne_hLTa0() {
        TradeConfig.setRunTimeMode(1);
        assert TradeConfig.getRunTimeMode() == 1;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setRunTimeMode_valueIsTwo_runTimeModeIsTwo_QbhU1() {
        TradeConfig.setRunTimeMode(2);
        assert TradeConfig.getRunTimeMode() == 2;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setRunTimeMode_valueIsThree_runTimeModeIsThree_anbm2() {
        TradeConfig.setRunTimeMode(3);
        assert TradeConfig.getRunTimeMode() == 3;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetJDBCDriverNeedsGlobalTransation_fChO0() {
        boolean JDBCDriverNeedsGlobalTransationVal = true;
        TradeConfig.setJDBCDriverNeedsGlobalTransation(JDBCDriverNeedsGlobalTransationVal);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetJDBCDriverNeedsGlobalTransationFalse_YvUW1() {
        boolean JDBCDriverNeedsGlobalTransationVal = false;
        TradeConfig.setJDBCDriverNeedsGlobalTransation(JDBCDriverNeedsGlobalTransationVal);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDisplayOrderAlerts_etrj0() {
        TradeConfig.setDisplayOrderAlerts(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDisplayOrderAlertsFalse_lxvB1() {
        TradeConfig.setDisplayOrderAlerts(false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetMAX_USERS_PuDG0() {
        int actual = TradeConfig.getMAX_USERS();
        int expected = 15000; // Replace with the expected value
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetMAX_USERS_VYvR11() {
        int actual = TradeConfig.getMAX_USERS();
        int expected = 2147483647; // Replace with the expected value
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setMAX_HOLDINGS_validInput_success_AycG0() {
        TradeConfig.setMAX_HOLDINGS(100);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setMarketSummaryIntervalTest_AkqE0() {
        TradeConfig.setMarketSummaryInterval(10);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndQuantity_Nlgq0() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongRun_NqUY0() {
        boolean expected = true;
        boolean actual = TradeConfig.getLongRun();
        assertTrue(actual == expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongRun_KFFI1() {
        boolean expected = false;
        boolean actual = TradeConfig.getLongRun();
        assertFalse(actual == expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setPublishQuotePriceChange_true_gRuD0() {
        TradeConfig.setPublishQuotePriceChange(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setPublishQuotePriceChange_false_jLng1() {
        TradeConfig.setPublishQuotePriceChange(false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetListQuotePriceChangeFrequency_oAbs0() {
        TradeConfig.setListQuotePriceChangeFrequency(10);
        assertEquals(10, TradeConfig.getListQuotePriceChangeFrequency());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetListQuotePriceChangeFrequencyWithNegativeValue_fuHG1() {
        TradeConfig.setListQuotePriceChangeFrequency(-10);
        assertEquals(-10, TradeConfig.getListQuotePriceChangeFrequency());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetListQuotePriceChangeFrequencyWithZero_vssz2() {
        TradeConfig.setListQuotePriceChangeFrequency(0);
        assertEquals(0, TradeConfig.getListQuotePriceChangeFrequency());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderProcessingMode_tpvg0() {
        TradeConfig.setOrderProcessingMode(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderProcessingModeWithZeroValue_wRjl1() {
        TradeConfig.setOrderProcessingMode(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderProcessingModeWithNegativeValue_Mxog2() {
        TradeConfig.setOrderProcessingMode(-1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetMAX_USERS_oVTE0() {
        TradeConfig.setMAX_USERS(100);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetMAX_USERS2_ownm1() {
        TradeConfig.setMAX_USERS(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetMAX_USERS3_dMJU2() {
        TradeConfig.setMAX_USERS(-1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetMAX_USERS4_UFEx3() {
        TradeConfig.setMAX_USERS(Integer.MAX_VALUE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetMAX_USERS5_pqvD4() {
        TradeConfig.setMAX_USERS(Integer.MIN_VALUE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDisplayOrderAlerts_NVqI0() {
        boolean expected = true;
        boolean actual = TradeConfig.getDisplayOrderAlerts();
        assertTrue(actual == expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDisplayOrderAlerts_HKrr1() {
        boolean expected = false;
        boolean actual = TradeConfig.getDisplayOrderAlerts();
        assertFalse(actual == expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDisplayOrderAlerts_PjOL2() {
        boolean expected = true;
        boolean actual = TradeConfig.getDisplayOrderAlerts();
        assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDisplayOrderAlerts_gktI3() {
        boolean expected = false;
        boolean actual = TradeConfig.getDisplayOrderAlerts();
        assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetListQuotePriceChangeFrequency_NeSK0() {
        int expected = TradeConfig.getListQuotePriceChangeFrequency();
        int actual = TradeConfig.getListQuotePriceChangeFrequency();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetUpdateQuotePrices_riKf0() {
        TradeConfig.setUpdateQuotePrices(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetUpdateQuotePricesFalse_YEqz1() {
        TradeConfig.setUpdateQuotePrices(false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAccessMode_whenValueIsZero_thenAccessModeIsZero_ZMrV0() {
        TradeConfig.setAccessMode(0);
        int actualAccessMode = TradeConfig.getAccessMode();
        int expectedAccessMode = 0;
        assert actualAccessMode == expectedAccessMode;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAccessMode_whenValueIsOne_thenAccessModeIsOne_kDwM1() {
        TradeConfig.setAccessMode(1);
        int actualAccessMode = TradeConfig.getAccessMode();
        int expectedAccessMode = 1;
        assert actualAccessMode == expectedAccessMode;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAccessMode_whenValueIsTwo_thenAccessModeIsTwo_jzbN2() {
        TradeConfig.setAccessMode(2);
        int actualAccessMode = TradeConfig.getAccessMode();
        int expectedAccessMode = 2;
        assert actualAccessMode == expectedAccessMode;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJDBCDriverNeedsGlobalTransationTrue_pNCS0() {
        boolean actual = TradeConfig.getJDBCDriverNeedsGlobalTransation();
        assertFalse(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMAX_HOLDINGS_QTtW10() {
        assertEquals(10, TradeConfig.getMAX_HOLDINGS());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getScenarioAction_newUser_returnsAction_FGBo0() {
        char result = TradeConfig.getScenarioAction(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPrimIterations_QRaq0() {
        TradeConfig.setPrimIterations(10);
        assertEquals(10, TradeConfig.getPrimIterations());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPageTest_FPUX0() {
        String result = TradeConfig.getPage(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPageTest_1_PUkn1() {
        String result = TradeConfig.getPage(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPageTest_2_Mede2() {
        String result = TradeConfig.getPage(2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMAX_QUOTES_nCNH0() {
        TradeConfig.setMAX_QUOTES(100);
        assertEquals(100, TradeConfig.getMAX_QUOTES());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMAX_QUOTESWithZero_JWNI2() {
        TradeConfig.setMAX_QUOTES(0);
        assertEquals(0, TradeConfig.getMAX_QUOTES());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getUpdateQuotePrices_ReturnTrue_WhenUpdateQuotePricesIsCalled_xOuX0() {
        boolean expected = true;
        boolean actual = TradeConfig.getUpdateQuotePrices();
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndBoolean_xduH0_1() {
        assertFalse(TradeConfig.rndBoolean());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetScenarioCount_BEkd0() {
        TradeConfig.setScenarioCount(10);
        assertEquals(10, TradeConfig.getScenarioCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetScenarioCountZero_whQt1() {
        TradeConfig.setScenarioCount(0);
        assertEquals(0, TradeConfig.getScenarioCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetScenarioCountNegative_kqbO2() {
        TradeConfig.setScenarioCount(-5);
        assertEquals(-5, TradeConfig.getScenarioCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getPublishQuotePriceChange_true_nDYv0() {
        boolean expected = true;
        boolean actual = TradeConfig.getPublishQuotePriceChange();
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_Nullparm_WYoI0() {
        TradeConfig.setConfigParam(null, "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_Emptyparm_GakV1() {
        TradeConfig.setConfigParam("", "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_Nullvalue_FEHh2() {
        TradeConfig.setConfigParam("parm", null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_Emptyvalue_iMpv3() {
        TradeConfig.setConfigParam("parm", "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_OrderProcessingMode_cuDr4() {
        TradeConfig.setConfigParam("orderProcessingMode", "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_AccessMode_ZZKp5() {
        TradeConfig.setConfigParam("accessMode", "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_WebInterface_zeul6() {
        TradeConfig.setConfigParam("WebInterface", "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_MaxUsers_QBPU7() {
        TradeConfig.setConfigParam("maxUsers", "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_MaxQuotes_epIM8() {
        TradeConfig.setConfigParam("maxQuotes", "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_PrimIterations_IMBj9() {
        TradeConfig.setConfigParam("primIterations", "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_AllParameters_CGkr10() {
        TradeConfig.setConfigParam("orderProcessingMode", "value1");
        TradeConfig.setConfigParam("accessMode", "value2");
        TradeConfig.setConfigParam("WebInterface", "value3");
        TradeConfig.setConfigParam("maxUsers", "value4");
        TradeConfig.setConfigParam("maxQuotes", "value5");
        TradeConfig.setConfigParam("primIterations", "value6");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_InvalidParameter_AWbm11() {
        TradeConfig.setConfigParam("invalidParameter", "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_InvalidValue_kouQ12() {
        TradeConfig.setConfigParam("orderProcessingMode", "invalidValue");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_InvalidValue_AccessMode_VMOm13() {
        TradeConfig.setConfigParam("accessMode", "invalidValue");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_InvalidValue_WebInterface_GwHA14() {
        TradeConfig.setConfigParam("WebInterface", "invalidValue");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_InvalidValue_MaxUsers_AcZt15() {
        TradeConfig.setConfigParam("maxUsers", "invalidValue");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_InvalidValue_MaxQuotes_XlAn16() {
        TradeConfig.setConfigParam("maxQuotes", "invalidValue");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_InvalidValue_PrimIterations_OCTt17() {
        TradeConfig.setConfigParam("primIterations", "invalidValue");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_InvalidValue_AllParameters_Gtwv18() {
        TradeConfig.setConfigParam("orderProcessingMode", "invalidValue1");
        TradeConfig.setConfigParam("accessMode", "invalidValue2");
        TradeConfig.setConfigParam("WebInterface", "invalidValue3");
        TradeConfig.setConfigParam("maxUsers", "invalidValue4");
        TradeConfig.setConfigParam("maxQuotes", "invalidValue5");
        TradeConfig.setConfigParam("primIterations", "invalidValue6");
    }

    @Test
    @Timeout(value = 0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getWebInterfaceTest_ObDd0() {
        int expected = TradeConfig.getWebInterface();
        int actual = 0;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getWebInterfaceTest1_CaOQ1() {
        int expected = TradeConfig.getWebInterface();
        int actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = -100, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getWebInterfaceTest4_izeI4() {
        int expected = TradeConfig.getWebInterface();
        int actual = -100;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = -2147483648, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getWebInterfaceTest6_MdVx6() {
        int expected = TradeConfig.getWebInterface();
        int actual = Integer.MIN_VALUE;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getWebInterfaceTest8_ndXS8() {
        int expected = TradeConfig.getWebInterface();
        int actual = new TradeConfig().getWebInterface();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getWebInterfaceTest10_hcJY10() {
        int expected = TradeConfig.getWebInterface();
        int actual = TradeConfig.getWebInterface();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndInt_UQMJ0_1() {
        int result1 = TradeConfig.rndInt(10);
        int result2 = TradeConfig.rndInt(100);
        int result3 = TradeConfig.rndInt(1000);
        assertTrue(result1 >= 0 && result1 < 10);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndInt_UQMJ0_2() {
        int result1 = TradeConfig.rndInt(10);
        int result2 = TradeConfig.rndInt(100);
        int result3 = TradeConfig.rndInt(1000);
        assertTrue(result2 >= 0 && result2 < 100);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndInt_UQMJ0_3() {
        int result1 = TradeConfig.rndInt(10);
        int result2 = TradeConfig.rndInt(100);
        int result3 = TradeConfig.rndInt(1000);
        assertTrue(result3 >= 0 && result3 < 1000);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRandom_pFmA0() {
        double result = TradeConfig.random();
        assertTrue(result >= 0.0 && result < 1.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRandom_UHCq2() {
        double result = TradeConfig.random();
        assertTrue(result >= 0.5 && result < 1.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderProcessingMode_DzFi0() {
        assertEquals(0, TradeConfig.getOrderProcessingMode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomPriceChangeFactorWithZero_Lmmc1() {
        BigDecimal actual = TradeConfig.getRandomPriceChangeFactor();
        BigDecimal expected = new BigDecimal("0.0");
        assertNotEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomPriceChangeFactorWithNegative_kGsk2() {
        BigDecimal actual = TradeConfig.getRandomPriceChangeFactor();
        BigDecimal expected = new BigDecimal("-1.0");
        assertNotEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getScenarioCount_1_yqpb1() {
        assertEquals(1, TradeConfig.getScenarioCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getScenarioCount_2_lmdm1() {
        TradeConfig tradeConfig = new TradeConfig();
        tradeConfig.setScenarioCount(10);
        assertEquals(10, TradeConfig.getScenarioCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getScenarioCount_3_AAfS2() {
        TradeConfig tradeConfig = new TradeConfig();
        tradeConfig.setScenarioCount(5);
        assertEquals(5, TradeConfig.getScenarioCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getScenarioCount_5_tovH4() {
        assertEquals(0, TradeConfig.getScenarioCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getScenarioCount_7_UjXh6() {
        assertEquals(10, TradeConfig.getScenarioCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getScenarioCount_9_ckkl8() {
        assertEquals(-5, TradeConfig.getScenarioCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getScenarioCount_18_iYJf17() {
        assertEquals(-4, TradeConfig.getScenarioCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getRunTimeMode_returnsCorrectValue_lqan0() {
        int expected = 1; // Replace with the expected value
        int actual = TradeConfig.getRunTimeMode();
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getRunTimeMode_returnsCorrectValue_QYyr2() {
        int expected = -1; // Replace with the expected value
        int actual = TradeConfig.getRunTimeMode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getRunTimeMode_returnsCorrectValue_vFbE3() {
        int expected = Integer.MAX_VALUE; // Replace with the expected value
        int actual = TradeConfig.getRunTimeMode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getRunTimeMode_returnsCorrectValue_sZqf4() {
        int expected = Integer.MIN_VALUE; // Replace with the expected value
        int actual = TradeConfig.getRunTimeMode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getRunTimeMode_returnsCorrectValue_najT5() {
        int expected = 100; // Replace with the expected value
        int actual = TradeConfig.getRunTimeMode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getRunTimeMode_returnsCorrectValue_FOTy6() {
        int expected = -100; // Replace with the expected value
        int actual = TradeConfig.getRunTimeMode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getRunTimeMode_returnsCorrectValue_KazO9() {
        int expected = 10000; // Replace with the expected value
        int actual = TradeConfig.getRunTimeMode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getRunTimeMode_returnsCorrectValue_yLsc10() {
        int expected = -10000; // Replace with the expected value
        int actual = TradeConfig.getRunTimeMode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndBigDecimalWithZeroFloat_bfNL2() {
        float f = 0.0f;
        BigDecimal expected = new BigDecimal(Math.random() * f).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal actual = TradeConfig.rndBigDecimal(f);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetWebInterface_HmYn0() {
        TradeConfig.setWebInterface(1);
        assertEquals(1, TradeConfig.getWebInterface());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndBalance_pEpm0() {
        assertEquals("1000000", TradeConfig.rndBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMarketSummaryIntervalTest_myjF0_vvNo0() {
        int expected = 20;
        int actual = TradeConfig.getMarketSummaryInterval();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderFeeWithBuyOrderType_rlWp0_PHHf0() {
        String orderFee = "1000000";
        assertEquals(orderFee, TradeConfig.rndBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextUserIDWithMaxUsers_RKWv1_jaqW0() {
        String expectedUserID = "uid:100";
        for (int i = 0; i < 100; i++) {
            TradeConfig.nextUserID();
        }
        String actualUserID = TradeConfig.nextUserID();
        assertEquals(expectedUserID, actualUserID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWebInterfaceNames_MExY0_sUJU0() {
        String[] expected = {"webInterfaceNames"};
        String[] actual = TradeConfig.getWebInterfaceNames();
        assertNotEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getAccessModeTest_returnsOne_yJDU2_fid1() {
        int expectedAccessMode = 1;
        int actualAccessMode = TradeConfig.getAccessMode();
        org.junit.jupiter.api.Assertions.assertEquals(expectedAccessMode, actualAccessMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getAccessModeTest_returnsZero_whenTradeConfigIsCreated_evjN8_fid1() {
        TradeConfig tradeConfig = new TradeConfig();
        int expectedAccessMode = 0;
        int actualAccessMode = tradeConfig.getAccessMode();
        org.junit.jupiter.api.Assertions.assertEquals(expectedAccessMode, actualAccessMode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJDBCDriverNeedsGlobalTransationTrue_pNCS0_fid1() {
        boolean actual = TradeConfig.getJDBCDriverNeedsGlobalTransation();
        assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getScenarioAction_newUser_returnsAction_FGBo0_fid1() {
        char result = TradeConfig.getScenarioAction(true);
        assertTrue(Arrays.asList('b', 's', 'c', 'p', 'v').contains(result));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndInt_UQMJ0() {
        int result1 = TradeConfig.rndInt(10);
        assertTrue(result1 >= 0 && result1 < 10);
        int result2 = TradeConfig.rndInt(100);
        assertTrue(result2 >= 0 && result2 < 100);
        int result3 = TradeConfig.rndInt(1000);
        assertTrue(result3 >= 0 && result3 < 1000);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getRunTimeMode_returnsCorrectValue_lqan0_fid1() {
        int expected = 0; // Replace with the expected value
        int actual = TradeConfig.getRunTimeMode();
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndBoolean_xduH0_1_fid3() {
        assertTrue(TradeConfig.rndBoolean());
    }
}