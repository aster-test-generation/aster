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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RouteSpecification_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_NPoS0() throws Exception {
    UnLocode unLocodeOrigin = new UnLocode("countryAndLocation");
    Location origin = new Location(unLocodeOrigin, "originName");
    UnLocode unLocodeDestination = new UnLocode("countryAndDestination");
    Location destination = new Location(unLocodeDestination, "destinationName");
    LocalDate arrivalDeadline = LocalDate.of(2022, 12, 31);
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, arrivalDeadline);
    assertEquals(arrivalDeadline, routeSpecification.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrigin_gYYg0() throws Exception {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location origin = new Location(unLocode, "originName");
    Location destination = new Location(new UnLocode(), "destinationName");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, LocalDate.now());
    Location result = routeSpecification.getOrigin();
    assertEquals(origin, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestination_iDsZ0() throws Exception {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location origin = new Location(unLocode, "originName");
    Location destination = new Location(new UnLocode(), "destinationName");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, LocalDate.now());
    Location result = routeSpecification.getDestination();
    assertEquals(destination, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_ReturnTrue_pRyj0() throws Exception {
    RouteSpecification routeSpecification = new RouteSpecification();
    assertTrue(routeSpecification.equals(routeSpecification));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_ReturnFalse_gCSa1() throws Exception {
    RouteSpecification routeSpecification = new RouteSpecification();
    assertFalse(routeSpecification.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ReturnFalse_GSbs2() throws Exception {
    RouteSpecification routeSpecification = new RouteSpecification();
    assertFalse(routeSpecification.equals(new Object()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameValues_ReturnTrue_wiQl3() throws Exception {
    UnLocode unLocode1 = new UnLocode("countryAndLocation");
    UnLocode unLocode2 = new UnLocode("countryAndLocation");
    Location location1 = new Location(unLocode1, "name");
    Location location2 = new Location(unLocode2, "name");
    RouteSpecification routeSpecification1 = new RouteSpecification(location1, location2, LocalDate.now());
    RouteSpecification routeSpecification2 = new RouteSpecification(location1, location2, LocalDate.now());
    assertTrue(routeSpecification1.equals(routeSpecification2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_abKV0() throws Exception {
    UnLocode unLocode1 = new UnLocode("countryAndLocation");
    Location origin = new Location(unLocode1, "originName");
    UnLocode unLocode2 = new UnLocode("countryAndLocation");
    Location destination = new Location(unLocode2, "destinationName");
    LocalDate arrivalDeadline = LocalDate.of(2022, 1, 1);
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, arrivalDeadline);
    RouteSpecification routeSpecification2 = new RouteSpecification(origin, destination, arrivalDeadline);
    assert routeSpecification.hashCode() == routeSpecification2.hashCode();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsSatisfiedBy_NullItinerary_ctUP0() throws Exception {
    RouteSpecification routeSpecification = new RouteSpecification(new Location(new UnLocode("countryAndLocation"), "origin"), new Location(new UnLocode("countryAndLocation"), "destination"), LocalDate.now().plusDays(1));
    assertFalse(routeSpecification.isSatisfiedBy(null));
  }
}