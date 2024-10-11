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

public class Aster_GraphTraversalService_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathValidInput_LbAC0_1() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    List<TransitPath> result = service.findShortestPath("US123", "GB456", "20230101");
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathValidInput_LbAC0_2() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    List<TransitPath> result = service.findShortestPath("US123", "GB456", "20230101");
    assertFalse(result.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathWithInvalidOrigin_Zqzo1_1() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      service.findShortestPath("12345", "GB456", "20230101");
    });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathWithInvalidDestination_tpsM2_1() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      service.findShortestPath("US123", "45678", "20230101");
    });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathWithInvalidDeadline_NQaS3_1() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      service.findShortestPath("US123", "GB456", "202301");
    });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathValidInput_mkDI0_1() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    String origin = "USABC";
    String destination = "GBXYZ";
    String deadline = "20230101";
    List<TransitPath> result = service.findShortestPath(origin, destination, deadline);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathValidInput_mkDI0_2() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    String origin = "USABC";
    String destination = "GBXYZ";
    String deadline = "20230101";
    List<TransitPath> result = service.findShortestPath(origin, destination, deadline);
    assertFalse(result.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathWithSameOriginDestination_FEsR1_1() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    String origin = "USABC";
    String destination = "USABC";
    String deadline = "20230101";
    List<TransitPath> result = service.findShortestPath(origin, destination, deadline);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathWithSameOriginDestination_FEsR1_2() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    String origin = "USABC";
    String destination = "USABC";
    String deadline = "20230101";
    List<TransitPath> result = service.findShortestPath(origin, destination, deadline);
    assertTrue(result.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathWithInvalidOrigin_bqcR2() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    String origin = "12345";
    String destination = "GBXYZ";
    String deadline = "20230101";
    try {
      service.findShortestPath(origin, destination, deadline);
      fail("Should have thrown an exception due to invalid origin UN location code");
    } catch (IllegalArgumentException e) {
      assertNotNull(e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathWithInvalidDestination_vOkK3() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    String origin = "USABC";
    String destination = "12345";
    String deadline = "20230101";
    try {
      service.findShortestPath(origin, destination, deadline);
      fail("Should have thrown an exception due to invalid destination UN location code");
    } catch (IllegalArgumentException e) {
      assertNotNull(e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathValidInput_bKNA0_1() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    List<TransitPath> result = service.findShortestPath("USABC", "GBXYZ", "20230101");
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathValidInput_bKNA0_2() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    List<TransitPath> result = service.findShortestPath("USABC", "GBXYZ", "20230101");
    assertFalse(result.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathInvalidOrigin_Ezaq1_1() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      service.findShortestPath("12345", "GBXYZ", "20230101");
    });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathInvalidDestination_InpW2_1() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      service.findShortestPath("USABC", "12345", "20230101");
    });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindShortestPathInvalidDeadline_MFnI3_1() throws Exception {
    GraphTraversalService service = new GraphTraversalService();
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      service.findShortestPath("USABC", "GBXYZ", "202301");
    });
  }
}