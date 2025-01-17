/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Booking_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocode_NIcn0_1() {
    Booking booking = new Booking();
    String originUnlocode = "ABC";
    booking.setOriginUnlocode(originUnlocode);
    assertEquals(originUnlocode, booking.getOriginUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithNullOriginUnlocode_ihZo1_1() {
    Booking booking = new Booking();
    String originUnlocode = null;
    booking.setOriginUnlocode(originUnlocode);
    assertEquals(originUnlocode, booking.getOriginUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithNullOriginUnlocode_ihZo1_2() {
    Booking booking = new Booking();
    String originUnlocode = null;
    booking.setOriginUnlocode(originUnlocode);
    assertEquals(originUnlocode, booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithEmptyOriginUnlocode_PqWZ2_1() {
    Booking booking = new Booking();
    String originUnlocode = "";
    booking.setOriginUnlocode(originUnlocode);
    assertEquals("", booking.getOriginUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithEmptyOriginUnlocode_PqWZ2_2() {
    Booking booking = new Booking();
    String originUnlocode = "";
    booking.setOriginUnlocode(originUnlocode);
    assertEquals(originUnlocode, booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withEmptyData_wfkb1() {
    Booking booking = new Booking();
    assertNull(LocalDate.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withNullData_zUpK2() {
    Booking booking = new Booking();
    booking.setArrivalDeadline(null);
    assertNull(LocalDate.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withFutureDate_Fpqg3() {
    Booking booking = new Booking();
    booking.setArrivalDeadline(LocalDate.of(2023, 1, 1));
    assertEquals(LocalDate.of(2022, 12, 31), booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withInvalidDate_vPKG6() {
    Booking booking = new Booking();
    booking.setArrivalDeadline(LocalDate.of(2022, 13, 32));
    assertEquals(LocalDate.now(), booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withNegativeNumber_CFmi7() {
    Booking booking = new Booking();
    booking.setArrivalDeadline(LocalDate.of(2022, -1, 1));
    assertEquals(LocalDate.now(), booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withZero_OYkk8() {
    Booking booking = new Booking();
    booking.setArrivalDeadline(LocalDate.of(2022, 0, 0));
    assertEquals(LocalDate.now(), booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToday_gldK0() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.now();
    assertNull(today);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTodayCoverage_mduj1() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.of(2022, 1, 1);
    assertNull(today);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTodayCoverage2_otsh2() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.of(2022, 12, 31);
    assertNull(today);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocode_NIcn0_2_fid1() {
    Booking booking = new Booking();
    String originUnlocode = "ABC";
    booking.setOriginUnlocode(originUnlocode);
    assertEquals(originUnlocode, booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithEmptyOriginUnlocode_PqWZ2_1_fid1() {
    Booking booking = new Booking();
    String originUnlocode = "";
    booking.setOriginUnlocode(originUnlocode);
    assertEquals(originUnlocode, booking.getOriginUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withEmptyData_wfkb1_fid1() {
    Booking booking = new Booking();
    assertEquals(LocalDate.now(), booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withNullData_zUpK2_fid1() {
    Booking booking = new Booking();
    booking.setArrivalDeadline(null);
    assertEquals(LocalDate.now(), booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToday_gldK0_fid1() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.now();
    assertEquals(today, booking.getToday());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTodayCoverage_mduj1_fid1() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.of(2022, 1, 1);
    assertEquals(today, booking.getToday());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTodayCoverage2_otsh2_fid1() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.of(2022, 12, 31);
    assertEquals(today, booking.getToday());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocode_NIcn0() {
    Booking booking = new Booking();
    String originUnlocode = "ABC";
    booking.setOriginUnlocode(originUnlocode);
    assertEquals(originUnlocode, booking.getOriginUnlocode());
    assertEquals(originUnlocode, booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithNullOriginUnlocode_ihZo1() {
    Booking booking = new Booking();
    String originUnlocode = null;
    booking.setOriginUnlocode(originUnlocode);
    assertEquals(originUnlocode, booking.getOriginUnlocode());
    assertEquals(originUnlocode, booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithEmptyOriginUnlocode_PqWZ2() {
    Booking booking = new Booking();
    String originUnlocode = "";
    booking.setOriginUnlocode(originUnlocode);
    assertEquals(originUnlocode, booking.getOriginUnlocode());
    assertEquals(originUnlocode, booking.getOriginName());
  }
}