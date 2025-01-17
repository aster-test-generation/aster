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
  public void testFindShortestPath_HappyPath_GWCV0() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("originCode", "destinationCode", "deadline");
    assertNotNull(result);
    assertEquals(3, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_HappyPath_UoQn0() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("origin", "destination", "deadline");
    assertNotNull(result);
    assertEquals(1, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_DeadlineIsInvalid_RHlh3() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    try {
      graphTraversalService.findShortestPath("origin", "destination", "invalid");
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_HappyPath_ByZy0() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("originCode", "destinationCode", "20230228");
    assertNotNull(result);
    assertEquals(10, result.size()); // assuming getRandomNumberOfCandidates() returns 10
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_DeadlineInvalid_zXcK3() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    try {
      graphTraversalService.findShortestPath("originCode", "destinationCode", "invalidDeadline");
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_HappyPath_GWCV0_1() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("originCode", "destinationCode", "deadline");
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_HappyPath_GWCV0_2() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("originCode", "destinationCode", "deadline");
    assertEquals(3, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_HappyPath_UoQn0_1() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("origin", "destination", "deadline");
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_HappyPath_UoQn0_2() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("origin", "destination", "deadline");
    assertEquals(1, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_HappyPath_ByZy0_1() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("originCode", "destinationCode", "20230228");
    assertNotNull(result);
  }
}