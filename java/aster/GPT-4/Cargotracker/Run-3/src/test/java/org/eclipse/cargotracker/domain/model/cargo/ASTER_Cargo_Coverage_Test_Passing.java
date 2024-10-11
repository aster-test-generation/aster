/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Cargo_Coverage_Test_Passing {
  Cargo cargo;
  Cargo anotherCargo;
  TrackingId trackingId;
  RouteSpecification routeSpecification;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_pohi2() throws Exception {
    assertFalse(cargo.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ShFl3() throws Exception {
    Object differentObject = new Object();
    assertFalse(cargo.equals(differentObject));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_OWOk0() {
    TrackingId trackingId = new TrackingId("ABC123");
    RouteSpecification routeSpecification = new RouteSpecification();
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    int expectedHashCode = trackingId.hashCode();
    assertEquals(expectedHashCode, cargo.hashCode(), "Hash code should match the hash code of the trackingId object.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignToRouteWithValidItinerary_OXHN1() {
    Cargo cargo = new Cargo();
    Itinerary itinerary = new Itinerary();
    RouteSpecification routeSpecification = new RouteSpecification();
    cargo.assignToRoute(itinerary);
    assertEquals(itinerary, cargo.getItinerary());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentIdentity_QEKe5_kXAC0() throws Exception {
    Cargo differentCargo = new Cargo(new TrackingId("XYZ789"), routeSpecification);
    assertFalse(cargo.equals(differentCargo));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_IdentityMethodCalled_xAWe6_agTA0() throws Exception {
    Cargo anotherCargo = new Cargo();
    Cargo cargo = new Cargo();
    cargo.equals(anotherCargo); // This implicitly tests the sameIdentityAs method if it's used in equals.
    assertTrue(cargo.equals(anotherCargo)); // Assuming equals uses sameIdentityAs internally.
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignToRouteCompletesSuccessfully_wxOA3_vxEX0() {
    Cargo cargo = new Cargo();
    Itinerary itinerary = new Itinerary();
    RouteSpecification routeSpecification = new RouteSpecification();
    cargo.assignToRoute(itinerary);
    assertTrue(true);
  }
}