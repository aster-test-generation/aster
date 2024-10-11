/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingServiceFacade_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRoute_LTHc0() throws Exception {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    List<Leg> legs = new ArrayList<>();
    RouteCandidate routeCandidateDTO = new RouteCandidate(legs);
    String trackingIdStr = "12345";
    defaultBookingServiceFacade.assignCargoToRoute(trackingIdStr, routeCandidateDTO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadline_hxkb0() throws Exception {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    facade.changeDeadline(UUID.randomUUID().toString(), LocalDate.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargoNullOrigin_lAgx1() throws Exception {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    try {
      defaultBookingServiceFacade.bookNewCargo(null, "destination", LocalDate.of(2022, 1, 1));
      assert false;
    } catch (Exception e) {
      assertEquals("origin cannot be null", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargoNullDestination_CDnK2() throws Exception {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    try {
      defaultBookingServiceFacade.bookNewCargo("origin", null, LocalDate.of(2022, 1, 1));
      assert false;
    } catch (Exception e) {
      assertEquals("destination cannot be null", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargoNullArrivalDeadline_xmLX3() throws Exception {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    try {
      defaultBookingServiceFacade.bookNewCargo("origin", "destination", null);
      assert false;
    } catch (Exception e) {
      assertEquals("arrivalDeadline cannot be null", e.getMessage());
    }
  }
}