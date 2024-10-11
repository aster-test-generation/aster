/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.ObjectMessage;
import org.eclipse.cargotracker.application.HandlingEventService;
import org.eclipse.cargotracker.interfaces.handling.HandlingEventRegistrationAttempt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_HandlingEventRegistrationAttemptConsumer_Coverage_Test_Passing {
  private HandlingEventRegistrationAttempt attempt;
  private HandlingEventRegistrationAttemptConsumer consumer;
  private HandlingEventService handlingEventService;
  private Message message;
  private ObjectMessage objectMessage;

  @Test
  public void testOnMessageWithRuntimeException_rTkb5_miRB0_fid1() throws JMSException {
    ObjectMessage objectMessage = mock(ObjectMessage.class);
    when(objectMessage.getObject()).thenThrow(new RuntimeException("Runtime exception"));
    assertThrows(RuntimeException.class, () -> consumer.onMessage(objectMessage));
  }
}