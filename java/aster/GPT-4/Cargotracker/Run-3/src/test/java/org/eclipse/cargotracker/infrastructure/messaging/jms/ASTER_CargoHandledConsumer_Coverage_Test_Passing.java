/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.jms.Message;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class Aster_CargoHandledConsumer_Coverage_Test_Passing {
  @Test
  public void testOnMessageWithInvalidMessageType_yiKw2_zcGh0() {
    CargoHandledConsumer consumer = new CargoHandledConsumer();
    Message message = mock(Message.class); // Not a TextMessage
    assertThrows(ClassCastException.class, () -> consumer.onMessage(message));
  }
}