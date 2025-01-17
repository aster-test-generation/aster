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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_HandlingActivity_Test_Passing {
  HandlingActivity handlingActivity;
  HandlingActivity otherHandlingActivity;
  private Voyage voyage;
  private HandlingEvent.Type type;
  private VoyageNumber voyageNumber;
  @Mock
  private Schedule schedule;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentTypeButSameLocationAndVoyage_zwpD1_RfmF0() {
    HandlingActivity activity1 = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("NLRTM"), "Rotterdam"), new Voyage(new VoyageNumber("012"), new Schedule()));
    HandlingActivity activity2 = new HandlingActivity(HandlingEvent.Type.UNLOAD, new Location(new UnLocode("NLRTM"), "Rotterdam"), new Voyage(new VoyageNumber("012"), new Schedule()));
    assertFalse(activity1.equals(activity2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNull_FnyA3_hiZT0() {
    HandlingActivity activity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("NLRTM"), "Rotterdam"), new Voyage(new VoyageNumber("012"), new Schedule()));
    assertFalse(activity.equals(null));
  }
}