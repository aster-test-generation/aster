/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingHistory_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getMostRecentlyCompletedEvent_HandlingEventListPopulated_Ahhh1() {
    HandlingEvent handlingEvent1 = new HandlingEvent();
    HandlingEvent handlingEvent2 = new HandlingEvent();
    HandlingHistory handlingHistory = new HandlingHistory(Arrays.asList(handlingEvent1, handlingEvent2));
    HandlingEvent handlingEvent = handlingHistory.getMostRecentlyCompletedEvent();
    Assertions.assertEquals(handlingEvent2, handlingEvent);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_equals_returns_true_for_same_object_CFWf0() {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    assertTrue(handlingHistory.equals(handlingHistory));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_equals_returns_true_for_same_values_EklK1() {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    HandlingHistory sameValueHandlingHistory = new HandlingHistory(Collections.emptyList());
    assertTrue(handlingHistory.equals(sameValueHandlingHistory));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_equals_returns_false_for_null_value_OEZj2() {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    assertFalse(handlingHistory.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_equals_returns_false_for_different_type_fCQR3() {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    HandlingEvent handlingEvent = new HandlingEvent();
    assertFalse(handlingHistory.equals(handlingEvent));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_equals_returns_false_for_different_values_TMpx4() {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    HandlingHistory differentValueHandlingHistory = new HandlingHistory(Collections.singletonList(new HandlingEvent()));
    assertFalse(handlingHistory.equals(differentValueHandlingHistory));
  }
}