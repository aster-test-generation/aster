/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.internal;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.eclipse.cargotracker.domain.model.cargo.CargoRepository;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.LocationRepository;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_DefaultBookingService_Coverage_Test_Failing {
  private DefaultBookingService bookingService;
  private CargoRepository cargoRepository;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_CargoNotFound_pkAn1() {
    TrackingId trackingId = new TrackingId("ABC123");
    when(cargoRepository.find(trackingId)).thenReturn(null);
    List<Itinerary> result = bookingService.requestPossibleRoutesForCargo(trackingId);
    assertTrue(result.isEmpty());
    verify(cargoRepository).find(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_CreatesCargo_JXNy4_oShV0_2() {
    CargoRepository cargoRepository = mock(CargoRepository.class);
    LocationRepository locationRepository = mock(LocationRepository.class);
    Logger logger = mock(Logger.class);
    DefaultBookingService service = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("USCHI");
    UnLocode destinationUnLocode = new UnLocode("JPTYO");
    LocalDate arrivalDeadline = LocalDate.now().plusMonths(1);
    TrackingId trackingId = new TrackingId("ABC123");
    Location origin = new Location(originUnLocode, "Chicago");
    Location destination = new Location(destinationUnLocode, "Tokyo");
    when(cargoRepository.nextTrackingId()).thenReturn(trackingId);
    when(locationRepository.find(originUnLocode)).thenReturn(origin);
    when(locationRepository.find(destinationUnLocode)).thenReturn(destination);
    TrackingId result = service.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
    assertEquals("ABC123", result.getIdString());
  }
}