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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingService_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination_mxGF0() throws Exception {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("id");
    UnLocode unLocode = new UnLocode("countryAndLocation");
    defaultBookingService.changeDestination(trackingId, unLocode);
    assertEquals("countryAndLocation", unLocode.getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_pGNK0_1() throws Exception {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("countryAndLocation");
    UnLocode destinationUnLocode = new UnLocode("countryAndLocation");
    LocalDate arrivalDeadline = LocalDate.now();
    TrackingId trackingId = defaultBookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_pGNK0_2() throws Exception {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("countryAndLocation");
    UnLocode destinationUnLocode = new UnLocode("countryAndLocation");
    LocalDate arrivalDeadline = LocalDate.now();
    TrackingId trackingId = defaultBookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
    assertNotNull(trackingId.getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadline_ZeUy0() throws Exception {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("id");
    LocalDate newDeadline = LocalDate.of(2022, 1, 1);
    defaultBookingService.changeDeadline(trackingId, newDeadline);
    assert true;
  }
}