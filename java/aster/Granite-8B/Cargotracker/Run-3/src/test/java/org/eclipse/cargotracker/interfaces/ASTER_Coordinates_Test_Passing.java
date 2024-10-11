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

public class Aster_Coordinates_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongitude_Lpkn0() throws Exception {
    Coordinates coordinates = new Coordinates(0.0, 0.0);
    assertEquals(0.0, coordinates.getLongitude(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_HiII0() throws Exception {
    Coordinates coordinates = new Coordinates(40.7128, -74.0060);
    assertEquals(40.7128, coordinates.getLatitude(), 0.0001);
  }
}