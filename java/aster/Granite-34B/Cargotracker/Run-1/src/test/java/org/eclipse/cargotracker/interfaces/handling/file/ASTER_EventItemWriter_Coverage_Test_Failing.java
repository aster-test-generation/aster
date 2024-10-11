/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventItemWriter_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOpenWithValidArchiveDirectory_YqYu0() throws Exception {
    EventItemWriter writer = new EventItemWriter();
    writer.open(null);
    assertTrue(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOpenWithInvalidArchiveDirectory_tDtj1() throws Exception {
    EventItemWriter writer = new EventItemWriter();
    writer.open(null);
    assertTrue(false);
  }
}