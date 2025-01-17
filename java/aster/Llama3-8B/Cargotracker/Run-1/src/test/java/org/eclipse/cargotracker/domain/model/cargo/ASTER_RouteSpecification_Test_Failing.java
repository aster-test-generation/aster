/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.builder.HashCodeBuilder;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RouteSpecification_Test_Failing {
  @Mock
  private LocalDate arrivalDeadline;
  private RouteSpecification routespecification;
  @Mock
  private Itinerary itinerary;
  private RouteSpecification routeSpecification;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_WXPr0_GnZe0() {
    UnLocode unLocode = new UnLocode("US LAX");
    Location location = new Location(unLocode, "Los Angeles");
    RouteSpecification routeSpecification = new RouteSpecification(location, location, LocalDate.now());
    int result = routeSpecification.hashCode();
    assertEquals(result, new HashCodeBuilder().append(routeSpecification.getOrigin().getUnLocode()).append(routeSpecification.getDestination().getUnLocode()).append(routeSpecification.getArrivalDeadline()).toHashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetArrivalDeadline_HbDq0() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location origin = new Location(unLocode, "name");
    UnLocode unLocode1 = new UnLocode("countryAndLocation");
    Location destination = new Location(unLocode1, "name");
    LocalDate arrivalDeadline = LocalDate.now();
    RouteSpecification routespecification = new RouteSpecification(origin, destination, arrivalDeadline);
    LocalDate result = routespecification.getArrivalDeadline();
    assertEquals(arrivalDeadline, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testisSatisfiedBy_qrkM0() {
    Location origin = new Location(new UnLocode("countryAndLocation"), "name");
    Location destination = new Location(new UnLocode("countryAndLocation"), "name");
    LocalDate arrivalDeadline = LocalDate.now();
    RouteSpecification routespecification = new RouteSpecification(origin, destination, arrivalDeadline);
    when(origin.hashCode()).thenReturn(origin.hashCode());
    when(destination.hashCode()).thenReturn(destination.hashCode());
    when(arrivalDeadline.equals(itinerary.getFinalArrivalDate().toLocalDate())).thenReturn(true);
    when(origin.hashCode()).thenReturn(origin.hashCode());
    when(destination.hashCode()).thenReturn(destination.hashCode());
    boolean result = routespecification.isSatisfiedBy(itinerary);
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_KKxp0_1() throws Exception {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location location = new Location(unLocode, "name");
    LocalDate arrivalDeadline = LocalDate.now();
    RouteSpecification routespecification = new RouteSpecification(location, location, arrivalDeadline);
    RouteSpecification anotherRoutespecification = new RouteSpecification(location, location, arrivalDeadline);
    RouteSpecification differentRoutespecification = new RouteSpecification(location, location, arrivalDeadline.plusDays(1));
    Object object = new Object();
    assertEquals(routespecification, routespecification);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_KKxp0_2() throws Exception {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location location = new Location(unLocode, "name");
    LocalDate arrivalDeadline = LocalDate.now();
    RouteSpecification routespecification = new RouteSpecification(location, location, arrivalDeadline);
    RouteSpecification anotherRoutespecification = new RouteSpecification(location, location, arrivalDeadline);
    RouteSpecification differentRoutespecification = new RouteSpecification(location, location, arrivalDeadline.plusDays(1));
    Object object = new Object();
    assertEquals(routespecification, anotherRoutespecification);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_KKxp0_3() throws Exception {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location location = new Location(unLocode, "name");
    LocalDate arrivalDeadline = LocalDate.now();
    RouteSpecification routespecification = new RouteSpecification(location, location, arrivalDeadline);
    RouteSpecification anotherRoutespecification = new RouteSpecification(location, location, arrivalDeadline);
    RouteSpecification differentRoutespecification = new RouteSpecification(location, location, arrivalDeadline.plusDays(1));
    Object object = new Object();
    assertNotEquals(routespecification, null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_KKxp0_4() throws Exception {
    UnLocode unLocode = new UnLocode("USNYN"); // Changed to a valid UN/LOCODE
    Location location = new Location(unLocode, "name");
    LocalDate arrivalDeadline = LocalDate.now();
    RouteSpecification routespecification = new RouteSpecification(location, location, arrivalDeadline);
    RouteSpecification anotherRoutespecification = new RouteSpecification(location, location, arrivalDeadline);
    RouteSpecification differentRoutespecification = new RouteSpecification(location, location, arrivalDeadline.plusDays(1));
    Object object = new Object();
    assertEquals(routespecification, anotherRoutespecification); // Changed to assertEquals
    assertNotEquals(routespecification, differentRoutespecification); // No change
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_KKxp0_5() throws Exception {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location location = new Location(unLocode, "name");
    LocalDate arrivalDeadline = LocalDate.now();
    RouteSpecification routespecification = new RouteSpecification(location, location, arrivalDeadline);
    RouteSpecification anotherRoutespecification = new RouteSpecification(location, location, arrivalDeadline);
    RouteSpecification differentRoutespecification = new RouteSpecification(location, location, arrivalDeadline.plusDays(1));
    Object object = new Object();
    assertNotEquals(routespecification, object);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_Femv0() {
    Location origin = new Location(new UnLocode("countryAndLocation"), "name");
    Location destination = new Location(new UnLocode("countryAndLocation"), "name");
    LocalDate arrivalDeadline = LocalDate.now();
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, arrivalDeadline);
    when(origin.hashCode()).thenReturn(1);
    when(destination.hashCode()).thenReturn(6);
    when(arrivalDeadline.hashCode()).thenReturn(3);
    int result = routeSpecification.hashCode();
    assertEquals(10, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_KKxp0_4_fid3() throws Exception {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location location = new Location(unLocode, "name");
    LocalDate arrivalDeadline = LocalDate.now();
    RouteSpecification routespecification = new RouteSpecification(location, location, arrivalDeadline);
    RouteSpecification anotherRoutespecification = new RouteSpecification(location, location, arrivalDeadline);
    RouteSpecification differentRoutespecification = new RouteSpecification(location, location, arrivalDeadline.plusDays(1));
    Object object = new Object();
    assertNotEquals(routespecification, differentRoutespecification);
  }
}