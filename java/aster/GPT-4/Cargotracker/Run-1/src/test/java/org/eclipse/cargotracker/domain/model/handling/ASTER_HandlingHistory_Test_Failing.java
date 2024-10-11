/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingHistory_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentHandlingEvents_kkGb3() {
    HandlingEvent event1 = new HandlingEvent();
    HandlingEvent event2 = new HandlingEvent();
    HandlingHistory history1 = new HandlingHistory(Arrays.asList(event1));
    HandlingHistory history2 = new HandlingHistory(Arrays.asList(event2));
    assertFalse(history1.equals(history2));
  }
}