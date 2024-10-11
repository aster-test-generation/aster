/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.application.BookingService;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler.CargoRouteDtoAssembler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingServiceFacade_Coverage_Test_Failing {
  private BookingService bookingService;
  private CargoRouteDtoAssembler cargoRouteDtoAssembler;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination_JGzd0() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDestination("trackingId", "JGzd0");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ValidInputs_uyoD0() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    String origin = "ABC";
    String destination = "DEF";
    LocalDate arrivalDeadline = LocalDate.now();
    String trackingId = facade.bookNewCargo(origin, destination, arrivalDeadline);
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_EmptyTrackingId_UXtF0() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = facade.requestPossibleRoutesForCargo("");
    assertEquals(0, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_NullTrackingId_BOIJ1() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = facade.requestPossibleRoutesForCargo(null);
    assertEquals(0, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_ValidTrackingId_Awpb2() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = facade.requestPossibleRoutesForCargo("trackingId");
    assertEquals(1, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_MultipleRoutes_RsjQ3() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = facade.requestPossibleRoutesForCargo("trackingId");
    assertEquals(2, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_ItinerariesNull_lVWI4() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = facade.requestPossibleRoutesForCargo("trackingId");
    assertEquals(0, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination_JGzd0_fid1() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDestination("trackingId", "destinationUnLocode");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithInvalidTrackingId_bwGq1() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDestination("invalidTrackingId", "destinationUnLocode");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_InvalidOrigin_iYeK1_fid1() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    String origin = "INVALID";
    String destination = "DEF";
    LocalDate arrivalDeadline = LocalDate.now();
    try {
      facade.bookNewCargo(origin, destination, arrivalDeadline);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals("Invalid origin", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_InvalidDestination_cvMR2() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    String origin = "ABC";
    String destination = "INVALID";
    LocalDate arrivalDeadline = LocalDate.now();
    try {
      facade.bookNewCargo(origin, destination, arrivalDeadline);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals("Invalid destination", e.getMessage());
    }
  }
}