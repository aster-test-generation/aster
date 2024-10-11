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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Booking_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetArrivalDeadline_DJcP0() {
    Booking booking = new Booking();
    LocalDate arrivalDeadline = LocalDate.now();
    booking.setArrivalDeadline(arrivalDeadline);
    assertEquals(arrivalDeadline, booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getDurationTest_rvit0() {
    Booking booking = new Booking();
    long duration = booking.getDuration();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getReturnValueTest_BJgF0() {
    Booking booking = new Booking();
    String actual = booking.getReturnValue();
    String expected = "/admin/dashboard.xhtml";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getReturnValueTest_Coverage_sXMk1() {
    Booking booking = new Booking();
    booking.getReturnValue();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withSampleData_hSYp0() {
    Booking booking = new Booking();
    booking.setArrivalDeadline(LocalDate.of(2022, 12, 31));
    assertEquals(LocalDate.of(2022, 12, 31), booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withPastDate_Wvvl4() {
    Booking booking = new Booking();
    booking.setArrivalDeadline(LocalDate.of(2021, 12, 31));
    assertEquals(LocalDate.of(2021, 12, 31), booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withCurrentDate_DtuP5() {
    Booking booking = new Booking();
    booking.setArrivalDeadline(LocalDate.now());
    assertEquals(LocalDate.now(), booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withEmptyData_chGT11() {
    Booking booking = new Booking();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withNullData_jUDh12() {
    Booking booking = new Booking();
    booking.setArrivalDeadline(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getArrivalDeadline_withFutureDate_eLHo13() {
    Booking booking = new Booking();
    booking.setArrivalDeadline(LocalDate.of(2023, 1, 1));
    assertEquals(LocalDate.of(2023, 1, 1), booking.getArrivalDeadline());
  }
}