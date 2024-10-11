/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventItemWriter_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOpenWithNullCheckpoint_mJny1() throws Exception {
    EventItemWriter writer = new EventItemWriter();
    Serializable checkpoint = null;
    writer.open(checkpoint);
    File archiveDirectory = new File("path/to/archive/directory");
    assertTrue(archiveDirectory.exists());
  }
}