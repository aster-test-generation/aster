/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingWebSocketBinary_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnClose_sessionOpen_JBOf0_DKOQ0() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    Session session = mock(Session.class);
    when(session.isOpen()).thenReturn(true);
    try {
      pingWebSocketBinary.onClose(session, null);
      verify(session).close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnClose_sessionClosed_iBXu1_BTTn0() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    Session session = mock(Session.class);
    when(session.isOpen()).thenReturn(false);
    pingWebSocketBinary.onClose(session, null);
    try {
      verify(session, never()).close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}