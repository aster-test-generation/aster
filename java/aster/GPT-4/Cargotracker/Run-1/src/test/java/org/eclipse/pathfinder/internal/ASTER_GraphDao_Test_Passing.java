/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.internal;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_GraphDao_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberReturnsValidVoyageNumber_yHhj0() {
    GraphDao graphDao = new GraphDao();
    String result = graphDao.getVoyageNumber("NYC", "LAX");
    assertTrue(result.equals("0100S") || result.equals("0200T") || result.equals("0300A") || result.equals("0301S") || result.equals("0400S"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_QZMf0() {
    GraphDao graphDao = new GraphDao();
    List<String> expectedLocations = Arrays.asList("CNHKG", "AUMEL", "SESTO", "FIHEL", "USCHI", "JNTKO", "DEHAM", "CNSHA", "NLRTM", "SEGOT", "CNHGH", "USNYC", "USDAL");
    assertEquals(expectedLocations, graphDao.listLocations());
  }
}