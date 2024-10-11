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
  public void testgetDestinationUnlocode_PlJq0() {
    Booking booking = new Booking();
    String destinationUnlocode = booking.getDestinationUnlocode();
    assertNotNull(destinationUnlocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegister_JkGt0() {
    Booking booking = new Booking();
    String result = booking.register();
    assertEquals("/admin/dashboard.xhtml", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterWithSameOriginAndDestination_AAhD1() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("ABC");
    booking.setDestinationUnlocode("ABC");
    String result = booking.register();
    assertEquals(null, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_hqhe0() {
    Booking booking = new Booking();
    LocalDate arrivalDeadline = booking.getArrivalDeadline();
    assertNotNull(arrivalDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetToday_SMOj0() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.now();
    assertNull(today);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocode_vumD0_VSlM0() {
    Booking booking = new Booking();
    String originUnlocode = "USNY";
    booking.setOriginUnlocode(originUnlocode);
    assertEquals("New York", booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetToday_SMOj0_fid1() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.now();
    assertEquals(today, booking.getToday());
  }
}