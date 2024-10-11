/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.internal;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_GraphDao_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_switch_KaHN2() {
    GraphDao graphDao = new GraphDao();
    String result = graphDao.getVoyageNumber("from", "to");
    assertNotNull(result); // since switch is covered, result will not be null
  }
}