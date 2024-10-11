/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.voyage.Schedule;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingActivity_Coverage_Test_Passing {
  HandlingActivity handlingActivity;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmpty_VoyageNotNull_NLXl2() {
    HandlingActivity handlingActivity = new HandlingActivity(null, null, new Voyage(new VoyageNumber("V001"), new Schedule()));
    assertFalse(handlingActivity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsEmpty_AllNull_qnuD3() {
    HandlingActivity handlingActivity = new HandlingActivity(null, null, null);
    assertTrue(handlingActivity.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_HashCodeBuilder_XNCk0() {
    HandlingActivity handlingActivity = new HandlingActivity();
    int hashCode = handlingActivity.hashCode();
    assert hashCode != 0; // default hash code is not zero
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_ReturnsFalse_isMY2() throws Exception {
    assertFalse(handlingActivity.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ReturnsFalse_iWQQ3() throws Exception {
    assertFalse(handlingActivity.equals(new Object()));
  }
}