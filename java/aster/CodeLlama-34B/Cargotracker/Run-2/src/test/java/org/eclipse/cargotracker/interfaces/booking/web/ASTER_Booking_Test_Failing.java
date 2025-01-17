/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.time.LocalDate;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Booking_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocode_unRX0_1() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("USCHI");
    assertEquals("USCHI", booking.getOriginUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocode_unRX0_2() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("USCHI");
    assertEquals("Chicago", booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithInvalidUnlocode_cNPl1_1() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("INVALID");
    assertEquals("", booking.getOriginUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithInvalidUnlocode_cNPl1_2() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("INVALID");
    assertEquals("INVALID", booking.getOriginUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithNullUnlocode_xsFU2_1() {
    Booking booking = new Booking();
    booking.setOriginUnlocode(null);
    assertNotNull(booking.getOriginUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithNullUnlocode_xsFU2_2() {
    Booking booking = new Booking();
    booking.setOriginUnlocode(null);
    assertNull(booking.getOriginUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_yNNk0_1() {
    Booking booking = new Booking();
    LocalDate arrivalDeadline = booking.getArrivalDeadline();
    assertNotNull(arrivalDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_yNNk0_2() {
    Booking booking = new Booking();
    LocalDate arrivalDeadline = booking.getArrivalDeadline();
    assertNull(LocalDate.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationUnlocode_AlPP0() {
    Booking booking = new Booking();
    String destinationUnlocode = booking.getDestinationUnlocode();
    assertEquals("Expected destination unlocode", "DEST", destinationUnlocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationUnlocode_Empty_bGMa2_fid1() {
    Booking booking = new Booking();
    String destinationUnlocode = booking.getDestinationUnlocode();
    assertEquals("", destinationUnlocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetArrivalDeadlineWithInvalidDate_stNu2_fid1() {
    Booking booking = new Booking();
    LocalDate arrivalDeadline = LocalDate.of(2022, 12, 25);
    booking.setArrivalDeadline(arrivalDeadline);
    assertNotEquals(arrivalDeadline, booking.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDuration_eYNi0() {
    Booking booking = new Booking();
    long duration = booking.getDuration();
    assertEquals(0, duration);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetReturnValueWithNullBooking_SiEs1_fid1() {
    Booking booking = null;
    String returnValue = booking.getReturnValue();
    assertNull(returnValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithInvalidUnlocode_cNPl1_2_fid1() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("INVALID");
    assertNull(booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithNullUnlocode_xsFU2_2_fid1() {
    Booking booking = new Booking();
    booking.setOriginUnlocode(null);
    assertNull(booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_yNNk0_2_fid1() {
    Booking booking = new Booking();
    LocalDate arrivalDeadline = booking.getArrivalDeadline();
    assertEquals(LocalDate.now(), arrivalDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOriginUnlocode_GQmk0() {
    Booking booking = new Booking();
    String originUnlocode = booking.getOriginUnlocode();
    assertEquals("", originUnlocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOriginUnlocodeWithNonEmptyString_Fryw1() {
    Booking booking = new Booking();
    String originUnlocode = booking.getOriginUnlocode();
    assertEquals("ABC", originUnlocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToday_LWVF0_1() {
    Booking booking = new Booking();
    LocalDate today = booking.getToday();
    assertNotNull(today);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToday_LWVF0_2() {
    Booking booking = new Booking();
    LocalDate today = booking.getToday();
    assertEquals(LocalDate.now(), today);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationName_pqFD0() {
    Booking booking = new Booking();
    String destinationName = booking.getDestinationName();
    assertEquals("New York", destinationName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithEmptyList_AyZV1_1() {
    Booking booking = new Booking();
    booking.init();
    assertEquals(LocalDate.now(), booking.getToday());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithEmptyList_AyZV1_2() {
    Booking booking = new Booking();
    booking.init();
    assertEquals(Collections.emptyList(), booking.getLocations());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocode_KKiV0_QKef1() {
    Booking booking = new Booking();
    booking.setDestinationUnlocode("DEHAM");
    assertEquals("Hamburg", booking.getDestinationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeWithInvalidUnlocode_gbnV1_STYA2() {
    Booking booking = new Booking();
    booking.setDestinationUnlocode("INVALID");
    assertEquals(null, booking.getDestinationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeWithNullUnlocode_xEzL2_SSNA3() {
    Booking booking = new Booking();
    booking.setDestinationUnlocode(null);
    assertEquals(null, booking.getDestinationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeWithEmptyUnlocode_tfLg3_SLTL4() {
    Booking booking = new Booking();
    booking.setDestinationUnlocode("");
    assertEquals(null, booking.getDestinationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDurationWithPositiveDuration_fxXz1_JDvs0() {
    Booking booking = new Booking();
    booking.init();
    long duration = booking.getDuration();
    assertEquals(1000, duration);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_KDxp0_fQEy0() {
    Booking booking = new Booking();
    booking.init();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocode_unRX0() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("USCHI");
    assertEquals("USCHI", booking.getOriginUnlocode());
    assertEquals("Chicago", booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithInvalidUnlocode_cNPl1() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("INVALID");
    assertEquals("INVALID", booking.getOriginUnlocode());
    assertNull(booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocodeWithNullUnlocode_xsFU2() {
    Booking booking = new Booking();
    booking.setOriginUnlocode(null);
    assertNull(booking.getOriginUnlocode());
    assertNull(booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_yNNk0() {
    Booking booking = new Booking();
    LocalDate arrivalDeadline = booking.getArrivalDeadline();
    assertNotNull(arrivalDeadline);
    assertEquals(LocalDate.now(), arrivalDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToday_LWVF0() {
    Booking booking = new Booking();
    LocalDate today = booking.getToday();
    assertNotNull(today);
    assertEquals(LocalDate.now(), today);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithEmptyList_AyZV1() {
    Booking booking = new Booking();
    booking.init();
    assertEquals(LocalDate.now(), booking.getToday());
    assertEquals(Collections.emptyList(), booking.getLocations());
  }
}