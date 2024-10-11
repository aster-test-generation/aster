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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Itinerary_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_lzAU0() {
    Itinerary itinerary = new Itinerary();
    itinerary.toString();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFinalArrivalDate_whenLastLegIsNullOrEmpty_thenReturnsMaxDateTime_eAYc0() {
    Itinerary itinerary = new Itinerary();
    LocalDateTime actual = itinerary.getFinalArrivalDate();
    LocalDateTime expected = LocalDateTime.MAX;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_qTdN0() {
    Itinerary itinerary = new Itinerary();
    HandlingEvent event = new HandlingEvent();
    boolean result = itinerary.isExpected(event);
    assertEquals(true, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashcode1_hzPo0() {
    Itinerary iti = new Itinerary();
    iti.hashCode();
  }
}