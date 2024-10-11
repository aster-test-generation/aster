/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.sse;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RealtimeCargoTrackingService_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithoutException_uQuW2() {
    RealtimeCargoTrackingService service = new RealtimeCargoTrackingService();
    service.init();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testClose_BroadcasterClose_ATFN0() {
    RealtimeCargoTrackingService service = new RealtimeCargoTrackingService();
    service.close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithSSEBroadcaster_QOiO0_DlDc0() {
    RealtimeCargoTrackingService service = new RealtimeCargoTrackingService();
    service.init();
    RealtimeCargoTrackingService broadcaster = service;
    assertNotNull(broadcaster);
  }
}