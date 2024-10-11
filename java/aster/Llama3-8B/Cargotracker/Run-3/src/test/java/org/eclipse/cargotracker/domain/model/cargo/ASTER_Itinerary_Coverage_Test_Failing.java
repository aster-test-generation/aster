/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Itinerary_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_utKy0() {
    Itinerary itinerary = new Itinerary(new ArrayList<>());
    int expectedHashCode = 0;
    int actualHashCode = itinerary.hashCode();
    assert expectedHashCode == actualHashCode;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFinalArrivalDate_EmptyLegList_ReturnsMaxDate_opGu2() {
    Itinerary itinerary = new Itinerary(new ArrayList<>());
    LocalDateTime result = itinerary.getFinalArrivalDate();
    assert(result.equals(LocalDateTime.MAX));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCustoms_wgYT5_ZiCd1() {
    Itinerary itinerary = new Itinerary();
    boolean result = itinerary.hashCode() == 0;
    Assertions.assertTrue(result);
  }
}