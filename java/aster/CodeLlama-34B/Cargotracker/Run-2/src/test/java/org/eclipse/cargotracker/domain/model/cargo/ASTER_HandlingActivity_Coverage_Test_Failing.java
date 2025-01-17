/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.voyage.Schedule;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingActivity_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmptyWithTypeNotNull_DgSQ0() {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, null, null);
    assertFalse(handlingActivity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmptyWithVoyageNotNull_Bbeu2() {
    HandlingActivity handlingActivity = new HandlingActivity(null, null, new Voyage(new VoyageNumber(""), new Schedule()));
    assertFalse(handlingActivity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmptyWithAllNull_BRuA3() {
    HandlingActivity handlingActivity = new HandlingActivity(null, null, null);
    assertTrue(handlingActivity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmptyWithTypeAndVoyageNotNull_Flwo5() {
    HandlingActivity handlingActivity = new HandlingActivity(HandlingEvent.Type.LOAD, null, new Voyage(new VoyageNumber(""), new Schedule()));
    assertFalse(handlingActivity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithAllNull_CZuY4_PUtL0() {
    HandlingActivity activity = new HandlingActivity(null, null, null);
    assertEquals(new HashCodeBuilder().append((Object) null).append((Object) null).append((Object) null).toHashCode(), activity.hashCode());
  }
}