/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Delivery_Coverage_Test_Failing {
  private RouteSpecification routeSpecification;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateOnRouting_NullRouteSpecification_jMxr0() {
    Delivery delivery = new Delivery();
    try {
      delivery.updateOnRouting(null, new Itinerary());
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals("Route specification is required", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateOnRouting_NullRouteSpecification_jMxr0_fid2() {
    Delivery delivery = new Delivery();
    try {
      delivery.updateOnRouting(new RouteSpecification(null, null, null), new Itinerary());
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals("Route specification is required", e.getMessage());
    }
  }
}