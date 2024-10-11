/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Delivery_Test_Passing {
  private HandlingHistory handlingHistory;
  private HandlingEvent lastEvent;
  private HandlingEvent handlingEvent;
  private LocalDateTime calculatedAt;
  private LocalDateTime eta;
  @NotNull
  private boolean misdirected;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMisdirected_HDDU0() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(true);
    assertTrue(delivery.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMisdirectedFalse_IsCS1() throws Exception {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(false);
    assertFalse(delivery.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCurrentVoyage_hYoB0() throws Exception {
    Delivery delivery = new Delivery();
    assertEquals(Voyage.NONE, delivery.getCurrentVoyage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLastKnownLocation_SyHz0() throws Exception {
    Delivery delivery = new Delivery();
    Location location = new Location(new UnLocode("DEHAM"), "Hamburg");
    delivery.setLastKnownLocation(location);
    assertEquals(location, delivery.getLastKnownLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransportStatus_KOew0() throws Exception {
    Delivery delivery = new Delivery();
    TransportStatus transportStatus = TransportStatus.NOT_RECEIVED;
    delivery.setTransportStatus(transportStatus);
    assertEquals(transportStatus, delivery.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsSameObject_hNxe0() throws Exception {
    Delivery delivery = new Delivery();
    boolean result = delivery.equals(delivery);
    assert result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsNull_YmPr1() throws Exception {
    Delivery delivery = new Delivery();
    boolean result = delivery.equals(null);
    assert !result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsDifferentClass_jIwh2() throws Exception {
    Delivery delivery = new Delivery();
    Object obj = new Object();
    boolean result = delivery.equals(obj);
    assert !result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsDifferentObject_ubsx3() throws Exception {
    Delivery delivery1 = new Delivery();
    Delivery delivery2 = new Delivery();
    boolean result = delivery1.equals(delivery2);
    assert !result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCalculatedAt_XVBr0() throws Exception {
    Delivery delivery = new Delivery();
    LocalDateTime calculatedAt = LocalDateTime.now();
    delivery.setCalculatedAt(calculatedAt);
    assert delivery.getCalculatedAt().equals(calculatedAt);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRoutingStatus_HWzE0() throws Exception {
    Delivery delivery = new Delivery();
    RoutingStatus routingStatus = RoutingStatus.NOT_ROUTED;
    delivery.setRoutingStatus(routingStatus);
    assertEquals(routingStatus, delivery.getRoutingStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRoutingStatusMisrouted_PsvC1() throws Exception {
    Delivery delivery = new Delivery();
    RoutingStatus routingStatus = RoutingStatus.MISROUTED;
    delivery.setRoutingStatus(routingStatus);
    assertEquals(routingStatus, delivery.getRoutingStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRoutingStatusRouted_HfSP2() throws Exception {
    Delivery delivery = new Delivery();
    RoutingStatus routingStatus = RoutingStatus.ROUTED;
    delivery.setRoutingStatus(routingStatus);
    assertEquals(routingStatus, delivery.getRoutingStatus());
  }
}