/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Delivery_Test_Failing {
  private HandlingEvent lastEvent;
  Delivery delivery;
  @NotNull
  private boolean misdirected;
  @Embedded
  private HandlingActivity nextExpectedActivity;
  private Voyage currentVoyage;
  private LocalDateTime eta;
  private LocalDateTime calculatedAt;
  private boolean isUnloadedAtDestination;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMisdirectedWithToggle_tFAk2() {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(true);
    delivery.setMisdirected(false);
    assertTrue(delivery.isMisdirected());
    delivery.setMisdirected(true);
    assertFalse(delivery.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testisUnloadedAtDestination() throws Exception {
    delivery = new Delivery();
    // given
    HandlingEvent handlingEvent = new HandlingEvent();
    Itinerary itinerary = new Itinerary();
    RouteSpecification routeSpecification = new RouteSpecification();
    delivery = new Delivery(handlingEvent, itinerary, routeSpecification);
    // when
    isUnloadedAtDestination = delivery.isUnloadedAtDestination();
    // then
    assertTrue(isUnloadedAtDestination);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsUnloadedAtDestination_ivLC0() {
    Delivery delivery = new Delivery();
    boolean result = delivery.isUnloadedAtDestination();
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransportStatusWithNullParameter_OGIP1() {
    Delivery delivery = new Delivery();
    delivery.setTransportStatus(null);
    assertEquals(TransportStatus.UNKNOWN, delivery.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getEstimatedTimeOfArrival_returnsCorrectValue_withParams_xUBi1() {
    Delivery delivery = new Delivery(new HandlingEvent(), new Itinerary(), new RouteSpecification());
    LocalDateTime eta = delivery.getEstimatedTimeOfArrival();
    assertEquals(eta, delivery.getEstimatedTimeOfArrival());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getCalculatedAt_returns_default_value_if_calculated_at_not_set_YKna2() {
    Delivery delivery = new Delivery();
    assertEquals(LocalDateTime.MIN, delivery.getCalculatedAt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTransportStatus_ReturnsTransportStatus_xPub0() {
    Delivery delivery = new Delivery();
    TransportStatus transportStatus = delivery.getTransportStatus();
    assertEquals(TransportStatus.NOT_RECEIVED, transportStatus);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTransportStatus_WithLastEvent_ReturnsTransportStatus_Dkrm1() {
    HandlingEvent handlingEvent = new HandlingEvent();
    Delivery delivery = new Delivery(handlingEvent, null, null);
    TransportStatus transportStatus = delivery.getTransportStatus();
    assertEquals(TransportStatus.IN_PORT, transportStatus);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTransportStatus_WithLastEventAndItinerary_ReturnsTransportStatus_cyer2() {
    HandlingEvent handlingEvent = new HandlingEvent();
    Itinerary itinerary = new Itinerary();
    Delivery delivery = new Delivery(handlingEvent, itinerary, null);
    TransportStatus transportStatus = delivery.getTransportStatus();
    assertEquals(TransportStatus.ONBOARD_CARRIER, transportStatus);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMisdirectedWithToggle_tFAk2_2_fid2() {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(true);
    delivery.setMisdirected(false);
    delivery.setMisdirected(true);
    assertFalse(delivery.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetCurrentVoyage_QkJH0() throws Exception {
    currentVoyage = new Voyage();
    delivery = new Delivery();
    delivery.getCurrentVoyage();
    assertEquals(currentVoyage, delivery.getCurrentVoyage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testsetTransportStatus_HFaK0() throws Exception {
    TransportStatus transportStatus = mock(TransportStatus.class);
    Delivery delivery = new Delivery();
    delivery.setTransportStatus(transportStatus);
    TransportStatus newTransportStatus = mock(TransportStatus.class);
    delivery.setTransportStatus(newTransportStatus);
    verify(newTransportStatus, times(1)).sameValueAs(newTransportStatus);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTransportStatus_WithLastEventAndItineraryAndRouteSpecification_ReturnsTransportStatus_dcWh3_GjTV0() {
    HandlingEvent handlingEvent = new HandlingEvent();
    Itinerary itinerary = new Itinerary();
    RouteSpecification routeSpecification = new RouteSpecification();
    Delivery delivery = new Delivery(handlingEvent, itinerary, routeSpecification);
    TransportStatus transportStatus = delivery.getTransportStatus();
    assertEquals(TransportStatus.NOT_RECEIVED, transportStatus);
  }
}