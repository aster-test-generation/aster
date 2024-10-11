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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoordinatesFactory_Test_Failing {
  CoordinatesFactory coordinatesFactory;
  UnLocode unLocode;
  Coordinates coordinates;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_BTjL0_1() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNotNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_BTjL0_2() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertEquals(0.0, coordinates.getLatitude(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_BTjL0_3() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertEquals(0.0, coordinates.getLongitude(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_mYfK0_HgMH0() {
    String unLocode = "countryAndLocation";
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNotNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_xaII0_huYB0_1() {
    Coordinates coordinates = CoordinatesFactory.find("UNLOCODE");
    assertNotNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_xaII0_huYB0_2() {
    Coordinates coordinates = CoordinatesFactory.find("UNLOCODE");
    assertEquals(10.0, coordinates.getLatitude(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_xaII0_huYB0_3() {
    Coordinates coordinates = CoordinatesFactory.find("UNLOCODE");
    assertEquals(20.0, coordinates.getLongitude(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_BTjL0() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNotNull(coordinates);
    assertEquals(0.0, coordinates.getLatitude(), 0.0);
    assertEquals(0.0, coordinates.getLongitude(), 0.0);
  }
}