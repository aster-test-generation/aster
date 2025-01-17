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

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_CargoHandledConsumer_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithJMSException_sHMJ1_qHVL0() {
    CargoHandledConsumer cargoHandledConsumer = new CargoHandledConsumer();
    Message message = mock(Message.class);
    try {
      doThrow(JMSException.class).when(message).acknowledge();
      cargoHandledConsumer.onMessage(message);
    } catch (JMSException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithTextMessage_vAWF0_Odwz0() {
    CargoHandledConsumer cargoHandledConsumer = new CargoHandledConsumer();
    TextMessage textMessage = mock(TextMessage.class);
    try {
      when(textMessage.getText()).thenReturn("TrackingIdString");
    } catch (JMSException e) {
      fail("Should not have thrown JMSException");
    }
    cargoHandledConsumer.onMessage(textMessage);
  }
}