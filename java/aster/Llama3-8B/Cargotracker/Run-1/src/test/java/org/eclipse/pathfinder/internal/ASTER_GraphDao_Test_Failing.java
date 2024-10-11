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

public class Aster_GraphDao_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_KCRh0() {
    GraphDao graphDao = new GraphDao();
    String voyageNumber = graphDao.getVoyageNumber("from", "to");
    assertEquals("0100S", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_KCRh0_fid1() {
    GraphDao graphDao = new GraphDao();
    String voyageNumber = graphDao.getVoyageNumber("from", "to");
    assertEquals("0301S", voyageNumber);
  }
}