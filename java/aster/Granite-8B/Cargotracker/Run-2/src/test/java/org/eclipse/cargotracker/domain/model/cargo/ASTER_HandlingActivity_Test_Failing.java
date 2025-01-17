/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.Schedule;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_HandlingActivity_Test_Failing {
  HandlingActivity handlingActivity;
  HandlingActivity otherHandlingActivity;
  private Voyage voyage;
  private HandlingEvent.Type type;
  private VoyageNumber voyageNumber;
  @Mock
  private Schedule schedule;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmptyWithNullTypeAndLocationAndNullVoyage_KsSM0() {
    HandlingActivity handlingActivity = new HandlingActivity(null, null, null);
    assertTrue(handlingActivity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmptyWithNullTypeAndNullLocationAndNonNullVoyage_LNiz3() {
    HandlingActivity handlingActivity = new HandlingActivity(null, null, new Voyage(new VoyageNumber(""), new Schedule()));
    assertFalse(handlingActivity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmptyWithNullTypeAndNonNullLocationAndNullVoyage_bbNB2_Yzhr0() {
    HandlingActivity handlingActivity = new HandlingActivity(null, new Location(new UnLocode(), ""), null);
    assertFalse(handlingActivity.isEmpty());
  }
}