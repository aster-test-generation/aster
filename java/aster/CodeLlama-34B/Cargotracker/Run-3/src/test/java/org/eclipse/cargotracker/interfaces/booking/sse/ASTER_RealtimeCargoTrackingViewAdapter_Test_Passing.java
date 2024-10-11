/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.sse;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RealtimeCargoTrackingViewAdapter_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOriginWithNullCargo_KqHP1() throws Exception {
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(null);
    LocationViewAdapter origin = adapter.getOrigin();
    assertNull(origin);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRoutingStatus_NullCargo_DRts0() throws Exception {
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(null);
    assertNull(adapter.getRoutingStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_NullCargo_bkFp1() throws Exception {
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(null);
    assertNull(adapter.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_NullRouteSpecification_mZGH3() throws Exception {
    Cargo cargo = new Cargo(new TrackingId("ABC123"), null);
    RealtimeCargoTrackingViewAdapter adapter = new RealtimeCargoTrackingViewAdapter(cargo);
    assertEquals("ABC123", adapter.getTrackingId());
  }
}