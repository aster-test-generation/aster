/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.sse;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.RoutingStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RealtimeCargoTrackingViewAdapter_Test_Failing {
  private Cargo cargo;
  private LocationViewAdapter locationViewAdapter;
  private RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter;
  private RealtimeCargoTrackingViewAdapter realtimecargotrackingviewadapter;
  @Mock
  private Cargo cargoMock;
  private LocationViewAdapter origin;
  private LocationViewAdapter lastKnownLocation;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetRoutingStatus() throws Exception {
    cargo = mock(Cargo.class);
    realtimecargotrackingviewadapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery().getRoutingStatus()).thenReturn(RoutingStatus.NOT_ROUTED);
    assertEquals("Not Routed", realtimecargotrackingviewadapter.getRoutingStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testStatusCode_1() {
    cargo = mock(Cargo.class);
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery().getRoutingStatus()).thenReturn(RoutingStatus.NOT_ROUTED);
    when(cargo.getDelivery().getRoutingStatus()).thenReturn(RoutingStatus.MISROUTED);
    when(cargo.getDelivery().isMisdirected()).thenReturn(true);
    when(cargo.getDelivery().isUnloadedAtDestination()).thenReturn(true);
    assertEquals("NOT_ROUTED", realtimeCargoTrackingViewAdapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testStatusCode_2() {
    cargo = mock(Cargo.class);
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery().getRoutingStatus()).thenReturn(RoutingStatus.NOT_ROUTED);
    when(cargo.getDelivery().getRoutingStatus()).thenReturn(RoutingStatus.MISROUTED);
    when(cargo.getDelivery().isMisdirected()).thenReturn(true);
    when(cargo.getDelivery().isUnloadedAtDestination()).thenReturn(true);
    assertEquals("MISROUTED", realtimeCargoTrackingViewAdapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testStatusCode_3() {
    cargo = mock(Cargo.class);
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery().getRoutingStatus()).thenReturn(RoutingStatus.NOT_ROUTED);
    when(cargo.getDelivery().getRoutingStatus()).thenReturn(RoutingStatus.MISROUTED);
    when(cargo.getDelivery().isMisdirected()).thenReturn(true);
    when(cargo.getDelivery().isUnloadedAtDestination()).thenReturn(true);
    assertEquals("MISDIRECTED", realtimeCargoTrackingViewAdapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testStatusCode_4() {
    cargo = mock(Cargo.class);
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery().getRoutingStatus()).thenReturn(RoutingStatus.NOT_ROUTED);
    when(cargo.getDelivery().getRoutingStatus()).thenReturn(RoutingStatus.MISROUTED);
    when(cargo.getDelivery().isMisdirected()).thenReturn(true);
    when(cargo.getDelivery().isUnloadedAtDestination()).thenReturn(true);
    assertEquals("AT_DESTINATION", realtimeCargoTrackingViewAdapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testStatusCode() {
    cargo = mock(Cargo.class);
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery().getRoutingStatus()).thenReturn(RoutingStatus.NOT_ROUTED);
    assertEquals("NOT_ROUTED", realtimeCargoTrackingViewAdapter.getStatusCode());
    when(cargo.getDelivery().getRoutingStatus()).thenReturn(RoutingStatus.MISROUTED);
    assertEquals("MISROUTED", realtimeCargoTrackingViewAdapter.getStatusCode());
    when(cargo.getDelivery().isMisdirected()).thenReturn(true);
    assertEquals("MISDIRECTED", realtimeCargoTrackingViewAdapter.getStatusCode());
    when(cargo.getDelivery().isUnloadedAtDestination()).thenReturn(true);
    assertEquals("AT_DESTINATION", realtimeCargoTrackingViewAdapter.getStatusCode());
  }
}