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
import static org.mockito.Mockito.*;

public class Aster_UploadDirectoryScanner_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProcessFiles_ONwD0() {
    UploadDirectoryScanner uploadDirectoryScanner = new UploadDirectoryScanner();
    uploadDirectoryScanner.processFiles();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProcessFilesWithException_oahe2() {
    JobOperator jobOperator = mock(JobOperator.class);
    when(BatchRuntime.getJobOperator()).thenThrow(new RuntimeException());
    UploadDirectoryScanner uploadDirectoryScanner = new UploadDirectoryScanner();
    uploadDirectoryScanner.processFiles();
    verify(jobOperator, never()).start("EventFilesProcessorJob", null);
  }
}