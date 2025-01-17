/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import com.ibm.websphere.samples.daytrader.web.websocket.JsonMessage;
import java.util.concurrent.TimeUnit;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingWebSocketJson_Test_Failing {
  private PingWebSocketJson pingWebSocketJson;
  private Session currentSession = null;
  private Integer sentHitCount = null;
  private Session session;
  @Mock
  private CloseReason reason;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithNullThrowable_fTUV2() {
    Throwable t = null;
    pingWebSocketJson.onError(t);
    assertNull(t);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithNonNullThrowable_dicR3() {
    Throwable t = new Throwable();
    pingWebSocketJson.onError(t);
    assertNotNull(t);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithMessage_vden4() {
    Throwable t = new Throwable("Test message");
    pingWebSocketJson.onError(t);
    assertEquals("Test message", t.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithCause_noUn5() {
    Throwable t = new Throwable("Test message", new Throwable("Test cause"));
    pingWebSocketJson.onError(t);
    assertEquals("Test cause", t.getCause().getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithSuppressedExceptions_aBvl6() {
    Throwable t = new Throwable("Test message", new Throwable("Test suppressed exception"));
    pingWebSocketJson.onError(t);
    assertEquals("Test suppressed exception", t.getSuppressed()[0].getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithStackTrace_JbjF7() {
    Throwable t = new Throwable("Test message");
    pingWebSocketJson.onError(t);
    assertNotNull(t.getStackTrace());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithLocalizedMessage_vbtw8() {
    Throwable t = new Throwable("Test message");
    pingWebSocketJson.onError(t);
    assertEquals("Test message", t.getLocalizedMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void run_fAGt3() {
    try {
      Thread.sleep(500);
      while (currentSession.isOpen()) {
        sentHitCount++;
        JsonMessage response = new JsonMessage();
        response.setKey("sentHitCount");
        response.setValue(sentHitCount.toString());
        currentSession.getAsyncRemote().sendObject(response);
        Thread.sleep(100);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}