/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingServiceFacade_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_Gwpw0_1() throws Exception {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = "ABC123";
    List<RouteCandidate> result = bookingServiceFacade.requestPossibleRoutesForCargo(trackingId);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_Gwpw0_2() throws Exception {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = "ABC123";
    List<RouteCandidate> result = bookingServiceFacade.requestPossibleRoutesForCargo(trackingId);
    assertFalse(result.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_validParameters_FQPv0_1() throws Exception {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    LocalDate arrivalDeadline = LocalDate.of(2023, 12, 31);
    String result = bookingServiceFacade.bookNewCargo("USNYC", "JPTYO", arrivalDeadline);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_validParameters_FQPv0_2() throws Exception {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    LocalDate arrivalDeadline = LocalDate.of(2023, 12, 31);
    String result = bookingServiceFacade.bookNewCargo("USNYC", "JPTYO", arrivalDeadline);
    assertTrue(result.matches("[A-Z0-9]+"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllTrackingIds_UApW0_1() throws Exception {
    DefaultBookingServiceFacade serviceFacade = new DefaultBookingServiceFacade();
    List<String> result = serviceFacade.listAllTrackingIds();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllTrackingIds_UApW0_2() throws Exception {
    DefaultBookingServiceFacade serviceFacade = new DefaultBookingServiceFacade();
    List<String> result = serviceFacade.listAllTrackingIds();
    assertTrue(result.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadCargoForRouting_WkKD0() throws Exception {
    DefaultBookingServiceFacade serviceFacade = new DefaultBookingServiceFacade();
    String trackingId = "ABC123";
    CargoRoute result = serviceFacade.loadCargoForRouting(trackingId);
    assertNotNull(result, "CargoRoute should not be null");
  }
}