/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeConfig_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRunTimeModeNames_WTEU0() {
    String[] expected = {"Full EJB3", "MODE2", "MODE3"}; // Assuming these are the runtime modes
    String[] actual = TradeConfig.getRunTimeModeNames();
    assertArrayEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextUserID_InitialCount_DvTb0() {
    String result = TradeConfig.nextUserID();
    assertEquals("uid:0", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeNames_uELE0() {
    String[] expected = {"Sync", "Mode2", "Mode3"}; // Example expected values
    String[] actual = TradeConfig.getOrderProcessingModeNames();
    assertArrayEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_AccessModeValid_FRKp5_KVAA0() {
    TradeConfig.setConfigParam("accessMode", "validAccessMode");
    assertEquals(0, TradeConfig.getAccessMode()); // Assuming "validAccessMode" corresponds to index5
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_AccessModeInvalid_DqsY6_wEDt0() {
    TradeConfig.setConfigParam("accessMode", "invalidAccessMode");
    assertEquals(0, TradeConfig.getAccessMode()); // Assuming default is5
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccessMode_BKEM0_fid1() {
    int expectedMode = 0; // Assuming default or a known set value for accessMode
    int actualMode = TradeConfig.getAccessMode();
    assertEquals(expectedMode, actualMode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryInterval_lDXg0_fid1() {
    int expected = 0; // Assuming default or set value for the test
    int actual = TradeConfig.getMarketSummaryInterval();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRunTimeModeNames_WTEU0_fid1() {
    String[] expected = {"MODE1", "MODE2", "MODE3"}; // Assuming these are the runtime modes
    String[] actual = TradeConfig.getRunTimeModeNames();
    assertArrayEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrimIterations_NoVd0_fid1() {
    int expected = 0; // Assuming default value of primIterations is 0
    assertEquals(expected, TradeConfig.getPrimIterations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMAX_USERS_VYiF0_fid1() {
    int expected = 100; // Assuming MAX_USERS is set to 100
    int actual = TradeConfig.getMAX_USERS();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongRun_UGVM0_fid1() {
    boolean expected = false; // Assuming default or previously set value
    boolean actual = TradeConfig.getLongRun();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPageValidIndex_dkqN0_fid1() {
    String expectedPageContent = "Expected content of page at index 0";
    assertEquals(expectedPageContent, TradeConfig.getPage(0));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetWebInterfaceNames_VRit0_fid1() {
    String[] expected = new String[]{"Interface1", "Interface2", "Interface3"};
    String[] actual = TradeConfig.getWebInterfaceNames();
    assertArrayEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUpdateQuotePrices_kNFy0_fid1() {
    boolean expected = false; // Assuming default or expected state of updateQuotePrices
    boolean actual = TradeConfig.getUpdateQuotePrices();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPublishQuotePriceChange_rsnW0_fid1() {
    boolean expected = false; // Assuming the default state of publishQuotePriceChange is false
    boolean actual = TradeConfig.getPublishQuotePriceChange();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderProcessingModeNames_uELE0_fid1() {
    String[] expected = {"Mode1", "Mode2", "Mode3"}; // Example expected values
    String[] actual = TradeConfig.getOrderProcessingModeNames();
    assertArrayEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndSymbolsWithZeroQuotes_VqWq0() {
    TradeConfig.QUOTES_PER_PAGE = 0;
    String result = TradeConfig.rndSymbols();
    assertEquals("", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUserID_RandomUser_Hnra0_fid1() {
    TradeConfig.RND_USER = true;
    String expected = TradeConfig.rndUserID();
    String actual = TradeConfig.getUserID();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUserID_NextUser_mhZk1_fid1() {
    TradeConfig.RND_USER = false;
    String expected = TradeConfig.nextUserID();
    String actual = TradeConfig.getUserID();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScenarioCount_bjGz0_fid1() {
    int expectedCount = 0; // Assuming default scenario count is 0
    assertEquals(expectedCount, TradeConfig.getScenarioCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextUserID_WrapAround_ffAi1_vzCZ0_fid1() {
    final int MAX_USERS = 1000; // Assuming MAX_USERS is defined here as it was not defined earlier
    for (int i = 0; i < MAX_USERS; i++) {
      TradeConfig.nextUserID(); // Increment userID_count to MAX_USERS
    }
    String result = TradeConfig.nextUserID();
    assertEquals("uid:0", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_WebInterfaceInvalid_KPOX8_rlkO0() {
    TradeConfig.setConfigParam("WebInterface", "invalidInterface");
    assertEquals(0, TradeConfig.getWebInterface()); // Using getter method to access private field
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_PrimIterationsInvalid_tOfl14_pUrf0_fid1() {
    TradeConfig.setConfigParam("primIterations", "notAnInteger");
    assertEquals(0, TradeConfig.getPrimIterations()); // Assuming default is 0
  }
}