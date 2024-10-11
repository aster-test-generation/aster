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
  public void testRegister_yNri0() {
    Booking booking = new Booking();
    String result = booking.register();
    assertEquals("/admin/dashboard.xhtml", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocode_eEXR0_1() {
    Booking booking = new Booking();
    String destinationUnlocode = "USCHI";
    booking.setDestinationUnlocode(destinationUnlocode);
    assertEquals(destinationUnlocode, booking.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocode_eEXR0_2() {
    Booking booking = new Booking();
    String destinationUnlocode = "USCHI";
    booking.setDestinationUnlocode(destinationUnlocode);
    assertEquals("Chicago, IL", booking.getDestinationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToday_OYSX0() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.now();
    assertNull(today);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDeadlineUpdated_rTpU0() {
    Booking booking = new Booking();
    booking.deadlineUpdated();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_uirH0() {
    Booking booking = new Booking();
    booking.init();
    // Add assertion here
    // For example:
    // assertEquals(expectedValue, booking.getSomeValue());
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToday_OYSX0_fid1() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.now();
    assertEquals(today, booking.getToday());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetDestinationName_Ucju0() {
    Booking booking = new Booking();
    String destinationName = booking.getDestinationName();
    assertEquals("Expected destination name", "destinationName", destinationName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_uirH0_fid1() {
    Booking booking = new Booking();
    booking.init();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocode_eEXR0() {
    Booking booking = new Booking();
    String destinationUnlocode = "USCHI";
    booking.setDestinationUnlocode(destinationUnlocode);
    assertEquals(destinationUnlocode, booking.getDestinationUnlocode());
    assertEquals("Chicago, IL", booking.getDestinationName());
  }
}