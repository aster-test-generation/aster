/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ActionDecoder_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDestroy_WlYA0() {
    ActionDecoder decoder = new ActionDecoder();
    decoder.destroy();
    assertTrue(true); // As destroy method has no output, checking if method completes without exception
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWillDecodeAlwaysTrue_cyGq0() {
    ActionDecoder decoder = new ActionDecoder();
    assertTrue(decoder.willDecode("any string"));
  }
}