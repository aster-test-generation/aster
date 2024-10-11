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

public class Aster_Booking_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetArrivalDeadline_Vnpi0() {
    Booking booking = new Booking();
    LocalDate arrivalDeadline = LocalDate.of(2022, 12, 31);
    booking.setArrivalDeadline(arrivalDeadline);
    assertEquals(arrivalDeadline, booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDuration_lsqe0() {
    Booking booking = new Booking();
    long expected = -1; // default value of duration
    long actual = booking.getDuration();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOriginName_zhoS0() {
    Booking booking = new Booking();
    String originName = booking.getOriginName();
    assertNull(originName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetReturnValue_bbqj0() {
    Booking booking = new Booking();
    String result = booking.getReturnValue();
    assertEquals("/admin/dashboard.xhtml", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationName_RBVQ0() {
    Booking booking = new Booking();
    String result = booking.getDestinationName();
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_KmOC0_YZoL0() {
  }
}