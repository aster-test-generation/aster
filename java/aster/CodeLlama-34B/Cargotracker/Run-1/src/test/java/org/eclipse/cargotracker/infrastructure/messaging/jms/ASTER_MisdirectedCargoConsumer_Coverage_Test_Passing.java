/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_MisdirectedCargoConsumer_Coverage_Test_Passing {
  private Message message;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithNullMessage_UPeM2_uSCL0() throws JMSException {
    Logger logger = mock(Logger.class);
    MisdirectedCargoConsumer consumer = new MisdirectedCargoConsumer();
    consumer.onMessage(null);
    verify(logger, never()).log(any(Level.class), anyString(), any(JMSException.class));
  }
}