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

public class Aster_ActionDecoder_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecode_olAI0() {
    ActionDecoder actionDecoder = new ActionDecoder();
    String jsonText = "example json text";
    ActionMessage expected = new ActionMessage();
    try {
      ActionMessage actual = actionDecoder.decode(jsonText);
      assertEquals(expected, actual);
    } catch (DecodeException e) {
      fail("Exception not expected");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecodeCoverage_CgGg1_3() {
    ActionDecoder actionDecoder = new ActionDecoder();
    assertFalse(actionDecoder.willDecode("test"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecodeCoverage_CgGg1() {
    ActionDecoder actionDecoder = new ActionDecoder();
    assertTrue(actionDecoder.willDecode(null));
    assertTrue(actionDecoder.willDecode(""));
    assertFalse(actionDecoder.willDecode("test"));
  }
}