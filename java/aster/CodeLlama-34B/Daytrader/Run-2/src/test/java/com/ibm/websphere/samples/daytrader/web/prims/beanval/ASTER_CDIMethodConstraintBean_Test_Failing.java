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

public class Aster_CDIMethodConstraintBean_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCount_Null_tARM0() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    assertThrows(NullPointerException.class, () -> bean.getHitCount(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCount_Past_xjGG1() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    LocalDateTime past = LocalDateTime.now().minusDays(1);
    assertEquals(1, bean.getHitCount(past));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCount_Present_FSxz2() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    LocalDateTime present = LocalDateTime.now();
    assertEquals(1, bean.getHitCount(present));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCount_Future_keqF3() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    LocalDateTime future = LocalDateTime.now().plusDays(1);
    assertEquals(0, bean.getHitCount(future));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHitList_YQml0_2() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    List<Integer> list = bean.hitList();
    assertEquals(1, list.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHitList_YQml0_3() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    List<Integer> list = bean.hitList();
    assertTrue(list.contains(1));
  }
}