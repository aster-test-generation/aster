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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_HandlingActivity_Test_Failing {
  private HandlingActivity handlingActivity;
  private HandlingActivity sameHandlingActivity;
  private HandlingActivity differentHandlingActivity;
  private Voyage voyage;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmpty_TypeNotNull_Udjr1() {
    HandlingActivity activity = new HandlingActivity(HandlingEvent.Type.LOAD, null);
    assertFalse(activity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmpty_VoyageNotNull_TeDz3() {
    VoyageNumber voyageNumber = new VoyageNumber("V001");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    HandlingActivity activity = new HandlingActivity(null, null, voyage);
    assertFalse(activity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmpty_FalseWhenLocationIsNull_xBNl0_fid2() {
    Voyage voyage = mock(Voyage.class);
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    HandlingActivity handlingActivity = new HandlingActivity(type, null, voyage);
    assertFalse(handlingActivity.isEmpty());
  }
}