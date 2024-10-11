/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_GraphDao_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocations_zoJv0() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertEquals(13, locations.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocationsWithNewArrayList_pQWF1_2() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations instanceof ArrayList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListLocationsWithArraysAsList_qOpL2_3() {
    GraphDao graphDao = new GraphDao();
    List<String> locations = graphDao.listLocations();
    assertTrue(locations.get(0) instanceof String);
  }
}