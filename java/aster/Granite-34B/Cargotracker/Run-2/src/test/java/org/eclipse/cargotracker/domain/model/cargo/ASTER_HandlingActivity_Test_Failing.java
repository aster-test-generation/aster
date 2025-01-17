/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.Schedule;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_HandlingActivity_Test_Failing {
  HandlingActivity handlingactivity;
  Voyage voyage;
  VoyageNumber voyagenum;
  Schedule schedule;
  UnLocode unLocode;
  private HandlingEvent.Type type;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void isEmpty_type_not_null_WZOH0() {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, null, null);
    boolean isEmpty = handlingActivity.isEmpty();
    Assertions.assertFalse(isEmpty);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void isEmpty_voyage_not_null_EUbt2() {
    HandlingActivity handlingActivity = new HandlingActivity(null, null, new Voyage(new VoyageNumber("0123"), new Schedule()));
    boolean isEmpty = handlingActivity.isEmpty();
    Assertions.assertFalse(isEmpty);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void isEmpty_all_null_KTno3() {
    HandlingActivity handlingActivity = new HandlingActivity(null, null, null);
    boolean isEmpty = handlingActivity.isEmpty();
    Assertions.assertTrue(isEmpty);
  }
}