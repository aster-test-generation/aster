/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CarrierMovement_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_appendArrivalTime_Strb4_Sehb0() {
    LocalDateTime arrivalTime = LocalDateTime.now();
    CarrierMovement carrierMovement = new CarrierMovement(null, null, null, arrivalTime);
    int hashCode = carrierMovement.hashCode();
    assertNotNull(hashCode);
  }
}