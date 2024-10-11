/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_GraphDao_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_Xjgm0() throws Exception {
    GraphDao graphDao = new GraphDao();
    String result = graphDao.getVoyageNumber("from", "to");
    assertEquals("0100S", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_HxQX0() throws Exception {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    List<String> expectedLocations = new ArrayList<>(Arrays.asList("CNHKG", "AUMEL", "SESTO", "FIHEL", "USCHI", "JNTKO", "DEHAM", "CNSHA", "NLRTM", "SEGOT", "CNHGH", "USNYC", "USDAL"));
    assert locations.equals(expectedLocations);
  }
}