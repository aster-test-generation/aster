/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.ArrayList;
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
  public void testGetMostRecentlyCompletedEvent_emptyHandlingEvents_zgfJ0() throws Exception {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    HandlingEvent mostRecentlyCompletedEvent = handlingHistory.getMostRecentlyCompletedEvent();
    assertNull(mostRecentlyCompletedEvent);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_Phal0() throws Exception {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    assertTrue(handlingHistory.equals(handlingHistory));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObject_vFqH1() throws Exception {
    HandlingHistory handlingHistory1 = new HandlingHistory(Collections.emptyList());
    HandlingHistory handlingHistory2 = new HandlingHistory(Collections.emptyList());
    assertFalse(handlingHistory1.equals(handlingHistory2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameValue_IbFG2() throws Exception {
    HandlingHistory handlingHistory1 = new HandlingHistory(Collections.emptyList());
    HandlingHistory handlingHistory2 = new HandlingHistory(Collections.emptyList());
    assertTrue(handlingHistory1.equals(handlingHistory2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDistinctEventsByCompletionTime_empty_DpTz0() throws Exception {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    List<HandlingEvent> distinctEvents = handlingHistory.getDistinctEventsByCompletionTime();
    assertTrue(distinctEvents.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDistinctEventsByCompletionTime_nullHandlingEvents_QoDW4() throws Exception {
    HandlingHistory handlingHistory = new HandlingHistory(null);
    List<HandlingEvent> distinctEvents = handlingHistory.getDistinctEventsByCompletionTime();
    assertTrue(distinctEvents.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllHandlingEvents_empty_jvVE0() throws Exception {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<>());
    List<HandlingEvent> handlingEvents = handlingHistory.getAllHandlingEvents();
    assertTrue(handlingEvents.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllHandlingEvents_null_vPZt2() throws Exception {
    HandlingHistory handlingHistory = new HandlingHistory(null);
    List<HandlingEvent> handlingEvents = handlingHistory.getAllHandlingEvents();
    assertNull(handlingEvents);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_emptyHandlingEvents_DRrS0() throws Exception {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    assertEquals(0, handlingHistory.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_nullHandlingEvents_JlCh3() throws Exception {
    HandlingHistory handlingHistory = new HandlingHistory(null);
    assertEquals(0, handlingHistory.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_handlingEventsWithDifferentTypesAndLocationsAndSameTimes_owGd9() throws Exception {
  }
}