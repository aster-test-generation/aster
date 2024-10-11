/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import jakarta.batch.runtime.context.JobContext;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventItemReader_Test_Failing {
  private EventItemReader eventItemReader;
  private JobContext jobContext;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCheckpointInfo_kpSi0() throws Exception {
    EventItemReader eventItemReader = new EventItemReader();
    Serializable checkpoint = eventItemReader.checkpointInfo();
    assertNotNull(checkpoint);
  }
}