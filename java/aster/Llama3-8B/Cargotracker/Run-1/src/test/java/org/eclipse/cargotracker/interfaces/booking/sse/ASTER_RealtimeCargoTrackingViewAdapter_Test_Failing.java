/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.sse;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RealtimeCargoTrackingViewAdapter_Test_Failing {
  @Mock
  private Cargo cargo;
  @Mock
  private RouteSpecification routeSpecification;
  @Mock
  private Delivery delivery;
  @Mock
  private RoutingStatus routingStatus;
  @Mock
  private TransportStatus transportStatus;
  @Mock
  private LocationViewAdapter lastKnownLocation;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_QOqI0() {
    RealtimeCargoTrackingViewAdapter realtimecargotrackingviewadapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery()).thenReturn(new Delivery()); // Mock the delivery
    when(((Delivery) cargo.getDelivery()).isUnloadedAtDestination()).thenReturn(false); // Set unloadedAtDestination to false
    boolean result = realtimecargotrackingviewadapter.isAtDestination();
    assertTrue(!result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_isAtDestination_TYHD0() throws Exception {
    RealtimeCargoTrackingViewAdapter realtimecargotrackingviewadapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery().isUnloadedAtDestination()).thenReturn(true);
    boolean result = realtimecargotrackingviewadapter.isAtDestination();
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetTrackingId_oVrv0() throws Exception {
    TrackingId trackingId = new TrackingId("12345");
    Cargo cargo = new Cargo(trackingId, new RouteSpecification());
    RealtimeCargoTrackingViewAdapter realtimecargotrackingviewadapter = new RealtimeCargoTrackingViewAdapter(cargo);
    String expectedTrackingId = "12345";
    when(cargo.getTrackingId()).thenReturn(trackingId);
    boolean isAtDestination = realtimecargotrackingviewadapter.isAtDestination();
    String actualTrackingId = isAtDestination ? "" : "Tracking ID not found";
    assertEquals(expectedTrackingId, actualTrackingId);
  }
}