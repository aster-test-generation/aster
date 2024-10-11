/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.api;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_GraphTraversalService_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_WhenOriginAndDestinationAreInvalid_ThenItThrowsException_SPlP1() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    String originUnLocode = "ABC";
    String destinationUnLocode = "XYZ";
    String deadline = "20220101";
    Exception exception = Assertions.assertThrows(Exception.class, () -> graphTraversalService.findShortestPath(originUnLocode, destinationUnLocode, deadline));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_WhenDeadlineIsInvalid_ThenItThrowsException_zVsj2() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    String originUnLocode = "USNYC";
    String destinationUnLocode = "USDAL";
    String deadline = "202201";
    Exception exception = Assertions.assertThrows(Exception.class, () -> graphTraversalService.findShortestPath(originUnLocode, destinationUnLocode, deadline));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_WhenOriginAndDestinationAreValidAndDeadlineIsBeforeCurrentDate_ThenItThrowsException_bXFp3() {
    GraphTraversalService graphTraversalService = new GraphTraversalService();
    String originUnLocode = "USNYC";
    String destinationUnLocode = "USDAL";
    String deadline = "20211231";
    Exception exception = Assertions.assertThrows(Exception.class, () -> graphTraversalService.findShortestPath(originUnLocode, destinationUnLocode, deadline));
  }
}