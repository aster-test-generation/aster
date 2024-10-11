/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.jms.Message;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RejectedRegistrationAttemptsConsumer_Coverage_Test_Passing {
  private Message message;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessage_MessageNull_sYNK5_RLsP0() {
    RejectedRegistrationAttemptsConsumer rejectedRegistrationAttemptsConsumer = new RejectedRegistrationAttemptsConsumer();
    Message message = null;
    try {
      rejectedRegistrationAttemptsConsumer.onMessage(message);
      assert false; // Should throw NullPointerException
    } catch (NullPointerException e) {
    }
  }
}