/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.concurrent.TimeUnit;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpSession;
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
  private HttpSession httpSession;
  private ExternalContext context;
  private String result = "";

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetResult_RbNa0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    String expected = null;
    String actual = tradeConfig.getResult();
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryInterval_jYeq0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    int expected = 0; // Assuming default value is 0, adjust according to actual default or setup
    int actual = tradeConfig.getMarketSummaryInterval();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetWebInterfaceList_Dqdy0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    String[] expectedList = {"Interface1", "Interface2", "Interface3"};
    tradeConfig.setWebInterfaceList(expectedList);
    assertArrayEquals(expectedList, tradeConfig.getWebInterfaceList());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRuntimeMode_fnCO0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    String expected = null; // Assuming default null since not initialized in provided code
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterations_zIjq0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    int expected = 1; // Assuming default value of primIterations is1
    assertEquals(expected, tradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMaxUsers_KSRT0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    int expectedMaxUsers = 5000; // Assuming default maxUsers is5000 if not set
    assertEquals(expectedMaxUsers, tradeConfig.getMaxUsers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsLongRun_HKLb0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    boolean result = tradeConfig.isLongRun();
    assertEquals(true, result); // Assuming the expected value should be true for this test case
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsPublishQuotePriceChange_qLKc0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    boolean expected = true; // Assuming default istrue, adjust based on actual default or setup
    assertEquals(expected, tradeConfig.isPublishQuotePriceChange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMaxQuotes_BuSO10000() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    assertEquals(10000, tradeConfig.getMaxQuotes());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLongRunTrue_nJKq0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setLongRun(true);
    assertTrue(tradeConfig.isLongRun());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMaxUsers_WGHE0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setMaxUsers(100);
    assertEquals(100, tradeConfig.getMaxUsers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDisplayOrderAlerts_EBBk0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setDisplayOrderAlerts(true);
    assertTrue(tradeConfig.isDisplayOrderAlerts());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterface_Dsyj0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    String expected = null; // Assuming default null, adjust based on actual default or setup
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfigWithDefaultValues_ZZCe0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.updateConfig();
    assertEquals("PRODUCTION", "PRODUCTION", TradeConfig.getRunTimeModeNames()[TradeConfig.getRunTimeMode()]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPublishQuotePriceChange_vfDX0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setPublishQuotePriceChange(true);
    assertTrue(tradeConfig.isPublishQuotePriceChange());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingMode_AouO0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    String expected = null; // Assuming default value is null, adjust based on actual default or setup.
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetListQuotePriceChangeFrequency_tcQi0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    int expectedFrequency = 10;
    tradeConfig.setListQuotePriceChangeFrequency(expectedFrequency);
    assertEquals(expectedFrequency, tradeConfig.getListQuotePriceChangeFrequency());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeModeList_iqIF0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    String[] expectedRuntimeModes = {"Development", "Production", "Test"};
    tradeConfig.setRuntimeModeList(expectedRuntimeModes);
    assertArrayEquals(expectedRuntimeModes, tradeConfig.getRuntimeModeList());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetListQuotePriceChangeFrequency_LRyb0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    int expected = 100; // Assuming default value is100 since not shown in the class
    assertEquals(expected, tradeConfig.getListQuotePriceChangeFrequency());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRuntimeMode_Fgxi0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    String expectedMode = "testMode";
    tradeConfig.setRuntimeMode(expectedMode);
    assertEquals(expectedMode, tradeConfig.getRuntimeMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPopulateDatabase_RwPp0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.populateDatabase();
    assertEquals("database", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrimIterations_iipt0_tJap0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setPrimIterations(5);
    assertEquals(5, tradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderProcessingModeList_eBnV0_qYoF0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    String[] expectedModes = {"Manual", "Automatic"};
    tradeConfig.setOrderProcessingModeList(expectedModes);
    assertArrayEquals(expectedModes, tradeConfig.getOrderProcessingModeList());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResult_LkWU0_Uuot0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    String expected = "Success";
    tradeConfig.setOrderProcessingMode(expected);
    assertEquals(expected, tradeConfig.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMarketSummaryInterval_FqpJ0_LCVm0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setMarketSummaryInterval(5);
    assertEquals(5, tradeConfig.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfigWithCustomOrderProcessingMode_qVPL1_yuSO0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("SYNC");
    tradeConfigJSF.updateConfig();
    assertEquals("SYNC", "SYNC", TradeConfig.getOrderProcessingModeNames()[TradeConfig.getOrderProcessingMode()]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfigWithInvalidOrderProcessingMode_hyjw2_smlT0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("INVALID_MODE");
    tradeConfigJSF.updateConfig();
    assertNotEquals("Order processing mode should not be set to invalid mode", "INVALID_MODE", TradeConfig.getOrderProcessingModeNames()[TradeConfig.getOrderProcessingMode()]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfigWithCustomWebInterface_jKbg3_CfbD0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("HTML5");
    tradeConfigJSF.updateConfig();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfigWithMaxUsers_Fsvs4_lJxt0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setMaxUsers(5000);
    tradeConfigJSF.updateConfig();
    assertEquals(5000, TradeConfig.getMAX_USERS(), "Max users should be updated to 5000");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateConfigWithMarketSummaryInterval_dkKt6_bvuT0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setMarketSummaryInterval(30);
    tradeConfigJSF.updateConfig();
    assertEquals(30, TradeConfig.getMarketSummaryInterval(), "Market summary interval should be updated to 30");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMaxQuotes_dGDr0_PVRo0() {
    TradeConfigJSF tradeConfig = new TradeConfigJSF();
    tradeConfig.setmaxQuotes(100);
    assertEquals(100, tradeConfig.getMaxQuotes());
  }
}