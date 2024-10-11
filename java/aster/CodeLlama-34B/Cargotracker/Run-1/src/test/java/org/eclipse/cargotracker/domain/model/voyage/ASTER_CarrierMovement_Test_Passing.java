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
public class Aster_CarrierMovement_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalLocation_RHag1_axgo0_3() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("USLAX"), "New York"), new Location(new UnLocode("CALOS"), "Los Angeles"), LocalDateTime.now(), LocalDateTime.now());
    Location arrivalLocation = carrierMovement.getArrivalLocation();
    assertEquals(new UnLocode("CALOS"), arrivalLocation.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalLocation_RHag1_axgo0_4() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("USLAX"), "Los Angeles"), new Location(new UnLocode("USNYC"), "New York"), LocalDateTime.now(), LocalDateTime.now());
    Location arrivalLocation = carrierMovement.getArrivalLocation();
    assertEquals(new Location(new UnLocode("USNYC"), "New York"), arrivalLocation);
  }
}