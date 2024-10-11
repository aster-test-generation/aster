/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RoutingStatus_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_bqMU0_gxpL0() {
    RoutingStatus routingStatus1 = RoutingStatus.NOT_ROUTED;
    RoutingStatus routingStatus2 = RoutingStatus.NOT_ROUTED;
    RoutingStatus routingStatus3 = RoutingStatus.ROUTED;
    assert routingStatus1.sameValueAs(routingStatus2);
    assert !routingStatus1.sameValueAs(routingStatus3);
    assert routingStatus1.sameValueAs(routingStatus1);
    assert !routingStatus1.sameValueAs(null);
    assert !routingStatus1.sameValueAs(RoutingStatus.MISROUTED);
    assert routingStatus2.sameValueAs(routingStatus1);
    assert !routingStatus2.sameValueAs(routingStatus3);
    assert routingStatus2.sameValueAs(routingStatus2);
    assert !routingStatus2.sameValueAs(null);
    assert !routingStatus2.sameValueAs(RoutingStatus.MISROUTED);
    assert routingStatus3.sameValueAs(routingStatus1);
    assert !routingStatus3.sameValueAs(routingStatus2);
    assert routingStatus3.sameValueAs(routingStatus3);
    assert !routingStatus3.sameValueAs(null);
    assert !routingStatus3.sameValueAs(RoutingStatus.MISROUTED);
    assert !routingStatus2.sameValueAs(RoutingStatus.MISROUTED);
  }
}