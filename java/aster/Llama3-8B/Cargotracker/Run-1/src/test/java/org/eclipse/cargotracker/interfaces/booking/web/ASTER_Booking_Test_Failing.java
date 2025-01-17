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

public class Aster_Booking_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationUnlocode_lwpK0() {
    Booking booking = new Booking();
    String expected = "expectedDestinationUnlocode";
    String actual = booking.getDestinationUnlocode();
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocode_tpTN0() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("LHR");
    assertEquals("London Heathrow", booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterSameOriginAndDestination_WFzz0() {
    Booking booking = new Booking();
    String result = booking.register();
    assertEquals("Origin and destination cannot be the same.", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterDifferentOriginAndDestination_VMOa1() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("origin");
    booking.setDestinationUnlocode("destination");
    String result = booking.register();
    assertEquals("/admin/dashboard.xhtml", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocode_ePoI0() {
    Booking booking = new Booking();
    String destinationUnlocode = "LON";
    booking.setDestinationUnlocode(destinationUnlocode);
    assertEquals(destinationUnlocode, booking.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_xRVo0() {
    Booking booking = new Booking();
    LocalDate expected = LocalDate.now();
    LocalDate actual = booking.getArrivalDeadline();
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOriginUnlocode_UflL0() {
    Booking booking = new Booking();
    String expected = "expectedOriginUnlocode";
    String actual = booking.getOriginUnlocode();
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToday_CaUD0() {
    Booking booking = new Booking();
    LocalDate today = booking.getToday();
    assertNull(LocalDate.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDeadlineUpdatedWhenDurationIsGreaterThanOrEqualToMinJourneyDuration_BcIJ0() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.now();
    LocalDate arrivalDeadline = today.plusDays(5);
    booking.deadlineUpdated();
    assert booking.isBookable();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDeadlineUpdatedWhenDurationIsLessThanMinJourneyDuration_hYAr1() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.now();
    LocalDate arrivalDeadline = today;
    booking.deadlineUpdated();
    assert !booking.isBookable();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsBookableFalse_CDWe1_DiSo1() {
    Booking booking = new Booking();
    booking.init();
    assertFalse(booking.isBookable());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDuration_dgsR0_bLCR0() {
    Booking booking = new Booking();
    long expectedDuration = 10;
    booking.init();
    assertEquals(expectedDuration, booking.getDuration());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationUnlocode_lwpK0_fid1() {
    Booking booking = new Booking();
    String expected = "expectedDestinationUnlocode";
    String actual = booking.getDestinationUnlocode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_xRVo0_fid1() {
    Booking booking = new Booking();
    LocalDate expected = LocalDate.now();
    LocalDate actual = booking.getArrivalDeadline();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOriginUnlocode_UflL0_fid1() {
    Booking booking = new Booking();
    String expected = "expectedOriginUnlocode";
    String actual = booking.getOriginUnlocode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToday_CaUD0_fid1() {
    Booking booking = new Booking();
    LocalDate today = booking.getToday();
    assertEquals(LocalDate.now(), today);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationName_KNIT0_fid1() {
    Booking booking = new Booking();
    String destinationName = booking.getDestinationName();
    assertEquals("Expected destination name", destinationName, "");
  }
}