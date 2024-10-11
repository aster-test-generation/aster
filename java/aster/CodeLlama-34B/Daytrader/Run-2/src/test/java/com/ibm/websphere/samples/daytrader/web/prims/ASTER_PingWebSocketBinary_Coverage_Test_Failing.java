/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Aster_PingWebSocketBinary_Coverage_Test_Failing {
  private Session currentSession;
  private EndpointConfig ec;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QMLy0() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    pingWebSocketBinary.ping(data);
    verify(currentSession.getAsyncRemote()).sendBinary(data);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingWithEmptyData_LSDS1_nNRs0() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(0);
    pingWebSocketBinary.ping(data);
    verify(currentSession.getAsyncRemote()).sendBinary(data);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QMLy0_tbcS0() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    pingWebSocketBinary.ping(data);
    Session currentSession = mock(Session.class);
    verify(currentSession.getAsyncRemote()).sendBinary(data);
  }
}