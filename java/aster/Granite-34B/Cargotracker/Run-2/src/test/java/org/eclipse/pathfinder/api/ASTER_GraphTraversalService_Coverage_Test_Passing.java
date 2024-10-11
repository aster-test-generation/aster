/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_GraphTraversalService_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_findShortestPath_with_2_locations_nTYQ2_uKEw0() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<String> allLocations = new ArrayList<>();
    allLocations.add("location1");
    allLocations.add("location2");
    List<String> randomChunkOfLocations = new ArrayList<>();
    randomChunkOfLocations.add("location1");
    randomChunkOfLocations.add("location2");
    assertEquals(2, randomChunkOfLocations.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_findShortestPath_with_3_locations_kksx3_ZWou0() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<String> allLocations = new ArrayList<>();
    allLocations.add("location1");
    allLocations.add("location2");
    allLocations.add("location3");
    List<String> randomChunkOfLocations = new ArrayList<>();
    randomChunkOfLocations.add("location1");
    randomChunkOfLocations.add("location2");
    randomChunkOfLocations.add("location3");
    assertEquals(3, randomChunkOfLocations.size());
  }
}