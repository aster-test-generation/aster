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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingServiceFacade_Test_Passing {
  public void testAssignCargoToRoute_NullTrackingId_Silt0() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    RouteCandidate routeCandidate = new RouteCandidate(new ArrayList<>());
    facade.assignCargoToRoute(null, routeCandidate);
  }

  public void testAssignCargoToRoute_NullRouteCandidate_wOYp1() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.assignCargoToRoute("trackingId", null);
  }

  public void testAssignCargoToRoute_EmptyRouteCandidate_MLhQ2() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    RouteCandidate routeCandidate = new RouteCandidate(new ArrayList<>());
    facade.assignCargoToRoute("trackingId", routeCandidate);
  }

  public void testAssignCargoToRoute_ValidTrackingIdAndRouteCandidate_HHgE3() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    RouteCandidate routeCandidate = new RouteCandidate(new ArrayList<>());
    facade.assignCargoToRoute("trackingId", routeCandidate);
  }

  public void testAssignCargoToRoute_ValidTrackingIdAndRouteCandidate_DifferentTrackingId_RaBC4() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    RouteCandidate routeCandidate = new RouteCandidate(new ArrayList<>());
    facade.assignCargoToRoute("trackingId", routeCandidate);
  }

  public void testAssignCargoToRoute_ValidTrackingIdAndRouteCandidate_DifferentRouteCandidate_AYqr5() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    RouteCandidate routeCandidate = new RouteCandidate(new ArrayList<>());
    facade.assignCargoToRoute("trackingId", routeCandidate);
  }

  public void testAssignCargoToRoute_ValidTrackingIdAndRouteCandidate_DifferentItinerary_tbRP6() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    RouteCandidate routeCandidate = new RouteCandidate(new ArrayList<>());
    facade.assignCargoToRoute("trackingId", routeCandidate);
  }

  public void testAssignCargoToRoute_ValidTrackingIdAndRouteCandidate_DifferentVoyage_YnZN7() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    RouteCandidate routeCandidate = new RouteCandidate(new ArrayList<>());
    facade.assignCargoToRoute("trackingId", routeCandidate);
  }

  public void testAssignCargoToRoute_ValidTrackingIdAndRouteCandidate_DifferentLocation_KiPY8() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
  }

  public void testChangeDeadlineWithValidTrackingIdAndArrivalDeadline_YOor0() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDeadline("1234567890", LocalDate.of(2022, 12, 31));
  }

  public void testChangeDeadlineWithInvalidTrackingIdAndValidArrivalDeadline_VQXw1() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDeadline("1234567890", LocalDate.of(2022, 12, 31));
  }

  public void testChangeDeadlineWithValidTrackingIdAndInvalidArrivalDeadline_pAAm2() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDeadline("1234567890", LocalDate.of(2022, 12, 31));
  }

  public void testChangeDeadlineWithInvalidTrackingIdAndInvalidArrivalDeadline_SAFd3() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDeadline("1234567890", LocalDate.of(2022, 12, 31));
  }

  public void testChangeDeadlineWithNullTrackingIdAndValidArrivalDeadline_wUZg4() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDeadline(null, LocalDate.of(2022, 12, 31));
  }

  public void testChangeDeadlineWithValidTrackingIdAndNullArrivalDeadline_PYsu5() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDeadline("1234567890", null);
  }

  public void testChangeDeadlineWithNullTrackingIdAndNullArrivalDeadline_bvXK6() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDeadline(null, null);
  }

  public void testChangeDeadlineWithValidTrackingIdAndPastArrivalDeadline_Vgny7() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDeadline("1234567890", LocalDate.of(2022, 12, 31));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ValidInputs_Agvy0_1() throws Exception {
    DefaultBookingServiceFacade bookingService = new DefaultBookingServiceFacade();
    String origin = "USCHI";
    String destination = "USLAX";
    LocalDate arrivalDeadline = LocalDate.of(2023, 1, 1);
    String trackingId = bookingService.bookNewCargo(origin, destination, arrivalDeadline);
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ValidInputs_Agvy0_2() throws Exception {
    DefaultBookingServiceFacade bookingService = new DefaultBookingServiceFacade();
    String origin = "USCHI";
    String destination = "USLAX";
    LocalDate arrivalDeadline = LocalDate.of(2023, 1, 1);
    String trackingId = bookingService.bookNewCargo(origin, destination, arrivalDeadline);
    assertEquals("USCHI-USLAX-2023-01-01", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_InvalidOrigin_Jfmd1() throws Exception {
    DefaultBookingServiceFacade bookingService = new DefaultBookingServiceFacade();
    String origin = "USCHI";
    String destination = "USLAX";
    LocalDate arrivalDeadline = LocalDate.of(2023, 1, 1);
    String trackingId = bookingService.bookNewCargo(origin, destination, arrivalDeadline);
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ValidInputs_DifferentOrigin_LGTA4_1() throws Exception {
    DefaultBookingServiceFacade bookingService = new DefaultBookingServiceFacade();
    String origin = "USLAX";
    String destination = "USCHI";
    LocalDate arrivalDeadline = LocalDate.of(2023, 1, 1);
    String trackingId = bookingService.bookNewCargo(origin, destination, arrivalDeadline);
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ValidInputs_DifferentOrigin_LGTA4_2() throws Exception {
    DefaultBookingServiceFacade bookingService = new DefaultBookingServiceFacade();
    String origin = "USLAX";
    String destination = "USCHI";
    LocalDate arrivalDeadline = LocalDate.of(2023, 1, 1);
    String trackingId = bookingService.bookNewCargo(origin, destination, arrivalDeadline);
    assertEquals("USLAX-USCHI-2023-01-01", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ValidInputs_DifferentArrivalDeadline_uoTJ6_1() throws Exception {
    DefaultBookingServiceFacade bookingService = new DefaultBookingServiceFacade();
    String origin = "USCHI";
    String destination = "USLAX";
    LocalDate arrivalDeadline = LocalDate.of(2023, 1, 2);
    String trackingId = bookingService.bookNewCargo(origin, destination, arrivalDeadline);
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ValidInputs_DifferentArrivalDeadline_uoTJ6_2() throws Exception {
    DefaultBookingServiceFacade bookingService = new DefaultBookingServiceFacade();
    String origin = "USCHI";
    String destination = "USLAX";
    LocalDate arrivalDeadline = LocalDate.of(2023, 1, 2);
    String trackingId = bookingService.bookNewCargo(origin, destination, arrivalDeadline);
    assertEquals("USCHI-USLAX-2023-01-02", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllTrackingIds_FJYm0_1() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    List<String> trackingIds = facade.listAllTrackingIds();
    for (int i = 0; i < trackingIds.size(); i++) {
    }
    assertEquals(10, trackingIds.size());
  }
}