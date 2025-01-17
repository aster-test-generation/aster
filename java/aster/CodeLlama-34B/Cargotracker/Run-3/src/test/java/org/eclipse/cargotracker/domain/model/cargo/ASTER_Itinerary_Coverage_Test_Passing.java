/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Itinerary_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsExpected_EmptyLegs_VzVb0() {
    Itinerary itinerary = new Itinerary();
    HandlingEvent event = new HandlingEvent();
    assertTrue(itinerary.isExpected(event));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFinalArrivalDate_lastLegNull_exkU0() {
    Itinerary itinerary = new Itinerary();
    LocalDateTime finalArrivalDate = itinerary.getFinalArrivalDate();
    assertEquals(LocalDateTime.MAX, finalArrivalDate);
  }
}