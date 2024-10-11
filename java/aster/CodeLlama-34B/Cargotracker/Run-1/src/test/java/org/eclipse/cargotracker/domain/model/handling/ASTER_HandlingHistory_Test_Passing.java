/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingHistory_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMostRecentlyCompletedEvent_emptyHandlingEvents_anQR0() {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    HandlingEvent mostRecentlyCompletedEvent = handlingHistory.getMostRecentlyCompletedEvent();
    assertNull(mostRecentlyCompletedEvent);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDistinctEventsByCompletionTime_empty_svMP0() {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    List<HandlingEvent> actual = handlingHistory.getDistinctEventsByCompletionTime();
    assertTrue(actual.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllHandlingEventsWithEmptyList_QoFU1() {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    List<HandlingEvent> allHandlingEvents = handlingHistory.getAllHandlingEvents();
    assertEquals(0, allHandlingEvents.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDistinctEventsByCompletionTime_nullEvents_oMIr4_fid1() {
    HandlingHistory handlingHistory = new HandlingHistory(Arrays.asList(null, null, null));
    List<HandlingEvent> actual = handlingHistory.getDistinctEventsByCompletionTime();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_emptyHandlingEvents_PAUv0_fid1() {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_nullHandlingEvent_loAc4_fid1() {
    HandlingEvent handlingEvent = null;
    HandlingHistory handlingHistory = new HandlingHistory(Collections.singletonList(handlingEvent));
    assertEquals(31, handlingHistory.hashCode());
  }
}