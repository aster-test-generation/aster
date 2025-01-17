/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import com.ibm.websphere.samples.daytrader.util.Log;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;

public class Aster_ActionMessage_Coverage_Test_Failing {
  private Log log;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecoding_lsCz0() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{\"action\":\"test\"}";
    actionMessage.doDecoding(jsonText);
    verify(log).trace("ActionMessage:doDecoding -- decoded action -->test<--");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecodingWithNullJson_FxcR2() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = null;
    actionMessage.doDecoding(jsonText);
    verify(log).error("ActionMessage:doDecoding(null) --> failed", any(Exception.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecodingWithEmptyJson_CYJc3() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "";
    actionMessage.doDecoding(jsonText);
    verify(log).error("ActionMessage:doDecoding() --> failed", any(Exception.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecodingWithNullKey_XUrh5() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{\"action\":null}";
    actionMessage.doDecoding(jsonText);
    verify(log).error("ActionMessage:doDecoding(" + jsonText + ") --> failed", any(Exception.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDecodingWithEmptyKey_MEVH6() {
    ActionMessage actionMessage = new ActionMessage();
    String jsonText = "{\"action\":\"\"}";
    actionMessage.doDecoding(jsonText);
    verify(log).error("ActionMessage:doDecoding(" + jsonText + ") --> failed", any(Exception.class));
  }
}