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
  void getLongitudeTest_IdTV0() throws Exception {
    Coordinates coordinates = new Coordinates(0.0, 0.0);
    double longitude = coordinates.getLongitude();
    assert longitude == 0.0;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_1_xcmd0() throws Exception {
    Coordinates coordinates = new Coordinates(0.0, 0.0);
    double actual = coordinates.getLatitude();
    assertEquals(0.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_2_OdzX1() throws Exception {
    Coordinates coordinates = new Coordinates(10.0, 20.0);
    double actual = coordinates.getLatitude();
    assertEquals(10.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_3_MsdN2() throws Exception {
    Coordinates coordinates = new Coordinates(-10.0, -20.0);
    double actual = coordinates.getLatitude();
    assertEquals(-10.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_4_gcYZ3() throws Exception {
    Coordinates coordinates = new Coordinates(90.0, 180.0);
    double actual = coordinates.getLatitude();
    assertEquals(90.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_5_iyAU4() throws Exception {
    Coordinates coordinates = new Coordinates(-90.0, -180.0);
    double actual = coordinates.getLatitude();
    assertEquals(-90.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_6_QnQY5() throws Exception {
    Coordinates coordinates = new Coordinates(1.0, 2.0);
    double actual = coordinates.getLatitude();
    assertEquals(1.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_7_wRfQ6() throws Exception {
    Coordinates coordinates = new Coordinates(3.0, 4.0);
    double actual = coordinates.getLatitude();
    assertEquals(3.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_8_hLno7() throws Exception {
    Coordinates coordinates = new Coordinates(5.0, 6.0);
    double actual = coordinates.getLatitude();
    assertEquals(5.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_9_ofta8() throws Exception {
    Coordinates coordinates = new Coordinates(7.0, 8.0);
    double actual = coordinates.getLatitude();
    assertEquals(7.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_10_KvLG9() throws Exception {
    Coordinates coordinates = new Coordinates(9.0, 10.0);
    double actual = coordinates.getLatitude();
    assertEquals(9.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_11_DgpB10() throws Exception {
    Coordinates coordinates = new Coordinates(11.0, 12.0);
    double actual = coordinates.getLatitude();
    assertEquals(11.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_12_KrAr11() throws Exception {
    Coordinates coordinates = new Coordinates(13.0, 14.0);
    double actual = coordinates.getLatitude();
    assertEquals(13.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_13_scvW12() throws Exception {
    Coordinates coordinates = new Coordinates(15.0, 16.0);
    double actual = coordinates.getLatitude();
    assertEquals(15.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_14_NXGc13() throws Exception {
    Coordinates coordinates = new Coordinates(17.0, 18.0);
    double actual = coordinates.getLatitude();
    assertEquals(17.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_15_SHCx14() throws Exception {
    Coordinates coordinates = new Coordinates(19.0, 20.0);
    double actual = coordinates.getLatitude();
    assertEquals(19.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_16_nbPf15() throws Exception {
    Coordinates coordinates = new Coordinates(21.0, 22.0);
    double actual = coordinates.getLatitude();
    assertEquals(21.0, actual, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getLatitude_17_ExqJ16() throws Exception {
    Coordinates coordinates = new Coordinates(23.0, 24.0);
    double actual = coordinates.getLatitude();
    assertEquals(23.0, actual, 0.0);
  }
}