/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.Schedule;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingActivity_Test_Passing {
  HandlingActivity handlingActivity;
  HandlingActivity sameHandlingActivity;
  HandlingActivity differentHandlingActivity;
  HandlingActivity nullVoyageHandlingActivity;
  HandlingActivity nullLocationHandlingActivity;
  HandlingActivity nullTypeHandlingActivity;
  private Voyage voyage;
  private VoyageNumber voyageNumber;
  private Schedule schedule;
  private UnLocode unLocode;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmpty_withNullFields_IEal3() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity();
    assertTrue(handlingActivity.isEmpty());
  }
}