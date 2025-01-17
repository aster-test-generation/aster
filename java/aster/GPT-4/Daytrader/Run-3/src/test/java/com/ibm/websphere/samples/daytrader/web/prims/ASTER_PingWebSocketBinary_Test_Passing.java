/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingWebSocketBinary_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithNullException_SqjP0_1() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    Exception exception = assertThrows(NullPointerException.class, () -> {
      pingWebSocketBinary.onError(null);
    });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithNullException_SqjP0() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    Exception exception = assertThrows(NullPointerException.class, () -> {
      pingWebSocketBinary.onError(null);
    });
    assertNotNull(exception);
  }
}