/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.jms.JMSException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MisdirectedCargoConsumer_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithNullMessage_eVpl3() throws JMSException {
    MisdirectedCargoConsumer consumer = new MisdirectedCargoConsumer();
    try {
      consumer.onMessage(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException ex) {
      assertFalse(ex.getMessage().contains("message is null"));
    }
  }
}