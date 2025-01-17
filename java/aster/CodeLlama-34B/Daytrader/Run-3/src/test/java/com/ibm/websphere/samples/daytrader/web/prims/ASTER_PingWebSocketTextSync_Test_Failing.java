/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingWebSocketTextSync_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnError_Throwable_jDtE0_oRPv0() {
    PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
    Throwable t = new Throwable();
    pingWebSocketTextSync.onError(t);
    assertNotNull(t.getMessage());
    assertTrue(t.getMessage().contains("PingWebSocketTextSync"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnError_IOException_mGkL3_Exiu0() {
    PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
    Throwable t = new IOException();
    pingWebSocketTextSync.onError(t);
    assertNotNull(t.getMessage());
    assertTrue(t.getMessage().contains("IOException"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnError_Throwable_jDtE0_oRPv0_fid2() {
    PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
    Throwable t = new Throwable();
    pingWebSocketTextSync.onError(t);
    assertTrue(t.getMessage().contains("PingWebSocketTextSync"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnError_RuntimeException_YANl4_NLAB0_fid2() {
    PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
    Throwable t = new RuntimeException();
    pingWebSocketTextSync.onError(t);
    assertTrue(t.getMessage().contains("RuntimeException"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnError_IOException_mGkL3_Exiu0_fid2() {
    PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
    Throwable t = new IOException();
    pingWebSocketTextSync.onError(t);
    assertTrue(t.getMessage().contains("IOException"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnError_Error_rMlx5_ruQh0_fid2() {
    PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
    Throwable t = new Error();
    pingWebSocketTextSync.onError(t);
    assertTrue(t.getMessage().contains("Error"));
  }
}