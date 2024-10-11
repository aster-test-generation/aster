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
  public void testGetMessage_wPbS0() throws Exception {
    TrackingId trackingId = new TrackingId("12345");
    UnknownCargoException exception = new UnknownCargoException(trackingId);
    String expectedMessage = "No cargo with tracking id 12345 exists in the system.";
    assertEquals(expectedMessage, exception.getMessage());
  }
}