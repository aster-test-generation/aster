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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingHistory_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHandlingHistory_dMuU0() {
    HandlingHistory handlingHistory = new HandlingHistory(Arrays.asList(new HandlingEvent(), new HandlingEvent()));
    assertEquals(0, handlingHistory.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHandlingHistory2_VxlU1() {
    HandlingHistory handlingHistory = new HandlingHistory(null);
    assertEquals(0, handlingHistory.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHandlingHistory3_ScCS2() {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<>());
    assertEquals(0, handlingHistory.hashCode());
  }
}