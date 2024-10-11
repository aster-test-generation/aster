/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Cargo_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignToRoute_ItineraryIsNull_AjVT0() {
    Cargo cargo = new Cargo();
    try {
      cargo.assignToRoute(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      assertEquals("Itinerary is required for assignment.", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsSameObject_yoqG1_HRqn0() throws Exception {
    Cargo cargo = new Cargo();
    boolean result = cargo.equals(cargo);
    Assertions.assertTrue(result == true);
  }
}