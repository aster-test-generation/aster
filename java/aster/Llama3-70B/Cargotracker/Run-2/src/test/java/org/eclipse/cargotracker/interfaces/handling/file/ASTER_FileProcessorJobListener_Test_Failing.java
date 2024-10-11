/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FileProcessorJobListener_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBeforeJob_pThj0() {
    FileProcessorJobListener fileProcessorJobListener = new FileProcessorJobListener();
    try {
      fileProcessorJobListener.beforeJob();
    } catch (Exception e) {
      fail("Exception should not be thrown");
    }
  }
}