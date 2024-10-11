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

public class Aster_ItinerarySelection_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_nnHn0() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("12345");
    assertEquals("12345", itinerarySelection.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRouteCanditates_UtlC0_fid1() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    assertNull(itinerarySelection.getRouteCanditates());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_VuOP0_fid1() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    String trackingId = itinerarySelection.getTrackingId();
    assertNull(trackingId);
  }
}