/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeConfig_Test_Passing {
  private TradeConfig config;
  private TradeConfig tradeConfig;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndFloat_FvrK0() {
    float result = TradeConfig.rndFloat(10);
    assertTrue(result >= 0.0f && result <= 10.0f);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndFloatWithNegativeInput_qWmG1() {
    float result = TradeConfig.rndFloat(-10);
    assertTrue(result >= -10.0f && result <= 0.0f);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndFloatWithZeroInput_LGTI2() {
    float result = TradeConfig.rndFloat(0);
    assertEquals(0.0f, result, 0.0f);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccessMode_IJnK3() {
    TradeConfig config = new TradeConfig();
    int accessMode = config.getAccessMode();
    assertEquals(3, accessMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryInterval_eVNU0() {
    int expected = -1;
    int actual = TradeConfig.getMarketSummaryInterval();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryIntervalWithDifferentValues_wQoa1_1() {
    int expected = 5;
    int actual = TradeConfig.getMarketSummaryInterval();
    expected = 15;
    actual = TradeConfig.getMarketSummaryInterval();
    expected = -1;
    actual = TradeConfig.getMarketSummaryInterval();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterations_customValue_moBK1() {
    int expected = 20;
    TradeConfig.setPrimIterations(expected);
    int actual = TradeConfig.getPrimIterations();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterations_negativeValue_hvUD2() {
    int expected = -10;
    TradeConfig.setPrimIterations(expected);
    int actual = TradeConfig.getPrimIterations();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterations_zeroValue_VLNR3() {
    int expected = 0;
    TradeConfig.setPrimIterations(expected);
    int actual = TradeConfig.getPrimIterations();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterations_invalidValue_jiWz5() {
    int expected = -1;
    TradeConfig.setPrimIterations(expected);
    int actual = TradeConfig.getPrimIterations();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterations_validValue_CaQt6() {
    int expected = 10;
    TradeConfig.setPrimIterations(expected);
    int actual = TradeConfig.getPrimIterations();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndAddress_koBu0_1() {
    String address = TradeConfig.rndAddress();
    assertNotNull(address);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndAddress_koBu0_2() {
    String address = TradeConfig.rndAddress();
    assertTrue(address.contains("Oak St."));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndAddress_koBu0_3() {
    String address = TradeConfig.rndAddress();
    assertTrue(address.length() > 10);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRunTimeMode_byfg0() {
    TradeConfig config = new TradeConfig();
    config.setRunTimeMode(1);
    assertEquals(1, config.getRunTimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRunTimeModeWithInvalidValue_VDpA1() {
    TradeConfig config = new TradeConfig();
    config.setRunTimeMode(0);
    assertEquals(0, config.getRunTimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetJDBCDriverNeedsGlobalTransationTrue_wHlv0() {
    TradeConfig.setJDBCDriverNeedsGlobalTransation(true);
    assertTrue(TradeConfig.JDBCDriverNeedsGlobalTransation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetJDBCDriverNeedsGlobalTransationFalse_ULAi1() {
    TradeConfig.setJDBCDriverNeedsGlobalTransation(false);
    assertFalse(TradeConfig.JDBCDriverNeedsGlobalTransation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndFullName_20_cmKf19() {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScenarioMixes_EhKe0_1() {
    TradeConfig tradeConfig = new TradeConfig();
    int[][] scenarioMixes = tradeConfig.getScenarioMixes();
    for (int i = 0; i < scenarioMixes.length; i++) {
      for (int j = 0; j < scenarioMixes[i].length; j++) {
      }
    }
    assertNotNull(scenarioMixes);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScenarioMixes_EhKe0_2() {
    TradeConfig tradeConfig = new TradeConfig();
    int[][] scenarioMixes = tradeConfig.getScenarioMixes();
    for (int i = 0; i < scenarioMixes.length; i++) {
      for (int j = 0; j < scenarioMixes[i].length; j++) {
      }
    }
    assertEquals(2, scenarioMixes.length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScenarioMixes_EhKe0_3() {
    TradeConfig tradeConfig = new TradeConfig();
    int[][] scenarioMixes = tradeConfig.getScenarioMixes();
    for (int i = 0; i < scenarioMixes.length; i++) {
      for (int j = 0; j < scenarioMixes[i].length; j++) {
      }
    }
    assertEquals(10, scenarioMixes[0].length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScenarioMixesWithInvalidScenario_UuKG4_1() {
    TradeConfig tradeConfig = new TradeConfig();
    int[][] scenarioMixes = tradeConfig.getScenarioMixes();
    for (int i = 10; i < scenarioMixes.length; i++) {
      for (int j = 10; j < scenarioMixes[i].length; j++) {
      }
    }
    assertNotNull(scenarioMixes);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScenarioMixesWithInvalidScenarioMix_OFOT5() {
    TradeConfig tradeConfig = new TradeConfig();
    int[][] scenarioMixes = tradeConfig.getScenarioMixes();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMAX_USERS_UOBx1_2() {
    int expected = 100;
    int actual = TradeConfig.getMAX_USERS();
    expected = 50;
    actual = TradeConfig.getMAX_USERS();
    expected = 25;
    actual = TradeConfig.getMAX_USERS();
    expected = 10;
    actual = TradeConfig.getMAX_USERS();
    expected = 5;
    actual = TradeConfig.getMAX_USERS();
    expected = 1;
    actual = TradeConfig.getMAX_USERS();
    expected = 0;
    actual = TradeConfig.getMAX_USERS();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterations_defaultValue_PHVb0_fid1() {
    int expected = 10;
    int actual = TradeConfig.getPrimIterations();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndAddress_koBu0() {
    String address = TradeConfig.rndAddress();
    assertNotNull(address);
    assertTrue(address.contains("Oak St."));
    assertTrue(address.length() > 10);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_HOLDINGS_kJpy0() {
    int maxHoldings = 10;
    TradeConfig.setMAX_HOLDINGS(maxHoldings);
    assertEquals(maxHoldings, TradeConfig.getMAX_HOLDINGS());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_HOLDINGSWithZeroValue_WsRR2() {
    int maxHoldings = 0;
    TradeConfig.setMAX_HOLDINGS(maxHoldings);
    assertEquals(0, TradeConfig.getMAX_HOLDINGS());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_HOLDINGSWithLargeValue_rtmD3() {
    int maxHoldings = 1000;
    TradeConfig.setMAX_HOLDINGS(maxHoldings);
    assertEquals(1000, TradeConfig.getMAX_HOLDINGS());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndQuantity_Bpkg0() {
    float result = TradeConfig.rndQuantity();
    assertTrue(result >= 1.0f && result <= 200.0f);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingMode_fHdN0() {
    TradeConfig config = new TradeConfig();
    config.setOrderProcessingMode(1);
    assertEquals(1, config.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingMode_2_bwOC1() {
    TradeConfig config = new TradeConfig();
    config.setOrderProcessingMode(2);
    assertEquals(2, config.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingMode_3_tSRH2() {
    TradeConfig config = new TradeConfig();
    config.setOrderProcessingMode(3);
    assertEquals(3, config.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingMode_4_AhWl3() {
    TradeConfig config = new TradeConfig();
    config.setOrderProcessingMode(4);
    assertEquals(4, config.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUpdateQuotePrices_JUHj0() {
    TradeConfig config = new TradeConfig();
    config.setUpdateQuotePrices(true);
    assertTrue(config.getUpdateQuotePrices());
    config.setUpdateQuotePrices(false);
    assertFalse(config.getUpdateQuotePrices());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_xshg0() {
    tradeConfig = new TradeConfig();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetJDBCDriverNeedsGlobalTransation_False_vQTi1() {
    boolean result = TradeConfig.getJDBCDriverNeedsGlobalTransation();
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetJDBCDriverNeedsGlobalTransation_Invalid_CqPc3() {
    boolean result = TradeConfig.getJDBCDriverNeedsGlobalTransation();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_Tdxw0() {
    config = new TradeConfig();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_validInput_tZmI0() {
    int iter = 10;
    TradeConfig.setPrimIterations(iter);
    assertEquals(iter, TradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_zeroInput_TPgZ3() {
    int iter = 0;
    TradeConfig.setPrimIterations(iter);
    assertEquals(0, TradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_maxInput_oopy4() {
    int iter = Integer.MAX_VALUE;
    TradeConfig.setPrimIterations(iter);
    assertEquals(iter, TradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_minInput_wIYo5() {
    int iter = Integer.MIN_VALUE;
    TradeConfig.setPrimIterations(iter);
    assertEquals(iter, TradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_randomInput_SHus6() {
    int iter = new Random().nextInt();
    TradeConfig.setPrimIterations(iter);
    assertEquals(iter, TradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_edgeCaseInput_UsAt9() {
    int iter = Integer.MAX_VALUE - 1;
    TradeConfig.setPrimIterations(iter);
    assertEquals(iter, TradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_QUOTES_eLkE0() {
    int maxQuotes = 10;
    TradeConfig.setMAX_QUOTES(maxQuotes);
    assertEquals(maxQuotes, TradeConfig.getMAX_QUOTES());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_QUOTESWithZeroValue_aOHR2() {
    int maxQuotes = 0;
    TradeConfig.setMAX_QUOTES(maxQuotes);
    assertEquals(0, TradeConfig.getMAX_QUOTES());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_QUOTESWithLargeValue_TzSV3() {
    int maxQuotes = 1000;
    TradeConfig.setMAX_QUOTES(maxQuotes);
    assertEquals(1000, TradeConfig.getMAX_QUOTES());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndBoolean_False_nykZ1() {
    TradeConfig config = new TradeConfig();
    boolean result = config.rndBoolean();
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetScenarioCount_hfHs0() {
    int scenarioCount = 5;
    TradeConfig.setScenarioCount(scenarioCount);
    assertEquals(scenarioCount, TradeConfig.getScenarioCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetScenarioCount_zero_PHET1() {
    int scenarioCount = 0;
    TradeConfig.setScenarioCount(scenarioCount);
    assertEquals(scenarioCount, TradeConfig.getScenarioCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetScenarioCount_negative_Jclm2() {
    int scenarioCount = -1;
    TradeConfig.setScenarioCount(scenarioCount);
    assertEquals(scenarioCount, TradeConfig.getScenarioCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPublishQuotePriceChange_haNb1() {
    boolean expected = true;
    boolean actual = tradeConfig.getPublishQuotePriceChange();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPublishQuotePriceChangeWithDifferentValues_EWKy2() {
    boolean expected = false;
    boolean actual = tradeConfig.getPublishQuotePriceChange();
    assertNotEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterface_nwVk1() {
    int webInterface = tradeConfig.getWebInterface();
    assertEquals(1, webInterface);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndInt_iKII0() {
    int i = 10;
    int result = TradeConfig.rndInt(i);
    assertTrue(result >= 0 && result < i);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndIntWithZeroInput_JWJO2() {
    int i = 0;
    int result = TradeConfig.rndInt(i);
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndIntWithLargeInput_wofp3() {
    int i = Integer.MAX_VALUE;
    int result = TradeConfig.rndInt(i);
    assertTrue(result >= 0 && result < i);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomPriceChangeFactor_Positive_YUek0() {
    BigDecimal result = TradeConfig.getRandomPriceChangeFactor();
    assertTrue(result.doubleValue() > 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndSymbol_1_uVso0() {
    String symbol = TradeConfig.rndSymbol();
    assertNotNull(symbol);
    assertTrue(symbol.startsWith("s:"));
    assertTrue(symbol.length() > 2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndSymbol_5_hFWj4() {
    String symbol = TradeConfig.rndSymbol();
    assertNotNull(symbol);
    assertTrue(symbol.startsWith("s:"));
    assertTrue(symbol.length() > 2);
    assertTrue(symbol.endsWith("3"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndSymbol_13_tSPW12() {
    String symbol = TradeConfig.rndSymbol();
    assertNotNull(symbol);
    assertTrue(symbol.startsWith("s:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndEmail_irdH0() {
    String userID = "user1";
    String email = TradeConfig.rndEmail(userID);
    assertEquals("user1@1.com", email);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRunTimeMode_Default_eXES0() {
    int actual = TradeConfig.getRunTimeMode();
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterface_KjQF0() {
    int value = 1;
    TradeConfig.setWebInterface(value);
    assertEquals(value, TradeConfig.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithDifferentValue_XPfQ1() {
    int value = 2;
    TradeConfig.setWebInterface(value);
    assertEquals(value, TradeConfig.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndBalance_sygW0() {
    String balance = TradeConfig.rndBalance();
    assertEquals("1000000", balance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUpdateQuotePrices_JUHj0_2() {
    TradeConfig config = new TradeConfig();
    config.setUpdateQuotePrices(true);
    config.setUpdateQuotePrices(false);
    assertFalse(config.getUpdateQuotePrices());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndPrice_1_dNUX0() {
    float price = TradeConfig.rndPrice();
    assertTrue(price >= 1.0f && price <= 200.0f);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndSymbol_1_uVso0_1() {
    String symbol = TradeConfig.rndSymbol();
    assertNotNull(symbol);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndSymbol_1_uVso0_2() {
    String symbol = TradeConfig.rndSymbol();
    assertTrue(symbol.startsWith("s:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndSymbol_1_uVso0_3() {
    String symbol = TradeConfig.rndSymbol();
    assertTrue(symbol.length() > 2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndSymbol_3_pNIv2_4() {
    String symbol = TradeConfig.rndSymbol();
    assertTrue(symbol.endsWith("1"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndCreditCard_xylw0_1() {
    String creditCard = TradeConfig.rndCreditCard();
    assertNotNull(creditCard);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndUserID_vGss0_1() {
    TradeConfig config = new TradeConfig();
    String nextUser = config.rndUserID();
    assertNotNull(nextUser);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccessModeWithInvalidParameterType_cxbI4_Woxu0() {
    TradeConfig config = new TradeConfig();
    String accessMode = config.rndBalance();
    assertEquals("1000000", accessMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryInterval_ODta0_ovZo0() {
    int seconds = 10;
    TradeConfig.setMarketSummaryInterval(seconds);
    assertEquals(seconds, TradeConfig.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryIntervalWithZero_vPjr1_bBeJ0() {
    int seconds = 0;
    TradeConfig.setMarketSummaryInterval(seconds);
    assertEquals(seconds, TradeConfig.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryIntervalWithNegative_Given2_sBxm0() {
    int seconds = -1;
    TradeConfig.setMarketSummaryInterval(seconds);
    assertEquals(seconds, TradeConfig.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryIntervalWithLargeValue_RMEq3_qmRt0() {
    int seconds = 1000000;
    TradeConfig.setMarketSummaryInterval(seconds);
    assertEquals(seconds, TradeConfig.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPublishQuotePriceChangeTrue_IePZ0_lrGU0() {
    TradeConfig.setPublishQuotePriceChange(true);
    assertTrue(TradeConfig.getPublishQuotePriceChange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPublishQuotePriceChangeFalse_CVJQ1_BrWC0() {
    TradeConfig.setPublishQuotePriceChange(false);
    assertFalse(TradeConfig.getPublishQuotePriceChange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetListQuotePriceChangeFrequency_ANPc0_zZDz0() {
    int value = 10;
    TradeConfig.setListQuotePriceChangeFrequency(value);
    assertEquals(value, TradeConfig.getListQuotePriceChangeFrequency());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetListQuotePriceChangeFrequencyWithZero_eqDZ1_OQyK0() {
    int value = 0;
    TradeConfig.setListQuotePriceChangeFrequency(value);
    assertEquals(value, TradeConfig.getListQuotePriceChangeFrequency());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_USERS_MXls0_jQcz0() {
    TradeConfig.setMAX_USERS(10);
    assertEquals(10, TradeConfig.getMAX_USERS());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMAX_USERSWithNegativeValue_Buul1_uMiU0() {
    TradeConfig.setMAX_USERS(-1);
    assertEquals(-1, TradeConfig.getMAX_USERS());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDisplayOrderAlerts_True_wiNa0_EVbV0() {
    TradeConfig.setDisplayOrderAlerts(true);
    assertTrue(TradeConfig.getDisplayOrderAlerts());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDisplayOrderAlerts_False_ayAs1_YmYC0() {
    TradeConfig.setDisplayOrderAlerts(false);
    assertFalse(TradeConfig.getDisplayOrderAlerts());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_HGLN0() {
    TradeConfig.setAccessMode(3);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccessMode3_QGRv2_RevK1() {
    int value = 3;
    TradeConfig.setAccessMode(value);
    assertEquals(value, TradeConfig.getAccessMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_kgsH0() {
    TradeConfig.rndPrice();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUpdateQuotePrices_True_xyEw0_YEze0() {
    TradeConfig.setUpdateQuotePrices(true);
    assertTrue(TradeConfig.getUpdateQuotePrices());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLongRun_Empty_ByvY4_pbUp0() {
    TradeConfig.setLongRun(false);
    assertFalse(TradeConfig.getLongRun());
  }
}