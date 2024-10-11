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

public class Aster_PingWebSocketBinary_Coverage_Test_Passing {
  private PingWebSocketBinary wsBinary = new PingWebSocketBinary();

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCloseSessionWithNullReason_qORp5_MsuO0() throws IOException {
    Session session = mock(Session.class);
    when(session.isOpen()).thenReturn(true);
    wsBinary.onClose(session, null);
    verify(session, times(1)).close();
  }
}