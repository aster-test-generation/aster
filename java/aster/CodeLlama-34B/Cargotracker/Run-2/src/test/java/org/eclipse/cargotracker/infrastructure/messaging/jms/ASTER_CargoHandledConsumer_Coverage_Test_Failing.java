/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.jms.JMSException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;

public class Aster_CargoHandledConsumer_Coverage_Test_Failing {
  private Logger logger;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithNullMessage_cIZH3() throws JMSException {
    CargoHandledConsumer consumer = new CargoHandledConsumer();
    consumer.onMessage(null);
    verify(logger).log(Level.SEVERE, "Error procesing JMS message", any(NullPointerException.class));
  }
}