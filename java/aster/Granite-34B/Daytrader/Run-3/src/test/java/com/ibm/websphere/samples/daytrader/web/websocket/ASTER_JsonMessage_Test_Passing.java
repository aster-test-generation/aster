/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JsonMessage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetKey_rJWG0() {
    JsonMessage jsonMessage = new JsonMessage();
    String key = jsonMessage.getKey();
    assertEquals(key, jsonMessage.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetKeyCoverage_ihjg1() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.getKey();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValue_YGHQ0() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("testValue");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithNull_gKOs1() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithEmptyValue_maPz2() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithSpecialCharacters_nPNP4() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("!@#$%^&*()_+");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithUnicodeCharacters_zQUI5() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("Hello, , ");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithMaximumLength_VLLg6() {
    JsonMessage jsonMessage = new JsonMessage();
    String longString = "ThisIsAVeryLongStringThatExceedsTheMaximumLengthOfTheValueField";
    jsonMessage.setValue(longString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithMinimumLength_tyLE7() {
    JsonMessage jsonMessage = new JsonMessage();
    String shortString = "ThisIsAShortString";
    jsonMessage.setValue(shortString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithCustomLength_ytwg8() {
    JsonMessage jsonMessage = new JsonMessage();
    String customLengthString = "ThisStringHasACustomLength";
    jsonMessage.setValue(customLengthString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithNegativeLength_hTpb9() {
    JsonMessage jsonMessage = new JsonMessage();
    String negativeLengthString = "ThisStringHasANegativeLength";
    jsonMessage.setValue(negativeLengthString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithZeroLength_lYDo10() {
    JsonMessage jsonMessage = new JsonMessage();
    String zeroLengthString = "ThisStringHasZeroLength";
    jsonMessage.setValue(zeroLengthString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithInvalidType_zedU11_TQbx0() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("123");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithInvalidObject_mVsO13_jJMu0() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithInvalidValue_HWhZ12_NBna0() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("true");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getValueTest_lGSL0_sABG0() {
    JsonMessage jsonMessage = new JsonMessage();
    String expected = "expected";
    jsonMessage.setValue(expected);
    String actual = jsonMessage.getValue();
    Assertions.assertEquals(expected, actual);
  }
}