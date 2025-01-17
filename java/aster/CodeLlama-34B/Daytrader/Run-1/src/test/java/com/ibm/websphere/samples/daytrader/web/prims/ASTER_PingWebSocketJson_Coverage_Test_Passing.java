/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import com.ibm.websphere.samples.daytrader.web.websocket.JsonMessage;
import java.util.concurrent.TimeUnit;
import javax.websocket.CloseReason;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingWebSocketJson_Coverage_Test_Passing {
  private CloseReason reason;
  private Thread thread;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithPrintStackTrace_nleC0() {
    PingWebSocketJson pwj = new PingWebSocketJson();
    Throwable t = new Throwable("Test exception");
    pwj.onError(t);
  }

  @Test
  public void testOnMessage_InvalidSession_XVjP6() throws Exception {
    PingWebSocketJson endpoint = new PingWebSocketJson();
    JsonMessage message = new JsonMessage();
    message.setKey("sentHitCount");
  }
}