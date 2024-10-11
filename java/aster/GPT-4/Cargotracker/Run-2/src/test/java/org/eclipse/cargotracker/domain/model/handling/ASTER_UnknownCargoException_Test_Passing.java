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
  public void testGetMessage_crZp0() {
    TrackingId trackingId = new TrackingId("123ABC");
    UnknownCargoException exception = new UnknownCargoException(trackingId);
    String expectedMessage = "No cargo with tracking id 123ABC exists in the system.";
    assertEquals(expectedMessage, exception.getMessage());
  }
}