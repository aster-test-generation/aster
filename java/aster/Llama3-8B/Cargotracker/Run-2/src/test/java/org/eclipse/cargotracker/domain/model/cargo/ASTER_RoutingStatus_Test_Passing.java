/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RoutingStatus_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSameValueAs_gjlQ0_EjXY0() {
    RoutingStatus routingStatus1 = RoutingStatus.NOT_ROUTED;
    RoutingStatus routingStatus2 = RoutingStatus.NOT_ROUTED;
    Assertions.assertTrue(routingStatus1.sameValueAs(routingStatus2));
}
}