/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingWebSocketBinary_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_1() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(10, data.position());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_3() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(10, data.get());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_12() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(10, data.remaining());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingWithEmptyData_LKAm1_1() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(0);
    pingWebSocketBinary.ping(data);
    assertEquals(0, data.position());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingWithNullData_yWrO2() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = null;
    pingWebSocketBinary.ping(data);
    assertNotNull(data);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnError_sxcp0_RSXb0() {
    PingWebSocketBinary pwb = new PingWebSocketBinary();
    Throwable t = new Throwable();
    pwb.onError(t);
    assertNotNull(t.getMessage());
    assertTrue(t.getMessage().contains("PingWebSocketBinary"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(10, data.position());
    assertEquals(10, data.limit());
    assertEquals(1, data.get());
    assertEquals(2, data.get());
    assertEquals(3, data.get());
    assertEquals(4, data.get());
    assertEquals(5, data.get());
    assertEquals(6, data.get());
    assertEquals(7, data.get());
    assertEquals(8, data.get());
    assertEquals(9, data.get());
    assertEquals(10, data.get());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingWithEmptyData_LKAm1() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(0);
    pingWebSocketBinary.ping(data);
    assertEquals(0, data.position());
    assertEquals(0, data.limit());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingWithNullData_yWrO2_fid2() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = null;
    pingWebSocketBinary.ping(data);
    assertNull(data);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_2_fid3() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(10, data.limit());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_3_fid3() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(1, data.get());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_4_fid3() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(2, data.get());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_5_fid3() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(3, data.get());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_6_fid3() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(4, data.get());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_7_fid3() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(5, data.get());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_8_fid3() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(6, data.get());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_9_fid3() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(7, data.get());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_10_fid3() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(8, data.get());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPing_QDEL0_11_fid3() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(10);
    data.put((byte) 1);
    data.put((byte) 2);
    data.put((byte) 3);
    data.put((byte) 4);
    data.put((byte) 5);
    data.put((byte) 6);
    data.put((byte) 7);
    data.put((byte) 8);
    data.put((byte) 9);
    data.put((byte) 10);
    data.flip();
    pingWebSocketBinary.ping(data);
    assertEquals(9, data.get());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingWithEmptyData_LKAm1_2_fid3() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.allocate(0);
    pingWebSocketBinary.ping(data);
    assertEquals(0, data.limit());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnError_sxcp0_RSXb0_fid3() {
    PingWebSocketBinary pwb = new PingWebSocketBinary();
    Throwable t = new Throwable();
    pwb.onError(t);
    assertTrue(t.getMessage().contains("PingWebSocketBinary"));
  }
}