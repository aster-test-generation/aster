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
  public void testGetVoyageNumberReturnsDefault0200T_MFHo4_PFMT0() {
    GraphDao graphDao = new GraphDao();
    String voyageNumber = graphDao.getVoyageNumber("anyFrom", "anyTo");
    assertEquals("0200T", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberReturnsDefault0400S_MFHo4_PFMT0() {
    GraphDao graphDao = new GraphDao();
    String voyageNumber = graphDao.getVoyageNumber("anyFrom", "anyTo");
    assertEquals("0400S", voyageNumber);
  }
}