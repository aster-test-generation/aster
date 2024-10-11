/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.voyage.Schedule;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingActivity_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmpty_TypeNotNull_LocationNull_VoyageNotNull_mhIB1() {
    HandlingActivity activity = new HandlingActivity(HandlingEvent.Type.LOAD, null, new Voyage(new VoyageNumber("123"), new Schedule()));
    assertFalse(activity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsNull_qqlX2_nrYq1() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity();
    boolean result = !handlingActivity.equals(null);
    assertEquals(true, result);
  }
}