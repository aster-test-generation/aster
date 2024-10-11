/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
  public void testGetTransitEdges_ViWg0() {
    TransitPath transitPath = new TransitPath();
    assertEquals(Collections.emptyList(), transitPath.getTransitEdges());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransitEdges_withEdges_amZj1() {
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitEdges.add(new TransitEdge());
    TransitPath transitPath = new TransitPath(transitEdges);
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_WnGD0() {
    TransitPath transitPath = new TransitPath(Arrays.asList(new TransitEdge(), new TransitEdge()));
    assertEquals("TransitPath{transitEdges=[" + new TransitEdge().toString() + ", " + new TransitEdge().toString() + "]}", transitPath.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransitEdges_xzUz0() {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitEdges.add(new TransitEdge());
    transitPath.setTransitEdges(transitEdges);
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }
}