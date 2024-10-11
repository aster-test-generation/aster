/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.jms.Message;
import jakarta.jms.ObjectMessage;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.handling.HandlingEventRegistrationAttempt;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_HandlingEventRegistrationAttemptConsumer_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessage_ObjectMessage_JdGu0() throws Exception {
    HandlingEventRegistrationAttemptConsumer consumer = new HandlingEventRegistrationAttemptConsumer();
    Message message = mock(ObjectMessage.class);
    consumer.onMessage(message);
    verify(message, times(1)).getClass();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessage_GetObject_HNtU2() throws Exception {
    HandlingEventRegistrationAttemptConsumer consumer = new HandlingEventRegistrationAttemptConsumer();
    ObjectMessage objectMessage = mock(ObjectMessage.class);
    HandlingEventRegistrationAttempt attempt = mock(HandlingEventRegistrationAttempt.class);
    when(objectMessage.getObject()).thenReturn(attempt);
    consumer.onMessage(objectMessage);
    verify(objectMessage, times(1)).getObject();
  }
}