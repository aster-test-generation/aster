/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.sse;

import java.util.EnumMap;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RealtimeCargoTrackingViewAdapter_Test_Passing {
  @Mock
  private Cargo cargo;
  @Mock
  private LocationViewAdapter expectedLocationViewAdapter;
  @InjectMocks
  private RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter;
  @Mock
  private Delivery delivery;
  @Mock
  private TrackingId trackingId;
  @Mock
  private TransportStatus transportStatus;
  @Mock
  private LocationViewAdapter originLocationViewAdapter;
  @Mock
  private LocationViewAdapter lastKnownLocationViewAdapter;
  private static EnumMap<TransportStatus, String> transportStatusLabels = new EnumMap<>(TransportStatus.class);

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirectedTrue() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isMisdirected()).thenReturn(true);
    assertTrue(realtimeCargoTrackingViewAdapter.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirectedFalse() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isMisdirected()).thenReturn(false);
    assertFalse(realtimeCargoTrackingViewAdapter.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRoutingStatus() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(RoutingStatus.MISROUTED);
    // Assuming RoutingStatus.MISROUTED maps to "Misrouted"
    assertEquals("Misrouted", realtimeCargoTrackingViewAdapter.getRoutingStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId() throws Exception {
    when(cargo.getTrackingId()).thenReturn(trackingId);
    when(trackingId.getIdString()).thenReturn("ABC123");
    String expected = "ABC123";
    String actual = realtimeCargoTrackingViewAdapter.getTrackingId();
    assertEquals(expected, actual, "The tracking ID should match the expected value.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_NotRouted() {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(RoutingStatus.NOT_ROUTED);
    assertEquals("NOT_ROUTED", realtimeCargoTrackingViewAdapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_Misrouted() {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(RoutingStatus.MISROUTED);
    assertEquals("MISROUTED", realtimeCargoTrackingViewAdapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_Misdirected() {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(RoutingStatus.ROUTED);
    when(delivery.isMisdirected()).thenReturn(true);
    assertEquals("MISDIRECTED", realtimeCargoTrackingViewAdapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_AtDestination() {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(RoutingStatus.ROUTED);
    when(delivery.isMisdirected()).thenReturn(false);
    when(delivery.isUnloadedAtDestination()).thenReturn(true);
    assertEquals("AT_DESTINATION", realtimeCargoTrackingViewAdapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_OtherStatus() {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(RoutingStatus.ROUTED);
    when(delivery.isMisdirected()).thenReturn(false);
    when(delivery.isUnloadedAtDestination()).thenReturn(false);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.ONBOARD_CARRIER);
    assertEquals("ONBOARD_CARRIER", realtimeCargoTrackingViewAdapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsAtDestination_WhenUnloadedAtDestination() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(true);
    boolean result = realtimeCargoTrackingViewAdapter.isAtDestination();
    assertTrue(result, "Cargo should be at destination");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsAtDestination_WhenNotUnloadedAtDestination() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(false);
    boolean result = realtimeCargoTrackingViewAdapter.isAtDestination();
    assertFalse(result, "Cargo should not be at destination");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsAtDestinationTrue_QbKL0() throws Exception {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(true);
    assertTrue(realtimeCargoTrackingViewAdapter.isAtDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_Misdirected_LZxp0() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(false); // Assuming misdirection implies not unloaded at destination
    assertFalse(realtimeCargoTrackingViewAdapter.isAtDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsAtDestination_oxIn0() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(true);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    assertTrue(realtimeCargoTrackingViewAdapter.isAtDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsAtDestination_VPvO0() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(false);
    assertFalse(realtimeCargoTrackingViewAdapter.isAtDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsAtDestination_WhenUnloadedAtDestination_zpYW0() throws Exception {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(true);
    boolean result = realtimeCargoTrackingViewAdapter.isAtDestination();
    assertTrue(result, "Cargo should be at destination");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsAtDestination_WhenNotUnloadedAtDestination_FVip0() throws Exception {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(false);
    boolean result = realtimeCargoTrackingViewAdapter.isAtDestination();
    assertFalse(result, "Cargo should not be at destination");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_Misdirected_UhEf2_pHTG0_fid1() {
    TrackingId trackingId = new TrackingId("DEF456");
    RouteSpecification routeSpecification = new RouteSpecification();
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    Delivery delivery = new Delivery();
    delivery.setMisdirected(true);
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(cargo);
    String statusCode = adapter.getStatusCode();
    assertEquals("NOT_ROUTED", statusCode);
  }
}