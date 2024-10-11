/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingWebSocketTextAsync_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithNullThrowable_PbZg1() {
    PingWebSocketTextAsync pingWebSocketTextAsync = new PingWebSocketTextAsync();
    Throwable t = null;
    pingWebSocketTextAsync.onError(t);
    assertNull(t);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithSuppressedException_Isdn5() {
    PingWebSocketTextAsync pingWebSocketTextAsync = new PingWebSocketTextAsync();
    Throwable t = new Throwable(new Throwable("Test suppressed exception"));
    pingWebSocketTextAsync.onError(t);
    assertEquals("Test suppressed exception", t.getSuppressed()[0].getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithMessageAndSuppressedException_IzWl9_2() {
    PingWebSocketTextAsync pingWebSocketTextAsync = new PingWebSocketTextAsync();
    Throwable t = new Throwable("Test message and suppressed exception", new Throwable("Test suppressed exception"));
    pingWebSocketTextAsync.onError(t);
    assertEquals("Test suppressed exception", t.getSuppressed()[0].getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnError_Pyps0_rhka0_fid1() {
    PingWebSocketTextAsync pingWebSocketTextAsync = new PingWebSocketTextAsync();
    Throwable t = new Throwable();
    pingWebSocketTextAsync.onError(t);
    assertTrue(t.getMessage().contains("Pyps0"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnErrorWithMessageAndSuppressedException_IzWl9() {
    PingWebSocketTextAsync pingWebSocketTextAsync = new PingWebSocketTextAsync();
    Throwable t = new Throwable("Test message and suppressed exception", new Throwable("Test suppressed exception"));
    pingWebSocketTextAsync.onError(t);
    assertEquals("Test message and suppressed exception", t.getMessage());
    assertEquals("Test suppressed exception", t.getSuppressed()[0].getMessage());
  }
}