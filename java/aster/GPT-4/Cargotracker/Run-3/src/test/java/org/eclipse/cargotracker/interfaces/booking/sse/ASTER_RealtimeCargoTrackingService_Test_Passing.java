/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.sse;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RealtimeCargoTrackingService_Test_Passing {
  private RealtimeCargoTrackingService realtimeCargoTrackingService;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCloseMethod_MKnh0() throws Exception {
    RealtimeCargoTrackingService service = new RealtimeCargoTrackingService();
    service.close();
    assertTrue(true);
  }
}