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

public class Aster_JsonEncoder_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithValidKeyAndValue_Qpqj0() throws EncodeException {
    JsonMessage message = new JsonMessage();
    message.setKey("exampleKey");
    message.setValue("exampleValue");
    JsonEncoder encoder = new JsonEncoder();
    String result = encoder.encode(message);
    assertEquals("{\"key\":\"exampleKey\",\"value\":\"exampleValue\"}", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithNullKey_ImTX1() throws EncodeException {
    JsonMessage message = new JsonMessage();
    message.setKey(null);
    message.setValue("exampleValue");
    JsonEncoder encoder = new JsonEncoder();
    String result = encoder.encode(message);
    assertEquals("{\"key\":null,\"value\":\"exampleValue\"}", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithNullValue_nZYk2() throws EncodeException {
    JsonMessage message = new JsonMessage();
    message.setKey("exampleKey");
    message.setValue(null);
    JsonEncoder encoder = new JsonEncoder();
    String result = encoder.encode(message);
    assertEquals("{\"key\":\"exampleKey\",\"value\":null}", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithEmptyKeyAndValue_AJZf3() throws EncodeException {
    JsonMessage message = new JsonMessage();
    message.setKey("");
    message.setValue("");
    JsonEncoder encoder = new JsonEncoder();
    String result = encoder.encode(message);
    assertEquals("{\"key\":\"\",\"value\":\"\"}", result);
  }
}