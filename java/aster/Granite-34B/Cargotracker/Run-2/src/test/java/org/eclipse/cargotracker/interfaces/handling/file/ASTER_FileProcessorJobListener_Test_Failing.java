/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FileProcessorJobListener_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAfterJob_GtEa0() throws Exception {
    FileProcessorJobListener fileProcessorJobListener = new FileProcessorJobListener();
    fileProcessorJobListener.afterJob();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBeforeJob_gvHF0() throws Exception {
    FileProcessorJobListener fileProcessorJobListener = new FileProcessorJobListener();
    fileProcessorJobListener.beforeJob();
  }
}