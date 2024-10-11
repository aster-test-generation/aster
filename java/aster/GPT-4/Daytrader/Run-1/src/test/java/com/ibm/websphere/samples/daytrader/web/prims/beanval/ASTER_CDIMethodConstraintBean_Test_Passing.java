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
  public void testGetHitCountWithCurrentTime_kPEt0() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    LocalDateTime now = LocalDateTime.now();
    int result = bean.getHitCount(now);
    assertEquals(1, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHitListWithValidValues_xUoz0_1() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    List<Integer> result = bean.hitList();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHitListWithValidValues_xUoz0_2() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    List<Integer> result = bean.hitList();
    assertTrue(result.stream().allMatch(num -> num >= 1));
  }
}