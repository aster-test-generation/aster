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
  public void testGetIdString_withId_Xqoz0() {
    TrackingId trackingId = new TrackingId("someId");
    assertEquals("someId", trackingId.getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_withoutId_yiax1() {
    TrackingId trackingId = new TrackingId();
    assertNull(trackingId.getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_oTar0() {
    TrackingId trackingId = new TrackingId("id");
    assertTrue(trackingId.equals(trackingId));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_cKwk1() {
    TrackingId trackingId = new TrackingId("id");
    assertFalse(trackingId.equals(new Object()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_PtbI2() {
    TrackingId trackingId = new TrackingId("id");
    assertFalse(trackingId.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentTrackingId_eepL3() {
    TrackingId trackingId1 = new TrackingId("id1");
    TrackingId trackingId2 = new TrackingId("id2");
    assertFalse(trackingId1.equals(trackingId2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_withId_nAvl0() {
    TrackingId trackingId = new TrackingId("12345");
    assertEquals("12345", trackingId.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_withoutId_sraw1() {
    TrackingId trackingId = new TrackingId();
    assertEquals(null, trackingId.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_SameObject_BuVg0() {
    TrackingId trackingId1 = new TrackingId("123");
    TrackingId trackingId2 = trackingId1;
    assertTrue(trackingId1.sameValueAs(trackingId2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_DifferentObjectSameId_WKZI1() {
    TrackingId trackingId1 = new TrackingId("123");
    TrackingId trackingId2 = new TrackingId("123");
    assertTrue(trackingId1.sameValueAs(trackingId2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_DifferentObjectDifferentId_zhwZ2() {
    TrackingId trackingId1 = new TrackingId("123");
    TrackingId trackingId2 = new TrackingId("456");
    assertFalse(trackingId1.sameValueAs(trackingId2));
  }
}