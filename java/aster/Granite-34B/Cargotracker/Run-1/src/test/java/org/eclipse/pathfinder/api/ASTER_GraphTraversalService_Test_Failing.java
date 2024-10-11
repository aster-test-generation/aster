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
  public void testFindShortestPath_XYou0() {
    GraphTraversalService service = new GraphTraversalService();
    String originUnLocode = "USNYC";
    String destinationUnLocode = "SEGOT";
    String deadline = "20220101";
    List<TransitPath> shortestPath = service.findShortestPath(originUnLocode, destinationUnLocode, deadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_nullOrigin_irEW1() {
    GraphTraversalService gts = new GraphTraversalService();
    String originUnLocode = null;
    String destinationUnLocode = "CAeux";
    String deadline = "20220101";
    try {
      gts.findShortestPath(originUnLocode, destinationUnLocode, deadline);
      fail("Expected exception not thrown");
    } catch (Exception e) {
      assertTrue(e.getMessage().contains("Missing origin UN location code"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_invalidOrigin_bcOA2() {
    GraphTraversalService gts = new GraphTraversalService();
    String originUnLocode = "US";
    String destinationUnLocode = "CAeux";
    String deadline = "20220101";
    try {
      gts.findShortestPath(originUnLocode, destinationUnLocode, deadline);
      fail("Expected exception not thrown");
    } catch (Exception e) {
      assertTrue(e.getMessage().contains("Origin UNLOCODE must be 2 to 5 characters long"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_nullDestination_UtlK3() {
    GraphTraversalService gts = new GraphTraversalService();
    String originUnLocode = "USNYC";
    String destinationUnLocode = null;
    String deadline = "20220101";
    try {
      gts.findShortestPath(originUnLocode, destinationUnLocode, deadline);
      fail("Expected exception not thrown");
    } catch (Exception e) {
      assertTrue(e.getMessage().contains("Missing destination UN location code"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_invalidDestination_MOHY4() {
    GraphTraversalService gts = new GraphTraversalService();
    String originUnLocode = "USNYC";
    String destinationUnLocode = "CA";
    String deadline = "20220101";
    try {
      gts.findShortestPath(originUnLocode, destinationUnLocode, deadline);
      fail("Expected exception not thrown");
    } catch (Exception e) {
      assertTrue(e.getMessage().contains("Destination UNLOCODE must be 2 to 5 characters long"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_invalidDeadline_lFQM5() {
    GraphTraversalService gts = new GraphTraversalService();
    String originUnLocode = "USNYC";
    String destinationUnLocode = "CAeux";
    String deadline = "202201";
    try {
      gts.findShortestPath(originUnLocode, destinationUnLocode, deadline);
      fail("Expected exception not thrown");
    } catch (Exception e) {
      assertTrue(e.getMessage().contains("Deadline value must be eight characters long"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_WhenOriginAndDestinationUnLocodesAreValid_ThenItShouldReturnAListofTransitPaths_zPyE0() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    String originUnLocode = "USNYC";
    String destinationUnLocode = "CAeux";
    String deadline = "20220101";
    List<TransitPath> transitPaths = graphTraversalService.findShortestPath(originUnLocode, destinationUnLocode, deadline);
    assertNotNull(transitPaths);
    assertTrue(transitPaths.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_WhenOriginAndDestinationUnLocodesAreValid_ThenItShouldReturnAListofTransitPaths_zPyE0_1() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    String originUnLocode = "USNYC";
    String destinationUnLocode = "CAeux";
    String deadline = "20220101";
    List<TransitPath> transitPaths = graphTraversalService.findShortestPath(originUnLocode, destinationUnLocode, deadline);
    assertNotNull(transitPaths);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_WhenOriginAndDestinationUnLocodesAreValid_ThenItShouldReturnAListofTransitPaths_zPyE0_2() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    String originUnLocode = "USNYC";
    String destinationUnLocode = "CAeux";
    String deadline = "20220101";
    List<TransitPath> transitPaths = graphTraversalService.findShortestPath(originUnLocode, destinationUnLocode, deadline);
    assertTrue(transitPaths.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_WhenOriginAndDestinationUnLocodesAreValid_ThenItShouldReturnAListofTransitPaths_zPyE0_1_fid2() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    String originUnLocode = "USNYC";
    String destinationUnLocode = "CAeux";
    String deadline = "20220101";
    List<TransitPath> transitPaths = graphTraversalService.findShortestPath(originUnLocode, destinationUnLocode, deadline);
    assertNotNull(transitPaths);
    assertEquals(0, transitPaths.size());
  }
}