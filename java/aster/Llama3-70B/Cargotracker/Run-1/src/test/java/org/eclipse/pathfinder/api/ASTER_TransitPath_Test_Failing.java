/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.api;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TransitPath_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransitEdges_ViWg0_fid2() {
    TransitPath transitPath = new TransitPath();
    assertNull(transitPath.getTransitEdges());
  }
}