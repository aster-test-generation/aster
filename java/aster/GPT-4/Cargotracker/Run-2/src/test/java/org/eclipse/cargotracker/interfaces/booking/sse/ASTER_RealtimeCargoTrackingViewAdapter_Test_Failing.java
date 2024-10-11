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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RealtimeCargoTrackingViewAdapter_Test_Failing {
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
  public void testGetLocation_NotReceived() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    // Setup
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.NOT_RECEIVED);
    when(realtimeCargoTrackingViewAdapter.getOrigin()).thenReturn(originLocationViewAdapter);
    // Execution
    LocationViewAdapter result = realtimeCargoTrackingViewAdapter.getLocation();
    // Verification
    assertSame(originLocationViewAdapter, result);
    verify(delivery).getTransportStatus();
    verify(realtimeCargoTrackingViewAdapter).getOrigin();
    verifyNoMoreInteractions(lastKnownLocationViewAdapter);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_Misdirected_UhEf2_pHTG0() {
    TrackingId trackingId = new TrackingId("DEF456");
    RouteSpecification routeSpecification = new RouteSpecification();
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    Delivery delivery = new Delivery();
    delivery.setMisdirected(true);
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(cargo);
    String statusCode = adapter.getStatusCode();
    assertEquals("MISDIRECTED", statusCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_NotReceived_sCOa0() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.NOT_RECEIVED);
    when(realtimeCargoTrackingViewAdapter.getOrigin()).thenReturn(originLocationViewAdapter);
    LocationViewAdapter result = realtimeCargoTrackingViewAdapter.getLocation();
    assertSame(originLocationViewAdapter, result);
    verify(delivery).getTransportStatus();
    verify(realtimeCargoTrackingViewAdapter).getOrigin();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_NotReceived_sCOa0_fid1() throws Exception {
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.NOT_RECEIVED);
    doReturn(originLocationViewAdapter).when(realtimeCargoTrackingViewAdapter).getOrigin();
    LocationViewAdapter result = realtimeCargoTrackingViewAdapter.getLocation();
    assertSame(originLocationViewAdapter, result);
    verify(delivery).getTransportStatus();
    verify(realtimeCargoTrackingViewAdapter).getOrigin();
  }
}