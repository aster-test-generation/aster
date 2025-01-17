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
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoordinatesFactory_Test_Failing {
  @Mock
  UnLocode unLocode;
  @InjectMocks
  CoordinatesFactory coordinatesfactory;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_Vplz0_1() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNotNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_Vplz0_2() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertEquals(0.0, coordinates.getLatitude());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_Vplz0_3() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertEquals(0.0, coordinates.getLongitude());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullUnLocode_TpQd1_1() {
    UnLocode unLocode = null;
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNotNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullUnLocode_TpQd1_2() {
    UnLocode unLocode = null;
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertEquals(0.0, coordinates.getLatitude());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullUnLocode_TpQd1_3() {
    UnLocode unLocode = null;
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertEquals(0.0, coordinates.getLongitude());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithEmptyUnLocode_pfOF2_1() {
    UnLocode unLocode = new UnLocode("");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNotNull(coordinates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithEmptyUnLocode_pfOF2_2() {
    UnLocode unLocode = new UnLocode("");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertEquals(0.0, coordinates.getLatitude());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithEmptyUnLocode_pfOF2_3() {
    UnLocode unLocode = new UnLocode("");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertEquals(0.0, coordinates.getLongitude());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_Vplz0() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNotNull(coordinates);
    assertEquals(0.0, coordinates.getLatitude());
    assertEquals(0.0, coordinates.getLongitude());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullUnLocode_TpQd1() {
    UnLocode unLocode = null;
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNotNull(coordinates);
    assertEquals(0.0, coordinates.getLatitude());
    assertEquals(0.0, coordinates.getLongitude());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithEmptyUnLocode_pfOF2() {
    UnLocode unLocode = new UnLocode("");
    Coordinates coordinates = CoordinatesFactory.find(unLocode);
    assertNotNull(coordinates);
    assertEquals(0.0, coordinates.getLatitude());
    assertEquals(0.0, coordinates.getLongitude());
  }
}