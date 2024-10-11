/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import jakarta.faces.application.FacesMessage;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.primefaces.PrimeFaces;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Booking_Coverage_Test_Failing {
  private FacesMessage message(String summary) {
    FacesMessage message = new FacesMessage(summary);
    message.setSeverity(FacesMessage.SEVERITY_ERROR);
    return message;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocode_Stream_ssjZ0() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("testUnlocode");
    assertEquals("testUnlocode", booking.getOriginUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocode_All_VNTN5_2() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("testUnlocode");
    assertEquals("testUnlocode", booking.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocode_Stream_eJus0_JWVI0() {
    Booking booking = new Booking();
    booking.setDestinationUnlocode("testUnlocode");
    assertNotNull(booking.getDestinationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocode_ExceptionHandling_FGNq5_ScNu0() {
    Booking booking = new Booking();
    booking.setDestinationUnlocode(null);
    assertEquals("", booking.getDestinationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocode_Filter_yKZU1_MIaY0() {
    Booking booking = new Booking();
    booking.setDestinationUnlocode("testUnlocode");
    assertEquals("testName", booking.getDestinationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDeadlineUpdatedDurationGreaterThanMinJourneyDuration_XIvV6_TYUD0() {
    Booking booking = new Booking();
    LocalDate today = LocalDate.now();
    LocalDate arrivalDeadline = today.plusDays(2);
    booking.deadlineUpdated();
    PrimeFaces.current().ajax().update("dateForm:durationPanel");
    PrimeFaces.current().ajax().update("dateForm:bookBtn");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOriginUnlocode_All_VNTN5() {
    Booking booking = new Booking();
    booking.setOriginUnlocode("testUnlocode");
    assertEquals("testUnlocode", booking.getOriginUnlocode());
    assertEquals("testUnlocode", booking.getOriginName());
  }
}