/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.routing;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ExternalRoutingService_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit1_ztaB0() {
    ExternalRoutingService externalRoutingService = new ExternalRoutingService();
    externalRoutingService.init();
  }
}