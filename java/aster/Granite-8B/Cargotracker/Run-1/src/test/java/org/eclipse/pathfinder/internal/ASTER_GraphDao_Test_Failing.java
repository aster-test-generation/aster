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
  public void testGetVoyageNumber_ZbWp0_fid1() {
    GraphDao graphDao = new GraphDao();
    String from = "New York";
    String to = "Los Angeles";
    String expected = "0300A";
    String actual = graphDao.getVoyageNumber(from, to);
    assertEquals(expected, actual);
  }
}