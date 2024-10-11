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

public class Aster_Itinerary_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_withNull_returnsFalse_skeN0() {
    Itinerary itinerary = new Itinerary();
    boolean actual = itinerary.equals(null);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_withObjectOfDifferentClass_returnsFalse_lAwK1() {
    Itinerary itinerary = new Itinerary();
    boolean actual = itinerary.equals(new Object());
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsExpectedWhenLegsIsEmpty_HDhX0() {
    Itinerary itinerary = new Itinerary();
    HandlingEvent event = new HandlingEvent();
    assertTrue(itinerary.isExpected(event));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFinalArrivalDate_whenLastLegIsNullOrEmpty_thenReturnsMaxDateTime_dWUI0() {
    Itinerary itinerary = new Itinerary();
    LocalDateTime actual = itinerary.getFinalArrivalDate();
    assertEquals(LocalDateTime.MAX, actual);
  }
}