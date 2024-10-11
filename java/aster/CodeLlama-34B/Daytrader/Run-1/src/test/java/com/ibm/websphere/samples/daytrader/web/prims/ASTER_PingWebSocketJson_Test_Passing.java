/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import com.ibm.websphere.samples.daytrader.web.websocket.JsonMessage;
import java.io.IOException;
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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingWebSocketJson_Test_Passing {
  private PingWebSocketJson pingWebSocketJson;
  private Session currentSession = null;
  private Integer sentHitCount = null;
  private Session session;
  @Mock
  private CloseReason reason;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingWithValidSessionAndInvalidAsyncRemote_KFSF10() throws IOException {
    PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
    JsonMessage message = new JsonMessage();
    message.setKey("testKey");
    message.setValue("testValue");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_MQiS0() {
    pingWebSocketJson = new PingWebSocketJson();
  }
}