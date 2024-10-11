/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnknownCargoException_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMessageWithTrackingId_Rfcj0() {
    TrackingId trackingId = new TrackingId("1234567890");
    UnknownCargoException exception = new UnknownCargoException(trackingId);
    String message = exception.getMessage();
    assertEquals("No cargo with tracking id 1234567890 exists in the system.", message);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMessageWithEmptyTrackingId_uIkT2() {
    TrackingId trackingId = new TrackingId("");
    UnknownCargoException exception = new UnknownCargoException(trackingId);
    String message = exception.getMessage();
    assertEquals("No cargo with tracking id  exists in the system.", message);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMessageWithInvalidTrackingId_tkAq3() {
    TrackingId trackingId = new TrackingId("invalid_tracking_id");
    UnknownCargoException exception = new UnknownCargoException(trackingId);
    String message = exception.getMessage();
    assertEquals("No cargo with tracking id invalid_tracking_id exists in the system.", message);
  }
}