/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.application.BookingService;
import org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler.CargoRouteDtoAssembler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingServiceFacade_Coverage_Test_Passing {
  private BookingService bookingService;
  private CargoRouteDtoAssembler cargoRouteDtoAssembler;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_InvalidOrigin_iYeK1() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    String origin = "INVALID";
    String destination = "DEF";
    LocalDate arrivalDeadline = LocalDate.now();
    try {
      facade.bookNewCargo(origin, destination, arrivalDeadline);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals("INVALID is not a valid UN/LOCODE (does not match pattern)", e.getMessage());
    }
  }
}