/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Cargo_Test_Failing {
  @Mock
  private TrackingId trackingId;
  @Mock
  private RouteSpecification routeSpecification;
  Cargo cargo;
  @Mock
  private Delivery delivery;
  @Mock
  private Itinerary itinerary;
  @Mock
  private HandlingHistory handlingHistory;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_1() throws Exception {
    cargo = new Cargo(trackingId, routeSpecification);
    // Create another Cargo object with the same attributes
    Cargo anotherCargo = new Cargo(trackingId, routeSpecification);
    // Assert that the two objects are equal
    // Create another Cargo object with different attributes
    TrackingId differentTrackingId = Mockito.mock(TrackingId.class);
    RouteSpecification differentRouteSpecification = Mockito.mock(RouteSpecification.class);
    Cargo differentCargo = new Cargo(differentTrackingId, differentRouteSpecification);
    // Assert that the two objects are not equal
    assertEquals(cargo, anotherCargo);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString() {
    cargo = new Cargo(trackingId, new RouteSpecification());
    // Arrange
    String expected = "TrackingId";
    // Act
    String actual = cargo.toString();
    // Assert
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode() {
    cargo = new Cargo(trackingId, new RouteSpecification());
    // Arrange
    when(trackingId.hashCode()).thenReturn(42);
    // Act
    int result = cargo.hashCode();
    // Assert
    assertEquals(42, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_XdKz0_zNsQ0() {
    TrackingId trackingId = new TrackingId("123");
    Location origin = new Location(new UnLocode("DE HAM"), "Hamburg");
    Location destination = new Location(new UnLocode("FRPAR"), "Paris");
    java.time.LocalDate arrivalDeadline = java.time.LocalDate.of(2022, 1, 1);
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, arrivalDeadline);
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    assertEquals("123", cargo.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRouteSpecification_KYpQ0_BPcB0_1() {
    TrackingId trackingId = new TrackingId("123");
    Location origin = new Location(new UnLocode("DE"), "Frankfurt");
    Location destination = new Location(new UnLocode("US"), "New York");
    java.time.LocalDate arrivalDeadline = java.time.LocalDate.of(2022, 1, 1);
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, arrivalDeadline);
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    RouteSpecification result = cargo.getRouteSpecification();
    assertEquals(routeSpecification, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRouteSpecification_KYpQ0_BPcB0_2() {
    TrackingId trackingId = new TrackingId("123");
    Location origin = new Location(new UnLocode("DE"), "Frankfurt");
    Location destination = new Location(new UnLocode("US"), "New York");
    java.time.LocalDate arrivalDeadline = java.time.LocalDate.of(2022, 1, 1);
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, arrivalDeadline);
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    RouteSpecification result = cargo.getRouteSpecification();
    assertNotNull(result.getOrigin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRouteSpecification_KYpQ0_BPcB0_3() {
    TrackingId trackingId = new TrackingId("123");
    Location origin = new Location(new UnLocode("DE"), "Frankfurt");
    Location destination = new Location(new UnLocode("US"), "New York");
    java.time.LocalDate arrivalDeadline = java.time.LocalDate.of(2022, 1, 1);
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, arrivalDeadline);
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    RouteSpecification result = cargo.getRouteSpecification();
    assertNotNull(result.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRouteSpecification_KYpQ0_BPcB0_4() {
    TrackingId trackingId = new TrackingId("123");
    Location origin = new Location(new UnLocode("DE"), "Frankfurt");
    Location destination = new Location(new UnLocode("US"), "New York");
    java.time.LocalDate arrivalDeadline = java.time.LocalDate.of(2022, 1, 1);
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, arrivalDeadline);
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    RouteSpecification result = cargo.getRouteSpecification();
    assertNotNull(result.getDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_iprs0_qokQ0() {
    TrackingId trackingId = new TrackingId("testId");
    UnLocode unLocode = new UnLocode("testCountryAndLocation");
    Location origin = new Location(unLocode, "testName");
    Location destination = new Location(unLocode, "testName");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, java.time.LocalDate.now());
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    int hashCode = cargo.hashCode();
    assertEquals(trackingId.hashCode(), hashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testassignToRoute_MBzE0() {
    cargo = new Cargo();
    when(routeSpecification.getOrigin()).thenReturn(new Location(new UnLocode("DE"), "Berlin"));
    when(routeSpecification.getDestination()).thenReturn(new Location(new UnLocode("FR"), "Paris"));
    when(itinerary.getLegs()).thenReturn(new ArrayList<>());
    cargo.assignToRoute(itinerary);
    verify(delivery).updateOnRouting(routeSpecification, itinerary);
    assertEquals(itinerary, cargo.getItinerary());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrigin_cwZG0() {
    MockitoAnnotations.initMocks(this);
    UnLocode unLocode = Mockito.mock(UnLocode.class);
    Location expectedOrigin = new Location(unLocode, "expectedOrigin");
    cargo.setOrigin(expectedOrigin);
    Mockito.verify(cargo, Mockito.times(1)).setOrigin(Mockito.mock(Location.class));
    assertEquals(expectedOrigin, cargo.getOrigin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals() throws Exception {
    cargo = new Cargo(trackingId, routeSpecification);
    // Create another Cargo object with the same attributes
    Cargo anotherCargo = new Cargo(trackingId, routeSpecification);
    // Assert that the two objects are equal
    assertEquals(cargo, anotherCargo);
    // Create another Cargo object with different attributes
    TrackingId differentTrackingId = Mockito.mock(TrackingId.class);
    RouteSpecification differentRouteSpecification = Mockito.mock(RouteSpecification.class);
    Cargo differentCargo = new Cargo(differentTrackingId, differentRouteSpecification);
    // Assert that the two objects are not equal
    assertNotEquals(cargo, differentCargo);
  }
}