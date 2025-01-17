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

public class Aster_JsonDecoder_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecode_baoH0() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("value", message.getValue());
    assertEquals("key", message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyJson_gQKK1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{}";
    JsonMessage message = decoder.decode(json);
    assertNull(message.getValue());
    assertNull(message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithNullJson_mDSS3() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = null;
    try {
      decoder.decode(json);
      fail("Expected DecodeException");
    } catch (DecodeException e) {
      assertTrue(e.getMessage().contains("Null JSON"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyKey_gvYc4() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("", message.getKey());
    assertNull(message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyValue_VxiF5() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":\"\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("value", message.getKey());
    assertEquals("", message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithNullValue_ykJx6() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":null}";
    JsonMessage message = decoder.decode(json);
    assertEquals("value", message.getKey());
    assertNull(message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithInvalidValue_biFi7() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":\"invalid\"}";
    try {
      decoder.decode(json);
      fail("Expected DecodeException");
    } catch (DecodeException e) {
      assertTrue(e.getMessage().contains("Invalid value"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithInvalidKey_eVeD8() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":\"invalid\"}";
    try {
      decoder.decode(json);
      fail("Expected DecodeException");
    } catch (DecodeException e) {
      assertTrue(e.getMessage().contains("Invalid key"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithInvalidJsonObject_EeYK9() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":\"invalid\"}";
    try {
      decoder.decode(json);
      fail("Expected DecodeException");
    } catch (DecodeException e) {
      assertTrue(e.getMessage().contains("Invalid JSON object"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecode_validJson_BIcd0() {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\"}";
    assertTrue(decoder.willDecode(json));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecode_baoH0_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("value", message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyJson_gQKK1_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{}";
    JsonMessage message = decoder.decode(json);
    assertNull(message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyJson_gQKK1_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{}";
    JsonMessage message = decoder.decode(json);
    assertNull(message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyKey_gvYc4_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("", message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyKey_gvYc4_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"\"}";
    JsonMessage message = decoder.decode(json);
    assertNotNull(message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyValue_VxiF5_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":\"\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("", message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithNullValue_ykJx6_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":null}";
    JsonMessage message = decoder.decode(json);
    assertNull(message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecode_baoH0_2_fid3() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("key", message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyKey_gvYc4_2_fid3() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"\"}";
    JsonMessage message = decoder.decode(json);
    assertNull(message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithEmptyValue_VxiF5_1_fid3() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":\"\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("value", message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecodeWithNullValue_ykJx6_1_fid3() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"value\",\"value\":null}";
    JsonMessage message = decoder.decode(json);
    assertEquals("value", message.getKey());
  }
}