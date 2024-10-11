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

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingActivity_Coverage_Test_Failing {
  HandlingActivity handlingactivity;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void isEmpty_type_not_null_YONr0() {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, null, null);
    boolean isEmpty = handlingActivity.isEmpty();
    assertTrue(isEmpty);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void isEmpty_voyage_not_null_WoOu2() {
    HandlingActivity handlingActivity = new HandlingActivity(null, null, new Voyage(new VoyageNumber("0123"), new Schedule()));
    boolean isEmpty = handlingActivity.isEmpty();
    assertTrue(isEmpty);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void isEmpty_all_null_ihwV3() {
    HandlingActivity handlingActivity = new HandlingActivity(null, null, null);
    boolean isEmpty = handlingActivity.isEmpty();
    assertTrue(isEmpty);
  }
}