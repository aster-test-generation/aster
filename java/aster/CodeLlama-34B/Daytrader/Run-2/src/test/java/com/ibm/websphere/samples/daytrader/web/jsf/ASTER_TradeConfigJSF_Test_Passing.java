/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.util.concurrent.TimeUnit;
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
  private TradeConfigJSF tradeConfigJSF;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_SEOp0_1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertNotNull(runtimeModeList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_SEOp0_2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertEquals(3, runtimeModeList.length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_SEOp0_3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertEquals("Full EJB3", runtimeModeList[0]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_SEOp0_4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryIntervalWithDifferentValue_qhNW1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setMarketSummaryInterval(5);
    int marketSummaryInterval = tradeConfigJSF.getMarketSummaryInterval();
    assertEquals(5, marketSummaryInterval);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeWithInvalidString_zLAx3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String runtimeMode = tradeConfigJSF.getRuntimeMode();
    assertNotEquals("invalid", runtimeMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_SGKL0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int primIterations = 10;
    tradeConfigJSF.setPrimIterations(primIterations);
    assertEquals(primIterations, tradeConfigJSF.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterations_lLpC0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int primIterations = tradeConfigJSF.getPrimIterations();
    assertEquals(100, primIterations);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_uhJw0() {
    tradeConfigJSF = new TradeConfigJSF();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsLongRun_True_DvCo0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setLongRun(true);
    assertTrue(tradeConfig.isLongRun());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsLongRun_False_AXgW1() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setLongRun(false);
    assertFalse(tradeConfig.isLongRun());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsPublishQuotePriceChange_RunP0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    boolean result = tradeConfigJSF.isPublishQuotePriceChange();
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeList_kBMK0_1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] orderProcessingModeList = tradeConfigJSF.getOrderProcessingModeList();
    assertNotNull(orderProcessingModeList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeList_kBMK0_2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] orderProcessingModeList = tradeConfigJSF.getOrderProcessingModeList();
    assertEquals(3, orderProcessingModeList.length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeList_PHhL0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] orderProcessingModeList = new String[]{"mode1", "mode2", "mode3"};
    tradeConfigJSF.setOrderProcessingModeList(orderProcessingModeList);
    assertEquals(orderProcessingModeList, tradeConfigJSF.getOrderProcessingModeList());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeListWithEmptyArray_fkIk1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] orderProcessingModeList = new String[]{};
    tradeConfigJSF.setOrderProcessingModeList(orderProcessingModeList);
    assertEquals(orderProcessingModeList, tradeConfigJSF.getOrderProcessingModeList());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterface_MVQV0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("webInterface");
    assertEquals("webInterface", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithNull_aRlu1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface(null);
    assertNull(tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithEmptyString_spoX2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("");
    assertEquals("", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithInvalidString_tEWB3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("invalidString");
    assertEquals("invalidString", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithValidString_miLL4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("validString");
    assertEquals("validString", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithDifferentCases_Adff5_3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("WebInterface");
    tradeConfigJSF.setWebInterface("webinterface");
    tradeConfigJSF.setWebInterface("WEBINTERFACE");
    assertEquals("WEBINTERFACE", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithSpecialCharacters_Vvpf6_3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("web-interface");
    tradeConfigJSF.setWebInterface("web_interface");
    tradeConfigJSF.setWebInterface("web.interface");
    assertEquals("web.interface", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithMultipleWords_VZjf7_3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("web interface");
    tradeConfigJSF.setWebInterface("web-interface");
    tradeConfigJSF.setWebInterface("web_interface");
    assertEquals("web_interface", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithInvalidCharacters_YFsl8_3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("web$interface");
    tradeConfigJSF.setWebInterface("web interface");
    tradeConfigJSF.setWebInterface("web-interface");
    assertEquals("web-interface", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResult_UPKb0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("success");
    assertEquals("success", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithNull_khAB1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult(null);
    assertNull(tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithEmptyString_jhqW2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("");
    assertEquals("", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithInvalidString_BayX3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("invalid");
    assertEquals("invalid", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithDifferentCase_JDRC5() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("SuCcEsS");
    assertEquals("SuCcEsS", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithSpecialCharacters_LHEM7() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("success!");
    assertEquals("success!", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithMultipleWords_ityu8() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("success success");
    assertEquals("success success", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithNullAndEmptyString_GQuO10_2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult(null);
    tradeConfigJSF.setResult("");
    assertEquals("", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithInvalidAndEmptyString_pcho11_2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("invalid");
    tradeConfigJSF.setResult("");
    assertEquals("", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithValidAndEmptyString_SomR12_2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("success");
    tradeConfigJSF.setResult("");
    assertEquals("", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithDifferentCaseAndEmptyString_WUmv13() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("SuCcEsS");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMaxUsers_ApWs0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setMaxUsers(10);
    assertEquals(10, tradeConfig.getMaxUsers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMaxUsersWithZeroValue_pdjT2() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setMaxUsers(0);
    assertEquals(0, tradeConfig.getMaxUsers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMaxUsersWithLargeValue_RXcm3() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setMaxUsers(1000);
    assertEquals(1000, tradeConfig.getMaxUsers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryInterval_LOIf0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int marketSummaryInterval = 10;
    tradeConfigJSF.setMarketSummaryInterval(marketSummaryInterval);
    assertEquals(marketSummaryInterval, tradeConfigJSF.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceWithNonEmptyString_sxqB3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String webInterface = tradeConfigJSF.getWebInterface();
    assertNotEquals("", webInterface);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceWithInvalidString_mzpM4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String webInterface = tradeConfigJSF.getWebInterface();
    assertNotEquals("invalid", webInterface);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsDisplayOrderAlerts_DARw0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    assertTrue(tradeConfigJSF.isDisplayOrderAlerts());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsDisplayOrderAlertsTrueAndNotNull_zYvk4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setDisplayOrderAlerts(true);
    assertTrue(tradeConfigJSF.isDisplayOrderAlerts());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsDisplayOrderAlertsFalseAndNotNull_RoxE5() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setDisplayOrderAlerts(false);
    assertFalse(tradeConfigJSF.isDisplayOrderAlerts());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeMode_RmjS0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setRuntimeMode("DEV");
    assertEquals("DEV", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithNull_LNRM1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setRuntimeMode(null);
    assertNull(tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithEmptyString_XEdP2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setRuntimeMode("");
    assertEquals("", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithInvalidValue_XXXQ3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setRuntimeMode("INVALID");
    assertEquals("INVALID", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithValidValue_nFYK4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setRuntimeMode("PROD");
    assertEquals("PROD", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithDifferentCase_dHzD5() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setRuntimeMode("dev");
    assertEquals("dev", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithSpecialCharacters_dgwj7() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setRuntimeMode("dev!");
    assertEquals("dev!", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithMultipleValues_EZrV8() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setRuntimeMode("dev,prod");
    assertEquals("dev,prod", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithMultipleValuesAndSpecialCharacters_bYmC10() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setRuntimeMode("dev,prod!");
    assertEquals("dev,prod!", tradeConfigJSF.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPopulateDatabase_posy0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.populateDatabase();
    assertEquals("database", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuildDatabaseTables_DB2_IgAF0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.buildDatabaseTables();
    assertEquals("database", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_qQca1_GgrW0_6() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int primIterations = 10;
    tradeConfigJSF.setPrimIterations(primIterations);
    tradeConfigJSF.setPrimIterations(0);
    tradeConfigJSF.setPrimIterations(1);
    tradeConfigJSF.setPrimIterations(-1);
    tradeConfigJSF.setPrimIterations(Integer.MAX_VALUE + 1);
    tradeConfigJSF.setPrimIterations(Integer.MIN_VALUE - 1);
    assertEquals(Integer.MIN_VALUE - 1, tradeConfigJSF.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsPublishQuotePriceChangeWithNullParameter_gFdr1_CdRr0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setPublishQuotePriceChange(false);
    boolean result = tradeConfigJSF.isPublishQuotePriceChange();
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithDifferentTypes_BNBn9_Nuom0_4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("success");
    tradeConfigJSF.setResult("123");
    tradeConfigJSF.setResult("true");
    tradeConfigJSF.setResult("false");
    assertEquals("false", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeListWithEmptyArray_ZcUM2_oQtb0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setRuntimeModeList(new String[0]);
    assertEquals(0, tradeConfigJSF.getRuntimeModeList().length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithDifferentCases_Adff5() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("WebInterface");
    assertEquals("WebInterface", tradeConfigJSF.getWebInterface());
    tradeConfigJSF.setWebInterface("webinterface");
    assertEquals("webinterface", tradeConfigJSF.getWebInterface());
    tradeConfigJSF.setWebInterface("WEBINTERFACE");
    assertEquals("WEBINTERFACE", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithSpecialCharacters_Vvpf6() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("web-interface");
    assertEquals("web-interface", tradeConfigJSF.getWebInterface());
    tradeConfigJSF.setWebInterface("web_interface");
    assertEquals("web_interface", tradeConfigJSF.getWebInterface());
    tradeConfigJSF.setWebInterface("web.interface");
    assertEquals("web.interface", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithMultipleWords_VZjf7() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("web interface");
    assertEquals("web interface", tradeConfigJSF.getWebInterface());
    tradeConfigJSF.setWebInterface("web-interface");
    assertEquals("web-interface", tradeConfigJSF.getWebInterface());
    tradeConfigJSF.setWebInterface("web_interface");
    assertEquals("web_interface", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceWithInvalidCharacters_YFsl8() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("web$interface");
    assertEquals("web$interface", tradeConfigJSF.getWebInterface());
    tradeConfigJSF.setWebInterface("web interface");
    assertEquals("web interface", tradeConfigJSF.getWebInterface());
    tradeConfigJSF.setWebInterface("web-interface");
    assertEquals("web-interface", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithNullAndEmptyString_GQuO10() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult(null);
    assertNull(tradeConfigJSF.getResult());
    tradeConfigJSF.setResult("");
    assertEquals("", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithInvalidAndEmptyString_pcho11() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("invalid");
    assertEquals("invalid", tradeConfigJSF.getResult());
    tradeConfigJSF.setResult("");
    assertEquals("", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResultWithValidAndEmptyString_SomR12() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("success");
    assertEquals("success", tradeConfigJSF.getResult());
    tradeConfigJSF.setResult("");
    assertEquals("", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetListQuotePriceChangeFrequency_uTRX0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int listQuotePriceChangeFrequency = 10;
    tradeConfigJSF.setListQuotePriceChangeFrequency(listQuotePriceChangeFrequency);
    assertEquals(listQuotePriceChangeFrequency, tradeConfigJSF.getListQuotePriceChangeFrequency());
  }
}