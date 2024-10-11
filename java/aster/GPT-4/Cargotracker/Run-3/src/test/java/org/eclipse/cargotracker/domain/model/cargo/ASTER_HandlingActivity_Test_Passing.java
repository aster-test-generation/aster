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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingActivity_Test_Passing {
  private Voyage voyage;
  private HandlingEvent.Type type;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSameObject_fiYx0() throws Exception {
    HandlingActivity activity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("USNYC"), "New York"), new Voyage(new VoyageNumber("V001"), new Schedule()));
    assertTrue(activity.equals(activity));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNull_MOvP1() throws Exception {
    HandlingActivity activity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("USNYC"), "New York"), new Voyage(new VoyageNumber("V001"), new Schedule()));
    assertFalse(activity.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentClass_NnNt2() throws Exception {
    HandlingActivity activity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("USNYC"), "New York"), new Voyage(new VoyageNumber("V001"), new Schedule()));
    Object other = new Object();
    assertFalse(activity.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentValues_poBZ3() throws Exception {
    HandlingActivity activity1 = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("USNYC"), "New York"), new Voyage(new VoyageNumber("V001"), new Schedule()));
    HandlingActivity activity2 = new HandlingActivity(HandlingEvent.Type.UNLOAD, new Location(new UnLocode("GBLON"), "London"), new Voyage(new VoyageNumber("V002"), new Schedule()));
    assertFalse(activity1.equals(activity2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmpty_AllNull_CmVq0() throws Exception {
    HandlingActivity activity = new HandlingActivity();
    assertTrue(activity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmpty_TypeNotNull_CXDZ1() throws Exception {
    Location location = new Location();
    Voyage voyage = new Voyage();
    HandlingActivity activity = new HandlingActivity(HandlingEvent.Type.LOAD, location, voyage);
    assertFalse(activity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmpty_LocationNotNull_cdKO2() throws Exception {
    HandlingActivity activity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location());
    assertFalse(activity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType_ZMoh0() throws Exception {
    UnLocode unLocode = new UnLocode("USNYC");
    Location location = new Location(unLocode, "New York");
    VoyageNumber voyageNumber = new VoyageNumber("V123");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, location, voyage);
    assertEquals(HandlingEvent.Type.LOAD, handlingActivity.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_vCOa0() throws Exception {
    UnLocode unLocode = new UnLocode("USNYC");
    Location location = new Location(unLocode, "New York");
    Voyage voyage = new Voyage();
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, location, voyage);
    Location result = handlingActivity.getLocation();
    assertEquals(location, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyage_yIPg0() throws Exception {
    Voyage expectedVoyage = new Voyage(new VoyageNumber("V123"), new Schedule());
    Location location = new Location(new UnLocode("USNYC"), "New York");
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, location, expectedVoyage);
    Voyage actualVoyage = handlingActivity.getVoyage();
    assertEquals(expectedVoyage, actualVoyage);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeConsistency_bZET0() throws Exception {
    UnLocode unLocode = new UnLocode("USNYC");
    Location location = new Location(unLocode, "New York");
    VoyageNumber voyageNumber = new VoyageNumber("V001");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, location, voyage);
    int expectedHashCode = handlingActivity.hashCode();
    int actualHashCode = handlingActivity.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }
}