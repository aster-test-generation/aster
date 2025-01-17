/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_GraphDao_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_case0_cZiP0() {
    GraphDao graphDao = new GraphDao();
    String result = graphDao.getVoyageNumber("from", "to");
    assertEquals("0400S", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_case0_cZiP0_fid1() {
    GraphDao graphDao = new GraphDao();
    String result = graphDao.getVoyageNumber("from", "to");
    assertEquals("0100S", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_case1_nDaU1_BpIf0_1_fid1() {
    GraphDao graphDao = new GraphDao();
    List<String> result = graphDao.listLocations();
    assertEquals(12, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_case1_nDaU1_BpIf0_3() {
    GraphDao graphDao = new GraphDao();
    List<String> result = graphDao.listLocations();
    assertEquals("USDAL", result.get(11));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_case2_Ibnr2_OxdL0_15() {
    GraphDao graphDao = new GraphDao();
    List<String> result = graphDao.listLocations();
    assertEquals("USDAL", result.get(12 - 1));
  }
}