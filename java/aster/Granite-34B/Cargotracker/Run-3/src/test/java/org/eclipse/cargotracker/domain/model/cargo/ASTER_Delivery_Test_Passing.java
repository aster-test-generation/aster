/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Delivery_Test_Passing {
  private HandlingEvent lastEvent;
  private RouteSpecification routeSpecification;
  private Itinerary itinerary;
  private HandlingHistory handlingHistory;
  @NotNull
  private boolean misdirected;
  @Embedded
  private HandlingActivity nextExpectedActivity;
  private Voyage currentVoyage;
  private LocalDateTime eta;
  private LocalDateTime calculatedAt;
  private boolean isUnloadedAtDestination;
  private RoutingStatus routingStatus;
  HandlingEvent event;
  RouteSpecification route;
  Delivery other;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRoutingStatus_cogT0() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setRoutingStatus(RoutingStatus.ROUTED);
    assertEquals(RoutingStatus.ROUTED, delivery.getRoutingStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLastKnownLocation_zpxq0() throws Exception {
    Delivery delivery = new Delivery();
    Location location = new Location(new UnLocode("USCHI"), "Chicago");
    delivery.setLastKnownLocation(location);
    assertEquals(location, delivery.getLastKnownLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setUnloadedAtDestination_true_Gkuv0() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setUnloadedAtDestination(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setUnloadedAtDestination_false_Dxcl1() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setUnloadedAtDestination(false);
  }

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransportStatus_dRnl0() throws Exception {
    Delivery delivery = new Delivery();
    TransportStatus transportStatus = TransportStatus.NOT_RECEIVED;
    delivery.setTransportStatus(transportStatus);
    assertEquals(transportStatus, delivery.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsUnloadedAtDestinationWhenUnloadedAtDestinationReturnsTrue_NqgC0() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setUnloadedAtDestination(true);
    boolean result = delivery.isUnloadedAtDestination();
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsUnloadedAtDestinationWhenNotUnloadedAtDestinationReturnsFalse_gVNa1() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setUnloadedAtDestination(false);
    boolean result = delivery.isUnloadedAtDestination();
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSameObject_UvAZ0() throws Exception {
    Delivery delivery = new Delivery();
    assertEquals(true, delivery.equals(delivery));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNullObject_dcuN1() throws Exception {
    Delivery delivery = new Delivery();
    assertEquals(false, delivery.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSimilarObject_cBdg2() throws Exception {
    Delivery delivery1 = new Delivery();
    Delivery delivery2 = new Delivery();
    assertEquals(true, delivery1.equals(delivery2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentObject_yqPU3() throws Exception {
    Delivery delivery1 = new Delivery();
    Object obj = new Object();
    assertEquals(false, delivery1.equals(obj));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getEstimatedTimeOfArrivalNoETA_RkKD1() throws Exception {
    Delivery delivery = new Delivery();
    LocalDateTime estimatedTimeOfArrival = delivery.getEstimatedTimeOfArrival();
    assertEquals(null, estimatedTimeOfArrival);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testSetMisdirected_lIGy0() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(true);
    boolean expected = true;
    boolean actual = delivery.isMisdirected();
    assert actual == expected;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testSetMisdirected_JYkf1() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(false);
    boolean expected = false;
    boolean actual = delivery.isMisdirected();
    assert actual == expected;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testSetMisdirected_mXkq2() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(true);
    boolean expected = false;
    boolean actual = delivery.isMisdirected();
    assert actual == expected;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testSetMisdirected_zhke3() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(false);
    boolean expected = true;
    boolean actual = delivery.isMisdirected();
    assert actual == expected;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testSetCalculatedAt_Rbvu0() throws Exception {
    Delivery delivery = new Delivery();
    LocalDateTime calculatedAt = LocalDateTime.now();
    delivery.setCalculatedAt(calculatedAt);
    assertEquals(calculatedAt, delivery.getCalculatedAt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testSetCalculatedAtWithNullParameter_Wcaq2() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setCalculatedAt(null);
    assertEquals(null, delivery.getCalculatedAt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testSetCalculatedAtWithMinimumParameter_dkRF4() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setCalculatedAt(LocalDateTime.MIN);
    assertEquals(LocalDateTime.MIN, delivery.getCalculatedAt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testSetCalculatedAtWithMaximumParameter_mSFv5() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setCalculatedAt(LocalDateTime.MAX);
    assertEquals(LocalDateTime.MAX, delivery.getCalculatedAt());
  }
}