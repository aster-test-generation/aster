/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CarrierMovement_Coverage_Test_Failing {
  CarrierMovement carrierMovement;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_DepartureTime_SkHm2() {
    LocalDateTime departureTime = LocalDateTime.now();
    CarrierMovement carrierMovement = new CarrierMovement(null, null, departureTime, null);
    int hashCode = carrierMovement.hashCode();
    assertNotEquals(0, hashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_ArrivalTime_YGrZ4() {
    LocalDateTime arrivalTime = LocalDateTime.now();
    CarrierMovement carrierMovement = new CarrierMovement(null, null, null, arrivalTime);
    int hashCode = carrierMovement.hashCode();
    assertNotEquals(0, hashCode);
  }
}