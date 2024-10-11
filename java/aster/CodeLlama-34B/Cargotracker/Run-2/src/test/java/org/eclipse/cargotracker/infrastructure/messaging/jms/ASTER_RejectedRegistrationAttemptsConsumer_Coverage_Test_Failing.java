/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.jms.JMSException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_RejectedRegistrationAttemptsConsumer_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithNullMessage_wbej4_frhb0() throws JMSException {
    RejectedRegistrationAttemptsConsumer consumer = new RejectedRegistrationAttemptsConsumer();
    consumer.onMessage(null);
    verify(consumer, times(1)).onMessage(isNull());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithNullMessage_wbej4_frhb0_fid1() throws JMSException {
    RejectedRegistrationAttemptsConsumer consumer = new RejectedRegistrationAttemptsConsumer();
    consumer.onMessage(null);
    verify(consumer, times(1)).onMessage(null);
  }
}