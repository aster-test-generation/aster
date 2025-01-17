/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingEvent_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testequals_if_o_is_null_jZCZ0() throws Exception {
    HandlingEvent event = new HandlingEvent();
    boolean actual = event.equals(null);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testequals_if_o_is_not_HandlingEvent_eTip1() throws Exception {
    HandlingEvent event = new HandlingEvent();
    boolean actual = event.equals(new Object());
    boolean expected = false;
    assertEquals(expected, actual);
  }
}