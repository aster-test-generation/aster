/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Voyage_Test_Passing {
  @Mock
  VoyageNumber voyageNumber;
  @Mock
  Schedule schedule;
  Voyage voyage;
  Voyage other;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_whenObjectIsSameInstance_thenReturnsTrue() throws Exception {
    voyage = new Voyage(voyageNumber, schedule);
    boolean result = voyage.equals(voyage);
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_whenObjectIsDifferentInstanceWithSameIdentity_thenReturnsTrue() throws Exception {
    voyage = new Voyage(voyageNumber, schedule);
    Voyage otherVoyage = new Voyage(voyageNumber, schedule);
    boolean result = voyage.equals(otherVoyage);
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_whenObjectIsDifferentInstanceWithDifferentIdentity_thenReturnsFalse() throws Exception {
    voyage = new Voyage(voyageNumber, schedule);
    Voyage otherVoyage = new Voyage(new VoyageNumber("123"), schedule);
    boolean result = voyage.equals(otherVoyage);
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_whenObjectIsDifferentType_thenReturnsFalse() throws Exception {
    voyage = new Voyage(voyageNumber, schedule);
    boolean result = voyage.equals("not a Voyage");
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_whenObjectIsNull_thenReturnsFalse() throws Exception {
    voyage = new Voyage(voyageNumber, schedule);
    boolean result = voyage.equals(null);
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNull_czml0() {
    Voyage voyage = new Voyage();
    boolean result = voyage.equals(null);
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSameObject_eKBY1() {
    Voyage voyage = new Voyage();
    boolean result = voyage.equals(voyage);
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentClass_mOJI2() {
    Voyage voyage = new Voyage();
    boolean result = voyage.equals(new Object());
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentVoyage_kdIg3() {
    Voyage voyage1 = new Voyage(new VoyageNumber("123"), new Schedule());
    Voyage voyage2 = new Voyage(new VoyageNumber("456"), new Schedule());
    boolean result = voyage1.equals(voyage2);
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSchedule_IatO0() {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    Schedule schedule = voyage.getSchedule();
    assertNotNull(schedule);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_FUkN0() {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    assertEquals("Voyage 123", voyage.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithEmptyVoyageNumber_Texe3() {
    Voyage voyage = new Voyage(new VoyageNumber(""), new Schedule());
    assertEquals("Voyage ", voyage.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_VOZE0() {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    assertEquals("123", voyage.getVoyageNumber().getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_wKWj0() {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    Voyage voyage2 = new Voyage(new VoyageNumber("123"), new Schedule());
    assertEquals(voyage.hashCode(), voyage2.hashCode());
  }
}