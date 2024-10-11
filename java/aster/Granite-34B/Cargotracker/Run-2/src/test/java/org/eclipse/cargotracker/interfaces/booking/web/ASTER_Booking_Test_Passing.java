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
  public void getDestinationUnlocode_returnsNullWhenDestinationUnlocodeNotSet_vlHb1() {
    Booking booking = new Booking();
    String destinationUnlocode = booking.getDestinationUnlocode();
    assertNull(destinationUnlocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetArrivalDeadline_heap0() {
    Booking booking = new Booking();
    LocalDate arrivalDeadline = LocalDate.now();
    booking.setArrivalDeadline(arrivalDeadline);
    assertEquals(arrivalDeadline, booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getDurationTest_jvZq0() {
    Booking booking = new Booking();
    long expectedDuration = booking.getDuration();
    assertEquals(expectedDuration, booking.getDuration());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getReturnValueTest_yiFe0() {
    Booking booking = new Booking();
    String actual = booking.getReturnValue();
    String expected = "/admin/dashboard.xhtml";
    assertEquals(expected, actual);
  }
}