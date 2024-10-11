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
  HandlingActivity handlingActivity;
  HandlingActivity otherHandlingActivity;
  private Voyage voyage;
  private HandlingEvent.Type type;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getType_returnsType_rgAV0() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("GB"), "LHR"), new Voyage(new VoyageNumber("123"), new Schedule()));
    assertEquals(HandlingEvent.Type.LOAD, handlingActivity.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetLocation_pOyE0() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("US"), "New York"), new Voyage(new VoyageNumber("123"), new Schedule()));
    Location location = handlingActivity.getLocation();
    assertNotNull(location);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyage_HidW0() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("US"), "New York"), new Voyage(new VoyageNumber("123"), new Schedule()));
    Voyage expectedVoyage = new Voyage(new VoyageNumber("123"), new Schedule());
    assertEquals(expectedVoyage, handlingActivity.getVoyage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_ecjs0() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("US"), "New York"), new Voyage(new VoyageNumber("123"), new Schedule()));
    assertEquals(173864343, handlingActivity.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmptyWithNullTypeAndLocation_SmwW0() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity();
    assertTrue(handlingActivity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmptyWithNonNullTypeAndNullLocation_zInD1() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, null);
    assertTrue(handlingActivity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmptyWithNullTypeAndNonNullLocation_XqJx2() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(null, new Location());
    assertTrue(handlingActivity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmptyWithNonNullTypeAndNonNullLocation_VNfr3() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.UNLOAD, new Location());
    assertTrue(handlingActivity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSameTypeAndLocation_wyqf0() throws Exception {
    HandlingActivity handlingActivity1 = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("US"), "New York"), new Voyage(new VoyageNumber("123"), new Schedule()));
    HandlingActivity handlingActivity2 = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("US"), "New York"), new Voyage(new VoyageNumber("123"), new Schedule()));
    assertTrue(handlingActivity1.equals(handlingActivity2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentTypeButSameLocationAndVoyage_bvmR1() throws Exception {
    HandlingActivity handlingActivity1 = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("US"), "New York"), new Voyage(new VoyageNumber("123"), new Schedule()));
    HandlingActivity handlingActivity2 = new HandlingActivity(HandlingEvent.Type.UNLOAD, new Location(new UnLocode("US"), "New York"), new Voyage(new VoyageNumber("123"), new Schedule()));
    assertFalse(handlingActivity1.equals(handlingActivity2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSameTypeButDifferentLocationAndVoyage_HQMF2() throws Exception {
    HandlingActivity handlingActivity1 = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("US"), "New York"), new Voyage(new VoyageNumber("123"), new Schedule()));
    HandlingActivity handlingActivity2 = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("US"), "Los Angeles"), new Voyage(new VoyageNumber("456"), new Schedule()));
    assertFalse(handlingActivity1.equals(handlingActivity2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNull_UPpU3() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("US"), "New York"), new Voyage(new VoyageNumber("123"), new Schedule()));
    assertFalse(handlingActivity.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentClass_BUNw4() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("US"), "New York"), new Voyage(new VoyageNumber("123"), new Schedule()));
    assertFalse(handlingActivity.equals(""));
  }
}