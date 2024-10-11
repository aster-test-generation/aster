/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CDIMethodConstraintBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCountWithPresentDate_IEyG2() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    LocalDateTime presentDate = LocalDateTime.now();
    int hitCount = bean.getHitCount(presentDate);
    assertEquals(1, hitCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCountWithNullDate_TSAy4() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    int hitCount = bean.getHitCount(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHitList_EmptyList_BwDI0() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    List<Integer> list = bean.hitList();
    assertTrue(list.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHitList_NonEmptyList_VcWU1_1() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    List<Integer> list = bean.hitList();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHitList_InvalidList_gflL3_1() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    List<Integer> list = bean.hitList();
    assertNotNull(list);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHitList_InvalidList_gflL3_2() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    List<Integer> list = bean.hitList();
    assertEquals(0, list.size());
  }
}