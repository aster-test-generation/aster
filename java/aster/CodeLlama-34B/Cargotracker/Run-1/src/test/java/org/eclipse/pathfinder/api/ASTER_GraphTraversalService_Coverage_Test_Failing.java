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

public class Aster_GraphTraversalService_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_dvOf0() {
    GraphTraversalService service = new GraphTraversalService();
    List<String> allVertices = new ArrayList<>();
    allVertices.add("A");
    allVertices.add("B");
    allVertices.add("C");
    allVertices.add("D");
    allVertices.add("E");
    allVertices.add("F");
    allVertices.add("G");
    allVertices.add("H");
    allVertices.add("I");
    allVertices.add("J");
    allVertices.add("K");
    allVertices.add("L");
    allVertices.add("M");
    allVertices.add("N");
    allVertices.add("O");
    allVertices.add("P");
    allVertices.add("Q");
    allVertices.add("R");
    allVertices.add("S");
    allVertices.add("T");
    allVertices.add("U");
    allVertices.add("V");
    allVertices.add("W");
    allVertices.add("X");
    allVertices.add("Y");
    allVertices.add("Z");
    String originUnLocode = "A";
    String destinationUnLocode = "B";
    String deadline = "2023-02-28";
    List<TransitPath> candidates = service.findShortestPath(originUnLocode, destinationUnLocode, deadline);
    assertEquals(3, candidates.size());
    for (TransitPath candidate : candidates) {
      assertEquals(3, candidate.getTransitEdges().size());
      assertEquals(originUnLocode, candidate.getTransitEdges().get(0).getFromUnLocode());
      assertEquals(destinationUnLocode, candidate.getTransitEdges().get(2).getToUnLocode());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPath_dvOf0_1() {
    GraphTraversalService service = new GraphTraversalService();
    List<String> allVertices = new ArrayList<>();
    allVertices.add("A");
    allVertices.add("B");
    allVertices.add("C");
    allVertices.add("D");
    allVertices.add("E");
    allVertices.add("F");
    allVertices.add("G");
    allVertices.add("H");
    allVertices.add("I");
    allVertices.add("J");
    allVertices.add("K");
    allVertices.add("L");
    allVertices.add("M");
    allVertices.add("N");
    allVertices.add("O");
    allVertices.add("P");
    allVertices.add("Q");
    allVertices.add("R");
    allVertices.add("S");
    allVertices.add("T");
    allVertices.add("U");
    allVertices.add("V");
    allVertices.add("W");
    allVertices.add("X");
    allVertices.add("Y");
    allVertices.add("Z");
    String originUnLocode = "A";
    String destinationUnLocode = "B";
    String deadline = "2023-02-28";
    List<TransitPath> candidates = service.findShortestPath(originUnLocode, destinationUnLocode, deadline);
    for (TransitPath candidate : candidates) {
    }
    assertEquals(3, candidates.size());
  }
}