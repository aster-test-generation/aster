/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.internal;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.service.RoutingService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingService_Test_Failing {
  private RoutingService routingService;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadline_oTrw0() {
    TrackingId trackingId = new TrackingId("ABC");
    LocalDate newDeadline = LocalDate.now();
    DefaultBookingService bookingService = new DefaultBookingService();
    bookingService.changeDeadline(trackingId, newDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadlineWithNullTrackingId_kyXE1() {
    TrackingId trackingId = null;
    LocalDate newDeadline = LocalDate.now();
    DefaultBookingService bookingService = new DefaultBookingService();
    bookingService.changeDeadline(trackingId, newDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadlineWithNullNewDeadline_cqgD2() {
    TrackingId trackingId = new TrackingId("ABC");
    LocalDate newDeadline = null;
    DefaultBookingService bookingService = new DefaultBookingService();
    bookingService.changeDeadline(trackingId, newDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ZEBL0() {
    DefaultBookingService bookingService = new DefaultBookingService();
    UnLocode origin = new UnLocode("USCHI");
    UnLocode destination = new UnLocode("SESTO");
    LocalDate arrival = LocalDate.of(2022, 1, 1);
    TrackingId trackingId = bookingService.bookNewCargo(origin, destination, arrival);
    assertEquals("USCHI->SESTO", trackingId.getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadline_oTrw0_fid1() {
    TrackingId trackingId = new TrackingId("ABC");
    LocalDate newDeadline = LocalDate.now();
    DefaultBookingService bookingService = new DefaultBookingService();
    bookingService.changeDeadline(trackingId, newDeadline);
    // Add assertion here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadlineWithNullNewDeadline_cqgD2_fid1() {
    TrackingId trackingId = new TrackingId("ABC");
    LocalDate newDeadline = null;
    DefaultBookingService bookingService = new DefaultBookingService();
    bookingService.changeDeadline(trackingId, newDeadline);
    // Add assertions here
}
}