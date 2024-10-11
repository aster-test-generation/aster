/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ItinerarySelection_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignItineraryWithRouteIndex0_PgOP0() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    int routeIndex = 0;
    String result = itinerarySelection.assignItinerary(routeIndex);
    assertEquals("show.html?faces-redirect=true&trackingId= trackingId", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignItineraryWithRouteIndex1_kocv1() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    int routeIndex = 1;
    String result = itinerarySelection.assignItinerary(routeIndex);
    assertEquals("show.html?faces-redirect=true&trackingId= trackingId", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignItineraryWithRouteIndex2_Kphe2() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    int routeIndex = 2;
    String result = itinerarySelection.assignItinerary(routeIndex);
    assertEquals("show.html?faces-redirect=true&trackingId= trackingId", result);
  }
}