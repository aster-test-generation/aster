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
  public void testWillDecodeValidJson_LIjv0() {
    JsonDecoder decoder = new JsonDecoder();
    String validJson = "{\"key\":\"value\"}";
    assertTrue(decoder.willDecode(validJson));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecode_JsonStringWithKeyAndValue_ReturnsJsonMessage_NFmo0() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"myKey\",\"value\":\"myValue\"}";
    JsonMessage message = decoder.decode(json);
    assertNotNull(message);
    assertEquals("myKey", message.getKey());
    assertEquals("myValue", message.getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecode_JsonStringWithKeyAndValue_ReturnsJsonMessage_NFmo0_1() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"myKey\",\"value\":\"myValue\"}";
    JsonMessage message = decoder.decode(json);
    assertNotNull(message);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecode_JsonStringWithKeyAndValue_ReturnsJsonMessage_NFmo0_2() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"myKey\",\"value\":\"myValue\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("myKey", message.getKey());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecode_JsonStringWithKeyAndValue_ReturnsJsonMessage_NFmo0_3() throws DecodeException {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"key\":\"myKey\",\"value\":\"myValue\"}";
    JsonMessage message = decoder.decode(json);
    assertEquals("myValue", message.getValue());
  }

  @Test
  public void testDecode_JsonStringWithoutKey_ThrowsDecodeException_ioel2_GySY0() {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"value\":\"myValue\"}";
    assertThrows(NullPointerException.class, () -> decoder.willDecode(json));
  }

  @Test
  public void testDecode_InvalidJsonString_ThrowsDecodeException_TJPv4_fAwk0() {
    JsonDecoder decoder = new JsonDecoder();
    String json = "Invalid Json String";
    try {
      decoder.willDecode(json);
      assert false;
    } catch (Exception e) {
      assert true;
    }
  }

  @Test
  public void testDecode_JsonStringWithoutKey_ThrowsDecodeException_ioel2_GySY0_fid2() {
    JsonDecoder decoder = new JsonDecoder();
    String json = "{\"value\":\"myValue\"}";
    assertThrows(DecodeException.class, () -> decoder.willDecode(json));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecode_SpkM0_hdBd0_1_fid2() {
    JsonDecoder jsonDecoder = new JsonDecoder();
    assertTrue(jsonDecoder.willDecode("{}"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecode_SpkM0_CrLe1_1() {
    JsonDecoder jsonDecoder = new JsonDecoder();
    assertTrue(jsonDecoder.willDecode("{\"key\":\"value\"}"));
  }
}