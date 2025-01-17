/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.util.concurrent.TimeUnit;
import javax.faces.context.ExternalContext;
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
  TradeConfigJSF tradeConfig = new TradeConfigJSF();
  private TradeConfigJSF tradeConfigJSF;
  private ExternalContext context;
  private String result = "";

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryInterval_lGae0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int marketSummaryInterval = tradeConfigJSF.getMarketSummaryInterval();
    assertEquals(20, marketSummaryInterval);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsLongRun_ziez0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    boolean result = tradeConfigJSF.isLongRun();
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceList_tRpa0_1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = tradeConfigJSF.getWebInterfaceList();
    assertNotNull(webInterfaceList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceList_tRpa0_2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = tradeConfigJSF.getWebInterfaceList();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_SzxA0() {
    tradeConfigJSF = new TradeConfigJSF();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsPublishQuotePriceChange_pRGQ0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    assertTrue(tradeConfigJSF.isPublishQuotePriceChange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsPublishQuotePriceChange_False_YCBP1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setPublishQuotePriceChange(false);
    assertFalse(tradeConfigJSF.isPublishQuotePriceChange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLongRun_EbwI0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setLongRun(true);
    assertTrue(tradeConfigJSF.isLongRun());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLongRunFalse_ZsfJ1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setLongRun(false);
    assertFalse(tradeConfigJSF.isLongRun());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResult_LqMp0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("success");
    assertEquals("success", tradeConfigJSF.getResult());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMaxUsers_dzsG0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    int maxUsers = 10;
    tradeConfig.setMaxUsers(maxUsers);
    assertEquals(maxUsers, tradeConfig.getMaxUsers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceList_pZzK0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = new String[]{"web1", "web2", "web3"};
    tradeConfigJSF.setWebInterfaceList(webInterfaceList);
    assertEquals(webInterfaceList, tradeConfigJSF.getWebInterfaceList());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceListWithNull_CLKC1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = null;
    tradeConfigJSF.setWebInterfaceList(webInterfaceList);
    assertNull(tradeConfigJSF.getWebInterfaceList());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceListWithEmptyArray_Dowa2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = new String[]{};
    tradeConfigJSF.setWebInterfaceList(webInterfaceList);
    assertEquals(0, tradeConfigJSF.getWebInterfaceList().length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceListWithInvalidValues_RWbw4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = new String[]{"web1", "web2", "web3"};
    tradeConfigJSF.setWebInterfaceList(webInterfaceList);
    assertEquals(3, tradeConfigJSF.getWebInterfaceList().length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeList_WioB0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] orderProcessingModeList = new String[]{"mode1", "mode2"};
    tradeConfigJSF.setOrderProcessingModeList(orderProcessingModeList);
    assertEquals(orderProcessingModeList, tradeConfigJSF.getOrderProcessingModeList());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeListWithNull_HnhB1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingModeList(null);
    assertNull(tradeConfigJSF.getOrderProcessingModeList());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeListWithEmptyList_Mfvx2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingModeList(new String[]{});
    assertEquals(0, tradeConfigJSF.getOrderProcessingModeList().length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_KrLD0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setPrimIterations(10);
    Assertions.assertEquals(10, tradeConfigJSF.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterationsWithNegativeValue_Hsjb1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setPrimIterations(-10);
    Assertions.assertEquals(-10, tradeConfigJSF.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterationsWithZeroValue_QQzV2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setPrimIterations(0);
    Assertions.assertEquals(0, tradeConfigJSF.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterationsWithLargeValue_XydA3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setPrimIterations(1000);
    Assertions.assertEquals(1000, tradeConfigJSF.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeWithInvalidString_SXZL3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String runtimeMode = tradeConfigJSF.getRuntimeMode();
    assertNotEquals("invalid", runtimeMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryInterval_CxGa0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int marketSummaryInterval = 10;
    tradeConfigJSF.setMarketSummaryInterval(marketSummaryInterval);
    assertEquals(marketSummaryInterval, tradeConfigJSF.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryIntervalWithZeroValue_dQUS2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int marketSummaryInterval = 0;
    tradeConfigJSF.setMarketSummaryInterval(marketSummaryInterval);
    assertEquals(0, tradeConfigJSF.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryIntervalWithMaxValue_lPBA3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int marketSummaryInterval = Integer.MAX_VALUE;
    tradeConfigJSF.setMarketSummaryInterval(marketSummaryInterval);
    assertEquals(Integer.MAX_VALUE, tradeConfigJSF.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryIntervalWithMinValue_wJQi4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int marketSummaryInterval = Integer.MIN_VALUE;
    tradeConfigJSF.setMarketSummaryInterval(marketSummaryInterval);
    assertEquals(Integer.MIN_VALUE, tradeConfigJSF.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeList_Rpha0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] runtimeModeList = new String[]{"mode1", "mode2"};
    tradeConfigJSF.setRuntimeModeList(runtimeModeList);
    assertEquals(runtimeModeList, tradeConfigJSF.getRuntimeModeList());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeListWithNull_sajQ1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setRuntimeModeList(null);
    assertNull(tradeConfigJSF.getRuntimeModeList());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuildDatabaseTables_DB2_eFpb0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.buildDatabaseTables();
    assertEquals("database", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetListQuotePriceChangeFrequency_Ewrm0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int listQuotePriceChangeFrequency = 10;
    tradeConfigJSF.setListQuotePriceChangeFrequency(listQuotePriceChangeFrequency);
    assertEquals(listQuotePriceChangeFrequency, tradeConfigJSF.getListQuotePriceChangeFrequency());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeMode_oLcf0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setRuntimeMode("dev");
    assertEquals("dev", tradeConfig.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithNull_oZaC1() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setRuntimeMode(null);
    assertEquals(null, tradeConfig.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithEmptyString_ItdR2() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setRuntimeMode("");
    assertEquals("", tradeConfig.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithValidValue_flrK4() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setRuntimeMode("prod");
    assertEquals("prod", tradeConfig.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeWithMultipleValues_OAOV7() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setRuntimeMode("dev,prod");
    assertEquals("dev,prod", tradeConfig.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterface_MGhC0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("webInterface");
    assertEquals("webInterface", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceNull_UWxM1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface(null);
    assertNull(tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceEmpty_vCbR2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("");
    assertEquals("", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceInvalid_mNEq3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("invalid");
    assertEquals("invalid", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceValid_reTd4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("valid");
    assertEquals("valid", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceDifferentCase_fSqd5() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("WEBINTERFACE");
    assertEquals("WEBINTERFACE", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceDifferentCase2_jkHb6() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("webinterface");
    assertEquals("webinterface", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceDifferentCase3_qBCb7() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("WebInterface");
    assertEquals("WebInterface", tradeConfigJSF.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceWithInvalidString_wrOe3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String webInterface = tradeConfigJSF.getWebInterface();
    assertNotEquals("invalid", webInterface);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingMode_snVQ0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("test");
    assertEquals("test", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeWithNull_YVMT1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode(null);
    assertEquals(null, tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeWithEmptyString_nbZS2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("");
    assertEquals("", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeWithInvalidString_hIZZ3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("invalid");
    assertEquals("invalid", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeWithValidString_EEwB4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("valid");
    assertEquals("valid", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeWithDifferentCases_Gawk5() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("TEST");
    assertEquals("TEST", tradeConfigJSF.getOrderProcessingMode());
    tradeConfigJSF.setOrderProcessingMode("test");
    assertEquals("test", tradeConfigJSF.getOrderProcessingMode());
    tradeConfigJSF.setOrderProcessingMode("TeSt");
    assertEquals("TeSt", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeWithDifferentLengths_QQCv6() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("test");
    assertEquals("test", tradeConfigJSF.getOrderProcessingMode());
    tradeConfigJSF.setOrderProcessingMode("testtest");
    assertEquals("testtest", tradeConfigJSF.getOrderProcessingMode());
    tradeConfigJSF.setOrderProcessingMode("testtesttest");
    assertEquals("testtesttest", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeWithDifferentCharacters_TIrC7() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("test");
    assertEquals("test", tradeConfigJSF.getOrderProcessingMode());
    tradeConfigJSF.setOrderProcessingMode("test1");
    assertEquals("test1", tradeConfigJSF.getOrderProcessingMode());
    tradeConfigJSF.setOrderProcessingMode("test2");
    assertEquals("test2", tradeConfigJSF.getOrderProcessingMode());
    tradeConfigJSF.setOrderProcessingMode("test3");
    assertEquals("test3", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_COqh0_1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertNotNull(runtimeModeList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeModeList_COqh0_2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertEquals(3, runtimeModeList.length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_xQnf0() {
    tradeConfig = new TradeConfigJSF();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetListQuotePriceChangeFrequencyWithDifferentFrequency_bFwQ2() {
    int frequency = tradeConfig.getListQuotePriceChangeFrequency();
    Assertions.assertNotEquals(5, frequency);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetListQuotePriceChangeFrequencyWithInvalidFrequency_RXWA4() {
    int frequency = tradeConfig.getListQuotePriceChangeFrequency();
    Assertions.assertNotEquals(0, frequency);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetListQuotePriceChangeFrequencyWithNegativeFrequency_CaZG5() {
    int frequency = tradeConfig.getListQuotePriceChangeFrequency();
    Assertions.assertNotEquals(-1, frequency);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetListQuotePriceChangeFrequencyWithNonIntegerFrequency_qxbo10() {
    int frequency = tradeConfig.getListQuotePriceChangeFrequency();
    Assertions.assertNotEquals(1.5, frequency);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetListQuotePriceChangeFrequencyWithNonNumericFrequency_BKFc11() {
    int frequency = tradeConfig.getListQuotePriceChangeFrequency();
    Assertions.assertNotEquals("abc", frequency);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeWithDifferentCases_Gawk5_3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("TEST");
    tradeConfigJSF.setOrderProcessingMode("test");
    tradeConfigJSF.setOrderProcessingMode("TeSt");
    assertEquals("TeSt", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeWithDifferentLengths_QQCv6_3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("test");
    tradeConfigJSF.setOrderProcessingMode("testtest");
    tradeConfigJSF.setOrderProcessingMode("testtesttest");
    assertEquals("testtesttest", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeWithDifferentCharacters_TIrC7_4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("test");
    tradeConfigJSF.setOrderProcessingMode("test1");
    tradeConfigJSF.setOrderProcessingMode("test2");
    tradeConfigJSF.setOrderProcessingMode("test3");
    assertEquals("test3", tradeConfigJSF.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryIntervalWithNullObject_KJui7_NDgC0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setMarketSummaryInterval(0);
    assertEquals(0, tradeConfigJSF.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetListQuotePriceChangeFrequencyWithZeroFrequency_ZNvE8_OqoK0() {
    int frequency = 0;
    Assertions.assertEquals(0, frequency);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetListQuotePriceChangeFrequencyWithNullFrequencyAndNonZeroFrequency_AfbQ12_qlbV0_1() {
    int frequency = tradeConfig.getListQuotePriceChangeFrequency();
    Assertions.assertNotNull(frequency);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeWithDifferentTypes_yBre8_rCPy0_3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("test");
    tradeConfigJSF.setOrderProcessingMode("1");
    tradeConfigJSF.setOrderProcessingMode("1.0");
    tradeConfigJSF.setOrderProcessingMode("true");
    tradeConfigJSF.setOrderProcessingMode("1.0");
    assertEquals("1.0", tradeConfigJSF.getOrderProcessingMode());
  }
}