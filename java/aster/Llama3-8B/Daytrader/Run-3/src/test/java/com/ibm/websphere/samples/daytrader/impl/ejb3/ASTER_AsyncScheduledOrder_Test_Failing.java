/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AsyncScheduledOrder_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRun_jXcs0_kBMm0() {
    AsyncScheduledOrder asyncScheduledOrder = new AsyncScheduledOrder(null);
    asyncScheduledOrder.setProperties(1, true);
    asyncScheduledOrder.run();
}
}