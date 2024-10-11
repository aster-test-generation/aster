/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Coordinates_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongitude_InvalidInput_lgyB1() {
    Coordinates coordinates = new Coordinates(37.7749, -122.4194);
    double expectedLongitude = -122.4194;
    double actualLongitude = coordinates.getLongitude();
    assertNotEquals(expectedLongitude, actualLongitude, 0.0001);
  }
}