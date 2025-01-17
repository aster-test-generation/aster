/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.TextMessage;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_CargoHandledConsumer_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_zZlZ0() {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessage_GetText_mNkH3_PBeT0() throws JMSException {
    CargoHandledConsumer cargoHandledConsumer = new CargoHandledConsumer();
    TextMessage textMessage = mock(TextMessage.class);
    when(textMessage.getText()).thenReturn("trackingIdString");
    Message message = (Message) textMessage; // Cast to Message
    cargoHandledConsumer.onMessage(message);
    verify(textMessage).getText();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessage_TextMessage_PBOi1_FuAo0() throws JMSException {
    TextMessage message = mock(TextMessage.class);
    when(message.getText()).thenReturn("someTrackingId");
    CargoHandledConsumer cargoHandledConsumer = new CargoHandledConsumer();
    cargoHandledConsumer.onMessage(message);
    verify(message, times(1)).getText();
  }
}