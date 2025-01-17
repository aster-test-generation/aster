/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingWebSocketTextAsync_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithNullThrowable_Qskn1() {
    PingWebSocketTextAsync async = new PingWebSocketTextAsync();
    Throwable t = null;
    async.onError(t);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_bxkI0() {
    PingWebSocketTextAsync pingWebSocketTextAsync = new PingWebSocketTextAsync();
    pingWebSocketTextAsync.ping("text");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_Kyfs1() {
    PingWebSocketTextAsync pingWebSocketTextAsync = new PingWebSocketTextAsync();
    String text = "text";
    pingWebSocketTextAsync.ping(text);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnOpenWithNullSession_Toag1_gncV0() {
    PingWebSocketTextAsync cut = new PingWebSocketTextAsync();
    Session session = null;
    cut.ping("text");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnOpen_CLSW0_YYlC0() {
    PingWebSocketTextAsync cut = new PingWebSocketTextAsync();
    Session session = mock(Session.class);
    doNothing().when(session).addMessageHandler(any());
    cut.ping("text");
  }
}