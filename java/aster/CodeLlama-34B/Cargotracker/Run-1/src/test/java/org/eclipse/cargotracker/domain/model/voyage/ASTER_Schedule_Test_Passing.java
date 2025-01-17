/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Schedule_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_fiDI0() {
    Schedule schedule = new Schedule();
    assertTrue(schedule.equals(schedule));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_sSFQ2() {
    Schedule schedule = new Schedule();
    assertFalse(schedule.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_nmfF3() {
    Schedule schedule = new Schedule();
    Object object = new Object();
    assertFalse(schedule.equals(object));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_hjTF0() {
    Schedule schedule = new Schedule();
    int expectedHashCode = new HashCodeBuilder().append(schedule.getCarrierMovements()).toHashCode();
    int actualHashCode = schedule.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObject_pEbF1_fid1() {
    Schedule schedule1 = new Schedule();
    Schedule schedule2 = new Schedule();
    assertTrue(schedule1.equals(schedule2));
  }
}