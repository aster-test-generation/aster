/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Schedule_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsSameObject_hPkK0() {
    Schedule schedule = new Schedule();
    boolean result = schedule.equals(schedule);
    assert result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsNull_CqJv1() {
    Schedule schedule = new Schedule();
    boolean result = schedule.equals(null);
    assert !result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCarrierMovements_BDFa0() {
    Schedule schedule = new Schedule();
    List<CarrierMovement> carrierMovements = schedule.getCarrierMovements();
    assert carrierMovements != null;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_qvLe630() {
    Schedule schedule = new Schedule();
    int result = schedule.hashCode();
    assertEquals(630, result);
  }
}