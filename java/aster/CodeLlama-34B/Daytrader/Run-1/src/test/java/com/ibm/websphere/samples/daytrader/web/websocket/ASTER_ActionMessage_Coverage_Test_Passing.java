/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ActionMessage_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_NullJsonText_kxIv8() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = null;
    actionMessage.doDecoding(jsonText);
    Assertions.assertNull(actionMessage.decodedAction);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_EmptyJsonText_CKmx9() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "";
    actionMessage.doDecoding(jsonText);
    Assertions.assertNull(actionMessage.decodedAction);
  }
}