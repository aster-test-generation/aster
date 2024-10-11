/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingWebSocketBinary_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnClose_whenSessionIsOpen_bRBm0() throws IOException {
    Session mockSession = mock(Session.class);
    CloseReason mockReason = mock(CloseReason.class);
    when(mockSession.isOpen()).thenReturn(true);
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    pingWebSocketBinary.onClose(mockSession, mockReason);
    verify(mockSession, times(1)).close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnClose_whenSessionIsClosed_KqkE1() throws IOException {
    Session mockSession = mock(Session.class);
    CloseReason mockReason = mock(CloseReason.class);
    when(mockSession.isOpen()).thenReturn(false);
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    pingWebSocketBinary.onClose(mockSession, mockReason);
    verify(mockSession, never()).close();
  }
}