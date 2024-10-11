/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.websocket.EndpointConfig;
import javax.websocket.SendHandler;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingWebSocketTextAsync_Coverage_Test_Failing {
  private Session mockSession;
  private PingWebSocketTextAsync pingWebSocketTextAsync;
  private Session currentSession;
  private EndpointConfig mockEndpointConfig;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingSendsTextWithHitCount_UOVi2() {
    pingWebSocketTextAsync.ping("test");
    verify(currentSession.getAsyncRemote()).sendText("1", any(SendHandler.class)); // Verify sendText is called with hitCount
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingSendsTextWithCorrectHitCountOnMultipleCalls_SPxG6() {
    pingWebSocketTextAsync.ping("test1");
    pingWebSocketTextAsync.ping("test2");
    verify(currentSession.getAsyncRemote(), times(2)).sendText(anyString(), any(SendHandler.class)); // Verify sendText is called twice
  }
}