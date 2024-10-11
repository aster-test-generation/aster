/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CarrierMovement_Test_Failing {
  private CarrierMovement carrierMovement;
  private LocalDateTime departureTime;
  @Mock
  private LocalDateTime arrivalTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentDepartureLocation_ReturnsFalse_VclI0() throws Exception {
    Location departureLocation = new Location();
    Location arrivalLocation = new Location();
    LocalDateTime departureTime = LocalDateTime.of(2023, 1, 1, 12, 0);
    LocalDateTime arrivalTime = LocalDateTime.of(2023, 1, 2, 12, 0);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    Location differentLocation = new Location();
    CarrierMovement other = new CarrierMovement(differentLocation, arrivalLocation, departureTime, arrivalTime);
    assertFalse(carrierMovement.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDepartureLocation_GyNx0() throws Exception {
    Location departureLocation = Mockito.mock(Location.class);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, null, null, null);
    Mockito.when(departureLocation.getName()).thenReturn("New York");
    assertEquals("New York", carrierMovement.getDepartureLocation().getName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_RlOZ0() {
    LocalDateTime departureTime = LocalDateTime.of(2023, 1, 1, 12, 0);
    LocalDateTime arrivalTime = LocalDateTime.of(2023, 1, 2, 12, 0);
    Location departureLocation = mock(Location.class);
    Location arrivalLocation = mock(Location.class);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    when(departureLocation.hashCode()).thenReturn(123);
    when(arrivalLocation.hashCode()).thenReturn(456);
    int expectedHashCode = new org.apache.commons.lang3.builder.HashCodeBuilder()
            .append(123)
            .append(departureTime)
            .append(456)
            .append(arrivalTime)
            .toHashCode();
    assertEquals(expectedHashCode, carrierMovement.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDepartureLocation_GyNx0_fid2() throws Exception {
    Location departureLocation = Mockito.mock(Location.class);
    Location arrivalLocation = Mockito.mock(Location.class);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, null, null);
    Mockito.when(departureLocation.getName()).thenReturn("New York");
    assertEquals("New York", carrierMovement.getDepartureLocation().getName());
  }
}