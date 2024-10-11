/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import javax.websocket.DecodeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JsonDecoder_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecode_BRIj0_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("value", message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecode_BRIj0_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("key", message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyJson_HpqL1_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "";
    JsonMessage message = decoder.decode(json);
    assertNull(message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyJson_HpqL1_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "";
    JsonMessage message = decoder.decode(json);
    assertNull(message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithNullJson_zqKT3_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = null;
    JsonMessage message = decoder.decode(json);
    assertNull(message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithNullJson_zqKT3_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = null;
    JsonMessage message = decoder.decode(json);
    assertNull(message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithNullKey_RJHq4_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":null}";
    JsonMessage message = decoder.decode(json);
    assertNull(message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithNullKey_RJHq4_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":null}";
    JsonMessage message = decoder.decode(json);
    assertNull(message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithNullValue_byCo5_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":null}";
    JsonMessage message = decoder.decode(json);
    assertNull(message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithNullValue_byCo5_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":null}";
    JsonMessage message = decoder.decode(json);
    assertEquals("key", message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyKey_WayK6_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("", message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyKey_WayK6_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("key", message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyValue_ulbB7_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":\"\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("", message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyValue_ulbB7_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":\"\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("key", message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithMissingKey_YalV8_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"value\":\"value\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("value", message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithMissingKey_YalV8_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"value\":\"value\"}";
    JsonMessage message = decoder.decode(json);
    assertNull(message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithMissingValue_EXhn9_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"key\"}";
    JsonMessage message = decoder.decode(json);
    assertNull(message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithMissingValue_EXhn9_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"key\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("key", message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithExtraKey_FIeL10_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"key\",\"value\":\"value\",\"extra\":\"extra\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("value", message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithExtraKey_FIeL10_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"key\",\"value\":\"value\",\"extra\":\"extra\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("key", message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecode_ValidJson_DkwJ0_fid2() {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\"}";
    assertTrue(decoder.willDecode(json));
  }
}