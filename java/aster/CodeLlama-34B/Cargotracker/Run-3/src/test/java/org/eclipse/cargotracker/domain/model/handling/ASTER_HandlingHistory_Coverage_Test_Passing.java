/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingHistory_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMostRecentlyCompletedEvent_EmptyList_TvBP0() {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<HandlingEvent>());
    HandlingEvent mostRecentlyCompletedEvent = handlingHistory.getMostRecentlyCompletedEvent();
    assertNull(mostRecentlyCompletedEvent);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_zbYh0() {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<>());
    assertTrue(handlingHistory.equals(handlingHistory));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_KdHH1() {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<>());
    assertFalse(handlingHistory.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ZHOT2() {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<>());
    assertFalse(handlingHistory.equals(""));
  }
}