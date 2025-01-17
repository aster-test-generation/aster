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

public class Aster_TradeConfig_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScenarioAction1_AaCK0() {
    boolean newUser = true;
    char action = TradeConfig.getScenarioAction(newUser);
    assertNotEquals('s', action);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScenarioAction3_qHpi2() {
    boolean newUser = false;
    char action = TradeConfig.getScenarioAction(newUser);
    assertNotEquals('s', action);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScenarioAction4_CrLn3() {
    boolean newUser = false;
    int sellDeficit = 0;
    char action = TradeConfig.getScenarioAction(newUser);
    assertNotEquals('s', action);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScenarioAction6_aMcW5() {
    boolean newUser = false;
    int sellDeficit = -1;
    char action = TradeConfig.getScenarioAction(newUser);
    assertNotEquals('s', action);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_NullHostname_pyUK0_1() {
    String expectedHostname = "localhost";
    String expectedPrefix = "newUserPrefix";
    long currentTime = System.currentTimeMillis();
    int expectedCount = 0;
    String actualUserID = TradeConfig.rndNewUserID();
    Assertions.assertFalse(actualUserID.startsWith(expectedPrefix));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_NullHostname_pyUK0_2() {
    String expectedHostname = "localhost";
    String expectedPrefix = "newUserPrefix";
    long currentTime = System.currentTimeMillis();
    int expectedCount = 0;
    String actualUserID = TradeConfig.rndNewUserID();
    Assertions.assertFalse(actualUserID.contains(expectedHostname));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_NullHostname_pyUK0_3() {
    String expectedHostname = "localhost";
    String expectedPrefix = "newUserPrefix";
    long currentTime = System.currentTimeMillis();
    int expectedCount = 0;
    String actualUserID = TradeConfig.rndNewUserID();
    Assertions.assertTrue(actualUserID.contains(String.valueOf(currentTime)));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_NullHostname_pyUK0_4() {
    String expectedHostname = "localhost";
    String expectedPrefix = "newUserPrefix";
    long currentTime = System.currentTimeMillis();
    int expectedCount = 0;
    String actualUserID = TradeConfig.rndNewUserID();
    Assertions.assertTrue(actualUserID.contains(String.valueOf(expectedCount)));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_NonNullHostname_UcFP1_1() {
    String expectedHostname = "testHostname";
    String expectedPrefix = "newUserPrefix";
    long currentTime = System.currentTimeMillis();
    int expectedCount = 0;
    String actualUserID = TradeConfig.rndNewUserID();
    Assertions.assertFalse(actualUserID.startsWith(expectedPrefix));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_NonNullHostname_UcFP1_2() {
    String expectedHostname = "testHostname";
    String expectedPrefix = "newUserPrefix";
    long currentTime = System.currentTimeMillis();
    int expectedCount = 0;
    String actualUserID = TradeConfig.rndNewUserID();
    Assertions.assertFalse(actualUserID.contains(expectedHostname));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_NonNullHostname_UcFP1_3() {
    String expectedHostname = "testHostname";
    String expectedPrefix = "newUserPrefix";
    long currentTime = System.currentTimeMillis();
    int expectedCount = 0;
    String actualUserID = TradeConfig.rndNewUserID();
    Assertions.assertTrue(actualUserID.contains(String.valueOf(currentTime)));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_NonNullHostname_UcFP1_4() {
    String expectedHostname = "testHostname";
    String expectedPrefix = "newUserPrefix";
    long currentTime = System.currentTimeMillis();
    int expectedCount = 0;
    String actualUserID = TradeConfig.rndNewUserID();
    Assertions.assertTrue(actualUserID.contains(String.valueOf(expectedCount)));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomPriceChangeFactor_LessThanZero_bdMu0() {
    BigDecimal percentGainBD = TradeConfig.getRandomPriceChangeFactor();
    Assertions.assertTrue(percentGainBD.doubleValue() > 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_NullParm_MOlY0() {
    TradeConfig.setConfigParam(null, "value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_EmptyParm_ding1() {
    TradeConfig.setConfigParam("", "value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_NullValue_oxGe2() {
    TradeConfig.setConfigParam("parm", null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_EmptyValue_FRdC3() {
    TradeConfig.setConfigParam("parm", "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_InvalidParm_LIpa4() {
    TradeConfig.setConfigParam("invalidParm", "value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_OrderProcessingMode_NRde5() {
    TradeConfig.setConfigParam("orderProcessingMode", "value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_AccessMode_qeIn6() {
    TradeConfig.setConfigParam("accessMode", "value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_WebInterface_caRD7() {
    TradeConfig.setConfigParam("WebInterface", "value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_MaxUsers_esNl8() {
    TradeConfig.setConfigParam("maxUsers", "value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_MaxQuotes_Tzzk9() {
    TradeConfig.setConfigParam("maxQuotes", "value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_PrimIterations_HSdy10() {
    TradeConfig.setConfigParam("primIterations", "value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_Logging_XAKH11() {
    TradeConfig.setConfigParam("parm", "value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_ValidParmAndInvalidValue_Uqrl18() {
    TradeConfig.setConfigParam("parm", "invalidValue");
  }
}