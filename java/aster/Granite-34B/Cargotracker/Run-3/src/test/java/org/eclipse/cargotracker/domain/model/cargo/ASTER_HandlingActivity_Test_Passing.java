/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.builder.HashCodeBuilder;
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
  HandlingActivity handlingactivity;
  HandlingActivity other;
  Voyage voyage;
  Voyage otherVoyage;
  VoyageNumber voyageNumber;
  VoyageNumber otherVoyageNumber;
  Schedule schedule;
  private HandlingEvent.Type type;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetVoyage() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("AB123");
    Schedule schedule = new Schedule();
    voyage = new Voyage(voyageNumber, schedule);
    handlingactivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("USCHI"), "Chicago"), voyage);
    assertEquals(voyage, handlingactivity.getVoyage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType_DDmy0() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("USCHI"), "Chicago"), new Voyage(new VoyageNumber("0123"), new Schedule()));
    assertEquals(HandlingEvent.Type.LOAD, handlingActivity.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyage_Upwz0() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("USNYC"), "New York"), new Voyage(new VoyageNumber("001"), new Schedule()));
    Voyage voyage = handlingActivity.getVoyage();
    assertEquals(new VoyageNumber("001"), voyage.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_vNOy0() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("countryAndLocation"), "name"), new Voyage(new VoyageNumber("number"), new Schedule()));
    assertEquals(handlingActivity.hashCode(), new HashCodeBuilder().append(HandlingEvent.Type.LOAD).append(new Location(new UnLocode("countryAndLocation"), "name")).append(new Voyage(new VoyageNumber("number"), new Schedule())).toHashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void isEmpty_type_not_null_returns_false_ExFd0() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("USCHI"), "Chicago"), new Voyage(new VoyageNumber("0123"), new Schedule()));
    boolean actual = handlingActivity.isEmpty();
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void isEmpty_voyage_null_returns_true_ziSh2() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("USCHI"), "Chicago"), null);
    boolean actual = handlingActivity.isEmpty();
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void isEmpty_type_location_null_returns_true_kXDr3() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, null, null);
    boolean actual = handlingActivity.isEmpty();
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_XpEw0() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("USCHI"), "Chicago"), new Voyage(new VoyageNumber("0123"), new Schedule()));
    Location location = handlingActivity.getLocation();
    assertEquals(new Location(new UnLocode("USCHI"), "Chicago"), location);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_reflexive_vXEu0() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("SESTO"), "Stockholm"), new Voyage(new VoyageNumber("0100"), new Schedule()));
    assertTrue(handlingActivity.equals(handlingActivity));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_symmetric_lHDJ1() throws Exception {
    HandlingActivity handlingActivity1 = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("SESTO"), "Stockholm"), new Voyage(new VoyageNumber("0100"), new Schedule()));
    HandlingActivity handlingActivity2 = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("SESTO"), "Stockholm"), new Voyage(new VoyageNumber("0100"), new Schedule()));
    assertTrue(handlingActivity1.equals(handlingActivity2) && handlingActivity2.equals(handlingActivity1));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_transitive_PZqV2() throws Exception {
    HandlingActivity handlingActivity1 = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("SESTO"), "Stockholm"), new Voyage(new VoyageNumber("0100"), new Schedule()));
    HandlingActivity handlingActivity2 = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("SESTO"), "Stockholm"), new Voyage(new VoyageNumber("0100"), new Schedule()));
    HandlingActivity handlingActivity3 = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("SESTO"), "Stockholm"), new Voyage(new VoyageNumber("0100"), new Schedule()));
    assertTrue(handlingActivity1.equals(handlingActivity2) && handlingActivity2.equals(handlingActivity3) && handlingActivity1.equals(handlingActivity3));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_null_kMnU3() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("SESTO"), "Stockholm"), new Voyage(new VoyageNumber("0100"), new Schedule()));
    assertFalse(handlingActivity.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_differentType_tNZr4() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("SESTO"), "Stockholm"), new Voyage(new VoyageNumber("0100"), new Schedule()));
    assertFalse(handlingActivity.equals(new Object()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_differentType3_asOm6() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("SESTO"), "Stockholm"), new Voyage(new VoyageNumber("0100"), new Schedule()));
    assertFalse(handlingActivity.equals(new HandlingActivity(HandlingEvent.Type.UNLOAD, new Location(new UnLocode("SESTO"), "Stockholm"), new Voyage(new VoyageNumber("0100"), new Schedule()))));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_differentType4_mGmG7() throws Exception {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("SESTO"), "Stockholm"), new Voyage(new VoyageNumber("0100"), new Schedule()));
    assertFalse(handlingActivity.equals(new HandlingActivity(HandlingEvent.Type.LOAD, new Location(new UnLocode("USNYC"), "New York"), new Voyage(new VoyageNumber("0100"), new Schedule()))));
  }
}