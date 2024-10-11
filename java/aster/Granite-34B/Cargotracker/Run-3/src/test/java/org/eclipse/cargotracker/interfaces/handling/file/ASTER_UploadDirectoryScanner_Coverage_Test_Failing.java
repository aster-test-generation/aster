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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_UploadDirectoryScanner_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProcessFiles_wnwr0() {
    UploadDirectoryScanner uploadDirectoryScanner = new UploadDirectoryScanner();
    uploadDirectoryScanner.processFiles();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProcessFilesWithValidInput_DYrm2() {
    UploadDirectoryScanner uploadDirectoryScanner = new UploadDirectoryScanner();
    JobOperator jobOperator = mock(JobOperator.class);
    when(BatchRuntime.getJobOperator()).thenReturn(jobOperator);
    try {
      when(jobOperator.start("EventFilesProcessorJob", null)).thenReturn(1L);
    } catch (Exception e) {
      e.printStackTrace();
    }
    uploadDirectoryScanner.processFiles();
  }
}