/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_Cargo_Coverage_Test_Passing {
  private Cargo cargo;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_HNLU0() {
    TrackingId trackingId = new TrackingId("ID123");
    RouteSpecification routeSpecification = new RouteSpecification();
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    assertEquals(trackingId.hashCode(), cargo.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_cCWw0() {
    TrackingId trackingId = new TrackingId("ID123");
    RouteSpecification routeSpecification = new RouteSpecification();
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    String result = cargo.toString();
    assertEquals("ID123", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSpecifyNewRoute_WithValidRouteSpecification_DoesNotThrowException_eeNW3() {
    RouteSpecification routeSpecification = new RouteSpecification();
    Cargo cargo = new Cargo();
    cargo.specifyNewRoute(routeSpecification);
  }

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignToRoute_WithValidItinerary_DoesNotChangeRouteSpecification_LKnU4_LjuB0() {
    RouteSpecification originalRouteSpecification = new RouteSpecification();
    Cargo cargo = new Cargo(new TrackingId("id"), originalRouteSpecification);
    Itinerary itinerary = new Itinerary();
    cargo.assignToRoute(itinerary);
    assertEquals(originalRouteSpecification, cargo.getRouteSpecification());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSpecifyNewRoute_WithValidRouteSpecification_SetsRouteSpecification_WFKS1_qYXy0() {
    RouteSpecification routeSpecification = mock(RouteSpecification.class);
    Cargo cargo = new Cargo();
    cargo.specifyNewRoute(routeSpecification);
    assertEquals(routeSpecification, cargo.getRouteSpecification());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSpecifyNewRoute_WithValidRouteSpecification_UpdatesDelivery_kiIp2_DlwP0() {
    RouteSpecification routeSpecification = mock(RouteSpecification.class);
    Itinerary itinerary = mock(Itinerary.class);
    Delivery deliveryMock = mock(Delivery.class);
    when(deliveryMock.updateOnRouting(routeSpecification, itinerary)).thenReturn(deliveryMock);
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    cargo.specifyNewRoute(routeSpecification); // Initialize delivery before calling assignToRoute
    cargo.assignToRoute(itinerary);
    verify(deliveryMock).updateOnRouting(routeSpecification, itinerary);
  }

  @Test
  public void testAssignToRoute_WithNullItinerary_ThrowsNullPointerException_bChS1_I_emyi0() {
    Cargo cargo = new Cargo(new TrackingId("id"), new RouteSpecification());
    NullPointerException exception = Assertions.assertThrows(NullPointerException.class, () -> {
      cargo.assignToRoute(null);
    });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignToRoute_WithValidItinerary_DoesNotChangeRouteSpecification_LKnU4_LjuB0_fid1() {
    RouteSpecification originalRouteSpecification = new RouteSpecification();
    Cargo cargo = new Cargo(new TrackingId("id"), originalRouteSpecification);
    Itinerary itinerary = new Itinerary();
    if (itinerary != null) {
      cargo.assignToRoute(itinerary);
    }
    assertNotNull(cargo.getRouteSpecification());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_ReturnsFalse_kDtP2() throws Exception {
    assertFalse(cargo.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ReturnsFalse_Ksgp3() throws Exception {
    assertFalse(cargo.equals(new Object()));
  }
}