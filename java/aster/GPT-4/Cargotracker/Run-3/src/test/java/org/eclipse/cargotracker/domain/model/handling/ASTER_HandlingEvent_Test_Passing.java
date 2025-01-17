/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingEvent_Test_Passing {
  private HandlingEvent handlingEvent;
  private Cargo cargo;
  private LocalDateTime completionTime;
  private LocalDateTime registrationTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime() throws Exception {
    // Set up a specific LocalDateTime
    completionTime = LocalDateTime.of(2023, 1, 1, 12, 0);
    // Create a HandlingEvent instance with the specified completion time
    handlingEvent = new HandlingEvent(null, completionTime, null, null, null, null);
    // Invoke the method under test
    LocalDateTime result = handlingEvent.getCompletionTime();
    // Assert that the returned completion time is as expected
    assertEquals(completionTime, result, "The completion time should match the initialized value");
  }
}