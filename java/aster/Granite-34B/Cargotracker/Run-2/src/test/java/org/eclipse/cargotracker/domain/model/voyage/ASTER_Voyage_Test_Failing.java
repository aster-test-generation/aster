/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
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
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Voyage_Test_Failing {
  Voyage voyage;
  VoyageNumber voyageNumber;
  Schedule schedule;
  @Mock
  VoyageNumber mockVoyageNumber;
  @Mock
  Schedule mockSchedule;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testequals() throws Exception {
    voyageNumber = new VoyageNumber("123");
    schedule = new Schedule();
    voyage = new Voyage(voyageNumber, schedule);
    Voyage otherVoyage = new Voyage(mockVoyageNumber, mockSchedule);
    when(mockVoyageNumber.equals(voyageNumber)).thenReturn(true);
    when(mockSchedule.equals(schedule)).thenReturn(true);
    assertTrue(voyage.equals(otherVoyage));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WithSimilarObject_ReturnsTrue_osHw3() {
    Voyage voyage1 = new Voyage(new VoyageNumber(), new Schedule());
    Voyage voyage2 = new Voyage(new VoyageNumber(), new Schedule());
    assertTrue(voyage1.equals(voyage2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_WithDifferentSchedule_ReturnsFalse_XPCh5() {
    Voyage voyage1 = new Voyage(new VoyageNumber(), new Schedule());
    Voyage voyage2 = new Voyage(new VoyageNumber(), new Schedule());
    assertFalse(voyage1.equals(voyage2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testToString_voyageNumberNull_rKyC1() {
    VoyageNumber voyageNumber = null;
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    String expected = "Voyage null";
    String actual = voyage.toString();
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithNullVoyageNumber_Lstp1() {
    VoyageNumber voyageNumber = null;
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertEquals(voyageNumber, voyage.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithNullSchedule_pqXX2() {
    VoyageNumber voyageNumber = new VoyageNumber("AB123");
    Schedule schedule = null;
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertEquals(voyageNumber, voyage.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithNullVoyageNumberAndSchedule_SojH3() {
    VoyageNumber voyageNumber = null;
    Schedule schedule = null;
    Voyage voyage = new Voyage(voyageNumber, schedule);
    assertEquals(voyageNumber, voyage.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testHashCodeWithNullVoyageNumber_Yaua1() {
    VoyageNumber voyageNumber = null;
    Schedule schedule = new Schedule();
    Voyage voyage = new Voyage(voyageNumber, schedule);
    int expected = 0;
    int actual = voyage.hashCode();
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testHashCodeWithNullSchedule_jaPZ2() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    Schedule schedule = null;
    Voyage voyage = new Voyage(voyageNumber, schedule);
    int expected = voyageNumber.hashCode();
    int actual = voyage.hashCode();
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testHashCodeWithBothNull_jBFH3() {
    VoyageNumber voyageNumber = null;
    Schedule schedule = null;
    Voyage voyage = new Voyage(voyageNumber, schedule);
    int expected = 0;
    int actual = voyage.hashCode();
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }
}