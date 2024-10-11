/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TransportStatus_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_SameValue_ReturnsTrue_PiDI0() {
    TransportStatus status = TransportStatus.NOT_RECEIVED;
    TransportStatus other = TransportStatus.NOT_RECEIVED;
    assertTrue(status.sameValueAs(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_DifferentValue_ReturnsFalse_vMSg1() {
    TransportStatus status = TransportStatus.NOT_RECEIVED;
    TransportStatus other = TransportStatus.IN_PORT;
    assertFalse(status.sameValueAs(other));
  }
}