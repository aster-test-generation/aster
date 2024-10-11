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

public class Aster_RealtimeCargoTrackingService_Test_Passing {
  private SseBroadcaster broadcaster;
  @Inject
  private Logger logger;
  private RealtimeCargoTrackingService service;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_ITpc0() throws Exception {
    service = new RealtimeCargoTrackingService();
  }
}