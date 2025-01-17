/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FileProcessorJobListener_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAfterJobNullLogger_pgPh2_nIfp0() throws Exception {
    FileProcessorJobListener fileProcessorJobListener = new FileProcessorJobListener();
    Logger logger = null;
    try {
      fileProcessorJobListener.beforeJob();
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      assertNull(e.getMessage());
    }
  }
}