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

public class Aster_ActionMessage_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_ValidJsonWithoutAction_VHIA1() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{\"notAction\":\"testAction\"}";
    actionMessage.doDecoding(jsonText);
    assertNull(actionMessage.getDecodedAction());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_EmptyJson_trCn2() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{}";
    actionMessage.doDecoding(jsonText);
    assertNull(actionMessage.getDecodedAction());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_NullJson_tsCw3() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = null;
    actionMessage.doDecoding(jsonText);
    assertNull(actionMessage.getDecodedAction());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_InvalidJson_XHtj4() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{action:testAction}"; // Invalid JSON
    actionMessage.doDecoding(jsonText);
    assertNull(actionMessage.getDecodedAction());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_JsonWithNestedObject_MJII8() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{\"data\":{\"action\":\"nestedAction\"}}";
    actionMessage.doDecoding(jsonText);
    assertNull(actionMessage.getDecodedAction()); // Should not decode nested action
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_ValidJsonWithAction_RVST0_fid1() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{\"action\":\"testAction\"}";
    actionMessage.doDecoding(jsonText);
    assertNull(actionMessage.getDecodedAction());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_JsonWithMultipleKeys_fOqd5_fid1() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{\"action\":\"firstAction\", \"otherKey\":\"value\"}";
    actionMessage.doDecoding(jsonText);
    assertNull(actionMessage.getDecodedAction());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_JsonWithActionAsEmptyString_FcUZ6_fid1() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{\"action\":\"\"}";
    actionMessage.doDecoding(jsonText);
    assertNull(actionMessage.getDecodedAction());
  }
}