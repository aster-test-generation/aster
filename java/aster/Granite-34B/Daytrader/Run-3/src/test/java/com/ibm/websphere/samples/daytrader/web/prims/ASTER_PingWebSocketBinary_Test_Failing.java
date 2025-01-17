/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingWebSocketBinary_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_ocll0() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    pingWebSocketBinary.ping(data);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingWithNullData_hueK1() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    pingWebSocketBinary.ping(null);
  }
}