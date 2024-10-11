/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import javax.websocket.DecodeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JsonDecoder_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_qhqW0() {
    JsonDecoder jsonDecoder = new JsonDecoder();
    jsonDecoder.init(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecode_validJson_cETC0() {
    JsonDecoder jsonDecoder = new JsonDecoder();
    String json = "{\"key1\": \"value1\", \"key2\": \"value2\"}";
    boolean result = jsonDecoder.willDecode(json);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecode_invalidJson_ulWV1() {
    JsonDecoder jsonDecoder = new JsonDecoder();
    String json = "{\"key1\": \"value1\", \"key2: \"value2\"}";
    boolean result = jsonDecoder.willDecode(json);
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyKey_zerT1() throws javax.websocket.DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"\",\"value\":\"value2\"}";
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyValue_Lpit2() throws javax.websocket.DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value1\",\"value\":\"\"}";
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithNullValue_fvtZ4() throws javax.websocket.DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value1\",\"value\":null}";
  }
}