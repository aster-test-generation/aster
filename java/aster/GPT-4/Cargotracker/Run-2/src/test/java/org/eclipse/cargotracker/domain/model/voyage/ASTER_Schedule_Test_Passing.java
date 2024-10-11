/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Schedule_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSelf_aVuq0() {
    Schedule schedule = new Schedule();
    assertTrue(schedule.equals(schedule));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNull_Fydw1() {
    Schedule schedule = new Schedule();
    assertFalse(schedule.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentClass_umPy2() {
    Schedule schedule = new Schedule();
    Object other = new Object();
    assertFalse(schedule.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithEquivalentSchedule_nUnC3() {
    Schedule schedule1 = new Schedule();
    Schedule schedule2 = new Schedule();
    assertTrue(schedule1.equals(schedule2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCarrierMovementsReturnsUnmodifiableList_nMpW0() {
    Schedule schedule = new Schedule();
    List<CarrierMovement> result = schedule.getCarrierMovements();
    assertThrows(UnsupportedOperationException.class, () -> result.add(new CarrierMovement()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeConsistency_qqXz0() {
    Schedule schedule = new Schedule();
    int expectedHashCode = schedule.hashCode();
    int actualHashCode = schedule.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }
}