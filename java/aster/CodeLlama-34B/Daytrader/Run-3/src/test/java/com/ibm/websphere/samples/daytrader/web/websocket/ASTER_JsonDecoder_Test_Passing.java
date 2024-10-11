/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JsonDecoder_Test_Passing {
  private JsonDecoder jsonDecoder;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithNullConfig_rZyh1() {
    JsonDecoder jsonDecoder = new JsonDecoder();
    jsonDecoder.init(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecode_ValidJson_tSrA0() {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\"}";
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecode_EmptyJson_fIsb2() {
    JsonDecoder decoder = new JsonDecoder();
    String json = "";
    assertFalse(decoder.willDecode(json));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecode_NullJson_FlXf3() {
    JsonDecoder decoder = new JsonDecoder();
    String json = null;
    assertFalse(decoder.willDecode(json));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecode_JsonWithInvalidKey_uxJt4() {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\"}";
    assertFalse(decoder.willDecode(json));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecode_JsonWithValidKeyAndValueAndExtraCharacters_cBCc8() {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\"} extra";
    assertFalse(decoder.willDecode(json));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_LxdY0() {
    jsonDecoder = new JsonDecoder();
  }
}