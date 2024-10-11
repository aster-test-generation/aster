/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.api;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_GraphTraversalService_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_1_HAzP0() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("origin", "destination", "deadline");
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_2_foaA1() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("origin", "destination", "deadline");
    assertEquals(3, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_3_oodN2() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("origin", "origin", "deadline");
    assertEquals(0, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_4_JzMn3() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("origin", "destination", "deadlin");
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_HappyPath_YGIy0() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("origin", "destination", "deadline");
    assertNotNull(result);
    assertEquals(1, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_HappyPath_dNfM0() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("originCode", "destinationCode", "20230228");
    assertNotNull(result);
    assertEquals(10, result.size()); // assuming getRandomNumberOfCandidates() returns 10
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_DeadlineInvalid_aBxz3() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    try {
      graphTraversalService.findShortestPath("originCode", "destinationCode", "invalid");
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_HappyPath_YGIy0_2() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("origin", "destination", "deadline");
    assertEquals(1, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_HappyPath_dNfM0_1() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("originCode", "destinationCode", "20230228");
    assertNotNull(result);
  }
}