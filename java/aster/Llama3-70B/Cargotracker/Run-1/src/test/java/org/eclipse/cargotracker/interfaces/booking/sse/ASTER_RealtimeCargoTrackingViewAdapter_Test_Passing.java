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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RealtimeCargoTrackingViewAdapter_Test_Passing {
  private Cargo cargo;
  private RealtimeCargoTrackingViewAdapter realtimecargotrackingviewadapter;
  private Delivery delivery;
  private EnumMap<RoutingStatus, String> routingStatusLabels;
  private TrackingId trackingId;
  private TransportStatus transportStatus;
  private LocationViewAdapter lastKnownLocation;
  private RouteSpecification routeSpecification;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetTrackingId() throws Exception {
    trackingId = mock(TrackingId.class);
    cargo = mock(Cargo.class);
    when(cargo.getTrackingId()).thenReturn(trackingId);
    realtimecargotrackingviewadapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(trackingId.getIdString()).thenReturn("some-id");
    String result = realtimecargotrackingviewadapter.getTrackingId();
    assertEquals("some-id", result);
    verify(cargo, times(1)).getTrackingId();
    verify(trackingId, times(1)).getIdString();
  }
}