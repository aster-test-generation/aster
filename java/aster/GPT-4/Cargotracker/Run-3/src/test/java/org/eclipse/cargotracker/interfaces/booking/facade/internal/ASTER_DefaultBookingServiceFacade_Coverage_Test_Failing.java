/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.application.BookingService;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler.LocationDtoAssembler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Aster_DefaultBookingServiceFacade_Coverage_Test_Failing {
  private LocationDtoAssembler locationDtoAssembler;
  private DefaultBookingServiceFacade defaultBookingServiceFacade;
  private BookingService bookingService;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_CallsBookingService_jamy1() {
    String trackingId = "ABC123";
    List<Itinerary> itineraries = new ArrayList<>();
    when(bookingService.requestPossibleRoutesForCargo(new TrackingId(trackingId))).thenReturn(itineraries);
    defaultBookingServiceFacade.requestPossibleRoutesForCargo(trackingId);
    verify(bookingService).requestPossibleRoutesForCargo(new TrackingId(trackingId));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_ReturnsRouteCandidates_UTlV2() {
    String trackingId = "ABC123";
    List<Itinerary> itineraries = new ArrayList<>();
    when(bookingService.requestPossibleRoutesForCargo(new TrackingId(trackingId))).thenReturn(itineraries);
    List<RouteCandidate> result = defaultBookingServiceFacade.requestPossibleRoutesForCargo(trackingId);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_UsesStream_noJC3() {
    String trackingId = "ABC123";
    List<Itinerary> itineraries = new ArrayList<>();
    itineraries.add(new Itinerary());
    when(bookingService.requestPossibleRoutesForCargo(new TrackingId(trackingId))).thenReturn(itineraries);
    defaultBookingServiceFacade.requestPossibleRoutesForCargo(trackingId);
    assertTrue(itineraries.stream().count() >= 1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadlineWithValidData_PhSC0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = "ABC123";
    LocalDate arrivalDeadline = LocalDate.of(2023, 10, 15);
    bookingServiceFacade.changeDeadline(trackingId, arrivalDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadlineWithNullValues_DcSN1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = null;
    LocalDate arrivalDeadline = null;
    bookingServiceFacade.changeDeadline(trackingId, arrivalDeadline);
  }

  @Test
  public void testAssignCargoToRoute_NullRouteCandidate_IPRx2_Xwgx0_fid3() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    assertThrows(IllegalArgumentException.class, () -> facade.assignCargoToRoute("ABC123", null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadCargoForTracking_WithNullTrackingId_GGLU5_cHev0_fid3() {
    String trackingIdValue = null;
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    CargoRoute result = facade.loadCargoForRouting(trackingIdValue);
    assertNull(result);
  }
}