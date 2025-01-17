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
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CarrierMovement_Test_Passing {
  private CarrierMovement carrierMovement;
  private LocalDateTime departureTime;
  @Mock
  private LocalDateTime arrivalTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentArrivalLocation_ReturnsFalse_RcRo0() throws Exception {
    Location departureLocation = mock(Location.class);
    Location arrivalLocation = mock(Location.class);
    LocalDateTime departureTime = LocalDateTime.of(2023, 1, 1, 12, 0);
    LocalDateTime arrivalTime = LocalDateTime.of(2023, 1, 2, 12, 0);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    Location differentArrivalLocation = mock(Location.class);
    CarrierMovement other = new CarrierMovement(departureLocation, differentArrivalLocation, departureTime, arrivalTime);
    assertFalse(carrierMovement.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentDepartureTime_ReturnsFalse_NATd0() throws Exception {
    Location departureLocation = Mockito.mock(Location.class);
    Location arrivalLocation = Mockito.mock(Location.class);
    LocalDateTime departureTime = LocalDateTime.of(2023, 1, 1, 12, 0);
    LocalDateTime arrivalTime = LocalDateTime.of(2023, 1, 2, 12, 0);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    LocalDateTime differentTime = LocalDateTime.of(2023, 1, 1, 13, 0);
    CarrierMovement other = new CarrierMovement(departureLocation, arrivalLocation, differentTime, arrivalTime);
    assertFalse(carrierMovement.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentArrivalTime_ReturnsFalse_AUqx0() throws Exception {
    Location departureLocation = Mockito.mock(Location.class);
    Location arrivalLocation = Mockito.mock(Location.class);
    LocalDateTime departureTime = LocalDateTime.of(2023, 1, 1, 12, 0);
    LocalDateTime arrivalTime = LocalDateTime.of(2023, 1, 2, 12, 0);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    LocalDateTime differentTime = LocalDateTime.of(2023, 1, 2, 13, 0);
    CarrierMovement other = new CarrierMovement(departureLocation, arrivalLocation, departureTime, differentTime);
    assertFalse(carrierMovement.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_hjXK0_Qjsu0() {
    UnLocode unLocode = new UnLocode("USNYC");
    Location location1 = new Location(unLocode, "New York");
    LocalDateTime time1 = LocalDateTime.of(2023, 3, 10, 10, 30);
    LocalDateTime time2 = LocalDateTime.of(2023, 3, 20, 10, 30);
    CarrierMovement movement1 = new CarrierMovement(location1, location1, time1, time2);
    assertTrue(movement1.equals(movement1));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObject_SameValues_qduV1_dQgi0() {
    UnLocode unLocode1 = new UnLocode("USNYC");
    Location location1 = new Location(unLocode1, "New York");
    UnLocode unLocode2 = new UnLocode("USNYC");
    Location location2 = new Location(unLocode2, "New York");
    LocalDateTime time1 = LocalDateTime.of(2023, 3, 10, 10, 30);
    LocalDateTime time2 = LocalDateTime.of(2023, 3, 20, 10, 30);
    CarrierMovement movement1 = new CarrierMovement(location1, location1, time1, time2);
    CarrierMovement movement2 = new CarrierMovement(location2, location2, time1, time2);
    assertTrue(movement1.equals(movement2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_ysmh2_uVvq0() {
    UnLocode unLocode = new UnLocode("USNYC");
    Location location1 = new Location(unLocode, "New York");
    LocalDateTime time1 = LocalDateTime.of(2023, 3, 10, 10, 30);
    LocalDateTime time2 = LocalDateTime.of(2023, 3, 20, 10, 30);
    CarrierMovement movement1 = new CarrierMovement(location1, location1, time1, time2);
    assertFalse(movement1.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObject_DifferentValues_PYWx3_jOsR0() {
    UnLocode unLocode1 = new UnLocode("USNYC");
    UnLocode unLocode2 = new UnLocode("USLAX");
    Location location1 = new Location(unLocode1, "New York");
    Location location2 = new Location(unLocode2, "Los Angeles");
    LocalDateTime time1 = LocalDateTime.of(2023, 3, 10, 10, 30);
    LocalDateTime time2 = LocalDateTime.of(2023, 3, 20, 10, 30);
    LocalDateTime time3 = LocalDateTime.of(2023, 4, 10, 10, 30);
    LocalDateTime time4 = LocalDateTime.of(2023, 4, 20, 10, 30);
    CarrierMovement movement1 = new CarrierMovement(location1, location1, time1, time2);
    CarrierMovement movement2 = new CarrierMovement(location2, location2, time3, time4);
    assertFalse(movement1.equals(movement2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDepartureLocation_xDTT0_uRDF0() {
    UnLocode departureUnLocode = new UnLocode("USNYC");
    Location departureLocation = new Location(departureUnLocode, "New York");
    UnLocode arrivalUnLocode = new UnLocode("GBLON");
    Location arrivalLocation = new Location(arrivalUnLocode, "London");
    LocalDateTime departureTime = LocalDateTime.of(2023, 10, 1, 14, 0);
    LocalDateTime arrivalTime = LocalDateTime.of(2023, 10, 2, 14, 0);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    Location result = carrierMovement.getDepartureLocation();
    assertEquals(departureLocation, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalTime_yRse0() {
    LocalDateTime arrivalTime = LocalDateTime.of(2023, 3, 15, 10, 0);
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("USNYC"), "New York"), new Location(new UnLocode("GBLON"), "London"), LocalDateTime.now(), arrivalTime);
    LocalDateTime result = carrierMovement.getArrivalTime();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalTime_uKzZ0_WNts0() {
    LocalDateTime expectedArrivalTime = LocalDateTime.of(2023, 10, 5, 14, 30);
    Location departureLocation = new Location(new UnLocode("USNYC"), "New York");
    Location arrivalLocation = new Location(new UnLocode("GBLON"), "London");
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, LocalDateTime.of(2023, 10, 4, 10, 0), expectedArrivalTime);
    LocalDateTime actualArrivalTime = carrierMovement.getArrivalTime();
    assertEquals(expectedArrivalTime, actualArrivalTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeConsistency_wARJ0_kqdM0() {
    LocalDateTime departureTime = LocalDateTime.of(2023, 3, 15, 10, 0);
    LocalDateTime arrivalTime = LocalDateTime.of(2023, 3, 16, 10, 0);
    UnLocode departureUnLocode = new UnLocode("USNYC");
    UnLocode arrivalUnLocode = new UnLocode("GBLON");
    Location departureLocation = new Location(departureUnLocode, "New York");
    Location arrivalLocation = new Location(arrivalUnLocode, "London");
    CarrierMovement movement1 = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    CarrierMovement movement2 = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    assertEquals(movement1.hashCode(), movement2.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentDepartureLocation_ReturnsFalse_VclI0_fid2() throws Exception {
    Location departureLocation = new Location();
    Location arrivalLocation = new Location();
    LocalDateTime departureTime = LocalDateTime.of(2023, 1, 1, 12, 0);
    LocalDateTime arrivalTime = LocalDateTime.of(2023, 1, 2, 12, 0);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    Location differentLocation = new Location();
    CarrierMovement other = new CarrierMovement(differentLocation, arrivalLocation, departureTime, arrivalTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_RlOZ0_fid2() {
    LocalDateTime departureTime = LocalDateTime.of(2023, 1, 1, 12, 0);
    LocalDateTime arrivalTime = LocalDateTime.of(2023, 1, 2, 12, 0);
    Location departureLocation = mock(Location.class);
    Location arrivalLocation = mock(Location.class);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    int expectedHashCode = new org.apache.commons.lang3.builder.HashCodeBuilder()
            .append(System.identityHashCode(departureLocation))
            .append(departureTime)
            .append(System.identityHashCode(arrivalLocation))
            .append(arrivalTime)
            .toHashCode();
    assertEquals(expectedHashCode, carrierMovement.hashCode());
  }
}