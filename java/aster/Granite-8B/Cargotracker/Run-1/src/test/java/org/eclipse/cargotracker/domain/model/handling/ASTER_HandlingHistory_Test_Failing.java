/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingHistory_Test_Failing {
  HandlingHistory handlingHistory;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNull_TzEW0() {
    HandlingHistory handlingHistory = new HandlingHistory(null);
    assertFalse(handlingHistory.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentClass_WUGO1() {
    HandlingHistory handlingHistory = new HandlingHistory(null);
    assertFalse(handlingHistory.equals(""));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSameObject_pEWd2() {
    HandlingHistory handlingHistory = new HandlingHistory(null);
    assertTrue(handlingHistory.equals(handlingHistory));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSameHandlingEvents_HIHp3() {
    HandlingHistory handlingHistory1 = new HandlingHistory(null);
    HandlingHistory handlingHistory2 = new HandlingHistory(null);
    assertTrue(handlingHistory1.equals(handlingHistory2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_cEat0() {
    HandlingHistory handlingHistory = new HandlingHistory(null);
    int expectedHashCode = 0;
    int actualHashCode = handlingHistory.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }
}