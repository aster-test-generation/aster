/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CarrierMovement_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithDepartureTime_bqGf2() {
    CarrierMovement carrierMovement = new CarrierMovement(null, null, LocalDateTime.now(), null);
    assertEquals(17, carrierMovement.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithArrivalTime_GaVu4() {
    CarrierMovement carrierMovement = new CarrierMovement(null, null, null, LocalDateTime.now());
    assertEquals(17, carrierMovement.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_szlf0() {
    CarrierMovement carrierMovement = new CarrierMovement();
    assertEquals(0, carrierMovement.hashCode());
  }
}