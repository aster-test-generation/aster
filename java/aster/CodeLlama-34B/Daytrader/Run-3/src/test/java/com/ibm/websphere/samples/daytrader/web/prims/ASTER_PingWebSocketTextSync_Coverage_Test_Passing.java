/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Aster_PingWebSocketTextSync_Coverage_Test_Passing {
  private EndpointConfig ec;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnOpen_Rlbg0_RdKb0() {
    PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
    Session session = mock(Session.class);
    pingWebSocketTextSync.onOpen(session, ec);
    verify(session).setMaxIdleTimeout(10000);
  }
}