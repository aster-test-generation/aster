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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CarrierMovement_Test_Failing {
  @Mock
  private CarrierMovement carrierMovement;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_ReturnsFalse_HmwZ0() throws Exception {
    Location departureLocation = new Location(new UnLocode("countryAndLocation"), "name");
    Location arrivalLocation = new Location(new UnLocode("countryAndLocation"), "name");
    CarrierMovement carriermovement = new CarrierMovement(departureLocation, arrivalLocation, LocalDateTime.now(), LocalDateTime.now());
    CarrierMovement nullObject = null;
    boolean result = carriermovement.equals(null);
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetArrivalTime_cqHt0() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location departureLocation = new Location(unLocode, "departureLocation");
    UnLocode unLocode1 = new UnLocode("countryAndLocation");
    Location arrivalLocation = new Location(unLocode1, "arrivalLocation");
    LocalDateTime departureTime = LocalDateTime.now();
    LocalDateTime arrivalTime = LocalDateTime.now();
    CarrierMovement carriermovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    LocalDateTime result = carriermovement.getArrivalTime();
    assertEquals(arrivalTime, result);
  }
}