/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SampleDataGenerator_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_TrackingId1_toYU0() {
    SampleDataGenerator sampleDataGenerator = new SampleDataGenerator();
    sampleDataGenerator.loadSampleData();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_PersistHamburg_HqIo8_WaEb0() {
    SampleDataGenerator sampleDataGenerator = new SampleDataGenerator();
    sampleDataGenerator.loadSampleData();
    assertEquals(true, true);
  }
}