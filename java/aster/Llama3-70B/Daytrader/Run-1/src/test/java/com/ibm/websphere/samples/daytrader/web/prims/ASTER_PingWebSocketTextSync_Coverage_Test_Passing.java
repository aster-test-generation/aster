/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingWebSocketTextSync_Coverage_Test_Passing {
  private int getHitCount(PingWebSocketTextSync pingWebSocketTextSync) throws Exception {
    return PingWebSocketTextSync.class.getDeclaredField("hitCount").getInt(pingWebSocketTextSync);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnClose_qZBH0() {
    PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
    Session session = null; // Initialize session as per your requirement
    CloseReason reason = null; // Initialize reason as per your requirement
    pingWebSocketTextSync.onClose(session, reason);
  }
}