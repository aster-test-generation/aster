/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventItemReader_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOpenWithNullCheckpoint_roMh0() throws Exception {
    EventItemReader reader = new EventItemReader();
    reader.open(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOpenWithNonNullCheckpoint_jkCr1() throws Exception {
    EventItemReader reader = new EventItemReader();
    EventFilesCheckpoint checkpoint = new EventFilesCheckpoint();
    reader.open(checkpoint);
  }
}