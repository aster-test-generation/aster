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

public class Aster_RoutingStatus_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_sameValueAs_returnsTrue_whenBothAreNull_PAPf0_SeYU0() {
    RoutingStatus routingStatus = RoutingStatus.NOT_ROUTED;
    assertFalse(routingStatus.sameValueAs(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_sameValueAs_returnsTrue_whenBothAreSame_bwdC1_Grum0() {
    RoutingStatus routingStatus = RoutingStatus.ROUTED;
    assertTrue(routingStatus.sameValueAs(RoutingStatus.ROUTED));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_sameValueAs_returnsFalse_whenOtherIsDifferent_EPlJ3_iRGs0() {
    RoutingStatus routingStatus = RoutingStatus.NOT_ROUTED;
    RoutingStatus other = RoutingStatus.ROUTED;
    assertFalse(routingStatus.sameValueAs(other));
  }
}