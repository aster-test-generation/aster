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
  public void testToString_eZIW0() throws Exception {
    TransitPath transitPath = new TransitPath();
    assertEquals("TransitPath{}", transitPath.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithTransitEdges_VvDw1() throws Exception {
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitEdges.add(new TransitEdge());
    TransitPath transitPath = new TransitPath(transitEdges);
    assertEquals("TransitPath{transitEdges=[" + transitEdges.get(0).toString() + "]}", transitPath.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransitEdges_eLmZ0() throws Exception {
    List<TransitEdge> expectedTransitEdges = new ArrayList<>();
    TransitPath transitPath = new TransitPath(expectedTransitEdges);
    List<TransitEdge> actualTransitEdges = transitPath.getTransitEdges();
    assertEquals(expectedTransitEdges, actualTransitEdges);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransitEdgesWithNonEmptyList_MqFL2() throws Exception {
    List<TransitEdge> expectedTransitEdges = new ArrayList<>();
    expectedTransitEdges.add(new TransitEdge());
    TransitPath transitPath = new TransitPath(expectedTransitEdges);
    List<TransitEdge> actualTransitEdges = transitPath.getTransitEdges();
    assertEquals(expectedTransitEdges, actualTransitEdges);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransitEdgesWithNullList_YwHZ3() throws Exception {
    List<TransitEdge> expectedTransitEdges = null;
    TransitPath transitPath = new TransitPath(expectedTransitEdges);
    List<TransitEdge> actualTransitEdges = transitPath.getTransitEdges();
    assertEquals(expectedTransitEdges, actualTransitEdges);
  }
}