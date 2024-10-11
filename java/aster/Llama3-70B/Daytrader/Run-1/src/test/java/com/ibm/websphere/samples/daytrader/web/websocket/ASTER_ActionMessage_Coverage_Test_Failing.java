/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ActionMessage_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_NullJsonText_ThrowsException_stYN0() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = null;
    try {
      actionMessage.doDecoding(jsonText);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_ValidJsonText_KeyNameFound_CKSt3() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{\"action\":\"myAction\"}";
    actionMessage.doDecoding(jsonText);
    assertEquals("myAction", actionMessage.decodedAction);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_ValidJsonText_MultipleKeyValuePairs_gGKD5() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{\"action\":\"myAction\",\"other\":\"otherValue\"}";
    actionMessage.doDecoding(jsonText);
    assertEquals("myAction", actionMessage.decodedAction);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_ValidJsonText_EmptyStringValue_triv9() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{\"action\":\"\"}";
    actionMessage.doDecoding(jsonText);
    assertEquals("", actionMessage.decodedAction);
  }
}