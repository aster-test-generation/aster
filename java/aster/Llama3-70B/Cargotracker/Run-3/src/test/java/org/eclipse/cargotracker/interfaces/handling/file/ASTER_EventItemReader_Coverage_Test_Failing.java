/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventItemReader_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOpen_CurrentFileIsNotNull_yIFV12_zDGp0() throws Exception {
    EventItemReader eventItemReader = new EventItemReader();
    EventFilesCheckpoint checkpoint = new EventFilesCheckpoint();
    File file = new File("testFile");
    checkpoint.setFiles(Arrays.asList(file));
    eventItemReader.open(checkpoint);
  }
}