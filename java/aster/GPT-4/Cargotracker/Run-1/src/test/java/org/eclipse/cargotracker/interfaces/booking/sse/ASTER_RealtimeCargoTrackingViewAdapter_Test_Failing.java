/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.sse;

import java.util.EnumMap;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.Delivery;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.cargo.TransportStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
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
  public void testGetLocation_NotReceived_2() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(originViewAdapter.getUnLocode()).thenReturn("ORIG_UNLOCODE");
    when(originViewAdapter.getName()).thenReturn("Origin City");
    when(lastKnownLocationViewAdapter.getUnLocode()).thenReturn("LAST_UNLOCODE");
    when(lastKnownLocationViewAdapter.getName()).thenReturn("Last Known City");
    // Assuming getOrigin and getLastKnownLocation methods return LocationViewAdapters
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.NOT_RECEIVED);
    LocationViewAdapter result = realtimeCargoTrackingViewAdapter.getLocation();
    assertEquals("ORIG_UNLOCODE", result.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_NotReceived_3() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(originViewAdapter.getUnLocode()).thenReturn("ORIG_UNLOCODE");
    when(originViewAdapter.getName()).thenReturn("Origin City");
    when(lastKnownLocationViewAdapter.getUnLocode()).thenReturn("LAST_UNLOCODE");
    when(lastKnownLocationViewAdapter.getName()).thenReturn("Last Known City");
    // Assuming getOrigin and getLastKnownLocation methods return LocationViewAdapters
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.NOT_RECEIVED);
    LocationViewAdapter result = realtimeCargoTrackingViewAdapter.getLocation();
    assertEquals("Origin City", result.getName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_Received_2() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(originViewAdapter.getUnLocode()).thenReturn("ORIG_UNLOCODE");
    when(originViewAdapter.getName()).thenReturn("Origin City");
    when(lastKnownLocationViewAdapter.getUnLocode()).thenReturn("LAST_UNLOCODE");
    when(lastKnownLocationViewAdapter.getName()).thenReturn("Last Known City");
    // Assuming getOrigin and getLastKnownLocation methods return LocationViewAdapters
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.IN_PORT);
    LocationViewAdapter result = realtimeCargoTrackingViewAdapter.getLocation();
    assertEquals("LAST_UNLOCODE", result.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_Received_3() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(originViewAdapter.getUnLocode()).thenReturn("ORIG_UNLOCODE");
    when(originViewAdapter.getName()).thenReturn("Origin City");
    when(lastKnownLocationViewAdapter.getUnLocode()).thenReturn("LAST_UNLOCODE");
    when(lastKnownLocationViewAdapter.getName()).thenReturn("Last Known City");
    // Assuming getOrigin and getLastKnownLocation methods return LocationViewAdapters
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.IN_PORT);
    LocationViewAdapter result = realtimeCargoTrackingViewAdapter.getLocation();
    assertEquals("Last Known City", result.getName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_NotReceived_OUIQ0_2() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(originViewAdapter.getUnLocode()).thenReturn("ORIG_UNLOCODE");
    when(originViewAdapter.getName()).thenReturn("Origin City");
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.NOT_RECEIVED);
    LocationViewAdapter result = realtimeCargoTrackingViewAdapter.getLocation();
    assertEquals("ORIG_UNLOCODE", result.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_NotReceived_OUIQ0_3() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(originViewAdapter.getUnLocode()).thenReturn("ORIG_UNLOCODE");
    when(originViewAdapter.getName()).thenReturn("Origin City");
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.NOT_RECEIVED);
    LocationViewAdapter result = realtimeCargoTrackingViewAdapter.getLocation();
    assertEquals("Origin City", result.getName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransportStatus_tvmd0() throws Exception {
    EnumMap<TransportStatus, String> transportStatusLabels = new EnumMap<>(TransportStatus.class);
    transportStatusLabels.put(TransportStatus.IN_PORT, "In Port");
    transportStatusLabels.put(TransportStatus.ONBOARD_CARRIER, "Onboard Carrier");
    transportStatusLabels.put(TransportStatus.CLAIMED, "Claimed");
    Delivery delivery = mock(Delivery.class);
    Cargo cargo = mock(Cargo.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.IN_PORT);
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    String status = realtimeCargoTrackingViewAdapter.getTransportStatus();
    assertEquals("In Port", status);
  }
}