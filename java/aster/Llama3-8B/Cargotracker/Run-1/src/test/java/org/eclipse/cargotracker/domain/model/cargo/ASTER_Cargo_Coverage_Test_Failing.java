/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Cargo_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignToRoute_RouteSpecification_zzFd3_zbPT0() {
    Cargo cargo = new Cargo();
    Itinerary itinerary = new Itinerary();
    RouteSpecification routeSpecification = new RouteSpecification();
    cargo.assignToRoute(itinerary);
    assertEquals(routeSpecification, cargo.getRouteSpecification());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignToRoute_ItineraryIsNotNull_EwTb1_eVMV1() {
    Cargo cargo = new Cargo();
    Itinerary itinerary = new Itinerary();
    cargo.assignToRoute(itinerary);
  }
}