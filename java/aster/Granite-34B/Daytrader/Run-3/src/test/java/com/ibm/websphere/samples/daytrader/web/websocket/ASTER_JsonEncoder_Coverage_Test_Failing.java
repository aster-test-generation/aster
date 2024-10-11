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
  public void testEncode_KeyAndValueAreNotNull_ReturnsCorrectJson_hbhm0() throws javax.websocket.EncodeException {
    JsonMessage message = new JsonMessage();
    message.setKey("key");
    message.setValue("value");
    JsonEncoder encoder = new JsonEncoder();
    String actual = encoder.encode(message);
    assertEquals("{\"key\":\"key\",\"value\":\"value\"}", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncode_ValueIsNull_ReturnsCorrectJson_BZnA3() throws javax.websocket.EncodeException {
    JsonMessage message = new JsonMessage();
    message.setKey("key");
    JsonEncoder encoder = new JsonEncoder();
    String actual = encoder.encode(message);
    assertEquals("{\"key\":\"key\",\"value\":null}", actual);
  }
}