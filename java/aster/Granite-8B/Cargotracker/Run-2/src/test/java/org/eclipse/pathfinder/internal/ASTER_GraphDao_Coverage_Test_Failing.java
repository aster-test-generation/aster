/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.internal;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_GraphDao_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGraphDaoGetVoyageNumber1_QMUh0() {
    GraphDao graphDao = new GraphDao();
    String result = graphDao.getVoyageNumber("from", "to");
    assertEquals("0100S", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGraphDaoGetVoyageNumber2_iwrD1() {
    GraphDao graphDao = new GraphDao();
    String result = graphDao.getVoyageNumber("from", "to");
    assertEquals("0200T", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGraphDaoGetVoyageNumber3_otGl2() {
    GraphDao graphDao = new GraphDao();
    String result = graphDao.getVoyageNumber("from", "to");
    assertEquals("0300A", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGraphDaoGetVoyageNumber4_TbcZ3() {
    GraphDao graphDao = new GraphDao();
    String result = graphDao.getVoyageNumber("from", "to");
    assertEquals("0301S", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGraphDaoGetVoyageNumber5_RXCn4() {
    GraphDao graphDao = new GraphDao();
    String result = graphDao.getVoyageNumber("from", "to");
    assertEquals("0400S", result);
  }
}