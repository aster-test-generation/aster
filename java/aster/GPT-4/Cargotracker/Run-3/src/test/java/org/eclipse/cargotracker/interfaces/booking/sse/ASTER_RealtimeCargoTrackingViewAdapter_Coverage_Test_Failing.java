/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.sse;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.Delivery;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_RealtimeCargoTrackingViewAdapter_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetStatusCodeWithNullRoutingStatus_hpTb7() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(null);
    when(delivery.getTransportStatus()).thenReturn(null);
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(cargo);
    String statusCode = adapter.getStatusCode();
    assertNull(statusCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetStatusCodeWithNullRoutingStatus_hpTb7_fid2() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getRoutingStatus()).thenReturn(null);
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(cargo);
    String statusCode = adapter.getStatusCode();
    assertNull(statusCode);
  }
}