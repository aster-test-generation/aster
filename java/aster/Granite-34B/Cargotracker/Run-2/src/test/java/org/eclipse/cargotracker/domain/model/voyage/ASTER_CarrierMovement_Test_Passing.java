/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CarrierMovement_Test_Passing {
  private LocalDateTime departureTime;
  CarrierMovement carriermovement;
  private UnLocode unLocode;
  private LocalDateTime arrivalTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNonCarrierMovementObject_mOXf1() {
    CarrierMovement carrierMovement = new CarrierMovement();
    assertTrue(!carrierMovement.equals(""));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSameObject_SjbJ2() {
    CarrierMovement carrierMovement = new CarrierMovement();
    assertTrue(carrierMovement.equals(carrierMovement));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNullObject_vYEX0_fid1() {
    CarrierMovement carrierMovement = new CarrierMovement();
    assertFalse(carrierMovement.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getDepartureLocation_Zylz0_XDOO0() {
    Location departureLocation = new Location(new UnLocode("USNYC"), "New York");
    Location arrivalLocation = new Location(new UnLocode("USDAL"), "Dallas");
    LocalDateTime departureTime = LocalDateTime.now();
    LocalDateTime arrivalTime = LocalDateTime.now().plusDays(1);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    Location actualDepartureLocation = carrierMovement.getDepartureLocation();
    assertEquals(departureLocation, actualDepartureLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getDepartureLocation_emptyDepartureLocation_EfsA2_HWUM0() {
    Location departureLocation = new Location(new UnLocode("USDAL"), "Dallas");
    Location arrivalLocation = new Location(new UnLocode("USDAL"), "Dallas");
    LocalDateTime departureTime = LocalDateTime.now();
    LocalDateTime arrivalTime = LocalDateTime.now().plusDays(1);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    Location actualDepartureLocation = carrierMovement.getDepartureLocation();
    assertEquals(carrierMovement.getDepartureLocation(), actualDepartureLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTimeTest_seDj0_uMIa0() {
    Location departureLocation = new Location(new UnLocode("USCHI"), "Chicago, IL, US");
    Location arrivalLocation = new Location(new UnLocode("USNYC"), "New York, NY, US");
    LocalDateTime departureTime = LocalDateTime.of(2022, 1, 1, 10, 0);
    LocalDateTime arrivalTime = LocalDateTime.of(2022, 1, 1, 12, 30);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    assertEquals(arrivalTime, carrierMovement.getArrivalTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_XwTS0_MCSx0() {
    Location departureLocation = new Location(new UnLocode("USCHI"), "Chicago");
    Location arrivalLocation = new Location(new UnLocode("USEWR"), "EWR");
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 1, 11, 0));
    assertEquals(new HashCodeBuilder().append(carrierMovement.getDepartureLocation()).append(carrierMovement.getDepartureTime()).append(carrierMovement.getArrivalLocation()).append(carrierMovement.getArrivalTime()).toHashCode(), carrierMovement.hashCode());
  }
}