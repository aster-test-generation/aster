/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TrackingId_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getIdStringTest_KShz0() {
    TrackingId trackingId = new TrackingId("12345");
    String idString = trackingId.getIdString();
    org.junit.jupiter.api.Assertions.assertEquals("12345", idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getIdStringNullTest_hrAI1() {
    TrackingId trackingId = new TrackingId();
    String idString = trackingId.getIdString();
    org.junit.jupiter.api.Assertions.assertNull(idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSameObject_QCBN0() {
    TrackingId trackingId = new TrackingId("123");
    boolean actual = trackingId.equals(trackingId);
    boolean expected = true;
    assert actual == expected;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNullObject_FxVy1() {
    TrackingId trackingId = new TrackingId("123");
    boolean actual = trackingId.equals(null);
    boolean expected = false;
    assert actual == expected;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentClassObject_jDsz2() {
    TrackingId trackingId = new TrackingId("123");
    boolean actual = trackingId.equals("123");
    boolean expected = false;
    assert actual == expected;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithSimilarObject_pYtK3() {
    TrackingId trackingId1 = new TrackingId("123");
    TrackingId trackingId2 = new TrackingId("123");
    boolean actual = trackingId1.equals(trackingId2);
    boolean expected = true;
    assert actual == expected;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentObject_PFuJ4() {
    TrackingId trackingId1 = new TrackingId("123");
    TrackingId trackingId2 = new TrackingId("456");
    boolean actual = trackingId1.equals(trackingId2);
    boolean expected = false;
    assert actual == expected;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_sameValueAs_with_null_parameter_yFvA0() {
    TrackingId trackingId = new TrackingId("123");
    TrackingId other = null;
    boolean result = trackingId.sameValueAs(other);
    Assertions.assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_sameValueAs_with_same_id_uSCk1() {
    TrackingId trackingId = new TrackingId("123");
    TrackingId other = new TrackingId("123");
    boolean result = trackingId.sameValueAs(other);
    Assertions.assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_sameValueAs_with_different_id_uhfL2() {
    TrackingId trackingId = new TrackingId("123");
    TrackingId other = new TrackingId("456");
    boolean result = trackingId.sameValueAs(other);
    Assertions.assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_sameValueAs_with_empty_id_sMvN6() {
    TrackingId trackingId = new TrackingId("");
    TrackingId other = new TrackingId("");
    boolean result = trackingId.sameValueAs(other);
    Assertions.assertTrue(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithId_hqtg0_yOhw0() {
    TrackingId trackingId = new TrackingId("12345");
    String actual = trackingId.toString();
    String expected = "12345";
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }
}