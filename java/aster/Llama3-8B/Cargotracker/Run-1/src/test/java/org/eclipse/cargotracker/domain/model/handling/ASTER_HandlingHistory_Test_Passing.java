/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingHistory_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMostRecentlyCompletedEvent_EmptyList_ReturnsNull_YgLd0() {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<>());
    HandlingEvent result = handlingHistory.getMostRecentlyCompletedEvent();
    assert result == null;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMostRecentlyCompletedEvent_NonEmptyList_ReturnsLastEvent_zZGT1() {
    HandlingHistory handlingHistory = new HandlingHistory(Arrays.asList(new HandlingEvent(), new HandlingEvent(), new HandlingEvent()));
    HandlingEvent result = handlingHistory.getMostRecentlyCompletedEvent();
    assert result != null;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsSameObject_IXkz0() {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<>());
    boolean result = handlingHistory.equals(handlingHistory);
    assert result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsNull_RPnt1() {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<>());
    boolean result = handlingHistory.equals(null);
    assert !result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsDifferentClass_TsxD2() {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<>());
    Object object = new Object();
    boolean result = handlingHistory.equals(object);
    assert !result;
  }
}