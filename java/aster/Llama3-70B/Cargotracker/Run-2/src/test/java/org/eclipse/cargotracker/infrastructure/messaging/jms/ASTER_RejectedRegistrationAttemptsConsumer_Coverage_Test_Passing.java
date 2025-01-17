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

public class Aster_RejectedRegistrationAttemptsConsumer_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessage_MessageGetBody_xIew2_utpP0() throws JMSException {
    Message message = mock(Message.class);
    when(message.getBody(String.class)).thenReturn("trackingId");
    RejectedRegistrationAttemptsConsumer rejectedRegistrationAttemptsConsumer = spy(new RejectedRegistrationAttemptsConsumer());
    rejectedRegistrationAttemptsConsumer.onMessage(message);
    verify(message, times(1)).getBody(eq(String.class));
  }

  @Test
  public void testOnMessage_ySZg1() {
  }
}