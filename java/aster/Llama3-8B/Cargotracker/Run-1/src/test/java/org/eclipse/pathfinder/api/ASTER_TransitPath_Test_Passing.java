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
  public void testGetTransitEdges_ThXG0() {
    List<TransitEdge> transitEdges = new ArrayList<>();
    TransitPath transitPath = new TransitPath(transitEdges);
    List<TransitEdge> result = transitPath.getTransitEdges();
    assert result.equals(transitEdges);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransitEdges_ZvfK0() {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitPath.setTransitEdges(transitEdges);
    assertEquals(transitPath.getTransitEdges(), transitEdges);
  }
}