/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.sse;

import jakarta.inject.Inject;
import jakarta.ws.rs.sse.SseBroadcaster;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RealtimeCargoTrackingService_Test_Failing {
  private SseBroadcaster broadcaster;
  @Inject
  private Logger logger;
  RealtimeCargoTrackingService realtimecargotrackingservice;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_xtiH0() {
    RealtimeCargoTrackingService realtimeCargoTrackingService = new RealtimeCargoTrackingService();
    realtimeCargoTrackingService.init();
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testClose_ttfT0() {
    RealtimeCargoTrackingService service = new RealtimeCargoTrackingService();
    service.close();
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCloseWithCoverage_mujq1() {
    RealtimeCargoTrackingService service = new RealtimeCargoTrackingService();
    service.close();
    service.close();
    service.close();
    service.close();
    service.close();
    service.close();
    service.close();
    service.close();
    service.close();
    service.close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_xtiH0_fid1() {
    RealtimeCargoTrackingService realtimeCargoTrackingService = new RealtimeCargoTrackingService();
    realtimeCargoTrackingService.init();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testClose_ttfT0_fid1() {
    RealtimeCargoTrackingService service = new RealtimeCargoTrackingService();
    service.close();
  }
}