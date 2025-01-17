/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.internal;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.CargoRepository;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_DefaultBookingService_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_WhenTrackingIdIsNull_ThrowsNullPointerException_zCUD2() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    try {
      defaultBookingService.requestPossibleRoutesForCargo(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRoute_CargoFound_bxFy0() {
    DefaultBookingService service = new DefaultBookingService();
    CargoRepository cargoRepository = mock(CargoRepository.class);
    Cargo cargo = mock(Cargo.class);
    TrackingId trackingId = new TrackingId("123");
    Itinerary itinerary = new Itinerary();
    when(cargoRepository.find(trackingId)).thenReturn(cargo);
    service.assignCargoToRoute(itinerary, trackingId);
    verify(cargo).assignToRoute(itinerary);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRoute_AssignToRouteFails_YXaV2() {
    DefaultBookingService service = new DefaultBookingService();
    CargoRepository cargoRepository = mock(CargoRepository.class);
    Cargo cargo = mock(Cargo.class);
    TrackingId trackingId = new TrackingId("123");
    Itinerary itinerary = new Itinerary();
    when(cargoRepository.find(trackingId)).thenReturn(cargo);
    doThrow(new RuntimeException()).when(cargo).assignToRoute(itinerary);
    try {
      service.assignCargoToRoute(itinerary, trackingId);
      fail("Expected RuntimeException");
    } catch (RuntimeException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRoute_StoreCargoFails_uNnk3() {
    DefaultBookingService service = new DefaultBookingService();
    CargoRepository cargoRepository = mock(CargoRepository.class);
    Cargo cargo = mock(Cargo.class);
    TrackingId trackingId = new TrackingId("123");
    Itinerary itinerary = new Itinerary();
    when(cargoRepository.find(trackingId)).thenReturn(cargo);
    doThrow(new RuntimeException()).when(cargoRepository).store(cargo);
    try {
      service.assignCargoToRoute(itinerary, trackingId);
      fail("Expected RuntimeException");
    } catch (RuntimeException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_nullArguments_vBui8() {
    DefaultBookingService service = new DefaultBookingService();
    try {
      service.bookNewCargo(null, null, null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  public void testRequestPossibleRoutesForCargo_NullTrackingId_yjWh6_GCvS0() {
    DefaultBookingService service = new DefaultBookingService();
    TrackingId trackingId = null;
    assertThrows(NullPointerException.class, () -> service.requestPossibleRoutesForCargo(trackingId));
  }
}