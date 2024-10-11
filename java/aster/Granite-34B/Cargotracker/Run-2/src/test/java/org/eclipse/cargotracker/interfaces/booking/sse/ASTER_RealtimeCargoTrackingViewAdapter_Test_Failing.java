/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.sse;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.*;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RealtimeCargoTrackingViewAdapter_Test_Failing {
  private Cargo cargo;
  private RouteSpecification routeSpecification;
  private TrackingId trackingId;
  private UnLocode unLocode;
  private LocationViewAdapter locationViewAdapter;
  private RealtimeCargoTrackingViewAdapter realtimecargotrackingviewadapter;
  private RoutingStatus routingStatus;
  private TransportStatus transportStatus;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetRoutingStatus() throws Exception {
    realtimecargotrackingviewadapter = new RealtimeCargoTrackingViewAdapter(cargo);
    assertEquals("expected", realtimecargotrackingviewadapter.getRoutingStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getRoutingStatus_WithNullCargo_ReturnsNull_MeVy1() {
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(null);
    assertNull("Expected null status", adapter.getRoutingStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationWithNullCargo_ayLs1() {
    Cargo cargo = null;
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    LocationViewAdapter locationViewAdapter = realtimeCargoTrackingViewAdapter.getLastKnownLocation();
    assertNotNull(locationViewAdapter);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationWithNullLastKnownLocation_FvQr2_1() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    LocationViewAdapter locationViewAdapter = realtimeCargoTrackingViewAdapter.getLastKnownLocation();
    assertNull(locationViewAdapter.getName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationWithNullLastKnownLocation_FvQr2_2() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    LocationViewAdapter locationViewAdapter = realtimeCargoTrackingViewAdapter.getLastKnownLocation();
    assertNull(locationViewAdapter.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationWithNullLastKnownLocation_FvQr2_3() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    LocationViewAdapter locationViewAdapter = realtimeCargoTrackingViewAdapter.getLastKnownLocation();
    assertNull(locationViewAdapter.getCoordinates());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getRoutingStatus_WithNullRoutingStatus_ReturnsNull_eNrQ3() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    cargo.getDelivery().setRoutingStatus(null);
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(cargo);
    assertNull("Expected null status", adapter.getRoutingStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationWithNullCargo_ayLs1_fid1() {
    Cargo cargo = null;
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    LocationViewAdapter locationViewAdapter = realtimeCargoTrackingViewAdapter.getLastKnownLocation();
    assertNull(locationViewAdapter);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationWithNullLastKnownLocation_FvQr2() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    LocationViewAdapter locationViewAdapter = realtimeCargoTrackingViewAdapter.getLastKnownLocation();
    assertNull(locationViewAdapter.getName());
    assertNull(locationViewAdapter.getUnLocode());
    assertNull(locationViewAdapter.getCoordinates());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetStatusCodeClaimed_RYYH6() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    cargo.getDelivery().setRoutingStatus(RoutingStatus.ROUTED);
    cargo.getDelivery().setMisdirected(false);
    cargo.getDelivery().setUnloadedAtDestination(false);
    cargo.getDelivery().setTransportStatus(TransportStatus.CLAIMED);
    RealtimeCargoTrackingViewAdapter view = new RealtimeCargoTrackingViewAdapter(cargo);
    String actual = view.getStatusCode();
    assertEquals("CLAIM", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTransportStatus_NotHandlingTransport_iqor1() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(cargo);
    assertEquals("NotHandlingTransport", adapter.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTransportStatus_InPort_dMWj2() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(cargo);
    assertEquals("InPort", adapter.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTransportStatus_InTerminal_jnke3() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(cargo);
    assertEquals("InTerminal", adapter.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTransportStatus_Claimed_wgRq5() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(cargo);
    assertEquals("Claimed", adapter.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTransportStatus_Unknown_mowH6() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(cargo);
    assertEquals("Unknown", adapter.getTransportStatus());
  }
}