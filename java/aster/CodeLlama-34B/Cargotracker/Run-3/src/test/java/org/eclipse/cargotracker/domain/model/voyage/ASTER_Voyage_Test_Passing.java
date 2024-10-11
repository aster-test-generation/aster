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
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_apQg0() throws Exception {
    Voyage voyage = new Voyage(new VoyageNumber("12345"), new Schedule());
    assertTrue(voyage.equals(voyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObject_dFGg1() throws Exception {
    Voyage voyage1 = new Voyage(new VoyageNumber("12345"), new Schedule());
    Voyage voyage2 = new Voyage(new VoyageNumber("12345"), new Schedule());
    assertFalse(voyage1.equals(voyage2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_rZxn2() throws Exception {
    Voyage voyage = new Voyage(new VoyageNumber("12345"), new Schedule());
    assertFalse(voyage.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSchedule_PBtw0() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertEquals(schedule, voyage.getSchedule());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScheduleWithNullVoyageNumber_lOFw1() throws Exception {
    VoyageNumber voyageNumber = null;
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertNull(voyage.getSchedule());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScheduleWithNullSchedule_rTph2() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    Schedule schedule = null;
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertNull(voyage.getSchedule());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetScheduleWithNullVoyageNumberAndSchedule_ELPf3() throws Exception {
    VoyageNumber voyageNumber = null;
    Schedule schedule = null;
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertNull(voyage.getSchedule());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_vhcX0() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    String expected = "Voyage 12345";
    String actual = voyage.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_uvEj0() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertEquals("12345", voyage.getVoyageNumber().getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithNullVoyageNumber_FoyB1() throws Exception {
    VoyageNumber voyageNumber = null;
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertNull(voyage.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithNullSchedule_KTXD2() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    Schedule schedule = null;
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertNull(voyage.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithNullVoyageNumberAndSchedule_pYxU3() throws Exception {
    VoyageNumber voyageNumber = null;
    Schedule schedule = null;
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertNull(voyage.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAs_SameVoyageNumber_JPgM0() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    Voyage other = new Voyage(voyageNumber, schedule);
    assertTrue(voyage.sameIdentityAs(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAs_DifferentVoyageNumber_hnzr1() throws Exception {
    VoyageNumber voyageNumber1 = new VoyageNumber("12345");
    VoyageNumber voyageNumber2 = new VoyageNumber("54321");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber1, schedule);
    Voyage other = new Voyage(voyageNumber2, schedule);
    assertFalse(voyage.sameIdentityAs(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_VoyageNumber_Schedule_ZeAB0() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    int expectedHashCode = voyageNumber.hashCode();
    int actualHashCode = voyage.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_VoyageNumber_NullSchedule_Tcmr1() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    Voyage voyage = new Voyage(voyageNumber, null);
    int expectedHashCode = voyageNumber.hashCode();
    int actualHashCode = voyage.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullVoyageNumber_Schedule_oecR2() throws Exception {
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(null, schedule);
    int expectedHashCode = 0;
    int actualHashCode = voyage.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullVoyageNumber_NullSchedule_hIra3() throws Exception {
    Voyage voyage = new Voyage(null, null);
    int expectedHashCode = 0;
    int actualHashCode = voyage.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }
}