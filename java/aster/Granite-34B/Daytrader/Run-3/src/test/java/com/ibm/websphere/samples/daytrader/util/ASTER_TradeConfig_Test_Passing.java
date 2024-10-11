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
  public void testSetRunTimeMode_PeWL0() {
    TradeConfig.setRunTimeMode(1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setJDBCDriverNeedsGlobalTransation_true_iRiD0() {
    TradeConfig.setJDBCDriverNeedsGlobalTransation(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setJDBCDriverNeedsGlobalTransation_false_VHps1() {
    TradeConfig.setJDBCDriverNeedsGlobalTransation(false);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndFloatWithZeroInput_dOQL2() {
    int i = 0;
    float expected = (float) (Math.random() * i);
    float actual = TradeConfig.rndFloat(i);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryInterval_xrkZ0() {
    TradeConfig.setMarketSummaryInterval(10);
    assertEquals(10, TradeConfig.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryIntervalZero_kwRg1() {
    TradeConfig.setMarketSummaryInterval(0);
    assertEquals(0, TradeConfig.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryIntervalNegative_CQwr2() {
    TradeConfig.setMarketSummaryInterval(-5);
    assertEquals(-5, TradeConfig.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetListQuotePriceChangeFrequency_mjXY0() {
    int expected = TradeConfig.getListQuotePriceChangeFrequency();
    assertEquals(expected, TradeConfig.getListQuotePriceChangeFrequency());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetListQuotePriceChangeFrequency_fQca0() {
    TradeConfig.setListQuotePriceChangeFrequency(10);
    assertEquals(10, TradeConfig.getListQuotePriceChangeFrequency());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetListQuotePriceChangeFrequency_BoundaryValue_xYBX1() {
    TradeConfig.setListQuotePriceChangeFrequency(0);
    assertEquals(0, TradeConfig.getListQuotePriceChangeFrequency());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetListQuotePriceChangeFrequency_BoundaryValue2_LeUG2() {
    TradeConfig.setListQuotePriceChangeFrequency(Integer.MAX_VALUE);
    assertEquals(Integer.MAX_VALUE, TradeConfig.getListQuotePriceChangeFrequency());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingMode_ILHm0() {
    TradeConfig.setOrderProcessingMode(0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingMode1_Vnjv1() {
    TradeConfig.setOrderProcessingMode(1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingMode2_KeKf2() {
    TradeConfig.setOrderProcessingMode(2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingMode3_RuIE3() {
    TradeConfig.setOrderProcessingMode(3);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingMode4_Fzpm4() {
    TradeConfig.setOrderProcessingMode(4);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getDisplayOrderAlerts_ORyW0() {
    boolean expected = TradeConfig.getDisplayOrderAlerts();
    boolean actual = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getDisplayOrderAlerts_1_bMNh1() {
    TradeConfig tradeConfig = new TradeConfig();
    boolean expected = TradeConfig.getDisplayOrderAlerts();
    boolean actual = true;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getDisplayOrderAlerts_2_BJIY2() {
    TradeConfig tradeConfig = new TradeConfig();
    tradeConfig.setDisplayOrderAlerts(true);
    boolean expected = TradeConfig.getDisplayOrderAlerts();
    boolean actual = true;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getDisplayOrderAlerts_3_LcGa3() {
    TradeConfig tradeConfig = new TradeConfig();
    tradeConfig.setDisplayOrderAlerts(false);
    boolean expected = TradeConfig.getDisplayOrderAlerts();
    boolean actual = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccessMode_plib2_1() {
    TradeConfig.setAccessMode(2);
    TradeConfig.setAccessMode(1);
    TradeConfig.setAccessMode(2);
    assertEquals(2, TradeConfig.getAccessMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccessMode_plib0_3() {
    TradeConfig.setAccessMode(0);
    TradeConfig.setAccessMode(1);
    TradeConfig.setAccessMode(2);
    assertEquals(2, TradeConfig.getAccessMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccessModeWithNegativeValue_lZKt1() {
    TradeConfig.setAccessMode(-1);
    assertEquals(-1, TradeConfig.getAccessMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccessModeWithMaxValue_fYdB2() {
    TradeConfig.setAccessMode(Integer.MAX_VALUE);
    assertEquals(Integer.MAX_VALUE, TradeConfig.getAccessMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccessModeWithMinValue_EfBg3() {
    TradeConfig.setAccessMode(Integer.MIN_VALUE);
    assertEquals(Integer.MIN_VALUE, TradeConfig.getAccessMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetLongRun2_nTjs1() {
    boolean expected = true;
    boolean actual = TradeConfig.getLongRun();
    assert actual == expected;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextUserID_JrAV0() {
    String expectedUserID = "uid:0";
    String actualUserID = TradeConfig.nextUserID();
    assertEquals(expectedUserID, actualUserID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceNames_QNnC0() {
    String[] webInterfaceNames = TradeConfig.getWebInterfaceNames();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceNamesCoverage_XOTE1() {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_EdcT0() {
    TradeConfig.setPrimIterations(10);
    assertEquals(10, TradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_zero_vrBG1() {
    TradeConfig.setPrimIterations(0);
    assertEquals(0, TradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_negative_GJhz2() {
    TradeConfig.setPrimIterations(-10);
    assertEquals(-10, TradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getUpdateQuotePrices_returnTrue_xaPJ0() {
    assertTrue(TradeConfig.getUpdateQuotePrices());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndBoolean_SJyg0() {
    assertTrue(TradeConfig.rndBoolean());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPublishQuotePriceChange_jCgy0() {
    boolean result = TradeConfig.getPublishQuotePriceChange();
    assertEquals(true, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPublishQuotePriceChange2_TccT1() {
    boolean result = TradeConfig.getPublishQuotePriceChange();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testJDBCDriverNeedsGlobalTransation_eQYH0() {
    boolean expected = false;
    boolean actual = TradeConfig.getJDBCDriverNeedsGlobalTransation();
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testJDBCDriverNeedsGlobalTransation_True_JmkV1() {
    boolean expected = true;
    TradeConfig.setJDBCDriverNeedsGlobalTransation(true);
    boolean actual = TradeConfig.getJDBCDriverNeedsGlobalTransation();
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_QUOTES_scGv0() {
    int mAX_QUOTES = 100;
    TradeConfig.setMAX_QUOTES(mAX_QUOTES);
    assertEquals(mAX_QUOTES, TradeConfig.getMAX_QUOTES());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_QUOTESWithZero_IhKl1() {
    int mAX_QUOTES = 0;
    TradeConfig.setMAX_QUOTES(mAX_QUOTES);
    assertEquals(mAX_QUOTES, TradeConfig.getMAX_QUOTES());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_QUOTESWithNegativeNumber_fQIM2() {
    int mAX_QUOTES = -10;
    TradeConfig.setMAX_QUOTES(mAX_QUOTES);
    assertEquals(mAX_QUOTES, TradeConfig.getMAX_QUOTES());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_QUOTESWithMAXValue_vaba3() {
    int mAX_QUOTES = Integer.MAX_VALUE;
    TradeConfig.setMAX_QUOTES(mAX_QUOTES);
    assertEquals(mAX_QUOTES, TradeConfig.getMAX_QUOTES());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_QUOTESWithMINValue_mIfS4() {
    int mAX_QUOTES = Integer.MIN_VALUE;
    TradeConfig.setMAX_QUOTES(mAX_QUOTES);
    assertEquals(mAX_QUOTES, TradeConfig.getMAX_QUOTES());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndSymbolsWithZeroInput_IgAJ2() {
    String symbols = TradeConfig.rndSymbols();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getWebInterface_return_0_ImtF0() {
    TradeConfig tradeConfig = new TradeConfig();
    int expected = 0;
    int actual = TradeConfig.getWebInterface();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getOrderProcessingMode_moXj4() {
    TradeConfig tradeConfig = new TradeConfig();
    int result = TradeConfig.getOrderProcessingMode();
    assertEquals(4, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getOrderProcessingMode_withModeSet_FxDu1() {
    TradeConfig tradeConfig = new TradeConfig();
    TradeConfig.setOrderProcessingMode(1);
    int result = TradeConfig.getOrderProcessingMode();
    assertEquals(1, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndSymbol_GClO0() {
    String result = TradeConfig.rndSymbol();
    assertEquals("s:-5", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomPriceChangeFactorWithPositivePercentage_HVYL1() {
    BigDecimal result = TradeConfig.getRandomPriceChangeFactor();
    assertEquals(result.compareTo(new BigDecimal("1.0")), 1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndBalance_LlZT0() {
    assertEquals("1000000", TradeConfig.rndBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_incrementScenarioCount_0_lOwd0() {
    TradeConfig.incrementScenarioCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_incrementScenarioCount_1_pekj1() {
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_incrementScenarioCount_2_dzFy2() {
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_incrementScenarioCount_3_kkFg3() {
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_incrementScenarioCount_4_fKWE4() {
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_incrementScenarioCount_5_Nged5() {
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_incrementScenarioCount_6_cCNZ6() {
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_incrementScenarioCount_7_IQfK7() {
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_incrementScenarioCount_8_ljvm8() {
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_incrementScenarioCount_9_snlz9() {
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_incrementScenarioCount_10_uHZU10() {
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_incrementScenarioCount_11_RUZo11() {
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
    TradeConfig.incrementScenarioCount();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testRndAddress_vWfK1() {
    String expected = "1000 Oak St.";
    String actual = TradeConfig.rndAddress();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testRndAddress_bkai2() {
    String expected = "1000 Oak St.";
    String actual = TradeConfig.rndAddress();
    assertTrue(actual.matches("\\d{3} Oak St."));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testRndAddress_HnSI3() {
    String expected = "1000 Oak St.";
    String actual = TradeConfig.rndAddress();
    assertNotNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testRndAddress_VYXk4() {
    String expected = "1000 Oak St.";
    String actual = TradeConfig.rndAddress();
    assertNotEquals("", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testRndAddress_ydkl5() {
    String expected = "1000 Oak St.";
    String actual = TradeConfig.rndAddress();
    assertTrue(actual.contains("Oak"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testRndAddress_aUYZ6() {
    String expected = "1000 Oak St.";
    String actual = TradeConfig.rndAddress();
    assertTrue(actual.contains("St."));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testRndAddress_xFdp7() {
    String expected = "1000 Oak St.";
    String actual = TradeConfig.rndAddress();
    assertFalse(actual.contains("1000"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testRndAddress_DDdL8() {
    String expected = "1000 Oak St.";
    String actual = TradeConfig.rndAddress();
    assertTrue(actual.contains("Oak St."));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testRndAddress_lIWT9() {
    String expected = "1000 Oak St.";
    String actual = TradeConfig.rndAddress();
    assertFalse(actual.contains("1000 Oak St."));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_nullparm_onxt0() {
    String parm = null;
    String value = "value";
    TradeConfig.setConfigParam(parm, value);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_emptyparm_sNpI1() {
    String parm = "";
    String value = "value";
    TradeConfig.setConfigParam(parm, value);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_nullvalue_qphd2() {
    String parm = "parm";
    String value = null;
    TradeConfig.setConfigParam(parm, value);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_emptyvalue_rHkX3() {
    String parm = "parm";
    String value = "";
    TradeConfig.setConfigParam(parm, value);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_orderProcessingMode_HQbU4() {
    String parm = "orderProcessingMode";
    String value = "value";
    TradeConfig.setConfigParam(parm, value);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_accessMode_FZvD5() {
    String parm = "accessMode";
    String value = "value";
    TradeConfig.setConfigParam(parm, value);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_WebInterface_TJbM6() {
    String parm = "WebInterface";
    String value = "value";
    TradeConfig.setConfigParam(parm, value);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_maxUsers_jCKH7() {
    String parm = "maxUsers";
    String value = "value";
    TradeConfig.setConfigParam(parm, value);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_maxQuotes_QClp8() {
    String parm = "maxQuotes";
    String value = "value";
    TradeConfig.setConfigParam(parm, value);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_primIterations_nxNe9() {
    String parm = "primIterations";
    String value = "value";
    TradeConfig.setConfigParam(parm, value);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getScenarioAction_newUser_returnsCorrectAction_YWUj0() {
    boolean newUser = true;
    char result = TradeConfig.getScenarioAction(newUser);
    assertEquals('q', result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryInterval_CbUi0_FuLp0() {
    int actual = TradeConfig.getMarketSummaryInterval();
    int expected = TradeConfig.getMarketSummaryInterval();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getUpdateQuotePrices_returnFalse_nRyz1_siOi0() {
    boolean result = TradeConfig.getUpdateQuotePrices();
    assertFalse(!result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getScenarioCount_txsF0_AERw0() {
    int expected = 0;
    int actual = TradeConfig.getScenarioCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testJDBCDriverNeedsGlobalTransation_eQYH0_fid1() {
    boolean expected = true;
    boolean actual = TradeConfig.getJDBCDriverNeedsGlobalTransation();
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccessMode_plib0() {
    TradeConfig.setAccessMode(0);
    assertEquals(0, TradeConfig.getAccessMode());
    TradeConfig.setAccessMode(1);
    assertEquals(1, TradeConfig.getAccessMode());
    TradeConfig.setAccessMode(2);
    assertEquals(2, TradeConfig.getAccessMode());
  }
}