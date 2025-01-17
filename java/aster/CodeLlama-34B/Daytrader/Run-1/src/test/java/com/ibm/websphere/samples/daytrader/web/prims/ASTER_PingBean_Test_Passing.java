/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingBean_Test_Passing {
  private String msg;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_njqz0_PsSm0() {
    PingBean pingBean = new PingBean();
    pingBean.setMsg("Hello, World!");
    assertEquals("Hello, World!", pingBean.getMsg());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMsgWithSpecialCharacters_pebC7_KGNS0() {
    PingBean pingBean = new PingBean();
    String msg = "Hello, World!";
    pingBean.setMsg(msg);
    assertEquals(msg, pingBean.getMsg());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMsgWithDifferentLineEndings_wrYI13_ACmv0() {
    PingBean pingBean = new PingBean();
    String msg = "This message contains different line endings, such as \r\n and \n.";
    pingBean.setMsg(msg);
    assertEquals(msg, pingBean.getMsg());
  }
}