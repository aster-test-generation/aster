/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.internal;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingService_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadline_auTI0() {
    DefaultBookingService bookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("ABC");
    LocalDate newDeadline = LocalDate.now();
    bookingService.changeDeadline(trackingId, newDeadline);
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadlineWithNullNewDeadline_kXak2() {
    DefaultBookingService bookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("ABC");
    LocalDate newDeadline = null;
    bookingService.changeDeadline(trackingId, newDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadlineWithInvalidNewDeadline_DKyp4() {
    DefaultBookingService bookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("ABC");
    LocalDate newDeadline = LocalDate.of(2022, 13, 32);
    bookingService.changeDeadline(trackingId, newDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_eRjF0() {
    DefaultBookingService bookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("id");
    UnLocode unLocode = new UnLocode("countryAndLocation");
    bookingService.changeDestination(trackingId, unLocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test4_GzfE3() {
    DefaultBookingService bookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("id");
    UnLocode unLocode = new UnLocode("USCHI");
    bookingService.changeDestination(trackingId, unLocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadline_auTI0_fid2() {
    DefaultBookingService bookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("ABC");
    LocalDate newDeadline = LocalDate.now();
    bookingService.changeDeadline(trackingId, newDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadlineWithNullTrackingId_DybF1() {
    DefaultBookingService bookingService = new DefaultBookingService();
    TrackingId trackingId = null;
    LocalDate newDeadline = LocalDate.now();
    bookingService.changeDeadline(trackingId, newDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadlineWithInvalidTrackingId_vVSG3() {
    DefaultBookingService bookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("Invalid");
    LocalDate newDeadline = LocalDate.now();
    bookingService.changeDeadline(trackingId, newDeadline);
  }
}