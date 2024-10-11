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
  public void testProcessFiles_gBwX0() {
    UploadDirectoryScanner uploadDirectoryScanner = new UploadDirectoryScanner();
    uploadDirectoryScanner.processFiles();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProcessFilesWithMock_gPIP1() {
    JobOperator jobOperator = mock(JobOperator.class);
    when(BatchRuntime.getJobOperator()).thenReturn(jobOperator);
    UploadDirectoryScanner uploadDirectoryScanner = new UploadDirectoryScanner();
    uploadDirectoryScanner.processFiles();
    verify(jobOperator, times(1)).start("EventFilesProcessorJob", null);
  }
}