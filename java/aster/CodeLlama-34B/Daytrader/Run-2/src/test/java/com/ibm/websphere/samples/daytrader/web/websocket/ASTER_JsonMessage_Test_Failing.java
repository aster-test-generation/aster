/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JsonMessage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithNullAndEmptyString_rzFs6_1() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue(null);
    jsonMessage.setValue("");
    assertNull(jsonMessage.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithNullAndEmptyStringAndInvalidValue_bvGe9_1() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue(null);
    jsonMessage.setValue("");
    jsonMessage.setValue("invalidValue");
    assertNull(jsonMessage.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetKey_invalidString_UZIO3() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setKey("not equal");
    assertNotEquals("not equal", jsonMessage.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetValue_EmptyString_qfoZ0_fid2() {
    JsonMessage jsonMessage = new JsonMessage();
    String value = jsonMessage.getValue();
    assertEquals("", value);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithInvalidAndValidValue_AXHr7_1_fid2() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("invalidValue");
    jsonMessage.setValue("validValue");
    assertEquals("invalidValue", jsonMessage.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithNullAndEmptyStringAndInvalidValue_bvGe9_2() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue(null);
    jsonMessage.setValue("");
    jsonMessage.setValue("invalidValue");
    assertEquals("", jsonMessage.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetKey_invalidString_UZIO3_fid2() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setKey("invalid_key");
    assertNotEquals("invalid_key", jsonMessage.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithDifferentTypesAndNull_jxav8_QGPY0_1_fid2() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("1");
    jsonMessage.setValue("1.0");
    jsonMessage.setValue("true");
    jsonMessage.setValue(new Object().toString());
    jsonMessage.setValue(null);
    assertEquals("1", jsonMessage.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithDifferentTypesAndNull_jxav8_QGPY0_2() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("1");
    jsonMessage.setValue("1.0");
    jsonMessage.setValue("true");
    jsonMessage.setValue(new Object().toString());
    jsonMessage.setValue(null);
    assertEquals("1.0", jsonMessage.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithDifferentTypesAndNull_jxav8_QGPY0_3() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("1");
    jsonMessage.setValue("1.0");
    jsonMessage.setValue("true");
    jsonMessage.setValue(new Object().toString());
    jsonMessage.setValue(null);
    assertEquals("true", jsonMessage.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithDifferentTypesAndNull_jxav8_QGPY0_4() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("1");
    jsonMessage.setValue("1.0");
    jsonMessage.setValue("true");
    jsonMessage.setValue(new Object().toString());
    jsonMessage.setValue(null);
    assertEquals(new Object().toString(), jsonMessage.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithValidValueAndDifferentTypes_Qdaj10_nQZC0_1() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("validValue");
    jsonMessage.setValue("1");
    jsonMessage.setValue("1.0");
    jsonMessage.setValue("true");
    jsonMessage.setValue(new Object().toString());
    assertEquals("validValue", jsonMessage.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithValidValueAndDifferentTypes_Qdaj10_nQZC0_2() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("validValue");
    jsonMessage.setValue("1");
    jsonMessage.setValue("1.0");
    jsonMessage.setValue("true");
    jsonMessage.setValue(new Object().toString());
    assertEquals("1", jsonMessage.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithValidValueAndDifferentTypes_Qdaj10_nQZC0_3() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("validValue");
    jsonMessage.setValue("1");
    jsonMessage.setValue("1.0");
    jsonMessage.setValue("true");
    jsonMessage.setValue(new Object().toString());
    assertEquals("1.0", jsonMessage.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithValidValueAndDifferentTypes_Qdaj10_nQZC0_4() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("validValue");
    jsonMessage.setValue("1");
    jsonMessage.setValue("1.0");
    jsonMessage.setValue("true");
    jsonMessage.setValue(new Object().toString());
    assertEquals("true", jsonMessage.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetValueWithValidValueAndDifferentTypes_Qdaj10_nQZC0_5() {
    JsonMessage jsonMessage = new JsonMessage();
    jsonMessage.setValue("validValue");
    jsonMessage.setValue("1");
    jsonMessage.setValue("1.0");
    jsonMessage.setValue("true");
    jsonMessage.setValue(new Object().toString());
    assertEquals(new Object().toString(), jsonMessage.getValue());
  }
}