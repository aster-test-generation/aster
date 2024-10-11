/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.websocket.EndpointConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingWebSocketTextSync_Coverage_Test_Failing {
  private EndpointConfig ec;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_XQiS0() {
    PingWebSocketTextSync ping = new PingWebSocketTextSync();
    ping.ping("test");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingWithNullText_mnSZ3() {
    PingWebSocketTextSync ping = new PingWebSocketTextSync();
    ping.ping(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingWithEmptyText_LTqS4() {
    PingWebSocketTextSync ping = new PingWebSocketTextSync();
    ping.ping("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingWithMultipleCalls_ISLE6() {
    PingWebSocketTextSync ping = new PingWebSocketTextSync();
    ping.ping("test1");
    ping.ping("test2");
    ping.ping("test3");
  }
}