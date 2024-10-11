/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Cargo_Test_Failing {
  Cargo cargo;
  Cargo otherCargo;
  TrackingId trackingId;
  RouteSpecification routeSpecification;
  @Mock
  private Itinerary itinerary;
  @Mock
  private Delivery delivery;
  @Mock
  private HandlingHistory handlingHistory;
  @Mock
  private Itinerary itineraryMock;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString() throws Exception {
    trackingId = Mockito.mock(TrackingId.class);
    cargo = new Cargo(trackingId, null);
    Mockito.when(trackingId.toString()).thenReturn("Mocked Tracking Id");
    String result = cargo.toString();
    assertEquals("Mocked Tracking Id", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetTrackingId() throws Exception {
    trackingId = mock(TrackingId.class);
    cargo = new Cargo(trackingId, null);
    when(trackingId.getIdString()).thenReturn(" MockedTrackingId");
    TrackingId result = cargo.getTrackingId();
    assertEquals(trackingId, result);
    verify(trackingId, times(1)).getIdString();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testhashCode() throws Exception {
    trackingId = mock(TrackingId.class);
    cargo = new Cargo(trackingId, null);
    when(trackingId.hashCode()).thenReturn(123);
    assertEquals(123, cargo.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_febs0_bEHR0() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location location = new Location(unLocode, "name");
    Location origin = new Location(unLocode, "origin");
    Location destination = new Location(unLocode, "destination");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, java.time.LocalDate.now());
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    Itinerary itinerary = cargo.getItinerary();
    assertNotNull(itinerary);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRouteSpecification_IFvy0_Rqqr0() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location location = new Location(unLocode, "name");
    Location origin = new Location(unLocode, "origin");
    Location destination = new Location(unLocode, "destination");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, java.time.LocalDate.now());
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    RouteSpecification result = cargo.getRouteSpecification();
    assertEquals(routeSpecification, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDelivery_MQIN0_yiMw0() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location origin = new Location(unLocode, "originName");
    Location destination = new Location(unLocode, "destinationName");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, java.time.LocalDate.now());
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    Delivery delivery = cargo.getDelivery();
    assertNotNull(delivery);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_febs0_bEHR0_fid1() {
    UnLocode unLocode = new UnLocode("USNYC"); // changed to a valid UN/LOCODE
    Location location = new Location(unLocode, "name");
    Location origin = new Location(unLocode, "origin");
    Location destination = new Location(unLocode, "destination");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, java.time.LocalDate.now());
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    Itinerary itinerary = cargo.getItinerary();
    assertNotNull(itinerary);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRouteSpecification_IFvy0_Rqqr0_fid1() {
    UnLocode unLocode = new UnLocode("USNYC"); // Changed to a valid UN/LOCODE
    Location location = new Location(unLocode, "name");
    Location origin = new Location(unLocode, "origin");
    Location destination = new Location(unLocode, "destination");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, java.time.LocalDate.now());
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    RouteSpecification result = cargo.getRouteSpecification();
    assertEquals(routeSpecification, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDelivery_MQIN0_yiMw0_fid1() {
    UnLocode unLocode = new UnLocode("USNYC"); // Changed to a valid UN/LOCODE
    Location origin = new Location(unLocode, "originName");
    Location destination = new Location(unLocode, "destinationName");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, java.time.LocalDate.now());
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    Delivery delivery = cargo.getDelivery();
    assertNotNull(delivery);
  }
}