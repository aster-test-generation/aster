/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Booking_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsBookable_hwqD0() {
    Booking booking = new Booking();
    boolean result = booking.isBookable();
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationUnlocode_YNpF0() {
    Booking booking = new Booking();
    String expected = null; // Assuming default null, adjust based on actual default or test setup
    String actual = booking.getDestinationUnlocode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDuration_upYy0() {
    Booking booking = new Booking();
    long expected = -1; // Assuming default duration is-1
    long actual = booking.getDuration();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOriginName_IjfQ0() {
    Booking booking = new Booking();
    assertNull(booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetReturnValue_uevy0() {
    Booking booking = new Booking();
    String expected = "/admin/dashboard.xhtml";
    assertEquals(expected, booking.getReturnValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_dUTa0() {
    Booking booking = new Booking();
    LocalDate expected = LocalDate.now(); // Assuming today's date for testing
    booking.setArrivalDeadline(expected); // Assuming setter method exists
    LocalDate actual = booking.getArrivalDeadline();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOriginUnlocode_NHSI0() {
    Booking booking = new Booking();
    String expected = null; // Assuming default null since no setter or constructor is shown
    assertEquals(expected, booking.getOriginUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetArrivalDeadline_iaxy0_tMVd0() {
    Booking booking = new Booking();
    LocalDate expectedDate = LocalDate.of(2023, 10, 15);
    booking.setArrivalDeadline(expectedDate);
    assertEquals(expectedDate, booking.getArrivalDeadline());
  }
}