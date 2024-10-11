/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

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
  public void testOnErrorWithPrintStackTrace_fGZk0() {
    PingWebSocketJson pwj = new PingWebSocketJson();
    Throwable t = new Throwable("Test exception");
    pwj.onError(t);
  }
}