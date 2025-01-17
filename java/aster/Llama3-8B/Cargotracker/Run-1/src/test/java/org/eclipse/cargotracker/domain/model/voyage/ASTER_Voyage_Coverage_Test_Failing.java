/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Voyage_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_nOTp0_fid1() {
    Voyage voyage = new Voyage(new VoyageNumber("123"), new Schedule());
    int expectedHashCode = 123; // replace with the expected hash code
    int actualHashCode = voyage.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }
}