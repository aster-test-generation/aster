/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingHistory_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_dyGO0() {
    HandlingHistory handlingHistory = new HandlingHistory(null);
    HandlingHistory other = new HandlingHistory(null);
    boolean result = handlingHistory.equals(other);
    assert result;
  }
}