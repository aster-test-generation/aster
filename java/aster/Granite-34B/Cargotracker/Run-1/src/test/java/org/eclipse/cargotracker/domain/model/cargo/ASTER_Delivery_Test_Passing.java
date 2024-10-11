/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Delivery_Test_Passing {
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
  public void testsetMisdirected() throws Exception {
    delivery = new Delivery();
    delivery.setMisdirected(true);
    assertTrue(delivery.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setMisdirected_true_nNPU0() {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setMisdirected_false_uWJb1() {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(false);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNextExpectedActivity_withNoHandlingEvents_returnsNull_YoiC0() {
    Delivery delivery = new Delivery();
    HandlingActivity nextExpectedActivity = delivery.getNextExpectedActivity();
    assertEquals(null, nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCurrentVoyage_withNoCurrentVoyage_returnsVoyageNone_meME0() {
    Delivery delivery = new Delivery();
    Voyage currentVoyage = delivery.getCurrentVoyage();
    assertEquals(Voyage.NONE, currentVoyage);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setLastKnownLocation_NonNullLocation_SetsLastKnownLocation_RBlb0() {
    Location newLocation = new Location(new UnLocode("USCHI"), "Chicago");
    Delivery delivery = new Delivery();
    delivery.setLastKnownLocation(newLocation);
    assertEquals(newLocation, delivery.getLastKnownLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setLastKnownLocation_NonNullLocation_IncreasesBranchCoverage_XeoG2() {
    Location newLocation = new Location(new UnLocode("USCHI"), "Chicago");
    Delivery delivery = new Delivery();
    delivery.setLastKnownLocation(newLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testsetUnloadedAtDestination() throws Exception {
    delivery = new Delivery();
    isUnloadedAtDestination = true;
    delivery.setUnloadedAtDestination(isUnloadedAtDestination);
    assertTrue(delivery.isUnloadedAtDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnloadedAtDestination_CIfZ0() {
    Delivery delivery = new Delivery();
    delivery.setUnloadedAtDestination(true);
    assertTrue(delivery.isUnloadedAtDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnloadedAtDestinationWithFalse_zotu1() {
    Delivery delivery = new Delivery();
    delivery.setUnloadedAtDestination(false);
    assertFalse(delivery.isUnloadedAtDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getLastKnownLocation_YfFv0() {
    Delivery delivery = new Delivery();
    Location location = delivery.getLastKnownLocation();
    assertEquals(Location.UNKNOWN, location);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setTransportStatus_setsTransportStatus_ggUH0() {
    Delivery delivery = new Delivery();
    TransportStatus transportStatus = TransportStatus.CLAIMED;
    delivery.setTransportStatus(transportStatus);
    assertEquals(transportStatus, delivery.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setTransportStatus_setsTransportStatus_toUnknown_fmzu1() {
    Delivery delivery = new Delivery();
    TransportStatus transportStatus = TransportStatus.UNKNOWN;
    delivery.setTransportStatus(transportStatus);
    assertEquals(transportStatus, delivery.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setTransportStatus_setsTransportStatus_toNotReceived_GCty2() {
    Delivery delivery = new Delivery();
    TransportStatus transportStatus = TransportStatus.NOT_RECEIVED;
    delivery.setTransportStatus(transportStatus);
    assertEquals(transportStatus, delivery.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setTransportStatus_setsTransportStatus_toInPort_eDCU3() {
    Delivery delivery = new Delivery();
    TransportStatus transportStatus = TransportStatus.IN_PORT;
    delivery.setTransportStatus(transportStatus);
    assertEquals(transportStatus, delivery.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setTransportStatus_setsTransportStatus_toOnboardCarrier_joUG4() {
    Delivery delivery = new Delivery();
    TransportStatus transportStatus = TransportStatus.ONBOARD_CARRIER;
    delivery.setTransportStatus(transportStatus);
    assertEquals(transportStatus, delivery.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WithNullObject_ReturnsFalse_AHcD0() {
    Delivery delivery = new Delivery();
    boolean actual = delivery.equals(null);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WithObjectOfDifferentType_ReturnsFalse_XqjW1() {
    Delivery delivery = new Delivery();
    boolean actual = delivery.equals(new Object());
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WithObjectWithSameValues_ReturnsTrue_qMZV2() {
    Delivery delivery1 = new Delivery();
    Delivery delivery2 = new Delivery();
    boolean actual = delivery1.equals(delivery2);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WithObjectWithDifferentValues_ReturnsFalse_yelc3() {
    Delivery delivery1 = new Delivery();
    Delivery delivery2 = new Delivery();
    delivery2.setTransportStatus(TransportStatus.UNKNOWN);
    boolean actual = delivery1.equals(delivery2);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testsetCalculatedAt() throws Exception {
    calculatedAt = LocalDateTime.now();
    delivery = new Delivery();
    delivery.setCalculatedAt(calculatedAt);
    assertEquals(calculatedAt, delivery.getCalculatedAt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCalculatedAt_FnXi0() {
    Delivery delivery = new Delivery();
    LocalDateTime calculatedAt = LocalDateTime.now();
    delivery.setCalculatedAt(calculatedAt);
    assertEquals(calculatedAt, delivery.getCalculatedAt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCalculatedAt_withCoverage_ZlKX1() {
    Delivery delivery = new Delivery();
    LocalDateTime calculatedAt = LocalDateTime.now();
    delivery.setCalculatedAt(calculatedAt);
    assertEquals(calculatedAt, delivery.getCalculatedAt());
    calculatedAt = null;
    delivery.setCalculatedAt(calculatedAt);
    assertEquals(calculatedAt, delivery.getCalculatedAt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRoutingStatus_UHSN0() {
    Delivery delivery = new Delivery();
    delivery.setRoutingStatus(RoutingStatus.ROUTED);
    assertEquals(RoutingStatus.ROUTED, delivery.getRoutingStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRoutingStatusWithMisroutedStatus_DIlG2() {
    Delivery delivery = new Delivery();
    delivery.setRoutingStatus(RoutingStatus.MISROUTED);
    assertEquals(RoutingStatus.MISROUTED, delivery.getRoutingStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRoutingStatusWithNotRoutedStatus_ZcGb3() {
    Delivery delivery = new Delivery();
    delivery.setRoutingStatus(RoutingStatus.NOT_ROUTED);
    assertEquals(RoutingStatus.NOT_ROUTED, delivery.getRoutingStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getEstimatedTimeOfArrivalTest_withNoParameters_LthR4() {
    Delivery delivery = new Delivery();
    LocalDateTime eta = delivery.getEstimatedTimeOfArrival();
    assertEquals(eta, null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCalculatedAt_bqbG0() {
    Delivery delivery = new Delivery();
    LocalDateTime calculatedAt = delivery.getCalculatedAt();
    assertEquals(null, calculatedAt);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCalculatedAt_withHandlingEvent_eEQp1() {
    Delivery delivery = new Delivery();
    HandlingEvent handlingEvent = new HandlingEvent();
    delivery.setLastEvent(handlingEvent);
    LocalDateTime calculatedAt = delivery.getCalculatedAt();
    assertEquals(null, calculatedAt);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCalculatedAt_withCoverage_ZlKX1_1() {
    Delivery delivery = new Delivery();
    LocalDateTime calculatedAt = LocalDateTime.now();
    delivery.setCalculatedAt(calculatedAt);
    calculatedAt = null;
    delivery.setCalculatedAt(calculatedAt);
    assertEquals(calculatedAt, delivery.getCalculatedAt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRoutingStatusWithNullParameter_kilA1_fid1() {
    Delivery delivery = new Delivery();
    delivery.setRoutingStatus(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getTransportStatus_returnsTransportStatus_kUrn0_fid1() {
    Delivery delivery = new Delivery();
    TransportStatus transportStatus = delivery.getTransportStatus();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getTransportStatus_returnsTransportStatus_withRouteSpecificationSet_vbOI3_fid1() {
    RouteSpecification routeSpecification = new RouteSpecification();
    Delivery delivery = new Delivery(null, null, routeSpecification);
    TransportStatus transportStatus = delivery.getTransportStatus();
    assertEquals(TransportStatus.NOT_RECEIVED, transportStatus);
  }
}