/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ItinerarySelection_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRouteCanditates_uGea0() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    List<RouteCandidate> routeCandidates = itinerarySelection.getRouteCanditates();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRouteCandidates_Uhcw0() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    List<RouteCandidate> routeCandidates = itinerarySelection.getRouteCandidates();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_ZoBz0() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    String trackingId = "123456";
    itinerarySelection.setTrackingId(trackingId);
    assertEquals(trackingId, itinerarySelection.getTrackingId());
  }
}