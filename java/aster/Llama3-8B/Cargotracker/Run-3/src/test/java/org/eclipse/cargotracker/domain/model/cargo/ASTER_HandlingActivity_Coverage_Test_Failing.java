/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Aster_HandlingActivity_Coverage_Test_Failing {
  @BeforeEach
  @Test
  public void testIsEmpty_TypeNull_LocationNull_VoyageNull_vnxj4_pROS0() {
    HandlingActivity activity = new HandlingActivity(null, null, null);
    assertTrue(activity.isEmpty());
  }
}