/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TransitPath_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_sMER0() throws Exception {
    TransitPath transitPath = new TransitPath(Arrays.asList(new TransitEdge(), new TransitEdge()));
    assertEquals("TransitPath{transitEdges=[" + new TransitEdge().toString() + ", " + new TransitEdge().toString() + "]}", transitPath.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransitEdges_cZhp0() throws Exception {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> expected = new ArrayList<>();
    assertEquals(expected, transitPath.getTransitEdges());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransitEdges_withEdges_ssKG1() throws Exception {
    List<TransitEdge> edges = new ArrayList<>();
    edges.add(new TransitEdge());
    TransitPath transitPath = new TransitPath(edges);
    assertEquals(edges, transitPath.getTransitEdges());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransitEdges_lFcM0() throws Exception {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitEdges.add(new TransitEdge());
    transitPath.setTransitEdges(transitEdges);
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }
}