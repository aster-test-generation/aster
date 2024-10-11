/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.sse;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RealtimeCargoTrackingService_Coverage_Test_Failing {
  RealtimeCargoTrackingService realtimeCargoTrackingService = new RealtimeCargoTrackingService();

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testClose_ETTF0() {
    RealtimeCargoTrackingService service = new RealtimeCargoTrackingService();
    service.close();
  }
}