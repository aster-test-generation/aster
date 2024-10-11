/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import jakarta.batch.operations.JobOperator;
import jakarta.batch.runtime.BatchRuntime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UploadDirectoryScanner_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProcessFiles_MZcx0_bvJR0() {
    UploadDirectoryScanner uploadDirectoryScanner = new UploadDirectoryScanner();
    JobOperator jobOperator = BatchRuntime.getJobOperator();
    assertTrue(jobOperator.getJobNames().contains("EventFilesProcessorJob"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProcessFiles_MZcx0_bvJR0_fid2() {
    UploadDirectoryScanner uploadDirectoryScanner = new UploadDirectoryScanner();
    JobOperator jobOperator = BatchRuntime.getJobOperator();
    uploadDirectoryScanner.processFiles();
    assertTrue(jobOperator.getJobNames().contains("EventFilesProcessorJob"));
  }
}