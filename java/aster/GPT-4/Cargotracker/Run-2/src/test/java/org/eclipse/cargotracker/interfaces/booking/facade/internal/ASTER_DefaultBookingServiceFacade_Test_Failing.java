/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingServiceFacade_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadCargoForTrackingWithInvalidId_SvlN1() {
    DefaultBookingServiceFacade serviceFacade = new DefaultBookingServiceFacade();
    String invalidTrackingId = "INVALID123";
    CargoRoute result = serviceFacade.loadCargoForRouting(invalidTrackingId);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadCargoForTrackingWithInvalidId_SvlN1_fid1() {
    DefaultBookingServiceFacade serviceFacade = new DefaultBookingServiceFacade();
    String invalidTrackingId = "INVALID123";
    CargoStatus result = serviceFacade.loadCargoForTracking(invalidTrackingId);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_TUrx0_fid1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = "ABC123";
    List<RouteCandidate> expectedRouteCandidates = new ArrayList<>();
    List<RouteCandidate> actualRouteCandidates = bookingServiceFacade.requestPossibleRoutesForCargo(trackingId);
    assertEquals(expectedRouteCandidates, actualRouteCandidates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ValidInputs_Success_neTC0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String origin = "USNYC";
    String destination = "JPTYO";
    LocalDate arrivalDeadline = LocalDate.of(2023, 12, 31);
    String trackingId = bookingServiceFacade.bookNewCargo(origin, destination, arrivalDeadline);
    assertNotNull(trackingId);
    assertFalse(trackingId.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ValidInputs_Success_neTC0_1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String origin = "USNYC";
    String destination = "JPTYO";
    LocalDate arrivalDeadline = LocalDate.of(2023, 12, 31);
    String trackingId = bookingServiceFacade.bookNewCargo(origin, destination, arrivalDeadline);
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ValidInputs_Success_neTC0_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String origin = "USNYC";
    String destination = "JPTYO";
    LocalDate arrivalDeadline = LocalDate.of(2023, 12, 31);
    String trackingId = bookingServiceFacade.bookNewCargo(origin, destination, arrivalDeadline);
    assertFalse(trackingId.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination_imHD0_auQu0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = "ABC123";
    String destinationUnLocode = "USNYC";
    bookingServiceFacade.changeDestination(trackingId, destinationUnLocode);
    CargoRoute cargoRoute = bookingServiceFacade.loadCargoForRouting(trackingId);
    assertEquals("USNYC", cargoRoute.getFinalDestinationCode());
  }
}