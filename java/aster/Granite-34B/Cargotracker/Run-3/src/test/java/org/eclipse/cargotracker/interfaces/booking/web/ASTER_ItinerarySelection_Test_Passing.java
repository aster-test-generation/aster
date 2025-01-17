/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ItinerarySelection_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoad_MCHw0() throws Exception {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.load();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_IThU0() throws Exception {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    CargoRoute cargo = itinerarySelection.getCargo();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignItinerary_ValidRouteIndex_TmGk0() throws Exception {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    int routeIndex = 0;
    String expected = "show.html?faces-redirect=true&trackingId=";
    String actual = itinerarySelection.assignItinerary(routeIndex);
    assertEquals(expected, actual.substring(0, expected.length()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignItinerary_InvalidRouteIndex_zEZc1() throws Exception {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    int routeIndex = -1;
    String expected = "show.html?faces-redirect=true&trackingId=";
    String actual = itinerarySelection.assignItinerary(routeIndex);
    assertEquals(expected, actual.substring(0, expected.length()));
  }
}