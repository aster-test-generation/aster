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
  Voyage otherVoyage;
  Voyage other;
  VoyageNumber voyageNumber;
  Schedule schedule;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WhenObjectIsSameInstance_ThenReturnsTrue() throws Exception {
    voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    otherVoyage = new Voyage(new VoyageNumber("123"), new Schedule());
    // Arrange
    // Act
    boolean result = voyage.equals(voyage);
    // Assert
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WhenObjectIsSameTypeAndHasSameValues_ThenReturnsTrue() throws Exception {
    voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    otherVoyage = new Voyage(new VoyageNumber("123"), new Schedule());
    // Arrange
    // Act
    boolean result = voyage.equals(otherVoyage);
    // Assert
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WhenObjectIsSameTypeButHasDifferentValues_ThenReturnsFalse() throws Exception {
    voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    otherVoyage = new Voyage(new VoyageNumber("123"), new Schedule());
    // Arrange
    Voyage differentVoyage = new Voyage(new VoyageNumber("456"), new Schedule());
    // Act
    boolean result = voyage.equals(differentVoyage);
    // Assert
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WhenObjectIsDifferentType_ThenReturnsFalse() throws Exception {
    voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    otherVoyage = new Voyage(new VoyageNumber("123"), new Schedule());
    // Arrange
    Object differentObject = new Object();
    // Act
    boolean result = voyage.equals(differentObject);
    // Assert
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WhenObjectIsNull_ThenReturnsFalse() throws Exception {
    voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    otherVoyage = new Voyage(new VoyageNumber("123"), new Schedule());
    // Arrange
    // Act
    boolean result = voyage.equals(null);
    // Assert
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSchedule_eEEg0() throws Exception {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    Schedule schedule = voyage.getSchedule();
    assertNotNull(schedule);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_cItB0() throws Exception {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    assertEquals("Voyage 123", voyage.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAsWithNull_SOrv0() throws Exception {
    Voyage voyage = new Voyage();
    boolean result = voyage.sameIdentityAs(null);
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAsWithSameObject_ekwE1() throws Exception {
    Voyage voyage = new Voyage();
    boolean result = voyage.sameIdentityAs(voyage);
    assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAsWithDifferentObject_xfga2() throws Exception {
    Voyage voyage1 = new Voyage(new VoyageNumber("123"), new Schedule());
    Voyage voyage2 = new Voyage(new VoyageNumber("456"), new Schedule());
    boolean result = voyage1.sameIdentityAs(voyage2);
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetVoyageNumber_YAyl0() throws Exception {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    assertEquals("123", voyage.getVoyageNumber().getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetVoyageNumberWithNullVoyageNumber_IsFP1() throws Exception {
    Voyage voyage = new Voyage(null, new Schedule());
    assertNull(voyage.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetVoyageNumberWithNullSchedule_jcnm2() throws Exception {
    Voyage voyage = new Voyage(new VoyageNumber("123"), null);
    assertNull(voyage.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_VSAU0() throws Exception {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    assertEquals(123, voyage.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithNullVoyageNumber_Iwnb1() throws Exception {
    Voyage voyage = new Voyage(null, new Schedule());
    assertEquals(0, voyage.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithNullSchedule_bNZQ2() throws Exception {
    Voyage voyage = new Voyage(new VoyageNumber("123"), null);
    assertEquals(0, voyage.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithEmptyVoyageNumber_oTaf3() throws Exception {
    Voyage voyage = new Voyage(new VoyageNumber(""), new Schedule());
    assertEquals(0, voyage.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithEmptySchedule_KSIu4() throws Exception {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    assertEquals(0, voyage.hashCode());
  }
}