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
  public void testToString_dCsw0() {
    TransitPath transitPath = new TransitPath();
    assertEquals("TransitPath{transitEdges=[]}", transitPath.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithTransitEdges_FPOT1() {
    List<TransitEdge> transitEdges = new ArrayList<>();
    TransitPath transitPath = new TransitPath(transitEdges);
    assertEquals("TransitPath{transitEdges=[]}", transitPath.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransitEdges_LGLi0() {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitPath.setTransitEdges(transitEdges);
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransitEdges_nullParameter_VOSG1() {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = null;
    transitPath.setTransitEdges(transitEdges);
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransitEdges_nonEmptyParameter_rkHS3() {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitEdges.add(new TransitEdge());
    transitPath.setTransitEdges(transitEdges);
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransitEdges_multipleParameters_fgxD4() {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitEdges.add(new TransitEdge());
    transitEdges.add(new TransitEdge());
    transitPath.setTransitEdges(transitEdges);
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransitEdges_multipleParameters_nullAndEmpty_MLVK5() {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitEdges.add(new TransitEdge());
    transitEdges.add(null);
    transitEdges.add(new TransitEdge());
    transitPath.setTransitEdges(transitEdges);
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransitEdges_multipleParameters_nonEmpty_nwWT6() {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitEdges.add(new TransitEdge());
    transitEdges.add(new TransitEdge());
    transitEdges.add(new TransitEdge());
    transitPath.setTransitEdges(transitEdges);
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransitEdges_multipleParameters_nullAndEmptyAndNonEmpty_PtGc7() {
    TransitPath transitPath = new TransitPath();
    List<TransitEdge> transitEdges = new ArrayList<>();
    transitEdges.add(new TransitEdge());
    transitEdges.add(null);
    transitEdges.add(new TransitEdge());
    transitEdges.add(null);
    transitEdges.add(new TransitEdge());
    transitPath.setTransitEdges(transitEdges);
    assertEquals(transitEdges, transitPath.getTransitEdges());
  }
}