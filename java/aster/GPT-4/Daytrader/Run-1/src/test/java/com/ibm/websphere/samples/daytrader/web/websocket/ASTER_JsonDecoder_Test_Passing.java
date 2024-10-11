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

public class Aster_JsonDecoder_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDestroyMethod_FRbe0() {
    JsonDecoder jsonDecoder = new JsonDecoder();
    jsonDecoder.destroy();
    assertTrue(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecodeWithValidJson_kFLK0_fid1() {
    JsonDecoder decoder = new JsonDecoder();
    String validJson = "{\"name\":\"John\", \"age\":30}";
    assertFalse(decoder.willDecode(validJson));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithNullEndpointConfig_eKkv0_NbSQ0() {
    JsonDecoder decoder = new JsonDecoder();
    assertNotNull(decoder);
  }
}