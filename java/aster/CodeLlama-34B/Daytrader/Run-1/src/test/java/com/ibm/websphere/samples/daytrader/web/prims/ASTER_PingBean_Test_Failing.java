/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingBean_Test_Failing {
  private String msg;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMsg_OmEm0() {
    PingBean pingBean = new PingBean();
    String msg = pingBean.getMsg();
    assertEquals("Hello, World!", msg);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMsgWithDifferentInputs_ZmIP1_RlNo0_1() {
    PingBean pingBean = new PingBean();
    String msg = pingBean.getMsg();
    msg = pingBean.getMsg();
    assertEquals("Hello, World!", msg);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMsgWithDifferentInputs_ZmIP1_RlNo0_2() {
    PingBean pingBean = new PingBean();
    String msg = pingBean.getMsg();
    msg = pingBean.getMsg();
    assertEquals("Goodbye, World!", msg);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMsgWithException_DAME3_pFZK0() {
    PingBean pingBean = new PingBean();
    try {
      String msg = pingBean.getMsg();
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      assertEquals("NullPointerException", e.getMessage());
    }
  }
}