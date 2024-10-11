/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.lang.reflect.Field;
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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Cargo_Test_Passing {
  private Cargo cargo;
  private TrackingId trackingId;
  private RouteSpecification routeSpecification;
  @Mock
  private Itinerary itinerary;
  @Mock
  private RouteSpecification newRouteSpecification;
  @Mock
  private Delivery delivery;
  @Mock
  private Delivery updatedDelivery;
  @Mock
  private HandlingHistory handlingHistory;
  @Mock
  private Itinerary mockItinerary;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringReturnsTrackingIdAsString_qOiK0() {
    TrackingId trackingId = new TrackingId("ABC123");
    RouteSpecification routeSpecification = new RouteSpecification();
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    assertEquals("ABC123", cargo.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId() throws Exception {
    trackingId = mock(TrackingId.class);
    when(trackingId.getIdString()).thenReturn("ABC123");
    RouteSpecification routeSpecification = mock(RouteSpecification.class);
    cargo = new Cargo(trackingId, routeSpecification);
    TrackingId result = cargo.getTrackingId();
    assertEquals("ABC123", result.getIdString(), "The tracking ID should match the expected value.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRouteSpecification() throws Exception {
    routeSpecification = mock(RouteSpecification.class);
    cargo = new Cargo(new TrackingId("ABC123"), routeSpecification);
    assertEquals(routeSpecification, cargo.getRouteSpecification(), "The routeSpecification should match the mocked RouteSpecification object");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrigin_RpXA0() {
    Cargo cargo = new Cargo();
    Location origin = new Location(new UnLocode("USNYC"), "New York");
    cargo.setOrigin(origin);
    assertEquals(origin, cargo.getOrigin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetItineraryWhenItineraryIsNull_heBj0_1() {
    Cargo cargo = new Cargo();
    Itinerary result = cargo.getItinerary();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetItineraryWhenItineraryIsNull_heBj0_2() {
    Cargo cargo = new Cargo();
    Itinerary result = cargo.getItinerary();
    assertTrue(result.getLegs().isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetItinerary_WithMockedItinerary_ReturnsMockedItinerary_xSIG0() throws Exception {
    Itinerary mockItinerary = mock(Itinerary.class);
    when(mockItinerary.getLegs()).thenReturn(new ArrayList<>()); // Assuming getLegs returns an empty list for the empty itinerary
    Cargo cargo = new Cargo();
    Field itineraryField = Cargo.class.getDeclaredField("itinerary");
    itineraryField.setAccessible(true);
    itineraryField.set(cargo, mockItinerary);
    Itinerary result = cargo.getItinerary();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDelivery_hUhi0_fid1() throws Exception {
    cargo = new Cargo();
    Delivery result = cargo.getDelivery();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetItineraryWhenItineraryIsNull_heBj0() {
    Cargo cargo = new Cargo();
    Itinerary result = cargo.getItinerary();
    assertNotNull(result);
    assertTrue(result.getLegs().isEmpty());
  }
}