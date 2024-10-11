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
  public void testEquals_SameObject_dTIN0() {
    Schedule schedule = new Schedule();
    assertTrue(schedule.equals(schedule));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_sjfA1() {
    Schedule schedule = new Schedule();
    assertFalse(schedule.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_auQg2() {
    Schedule schedule = new Schedule();
    assertFalse(schedule.equals(new Object()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCarrierMovements_raJB0() {
    Schedule schedule = new Schedule();
    List<CarrierMovement> carrierMovements = schedule.getCarrierMovements();
    assertNotNull(carrierMovements);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_WpEx0() {
    Schedule schedule = new Schedule();
    int result = schedule.hashCode();
    assertEquals(result, schedule.hashCode());
  }
}