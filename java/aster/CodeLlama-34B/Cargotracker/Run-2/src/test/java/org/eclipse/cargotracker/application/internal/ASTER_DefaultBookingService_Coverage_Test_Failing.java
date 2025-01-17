/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.internal;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingService_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_NullTrackingId_CECy0() {
    DefaultBookingService service = new DefaultBookingService();
    List<Itinerary> itineraries = service.requestPossibleRoutesForCargo(null);
    assertEquals(Collections.emptyList(), itineraries);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_CargoNotFound_JpBN1() {
    DefaultBookingService service = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("12345");
    List<Itinerary> itineraries = service.requestPossibleRoutesForCargo(trackingId);
    assertEquals(Collections.emptyList(), itineraries);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo1_yYQA0() {
    DefaultBookingService bookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("USCHI");
    UnLocode destinationUnLocode = new UnLocode("JNTKO");
    LocalDate arrivalDeadline = LocalDate.now();
    TrackingId trackingId = bookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo2_MnJb1() {
    DefaultBookingService bookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("USCHI");
    UnLocode destinationUnLocode = new UnLocode("JNTKO");
    LocalDate arrivalDeadline = LocalDate.now();
    TrackingId trackingId = bookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
    assertEquals(trackingId.getIdString(), "USCHIJNTKO");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithNullTrackingIdAndUnLocode_QCcK3_QyRd0_1() {
    DefaultBookingService bookingService = new DefaultBookingService();
    TrackingId trackingId = null;
    UnLocode unLocode = null;
    bookingService.changeDestination(trackingId, unLocode);
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithNullTrackingIdAndUnLocode_QCcK3_QyRd0_2() {
    DefaultBookingService bookingService = new DefaultBookingService();
    TrackingId trackingId = null;
    UnLocode unLocode = null;
    bookingService.changeDestination(trackingId, unLocode);
    assertNull(unLocode);
  }
}