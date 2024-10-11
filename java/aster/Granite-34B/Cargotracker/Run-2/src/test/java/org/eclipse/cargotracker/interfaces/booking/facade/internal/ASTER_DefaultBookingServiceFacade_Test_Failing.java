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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingServiceFacade_Test_Failing {
  private DefaultBookingServiceFacade defaultBookingServiceFacade;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRoute3_RBEZ2() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingIdStr = "trackingIdStr";
    RouteCandidate routeCandidateDTO = new RouteCandidate(new ArrayList<>());
    defaultBookingServiceFacade.assignCargoToRoute(trackingIdStr, routeCandidateDTO);
    // Add assertion here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRoute11_MReV10() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingIdStr = "trackingIdStr";
    RouteCandidate routeCandidateDTO = new RouteCandidate(new ArrayList<>());
    defaultBookingServiceFacade.assignCargoToRoute(trackingIdStr, routeCandidateDTO);
    // Add the assertion here
    // Example: assertEquals(expectedValue, actualValue);
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_vNTL0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String origin = "AUH";
    String destination = "CNSHA";
    LocalDate arrivalDeadline = LocalDate.of(2022, 1, 1);
    String result = bookingServiceFacade.bookNewCargo(origin, destination, arrivalDeadline);
    assertEquals("ABC123", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRoute_EDxv0_fid2() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingIdStr = "trackingIdStr";
    RouteCandidate routeCandidateDTO = new RouteCandidate(new ArrayList<>());
    defaultBookingServiceFacade.assignCargoToRoute(trackingIdStr, routeCandidateDTO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllTrackingIds_JTKI0() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    List<String> trackingIds = defaultBookingServiceFacade.listAllTrackingIds();
    assertEquals(0, trackingIds.size());
  }
}