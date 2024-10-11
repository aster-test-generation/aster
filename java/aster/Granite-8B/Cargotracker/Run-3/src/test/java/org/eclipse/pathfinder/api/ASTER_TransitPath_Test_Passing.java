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

public class Aster_TransitPath_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransitEdges_qlbt0() throws Exception {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitEdges.add(new TransitEdge());
    transitPath.setTransitEdges(transitEdges);
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_NbfU0() throws Exception {
    TransitPath transitPath = new TransitPath();
    String expected = "TransitPath{transitEdges=[]}";
    assertEquals(expected, transitPath.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithTransitEdges_hVVA1() throws Exception {
    TransitEdge transitEdge1 = new TransitEdge();
    TransitEdge transitEdge2 = new TransitEdge();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitEdges.add(transitEdge1);
    transitEdges.add(transitEdge2);
    TransitPath transitPath = new TransitPath(transitEdges);
    String expected = "TransitPath{transitEdges=[" + transitEdge1 + ", " + transitEdge2 + "]}";
    assertEquals(expected, transitPath.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransitEdges_kvuk0() throws Exception {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitPath.setTransitEdges(transitEdges);
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransitEdges_kfQv1_1() throws Exception {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitPath.setTransitEdges(transitEdges);
    transitEdges.add(new TransitEdge());
    transitEdges.remove(0);
    transitEdges.clear();
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }
}