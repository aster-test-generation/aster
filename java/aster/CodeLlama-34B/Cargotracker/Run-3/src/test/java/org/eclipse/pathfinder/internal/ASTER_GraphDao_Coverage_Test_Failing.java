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
  public void testGetVoyageNumber_random0_iayf0() {
    GraphDao graphDao = new GraphDao();
    String voyageNumber = graphDao.getVoyageNumber("from", "to");
    assertEquals("0301S", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_random1_rmMK1() {
    GraphDao graphDao = new GraphDao();
    String voyageNumber = graphDao.getVoyageNumber("from", "to");
    assertEquals("0200T", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_random3_Sdft3() {
    GraphDao graphDao = new GraphDao();
    String voyageNumber = graphDao.getVoyageNumber("from", "to");
    assertEquals("0100S", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_random4_gUQw4() {
    GraphDao graphDao = new GraphDao();
    String voyageNumber = graphDao.getVoyageNumber("from", "to");
    assertEquals("0300A", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_random4_gUQw4_fid2() {
    GraphDao graphDao = new GraphDao();
    String voyageNumber = graphDao.getVoyageNumber("from", "to");
    assertEquals("0400S", voyageNumber);
  }
}