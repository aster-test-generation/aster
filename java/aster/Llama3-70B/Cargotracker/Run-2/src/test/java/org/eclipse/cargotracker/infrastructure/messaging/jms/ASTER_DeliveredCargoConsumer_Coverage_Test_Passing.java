/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DeliveredCargoConsumer_Coverage_Test_Passing {
  private DeliveredCargoConsumer deliveredCargoConsumer;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_sWNB0() {
    deliveredCargoConsumer = new DeliveredCargoConsumer();
  }
}