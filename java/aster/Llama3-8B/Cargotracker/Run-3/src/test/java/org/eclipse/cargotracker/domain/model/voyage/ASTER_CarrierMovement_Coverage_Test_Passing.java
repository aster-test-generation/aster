/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CarrierMovement_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeBuilder_djRy31860737() {
    CarrierMovement carrierMovement = new CarrierMovement();
    assertEquals(31860737, carrierMovement.hashCode());
  }
}