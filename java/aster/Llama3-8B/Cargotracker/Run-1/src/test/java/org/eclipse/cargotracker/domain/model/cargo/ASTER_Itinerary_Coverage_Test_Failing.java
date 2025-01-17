/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Itinerary_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_EQPu0() {
    Itinerary itinerary = new Itinerary(new ArrayList<>());
    assertEquals(0, itinerary.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCustoms_oTpq5_vUNG0() {
    Itinerary itinerary = new Itinerary();
    Assertions.assertTrue(itinerary.hashCode() == 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCustomsNotInLegs_fAJw9_kDvq1() {
    Itinerary itinerary = new Itinerary();
    boolean result = itinerary.hashCode() == 0;
    Assertions.assertTrue(result);
  }
}