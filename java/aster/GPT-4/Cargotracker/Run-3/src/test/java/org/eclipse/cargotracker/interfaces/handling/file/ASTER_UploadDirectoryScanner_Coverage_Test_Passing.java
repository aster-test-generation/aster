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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_UploadDirectoryScanner_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProcessFiles_StartsJobSuccessfully_ndnQ0() {
    JobOperator mockedJobOperator = mock(JobOperator.class);
    BatchRuntime mockRuntime = mock(BatchRuntime.class);
    when(mockRuntime.getJobOperator()).thenReturn(mockedJobOperator);
    UploadDirectoryScanner scanner = new UploadDirectoryScanner();
    scanner.processFiles();
    verify(mockRuntime).getJobOperator();
    verify(mockedJobOperator).start("EventFilesProcessorJob", null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProcessFiles_JobOperatorThrowsException_Trjg1() {
    JobOperator mockedJobOperator = mock(JobOperator.class);
    when(mockedJobOperator.start("EventFilesProcessorJob", null)).thenThrow(new RuntimeException("Job start failed"));
    BatchRuntime mockRuntime = mock(BatchRuntime.class);
    when(mockRuntime.getJobOperator()).thenReturn(mockedJobOperator);
    UploadDirectoryScanner scanner = new UploadDirectoryScanner();
    try {
      scanner.processFiles();
      fail("Expected an exception to be thrown");
    } catch (RuntimeException e) {
      assertEquals("Job start failed", e.getMessage());
    }
    verify(mockRuntime).getJobOperator();
    verify(mockedJobOperator).start("EventFilesProcessorJob", null);
  }
}