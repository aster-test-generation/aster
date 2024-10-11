/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoordinatesFactory_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_zVyw0_2() {
    UnLocode unLocode = new UnLocode("USCHI");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertEquals(37.7749, coordinates.getLongitude(), 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_zVyw0_3() {
    UnLocode unLocode = new UnLocode("USCHI");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertEquals(-122.4194, coordinates.getLatitude(), 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithInvalidUnLocode_bTig1() {
    UnLocode unLocode = new UnLocode("INVALID");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullUnLocode_cfUb2() {
    UnLocode unLocode = null;
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithEmptyUnLocode_cIaO3() {
    UnLocode unLocode = new UnLocode("");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullIdString_ppUK4() {
    UnLocode unLocode = new UnLocode(null);
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_Emcd0_1() {
    Coordinates coordinates = CoordinatesFactory.find("unLocode");
    assertNotNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_Emcd0_2() {
    Coordinates coordinates = CoordinatesFactory.find("unLocode");
    assertEquals(coordinates.getLongitude(), 0.0, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_Emcd0_3() {
    Coordinates coordinates = CoordinatesFactory.find("unLocode");
    assertEquals(coordinates.getLatitude(), 0.0, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithValidUnLocode_bsoA1_2() {
    Coordinates coordinates = CoordinatesFactory.find("unLocode");
    assertEquals(coordinates.getLongitude(), 1.0, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithValidUnLocode_bsoA1_3() {
    Coordinates coordinates = CoordinatesFactory.find("unLocode");
    assertEquals(coordinates.getLatitude(), 1.0, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithDifferentUnLocode_GwQd7_1() {
    Coordinates coordinates = CoordinatesFactory.find("differentUnLocode");
    assertNotNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithDifferentUnLocode_GwQd7_2() {
    Coordinates coordinates = CoordinatesFactory.find("differentUnLocode");
    assertEquals(coordinates.getLongitude(), 2.0, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithDifferentUnLocode_GwQd7_3() {
    Coordinates coordinates = CoordinatesFactory.find("differentUnLocode");
    assertEquals(coordinates.getLatitude(), 2.0, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithInvalidLocation_hFhI1_flKz0() {
    UnLocode unLocode = new UnLocode("USNYC");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_zVyw0() {
    UnLocode unLocode = new UnLocode("USCHI");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNotNull(coordinates);
    assertEquals(37.7749, coordinates.getLongitude(), 0.0001);
    assertEquals(-122.4194, coordinates.getLatitude(), 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_Emcd0() {
    Coordinates coordinates = CoordinatesFactory.find("unLocode");
    assertNotNull(coordinates);
    assertEquals(coordinates.getLongitude(), 0.0, 0.0);
    assertEquals(coordinates.getLatitude(), 0.0, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithValidUnLocode_bsoA1() {
    Coordinates coordinates = CoordinatesFactory.find("unLocode");
    assertNotNull(coordinates);
    assertEquals(coordinates.getLongitude(), 1.0, 0.0);
    assertEquals(coordinates.getLatitude(), 1.0, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithDifferentUnLocode_GwQd7() {
    Coordinates coordinates = CoordinatesFactory.find("differentUnLocode");
    assertNotNull(coordinates);
    assertEquals(coordinates.getLongitude(), 2.0, 0.0);
    assertEquals(coordinates.getLatitude(), 2.0, 0.0);
  }
}