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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Cargo_Test_Passing {
  private HandlingHistory handlingHistory;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_MfkK0() throws Exception {
    UnLocode unLocode = new UnLocode("DE HAM");
    Location location = new Location(unLocode, "Hamburg");
    TrackingId trackingId = new TrackingId("12345");
    RouteSpecification routeSpecification = new RouteSpecification(location, location, java.time.LocalDate.now());
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    assertEquals("12345", cargo.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrigin_lsgU0() throws Exception {
    Cargo cargo = new Cargo();
    Location location = new Location(new UnLocode("US LAX"), "Los Angeles");
    cargo.setOrigin(location);
    assertEquals(location, cargo.getOrigin());
  }
}