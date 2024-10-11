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
  public void testGetIdString_PXBy0() throws Exception {
    TrackingId trackingId = new TrackingId("12345");
    assertEquals("12345", trackingId.getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdStringWithEmptyConstructor_oGET1() throws Exception {
    TrackingId trackingId = new TrackingId();
    assertEquals("", trackingId.getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdStringWithNullConstructor_bquo2() throws Exception {
    TrackingId trackingId = new TrackingId(null);
    assertEquals(null, trackingId.getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_FoRb0() throws Exception {
    TrackingId trackingId = new TrackingId("12345");
    assertEquals("12345", trackingId.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_ZYtz0() throws Exception {
    TrackingId trackingId1 = new TrackingId("123");
    TrackingId trackingId2 = new TrackingId("456");
    assertEquals(trackingId1.hashCode(), trackingId2.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_wfpG0() throws Exception {
    TrackingId trackingId1 = new TrackingId("123");
    TrackingId trackingId2 = new TrackingId("123");
    assertTrue(trackingId1.sameValueAs(trackingId2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAsWithNull_UpZD1() throws Exception {
    TrackingId trackingId1 = new TrackingId("123");
    TrackingId trackingId2 = null;
    assertFalse(trackingId1.sameValueAs(trackingId2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAsWithDifferentId_sPTU2() throws Exception {
    TrackingId trackingId1 = new TrackingId("123");
    TrackingId trackingId2 = new TrackingId("456");
    assertFalse(trackingId1.sameValueAs(trackingId2));
  }
}