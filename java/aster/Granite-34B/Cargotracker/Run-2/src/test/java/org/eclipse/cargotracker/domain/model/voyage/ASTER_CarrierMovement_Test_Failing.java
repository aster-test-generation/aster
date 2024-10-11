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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CarrierMovement_Test_Failing {
  private LocalDateTime departureTime;
  CarrierMovement carriermovement;
  private UnLocode unLocode;
  private LocalDateTime arrivalTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNullObject_vYEX0() {
    CarrierMovement carrierMovement = new CarrierMovement();
    assertTrue(carrierMovement.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getDepartureLocation_nullDepartureLocation_LWrc1_sxgx0() {
    Location arrivalLocation = new Location(new UnLocode("USDAL"), "Dallas");
    LocalDateTime departureTime = LocalDateTime.now();
    LocalDateTime arrivalTime = LocalDateTime.now().plusDays(1);
    CarrierMovement carrierMovement = new CarrierMovement(null, arrivalLocation, departureTime, arrivalTime);
    Location actualDepartureLocation = carrierMovement.getDepartureLocation();
    assertEquals(null, actualDepartureLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getDepartureLocation_departureLocationWithNoUnLocode_oNuh3_WOdW0() {
    Location departureLocation = new Location(new UnLocode(null), "New York");
    Location arrivalLocation = new Location(new UnLocode("USDAL"), "Dallas");
    LocalDateTime departureTime = LocalDateTime.now();
    LocalDateTime arrivalTime = LocalDateTime.now().plusDays(1);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    Location actualDepartureLocation = carrierMovement.getDepartureLocation();
    assertEquals(departureLocation, actualDepartureLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getDepartureLocation_departureLocationWithNoName_cKeo4_qROc0() {
    Location departureLocation = new Location(new UnLocode("USNYC"), null);
    Location arrivalLocation = new Location(new UnLocode("USDAL"), "Dallas");
    LocalDateTime departureTime = LocalDateTime.now();
    LocalDateTime arrivalTime = LocalDateTime.now().plusDays(1);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    Location actualDepartureLocation = carrierMovement.getDepartureLocation();
    assertEquals(departureLocation, actualDepartureLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_departureLocationNull_QrYE1_tsym0() {
    Location location = new Location(new UnLocode("USEWR"), "EWR");
    CarrierMovement carrierMovement = new CarrierMovement(null, location, LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 1, 11, 0));
    assertEquals(new HashCodeBuilder().append(carrierMovement.getDepartureLocation()).append(carrierMovement.getDepartureTime()).append(carrierMovement.getArrivalLocation()).append(carrierMovement.getArrivalTime()).toHashCode(), carrierMovement.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_departureTimeNull_TRlX2_jMeT0() {
    Location departureLocation = new Location(new UnLocode("USCHI"), "Chicago");
    Location arrivalLocation = new Location(new UnLocode("USEWR"), "EWR");
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, null, LocalDateTime.of(2022, 1, 1, 11, 0));
    assertEquals(new HashCodeBuilder().append(carrierMovement.getDepartureLocation()).append(carrierMovement.getDepartureTime()).append(carrierMovement.getArrivalLocation()).append(carrierMovement.getArrivalTime()).toHashCode(), carrierMovement.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_arrivalLocationNull_bSmq3_cuaw0() {
    Location arrivalLocation = null;
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("USCHI"), "Chicago"), arrivalLocation, LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 1, 11, 0));
    assertEquals(new HashCodeBuilder().append(carrierMovement.getDepartureLocation()).append(carrierMovement.getDepartureTime()).append(carrierMovement.getArrivalLocation()).append(carrierMovement.getArrivalTime()).toHashCode(), carrierMovement.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_arrivalTimeNull_CERe4_ndkC0() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("USCHI"), "Chicago"), new Location(new UnLocode("USEWR"), "EWR"), LocalDateTime.of(2022, 1, 1, 10, 0), null);
    assertEquals(new HashCodeBuilder().append(carrierMovement.getDepartureLocation()).append(carrierMovement.getDepartureTime()).append(carrierMovement.getArrivalLocation()).append(carrierMovement.getArrivalTime()).toHashCode(), carrierMovement.hashCode());
  }
}