/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Voyage_Test_Passing {
  Voyage voyage;
  VoyageNumber voyageNumber;
  Schedule schedule;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_ReturnsTrue() throws Exception {
    voyageNumber = new VoyageNumber("123");
    schedule = new Schedule();
    voyage = new Voyage(voyageNumber, schedule);
    assertTrue(voyage.equals(voyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_ReturnsFalse() throws Exception {
    voyageNumber = new VoyageNumber("123");
    schedule = new Schedule();
    voyage = new Voyage(voyageNumber, schedule);
    assertFalse(voyage.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ReturnsFalse() throws Exception {
    voyageNumber = new VoyageNumber("123");
    schedule = new Schedule();
    voyage = new Voyage(voyageNumber, schedule);
    assertFalse(voyage.equals(new Object()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameIdentity_ReturnsTrue() throws Exception {
    voyageNumber = new VoyageNumber("123");
    schedule = new Schedule();
    voyage = new Voyage(voyageNumber, schedule);
    Voyage sameVoyage = new Voyage(voyageNumber, schedule);
    assertTrue(voyage.equals(sameVoyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentIdentity_ReturnsFalse() throws Exception {
    voyageNumber = new VoyageNumber("123");
    schedule = new Schedule();
    voyage = new Voyage(voyageNumber, schedule);
    Voyage differentVoyage = new Voyage(new VoyageNumber("456"), new Schedule());
    assertFalse(voyage.equals(differentVoyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_POBk0() {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    assertTrue(voyage.equals(voyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_GAyG1() {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    assertFalse(voyage.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_SnBU2() {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    assertFalse(voyage.equals(new Object()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentVoyage_agOC3() {
    Voyage voyage1 = new Voyage(new VoyageNumber("123"), new Schedule());
    Voyage voyage2 = new Voyage(new VoyageNumber("456"), new Schedule());
    assertFalse(voyage1.equals(voyage2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSchedule_lsLv0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    Schedule result = voyage.getSchedule();
    assertEquals(schedule, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_ALlx0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertEquals("Voyage " + voyageNumber.toString(), voyage.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_CAbC0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    VoyageNumber result = voyage.getVoyageNumber();
    assertEquals(voyageNumber, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testsameIdentityAs_1() throws Exception {
    voyageNumber = Mockito.mock(VoyageNumber.class);
    schedule = Mockito.mock(Schedule.class);
    voyage = new Voyage(voyageNumber, schedule);
    // Create a mock Voyage object with the same voyage number
    Voyage otherVoyage = new Voyage(voyageNumber, schedule);
    // When sameValueAs is called on voyageNumber, return true
    Mockito.when(voyageNumber.sameValueAs(voyageNumber)).thenReturn(true);
    // Assert that sameIdentityAs returns true
    // Create a mock Voyage object with a different voyage number
    Voyage differentVoyage = new Voyage(Mockito.mock(VoyageNumber.class), schedule);
    // Assert that sameIdentityAs returns false
    assertTrue(voyage.sameIdentityAs(otherVoyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testsameIdentityAs_2() throws Exception {
    voyageNumber = Mockito.mock(VoyageNumber.class);
    schedule = Mockito.mock(Schedule.class);
    voyage = new Voyage(voyageNumber, schedule);
    // Create a mock Voyage object with the same voyage number
    Voyage otherVoyage = new Voyage(voyageNumber, schedule);
    // When sameValueAs is called on voyageNumber, return true
    Mockito.when(voyageNumber.sameValueAs(voyageNumber)).thenReturn(true);
    // Assert that sameIdentityAs returns true
    // Create a mock Voyage object with a different voyage number
    Voyage differentVoyage = new Voyage(Mockito.mock(VoyageNumber.class), schedule);
    // Assert that sameIdentityAs returns false
    assertFalse(voyage.sameIdentityAs(differentVoyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAsNull_dpWN0() {
    Voyage voyage = new Voyage();
    assertFalse(voyage.sameIdentityAs(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAsDifferentVoyageNumber_QmDn1() {
    Voyage voyage1 = new Voyage(new VoyageNumber("1"), new Schedule());
    Voyage voyage2 = new Voyage(new VoyageNumber("2"), new Schedule());
    assertFalse(voyage1.sameIdentityAs(voyage2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAsSameVoyageNumber_UgLH2() {
    VoyageNumber voyageNumber = new VoyageNumber("1");
    Voyage voyage1 = new Voyage(voyageNumber, new Schedule());
    Voyage voyage2 = new Voyage(voyageNumber, new Schedule());
    assertTrue(voyage1.sameIdentityAs(voyage2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_gPZZ0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertEquals(voyageNumber.hashCode(), voyage.hashCode());
  }
}