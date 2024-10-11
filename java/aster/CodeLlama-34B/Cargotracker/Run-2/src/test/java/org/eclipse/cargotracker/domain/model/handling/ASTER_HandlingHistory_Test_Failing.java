/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingHistory_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllHandlingEvents_null_NojV2() {
    HandlingHistory handlingHistory = new HandlingHistory(null);
    List<HandlingEvent> actual = handlingHistory.getAllHandlingEvents();
    assertNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_emptyHandlingEvents_ghjd0() {
    HandlingHistory handlingHistory = new HandlingHistory(Collections.emptyList());
    int expectedHashCode = 0;
    int actualHashCode = handlingHistory.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }
}