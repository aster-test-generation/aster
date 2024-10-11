/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TrackingId_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdStringWithNonNullId_pVli0() {
    TrackingId trackingId = new TrackingId("12345");
    String result = trackingId.getIdString();
    assertEquals("12345", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSelf_huWp0() {
    TrackingId trackingId = new TrackingId("123");
    assertTrue(trackingId.equals(trackingId));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNull_SSqZ1() {
    TrackingId trackingId = new TrackingId("123");
    assertFalse(trackingId.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentClass_zKoE2() {
    TrackingId trackingId = new TrackingId("123");
    Object other = new Object();
    assertFalse(trackingId.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentValue_IAWL3() {
    TrackingId trackingId1 = new TrackingId("123");
    TrackingId trackingId2 = new TrackingId("456");
    assertFalse(trackingId1.equals(trackingId2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNonNullId_PqDl0() {
    TrackingId trackingId = new TrackingId("12345");
    assertEquals("12345", trackingId.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAsWithSameId_PIoV0() {
    TrackingId trackingId1 = new TrackingId("ABC123");
    TrackingId trackingId2 = new TrackingId("ABC123");
    assertTrue(trackingId1.sameValueAs(trackingId2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAsWithDifferentId_dlJI1() {
    TrackingId trackingId1 = new TrackingId("ABC123");
    TrackingId trackingId2 = new TrackingId("XYZ789");
    assertFalse(trackingId1.sameValueAs(trackingId2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAsWithNull_Buhm2() {
    TrackingId trackingId1 = new TrackingId("ABC123");
    TrackingId trackingId2 = null;
    assertFalse(trackingId1.sameValueAs(trackingId2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeConsistency_dtnN0() {
    TrackingId trackingId = new TrackingId("12345");
    int expectedHashCode = trackingId.hashCode();
    assertEquals(expectedHashCode, trackingId.hashCode());
  }
}