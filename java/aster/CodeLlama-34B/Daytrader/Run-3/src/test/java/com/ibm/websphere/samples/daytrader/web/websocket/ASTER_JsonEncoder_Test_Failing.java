/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import javax.websocket.EncodeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JsonEncoder_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncode_pPlJ0() throws EncodeException {
    JsonEncoder encoder = new JsonEncoder();
    JsonMessage message = new JsonMessage();
    message.setKey("key");
    message.setValue("value");
    String encoded = encoder.encode(message);
    assertEquals("{\"key\":\"key\",\"value\":\"value\"}", encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithNullKey_iwIM1() throws EncodeException {
    JsonEncoder encoder = new JsonEncoder();
    JsonMessage message = new JsonMessage();
    message.setKey(null);
    message.setValue("value");
    String encoded = encoder.encode(message);
    assertEquals("{\"value\":\"value\"}", encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithNullValue_pPyb2() throws EncodeException {
    JsonEncoder encoder = new JsonEncoder();
    JsonMessage message = new JsonMessage();
    message.setKey("key");
    message.setValue(null);
    String encoded = encoder.encode(message);
    assertEquals("{\"key\":\"key\"}", encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithEmptyKey_lWwa3() throws EncodeException {
    JsonEncoder encoder = new JsonEncoder();
    JsonMessage message = new JsonMessage();
    message.setKey("");
    message.setValue("value");
    String encoded = encoder.encode(message);
    assertEquals("{\"value\":\"value\"}", encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithEmptyValue_mxEg4() throws EncodeException {
    JsonEncoder encoder = new JsonEncoder();
    JsonMessage message = new JsonMessage();
    message.setKey("key");
    message.setValue("");
    String encoded = encoder.encode(message);
    assertEquals("{\"key\":\"key\"}", encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithInvalidKey_qAFk5() throws EncodeException {
    JsonEncoder encoder = new JsonEncoder();
    JsonMessage message = new JsonMessage();
    message.setKey("invalid_key");
    message.setValue("value");
    String encoded = encoder.encode(message);
    assertEquals("{\"invalid_key\":\"value\"}", encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithInvalidValue_aFvQ6() throws EncodeException {
    JsonEncoder encoder = new JsonEncoder();
    JsonMessage message = new JsonMessage();
    message.setKey("key");
    message.setValue("invalid_value");
    String encoded = encoder.encode(message);
    assertEquals("{\"key\":\"invalid_value\"}", encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithNullMessage_SdJY7() throws EncodeException {
    JsonEncoder encoder = new JsonEncoder();
    JsonMessage message = null;
    String encoded = encoder.encode(message);
    assertEquals("", encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithEmptyMessage_RPRo8() throws EncodeException {
    JsonEncoder encoder = new JsonEncoder();
    JsonMessage message = new JsonMessage();
    String encoded = encoder.encode(message);
    assertEquals("", encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithInvalidMessage_IPLH9() throws EncodeException {
    JsonEncoder encoder = new JsonEncoder();
    JsonMessage message = new JsonMessage();
    message.setKey("invalid_key");
    message.setValue("invalid_value");
    String encoded = encoder.encode(message);
    assertEquals("{\"invalid_key\":\"invalid_value\"}", encoded);
  }
}