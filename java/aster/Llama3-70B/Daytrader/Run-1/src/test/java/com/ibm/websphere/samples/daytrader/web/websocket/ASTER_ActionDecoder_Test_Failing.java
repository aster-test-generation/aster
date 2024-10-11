/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import javax.websocket.DecodeException;
import javax.websocket.EndpointConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ActionDecoder_Test_Failing {
  private EndpointConfig endpointConfig;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDecode_jrgH0_IvFl0() {
    ActionDecoder actionDecoder = new ActionDecoder();
    try {
      ActionMessage actionMessage = actionDecoder.decode("{\"action\":\"someAction\"}");
      assertEquals("someAction", actionMessage.getDecodedAction());
    } catch (javax.websocket.DecodeException e) {
      fail("DecodeException was thrown");
    }
  }
}