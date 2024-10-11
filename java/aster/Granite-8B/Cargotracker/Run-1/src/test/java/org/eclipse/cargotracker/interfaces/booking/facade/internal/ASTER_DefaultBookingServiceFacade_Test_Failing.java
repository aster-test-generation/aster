/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingServiceFacade_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRoute_kZFP0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    RouteCandidate routeCandidateDTO = new RouteCandidate(new ArrayList<>());
    bookingServiceFacade.assignCargoToRoute("123", routeCandidateDTO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination_DTDr0() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    String trackingId = "TRK123";
    String destinationUnLocode = "NLRTM";
    facade.changeDestination(trackingId, destinationUnLocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_aqQR0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = bookingServiceFacade.bookNewCargo("USCHI", "CNSHA", LocalDate.now().plusDays(14));
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllTrackingIds_ECxC0() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    List<String> expectedTrackingIds = new ArrayList<>();
    expectedTrackingIds.add("cargo1");
    expectedTrackingIds.add("cargo2");
    List<String> actualTrackingIds = facade.listAllTrackingIds();
    assertEquals(expectedTrackingIds, actualTrackingIds);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadline_gchB0() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDeadline("12345", LocalDate.now().plusDays(1));
    // Add assertion here
    // e.g. assertEquals(expectedValue, actualValue);
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListShippingLocations_fllG0() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Location> actual = facade.listShippingLocations();
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Location> expected = new ArrayList<>();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadline_gchB0_fid2() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDeadline("12345", LocalDate.now().plusDays(1));
  }
}