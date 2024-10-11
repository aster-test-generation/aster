/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingHistory_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_withNullObject_shouldReturnFalse_JOgZ0() {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<HandlingEvent>());
    boolean actual = handlingHistory.equals(null);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_withObjectOfDifferentType_shouldReturnFalse_uwmD1() {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<HandlingEvent>());
    boolean actual = handlingHistory.equals(new Object());
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_withObjectWithSameHandlingEvents_shouldReturnTrue_Qzcg2() {
    HandlingHistory handlingHistory1 = new HandlingHistory(new ArrayList<HandlingEvent>());
    HandlingHistory handlingHistory2 = new HandlingHistory(new ArrayList<HandlingEvent>());
    boolean actual = handlingHistory1.equals(handlingHistory2);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllHandlingEvents_FFyF0() {
    HandlingEvent handlingEvent1 = new HandlingEvent();
    HandlingEvent handlingEvent2 = new HandlingEvent();
    HandlingEvent handlingEvent3 = new HandlingEvent();
    List<HandlingEvent> handlingEvents = Arrays.asList(handlingEvent1, handlingEvent2, handlingEvent3);
    HandlingHistory handlingHistory = new HandlingHistory(handlingEvents);
    List<HandlingEvent> actualHandlingEvents = handlingHistory.getAllHandlingEvents();
    assertEquals(handlingEvents, actualHandlingEvents);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllHandlingEvents_withNoHandlingEvents_UAYW1() {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    List<HandlingEvent> actualHandlingEvents = handlingHistory.getAllHandlingEvents();
    assertTrue(actualHandlingEvents.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllHandlingEvents_withSingleHandlingEvent_PuWd3() {
    HandlingEvent handlingEvent = new HandlingEvent();
    HandlingHistory handlingHistory = new HandlingHistory(Collections.singletonList(handlingEvent));
    List<HandlingEvent> actualHandlingEvents = handlingHistory.getAllHandlingEvents();
    assertEquals(Collections.singletonList(handlingEvent), actualHandlingEvents);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllHandlingEvents_withMultipleHandlingEvents_bvHb4() {
    HandlingEvent handlingEvent1 = new HandlingEvent();
    HandlingEvent handlingEvent2 = new HandlingEvent();
    HandlingEvent handlingEvent3 = new HandlingEvent();
    HandlingHistory handlingHistory = new HandlingHistory(Arrays.asList(handlingEvent1, handlingEvent2, handlingEvent3));
    List<HandlingEvent> actualHandlingEvents = handlingHistory.getAllHandlingEvents();
    assertEquals(Arrays.asList(handlingEvent1, handlingEvent2, handlingEvent3), actualHandlingEvents);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllHandlingEvents_withHandlingEventsInDifferentOrder_kbXv5() {
    HandlingEvent handlingEvent1 = new HandlingEvent();
    HandlingEvent handlingEvent2 = new HandlingEvent();
    HandlingEvent handlingEvent3 = new HandlingEvent();
    HandlingHistory handlingHistory = new HandlingHistory(Arrays.asList(handlingEvent2, handlingEvent3, handlingEvent1));
    List<HandlingEvent> actualHandlingEvents = handlingHistory.getAllHandlingEvents();
    assertEquals(Arrays.asList(handlingEvent1, handlingEvent2, handlingEvent3), actualHandlingEvents);
  }
}