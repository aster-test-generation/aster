/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SampleDataGenerator_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_mpRS0() {
    SampleDataGenerator sampleDataGenerator = new SampleDataGenerator();
    sampleDataGenerator.loadSampleData();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleDataWithSampleDataLoaded_hgeQ2() {
    SampleDataGenerator sampleDataGenerator = new SampleDataGenerator();
    sampleDataGenerator.loadSampleData();
    sampleDataGenerator.loadSampleData();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_mpRS0_fid2() {
    SampleDataGenerator sampleDataGenerator = new SampleDataGenerator();
    sampleDataGenerator.loadSampleData();
    // Add assertion here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_CqUh0_fid2() {
    SampleDataGenerator sampleDataGenerator = new SampleDataGenerator();
    sampleDataGenerator.loadSampleData();
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleDataWithSampleDataLoaded_hgeQ2_fid2() {
    SampleDataGenerator sampleDataGenerator = new SampleDataGenerator();
    sampleDataGenerator.loadSampleData();
    sampleDataGenerator.loadSampleData();
    // Add assertions here
}
}