/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ItinerarySelection_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignItinerary_keEb0() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    String result = itinerarySelection.assignItinerary(0);
    assertEquals("show.html?faces-redirect=true&trackingId=12345", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignItineraryWithInvalidRouteIndex_RaEx1() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    String result = itinerarySelection.assignItinerary(-1);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignItineraryWithNullRouteCandidates_qmHN2() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    String result = itinerarySelection.assignItinerary(0);
    assertNull(result);
  }
}