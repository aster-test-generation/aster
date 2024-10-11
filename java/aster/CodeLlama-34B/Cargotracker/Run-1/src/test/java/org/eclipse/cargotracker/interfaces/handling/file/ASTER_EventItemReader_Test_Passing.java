/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventItemReader_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCheckpointInfoWithNullCheckpoint_oOvM1_ezDb0() throws Exception {
    EventItemReader reader = new EventItemReader();
    Serializable checkpoint = reader.checkpointInfo();
    assertNull(checkpoint);
  }
}