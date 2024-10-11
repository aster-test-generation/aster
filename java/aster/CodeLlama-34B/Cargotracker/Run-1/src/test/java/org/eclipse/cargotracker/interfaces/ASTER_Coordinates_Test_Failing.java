/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Coordinates_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongitude_ValidInput_JJyv0() {
    Coordinates coordinates = new Coordinates(37.7749, -122.4194);
    double longitude = coordinates.getLongitude();
    assertEquals(37.7749, longitude, 0.0001);
  }
}