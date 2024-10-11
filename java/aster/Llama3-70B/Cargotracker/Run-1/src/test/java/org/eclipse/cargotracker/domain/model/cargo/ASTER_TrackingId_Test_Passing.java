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
  public void testGetIdString_withId_AgOF0() {
    TrackingId trackingId = new TrackingId("someId");
    assertEquals("someId", trackingId.getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_withoutId_ajMl1() {
    TrackingId trackingId = new TrackingId();
    assertNull(trackingId.getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_IrmK0() {
    TrackingId trackingId = new TrackingId("id");
    assertTrue(trackingId.equals(trackingId));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_QJNh1() {
    TrackingId trackingId = new TrackingId("id");
    assertFalse(trackingId.equals(new Object()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_AGot2() {
    TrackingId trackingId = new TrackingId("id");
    assertFalse(trackingId.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentValue_NprF3() {
    TrackingId trackingId1 = new TrackingId("id1");
    TrackingId trackingId2 = new TrackingId("id2");
    assertFalse(trackingId1.equals(trackingId2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_withId_GTAo0() {
    TrackingId trackingId = new TrackingId("12345");
    assertEquals("12345", trackingId.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_withoutId_aaOP1() {
    TrackingId trackingId = new TrackingId();
    assertEquals(null, trackingId.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_SameId_FtOH0() {
    TrackingId trackingId1 = new TrackingId("123");
    TrackingId trackingId2 = new TrackingId("123");
    assertTrue(trackingId1.sameValueAs(trackingId2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_DifferentId_mvhw1() {
    TrackingId trackingId1 = new TrackingId("123");
    TrackingId trackingId2 = new TrackingId("456");
    assertFalse(trackingId1.sameValueAs(trackingId2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_Null_Mvlw2() {
    TrackingId trackingId1 = new TrackingId("123");
    assertFalse(trackingId1.sameValueAs(null));
  }
}