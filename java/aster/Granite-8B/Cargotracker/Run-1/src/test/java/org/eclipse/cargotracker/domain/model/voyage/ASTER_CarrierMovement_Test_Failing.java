/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CarrierMovement_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_tmnu0_ZHLU0() {
    UnLocode unLocode1 = new UnLocode("US");
    UnLocode unLocode2 = new UnLocode("US");
    Location location1 = new Location(unLocode1, "New York");
    Location location2 = new Location(unLocode2, "Los Angeles");
    LocalDateTime departureTime = LocalDateTime.now();
    LocalDateTime arrivalTime = departureTime.plusDays(1);
    CarrierMovement carrierMovement1 = new CarrierMovement(location1, location2, departureTime, arrivalTime);
    CarrierMovement carrierMovement2 = new CarrierMovement(location1, location2, departureTime, arrivalTime);
    assertEquals(carrierMovement1.hashCode(), carrierMovement2.hashCode());
  }
}