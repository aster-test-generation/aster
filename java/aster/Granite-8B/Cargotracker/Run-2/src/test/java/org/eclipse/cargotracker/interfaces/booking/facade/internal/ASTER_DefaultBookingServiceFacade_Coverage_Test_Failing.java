/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.application.BookingService;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingServiceFacade_Coverage_Test_Failing {
  private BookingService bookingService;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListShippingLocations_aPjZ0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Location> actual = bookingServiceFacade.listShippingLocations();
    Assertions.assertNotNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListShippingLocations2_lJPK1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<org.eclipse.cargotracker.interfaces.booking.facade.dto.Location> actual = bookingServiceFacade.listShippingLocations();
    Assertions.assertEquals(1, actual.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination1_jlkP0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    bookingServiceFacade.changeDestination("TRKID1", "UNLOCODE1");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination2_EiTT1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    bookingServiceFacade.changeDestination("TRKID2", "UNLOCODE2");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadlineWithValidTrackingIdAndDeadline_PaSh0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    bookingServiceFacade.changeDeadline("validTrackingId", LocalDate.now().plusDays(1));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadlineWithInvalidTrackingId_jCMj1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    bookingServiceFacade.changeDeadline("invalidTrackingId", LocalDate.now().plusDays(1));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_QvOe0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String origin = "USCHI";
    String destination = "CNSHA";
    LocalDate arrivalDeadline = LocalDate.now().plusDays(14);
    String trackingId = bookingServiceFacade.bookNewCargo(origin, destination, arrivalDeadline);
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo2_bWqb1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String origin = "USCHI";
    String destination = "CNSHA";
    LocalDate arrivalDeadline = LocalDate.now().plusDays(14);
    String trackingId = bookingServiceFacade.bookNewCargo(origin, destination, arrivalDeadline);
    assertEquals("USCHI-CNSHA-2019-03-19", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRoute_GPtF0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    RouteCandidate routeCandidateDTO = new RouteCandidate(new ArrayList<>());
    bookingServiceFacade.assignCargoToRoute("123", routeCandidateDTO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRoute2_vxOR1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    RouteCandidate routeCandidateDTO = new RouteCandidate(new ArrayList<>());
    bookingServiceFacade.assignCargoToRoute("456", routeCandidateDTO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRoute3_jmpO2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    RouteCandidate routeCandidateDTO = new RouteCandidate(new ArrayList<>());
    bookingServiceFacade.assignCargoToRoute("789", routeCandidateDTO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRoute4_sWGe3() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    RouteCandidate routeCandidateDTO = new RouteCandidate(new ArrayList<>());
    bookingServiceFacade.assignCargoToRoute("012", routeCandidateDTO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllCargos_iBrS0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<CargoRoute> routes = bookingServiceFacade.listAllCargos();
    assertNotNull(routes);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllTrackingIds1_rRkV0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<String> expectedTrackingIds = new ArrayList<>();
    expectedTrackingIds.add("123");
    expectedTrackingIds.add("456");
    List<String> actualTrackingIds = bookingServiceFacade.listAllTrackingIds();
    assertEquals(expectedTrackingIds, actualTrackingIds);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllTrackingIds2_shGR1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<String> expectedTrackingIds = new ArrayList<>();
    expectedTrackingIds.add("789");
    expectedTrackingIds.add("012");
    List<String> actualTrackingIds = bookingServiceFacade.listAllTrackingIds();
    assertEquals(expectedTrackingIds, actualTrackingIds);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllTrackingIds3_KhHD2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<String> expectedTrackingIds = new ArrayList<>();
    expectedTrackingIds.add("345");
    expectedTrackingIds.add("678");
    List<String> actualTrackingIds = bookingServiceFacade.listAllTrackingIds();
    assertEquals(expectedTrackingIds, actualTrackingIds);
  }

  @Test
  public void testLoadCargoForRouting_iKdJ0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    CargoRoute cargoRoute = bookingServiceFacade.loadCargoForRouting("1234567890");
    assertNotNull(cargoRoute);
  }
}