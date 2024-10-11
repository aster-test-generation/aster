/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Delivery_Coverage_Test_Passing {
  Delivery delivery;

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_BjCo0() throws Exception {
    delivery = new Delivery();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testequals_biAf1() throws Exception {
    Delivery other = new Delivery();
    assertTrue(delivery.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testequals2_uhSg2() throws Exception {
    Delivery other = new Delivery();
    other.setLastEvent(new HandlingEvent());
    assertFalse(delivery.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateOnRoutingWithNullRouteSpecification_iotA1() {
    Delivery delivery = new Delivery();
    RouteSpecification routeSpecification = null;
    Itinerary itinerary = new Itinerary();
    try {
      delivery.updateOnRouting(routeSpecification, itinerary);
      fail("Expected exception not thrown");
    } catch (Exception e) {
      assertEquals("Route specification is required", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testcase1_FOtd0() {
    Delivery delivery = new Delivery();
    delivery.hashCode();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testcase2_MpDd1() {
    Delivery delivery = new Delivery();
    delivery.setTransportStatus(TransportStatus.IN_PORT);
    delivery.hashCode();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testcase5_RTPl4() {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(true);
    delivery.hashCode();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testcase9_SIRQ8() {
    Delivery delivery = new Delivery();
    delivery.setRoutingStatus(RoutingStatus.MISROUTED);
    delivery.hashCode();
  }
}