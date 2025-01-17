/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.sse;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.Delivery;
import org.eclipse.cargotracker.domain.model.cargo.RoutingStatus;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RealtimeCargoTrackingViewAdapter_Test_Failing {
  private Cargo cargo;
  private LocationViewAdapter locationViewAdapter;
  private RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter;
  @Mock
  private Cargo cargoMock;
  private RealtimeCargoTrackingViewAdapter realtimecargotrackingviewadapter;
  @Mock
  private RoutingStatus routingStatus;
  @Mock
  private Delivery delivery;
  @Mock
  private UnLocode unLocode;
  private LocationViewAdapter origin;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetRoutingStatus() throws Exception {
    cargo = mock(Cargo.class);
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery().getRoutingStatus()).thenReturn(RoutingStatus.NOT_ROUTED);
    String routingStatus = realtimeCargoTrackingViewAdapter.getRoutingStatus();
    assertEquals("Not Routed", routingStatus);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetTrackingId() {
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargoMock);
    // Arrange
    String expectedTrackingId = "12345";
    when(cargoMock.getTrackingId().getIdString()).thenReturn(expectedTrackingId);
    // Act
    String actualTrackingId = realtimeCargoTrackingViewAdapter.getTrackingId();
    // Assert
    assertEquals(expectedTrackingId, actualTrackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testisAtDestination() {
    cargo = mock(Cargo.class);
    realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargo);
    when(cargo.getDelivery().isUnloadedAtDestination()).thenReturn(true);
    assertTrue(realtimeCargoTrackingViewAdapter.isAtDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetTrackingId_VrRP0() {
    RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter = new RealtimeCargoTrackingViewAdapter(cargoMock);
    String expectedTrackingId = "12345";
    when(cargoMock.getTrackingId().getIdString()).thenReturn(expectedTrackingId);
    String actualTrackingId = realtimeCargoTrackingViewAdapter.getTrackingId();
    assertEquals(expectedTrackingId, actualTrackingId);
  }
}