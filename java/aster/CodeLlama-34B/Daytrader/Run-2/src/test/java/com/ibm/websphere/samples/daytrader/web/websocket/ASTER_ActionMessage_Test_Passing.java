/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ActionMessage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_NullJson_XTMk2() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = null;
    actionMessage.doDecoding(jsonText);
    assertNull(actionMessage.decodedAction);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_EmptyJson_KbRi3() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "";
    actionMessage.doDecoding(jsonText);
    assertNull(actionMessage.decodedAction);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_ValidJson_FCHz0_fid1() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{\"action\":\"test\"}";
    actionMessage.doDecoding(jsonText);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDecodedAction_OASN0_fid1() {
    ActionMessage actionMessage = new ActionMessage();
    String decodedAction = actionMessage.getDecodedAction();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDecodedActionWithEmptyAction_yjXL2_wSGa0() {
    ActionMessage actionMessage = new ActionMessage();
    String decodedAction = actionMessage.getDecodedAction();
    assertNull(decodedAction);
  }
}