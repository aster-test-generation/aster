/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeConfig_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndFloat_TOoB0() {
    TradeConfig tradeConfig = new TradeConfig();
    float result = TradeConfig.rndFloat(10);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMarketSummaryInterval_gVbq0() {
    TradeConfig tradeConfig = new TradeConfig();
    int expected = 10; // assuming default value of marketSummaryInterval is 10
    tradeConfig.setMarketSummaryInterval(expected);
    int actual = TradeConfig.getMarketSummaryInterval();
    assert actual == expected;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrimIterations_LBGK0() {
    TradeConfig tradeConfig = new TradeConfig();
    int result = TradeConfig.getPrimIterations();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessMode_ZOIy1() {
    TradeConfig tradeConfig = new TradeConfig();
    int result = TradeConfig.getAccessMode();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRunTimeModeNames_sgIh0_1() {
    TradeConfig tradeConfig = new TradeConfig();
    String[] runTimeModeNames = TradeConfig.getRunTimeModeNames();
    assertNotNull(runTimeModeNames);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRunTimeModeNames_sgIh0_2() {
    TradeConfig tradeConfig = new TradeConfig();
    String[] runTimeModeNames = TradeConfig.getRunTimeModeNames();
    assertNotEquals(0, runTimeModeNames.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndAddress_hjYJ0_1() {
    String result = TradeConfig.rndAddress();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndAddress_hjYJ0_2() {
    String result = TradeConfig.rndAddress();
    assertTrue(result.matches("\\d+ Oak St\\."));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIncrementScenarioCount_zPYN0() {
    TradeConfig tradeConfig = new TradeConfig();
    int initialCount = tradeConfig.getScenarioCount();
    TradeConfig.incrementScenarioCount();
    assertEquals(initialCount + 1, tradeConfig.getScenarioCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRunTimeMode_jgRG0() {
    TradeConfig.setRunTimeMode(1);
    assertEquals(1, TradeConfig.getRunTimeMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDisplayOrderAlerts_HSXE0() {
    TradeConfig.setDisplayOrderAlerts(true);
    assertTrue(TradeConfig.getDisplayOrderAlerts());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetScenarioMixes_ZZYN0() {
    TradeConfig tradeConfig = new TradeConfig();
    int[][] scenarioMixes = TradeConfig.getScenarioMixes();
    assertNotNull(scenarioMixes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMAX_USERS_XMSg0() {
    TradeConfig tradeConfig = new TradeConfig();
    int expected = 10; // assuming MAX_USERS is 10
    int actual = TradeConfig.getMAX_USERS();
    assert actual == expected;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndFullName_EHXA0_1() {
    String result = TradeConfig.rndFullName();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndFullName_EHXA0_2() {
    String result = TradeConfig.rndFullName();
    assertTrue(result.startsWith("first:"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndFullName_EHXA0_3() {
    String result = TradeConfig.rndFullName();
    assertTrue(result.contains(" last:"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMAX_QUOTES_qkhu0() {
    int result = TradeConfig.getMAX_QUOTES();
    assertEquals(TradeConfig.getMAX_QUOTES(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndQuantity_jAWg0() {
    float result = TradeConfig.rndQuantity();
    assert(result >= 1.0f && result <= 201.0f);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetMarketSummaryInterval_AelS0() {
    TradeConfig.setMarketSummaryInterval(10);
    assertEquals(10, TradeConfig.getMarketSummaryInterval());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongRun_iwqu0() {
    TradeConfig tradeConfig = new TradeConfig();
    boolean result = TradeConfig.getLongRun();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetListQuotePriceChangeFrequency_hJTq0() {
    TradeConfig.setListQuotePriceChangeFrequency(10);
    assertEquals(10, TradeConfig.getListQuotePriceChangeFrequency());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderProcessingMode_qsXC0() {
    TradeConfig.setOrderProcessingMode(1);
    assertEquals(1, TradeConfig.getOrderProcessingMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPublishQuotePriceChange_uBuw0() {
    TradeConfig.setPublishQuotePriceChange(true);
    assertTrue(TradeConfig.getPublishQuotePriceChange());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetListQuotePriceChangeFrequency_WnAn0() {
    TradeConfig tradeConfig = new TradeConfig();
    int expected =10; // assuming default value is10
    int actual = TradeConfig.getListQuotePriceChangeFrequency();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDisplayOrderAlerts_alhm0() {
    TradeConfig tradeConfig = new TradeConfig();
    boolean result = TradeConfig.getDisplayOrderAlerts();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessMode_llBK0() {
    TradeConfig.setAccessMode(1);
    assertEquals(1, TradeConfig.getAccessMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetJDBCDriverNeedsGlobalTransation_Fvac0() {
    TradeConfig tradeConfig = new TradeConfig();
    boolean result = TradeConfig.getJDBCDriverNeedsGlobalTransation();
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndPrice_YSVD0() {
    float result = TradeConfig.rndPrice();
    assertTrue(result >= 1.0f && result <= 201.0f);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMAX_HOLDINGS_JQce0() {
    TradeConfig tradeConfig = new TradeConfig();
    int expected =10; // assuming default value of MAX_HOLDINGS is10
    int actual = TradeConfig.getMAX_HOLDINGS();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPrimIterations_jQLN0() {
    TradeConfig.setPrimIterations(5);
    assertEquals(5, TradeConfig.getPrimIterations());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextUserID_dcpg0() {
        TradeConfig tradeConfig = new TradeConfig();
        String userID1 = TradeConfig.nextUserID();
        String userID2 = TradeConfig.nextUserID();
        assertNotEquals(userID1, userID2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetWebInterfaceNames_QMBC0() {
    TradeConfig tradeConfig = new TradeConfig();
    String[] webInterfaceNames = TradeConfig.getWebInterfaceNames();
    assertNotNull(webInterfaceNames);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUpdateQuotePrices_DBfP0() {
    TradeConfig tradeConfig = new TradeConfig();
    boolean result = TradeConfig.getUpdateQuotePrices();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndBoolean_VIME0() {
    boolean result = TradeConfig.rndBoolean();
    assertTrue(result || !result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetScenarioCount_lKfO0() {
    TradeConfig.setScenarioCount(5);
    assertEquals(5, TradeConfig.getScenarioCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPublishQuotePriceChange_PfCR0() {
    TradeConfig tradeConfig = new TradeConfig();
    boolean result = TradeConfig.getPublishQuotePriceChange();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioAction_NewUser_TYzF0() {
        TradeConfig tradeConfig = new TradeConfig();
        char result = TradeConfig.getScenarioAction(true);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioAction_NotNewUser_ActionNotB_bWFs1() {
        TradeConfig tradeConfig = new TradeConfig();
        char result = TradeConfig.getScenarioAction(false);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderProcessingModeNames_ctkR0() {
    TradeConfig tradeConfig = new TradeConfig();
    String[] expected = tradeConfig.getOrderProcessingModeNames();
    String[] actual = TradeConfig.getOrderProcessingModeNames();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetWebInterface_buTy0() {
    TradeConfig tradeConfig = new TradeConfig();
    int expected =10; // assuming default value of webInterface is10
    int actual = TradeConfig.getWebInterface();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndInt_EPMJ0() {
    TradeConfig tradeConfig = new TradeConfig();
    int result = TradeConfig.rndInt(10);
    assert(result >= 0 && result < 10);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRandom_Zexc0() {
    double result = TradeConfig.random();
    assert(result >= 0 && result < 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderProcessingMode_aBqm0() {
    TradeConfig tradeConfig = new TradeConfig();
    int expected = 0; // default value
    int actual = TradeConfig.getOrderProcessingMode();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomPriceChangeFactor_PositiveValue_FRGt0() {
    BigDecimal result = TradeConfig.getRandomPriceChangeFactor();
    assertTrue(result.doubleValue() > 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomPriceChangeFactor_Scale_Binb1() {
    BigDecimal result = TradeConfig.getRandomPriceChangeFactor();
    assertEquals(2, result.scale());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomPriceChangeFactor_RoundHalfUp_aRQf2() {
    BigDecimal result = TradeConfig.getRandomPriceChangeFactor();
    BigDecimal rounded = result.setScale(1, BigDecimal.ROUND_HALF_UP);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserID_RND_USER_true_uZAt0() {
    TradeConfig tradeConfig = new TradeConfig();
    TradeConfig.RND_USER = true;
    String result = TradeConfig.getUserID();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserID_RND_USER_false_YsQi1() {
    TradeConfig tradeConfig = new TradeConfig();
    TradeConfig.RND_USER = false;
    String result = TradeConfig.getUserID();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndSymbols_mPtb0() {
    TradeConfig tradeConfig = new TradeConfig();
    String result = TradeConfig.rndSymbols();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndSymbolsNotEmpty_ZqTE1() {
    TradeConfig tradeConfig = new TradeConfig();
    String result = TradeConfig.rndSymbols();
    assertFalse(result.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndSymbolsFormat_uvzk2() {
    TradeConfig tradeConfig = new TradeConfig();
    String result = TradeConfig.rndSymbols();
    String[] symbols = result.split(",");
    for (String symbol : symbols) {
        assertTrue(symbol.matches("s:\\d+"));
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndEmail_JZTZ0_1() {
    String userID = "user:id";
    String result = TradeConfig.rndEmail(userID);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndEmail_JZTZ0_2() {
    String userID = "user:id";
    String result = TradeConfig.rndEmail(userID);
    assertTrue(result.contains("@"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndEmail_JZTZ0_3() {
    String userID = "user:id";
    String result = TradeConfig.rndEmail(userID);
    assertTrue(result.contains(".com"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndCreditCard_jAcW0_1() {
    String result = TradeConfig.rndCreditCard();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndCreditCard_jAcW0_2() {
    String result = TradeConfig.rndCreditCard();
    assertTrue(result.matches("\\d{1,3}-\\d{1,4}-\\d{1,4}-\\d{1,4}"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRunTimeMode_PpwC1() {
    TradeConfig tradeConfig = new TradeConfig();
    int result = TradeConfig.getRunTimeMode();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndBigDecimal_hSdk0_1() {
    TradeConfig tradeConfig = new TradeConfig();
    BigDecimal result = TradeConfig.rndBigDecimal(10.5f);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndBigDecimal_hSdk0_2() {
    TradeConfig tradeConfig = new TradeConfig();
    BigDecimal result = TradeConfig.rndBigDecimal(10.5f);
    assertEquals(2, result.scale());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetWebInterface_kLFP0() {
    TradeConfig.setWebInterface(10);
    assertEquals(10, TradeConfig.getWebInterface());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndBalance_fiQK0() {
    String result = TradeConfig.rndBalance();
    assertEquals("1000000", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndUserID_zAJv0() {
    TradeConfig tradeConfig = new TradeConfig();
    String result = TradeConfig.rndUserID();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_NullParm_UKyP1() {
    TradeConfig.setConfigParam(null, "value");
    assertEquals(1, TradeConfig.getOrderProcessingMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_EmptyParm_HQkR1() {
    TradeConfig.setConfigParam("", "value");
    assertEquals(0, TradeConfig.getOrderProcessingMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_NullValue_Mwui2() {
    TradeConfig.setConfigParam("orderProcessingMode", null);
    assertEquals(0, TradeConfig.getOrderProcessingMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_EmptyValue_aDek3() {
    TradeConfig.setConfigParam("orderProcessingMode", "");
    assertEquals(0, TradeConfig.getOrderProcessingMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_OrderProcessingMode_YnNV4() {
    TradeConfig.setConfigParam("orderProcessingMode", "mode1");
    assertEquals(0, TradeConfig.getOrderProcessingMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_AccessMode_cJcD5() {
    TradeConfig.setConfigParam("accessMode", "mode1");
    assertEquals(1, TradeConfig.getAccessMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_WebInterface_cusS6() {
    TradeConfig.setConfigParam("WebInterface", "interface1");
    assertEquals(10, TradeConfig.getWebInterface());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_PrimIterations_wZFc9() {
    TradeConfig.setConfigParam("primIterations", "30");
    assertEquals(30, TradeConfig.getPrimIterations());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_InvalidParm_hwWO10() {
    TradeConfig.setConfigParam("invalidParm", "value");
    assertEquals(0, TradeConfig.getOrderProcessingMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_InvalidValue_IBEn11() {
    TradeConfig.setConfigParam("orderProcessingMode", "invalidValue");
    assertEquals(0, TradeConfig.getOrderProcessingMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_OrderProcessingMode_CaseInsensitive_GLpQ12() {
    TradeConfig.setConfigParam("ORDERPROCESSINGMODE", "MODE1");
    assertEquals(0, TradeConfig.getOrderProcessingMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_AccessMode_CaseInsensitive_nmBi13() {
    TradeConfig.setConfigParam("ACCESSMODE", "MODE1");
    assertEquals(0, TradeConfig.getAccessMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_WebInterface_CaseInsensitive_RYQy14() {
    TradeConfig.setConfigParam("WEBINTERFACE", "INTERFACE1");
    assertEquals(10, TradeConfig.getWebInterface());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetJDBCDriverNeedsGlobalTransation_bkGJ0_MdjL0() {
    TradeConfig.setConfigParam("someParameter", "someValue");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetScenarioAction_NotNewUser_ActionB_SellDeficitGreaterThanZero_NoaV2_BKqc0() {
    TradeConfig.setConfigParam("maxQuotes", "1000");
    TradeConfig.setConfigParam("sellDeficit", "1");
    char result = TradeConfig.getScenarioAction(false);
    assertEquals('p', result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_JTQM0() {
    TradeConfig.setConfigParam("orderProcessingMode", "someValue");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_ZggW0() {
    TradeConfig tradeConfig = new TradeConfig();
    tradeConfig.setConfigParam("orderProcessingMode", "someValue");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextUserIDReset_SYQs1_ivFT0_1() {
    TradeConfig tradeConfig = new TradeConfig();
    TradeConfig.setConfigParam("maxUsers", "10"); // Set maxUsers to a valid value
    for (int i = 0; i < 10; i++) { // Use the set value instead of TradeConfig.MAX_USERS
        TradeConfig.nextUserID();
    }
    String userID1 = TradeConfig.nextUserID();
    String userID2 = TradeConfig.nextUserID();
    assertEquals("uid:0", userID1);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextUserIDReset_SYQs1_ivFT0_2() {
    TradeConfig tradeConfig = new TradeConfig();
    TradeConfig.setConfigParam("maxUsers", "10"); // Set maxUsers to a valid value
    for (int i = 0; i < 10; i++) { // Use the set value instead of TradeConfig.MAX_USERS
        TradeConfig.nextUserID();
    }
    String userID1 = TradeConfig.nextUserID();
    String userID2 = TradeConfig.nextUserID();
    assertEquals("uid:3", userID2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndNewUserID_BJqT0_yMAB0_1() {
    TradeConfig tradeConfig = new TradeConfig();
    String result = TradeConfig.rndNewUserID();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndNewUserID_BJqT0_yMAB0_2() {
    TradeConfig tradeConfig = new TradeConfig();
    String result = TradeConfig.rndNewUserID();
    assertTrue(result.contains(String.valueOf(System.currentTimeMillis())));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetConfigParam_AccessMode_cJcD5_fid1() {
    TradeConfig.setConfigParam("accessMode", "mode1");
    assertEquals(0, TradeConfig.getAccessMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRunTimeModeNames_sgIh0() {
    TradeConfig tradeConfig = new TradeConfig();
    String[] runTimeModeNames = TradeConfig.getRunTimeModeNames();
    assertNotNull(runTimeModeNames);
    assertNotEquals(0, runTimeModeNames.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndAddress_hjYJ0() {
    String result = TradeConfig.rndAddress();
    assertNotNull(result);
    assertTrue(result.matches("\\d+ Oak St\\."));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndFullName_EHXA0() {
    String result = TradeConfig.rndFullName();
    assertNotNull(result);
    assertTrue(result.startsWith("first:"));
    assertTrue(result.contains(" last:"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndEmail_JZTZ0() {
    String userID = "user:id";
    String result = TradeConfig.rndEmail(userID);
    assertNotNull(result);
    assertTrue(result.contains("@"));
    assertTrue(result.contains(".com"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndCreditCard_jAcW0() {
    String result = TradeConfig.rndCreditCard();
    assertNotNull(result);
    assertTrue(result.matches("\\d{1,3}-\\d{1,4}-\\d{1,4}-\\d{1,4}"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndBigDecimal_hSdk0() {
    TradeConfig tradeConfig = new TradeConfig();
    BigDecimal result = TradeConfig.rndBigDecimal(10.5f);
    assertNotNull(result);
    assertEquals(2, result.scale());
}
}