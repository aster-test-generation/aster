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
  public void testGetLongitude_InvalidInput_mClc1() {
    Coordinates coordinates = new Coordinates(0, 0);
    double longitude = coordinates.getLongitude();
    assertEquals(0, longitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongitude_MaxValue_GnXC3() {
    Coordinates coordinates = new Coordinates(Double.MAX_VALUE, Double.MAX_VALUE);
    double longitude = coordinates.getLongitude();
    assertEquals(Double.MAX_VALUE, longitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongitude_MinValue_nwxN4() {
    Coordinates coordinates = new Coordinates(Double.MIN_VALUE, Double.MIN_VALUE);
    double longitude = coordinates.getLongitude();
    assertEquals(Double.MIN_VALUE, longitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongitude_NaN_Qqto5() {
    Coordinates coordinates = new Coordinates(Double.NaN, Double.NaN);
    double longitude = coordinates.getLongitude();
    assertEquals(Double.NaN, longitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongitude_Infinity_Wqhv6() {
    Coordinates coordinates = new Coordinates(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
    double longitude = coordinates.getLongitude();
    assertEquals(Double.POSITIVE_INFINITY, longitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongitude_NegativeInfinity_JVrH7() {
    Coordinates coordinates = new Coordinates(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
    double longitude = coordinates.getLongitude();
    assertEquals(Double.NEGATIVE_INFINITY, longitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongitude_NegativeZero_VvRr9() {
    Coordinates coordinates = new Coordinates(-0, -0);
    double longitude = coordinates.getLongitude();
    assertEquals(-0, longitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongitude_Infinity_ZAas13() {
    Coordinates coordinates = new Coordinates(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLatitude_SYyC0() {
    Coordinates coordinates = new Coordinates(37.7749, -122.4194);
    double latitude = coordinates.getLatitude();
    assertEquals(37.7749, latitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLatitudeWithZeroLongitude_fnoJ1() {
    Coordinates coordinates = new Coordinates(37.7749, 0);
    double latitude = coordinates.getLatitude();
    assertEquals(37.7749, latitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLatitudeWithPositiveLongitude_FGms3() {
    Coordinates coordinates = new Coordinates(37.7749, 122.4194);
    double latitude = coordinates.getLatitude();
    assertEquals(37.7749, latitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLatitudeWithMaxLongitude_LsFR4() {
    Coordinates coordinates = new Coordinates(37.7749, 180);
    double latitude = coordinates.getLatitude();
    assertEquals(37.7749, latitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLatitudeWithMinLongitude_ydni5() {
    Coordinates coordinates = new Coordinates(37.7749, -180);
    double latitude = coordinates.getLatitude();
    assertEquals(37.7749, latitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLatitudeWithInvalidLongitude_LuLN6() {
    Coordinates coordinates = new Coordinates(37.7749, 181);
    double latitude = coordinates.getLatitude();
    assertEquals(37.7749, latitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLatitudeWithInvalidLongitude2_PlzY7() {
    Coordinates coordinates = new Coordinates(37.7749, -181);
    double latitude = coordinates.getLatitude();
    assertEquals(37.7749, latitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLatitudeWithInvalidLongitude3_nGxg8() {
    Coordinates coordinates = new Coordinates(37.7749, 180.0001);
    double latitude = coordinates.getLatitude();
    assertEquals(37.7749, latitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLatitudeWithInvalidLongitude4_BqHB9() {
    Coordinates coordinates = new Coordinates(37.7749, -180.0001);
    double latitude = coordinates.getLatitude();
    assertEquals(37.7749, latitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLatitudeWithInvalidLongitude5_Mnbz10() {
    Coordinates coordinates = new Coordinates(37.7749, 180.00001);
    double latitude = coordinates.getLatitude();
    assertEquals(37.7749, latitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLatitudeWithInvalidLongitude6_CTJU11() {
    Coordinates coordinates = new Coordinates(37.7749, -180.00001);
    double latitude = coordinates.getLatitude();
    assertEquals(37.7749, latitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLatitudeWithInvalidLongitude7_xsCf12() {
    Coordinates coordinates = new Coordinates(37.7749, 180.000001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongitude_ValidInput_JJyv0_fid1() {
    Coordinates coordinates = new Coordinates(-122.4194, -122.4194);
    double longitude = coordinates.getLongitude();
    assertEquals(-122.4194, longitude, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLongitude_NullInput_GHfH2_PhwR0() {
    Coordinates coordinates = new Coordinates(0.0, 0.0);
    double longitude = coordinates.getLongitude();
    assertEquals(0, longitude, 0.0001);
  }
}