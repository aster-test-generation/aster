/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CDIMethodConstraintBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHitList_bYRC0_1() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    List<Integer> list = bean.hitList();
    assertNotNull(list);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHitListWithEmptyList_pJRf1_2() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    List<Integer> list = bean.hitList();
    assertEquals(0, list.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHitListWithMinValueElements_TdoC10() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    List<Integer> list = bean.hitList();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHitCount_Null_DVWE0_fid1() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
  }
}