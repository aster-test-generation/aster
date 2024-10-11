/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingEJBLocal_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMsg_csSB0() {
    PingEJBLocal pingEJBLocal = new PingEJBLocal();
    String result = pingEJBLocal.getMsg();
    assertEquals("PingEJBLocal: 0", result);
  }
}