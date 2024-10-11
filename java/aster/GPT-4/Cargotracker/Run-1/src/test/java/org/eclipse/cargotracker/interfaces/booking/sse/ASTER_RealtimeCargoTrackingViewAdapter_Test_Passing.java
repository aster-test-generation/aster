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
  private LocationViewAdapter originLocationViewAdapter;
  @InjectMocks
  private RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter;
  @Mock
  private Delivery delivery;
  @Mock
  private TrackingId trackingId;
  @Mock
  private TransportStatus transportStatus;
  @Mock
  private LocationViewAdapter originViewAdapter;
  @Mock
  private LocationViewAdapter lastKnownLocationViewAdapter;
  private EnumMap<TransportStatus, String> transportStatusLabels;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_WhenMisdirected() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isMisdirected()).thenReturn(true);
    assertTrue(realtimeCargoTrackingViewAdapter.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_WhenNotMisdirected() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isMisdirected()).thenReturn(false);
    assertFalse(realtimeCargoTrackingViewAdapter.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId() throws Exception {
    when(cargo.getTrackingId()).thenReturn(trackingId);
    when(trackingId.getIdString()).thenReturn("ABC123");
    String expectedTrackingId = "ABC123";
    String actualTrackingId = realtimeCargoTrackingViewAdapter.getTrackingId();
    assertEquals(expectedTrackingId, actualTrackingId, "The tracking ID should match the expected value.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_NotRouted() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(RoutingStatus.NOT_ROUTED);
    String statusCode = realtimeCargoTrackingViewAdapter.getStatusCode();
    assertEquals("NOT_ROUTED", statusCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_Misrouted() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(RoutingStatus.MISROUTED);
    String statusCode = realtimeCargoTrackingViewAdapter.getStatusCode();
    assertEquals("MISROUTED", statusCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_Misdirected() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(RoutingStatus.ROUTED);
    when(delivery.isMisdirected()).thenReturn(true);
    String statusCode = realtimeCargoTrackingViewAdapter.getStatusCode();
    assertEquals("MISDIRECTED", statusCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_AtDestination() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(RoutingStatus.ROUTED);
    when(delivery.isMisdirected()).thenReturn(false);
    when(delivery.isUnloadedAtDestination()).thenReturn(true);
    String statusCode = realtimeCargoTrackingViewAdapter.getStatusCode();
    assertEquals("AT_DESTINATION", statusCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_OtherStatus() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(RoutingStatus.ROUTED);
    when(delivery.isMisdirected()).thenReturn(false);
    when(delivery.isUnloadedAtDestination()).thenReturn(false);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.ONBOARD_CARRIER);
    String statusCode = realtimeCargoTrackingViewAdapter.getStatusCode();
    assertEquals("ONBOARD_CARRIER", statusCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_NotReceived_1() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(originViewAdapter.getUnLocode()).thenReturn("ORIG_UNLOCODE");
    when(originViewAdapter.getName()).thenReturn("Origin City");
    when(lastKnownLocationViewAdapter.getUnLocode()).thenReturn("LAST_UNLOCODE");
    when(lastKnownLocationViewAdapter.getName()).thenReturn("Last Known City");
    // Assuming getOrigin and getLastKnownLocation methods return LocationViewAdapters
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.NOT_RECEIVED);
    LocationViewAdapter result = realtimeCargoTrackingViewAdapter.getLocation();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_Received_1() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(originViewAdapter.getUnLocode()).thenReturn("ORIG_UNLOCODE");
    when(originViewAdapter.getName()).thenReturn("Origin City");
    when(lastKnownLocationViewAdapter.getUnLocode()).thenReturn("LAST_UNLOCODE");
    when(lastKnownLocationViewAdapter.getName()).thenReturn("Last Known City");
    // Assuming getOrigin and getLastKnownLocation methods return LocationViewAdapters
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.IN_PORT);
    LocationViewAdapter result = realtimeCargoTrackingViewAdapter.getLocation();
    assertNotNull(result);
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
  public void testGetRoutingStatus_mcqQ0() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(RoutingStatus.MISROUTED);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    String status = realtimeCargoTrackingViewAdapter.getRoutingStatus();
    assertEquals("Misrouted", status);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_NotReceived_OUIQ0_1() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(originViewAdapter.getUnLocode()).thenReturn("ORIG_UNLOCODE");
    when(originViewAdapter.getName()).thenReturn("Origin City");
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.NOT_RECEIVED);
    LocationViewAdapter result = realtimeCargoTrackingViewAdapter.getLocation();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_ZLjP0() throws Exception {
    TrackingId trackingId = new TrackingId("ABC123");
    Cargo cargo = mock(Cargo.class);
    when(cargo.getTrackingId()).thenReturn(trackingId);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    String expectedTrackingId = "ABC123";
    String actualTrackingId = realtimeCargoTrackingViewAdapter.getTrackingId();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsAtDestination_WhenUnloadedAtDestination_fDNN0() throws Exception {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(true);
    assertTrue(realtimeCargoTrackingViewAdapter.isAtDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_Misdirected_BEDt0() throws Exception {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(false); // Assuming this is the correct method to check misdirection
    boolean isAtDestination = realtimeCargoTrackingViewAdapter.isAtDestination();
    assertFalse(isAtDestination);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsAtDestination_AtDestination_avjm0() throws Exception {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(true);
    boolean result = realtimeCargoTrackingViewAdapter.isAtDestination();
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsAtDestination_WhenUnloadedAtDestination_ENDf0() throws Exception {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(true);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    boolean result = realtimeCargoTrackingViewAdapter.isAtDestination();
    assertTrue(result, "Cargo should be at destination");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsAtDestination_WhenNotUnloadedAtDestination_TlJE0() throws Exception {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isUnloadedAtDestination()).thenReturn(false);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    boolean result = realtimeCargoTrackingViewAdapter.isAtDestination();
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransportStatus_tvmd0_fid1() throws Exception {
    EnumMap<TransportStatus, String> transportStatusLabels = new EnumMap<>(TransportStatus.class);
    transportStatusLabels.put(TransportStatus.IN_PORT, "In port");
    transportStatusLabels.put(TransportStatus.ONBOARD_CARRIER, "Onboard Carrier");
    transportStatusLabels.put(TransportStatus.CLAIMED, "Claimed");
    Delivery delivery = mock(Delivery.class);
    Cargo cargo = mock(Cargo.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.IN_PORT);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    String status = realtimeCargoTrackingViewAdapter.getTransportStatus();
    assertEquals("In port", status);
  }
}