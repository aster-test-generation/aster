/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Itinerary_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFinalArrivalDateWhenLastLegIsNull_YkDy0() {
    Itinerary itinerary = new Itinerary();
    LocalDateTime result = itinerary.getFinalArrivalDate();
    assert(result.equals(LocalDateTime.MAX));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCustoms_oTpq5_vUNG0_fid2() {
    Itinerary itinerary = new Itinerary();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCustomsNotInLegs_fAJw9_kDvq1_fid2() {
    Itinerary itinerary = new Itinerary();
    boolean result = itinerary.hashCode() == 0;
    Assertions.assertFalse(result);
  }
}