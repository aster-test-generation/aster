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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingWebSocketJson_Test_Failing {
  private PingWebSocketJson pingWebSocketJson;
  private Integer receivedHitCount = null;
  private Integer sentHitCount = null;
  private Session currentSession = null;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnClose_fKlK0_QRzc0() {
    PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
    Session session = mock(Session.class);
    CloseReason reason = mock(CloseReason.class);
    try {
      pingWebSocketJson.onClose(session, reason);
      verify(session).close(eq(reason));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnCloseWithReason_ufpc1_RUDz0() {
    PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
    Session session = mock(Session.class);
    CloseReason reason = mock(CloseReason.class);
    when(reason.getCloseCode()).thenReturn(CloseReason.CloseCodes.NORMAL_CLOSURE);
    try {
      pingWebSocketJson.onClose(session, reason);
      verify(session).close(eq(reason));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnCloseWithInvalidReason_oFDI3_dstc0() {
    PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
    Session session = mock(Session.class);
    CloseReason reason = mock(CloseReason.class);
    when(reason.getCloseCode()).thenReturn(CloseReason.CloseCodes.PROTOCOL_ERROR);
    try {
      pingWebSocketJson.onClose(session, reason);
      verify(session).close(eq(reason));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnClose_fKlK0_QRzc0_fid2() {
    PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
    Session session = mock(Session.class);
    CloseReason reason = mock(CloseReason.class);
    try {
      pingWebSocketJson.onClose(session, reason);
      verify(session).close(reason);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnCloseWithReason_ufpc1_RUDz0_fid2() {
    PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
    Session session = mock(Session.class);
    CloseReason reason = mock(CloseReason.class);
    when(reason.getCloseCode()).thenReturn(CloseReason.CloseCodes.NORMAL_CLOSURE);
    try {
      pingWebSocketJson.onClose(session, reason);
      verify(session).close(reason);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnCloseWithInvalidReason_oFDI3_dstc0_fid2() {
    PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
    Session session = mock(Session.class);
    CloseReason reason = mock(CloseReason.class);
    when(reason.getCloseCode()).thenReturn(CloseReason.CloseCodes.PROTOCOL_ERROR);
    try {
      pingWebSocketJson.onClose(session, reason);
      verify(session).close(reason);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}