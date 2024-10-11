/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FileProcessorJobListener_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBeforeJob_UzaM0() throws Exception {
    FileProcessorJobListener fileProcessorJobListener = new FileProcessorJobListener();
    fileProcessorJobListener.beforeJob();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAfterJob_YRxr0() throws java.lang.Exception {
    FileProcessorJobListener fileProcessorJobListener = new FileProcessorJobListener();
    fileProcessorJobListener.afterJob();
  }
}