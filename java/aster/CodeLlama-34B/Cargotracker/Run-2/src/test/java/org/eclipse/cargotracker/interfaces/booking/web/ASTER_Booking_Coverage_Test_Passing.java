/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import jakarta.faces.context.FacesContext;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.BookingServiceFacade;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.primefaces.PrimeFaces;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_Booking_Coverage_Test_Passing {
  private BookingServiceFacade bookingServiceFacade;
  private FacesContext context;
  private PrimeFaces primeFaces;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_rMIu1() {
    context = mock(FacesContext.class);
    bookingServiceFacade = mock(BookingServiceFacade.class);
  }
}