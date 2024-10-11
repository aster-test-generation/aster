/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Voyage_Test_Passing {
  Voyage voyage;
  VoyageNumber voyageNumber;
  Schedule schedule;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testequals() throws Exception {
    voyageNumber = new VoyageNumber("123");
    schedule = new Schedule();
    voyage = new Voyage(voyageNumber, schedule);
    Voyage otherVoyage = new Voyage(voyageNumber, schedule);
    assertTrue(voyage.equals(otherVoyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WithNullObject_ReturnsFalse_exja0() {
    Voyage voyage = new Voyage(new VoyageNumber(), new Schedule());
    Object o = null;
    boolean actual = voyage.equals(o);
    boolean expected = false;
    assertTrue(actual == expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WithObjectOfDifferentClass_ReturnsFalse_jThv1() {
    Voyage voyage = new Voyage(new VoyageNumber(), new Schedule());
    Object o = new Object();
    boolean actual = voyage.equals(o);
    boolean expected = false;
    assertTrue(actual == expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WithObjectWithSameIdentity_ReturnsTrue_ugLE2() {
    VoyageNumber voyageNumber = new VoyageNumber("number");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    Voyage that = new Voyage(voyageNumber, schedule);
    boolean actual = voyage.equals(that);
    boolean expected = true;
    assertTrue(actual == expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WithObjectWithDifferentIdentity_ReturnsFalse_oynX3() {
    VoyageNumber voyageNumber = new VoyageNumber("number");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    Voyage that = new Voyage(new VoyageNumber(), new Schedule());
    boolean actual = voyage.equals(that);
    boolean expected = false;
    assertTrue(actual == expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getScheduleTest_lssa0() {
    VoyageNumber voyageNumber = new VoyageNumber("AB123");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertEquals(schedule, voyage.getSchedule());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_hmPH0() {
    VoyageNumber voyageNumber = new VoyageNumber("AB123");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertEquals("Voyage AB123", voyage.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageNumberTest_qZqo0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertEquals(voyageNumber, voyage.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageNumberCoverageTest_xWgb2() {
    Voyage voyage = new Voyage();
    assertEquals(null, voyage.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testsameIdentityAs() throws Exception {
    voyageNumber = new VoyageNumber("AB123");
    schedule = new Schedule();
    voyage = new Voyage(voyageNumber, schedule);
    Voyage otherVoyage = new Voyage(voyageNumber, schedule);
    assertTrue(voyage.sameIdentityAs(otherVoyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sameIdentityAs_otherIsThis_returnsTrue_RVGd0() {
    Voyage voyage = new Voyage(new VoyageNumber("AB123"), new Schedule());
    assertTrue(voyage.sameIdentityAs(voyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sameIdentityAs_null_returnsFalse_nbTn1() {
    Voyage voyage = new Voyage(new VoyageNumber("AB123"), new Schedule());
    assertFalse(voyage.sameIdentityAs(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sameIdentityAs_otherVoyageHasDifferentVoyageNumber_returnsFalse_fEjk2() {
    Voyage voyage = new Voyage(new VoyageNumber("AB123"), new Schedule());
    Voyage otherVoyage = new Voyage(new VoyageNumber("CD456"), new Schedule());
    assertFalse(voyage.sameIdentityAs(otherVoyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_yual0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertEquals(voyageNumber.hashCode(), voyage.hashCode());
  }
}