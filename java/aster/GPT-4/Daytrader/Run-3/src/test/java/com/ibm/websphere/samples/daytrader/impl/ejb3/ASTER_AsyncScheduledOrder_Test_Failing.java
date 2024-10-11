/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_AsyncScheduledOrder_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProperties_IXkx0() {
    Instance<TradeServices> servicesMock = mock(Instance.class);
    AsyncScheduledOrder order = new AsyncScheduledOrder(servicesMock);
    order.setProperties(123, true);
    assertEquals(123, order.orderID);
    assertTrue(order.twoPhase);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProperties_IXkx0_2_fid3() {
    Instance<TradeServices> servicesMock = mock(Instance.class);
    AsyncScheduledOrder order = new AsyncScheduledOrder(servicesMock);
    order.setProperties(123, true);
    assertTrue(order.twoPhase);
  }
}