/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Voyage_Test_Passing {
  private Voyage voyage;
  private VoyageNumber voyageNumber;
  private Schedule schedule;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Reflexive() throws Exception {
    voyageNumber = mock(VoyageNumber.class);
    schedule = mock(Schedule.class);
    voyage = new Voyage(voyageNumber, schedule);
    assertTrue(voyage.equals(voyage), "A voyage should be equal to itself.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null() throws Exception {
    voyageNumber = mock(VoyageNumber.class);
    schedule = mock(Schedule.class);
    voyage = new Voyage(voyageNumber, schedule);
    assertFalse(voyage.equals(null), "A voyage should not be equal to null.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass() throws Exception {
    voyageNumber = mock(VoyageNumber.class);
    schedule = mock(Schedule.class);
    voyage = new Voyage(voyageNumber, schedule);
    Object differentObject = new Object();
    assertFalse(voyage.equals(differentObject), "A voyage should not be equal to an object of a different class.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameIdentity() throws Exception {
    voyageNumber = mock(VoyageNumber.class);
    schedule = mock(Schedule.class);
    voyage = new Voyage(voyageNumber, schedule);
    Voyage anotherVoyage = new Voyage(voyageNumber, schedule);
    assertFalse(voyage.equals(anotherVoyage), "Two voyages with the same identity should be equal.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentIdentity() throws Exception {
    voyageNumber = mock(VoyageNumber.class);
    schedule = mock(Schedule.class);
    voyage = new Voyage(voyageNumber, schedule);
    VoyageNumber differentVoyageNumber = mock(VoyageNumber.class);
    Schedule differentSchedule = mock(Schedule.class);
    Voyage differentVoyage = new Voyage(differentVoyageNumber, differentSchedule);
    assertFalse(voyage.equals(differentVoyage), "Two voyages with different identities should not be equal.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Reflexive_RAvs0() {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    assertTrue(voyage.equals(voyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Symmetric_EUNI1() {
    Voyage voyage1 = new Voyage(new VoyageNumber("123"), new Schedule());
    Voyage voyage2 = new Voyage(new VoyageNumber("123"), new Schedule());
    assertTrue(voyage1.equals(voyage2) && voyage2.equals(voyage1));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_nuHp2() {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    assertFalse(voyage.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ZUKg3() {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    Object other = new Object();
    assertFalse(voyage.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSchedule_HkWl0() {
    Schedule expectedSchedule = new Schedule();
    VoyageNumber voyageNumber = new VoyageNumber("123");
    Voyage voyage = new Voyage(voyageNumber, expectedSchedule);
    Schedule actualSchedule = voyage.getSchedule();
    assertEquals(expectedSchedule, actualSchedule);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_wCMQ0() {
    VoyageNumber voyageNumber = new VoyageNumber("VN123");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertEquals("Voyage VN123", voyage.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_bILx0() {
    VoyageNumber expectedVoyageNumber = new VoyageNumber("12345");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(expectedVoyageNumber, schedule);
    VoyageNumber actualVoyageNumber = voyage.getVoyageNumber();
    assertEquals(expectedVoyageNumber, actualVoyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAs_WithNullOther_ReturnsFalse() throws Exception {
    voyageNumber = mock(VoyageNumber.class);
    Schedule schedule = mock(Schedule.class);
    voyage = new Voyage(voyageNumber, schedule);
    assertFalse(voyage.sameIdentityAs(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAs_WithSameVoyageNumber_ShouldReturnTrue_hEXo0() {
    VoyageNumber voyageNumber1 = new VoyageNumber("VN123");
    Schedule schedule1 = new Schedule();
    Voyage voyage1 = new Voyage(voyageNumber1, schedule1);
    VoyageNumber voyageNumber2 = new VoyageNumber("VN123");
    Schedule schedule2 = new Schedule();
    Voyage voyage2 = new Voyage(voyageNumber2, schedule2);
    assertTrue(voyage1.sameIdentityAs(voyage2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAs_WithDifferentVoyageNumber_ShouldReturnFalse_NMsI1() {
    VoyageNumber voyageNumber1 = new VoyageNumber("VN123");
    Schedule schedule1 = new Schedule();
    Voyage voyage1 = new Voyage(voyageNumber1, schedule1);
    VoyageNumber voyageNumber2 = new VoyageNumber("VN456");
    Schedule schedule2 = new Schedule();
    Voyage voyage2 = new Voyage(voyageNumber2, schedule2);
    assertFalse(voyage1.sameIdentityAs(voyage2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAs_WithNullOtherVoyage_ShouldReturnFalse_xMMy2() {
    VoyageNumber voyageNumber1 = new VoyageNumber("VN123");
    Schedule schedule1 = new Schedule();
    Voyage voyage1 = new Voyage(voyageNumber1, schedule1);
    assertFalse(voyage1.sameIdentityAs(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeConsistency_hNWo0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    int expectedHashCode = voyageNumber.hashCode();
    int actualHashCode = voyage.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }
}