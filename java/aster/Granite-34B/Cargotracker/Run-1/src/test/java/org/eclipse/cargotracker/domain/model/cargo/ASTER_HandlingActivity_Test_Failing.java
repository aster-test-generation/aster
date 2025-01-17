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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingActivity_Test_Failing {
  HandlingActivity handlingactivity;
  HandlingActivity otherHandlingActivity;
  Voyage voyage;
  VoyageNumber voyageNumber;
  UnLocode unLocode;
  private HandlingEvent.Type type;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageTest_MqyT0_aVIG0() {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("countryAndLocation"), "name"), new Voyage(new VoyageNumber("number"), new Schedule()));
    Voyage voyage = handlingActivity.getVoyage();
    assertNotNull(voyage);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageNullTest_RRXx1_hycd0() {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("countryAndLocation"), "name"), null);
    Voyage voyage = handlingActivity.getVoyage();
    assertNull(voyage);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void isEmpty_location_null_should_return_true_ezZC4() {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, null, new Voyage(new VoyageNumber("0123"), new Schedule()));
    boolean isEmpty = handlingActivity.isEmpty();
    Assertions.assertTrue(isEmpty);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void isEmpty_all_null_should_return_true_EGWA5() {
    HandlingActivity handlingActivity = new HandlingActivity(null, null, null);
    boolean isEmpty = handlingActivity.isEmpty();
    Assertions.assertTrue(isEmpty);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void isEmpty_type_null_should_return_true_mDbO3_FupB0() {
    HandlingActivity handlingActivity = new HandlingActivity(null, new Location(new UnLocode("SESTO"), "Stockholm"), new Voyage(new VoyageNumber("0123"), new Schedule()));
    boolean isEmpty = handlingActivity.isEmpty();
    Assertions.assertTrue(isEmpty);
  }
}