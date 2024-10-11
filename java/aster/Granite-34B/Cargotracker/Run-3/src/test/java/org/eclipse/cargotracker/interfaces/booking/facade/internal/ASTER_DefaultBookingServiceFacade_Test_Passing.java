/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingServiceFacade_Test_Passing {
  private DefaultBookingServiceFacade defaultBookingServiceFacade;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadCargoForTracking_WithNullTrackingId_ReturnsNull_lXar0() throws Exception {
    CargoStatus cargoStatus = defaultBookingServiceFacade.loadCargoForTracking(null);
    assertEquals(null, cargoStatus);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_PLwU0() throws Exception {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = bookingServiceFacade.bookNewCargo("AUH", "CNSHA", LocalDate.of(2022, 12, 31));
    assertEquals("ABC123", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargoWithInvalidOrigin_rDVV1() throws Exception {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = bookingServiceFacade.bookNewCargo("InvalidOrigin", "CNSHA", LocalDate.of(2022, 12, 31));
    assertEquals("InvalidOrigin", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargoWithInvalidDestination_UQMW2() throws Exception {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = bookingServiceFacade.bookNewCargo("AUH", "InvalidDestination", LocalDate.of(2022, 12, 31));
    assertEquals("InvalidDestination", trackingId);
  }
}