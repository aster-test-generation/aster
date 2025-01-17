/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.time.LocalDate;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RouteSpecification_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_kwrl0_JEdo0() {
    UnLocode unLocode = new UnLocode("USCHI");
    Location origin = new Location(unLocode, "Chicago");
    Location destination = new Location(unLocode, "New York");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, LocalDate.of(2023, 1, 1));
    LocalDate arrivalDeadline = routeSpecification.getArrivalDeadline();
    assertEquals(LocalDate.of(2023, 1, 2), arrivalDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadlineWithNull_yWMb1_wDOd0() {
    UnLocode unLocode = new UnLocode("USCHI");
    Location origin = new Location(unLocode, "Chicago");
    Location destination = new Location(unLocode, "New York");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, LocalDate.now());
    LocalDate arrivalDeadline = routeSpecification.getArrivalDeadline();
    assertNotNull(arrivalDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadlineWithPastDate_mKvp2_eQGC0() {
    UnLocode unLocode = new UnLocode("USCHI");
    Location origin = new Location(unLocode, "Chicago");
    Location destination = new Location(unLocode, "New York");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, LocalDate.of(2022, 12, 31));
    LocalDate arrivalDeadline = routeSpecification.getArrivalDeadline();
    assertEquals(LocalDate.of(2022, 12, 31), arrivalDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testequals_SMLM0() throws Exception {
    UnLocode unLocode = new UnLocode("USCHI");
    Location location = new Location(unLocode, "Chicago");
    RouteSpecification routespecification = new RouteSpecification(location, location, LocalDate.now());
    assertTrue(routespecification.equals(routespecification));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationWithNullOrigin_Gpxv1_xEzr0() {
    Location destination = new Location(new UnLocode("USLAX"), "Los Angeles");
    RouteSpecification routeSpecification = new RouteSpecification(destination, destination, LocalDate.now());
    Location actualDestination = routeSpecification.getDestination();
    assertEquals(destination, actualDestination);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrigin_NullOrigin_TKfQ1_UCzv0_fid3() {
    Location destination = new Location(new UnLocode("USLAX"), "Los Angeles");
    LocalDate arrivalDeadline = LocalDate.of(2023, 1, 1);
    RouteSpecification routeSpecification = new RouteSpecification(null, destination, arrivalDeadline);
    assertNull(routeSpecification.getOrigin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_kwrl0_JEdo0_fid3() {
    UnLocode unLocode = new UnLocode("USCHI");
    Location origin = new Location(unLocode, "Chicago");
    Location destination = new Location(unLocode, "New York");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, LocalDate.of(2023, 1, 1));
    LocalDate arrivalDeadline = routeSpecification.getArrivalDeadline();
    assertEquals(LocalDate.of(2023, 1, 1), arrivalDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadlineWithNull_yWMb1_wDOd0_fid3() {
    UnLocode unLocode = new UnLocode("USCHI");
    Location origin = new Location(unLocode, "Chicago");
    Location destination = new Location(unLocode, "New York");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, null);
    LocalDate arrivalDeadline = routeSpecification.getArrivalDeadline();
    assertNull(arrivalDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testequals_SMLM0_fid3() throws Exception {
    UnLocode unLocode = new UnLocode("");
    Location location = new Location(unLocode, "");
    RouteSpecification routespecification = new RouteSpecification(location, location, LocalDate.now());
    assertTrue(routespecification.equals(routespecification));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_lbkt0_TDUn0_fid3() {
    RouteSpecification routeSpecification = new RouteSpecification(new Location(new UnLocode("USNYC"), "New York"), new Location(new UnLocode("USLA"), "Los Angeles"), LocalDate.of(2022, 12, 25));
    assertTrue(routeSpecification.equals(routeSpecification));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationWithNullOrigin_Gpxv1_xEzr0_fid3() {
    Location destination = new Location(new UnLocode("USLAX"), "Los Angeles");
    RouteSpecification routeSpecification = new RouteSpecification(null, destination, LocalDate.now());
    Location actualDestination = routeSpecification.getDestination();
    assertNull(actualDestination);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationWithValidOriginAndInvalidDestination_zzso7_dQRA0_fid3() {
    Location origin = new Location(new UnLocode("USNYC"), "New York City");
    Location destination = new Location(new UnLocode("USLAX"), "Los Angeles");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, LocalDate.now());
    Location actualDestination = routeSpecification.getDestination();
    assertEquals(origin, actualDestination);
  }
}