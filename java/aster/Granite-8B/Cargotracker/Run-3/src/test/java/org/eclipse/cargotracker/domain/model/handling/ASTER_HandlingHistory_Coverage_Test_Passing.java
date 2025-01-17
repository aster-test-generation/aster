/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingHistory_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testMostRecentlyCompletedEventWhenHandlingEventsIsEmpty_Xvuj0() {
    HandlingHistory handlingHistory = new HandlingHistory(List.of());
    HandlingEvent mostRecentlyCompletedEvent = handlingHistory.getMostRecentlyCompletedEvent();
    assertNull(mostRecentlyCompletedEvent);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testMostRecentlyCompletedEventWhenHandlingEventsIsNotEmpty_bMup1() {
    HandlingEvent handlingEvent = new HandlingEvent();
    HandlingHistory handlingHistory = new HandlingHistory(List.of(handlingEvent));
    HandlingEvent mostRecentlyCompletedEvent = handlingHistory.getMostRecentlyCompletedEvent();
    assertSame(handlingEvent, mostRecentlyCompletedEvent);
  }
}