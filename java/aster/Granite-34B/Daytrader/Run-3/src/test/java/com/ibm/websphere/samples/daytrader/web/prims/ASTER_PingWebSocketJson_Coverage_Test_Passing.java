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
import static org.mockito.Mockito.mock;

public class Aster_PingWebSocketJson_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void onErrorTest1_vzxX0() {
    PingWebSocketJson p = new PingWebSocketJson();
    p.onError(new Throwable());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void onCloseTest2_XyuN1() {
    Session session = null;
    CloseReason reason = null;
    PingWebSocketJson target = new PingWebSocketJson();
    target.onClose(session, reason);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void onCloseTest3_vYSV2_FUqd0() {
    Session session = mock(Session.class);
    CloseReason reason = null;
    PingWebSocketJson target = new PingWebSocketJson();
    target.onClose(session, reason);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void onCloseTest4_GhfV3_zvII0() {
    Session session = null;
    CloseReason reason = new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "test");
    PingWebSocketJson target = new PingWebSocketJson();
    target.onClose(session, reason);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void onCloseTest1_vZZZ0_fXkz0() {
    Session session = mock(Session.class);
    CloseReason reason = new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "test");
    PingWebSocketJson target = new PingWebSocketJson();
    target.onClose(session, reason);
  }
}