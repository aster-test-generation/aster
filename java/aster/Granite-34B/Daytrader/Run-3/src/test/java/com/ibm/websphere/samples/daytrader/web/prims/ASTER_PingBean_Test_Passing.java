/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMsg_nMZp0() {
    PingBean pingBean = new PingBean();
    pingBean.setMsg("Hello");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMsgWithNull_nEzS1() {
    PingBean pingBean = new PingBean();
    pingBean.setMsg(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMsgWithEmpty_gnxO2() {
    PingBean pingBean = new PingBean();
    pingBean.setMsg("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMsgWithTabs_TeZK4() {
    PingBean pingBean = new PingBean();
    pingBean.setMsg("\t\t");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMsgWithNewLines_jMCW5() {
    PingBean pingBean = new PingBean();
    pingBean.setMsg("\n\n");
  }
}