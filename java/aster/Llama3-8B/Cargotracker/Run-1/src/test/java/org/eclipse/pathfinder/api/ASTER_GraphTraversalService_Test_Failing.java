/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.api;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_GraphTraversalService_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_TSpA0() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    String originUnLocode = "origin";
    String destinationUnLocode = "destination";
    String deadline = "deadline";
    List<TransitPath> result = graphTraversalService.findShortestPath(originUnLocode, destinationUnLocode, deadline);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_mHiQ0() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    List<TransitPath> result = graphTraversalService.findShortestPath("origin", "destination", "deadline");
  }
}