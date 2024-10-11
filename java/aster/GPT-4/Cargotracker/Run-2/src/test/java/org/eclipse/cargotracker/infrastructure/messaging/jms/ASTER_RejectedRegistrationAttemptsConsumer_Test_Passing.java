/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_RejectedRegistrationAttemptsConsumer_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithValidMessage_tIwr0() {
    RejectedRegistrationAttemptsConsumer consumer = new RejectedRegistrationAttemptsConsumer();
    Message mockMessage = mock(Message.class);
    try {
      when(mockMessage.getBody(String.class)).thenReturn("TrackingID123");
    } catch (JMSException e) {
      e.printStackTrace();
    }
    consumer.onMessage(mockMessage);
    try {
      verify(mockMessage).getBody(String.class);
    } catch (JMSException e) {
      e.printStackTrace();
    }
  }
}