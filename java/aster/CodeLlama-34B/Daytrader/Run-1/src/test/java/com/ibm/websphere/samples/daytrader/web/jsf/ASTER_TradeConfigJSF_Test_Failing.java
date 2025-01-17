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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeConfigJSF_Test_Failing {
  private HttpSession session;
  private ExternalContext context;
  @Mock
  private TradeConfig currentConfig;
  private TradeConfigJSF tradeConfigJSF;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_BWwZ0() {
    String[] expectedRuntimeModeList = new String[]{"DEV", "TEST", "PROD"};
    when(tradeConfigJSF.getRuntimeModeList()).thenReturn(expectedRuntimeModeList);
    String[] actualRuntimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertEquals(expectedRuntimeModeList, actualRuntimeModeList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_empty_lnpW1() {
    String[] expectedRuntimeModeList = new String[]{};
    when(tradeConfigJSF.getRuntimeModeList()).thenReturn(expectedRuntimeModeList);
    String[] actualRuntimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertEquals(expectedRuntimeModeList, actualRuntimeModeList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_null_JEfH2() {
    String[] expectedRuntimeModeList = null;
    when(tradeConfigJSF.getRuntimeModeList()).thenReturn(expectedRuntimeModeList);
    String[] actualRuntimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertEquals(expectedRuntimeModeList, actualRuntimeModeList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_duplicates_Jscr3() {
    String[] expectedRuntimeModeList = new String[]{"DEV", "TEST", "PROD", "DEV"};
    when(tradeConfigJSF.getRuntimeModeList()).thenReturn(expectedRuntimeModeList);
    String[] actualRuntimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertEquals(expectedRuntimeModeList, actualRuntimeModeList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_invalid_fFCR4() {
    String[] expectedRuntimeModeList = new String[]{"INVALID"};
    when(tradeConfigJSF.getRuntimeModeList()).thenReturn(expectedRuntimeModeList);
    String[] actualRuntimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertEquals(expectedRuntimeModeList, actualRuntimeModeList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_mixedCase_fChV5() {
    String[] expectedRuntimeModeList = new String[]{"DeV", "tEsT", "PrOd"};
    when(tradeConfigJSF.getRuntimeModeList()).thenReturn(expectedRuntimeModeList);
    String[] actualRuntimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertEquals(expectedRuntimeModeList, actualRuntimeModeList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceList_MHqy0_2_fid1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = tradeConfigJSF.getWebInterfaceList();
    for (int i = 0; i < webInterfaceList.length; i++) {
    }
    assertEquals(10, webInterfaceList.length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_lowerCase_klfO7() {
    String[] expectedRuntimeModeList = new String[]{"dev", "test", "prod"};
    when(tradeConfigJSF.getRuntimeModeList()).thenReturn(expectedRuntimeModeList);
    String[] actualRuntimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertEquals(expectedRuntimeModeList, actualRuntimeModeList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryInterval_rhWA0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int marketSummaryInterval = tradeConfigJSF.getMarketSummaryInterval();
    assertEquals(1, marketSummaryInterval);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryInterval_negativeValue_zGsU1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int marketSummaryInterval = tradeConfigJSF.getMarketSummaryInterval();
    assertEquals(-1, marketSummaryInterval);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryInterval_zeroValue_uTtG2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int marketSummaryInterval = tradeConfigJSF.getMarketSummaryInterval();
    assertEquals(0, marketSummaryInterval);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceListWithDuplicateElements_RMIu3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = new String[]{"web1", "web1", "web2", "web3"};
    tradeConfigJSF.setWebInterfaceList(webInterfaceList);
    assertEquals(3, tradeConfigJSF.getWebInterfaceList().length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceListWithDuplicateElementsAndInvalidElements_mRGL7() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = new String[]{"web1", "web1", "web2", "web3", "web4"};
    tradeConfigJSF.setWebInterfaceList(webInterfaceList);
    assertEquals(4, tradeConfigJSF.getWebInterfaceList().length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceListWithInvalidElementsAndDuplicateElements_MqzH8() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = new String[]{"web1", "web2", "web3", "web4", "web4"};
    tradeConfigJSF.setWebInterfaceList(webInterfaceList);
    assertEquals(4, tradeConfigJSF.getWebInterfaceList().length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeMode_CXNh0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String runtimeMode = tradeConfigJSF.getRuntimeMode();
    assertEquals("dev", runtimeMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeWithNull_fHxO1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String runtimeMode = tradeConfigJSF.getRuntimeMode();
    assertNull(runtimeMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeWithEmptyString_AIpS2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String runtimeMode = tradeConfigJSF.getRuntimeMode();
    assertEquals("", runtimeMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeWithDifferentCases_MuoI5() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String runtimeMode = tradeConfigJSF.getRuntimeMode();
    assertEquals("DEV", runtimeMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeWithDifferentCasesAndSpacesAndNewlines_ULin7() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String runtimeMode = tradeConfigJSF.getRuntimeMode();
    assertEquals(" DEV \n", runtimeMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeWithDifferentCasesAndSpacesAndNewlinesAndTabs_JOUx8() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String runtimeMode = tradeConfigJSF.getRuntimeMode();
    assertEquals(" DEV \n\t", runtimeMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeWithDifferentCasesAndSpacesAndNewlinesAndTabsAndBackslashes_DJPf9() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String runtimeMode = tradeConfigJSF.getRuntimeMode();
    assertEquals(" DEV \n\t\\", runtimeMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeWithDifferentCasesAndSpacesAndNewlinesAndTabsAndBackslashesAndQuotes_QPMN10() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String runtimeMode = tradeConfigJSF.getRuntimeMode();
    assertEquals(" DEV \n\t\\\"", runtimeMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeWithDifferentCasesAndSpacesAndNewlinesAndTabsAndBackslashesAndQuotesAndSingleQuotes_VnjX11() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String runtimeMode = tradeConfigJSF.getRuntimeMode();
    assertEquals(" DEV \n\t\\\"'", runtimeMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeWithDifferentCasesAndSpacesAndNewlinesAndTabsAndBackslashesAndQuotesAndSingleQuotesAndDollarSigns_ebDb12() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String runtimeMode = tradeConfigJSF.getRuntimeMode();
    assertEquals(" DEV \n\t\\\"'$", runtimeMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterations_knKD0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int primIterations = tradeConfigJSF.getPrimIterations();
    assertEquals(0, primIterations);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterationsWithPositiveValue_kUXo1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int primIterations = tradeConfigJSF.getPrimIterations();
    assertEquals(10, primIterations);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterationsWithNegativeValue_LrBy2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int primIterations = tradeConfigJSF.getPrimIterations();
    assertEquals(-10, primIterations);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterationsWithMaxValue_gxIR4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int primIterations = tradeConfigJSF.getPrimIterations();
    assertEquals(Integer.MAX_VALUE, primIterations);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterationsWithMinValue_KKHm5() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int primIterations = tradeConfigJSF.getPrimIterations();
    assertEquals(Integer.MIN_VALUE, primIterations);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMaxUsers_sTOl0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    int maxUsers = tradeConfig.getMaxUsers();
    assertEquals(100, maxUsers);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeList_empty_CIpy1() {
    String[] expected = new String[]{};
    when(tradeConfigJSF.getOrderProcessingModeList()).thenReturn(expected);
    String[] actual = tradeConfigJSF.getOrderProcessingModeList();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeList_null_LeJn2() {
    String[] expected = null;
    when(tradeConfigJSF.getOrderProcessingModeList()).thenReturn(expected);
    String[] actual = tradeConfigJSF.getOrderProcessingModeList();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeList_invalid_oeAQ3() {
    String[] expected = new String[]{"mode1", "mode2", "mode3"};
    when(tradeConfigJSF.getOrderProcessingModeList()).thenReturn(expected);
    String[] actual = tradeConfigJSF.getOrderProcessingModeList();
    assertNotEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeListDifferentLengths_UxmW3_1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] orderProcessingModeList = new String[]{"mode1", "mode2", "mode3"};
    tradeConfigJSF.setOrderProcessingModeList(orderProcessingModeList);
    orderProcessingModeList = new String[]{"mode1", "mode2"};
    tradeConfigJSF.setOrderProcessingModeList(orderProcessingModeList);
    assertEquals(3, tradeConfigJSF.getOrderProcessingModeList().length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryInterval_ykiA1() {
    int marketSummaryInterval = 10;
    tradeConfigJSF.setMarketSummaryInterval(marketSummaryInterval);
    assertEquals(marketSummaryInterval, tradeConfigJSF.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryIntervalWithInvalidValue_QMaf4() {
    int marketSummaryInterval = -1;
    tradeConfigJSF.setMarketSummaryInterval(marketSummaryInterval);
    assertEquals(0, tradeConfigJSF.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterface_gVjq1_1() {
    String webInterface = tradeConfigJSF.getWebInterface();
    Assertions.assertNotNull(webInterface);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterface_gVjq1_2() {
    String webInterface = tradeConfigJSF.getWebInterface();
    Assertions.assertEquals("webInterface", webInterface);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceWithNull_QmfF2() {
    String webInterface = tradeConfigJSF.getWebInterface();
    Assertions.assertNull(webInterface);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceWithEmptyString_igSb3() {
    String webInterface = tradeConfigJSF.getWebInterface();
    Assertions.assertEquals("", webInterface);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceWithNonEmptyString_gEFd4() {
    String webInterface = tradeConfigJSF.getWebInterface();
    Assertions.assertNotEquals("", webInterface);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceWithInvalidString_KIJa5() {
    String webInterface = tradeConfigJSF.getWebInterface();
    Assertions.assertNotEquals("invalid", webInterface);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfig_RunTimeMode_Nauf0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.updateConfig();
    assertEquals("RunTimeMode", TradeConfig.getRunTimeModeNames()[TradeConfig.getRunTimeMode()]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfig_OrderProcessingMode_lHXL1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.updateConfig();
    assertEquals("OrderProcessingMode", TradeConfig.getOrderProcessingModeNames()[TradeConfig.getOrderProcessingMode()]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfig_WebInterface_RQEh2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.updateConfig();
    assertEquals("Web Interface", TradeConfig.getWebInterfaceNames()[TradeConfig.getWebInterface()]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfig_MAX_USERS_xbwi3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.updateConfig();
    assertEquals("Trade  Users", TradeConfig.getMAX_USERS());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfig_MAX_QUOTES_Jzpk4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.updateConfig();
    assertEquals("Trade Quotes", TradeConfig.getMAX_QUOTES());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfig_MarketSummaryInterval_LumD5() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.updateConfig();
    assertEquals("Market Summary Interval", TradeConfig.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfig_PrimIterations_EjFh6() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.updateConfig();
    assertEquals("Primitive Iterations", TradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfig_PublishQuotePriceChange_TqHb7() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.updateConfig();
    assertEquals("TradeStreamer MDB Enabled", TradeConfig.getPublishQuotePriceChange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfig_ListQuotePriceChangeFrequency_LtGb8() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.updateConfig();
    assertEquals("% of trades on Websocket", TradeConfig.getListQuotePriceChangeFrequency());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfig_LongRun_uUux9() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.updateConfig();
    assertEquals("Long Run Enabled", TradeConfig.getLongRun());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfig_DisplayOrderAlerts_uvGC10() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.updateConfig();
    assertEquals("Display Order Alerts", TradeConfig.getDisplayOrderAlerts());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingMode_YPyp1() {
    String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
    assertEquals("AUTO", orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithNull_stLC2() {
    String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
    assertNull(orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithEmptyString_KWhB3() {
    String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
    assertEquals("", orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithInvalidValue_KPFu4() {
    String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
    assertNotEquals("INVALID", orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithDifferentCase_MDvV6() {
    String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
    assertEquals("auto", orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithSpecialCharacters_zRAu8() {
    String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
    assertEquals("AUTO!", orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithMultipleValues_NnWd9() {
    String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
    assertEquals("AUTO, MANUAL", orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithInvalidValueAndSpecialCharacters_fbpS13() {
    String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
    assertNotEquals("INVALID!", orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithMultipleValuesAndSpecialCharacters_tLMm15() {
    String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
    assertEquals("AUTO, MANUAL!", orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithMultipleValuesAndInvalidValue_PJzp16() {
    String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
    assertNotEquals("AUTO, MANUAL, INVALID", orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeListWithDuplicateModes_HMeJ3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] runtimeModeList = new String[]{"mode1", "mode1", "mode2", "mode3"};
    tradeConfigJSF.setRuntimeModeList(runtimeModeList);
    assertEquals(3, tradeConfigJSF.getRuntimeModeList().length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetListQuotePriceChangeFrequency_oNrE0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int frequency = tradeConfigJSF.getListQuotePriceChangeFrequency();
    assertEquals(1, frequency);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeMode_QpaX1() {
    tradeConfigJSF.setRuntimeMode("test");
    assertEquals("test", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithNull_hfvv2() {
    tradeConfigJSF.setRuntimeMode(null);
    assertNull(tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithEmptyString_oqcz3() {
    tradeConfigJSF.setRuntimeMode("");
    assertEquals("", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithInvalidValue_hWbX4() {
    tradeConfigJSF.setRuntimeMode("invalid");
    assertEquals("invalid", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithValidValue_Qfku5() {
    tradeConfigJSF.setRuntimeMode("valid");
    assertEquals("valid", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithDifferentCase_NLUl6() {
    tradeConfigJSF.setRuntimeMode("TEST");
    assertEquals("TEST", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithSpecialCharacters_rhsa8() {
    tradeConfigJSF.setRuntimeMode("!@#$%^&*()_+");
    assertEquals("!@#$%^&*()_+", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithLongString_ToFG9() {
    tradeConfigJSF.setRuntimeMode("This is a very long string that exceeds the maximum length of the runtime mode field");
    assertEquals("This is a very long string that exceeds the maximum length of the runtime mode field", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithInvalidCharacters_vidD10() {
    tradeConfigJSF.setRuntimeMode("This is a string with invalid characters like \u0000");
    assertEquals("This is a string with invalid characters like \u0000", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithNullAndEmptyString_QmPi11_1() {
    tradeConfigJSF.setRuntimeMode(null);
    tradeConfigJSF.setRuntimeMode("");
    assertNull(tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithNullAndEmptyString_QmPi11_2() {
    tradeConfigJSF.setRuntimeMode(null);
    tradeConfigJSF.setRuntimeMode("");
    assertEquals("", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithNullAndValidValue_eulZ12_1() {
    tradeConfigJSF.setRuntimeMode(null);
    tradeConfigJSF.setRuntimeMode("valid");
    assertNull(tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithNullAndValidValue_eulZ12_2() {
    tradeConfigJSF.setRuntimeMode(null);
    tradeConfigJSF.setRuntimeMode("valid");
    assertEquals("valid", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithEmptyStringAndValidValue_yaFF13_1() {
    tradeConfigJSF.setRuntimeMode("");
    tradeConfigJSF.setRuntimeMode("valid");
    assertEquals("", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithEmptyStringAndValidValue_yaFF13_2() {
    tradeConfigJSF.setRuntimeMode("");
    tradeConfigJSF.setRuntimeMode("valid");
    assertEquals("valid", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithNullAndInvalidValue_wDMc14_1() {
    tradeConfigJSF.setRuntimeMode(null);
    tradeConfigJSF.setRuntimeMode("invalid");
    assertNull(tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithNullAndInvalidValue_wDMc14_2() {
    tradeConfigJSF.setRuntimeMode(null);
    tradeConfigJSF.setRuntimeMode("invalid");
    assertEquals("invalid", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPopulateDatabase_rgHJ0_2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.populateDatabase();
    assertEquals(TradeConfig.getMAX_USERS(), 100);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPopulateDatabase_rgHJ0_3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.populateDatabase();
    assertEquals(TradeConfig.getMAX_QUOTES(), 1000);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuildDatabaseTables_DB2_bYib1() {
    String result = tradeConfigJSF.buildDatabaseTables();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuildDatabaseTables_Exception_Dwhr5() {
    String result = tradeConfigJSF.buildDatabaseTables();
    assertEquals("TradeBuildDB: **** Unable to check DB Product name, please check Database/AppServer configuration and retry ****<br/>", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuildDatabaseTables_NullDDLFile_sNrr7() {
    String result = tradeConfigJSF.buildDatabaseTables();
    assertEquals("TradeBuildDB: **** Unable to locate DDL file for the specified database ****<br/>", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuildDatabaseTables_ExceptionInBuildDB_wljo8() {
    String result = tradeConfigJSF.buildDatabaseTables();
    assertEquals("TradeBuildDB: **** Unable to create DayTrader Database, please check Database/AppServer configuration and retry ****<br/>", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuildDatabaseTables_ExceptionInPrintWriter_GASU9() {
    String result = tradeConfigJSF.buildDatabaseTables();
    assertEquals("TradeBuildDB: **** Unable to print DayTrader Database creation message, please check System.Out for any errors. ****<br/>", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterationsWithNullValue_RbHf5_Fqps0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    Integer primIterations = null;
    tradeConfigJSF.setPrimIterations(primIterations);
    assertEquals(primIterations, tradeConfigJSF.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsLongRun_null_BLhQ2_HGvx0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setOrderProcessingMode(null);
    assertFalse(tradeConfig.isLongRun());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsLongRun_invalid_ERMi3_Wyqu0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setOrderProcessingMode("invalid");
    assertFalse(tradeConfig.isLongRun());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryIntervalWithNullValue_rZNo5_TpYZ0() {
    tradeConfigJSF.setMarketSummaryInterval(0);
    assertEquals(0, tradeConfigJSF.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_empty_lnpW1_NXXn0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] actualRuntimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertEquals(0, actualRuntimeModeList.length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeList_kNBm0_WhVf0() {
    String[] expected = new String[]{"mode1", "mode2", "mode3"};
    when(tradeConfigJSF.getOrderProcessingModeList()).thenReturn(expected);
    String[] actual = tradeConfigJSF.getOrderProcessingModeList();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeList_empty_CIpy1_ubyN0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] expected = new String[0];
    String[] actual = tradeConfigJSF.getOrderProcessingModeList();
    assertArrayEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeList_invalid_oeAQ3_GQZn0() {
    String[] expected = new String[]{"mode1", "mode2", "mode3"};
    when(tradeConfigJSF.getOrderProcessingModeList()).thenReturn(expected);
    String[] actual = tradeConfigJSF.getOrderProcessingModeList();
    assertArrayEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryIntervalWithInvalidValue_QMaf4_dmBh0() {
    int marketSummaryInterval = -1;
    tradeConfigJSF.setMarketSummaryInterval(marketSummaryInterval);
    assertEquals(marketSummaryInterval, tradeConfigJSF.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceWithEmptyString_igSb3_zehA1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String webInterface = tradeConfigJSF.getWebInterface();
    Assertions.assertEquals("", webInterface);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceWithInvalidString_KIJa5_JdFC0() {
    String webInterface = "invalid";
    Assertions.assertNotEquals("invalid", webInterface);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceWithValidString_hdlU6_ykwY0() {
    String webInterface = "webInterface";
    Assertions.assertEquals(webInterface, tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithNull_stLC2_jPUI0() {
    String orderProcessingMode = null;
    tradeConfigJSF.setOrderProcessingMode(orderProcessingMode);
    assertNull(tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithInvalidValue_KPFu4_bzDK0() {
    String orderProcessingMode = "INVALID";
    assertNotEquals("INVALID", orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithSpecialCharacters_zRAu8_OqyC1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String orderProcessingMode = tradeConfigJSF.getOrderProcessingMode();
    assertEquals("AUTO!", orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithInvalidValueAndSpecialCharacters_fbpS13_kZDA0() {
    String orderProcessingMode = "INVALID!";
    tradeConfigJSF.setOrderProcessingMode(orderProcessingMode);
    assertNotEquals(orderProcessingMode, tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeWithMultipleValuesAndInvalidValue_PJzp16_DvoE0() {
    String orderProcessingMode = "AUTO, MANUAL, INVALID";
    assertNotEquals("AUTO, MANUAL, INVALID", orderProcessingMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeMode_QpaX1_MVnm0() {
    tradeConfigJSF.setOrderProcessingMode("test");
    assertEquals("test", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithNull_hfvv2_fOgw0() {
    tradeConfigJSF.setOrderProcessingMode(null);
    assertNull(tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithEmptyString_oqcz3_Eeob0() {
    tradeConfigJSF.setOrderProcessingMode("");
    assertEquals("", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithInvalidValue_hWbX4_FxzP0() {
    tradeConfigJSF.setOrderProcessingMode("invalid");
    assertEquals("invalid", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithValidValue_Qfku5_xtJc0() {
    tradeConfigJSF.setOrderProcessingMode("valid");
    assertEquals("valid", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithDifferentCase_NLUl6_xPYr0() {
    tradeConfigJSF.setOrderProcessingMode("TEST");
    assertEquals("TEST", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithSpecialCharacters_rhsa8_fnCl0() {
    tradeConfigJSF.setOrderProcessingMode("!@#$%^&*()_+");
    assertEquals("!@#$%^&*()_+", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithLongString_ToFG9_UHEa0() {
    tradeConfigJSF.setOrderProcessingMode("This is a very long string that exceeds the maximum length of the runtime mode field");
    assertEquals("This is a very long string that exceeds the maximum length of the runtime mode field", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceList_MHqy0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = tradeConfigJSF.getWebInterfaceList();
    assertNotNull(webInterfaceList);
    assertEquals(10, webInterfaceList.length);
    for (int i = 0; i < webInterfaceList.length; i++) {
      assertEquals("webInterface" + i, webInterfaceList[i]);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPopulateDatabase_rgHJ0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.populateDatabase();
    assertEquals("database", result);
    assertEquals(TradeConfig.getMAX_USERS(), 100);
    assertEquals(TradeConfig.getMAX_QUOTES(), 1000);
  }
}